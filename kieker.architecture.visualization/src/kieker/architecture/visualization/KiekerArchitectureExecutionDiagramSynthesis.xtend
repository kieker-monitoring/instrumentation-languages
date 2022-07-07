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
import kieker.model.analysismodel.execution.AggregatedStorageAccess
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.architecture.visualization.display.model.ProvidedPort

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
	
	override transform(ExecutionModel executionModel) {
		val deployedOperation = executionModel.aggregatedInvocations.get(0).value.source
		val assemblyOperation = deployedOperation.assemblyOperation
		val assemblyComponent = assemblyOperation.component
		val assemblyModel = assemblyComponent.eContainer.eContainer as AssemblyModel
		
		objectPortMap = new HashMap
		
		val Set<Component> components = new DisplayModelBuilder().create(assemblyModel.components.values, executionModel.aggregatedInvocations.values)
				
		return createDisplay(components, executionModel.aggregatedInvocations.values, executionModel.aggregatedStorageAccesses.values)
	}
	
	private def KNode createDisplay(Set<Component> components, Collection<AggregatedInvocation> invocations, Collection<AggregatedStorageAccess> storageAccesses) {
		return createNode() => [
			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
		
			components.forEach[node |
				it.children += node.createComponent
			]
			components.forEach[it.createLinks(invocations, storageAccesses)]
		]
	}
	
	private def void createLinks(Component component, Collection<AggregatedInvocation> invocations, Collection<AggregatedStorageAccess> storageAccesses) {
		createRequiredPortLinks(component)
		createProvidedPortLinks(component)
		
		createOperationToRequiredPortLinks(component, invocations)
		createOperationLinks(component, invocations)
		createStorageLinks(component, storageAccesses)

		component.children.forEach[it.createLinks(invocations, storageAccesses)]
	}
	
	private def createOperationToRequiredPortLinks(Component component, Collection<AggregatedInvocation> invocations) {
		invocations.filter[component.derivedFrom === it.source.assemblyOperation.component 
					&& component.derivedFrom !== it.target.assemblyOperation.component
		].forEach[invocation |
			val requiredPort = component.requiredPorts.findFirst[it.correspondsTo(invocation)]
			if (requiredPort !== null)
				createConnectionEdge(objectPortMap.get(invocation.source.assemblyOperation), objectPortMap.get(requiredPort), "black")
			else
				System.err.println("ERROR: should have found a required port")
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
			System.err.println("MISSING provided port for " + requiredPort.label + " " + requiredPort.providedPort)
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
			System.err.println("ERROR: required port does not has a providing one " + port.label)
			return null	
		}
	}
	
	private def ProvidedPort findOriginalProvidedPort(ProvidedPort port) {
		if (port.derivedFrom instanceof ProvidedPort) {
			return (port.derivedFrom as ProvidedPort).findOriginalProvidedPort
		} else
			return port
	}
	
	private def createOperationLinks(Component component, Collection<AggregatedInvocation> invocations) {
		component.derivedFrom.operations.values.forEach[caller |
			invocations.filter[it.source.assemblyOperation === caller && it.target.assemblyOperation.component === component.derivedFrom].forEach[
				createConnectionEdge(objectPortMap.get(it.source.assemblyOperation), objectPortMap.get(it.target.assemblyOperation), "black")
			]
		]
	}
	
	private def createStorageLinks(Component component, Collection<AggregatedStorageAccess> storageAccesses) {
		component.derivedFrom.operations.values.forEach[caller |
			storageAccesses.filter[it.code.assemblyOperation === caller && it.storage.assemblyStorage.component === component.derivedFrom].forEach[
				createOperationStorageAccess(objectPortMap.get(it.code.assemblyOperation).node , objectPortMap.get(it.storage.assemblyStorage).node, it.direction)
			]
		]
	}
	
	private def createProvidedPortLinks(Component component) {
		component.providedPorts.forEach[providedPort |
			val derivedFrom = providedPort.derivedFrom
			switch(derivedFrom) {
				AssemblyProvidedInterface: derivedFrom.providedInterfaceType.providedOperationTypes.values.forEach[
						val operation = component.derivedFrom.operations.get(it.signature)
						createConnectionEdge(objectPortMap.get(providedPort), objectPortMap.get(operation), "gray25")
					]
				ProvidedPort: createConnectionEdge(objectPortMap.get(providedPort), objectPortMap.get(derivedFrom), "black")
				AssemblyOperation: createConnectionEdge(objectPortMap.get(providedPort), objectPortMap.get(derivedFrom), "black")
				default: System.err.println("MISSING provided link type " + derivedFrom?.class)
			}
		]
	}
	
	private def createRequiredPortLinks(Component component) {
		component.requiredPorts.forEach[requiredPort |
			val linkedPort = requiredPort.providedPort
			switch(linkedPort) {
				RequiredPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(linkedPort), "black")
				ProvidedPort: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(linkedPort), "gray25")
				AggregatedInvocation: createConnectionEdge(objectPortMap.get(requiredPort), objectPortMap.get(linkedPort.target.assemblyOperation), "#9090ff")
				default: System.err.println("MISSING required link type " + linkedPort + " " + requiredPort.label + " " + requiredPort.derivedFrom)
			}
			if (requiredPort.derivedFrom instanceof AggregatedInvocation) {
				val invocation = requiredPort.derivedFrom as AggregatedInvocation
				createConnectionEdge(objectPortMap.get(invocation.source.assemblyOperation), objectPortMap.get(requiredPort), "gray25")
			}
		]
	}
	
	private def createComponent(Component component) {
		return component.createNode().associateWith(component) => [componentNode |
			componentNode.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			componentNode.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			componentNode.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
			
			componentNode.addRectangle => [
				it.lineWidth = 4
				it.background = "LemonChiffon".color  //setBackgroundGradient("white".color, "LemonChiffon".color, 0)
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

				if ((SHOW_OPERATIONS.booleanValue && component.derivedFrom.operations.size > 0) ||
					(component.children.size > 0)) {
					it.addHorizontalSeperatorLine(1, 0)
					it.addChildArea
				}
			]
			
			componentNode.createProvidedPorts(component)
			componentNode.createRequiredPorts(component)
			
			if (component.children.size > 0) {
				componentNode.createSubComponents(component)
			}
						
			if (SHOW_OPERATIONS.booleanValue && component.derivedFrom.operations.size > 0) {
				componentNode.createOperations(component)
				componentNode.createStorages(component)
			}
		]
	}
		
	private def void createSubComponents(KNode node, Component component) {
		component.children.forEach [
			val componentNode = it.createComponent
			node.children += componentNode
		]
	}
	
	private def void createProvidedPorts(KNode node, Component component) {
		component.providedPorts.forEach[providedPort |
			val port = addLabel(switch(providedPort.derivedFrom) {
				AssemblyProvidedInterface: createPort(PortSide.SOUTH, providedPort.derivedFrom as AssemblyProvidedInterface, node.ports.size, "#ffffff")
				AssemblyOperation: createOperationPort(PortSide.EAST, providedPort.derivedFrom as AssemblyOperation, node.ports.size, "#ffffff")
				default: createPort(PortSide.SOUTH, null, node.ports.size, "#a0a0ff")
			}, providedPort.label)
			
			objectPortMap.put(providedPort, new NodePort(node, port))
			node.ports += port
		]
	}
	
	private def void createRequiredPorts(KNode node, Component component) {
		component.requiredPorts.forEach[requiredPort |
			val port = addLabel(switch(requiredPort.derivedFrom) {
				AssemblyRequiredInterface: createPort(PortSide.NORTH, requiredPort.derivedFrom as AssemblyRequiredInterface, node.ports.size, "#a0a0a0")
				AggregatedInvocation: createOperationPort(PortSide.WEST, (requiredPort.derivedFrom as AggregatedInvocation).source.assemblyOperation, node.ports.size, "#a0a0a0")
				default: createPort(PortSide.NORTH, null, node.ports.size, "#5050a0")
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
	
	
	
}
