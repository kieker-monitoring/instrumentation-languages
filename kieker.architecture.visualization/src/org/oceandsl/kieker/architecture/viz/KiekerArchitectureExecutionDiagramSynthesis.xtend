/** 
 * Copyright (C) 2022 OceanDSL (https://oceandsl.uni-kiel.de)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.oceandsl.kieker.architecture.viz

import analysismodel.assembly.AssemblyComponent
import analysismodel.assembly.AssemblyModel
import analysismodel.assembly.AssemblyProvidedInterface
import analysismodel.assembly.impl.EStringToAssemblyProvidedInterfaceMapEntryImpl
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import java.util.Collection
import java.util.HashMap
import java.util.Map
import javax.inject.Inject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeType
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import java.util.HashSet
import analysismodel.assembly.AssemblyRequiredInterface
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import java.util.Set
import analysismodel.execution.ExecutionModel
import analysismodel.execution.AggregatedInvocation
import java.lang.annotation.Target
import analysismodel.execution.Tuple
import analysismodel.execution.ExecutionFactory
import analysismodel.assembly.AssemblyOperation
import analysismodel.assembly.AssemblyStorage
import analysismodel.execution.AggregatedStorageAccess
import analysismodel.deployment.DeployedOperation
import analysismodel.execution.EDirection
import analysismodel.deployment.DeployedStorage

/** 
 * @author Reiner Jung
 * @since 1.4
 */
class KiekerArchitectureExecutionDiagramSynthesis extends AbstractKiekerArchitectureDiagramSynthesis<ExecutionModel> {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KEdgeExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KColorExtensions

	Map<AssemblyComponent, KNode> componentNodeMap

	Set<AssemblyComponent> containedComponents

	Map<AssemblyComponent, AssemblyComponent> containmentLookupMap

	Map<KNode, Map<EObject, KPort>> nodeInterfacePortMap
		
		ArrayList<Tuple<AssemblyComponent, AssemblyComponent>> componentLinks
		
		HashMap<AssemblyOperation, KNode> operationNodeMap
		
		HashMap<AssemblyStorage, KNode> storageNodeMap
		
	Map<AssemblyOperation,KPort> operationTargetPortMap

	Map<AssemblyOperation,KPort> operationSourcePortMap


