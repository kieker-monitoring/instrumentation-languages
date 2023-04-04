/***************************************************************************
 * Copyright 2022 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.architecture.visualization

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import java.util.Collection
import java.util.HashMap
import java.util.Map
import java.util.Set
import javax.inject.Inject
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.ProvidedPort
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.model.analysismodel.assembly.AssemblyComponent
import kieker.model.analysismodel.assembly.AssemblyModel
import kieker.model.analysismodel.assembly.AssemblyOperation
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import kieker.model.analysismodel.assembly.AssemblyStorage
import kieker.model.analysismodel.execution.Invocation
import kieker.model.analysismodel.execution.EDirection
import kieker.model.analysismodel.execution.ExecutionModel
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.model.analysismodel.execution.StorageDataflow
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import kieker.architecture.visualization.display.DisplayModelBuilder

import static extension kieker.architecture.visualization.utils.ModelUtils.*
import kieker.model.analysismodel.statistics.StatisticsModel
import kieker.model.analysismodel.source.SourceModel
import java.util.HashSet

/**
 * @author Reiner Jung
 * @since 1.3.0
 */
class KiekerArchitectureExecutionDiagramSynthesis extends AbstractKiekerArchitectureDiagramSynthesis<ExecutionModel> {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KColorExtensions
	
	var Set<Component> components
	
	override transform(ExecutionModel executionModel) {
		val deployedOperation =
			if (!executionModel.invocations.empty) {
				executionModel.invocations.get(0).value.caller
			} else if (!executionModel.operationDataflows.empty) {
				executionModel.operationDataflows.get(0).value.caller
			} else
				null
		if (deployedOperation !== null) {
			val assemblyOperation = deployedOperation.assemblyOperation
			val assemblyComponent = assemblyOperation.component
			val assemblyModel = assemblyComponent.eContainer.eContainer as AssemblyModel
			
			this.statisticsModel = loadModel("statistics-model.xmi", executionModel) as StatisticsModel
			this.sourceModel = loadModel("source-model.xmi", executionModel) as SourceModel
				
			loadColorModel(executionModel)
				
			object2NodePortMap = new HashMap
			
			components = new DisplayModelBuilder().create(assemblyModel.components.values, executionModel)

			return createDisplay(components, executionModel)
		} else {
			return null
		}
	}
			
	private def isWrite(EDirection direction) {
		#[EDirection.WRITE, EDirection.BOTH].contains(direction)
	}

	private def isRead(EDirection direction) {
		#[EDirection.READ, EDirection.BOTH].contains(direction)
	}
	
	private def KNode createDisplay(Set<Component> components, ExecutionModel executionModel) { 
		return createNode() => [
			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
		
			components.forEach[component |
				it.children += component.createComponent(true)
			]
			components.forEach[it.createLinks(executionModel)]
		]
	}
	
	private def void createLinks(Component component, ExecutionModel executionModel) {
		val invocations = executionModel.invocations.values
		val operationDataflows = executionModel.operationDataflows.values
		val storageDataflows = executionModel.storageDataflows.values
			
		component.createLinkCallOperation2RequiredPort(invocations)
		component.createLinkDataflowOperation2RequiredPort(operationDataflows)
		component.createLinkDataflowStorage2RequiredPort(storageDataflows)
		component.createLinkRequiredPort2RequiredPort()
		
		component.createLinkCallProvidedPort2Operation()
		component.createLinkDataflowProvidedPort2Operation(operationDataflows)
		component.createLinkDataflowProvidedPort2Storage(storageDataflows)
		component.createLinkProvidedPort2ProvidedPort()
		
		component.createLinkCallOperation2Operation(invocations)
		component.createLinkDataflowOperation2Operation(operationDataflows)
		component.createLinkDataflowOperation2Storage(storageDataflows)
		component.createLinkDataflowStorage2Operation(storageDataflows)
		
		component.createLinkInterComponentCallOperation(invocations)
		component.createLinkInterComponentDataflowOperation(operationDataflows)
		component.createLinkInterComponentDerived()

		component.children.forEach[it.createLinks(executionModel)]
	}
				
	/** -------------------------------
	 * Links of elements to ports.
	 * -------------------------------- */
	 
