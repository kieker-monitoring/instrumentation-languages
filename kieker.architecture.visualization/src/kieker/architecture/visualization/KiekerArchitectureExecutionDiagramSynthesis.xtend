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

import kieker.model.analysismodel.assembly.AssemblyModel
import kieker.model.analysismodel.assembly.AssemblyOperation
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import kieker.model.analysismodel.execution.AggregatedInvocation
import kieker.model.analysismodel.execution.ExecutionModel
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
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortSide
import kieker.model.analysismodel.execution.StorageDataflow
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.architecture.visualization.display.model.ProvidedPort
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.architecture.visualization.display.model.EPortType
import kieker.model.analysismodel.assembly.AssemblyStorage
import kieker.model.analysismodel.deployment.DeployedOperation
import kieker.model.analysismodel.deployment.DeployedStorage
import org.eclipse.emf.ecore.EObject
import kieker.architecture.visualization.display.model.Port
import kieker.model.analysismodel.execution.EDirection
import org.eclipse.elk.core.options.PortConstraints
import kieker.model.analysismodel.assembly.AssemblyComponent

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
			if (!executionModel.aggregatedInvocations.empty) {
				executionModel.aggregatedInvocations.get(0).value.source
			} else if (!executionModel.operationDataflow.empty) {
				executionModel.operationDataflow.get(0).value.source
			} else
				null
		if (deployedOperation !== null) {
			val assemblyOperation = deployedOperation.assemblyOperation
			val assemblyComponent = assemblyOperation.component
			val assemblyModel = assemblyComponent.eContainer.eContainer as AssemblyModel
			
			object2NodePortMap = new HashMap
			
			components = new DisplayModelBuilder().create(assemblyModel.components.values, executionModel)
			
			System.err.println("------------------")
			components.forEach[it.printComponent("")]
			System.err.println("------------------")
			
			return createDisplay(components, executionModel)
		} else {
			return null
		}
	}
	
	private def void printComponent(Component component, String prefix) {
		System.err.printf("%sComponent %s {\n", prefix, component.label)
		component.providedPorts.values.forEach[providedPort |
			System.err.printf("%s  provided %s <- %s\n", prefix, providedPort.label, 
				providedPort.requiringPorts.map["required by " + it.label + " of " + it.requiredSourceLabel].join(", ")
			)
		]
		component.requiredPorts.values.forEach[
			System.err.printf("%s  required %s -> %s\n", prefix, it.label, it.requiredSourceLabel)
		]
		component.children.forEach[it.printComponent(prefix + "    ")]
		System.err.printf("%s}\n",prefix)
	}
	
		
	private def isWrite(EDirection direction) {
		#[EDirection.WRITE, EDirection.BOTH].contains(direction)
	}

	private def isRead(EDirection direction) {
		#[EDirection.READ, EDirection.BOTH].contains(direction)
	}
	
	private def String requiredSourceLabel(RequiredPort port) {
		val componentLabel = port.component.label
		val derivedFrom = port.derivedFrom
		derivedFrom.map[derived |
			val label = port.label
			componentLabel + ":" + switch(derived) {
				OperationDataflow: {
					val value = derived.source.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.target.assemblyOperation.operationType.signature
					else
						value
				}
				StorageDataflow:  {
					val value = derived.storage.assemblyStorage.storageType.name
					if (value.equals(label))
						derived.code.assemblyOperation.operationType.signature
					else
						value
				}
				AggregatedInvocation:  {
					val value = derived.source.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.target.assemblyOperation.operationType.signature
					else
						value
				}
				AssemblyRequiredInterface: "requires " + derived.requiredInterfaceType.requires.signature
				default: "ERROR"
			}
		].join(", ")
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
		val invocations = executionModel.aggregatedInvocations.values
		val operationDataflows = executionModel.operationDataflow.values
		val storageDataflows = executionModel.storageDataflow.values
			
		component.createLinkCallOperation2RequiredPort(invocations)
		component.createLinkDataflowOperation2RequiredPort(operationDataflows)
		component.createLinkDataflowStorage2RequiredPort(storageDataflows)
		
		component.createLinkCallProvidedPort2Operation(invocations)
		component.createLinkDataflowProvidedPort2Operation(operationDataflows)
		component.createLinkDataflowProvidedPort2Storage(storageDataflows)
		
		component.createLinkCallOperation2Operation(invocations)
		component.createLinkDataflowOperation2Operation(operationDataflows)
		component.createLinkDataflowOperation2Storage(storageDataflows)
		component.createLinkDataflowStorage2Operation(storageDataflows)
		
		component.createLinkInterComponentCallOperation(invocations)
		component.createLinkInterComponentDataflowOperation(operationDataflows)
		component.createLinkInterComponentDataflowStorage(storageDataflows)

		component.children.forEach[it.createLinks(executionModel)]
	}
				
	/** -------------------------------
	 * Links of elements to ports.
	 * -------------------------------- */
	 
	def createLinkCallOperation2RequiredPort(Component component, Collection<AggregatedInvocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		invocations.filter[
			it.source.component.assemblyComponent === assemblyComponent && // source must belong to this component
			it.target.component.assemblyComponent !== assemblyComponent // target must be outside, otherwise there is no required port
		].forEach[invocation |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom === invocation]
			val source = object2NodePortMap.get(invocation.source.assemblyOperation)
			val target = object2NodePortMap.get(requiredPort)
			createConnectionEdge(source, target, CALL_FG_COLOR)
		]
	}
	
	def createLinkDataflowOperation2RequiredPort(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		/** Dataflow from source to target. */
		dataflows.filter[it.direction.isWrite].
		filter[
			it.source.component.assemblyComponent === assemblyComponent && // source must belong to this component
			it.target.component.assemblyComponent !== assemblyComponent // target must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val source = object2NodePortMap.get(dataflow.source.assemblyOperation)
				val target = object2NodePortMap.get(requiredPort)
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
		]
		
		/** Dataflow from target to source. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.target.component.assemblyComponent === assemblyComponent && // target must belong to this component
			it.source.component.assemblyComponent !== assemblyComponent // source must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val source = object2NodePortMap.get(dataflow.target.assemblyOperation)
				val target = object2NodePortMap.get(requiredPort)
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
		]
	}
	
	def createLinkDataflowStorage2RequiredPort(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		/** Dataflow from operation to storage. */
		dataflows.filter[it.direction.isWrite].
		filter[
			it.code.component.assemblyComponent === assemblyComponent && // source must belong to this component
			it.storage.component.assemblyComponent !== assemblyComponent // target must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val source = object2NodePortMap.get(dataflow.code.assemblyOperation)
				val target = object2NodePortMap.get(requiredPort)
								
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
		]
		
		/** Dataflow from storage to operation. */
		dataflows.filter[it.direction.isRead].
		filter[
			it.storage.component.assemblyComponent === assemblyComponent && // target must belong to this component
			it.code.component.assemblyComponent !== assemblyComponent // source must be outside, otherwise there is no required port
		].forEach[dataflow |
			val requiredPort = component.requiredPorts.values.findFirst[it.derivedFrom.contains(dataflow)]
			if (requiredPort !== null) {
				val source = object2NodePortMap.get(dataflow.storage.assemblyStorage)
				val target = object2NodePortMap.get(requiredPort)
								
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
		]
	}

	def createLinkCallProvidedPort2Operation(Component component, Collection<AggregatedInvocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		invocations.filter[
			it.source.component.assemblyComponent !== assemblyComponent && // source must belong to another component
			it.target.component.assemblyComponent === assemblyComponent // target must be inside, otherwise there is no required port
		].forEach[invocation |
			val providedPort = component.providedPorts.values.findFirst[it.derivedFrom.contains(invocation)]
			if (providedPort !== null) {
				val source = object2NodePortMap.get(invocation.source.assemblyOperation)
				val target = object2NodePortMap.get(providedPort)
				createConnectionEdge(source, target, CALL_FG_COLOR)
			}
		]
	}
	
	def createLinkDataflowProvidedPort2Operation(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val rememberWrite = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isWrite].
		filter[
			it.source.component.assemblyComponent !== assemblyComponent && // source must belong to another component
			it.target.component.assemblyComponent === assemblyComponent // target must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.target.assemblyOperation)
			]
			if (providedPort !== null) {
				val source = object2NodePortMap.get(providedPort)
				val target = object2NodePortMap.get(dataflow.target.assemblyOperation)
				if (!rememberWrite.existLink(source, target))
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				rememberWrite.put(source, target)
			}
		]
		
		val rememberRead = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isRead].
		filter[
			it.target.component.assemblyComponent !== assemblyComponent && // source must belong to another component
			it.source.component.assemblyComponent === assemblyComponent // target must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.source.assemblyOperation)
			]
			if (providedPort !== null) {
				val source = object2NodePortMap.get(providedPort)
				val target = object2NodePortMap.get(dataflow.source.assemblyOperation)
				if (!rememberRead.existLink(source, target))
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				rememberRead.put(source, target)
			}
		]
	}
	
	def createLinkDataflowProvidedPort2Storage(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val rememberWrite = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isWrite].
		filter[
			it.code.component.assemblyComponent !== assemblyComponent && // source must belong to another component
			it.storage.component.assemblyComponent === assemblyComponent // target must be inside, otherwise there is no required port			
		].
		forEach[dataflow |
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.storage.assemblyStorage)
			]
			if (providedPort !== null) {
				val source = object2NodePortMap.get(providedPort)
				val target = object2NodePortMap.get(dataflow.storage.assemblyStorage)
				if (!rememberWrite.existLink(source, target))
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				rememberWrite.put(source, target)
			}
		]
		
		val rememberRead = new HashMap<NodePort,NodePort>()
		dataflows.
		filter[it.direction.isRead].
		filter[
			it.storage.component.assemblyComponent !== assemblyComponent && // source must belong to another component
			it.code.component.assemblyComponent === assemblyComponent // target must be inside, otherwise there is no required port			
		].
		forEach[dataflow |			
			val providedPort = component.providedPorts.values.findFirst[
				it.derivedFrom.contains(dataflow.code.assemblyOperation)
			]
			if (providedPort !== null) {
				val source = object2NodePortMap.get(providedPort)
				val target = object2NodePortMap.get(dataflow.code.assemblyOperation)
				if (!rememberRead.existLink(source, target))
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				rememberRead.put(source, target)
			}
		]
	}
	
	private def existLink(Map<NodePort,NodePort> remember, NodePort source, NodePort target) {
		val value = remember.get(source)
		if (value === null)
			return false
		else 
			return value === target
	}

	
	/** -------------------------------
	 * Links between elements.
	 * -------------------------------- */
	 
	def createLinkCallOperation2Operation(Component component, Collection<AggregatedInvocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		invocations.filter[
			it.source.assemblyOperation.component === assemblyComponent &&
			it.target.assemblyOperation.component === assemblyComponent
		].
		forEach[
			val source = object2NodePortMap.get(it.target.assemblyOperation)
			val target = object2NodePortMap.get(it.source.assemblyOperation)
			createConnectionEdge(source, target, CALL_FG_COLOR)
		]
	}
		
	def createLinkDataflowOperation2Operation(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.source.assemblyOperation.component === assemblyComponent &&
			it.target.assemblyOperation.component === assemblyComponent
		].
		forEach[
			if (it.direction.isRead) {
				val source = object2NodePortMap.get(it.target.assemblyOperation)
				val target = object2NodePortMap.get(it.source.assemblyOperation)
				createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
			}
			if (it.direction.isWrite) {
				val source = object2NodePortMap.get(it.source.assemblyOperation)
				val target = object2NodePortMap.get(it.target.assemblyOperation)
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
			val source = object2NodePortMap.get(it.code.assemblyOperation)
			val target = object2NodePortMap.get(it.storage.assemblyStorage)
			createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
		]
	}
		
	def createLinkDataflowStorage2Operation(Component component, Collection<StorageDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		dataflows.filter[
			it.direction.isRead &&
			it.storage.assemblyStorage.component === assemblyComponent &&
			it.storage.assemblyStorage.component === it.code.assemblyOperation.component
		].forEach[
			val source = object2NodePortMap.get(it.storage.assemblyStorage)
			val target = object2NodePortMap.get(it.code.assemblyOperation)
			createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
		]
	}
	
	/** -----------------------------------------
	 * create links between ports on components on the same level
	 * ------------------------------------------ */
		
	def createLinkInterComponentCallOperation(Component component, Collection<AggregatedInvocation> incovations) {
		val assemblyComponent = component.derivedFrom.get(0)
		incovations.filter[
			it.source.assemblyOperation.component === assemblyComponent &&
			it.target.assemblyOperation.component !== assemblyComponent &&
			checkJointParent(component, it.target.assemblyOperation.component)
		].forEach[
			// TODO implement
			System.err.printf(">> %s --> %s\n", 
				it.source.assemblyOperation.operationType.signature, it.target.assemblyOperation.operationType.signature
			)
		]
	}
	
	def createLinkInterComponentDataflowOperation(Component component, Collection<OperationDataflow> dataflows) {
		val assemblyComponent = component.derivedFrom.get(0)
		val writeFlows = dataflows.filter[it.direction.isWrite].
		filter[
			it.source.assemblyOperation.component !== assemblyComponent &&
			it.target.assemblyOperation.component === assemblyComponent &&
			checkJointParent(component, it.target.assemblyOperation.component)
		]
		
		// System.err.printf("Operation write flows: %s %d of %d\n", assemblyComponent.signature, writeFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort | 
			val dataflow = writeFlows.findFirst[providedPort.origin.contains(it.target.assemblyOperation)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					val source = object2NodePortMap.get(requiredPort)
					val target = object2NodePortMap.get(providedPort)
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				}
			}
		]
		
		val readFlows = dataflows.filter[it.direction.isRead].
		filter[
			it.source.assemblyOperation.component === assemblyComponent &&
			it.target.assemblyOperation.component !== assemblyComponent &&
			checkJointParent(component, it.source.assemblyOperation.component)
		]
		
		// System.err.printf("Operation read flows: %s %d of %d\n", assemblyComponent.signature, readFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort |
			val dataflow = readFlows.findFirst[providedPort.origin.contains(it.source.assemblyOperation)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					val source = object2NodePortMap.get(requiredPort)
					val target = object2NodePortMap.get(providedPort)
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				}
			}
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
		
		System.err.printf("Storage write flows: %s %d of %d\n", assemblyComponent.signature, writeFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort | 
			val dataflow = writeFlows.findFirst[providedPort.origin.contains(it.storage.assemblyStorage)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					val source = object2NodePortMap.get(requiredPort)
					val target = object2NodePortMap.get(providedPort)
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				}
			}
		]
		
		val readFlows = dataflows.filter[it.direction.isRead].
		filter[
			it.code.assemblyOperation.component === assemblyComponent &&
			it.storage.assemblyStorage.component !== assemblyComponent &&
			checkJointParent(component, it.code.assemblyOperation.component)
		]
		
		System.err.printf("Storage read flows: %s %d of %d\n", assemblyComponent.signature, readFlows.size(), dataflows.size())
		
		component.providedPorts.values().forEach[providedPort |
			val dataflow = readFlows.findFirst[providedPort.origin.contains(it.code.assemblyOperation)]
			if (dataflow !== null) {
				val requiredPort = providedPort.requiringPorts.findFirst[it.origin.exists[it === dataflow]]
				if (requiredPort !== null) {
					val source = object2NodePortMap.get(requiredPort)
					val target = object2NodePortMap.get(providedPort)
					createConnectionEdge(source, target, DATAFLOW_FG_COLOR)
				}
			}
		]		
	}
	
	
	
	/** ---------------------------------
	 * utilities
	 * ---------------------------------- */
	
	private def Collection<Object> origin(ProvidedPort providedPort) {
		if (providedPort.derivedFrom.get(0) instanceof ProvidedPort)
			(providedPort.derivedFrom.get(0) as ProvidedPort).origin
		else
			providedPort.derivedFrom
	}

	private def Collection<Object> origin(RequiredPort requiredPort) {
		if (requiredPort.derivedFrom.get(0) instanceof ProvidedPort)
			(requiredPort.derivedFrom.get(0) as RequiredPort).origin
		else
			requiredPort.derivedFrom
	}
	
	private def checkJointParent(Component component, AssemblyComponent assemblyComponent) {
		if (component.parent !== null)
			component.parent.children.exists[child | child.derivedFrom.contains(assemblyComponent)]
		else
			components.exists[it.derivedFrom.contains(assemblyComponent)]
	}
	
	/** ---------------------------------------- */
		
	private	def createInterComponentLinks(Component component) {
		component.providedPorts.values.forEach[providedPort |
			providedPort.requiringPorts.filter[
				it.component !== component &&
				component.parent === it.component.parent  // ensure that both components are on the same level
			].forEach[requiredPort |
				createConnectionEdge(object2NodePortMap.get(requiredPort), object2NodePortMap.get(providedPort), "#ffff00")
			]
		]
	}
	
	private def createOperationCallToRequiredPortLinks(Component component, Collection<AggregatedInvocation> invocations) {
		val assemblyComponent = component.derivedFrom.get(0)
		invocations.filter[assemblyComponent === it.source.assemblyOperation.component 
					&& assemblyComponent !== it.target.assemblyOperation.component
		].forEach[invocation |
			val requiredPort = component.requiredPorts.values().findFirst[it.correspondsTo(invocation)]
			if (requiredPort !== null) {
				val source = object2NodePortMap.get(invocation.source.assemblyOperation)
				val target = object2NodePortMap.get(requiredPort)
				if (source !== null && target !== null)
					createConnectionEdge(source, target, "black")
			} else
				System.err.println("ERROR: KAED create operation to required port links, should have found a required port for " + invocation.source.fqn + " -> " + invocation.target.fqn)
		]
	}
	
	private def boolean correspondsTo(RequiredPort requiredPort, AggregatedInvocation invocation) {
		val providedPort = requiredPort.findOriginalProvidedPort
		if (providedPort !== null) {
			val derivedFromProvidedPort = providedPort.derivedFrom
			if (derivedFromProvidedPort instanceof AssemblyProvidedInterface) {
				return derivedFromProvidedPort.providedInterfaceType.providedOperationTypes.values.exists[it === invocation.target.assemblyOperation.operationType]
			} else {
				return false
			}		
		} else {
			System.err.println("ERROR: KAED correspondsTo, missing provided port for " + requiredPort.label + " " + requiredPort.providedPort)
			return false
		}
 	}

	
	private def ProvidedPort findOriginalProvidedPort(RequiredPort port) {
		val linkedPort = port.providedPort
		if (linkedPort instanceof ProvidedPort) {
			return linkedPort.findOriginalProvidedPort
		} else if (linkedPort !== null)
			return (linkedPort as RequiredPort).findOriginalProvidedPort.findOriginalProvidedPort
		else {
			System.err.println("ERROR: KAED findOriginalProvidedPort, required port does not has a providing one " + port.label)
			return null	
		}
	}
	
	private def ProvidedPort findOriginalProvidedPort(ProvidedPort port) {
		if (port.derivedFrom instanceof ProvidedPort) {
			return (port.derivedFrom as ProvidedPort).findOriginalProvidedPort
		} else
			return port
	}
	
	private def createLocalOperationLinks(Component component, Collection<AggregatedInvocation> invocations) {
		// Note: components have only one element they are derivedFrom
		component.derivedFrom.get(0).operations.values.forEach[caller |
			invocations.filter[it.source.assemblyOperation === caller && component.derivedFrom.contains(it.target.assemblyOperation.component)].
			forEach[
				val source = object2NodePortMap.get(it.source.assemblyOperation)
				val target = object2NodePortMap.get(it.target.assemblyOperation)
				if (source !== null && target !== null)
					createConnectionEdge(source, target, CALL_FG_COLOR)
			]
		]
	}
	
	private def createLocalStorageLinks(Component component, Collection<StorageDataflow> storageAccesses) {
		component.derivedFrom.get(0).operations.values.forEach[caller |
			storageAccesses.filter[
				it.code.assemblyOperation === caller && 
				component.derivedFrom.contains(it.storage.assemblyStorage.component)
			].
			forEach[
				if (#[EDirection.WRITE, EDirection.BOTH].contains(it.direction)) {
					val source = object2NodePortMap.get(it.code.assemblyOperation)
					val target = object2NodePortMap.get(it.storage.assemblyStorage)
					if (source !== null && target !== null)
						createOperationStorageAccess(source.node , target.node, it.direction)
				}
				if (#[EDirection.READ, EDirection.BOTH].contains(it.direction)) {
					val source = object2NodePortMap.get(it.storage.assemblyStorage)
					val target = object2NodePortMap.get(it.code.assemblyOperation)
					if (source !== null && target !== null)
						createOperationStorageAccess(source.node , target.node, it.direction)
				}
			]
		]
	}

	private def createLocalDataflowLinks(Component component, Collection<OperationDataflow> dataflows) {
		component.derivedFrom.get(0).operations.values.forEach[operation |
			dataflows.filter[
				it.source.assemblyOperation === operation && 
				component.derivedFrom.contains(it.target.assemblyOperation.component)
			].forEach[
				createOperationDataflowAccess(object2NodePortMap.get(it.source.assemblyOperation).node , object2NodePortMap.get(it.target.assemblyOperation).node, it.direction)
			]
		]
	}
		
	private def createElementToComponentProvidedPortLinks(Component component) {
		component.providedPorts.values().forEach[providedPort |
			val derivedFrom = providedPort.derivedFrom
			val foregroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(providedPort.portType)) CALL_FG_COLOR else DATAFLOW_FG_COLOR
			switch(derivedFrom) {
				AssemblyProvidedInterface: {
					derivedFrom.providedInterfaceType.providedOperationTypes.values.forEach[
						val operation = component.derivedFrom.get(0).operations.get(it.signature)
						val source = object2NodePortMap.get(providedPort)
						val target =  object2NodePortMap.get(operation)
						if (source !== null && target !== null)
							createConnectionEdge(source, target, foregroundColor)
					]
				}
				ProvidedPort: {
					val source = object2NodePortMap.get(providedPort)
					val target = object2NodePortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				AssemblyOperation: {
					val source = object2NodePortMap.get(providedPort)
					val target = object2NodePortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				AssemblyStorage: {
					val source = object2NodePortMap.get(providedPort)
					val target = object2NodePortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				default: System.err.println("ERROR: KEAD createProvidedPortLinks, missing provided link type " + derivedFrom?.class)
			}
		]
	}
	
	private def createElementToComponentRequiredPortLinks(Component component) {
		component.requiredPorts.values().forEach[requiredPort |
			val sourcePort = requiredPort.providedPort
			val foregroundColor = getForegroundColorForPortType(requiredPort.portType)
			val derivedFrom = requiredPort.derivedFrom
			switch(derivedFrom) {
				StorageDataflow: {
					if (derivedFrom.direction.isRead) { // the storage is the "requiring one"
						val source = object2NodePortMap.get(derivedFrom.storage.assemblyStorage)
						val target = object2NodePortMap.get(requiredPort)				
						if (source !== null && target !== null)
							createConnectionEdge(source, target, "green")
					}
					if (derivedFrom.direction.isWrite) {
						val source = object2NodePortMap.get(derivedFrom.code.assemblyOperation)
						val target = object2NodePortMap.get(requiredPort)
					
						val p = ""
					
						System.err.printf("component %s %s --> %s  [%s :: %s]\n", 
							component.label, derivedFrom.code.assemblyOperation.fqn, requiredPort.label,
							p,
							derivedFrom.storage.assemblyStorage.fqn
						)
						if (source !== null && target !== null)
							createConnectionEdge(source, target, "gray")
					}
				}
				OperationDataflow: {
					if (#[EDirection.WRITE, EDirection.BOTH].contains(derivedFrom.direction)) {
						val source = object2NodePortMap.get(requiredPort)
						val target = object2NodePortMap.get(derivedFrom.source.assemblyOperation)				
						if (source !== null && target !== null) {
							createConnectionEdge(target, source, "blue")
						}
					} else {
						System.err.println("OperationDataflow as required port in read direction, not supported.")
					}
				}
				RequiredPort: { // implies nested components
					createConnectionEdge(object2NodePortMap.get(requiredPort), object2NodePortMap.get(sourcePort), foregroundColor) // outer port
				}
				default:
				System.err.println("UNKOWN")
			}
			// link source port to required port.
//			switch(sourcePort) {
//				RequiredPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort), foregroundColor) // outer port
//				ProvidedPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort), foregroundColor) // provided port
//				AggregatedInvocation: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort.target.assemblyOperation), foregroundColor) // direct link from an operation
//				StorageDataflow: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort.storage.assemblyStorage), foregroundColor) // direct link from an data storage
//				default: System.err.println("ERROR: KEAD create required port links, missing required link type " + sourcePort + " " + requiredPort.label + " " + requiredPort.derivedFrom)
//			}
		]
	}
	
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
			// Thus we need only to get the first element to deciede which routine should be used.
			val derivedFrom = providedPort.derivedFrom.get(0)
			val createPort = switch(derivedFrom) {
				AssemblyProvidedInterface: createInterfaceProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType)
				AssemblyOperation: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#ff0000")
				AssemblyStorage: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#00ff00")
				OperationDataflow: createOperationProvidedPort(PortSide.SOUTH, derivedFrom, node.ports.size, providedPort.portType, "#0000ff")
				ProvidedPort: createInterfaceProvidedPort(PortSide.SOUTH, providedPort.findOriginal, node.ports.size, providedPort.portType)
				default: {
					System.err.println("default provided port " + derivedFrom.class)
					createInterfacePort(PortSide.SOUTH, null, node.ports.size, "#00ff00", "#a0ffa0")
				}
			}
			val port = addLabel(createPort, providedPort.label)
			
			object2NodePortMap.put(providedPort, new NodePort(node, port))
			node.ports += port
		]
	}
	
	private def EObject findOriginal(Port port) {
		if (port.derivedFrom instanceof Port)
			return (port.derivedFrom as Port).findOriginal
		else
			return port.derivedFrom as EObject
	}
	
	private def void createRequiredPorts(KNode node, Component component) {
		component.requiredPorts.values().forEach[requiredPort |
			// Note: ports might be derived from different elements, but they are created only once.
			// Thus we need only to get the first element to deciede which routine should be used.
			val derivedFrom = requiredPort.derivedFrom.get(0)
			val createdPort = switch(derivedFrom) {
				AssemblyRequiredInterface: createInterfaceRequiredPort(PortSide.NORTH, derivedFrom, node.ports.size, requiredPort.portType)
				AggregatedInvocation: createOperationRequiredPort(PortSide.NORTH, derivedFrom.source.assemblyOperation, node.ports.size, requiredPort.portType)
				StorageDataflow: createOperationRequiredPort(PortSide.NORTH, derivedFrom, node.ports.size, requiredPort.portType)
				// TODO derivedFrom.source is insufficient, it should depend on the direction of flow that is actually used here
				OperationDataflow: createOperationRequiredPort(PortSide.NORTH, derivedFrom.source.assemblyOperation, node.ports.size, requiredPort.portType)
				RequiredPort: createInterfaceProvidedPort(PortSide.NORTH, requiredPort.findOriginal, node.ports.size, requiredPort.portType)  // port derived from an inner port
				default: {
					System.err.println("default required port " + derivedFrom.class)
					createInterfacePort(PortSide.NORTH, null, node.ports.size, "#00ff00", "#ffffff")
				}
			}

			val port = addLabel(createdPort, requiredPort.label)

			object2NodePortMap.put(requiredPort, new NodePort(node, port))
			node.ports += port
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
	
	
	private def fqn(AssemblyStorage storage) {
		storage.component.signature + "::" + storage.storageType.name
	}

	private def fqn(AssemblyOperation op) {
		op.component.signature + "::" + op.operationType.signature
	}
	
	private def fqn(DeployedOperation op) {
		op.assemblyOperation.fqn
	}
	
	private def fqn(DeployedStorage storage) {
		storage.assemblyStorage.component.signature + "::" + storage.assemblyStorage.storageType.name
	}
}
