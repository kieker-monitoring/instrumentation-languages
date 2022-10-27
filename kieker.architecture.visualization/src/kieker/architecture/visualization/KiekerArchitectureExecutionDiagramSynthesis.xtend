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
import kieker.architecture.visualization.utils.DebugUtils

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
	
	Map<Object, NodePort> object2NodePortMap
		
	val String ODD_BACKGROUND_COLOR = "LemonChiffon"
		
	val String EVEN_BACKGROUND_COLOR = "#fffff0"
	
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
			
			object2NodePortMap = new HashMap
			
			components = new DisplayModelBuilder().create(assemblyModel.components.values, executionModel)

			DebugUtils.print(components, "model")

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
				it.children += component.createComponent(ODD_BACKGROUND_COLOR)
			]
			components.forEach[it.createLinks(executionModel)]
		]
	}
	
	private def void createLinks(Component component, ExecutionModel executionModel) {
		val invocations = executionModel.invocations.values
		val operationDataflows = executionModel.operationDataflows.values
		val storageDataflows = executionModel.storageDataflows.values
			
		// component.createLinkCallOperation2RequiredPort(invocations)
		component.createLinkDataflowOperation2RequiredPort(operationDataflows)
		component.createLinkDataflowStorage2RequiredPort(storageDataflows)
		component.createLinkRequiredPort2RequiredPort()
		
		component.createLinkCallProvidedPort2Operation(invocations)
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
				val caller = object2NodePortMap.get(controlFlow.caller.assemblyOperation)
				val callee = object2NodePortMap.get(requiredPort)
				if (caller === null) {
					System.err.printf("ERROR: caller not found for %s\n", 
						controlFlow.caller.assemblyOperation.operationType.signature
					)				
				}
				if (callee === null) {
					System.err.printf("ERROR: callee not found for %s\n", requiredPort.label)
				}
				if (caller !== null && callee !== null)
					createConnectionEdge(caller, callee, CALL_FG_COLOR)
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
			if (requiredPort !== null) {
				val caller = object2NodePortMap.get(dataflow.caller.assemblyOperation)
				val callee = object2NodePortMap.get(requiredPort)
				createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
			}
		]
		
		/** Dataflow from callee to caller. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.caller.component.assemblyComponent === assemblyComponent && // callee must belong to this component
			it.callee.component.assemblyComponent !== assemblyComponent // caller must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val caller = object2NodePortMap.get(dataflow.callee.assemblyOperation)
				val callee = object2NodePortMap.get(requiredPort)
				createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
			}
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
			if (requiredPort !== null) {
				val caller = object2NodePortMap.get(dataflow.code.assemblyOperation)
				val callee = object2NodePortMap.get(requiredPort)
								
				createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
			}
		]
		
		/** Dataflow from storage to operation. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.storage.component.assemblyComponent === assemblyComponent && // callee must belong to this component
			it.code.component.assemblyComponent !== assemblyComponent // caller must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val caller = object2NodePortMap.get(dataflow.storage.assemblyStorage)
				val callee = object2NodePortMap.get(requiredPort)
								
				createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
			}
		]
	}
	
	def createLinkRequiredPort2RequiredPort(Component component) {
		component.requiredPorts.values.filter[
			it.derivedFromPorts.size() > 0
		].forEach[
			it.derivedFromPorts.forEach[derivedPort |
				val caller = object2NodePortMap.get(derivedPort)
				val callee = object2NodePortMap.get(it)
								
				createConnectionEdge(caller, callee, it.portType.getForegroundColorForPortType())
			]
		]
	}

	def createLinkCallProvidedPort2Operation(Component component, Collection<Invocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		component.providedPorts.values().forEach[port|
			System.err.printf("  port: %s\n", port.label)
			port.derivedFrom.forEach[derivedFrom |
				switch(derivedFrom) {
					AssemblyOperation: {
						val source = object2NodePortMap.get(port)
						val target = object2NodePortMap.get(derivedFrom)
						createConnectionEdge(source, target, CALL_FG_COLOR)
					}
					AssemblyProvidedInterface: {
						val source = object2NodePortMap.get(port)
						derivedFrom.providedInterfaceType.providedOperationTypes.values.forEach[operationType|
							val assemblyOperation = assemblyComponent.operations.values.findFirst[it.operationType == operationType]
							val target = object2NodePortMap.get(assemblyOperation)
							if (target !== null) 
								createConnectionEdge(source, target, CALL_FG_COLOR)
						]
					}
					default:
						System.err.printf("  MISSING: %s\n", derivedFrom.class.simpleName)
				}
			]
		]
	}
	
	private def String fqn(Object object) {
		switch(object) {
			Invocation: DebugUtils.fqn(object.caller) + " -> " + DebugUtils.fqn(object.callee)
			AssemblyOperation: DebugUtils.fqn(object)
			default: object.class.simpleName + "::" + object.toString
		}
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
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
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
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
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
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
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
				if (!rememberRead.existLink(caller, callee))
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
				rememberRead.put(caller, callee)
			}
		]
	}
	
	def createLinkProvidedPort2ProvidedPort(Component component) {
		component.providedPorts.values.filter[
			it.derivedFromPort !== null
		].forEach[
		 	val caller = object2NodePortMap.get(it)
			val callee = object2NodePortMap.get(it.derivedFromPort)
								
			createConnectionEdge(caller, callee, it.portType.getForegroundColorForPortType())
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
			val source = object2NodePortMap.get(it.callee.assemblyOperation)
			val target = object2NodePortMap.get(it.caller.assemblyOperation)
			createConnectionEdge(source, target, CALL_FG_COLOR)
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
				val source = object2NodePortMap.get(it.callee.assemblyOperation)
				val target = object2NodePortMap.get(it.caller.assemblyOperation)
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
			if (it.direction.isWrite) {
				val source = object2NodePortMap.get(it.caller.assemblyOperation)
				val target = object2NodePortMap.get(it.callee.assemblyOperation)
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
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
			val code = object2NodePortMap.get(it.code.assemblyOperation)
			val storage = object2NodePortMap.get(it.storage.assemblyStorage)
			createConnectionEdge(code, storage, DATAFLOW_FG_COLOR)
		]
	}
		
	def createLinkDataflowStorage2Operation(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.direction.isRead &&
			it.storage.assemblyStorage.component === assemblyComponent &&
			it.storage.assemblyStorage.component === it.code.assemblyOperation.component
		].forEach[
			val storage = object2NodePortMap.get(it.storage.assemblyStorage)
			val code = object2NodePortMap.get(it.code.assemblyOperation)
			createConnectionEdge(storage, code, DATAFLOW_FG_COLOR)
		]
	}
	
	/** -----------------------------------------
	 * create links between ports on components on the same level
	 * ------------------------------------------ */
		
	def createLinkInterComponentCallOperation(Component component, Collection<Invocation> incovations) {
		component.providedPorts.values().forEach[providedPort |
			providedPort.requiringPorts.forEach[requiredPort |
				if (requiredPort.portType.isCall && providedPort.portType.isCall) {
					val caller = object2NodePortMap.get(requiredPort)
					val callee = object2NodePortMap.get(providedPort)
					createConnectionEdge(caller, callee, CALL_FG_COLOR)
				}
			]
		]	
	}
	
	def createLinkInterComponentDataflowOperation(Component component, Collection<OperationDataflow> dataflows) {
		component.providedPorts.values().forEach[providedPort |
			providedPort.requiringPorts.forEach[requiredPort |
				if (requiredPort.portType.isDataflow && providedPort.portType.isDataflow) {
					val caller = object2NodePortMap.get(requiredPort)
					val callee = object2NodePortMap.get(providedPort)
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
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
		
		// System.err.printf("Storage write flows: %s %d of %d\n", assemblyComponent.signature, writeFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort | 
			val dataflow = writeFlows.findFirst[providedPort.origin.contains(it.storage.assemblyStorage)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					val caller = object2NodePortMap.get(requiredPort)
					val callee = object2NodePortMap.get(providedPort)
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
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
				if (requiredPort !== null) {
					val caller = object2NodePortMap.get(requiredPort)
					val callee = object2NodePortMap.get(providedPort)
					createConnectionEdge(caller, callee, DATAFLOW_FG_COLOR)
				}
			}
		]		
	}
	
			
	def createLinkInterComponentDerived(Component component) {
		component.requiredPorts.values().filter[
			it.providedPort.component.parent === component.parent &&
			it.providedPort instanceof ProvidedPort
		].forEach[
			val caller = object2NodePortMap.get(it)
			val callee = object2NodePortMap.get(it.providedPort)
			createConnectionEdge(caller, callee, it.portType.getForegroundColorForPortType())
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
		
	private def createComponent(Component component, String background) {
		return component.createNode().associateWith(component) => [componentNode |
			componentNode.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			componentNode.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			componentNode.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
			componentNode.setProperty(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			
			componentNode.addRectangle => [
				it.lineWidth = 4
				it.background = background.color
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

				if ((SHOW_OPERATIONS.booleanValue && (!component.derivedFrom.get(0).operations.isEmpty || !component.derivedFrom.get(0).storages.isEmpty)) ||
					(component.children.size > 0)) {
					it.addHorizontalSeperatorLine(1, 0)
					it.addChildArea
				}
			]
			
			componentNode.createProvidedPorts(component)
			componentNode.createRequiredPorts(component)
			
			if (component.children.size > 0) {
				componentNode.createSubComponents(component, if (background.equals(ODD_BACKGROUND_COLOR)) EVEN_BACKGROUND_COLOR else ODD_BACKGROUND_COLOR)
			}
						
			if (SHOW_OPERATIONS.booleanValue && (!component.derivedFrom.get(0).operations.isEmpty || !component.derivedFrom.get(0).storages.isEmpty)) {
				componentNode.createOperations(component)
				componentNode.createStorages(component)
			}
		]
	}
		
	private def void createSubComponents(KNode node, Component component, String background) {
		component.children.forEach [
			val componentNode = it.createComponent(background)
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
			// Thus we need only to get the first element to deciede which routine should be used.
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
		
	private def void createOperations(KNode node, Component component) {
		component.derivedFrom.get(0).operations.values.forEach[
			val operationNode = createOperation(it, it.operationType.signature)

			object2NodePortMap.put(it, new NodePort(operationNode, null))
			node.children += operationNode
		]
	}
	
	private def void createStorages(KNode node, Component component) {
		component.derivedFrom.get(0).storages.values.forEach[
			val storageNode = createStorage(it.storageType.name)

			object2NodePortMap.put(it, new NodePort(storageNode, null))			
			node.children += storageNode
		]
	}
}