	def createLinkCallOperation2RequiredPort(Component component, Collection<Invocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		val controlFlows = invocations.filter[
			it.caller.component.assemblyComponent === assemblyComponent && // caller must belong to this component
			it.callee.component.assemblyComponent !== assemblyComponent // callee must be outside, otherwise there is no required port
		]
		component.requiredPorts.values().forEach[requiredPort |
			val controlFlow = controlFlows.findFirst[requiredPort.derivedFrom.contains(it)]
			if (controlFlow !== null) {
				createConnection(controlFlow.caller.assemblyOperation, requiredPort, CALL_FG_COLOR, createControlFlowLabel(statisticsModel, controlFlow))
			} else if (requiredPort.derivedFrom.exists[it instanceof AssemblyRequiredInterface]) {
				// TODO implementation only addresses operation callers to required interface, nested components are
				// ignored as well as their requiring interfaces
				controlFlows.filter[call |
					val providedPort = requiredPort.providedPort
					val derivedList = providedPort.derivedFrom
					if (derivedList !== null) {
						val derivedElement = derivedList.get(0)
						call.callee.component.assemblyComponent.providedInterfaces.values().exists[derivedElement === it]
					} else
						false
				].forEach[
					createConnection(it.caller.assemblyOperation, requiredPort, CALL_FG_COLOR, createControlFlowLabel(statisticsModel, it))
				]
			}
		]
	}
	
