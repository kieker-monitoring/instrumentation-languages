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
	
	Map<Object, NodePort> objectPortMap
		
	val String ODD_BACKGROUND_COLOR = "LemonChiffon"
		
	val String EVEN_BACKGROUND_COLOR = "#fffff0"
	
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
			
			objectPortMap = new HashMap
			
			val Set<Component> components = new DisplayModelBuilder().create(assemblyModel.components.values, executionModel)
					
			return createDisplay(components, executionModel)
		} else {
			return null
		}
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
		val storageAccesses = executionModel.storageDataflow.values
		val dataflows = executionModel.operationDataflow.values
		
		createRequiredPortLinks(component)
		createProvidedPortLinks(component)
		
		createOperationCallToRequiredPortLinks(component, invocations)
		createLocalOperationLinks(component, invocations)
		createLocalStorageLinks(component, storageAccesses)
		createDataflowLinks(component, dataflows)

		component.children.forEach[it.createLinks(executionModel)]
	}
	
	private def createOperationCallToRequiredPortLinks(Component component, Collection<AggregatedInvocation> invocations) {
		invocations.filter[component.derivedFrom === it.source.assemblyOperation.component 
					&& component.derivedFrom !== it.target.assemblyOperation.component
		].forEach[invocation |
			val requiredPort = component.requiredPorts.values().findFirst[it.correspondsTo(invocation)]
			if (requiredPort !== null) {
				val source = objectPortMap.get(invocation.source.assemblyOperation)
				val target = objectPortMap.get(requiredPort)
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
		component.derivedFrom.operations.values.forEach[caller |
			invocations.filter[it.source.assemblyOperation === caller && it.target.assemblyOperation.component === component.derivedFrom].forEach[
				val source = objectPortMap.get(it.source.assemblyOperation)
				val target = objectPortMap.get(it.target.assemblyOperation)
				if (source !== null && target !== null)
					createConnectionEdge(source, target, CALL_FG_COLOR)
			]
		]
	}
	
	private def createLocalStorageLinks(Component component, Collection<StorageDataflow> storageAccesses) {
		component.derivedFrom.operations.values.forEach[caller |
			storageAccesses.filter[it.code.assemblyOperation === caller && it.storage.assemblyStorage.component === component.derivedFrom].forEach[
				val source = objectPortMap.get(it.code.assemblyOperation)
				val target = objectPortMap.get(it.storage.assemblyStorage)
				if (source !== null && target !== null)
					createOperationStorageAccess(source.node , target.node, it.direction)
			]
		]
	}

	private def createDataflowLinks(Component component, Collection<OperationDataflow> dataflows) {
		component.derivedFrom.operations.values.forEach[operation |
			dataflows.filter[it.source.assemblyOperation === operation && it.target.assemblyOperation.component === component.derivedFrom].forEach[
				createOperationDataflowAccess(objectPortMap.get(it.source.assemblyOperation).node , objectPortMap.get(it.target.assemblyOperation).node, it.direction)
			]
		]
	}
		
	private def createProvidedPortLinks(Component component) {
		component.providedPorts.values().forEach[providedPort |
			val derivedFrom = providedPort.derivedFrom
			val foregroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(providedPort.portType)) CALL_FG_COLOR else DATAFLOW_FG_COLOR
			switch(derivedFrom) {
				AssemblyProvidedInterface: derivedFrom.providedInterfaceType.providedOperationTypes.values.forEach[
						val operation = component.derivedFrom.operations.get(it.signature)
						val source = objectPortMap.get(providedPort)
						val target =  objectPortMap.get(operation)
						if (source !== null && target !== null)
							createConnectionEdge(source, target, foregroundColor)
					]
				ProvidedPort: {
					val source = objectPortMap.get(providedPort)
					val target = objectPortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				AssemblyOperation: {
					val source = objectPortMap.get(providedPort)
					val target = objectPortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				AssemblyStorage: {
					val source = objectPortMap.get(providedPort)
					val target = objectPortMap.get(derivedFrom)
					if (source !== null && target !== null)
						createConnectionEdge(source, target, foregroundColor)
				}
				default: System.err.println("ERROR: KEAD createProvidedPortLinks, missing provided link type " + derivedFrom?.class)
			}
		]
	}
	
	private def createRequiredPortLinks(Component component) {
		component.requiredPorts.values().forEach[requiredPort |
			val sourcePort = requiredPort.providedPort
			val foregroundColor = getForegroundColorForPortType(requiredPort.portType)
			// link source port to required port.
			switch(sourcePort) {
				RequiredPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort), foregroundColor) // outer port
				ProvidedPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort), foregroundColor) // provided port
				AggregatedInvocation: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort.target.assemblyOperation), foregroundColor) // direct link from an operation
				StorageDataflow: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(sourcePort.storage.assemblyStorage), foregroundColor) // direct link from an data storage
				default: System.err.println("ERROR: KEAD create required port links, missing required link type " + sourcePort + " " + requiredPort.label + " " + requiredPort.derivedFrom)
			}
			if (requiredPort.derivedFrom instanceof AggregatedInvocation) { // the required port is an operation
				val invocation = requiredPort.derivedFrom as AggregatedInvocation
				val source = objectPortMap.get(invocation.source.assemblyOperation)
				val target = objectPortMap.get(requiredPort)
				if (source !== null && target !== null)
					createConnectionEdge(source, target, foregroundColor)
			} else if (requiredPort.derivedFrom instanceof OperationDataflow) { // the required port is an operation dataflow
				val dataflow = requiredPort.derivedFrom as OperationDataflow
				val source = objectPortMap.get(dataflow.source.assemblyOperation)
				val target = objectPortMap.get(requiredPort)				
				if (source !== null && target !== null)
					createConnectionEdge(source, target, foregroundColor)
			} else if (requiredPort.derivedFrom instanceof StorageDataflow) { // the required port is an storage dataflow
				val dataflow = requiredPort.derivedFrom as StorageDataflow
				val source = objectPortMap.get(dataflow.storage.assemblyStorage)
				val target = objectPortMap.get(requiredPort)
				if (source !== null && target !== null)
	 				createConnectionEdge(source, target, foregroundColor)
			} else {
				System.err.println("ERROR: KAED create required port links, unknown derived class " + requiredPort.derivedFrom.class)
			}
		]
	}
	
	private def createComponent(Component component, String background) {
		return component.createNode().associateWith(component) => [componentNode |
			componentNode.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			componentNode.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			componentNode.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
			
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
				it.addText(component.label).associateWith(component.derivedFrom) => [
					it.fontSize = 15
					it.fontBold = true
					it.cursorSelectable = false
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
				]

				if ((SHOW_OPERATIONS.booleanValue && (!component.derivedFrom.operations.isEmpty || !component.derivedFrom.storages.isEmpty)) ||
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
						
			if (SHOW_OPERATIONS.booleanValue && (!component.derivedFrom.operations.isEmpty || !component.derivedFrom.storages.isEmpty)) {
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
			val port = addLabel(switch(providedPort.derivedFrom) {
				AssemblyProvidedInterface: createInterfaceProvidedPort(PortSide.SOUTH, providedPort.derivedFrom as AssemblyProvidedInterface, node.ports.size, providedPort.portType)
				AssemblyOperation: createOperationProvidedPort(PortSide.EAST, providedPort.derivedFrom as AssemblyOperation, node.ports.size, providedPort.portType, "#ff0000")
				AssemblyStorage: createOperationProvidedPort(PortSide.EAST, providedPort.derivedFrom as AssemblyStorage, node.ports.size, providedPort.portType, "#00ff00")
				OperationDataflow: createOperationProvidedPort(PortSide.EAST, providedPort.derivedFrom as OperationDataflow, node.ports.size, providedPort.portType, "#0000ff")
				ProvidedPort: createInterfaceProvidedPort(PortSide.SOUTH, providedPort.findOriginal, node.ports.size, providedPort.portType)
				default: {
					System.err.println("default provided port " + providedPort.derivedFrom.class)
					createInterfacePort(PortSide.SOUTH, null, node.ports.size, "#00ff00", "#a0ffa0")
				}
			}, providedPort.label)
			
			objectPortMap.put(providedPort, new NodePort(node, port))
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
			val port = addLabel(switch(requiredPort.derivedFrom) {
				AssemblyRequiredInterface: createInterfaceRequiredPort(PortSide.NORTH, requiredPort.derivedFrom as AssemblyRequiredInterface, node.ports.size, requiredPort.portType)
				AggregatedInvocation: createOperationRequiredPort(PortSide.WEST, (requiredPort.derivedFrom as AggregatedInvocation).source.assemblyOperation, node.ports.size, requiredPort.portType)
				StorageDataflow: createOperationRequiredPort(PortSide.EAST, requiredPort.derivedFrom as StorageDataflow, node.ports.size, requiredPort.portType)
				OperationDataflow: createOperationRequiredPort(PortSide.WEST, (requiredPort.derivedFrom as OperationDataflow).source.assemblyOperation, node.ports.size, requiredPort.portType)
				RequiredPort: createInterfaceProvidedPort(PortSide.SOUTH, requiredPort.findOriginal, node.ports.size, requiredPort.portType)  // port derived from an inner port
				default: {
					System.err.println("default required port " + requiredPort.derivedFrom.class)
					createInterfacePort(PortSide.NORTH, null, node.ports.size, "#00ff00", "#ffffff")
				}
			}, requiredPort.label)

			objectPortMap.put(requiredPort, new NodePort(node, port))
			node.ports += port
		]
	}
		
	private def void createOperations(KNode node, Component component) {
		component.derivedFrom.operations.values.forEach[
			val operationNode = createOperation(it, it.operationType.signature)

			objectPortMap.put(it, new NodePort(operationNode, null))
			node.children += operationNode
		]
	}
	
	private def void createStorages(KNode node, Component component) {
		component.derivedFrom.storages.values.forEach[
			val storageNode = createStorage(it.storageType.name)

			objectPortMap.put(it, new NodePort(storageNode, null))			
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