	override KNode transform(ExecutionModel executionModel) {
		val deployedOperation = executionModel.aggregatedInvocations.get(0).value.source
		val assemblyOperation = deployedOperation.assemblyOperation
		val assemblyComponent = assemblyOperation.assemblyComponent
		val assemblyModel = assemblyComponent.eContainer.eContainer as AssemblyModel
						
		return createNode() => [
			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)

			createAssemblyComponents(it, executionModel.aggregatedInvocations.values, executionModel.aggregatedStorageAccesses.values, assemblyModel.assemblyComponents.values)
		]
	}

	def createAssemblyComponents(KNode node, Collection<AggregatedInvocation> aggregatedInvocations, Collection<AggregatedStorageAccess> aggregatedStorageAccesses, Collection<AssemblyComponent> components) {
		nodeInterfacePortMap = new HashMap<KNode, Map<EObject, KPort>>

		componentLinks = new ArrayList<Tuple<AssemblyComponent,AssemblyComponent>>

		componentNodeMap = new HashMap<AssemblyComponent, KNode>
		operationNodeMap = new HashMap<AssemblyOperation, KNode>
		storageNodeMap = new HashMap<AssemblyStorage, KNode>
		operationSourcePortMap = new HashMap<AssemblyOperation, KPort>
		operationTargetPortMap = new HashMap<AssemblyOperation, KPort>
		
		containedComponents = computeContainedComponents(components)
		containmentLookupMap = computeContainmentLookupMap(components)

		components.filter[!containedComponents.contains(it)].forEach [ component |
			val componentNode = component.createAssemblyComponent()
			node.children += componentNode
		]
		
		if (SHOW_STORAGE.booleanValue) {
			if (SHOW_OPERATIONS.booleanValue) {
				aggregatedStorageAccesses.forEach[
					createOperationStorageAccess(it.code.assemblyOperation , it.direction, it.storage.assemblyStorage)
				]
			}
		}
				
		if (SHOW_OPERATIONS.booleanValue) {
			aggregatedInvocations.forEach[
				createOperationConnection(it.source.assemblyOperation, it.target.assemblyOperation)
			]	
		} else {
			aggregatedInvocations.forEach[
				createComponentConnection(it.source.assemblyOperation.assemblyComponent, it.target.assemblyOperation.assemblyComponent)
			]		
		}
	}
		
	private def createOperationStorageAccess(AssemblyOperation operation, EDirection direction, AssemblyStorage storage) {
		val operationNode = operationNodeMap.get(operation)
		val storageNode = storageNodeMap.get(storage)
		
		createEdge() => [
			it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
			it.source = operationNode
			//it.sourcePort = sourcePort
			it.target = storageNode
			//it.targetPort = targetPort

			it.data
			addPolyline() => [
				it.lineWidth = 2;
				it.foreground = "gray25".color
				if (direction === EDirection.WRITE || direction === EDirection.BOTH) it.addHeadArrowDecorator
				if (direction === EDirection.READ || direction === EDirection.BOTH) it.addTailArrowDecorator
			]
		]
	}
		
		
	private def createOperationConnection(AssemblyOperation source, AssemblyOperation target) {
		if (source.assemblyComponent !== target.assemblyComponent) {
			if (!operationSourcePortMap.containsKey(source)) {
				val port = source.assemblyComponent.createOperationCallPort
				createConnectionEdge(operationNodeMap.get(source), null, componentNodeMap.get(source.assemblyComponent), port)
				operationSourcePortMap.put(source, port)
			}
			
			if (!operationTargetPortMap.containsKey(target)) {
				val port = target.assemblyComponent.createOperationCallPort
				createConnectionEdge(componentNodeMap.get(target.assemblyComponent), port, operationNodeMap.get(target), null)
				operationTargetPortMap.put(target, port)
			}
			
			createConnectionEdge(componentNodeMap.get(source.assemblyComponent), operationSourcePortMap.get(source), componentNodeMap.get(target.assemblyComponent), operationTargetPortMap.get(target))
		} else {
			val sourceNode = operationNodeMap.get(source)
			val targetNode = operationNodeMap.get(target)
				
			createConnectionEdge(sourceNode, null, targetNode, null)
		}
	}
		
	private def createComponentConnection(AssemblyComponent source, AssemblyComponent target) {
		if (source !== target && !componentLinks.exists[it.first === source && it.second === target]) {
			componentLinks.add(createTuple(source, target))
			val sourceNode = componentNodeMap.get(source)
			val targetNode = componentNodeMap.get(target)
			
			createConnectionEdge(sourceNode, null, targetNode, null)
		}
	}
		
	private def createTuple(AssemblyComponent source, AssemblyComponent target) {
		val tuple = ExecutionFactory.eINSTANCE.createTuple()
		tuple.first = source
		tuple.second = target
		return tuple
	}

	private def computeContainedComponents(Collection<AssemblyComponent> components) {
		val containedComponents = new HashSet<AssemblyComponent>()
		components.filter[it.containedComponents.size() > 0].forEach [
			containedComponents.addAll(it.containedComponents)
		]
		return containedComponents
	}

	private def computeContainmentLookupMap(Collection<AssemblyComponent> components) {
		val containedToContainerMap = new HashMap<AssemblyComponent, AssemblyComponent>()
		components.filter[it.containedComponents.size() > 0].forEach [ parent |
			parent.containedComponents.forEach[containedToContainerMap.put(it, parent)]
		]
		return containedToContainerMap
	}

	def KNode createAssemblyComponent(AssemblyComponent component) {
		return component.createNode().associateWith(component) => [
			componentNodeMap.put(component, it)

			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)

			it.createSubComponents(component)

			if(SHOW_STORAGE.booleanValue) it.createStorage(component)
			if(SHOW_OPERATIONS.booleanValue) it.createOperations(component)

			it.addRectangle => [
				it.lineWidth = 2
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
				it.shadow = "black".color
				it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)

				it.addText("<<Component>>") => [
					it.fontSize = 13
					it.fontItalic = true
					it.verticalAlignment = V_CENTRAL
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 10, 0).to(RIGHT, 20, 0, BOTTOM, 1, 0.5f)
				]
				it.addText(component.componentType.signature).associateWith(component) => [
					it.fontSize = 15
					it.fontBold = true
					it.cursorSelectable = false
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
				]

				if ((SHOW_STORAGE.booleanValue && component.storages.size > 0) ||
					(SHOW_OPERATIONS.booleanValue && component.operations.size > 0) ||
					(component.containedComponents.size > 0)) {
					it.addHorizontalSeperatorLine(1, 0)
					it.addChildArea
				}
			]
		]
	}

	private def void createOperations(KNode node, AssemblyComponent component) {
		component.operations.forEach [ entry |
			val operationNode = entry.value.createNode().associateWith(entry.value) => [
				it.addEllipse => [
					it.lineWidth = 2
					it.background = "white".color
					it.foreground = "black".color
					it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)

					it.addText(entry.key) => [
						it.fontSize = 15
						it.fontBold = true
						it.cursorSelectable = false
						it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
					]
				]
			]
			operationNodeMap.put(entry.value, operationNode)
			node.children += operationNode
		]
	}

	private def void createStorage(KNode node, AssemblyComponent component) {
		component.storages.forEach [ entry |
			val storage = entry.value
			val storageNode = storage.createNode().associateWith(storage) => [
				it.addRoundedRectangle(5, 5) => [
					it.lineWidth = 2
					it.background = "white".color
					it.foreground = "black".color
					it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)

					it.addText("<<Storage>>") => [
						it.fontSize = 13
						it.fontItalic = true
						it.verticalAlignment = V_CENTRAL
						it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 10, 0).to(RIGHT, 20, 0, BOTTOM, 1, 0.5f)
					]

					it.addText(entry.key) => [
						it.fontSize = 15
						it.fontBold = true
						it.cursorSelectable = false
						it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
					]
				]
			]
			storageNodeMap.put(storage, storageNode)
			node.children += storageNode
		]
	}

	private def createOperationCallPort(AssemblyComponent component) {
		val componentNode = componentNodeMap.get(component)
		val port = KGraphUtil.createInitializedPort() => [
			it.setSize(16, 16)
			it.setProperty(CoreOptions.PORT_SIDE, PortSide.SOUTH)
			it.setProperty(CoreOptions.PORT_INDEX, componentNode.ports.size())
			it.setProperty(CoreOptions.PORT_BORDER_OFFSET, -8.0)

			it.addRectangle => [
				it.foregroundInvisible = true
				it.background = getColor("#ffffff")
				it.foreground = getColor("#000000")
			]
		]
		componentNode.ports += port
		return port
	}

	private def createSubComponents(KNode node, AssemblyComponent component) {
		component.containedComponents.forEach [
			val componentNode = it.createAssemblyComponent()
			node.children += componentNode
			componentNodeMap.put(it, componentNode)
		]
	}


	private def createConnectionEdge(KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort) {
		createEdge() => [
			it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
			it.source = sourceNode
			it.sourcePort = sourcePort
			it.target = targetNode
			it.targetPort = targetPort

			it.data
			addPolyline() => [
				it.lineWidth = 2;
				it.foreground = "gray25".color
				it.addHeadArrowDecorator
			]
		]
	}

	private def registerNodePortInterface(KNode node, EObject interfaceObject, KPort port) {
		var interfacePortMap = nodeInterfacePortMap.get(node)
		if (interfacePortMap === null) {
			interfacePortMap = new HashMap<EObject, KPort>
			nodeInterfacePortMap.put(node, interfacePortMap)
		}
		interfacePortMap.put(interfaceObject, port)
	}

	private def KPort findPort(KNode node, EObject objectInterface) {
		nodeInterfacePortMap.get(node).get(objectInterface)
	}

	private def findAssemblyComponent(AssemblyProvidedInterface providedInterface) {
		return (providedInterface.eContainer as EStringToAssemblyProvidedInterfaceMapEntryImpl).
			eContainer as AssemblyComponent
	}

}