	def createLinkDataflowOperation2RequiredPort(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		/** Dataflow from caller to callee. */
		dataflows.filter[it.direction.isWrite].
		filter[
			it.caller.component.assemblyComponent === assemblyComponent && // caller must belong to this component
			it.callee.component.assemblyComponent !== assemblyComponent // callee must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			createConnection(dataflow.caller.assemblyOperation, requiredPort, DATAFLOW_FG_COLOR, createOperationDataFlowLabel(statisticsModel, dataflow))
		]
		
		/** Dataflow from callee to caller. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.caller.component.assemblyComponent === assemblyComponent && // callee must belong to this component
			it.callee.component.assemblyComponent !== assemblyComponent // caller must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			createConnection(dataflow.callee.assemblyOperation, requiredPort, DATAFLOW_FG_COLOR, createOperationDataFlowLabel(statisticsModel, dataflow))
		]
	}
	
	def createLinkDataflowStorage2RequiredPort(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		/** Dataflow from operation to storage. */
		dataflows.filter[it.direction.isWrite].
		filter[
			it.code.component.assemblyComponent === assemblyComponent && // caller must belong to this component
			it.storage.component.assemblyComponent !== assemblyComponent // callee must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			createConnection(dataflow.code.assemblyOperation, requiredPort, DATAFLOW_FG_COLOR)
		]
		
		/** Dataflow from storage to operation. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.storage.component.assemblyComponent === assemblyComponent && // callee must belong to this component
			it.code.component.assemblyComponent !== assemblyComponent // caller must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			createConnection(dataflow.storage.assemblyStorage, requiredPort, DATAFLOW_FG_COLOR)
		]
	}
	
	def createLinkRequiredPort2RequiredPort(Component component) {
		component.requiredPorts.values.filter[
			it.derivedFromPorts.size() > 0
		].forEach[
			it.derivedFromPorts.forEach[derivedPort |
				createConnection(derivedPort, it, it.portType.getForegroundColorForPortType())
			]
		]
	}

	def createLinkCallProvidedPort2Operation(Component component) {
		val assemblyComponent = component.derivedFrom.get(0)
		component.providedPorts.values().forEach[port|
			port.derivedFrom.forEach[derivedFrom |
				switch(derivedFrom) {
					AssemblyOperation: createConnection(port, derivedFrom, CALL_FG_COLOR)
					AssemblyProvidedInterface: {
						derivedFrom.providedInterfaceType.providedOperationTypes.values.forEach[operationType|
							val assemblyOperation = assemblyComponent.operations.values.findFirst[it.operationType == operationType]
							createConnection(port, assemblyOperation, CALL_FG_COLOR)
						]
					}
					default:
						System.err.printf("  MISSING: %s\n", derivedFrom.class.simpleName)
				}
			]
		]
	}
	
	def createLinkDataflowProvidedPort2Operation(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val rememberWrite = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isWrite].
		filter[
			it.caller.component.assemblyComponent !== assemblyComponent && // caller must belong to another component
			it.callee.component.assemblyComponent === assemblyComponent // callee must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.callee.assemblyOperation)
			]
			if (providedPort !== null) {
				val caller = object2NodePortMap.get(providedPort)
				val callee = object2NodePortMap.get(dataflow.callee.assemblyOperation)
				if (!rememberWrite.existLink(caller, callee))
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR).addLabel(createOperationDataFlowLabel(statisticsModel, dataflow))
				rememberWrite.put(caller, callee)
			}
		]
		
		val rememberRead = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isRead].
		filter[
			it.callee.component.assemblyComponent !== assemblyComponent && // caller must belong to another component
			it.caller.component.assemblyComponent === assemblyComponent // callee must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.caller.assemblyOperation)
			]
			if (providedPort !== null) {
				val caller = object2NodePortMap.get(providedPort)
				val callee = object2NodePortMap.get(dataflow.caller.assemblyOperation)
				if (!rememberRead.existLink(caller, callee))
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR).addLabel(createOperationDataFlowLabel(statisticsModel, dataflow))
				rememberRead.put(caller, callee)
			}
		]
	}
	
	def createLinkDataflowProvidedPort2Storage(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val rememberWrite = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isWrite].
		filter[
			it.code.component.assemblyComponent !== assemblyComponent && // caller must belong to another component
			it.storage.component.assemblyComponent === assemblyComponent // callee must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.storage.assemblyStorage)
			]
			if (providedPort !== null) {
				val caller = object2NodePortMap.get(providedPort)
				val callee = object2NodePortMap.get(dataflow.storage.assemblyStorage)
				if (!rememberWrite.existLink(caller, callee))
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR).addLabel(createStorageDataFlowLabel(statisticsModel, dataflow))
				rememberWrite.put(caller, callee)
			}
		]
		
		val rememberRead = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isRead].
		filter[
			it.storage.component.assemblyComponent !== assemblyComponent && // caller must belong to another component
			it.code.component.assemblyComponent === assemblyComponent // callee must be inside, otherwise there is no required port			
		].
		forEach[dataflow |			
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.code.assemblyOperation)
			]
			if (providedPort !== null) {
				val caller = object2NodePortMap.get(providedPort)
				val callee = object2NodePortMap.get(dataflow.code.assemblyOperation)
				if (!rememberRead.existLink(caller, callee)) {
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR).addLabel(createStorageDataFlowLabel(statisticsModel, dataflow))
				}
				rememberRead.put(caller, callee)
			}
		]
	}
	
	def createLinkProvidedPort2ProvidedPort(Component component) {
		component.providedPorts.values.filter[
			it.derivedFromPort !== null
		].forEach[
			createConnection(it, it.derivedFromPort, it.portType.getForegroundColorForPortType())
		]
	}
	
	private def existLink(Map<NodePort,NodePort> remember, NodePort caller, NodePort callee) {
		val value = remember.get(caller)
		if (value === null)
			return false
		else 
			return value === callee
	}

	
	/** -------------------------------
	 * Links between elements.
	 * -------------------------------- */
	 
	def createLinkCallOperation2Operation(Component component, Collection<Invocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		invocations.filter[
			it.caller.assemblyOperation.component === assemblyComponent &&
			it.callee.assemblyOperation.component === assemblyComponent
		].
		forEach[
			createConnection(it.callee.assemblyOperation, it.caller.assemblyOperation, CALL_FG_COLOR, createControlFlowLabel(statisticsModel, it))
		]
	}
		
	def createLinkDataflowOperation2Operation(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.caller.assemblyOperation.component === assemblyComponent &&
			it.callee.assemblyOperation.component === assemblyComponent
		].
		forEach[
			if (it.direction.isRead) {
				createConnection(it.callee.assemblyOperation, it.caller.assemblyOperation, DATAFLOW_FG_COLOR, createOperationDataFlowLabel(statisticsModel, it))
			}
			if (it.direction.isWrite) {
				createConnection(it.caller.assemblyOperation, it.callee.assemblyOperation, DATAFLOW_FG_COLOR, createOperationDataFlowLabel(statisticsModel, it))
			}
		]
	}
		
	def createLinkDataflowOperation2Storage(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.direction.isWrite &&
			it.storage.assemblyStorage.component === assemblyComponent &&
			it.storage.assemblyStorage.component === it.code.assemblyOperation.component
		].forEach[
			createConnection(it.code.assemblyOperation, it.storage.assemblyStorage, DATAFLOW_FG_COLOR, createStorageDataFlowLabel(statisticsModel, it))
		]
	}
		
	def createLinkDataflowStorage2Operation(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.direction.isRead &&
			it.storage.assemblyStorage.component === assemblyComponent &&
			it.storage.assemblyStorage.component === it.code.assemblyOperation.component
		].forEach[
			createConnection(it.storage.assemblyStorage, it.code.assemblyOperation, DATAFLOW_FG_COLOR, createStorageDataFlowLabel(statisticsModel, it))
		]
	}
	
	/** -----------------------------------------
	 * create links between ports on components on the same level
	 * ------------------------------------------ */
		
	def createLinkInterComponentCallOperation(Component component, Collection<Invocation> incovations) {
		component.providedPorts.values().forEach[providedPort |
			providedPort.requiringPorts.forEach[requiredPort |
				if (requiredPort.portType.isCall && providedPort.portType.isCall) {
					createConnection(requiredPort, providedPort, CALL_FG_COLOR)
				}
			]
		]	
	}
	
	def createLinkInterComponentDataflowOperation(Component component, Collection<OperationDataflow> dataflows) {
		component.providedPorts.values().forEach[providedPort |
			providedPort.requiringPorts.forEach[requiredPort |
				if (requiredPort.portType.isDataflow && providedPort.portType.isDataflow) {
					createConnection(requiredPort, providedPort, DATAFLOW_FG_COLOR)
				}
			]
		]		
	}	
	
	def createLinkInterComponentDataflowStorage(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val writeFlows = dataflows.filter[it.direction.isWrite].
		filter[
			it.code.assemblyOperation.component !== assemblyComponent &&
			it.storage.assemblyStorage.component === assemblyComponent &&
			checkJointParent(component, it.storage.assemblyStorage.component)
		]
				
		component.providedPorts.values().forEach[providedPort | 
			val dataflow = writeFlows.findFirst[providedPort.origin.contains(it.storage.assemblyStorage)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					createConnection(requiredPort, providedPort, DATAFLOW_FG_COLOR)
				}
			}
		]
		
		val readFlows = dataflows.filter[it.direction.isRead].
		filter[
			it.code.assemblyOperation.component === assemblyComponent &&
			it.storage.assemblyStorage.component !== assemblyComponent &&
			checkJointParent(component, it.code.assemblyOperation.component)
		]
		
		// System.err.printf("Storage read flows: %s %d of %d\n", assemblyComponent.signature, readFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort |
			val dataflow = readFlows.findFirst[providedPort.origin.contains(it.code.assemblyOperation)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				createConnection(requiredPort, providedPort, DATAFLOW_FG_COLOR)
			}
		]		
	}
			
	def createLinkInterComponentDerived(Component component) {
		component.requiredPorts.values().filter[
			it.providedPort.component.parent === component.parent &&
			it.providedPort instanceof ProvidedPort
		].forEach[
			createConnection(it, it.providedPort, it.portType.getForegroundColorForPortType())
		]
	}
	
	
	/** ---------------------------------
	 * utilities
	 * ---------------------------------- */
	 	
	private def Collection<Object> origin(ProvidedPort providedPort) {
		if (providedPort.derivedFromPort !== null)
			providedPort.derivedFromPort.origin
		else if (providedPort.derivedFrom.size() > 0)
			if (providedPort.derivedFrom.get(0) instanceof ProvidedPort)
				(providedPort.derivedFrom.get(0) as ProvidedPort).origin
			else
				providedPort.derivedFrom
		else
			null
	}

	private def Collection<Object> origin(RequiredPort requiredPort) {
		val origins = new ArrayList<Object>()
		origin(origins, requiredPort)
		return origins
	}
	
	private def void origin(Collection<Object> derivedFrom, RequiredPort requiredPort) {
		requiredPort.derivedFromPorts.forEach[origin(derivedFrom, it)]
		requiredPort.derivedFrom.forEach[derivedFrom.add(it)]
	}
		
	private def checkJointParent(Component component, AssemblyComponent assemblyComponent) {
		if (component.parent !== null)
			component.parent.children.exists[child | child.derivedFrom.contains(assemblyComponent)]
		else
			components.exists[it.derivedFrom.contains(assemblyComponent)]
	}
	
	/** ---------------------------------------- */
		
	private def createComponent(Component component, boolean odd) {
		return component.createNode().associateWith(component) => [componentNode |
			componentNode.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			componentNode.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			componentNode.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
			componentNode.setProperty(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			componentNode.addRectangle => [
				it.lineWidth = 4
				it.background = lookupComponentColor(component.derivedFrom.get(0) as AssemblyComponent, odd).color
				it.shadow = "black".color
				it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)

				it.addText("<<Component>>") => [
					it.fontSize = 13
					it.fontItalic = true
					it.verticalAlignment = V_CENTRAL
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 10, 0).to(RIGHT, 20, 0, BOTTOM, 1, 0.5f)
				]
				it.addText(component.label).associateWith(component) => [
					it.fontSize = 15
					it.fontBold = true
					it.cursorSelectable = false
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
				]

				if (!component.derivedFrom.get(0).operations.isEmpty || !component.derivedFrom.get(0).storages.isEmpty ||
					component.children.size > 0) {
					it.addHorizontalSeperatorLine(1, 0)
					it.addChildArea
				}
			]
			
			componentNode.createProvidedPorts(component)
			componentNode.createRequiredPorts(component)
			
			if (component.children.size > 0) {
				componentNode.createSubComponents(component, !odd)
			}
						
			if (!component.derivedFrom.get(0).operations.isEmpty || !component.derivedFrom.get(0).storages.isEmpty) {
				componentNode.createOperations(component, odd)
				componentNode.createStorages(component, odd)
			}
		]
	}
		
	private def void createSubComponents(KNode node, Component component, boolean odd) {
		component.children.forEach [
			val componentNode = it.createComponent(odd)
			node.children += componentNode
		]
	}
	
	private def void createProvidedPorts(KNode node, Component component) {
		component.providedPorts.values().forEach[providedPort |
			// Note: ports might be derived from different elements, but they are created only once.
			// Thus we need only to get the first element to decide which routine should be used.
			if (providedPort.derivedFromPort !== null) {
				val port = addLabel(createInterfaceProvidedPort(PortSide.SOUTH, 
					providedPort.origin.get(0) as EObject, node.ports.size, providedPort.portType
				), providedPort.label)
			
				object2NodePortMap.put(providedPort, new NodePort(node, port))
				node.ports += port
			} else if (providedPort.derivedFrom.size() > 0) {
				val derivedFrom = providedPort.derivedFrom.get(0)
				val createPort = switch(derivedFrom) {
					AssemblyProvidedInterface: createInterfaceProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType)
					AssemblyOperation: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#ff0000")
					AssemblyStorage: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#00ff00")
					OperationDataflow: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#0000ff")
					default: {
						System.err.println("default provided port " + derivedFrom.class)
						createInterfacePort(PortSide.SOUTH, null, node.ports.size, "#00ff00", "#a0ffa0")
					}
				}
				val port = addLabel(createPort, providedPort.label)
			
				object2NodePortMap.put(providedPort, new NodePort(node, port))
				node.ports += port
			}
		]
	}
	
	private def void createRequiredPorts(KNode node, Component component) {
		component.requiredPorts.values().forEach[requiredPort |
			// Note: ports might be derived from different elements, but they are created only once.
			// Thus we need only to get the first element to decide which routine should be used.
			if (requiredPort.derivedFromPorts.size() > 0) {
				val port = addLabel(createInterfaceRequiredPort(PortSide.NORTH, 
					requiredPort.origin.get(0) as EObject, node.ports.size, requiredPort.portType
				)  // port derived from an inner port
				, requiredPort.label)
	
				object2NodePortMap.put(requiredPort, new NodePort(node, port))
				node.ports += port
			} else {
				val derivedFrom = requiredPort.derivedFrom.get(0)
				val createdPort = switch(derivedFrom) {
					AssemblyRequiredInterface: createInterfaceRequiredPort(PortSide.NORTH, derivedFrom, node.ports.size, requiredPort.portType)
					Invocation: createOperationRequiredPort(PortSide.NORTH, derivedFrom.caller.assemblyOperation, node.ports.size, requiredPort.portType)
					StorageDataflow: createOperationRequiredPort(PortSide.NORTH, derivedFrom, node.ports.size, requiredPort.portType)
					// TODO derivedFrom.caller is insufficient, it should depend on the direction of flow that is actually used here
					OperationDataflow: createOperationRequiredPort(PortSide.NORTH, derivedFrom.caller.assemblyOperation, node.ports.size, requiredPort.portType)
					default: {
						System.err.println("default required port " + derivedFrom.class)
						createInterfacePort(PortSide.NORTH, null, node.ports.size, "#00ff00", "#ffffff")
					}
				}
	
				val port = addLabel(createdPort, requiredPort.label)
	
				object2NodePortMap.put(requiredPort, new NodePort(node, port))
				node.ports += port
			}
		]
	}
		
	private def void createOperations(KNode node, Component component, boolean odd) {
		component.derivedFrom.get(0).operations.values.forEach[
			val operationNode = createOperation(it, it.operationType.signature, lookupOperationColor(it, odd))

			object2NodePortMap.put(it, new NodePort(operationNode, null))
			node.children += operationNode
		]
	}
	
	private def void createStorages(KNode node, Component component, boolean odd) {
		component.derivedFrom.get(0).storages.values.forEach[
			val storageNode = createStorage(it.storageType.name, lookupStorageColor(it, odd))

			object2NodePortMap.put(it, new NodePort(storageNode, null))			
			node.children += storageNode
		]
	}
}
