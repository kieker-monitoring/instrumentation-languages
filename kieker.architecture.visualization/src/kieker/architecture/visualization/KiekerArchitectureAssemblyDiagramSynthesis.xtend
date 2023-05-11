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

import kieker.model.analysismodel.assembly.AssemblyComponent
import kieker.model.analysismodel.assembly.AssemblyModel
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import kieker.model.analysismodel.assembly.impl.EStringToAssemblyProvidedInterfaceMapEntryImpl
import kieker.model.analysismodel.source.SourceModel

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import javax.inject.Inject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.klighd.util.KlighdProperties

/** 
 * @author Reiner Jung
 * @since 1.3.0
 */
class KiekerArchitectureAssemblyDiagramSynthesis extends AbstractKiekerArchitectureDiagramSynthesis<AssemblyModel> {

	@Inject
	extension KNodeExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KColorExtensions

	Map<AssemblyComponent, KNode> componentNodeMap

	Set<AssemblyComponent> containedComponents

	Map<AssemblyComponent, AssemblyComponent> containmentLookupMap

	Map<AssemblyProvidedInterface, List<AssemblyRequiredInterface>> providedToRequiredInterfaceMap

	List<PortConnection<AssemblyProvidedInterface>> internalProvidedLinks
	List<PortConnection<AssemblyRequiredInterface>> internalRequiredLinks

	Map<KNode, Map<EObject, KPort>> nodeInterfacePortMap



	override KNode transform(AssemblyModel model) {
		loadColorModel(model)
<<<<<<< HEAD

=======
		
		this.sourceModel = loadModel("source-model.xmi", model) as SourceModel
		
		
>>>>>>> 861725dc (Improved coloring features.)
		val components = model.components.values
		
		internalProvidedLinks = new ArrayList<PortConnection<AssemblyProvidedInterface>>
		internalRequiredLinks = new ArrayList<PortConnection<AssemblyRequiredInterface>>
		nodeInterfacePortMap = new HashMap<KNode, Map<EObject, KPort>>

		componentNodeMap = new HashMap<AssemblyComponent, KNode>
		containedComponents = computeContainedComponents(components)
		containmentLookupMap = computeContainmentLookupMap(components)
		providedToRequiredInterfaceMap = computeProvidedToRequiredInterfaceMap(components)

		return createNode() => [
			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)

			createAssemblyComponents(it, components, true)
		]
	}

	def createAssemblyComponents(KNode node, Collection<AssemblyComponent> components, boolean odd) {
		components.filter[!containedComponents.contains(it)].forEach [ component |
			val componentNode = component.createAssemblyComponent(odd)
			node.children += componentNode
		]

		internalProvidedLinks.forEach[it.createInternalProvidedConnection]
		internalRequiredLinks.forEach[it.createInternalRequiredConnection]

		components.forEach[connectAssemblyComponent(it)]

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

	private def computeProvidedToRequiredInterfaceMap(Collection<AssemblyComponent> components) {
		val providedToRequiredInterfaceMap = new HashMap<AssemblyProvidedInterface, List<AssemblyRequiredInterface>>
		components.forEach [ component |
			component.requiredInterfaces.forEach [ requiredInteface |
				var list = providedToRequiredInterfaceMap.get(requiredInteface.requires)
				if (list === null) {
					list = new ArrayList<AssemblyRequiredInterface>
				}
				list.add(requiredInteface)
				providedToRequiredInterfaceMap.put(requiredInteface.requires, list)
			]
		]
		return providedToRequiredInterfaceMap
	}

	def KNode createAssemblyComponent(AssemblyComponent component, boolean odd) {
		return component.createNode().associateWith(component) => [
			componentNodeMap.put(component, it)

			it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
			it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
			it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)

			it.addRectangle => [
				it.lineWidth = 2
				it.background = lookupComponentColor(component, odd).color
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
					setProperty(KlighdProperties.IS_NODE_TITLE, true)
				]

				if ((SHOW_STORAGE.booleanValue && component.storages.size > 0) ||
					(SHOW_OPERATIONS.booleanValue && component.operations.size > 0) ||
					(component.containedComponents.size > 0)) {
					it.addHorizontalSeperatorLine(1, 0)
					it.addChildArea
				}
			]
			
			it.createSubComponents(component, !odd)

			if(SHOW_STORAGE.booleanValue) it.createComponentStorages(component, odd)
			if(SHOW_OPERATIONS.booleanValue) it.createComponentOperations(component, odd)

			component.createPortsForInterfaces

			component.containedComponents.createTransitPorts(component, it)
			
		]
	}

	private def void createComponentOperations(KNode node, AssemblyComponent component, boolean odd) {
		component.operations.forEach [ entry |
			node.children += entry.value.createOperation(entry.key, lookupOperationColor(entry.value, odd))
		]
	}

	private def void createComponentStorages(KNode node, AssemblyComponent component, boolean odd) {
		component.storages.forEach [ entry |
			val storage = entry.value
			node.children += storage.createStorage(entry.key, lookupStorageColor(storage, odd))
		]
	}

	private def createTransitPorts(EList<AssemblyComponent> components, AssemblyComponent parent, KNode parentNode) {
		val usedProvidedInterfaces = new HashSet<AssemblyProvidedInterface>
		components.forEach [ child |
			// create transit required interfaces
			child.requiredInterfaces.forEach [ requiredInterface |
				val providingComponent = requiredInterface.requires.findAssemblyComponent
				if (containmentLookupMap.get(providingComponent) !== parent) { // inter module interface
					if (!usedProvidedInterfaces.contains(requiredInterface.requires)) { // only add if it has not been added before
						usedProvidedInterfaces.add(requiredInterface.requires)
						val transitPort = createRequiredPort(PortSide.EAST, requiredInterface, parentNode.ports.size())
						registerNodePortInterface(parentNode, requiredInterface.requires, transitPort)
						parentNode.ports += transitPort
						internalRequiredLinks.add(
							new PortConnection<AssemblyRequiredInterface>(child, requiredInterface, parentNode,
								transitPort))
					} else {
						val transitPort = parentNode.findPort(requiredInterface.requires)
						internalRequiredLinks.add(
							new PortConnection<AssemblyRequiredInterface>(child, requiredInterface, parentNode,
								transitPort))
					}
				}
			]
			// Create transit provided interfaces
			child.providedInterfaces.values.forEach [ providedInterface |
				val requiredInterfaces = providedToRequiredInterfaceMap.get(providedInterface)
				if (requiredInterfaces !== null) {
					if (requiredInterfaces.exists [
						containmentLookupMap.get(it.eContainer as AssemblyComponent) !== parent
					]) {
						val transitPort = createProvidedPort(PortSide.WEST, providedInterface, parentNode.ports.size())
						registerNodePortInterface(parentNode, providedInterface, transitPort)
						internalProvidedLinks.add(
							new PortConnection<AssemblyProvidedInterface>(child, providedInterface, parentNode,
								transitPort))
						parentNode.ports += transitPort
					}
				}
			]
		]
	}

	private def createInternalProvidedConnection(PortConnection<AssemblyProvidedInterface> portConnection) {
		val originNode = componentNodeMap.get(portConnection.originComponent)
		val originPort = originNode.findPort(portConnection.originInterface)
		createConnectionEdge(portConnection.transitNode, portConnection.transitPort, originNode, originPort, "gray25")
	}

	private def createInternalRequiredConnection(PortConnection<AssemblyRequiredInterface> portConnection) {
		val originNode = componentNodeMap.get(portConnection.originComponent)
		val originPort = originNode.findPort(portConnection.originInterface)
		createConnectionEdge(originNode, originPort, portConnection.transitNode, portConnection.transitPort, "gray25")
	}

	private def createSubComponents(KNode node, AssemblyComponent component, boolean odd) {
		component.containedComponents.forEach [
			val componentNode = it.createAssemblyComponent(odd)
			node.children += componentNode
			componentNodeMap.put(it, componentNode)
		]
	}

	private def KPort createProvidedPort(PortSide portSide, AssemblyProvidedInterface providedInterface, int index) {
		val port = createInterfacePort(portSide, providedInterface, index, "#000000", "#ffffff")

		if (SHOW_PORT_LABELS.booleanValue) {
			val label = KGraphUtil.createInitializedLabel(port)
			label.text = providedInterface.providedInterfaceType.signature
			label.setProperty(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.outside)
		}

		return port
	}

	private def KPort createRequiredPort(PortSide portSide, AssemblyRequiredInterface requiredInterface, int index) {
		val port = createInterfacePort(portSide, requiredInterface, index, "#000000", "#a0a0a0")

		return port
	}

	private def createPortsForInterfaces(AssemblyComponent component) {
		component.providedInterfaces.values.forEach [ providedInterface |
			val providedNode = componentNodeMap.get(component)
			val port = createProvidedPort(PortSide.SOUTH, providedInterface, providedNode.ports.size)
			registerNodePortInterface(providedNode, providedInterface, port)
			providedNode.ports += port
		]

		component.requiredInterfaces.forEach [ requiredInterface |
			val requiredNode = componentNodeMap.get(component)
			val port = createRequiredPort(PortSide.NORTH, requiredInterface, requiredNode.ports.size)
			registerNodePortInterface(requiredNode, requiredInterface, port)
			requiredNode.ports += port
		]
	}

	def connectAssemblyComponent(AssemblyComponent requiredComponent) {
		requiredComponent.requiredInterfaces.forEach [ requiredInterface |
			val providedInterface = requiredInterface.requires
			val providedComponent = providedInterface.findAssemblyComponent

			val providedParent = containmentLookupMap.get(providedComponent)
			val requiredParent = containmentLookupMap.get(requiredComponent)

			if (providedParent === null && requiredParent === null) {
				val sourceNode = componentNodeMap.get(requiredComponent)
				val sourcePort = sourceNode.findPort(requiredInterface)
				val targetNode = componentNodeMap.get(providedComponent)
				val targetPort = targetNode.findPort(providedInterface)
				createConnectionEdge(sourceNode, sourcePort, targetNode, targetPort, "gray25")
			} else if (providedParent === null && requiredParent !== null) {
				val sourceNode = componentNodeMap.get(requiredParent)
				val sourcePort = sourceNode.findPort(requiredInterface.requires)
				val targetNode = componentNodeMap.get(providedComponent)
				val targetPort = targetNode.findPort(providedInterface)
				createConnectionEdge(sourceNode, sourcePort, targetNode, targetPort, "gray25")
			} else if (providedParent !== null && requiredParent === null) {
				val sourceNode = componentNodeMap.get(requiredComponent)
				val sourcePort = sourceNode.findPort(requiredInterface)
				val targetNode = componentNodeMap.get(providedParent)
				val targetPort = targetNode.findPort(providedInterface)
				createConnectionEdge(sourceNode, sourcePort, targetNode, targetPort, "gray25")
			} else if (providedParent === requiredParent) {
				val sourceNode = componentNodeMap.get(requiredComponent)
				val sourcePort = sourceNode.findPort(requiredInterface)
				val targetNode = componentNodeMap.get(providedComponent)
				val targetPort = targetNode.findPort(providedInterface)
				createConnectionEdge(sourceNode, sourcePort, targetNode, targetPort, "gray25")
			} else {
				val sourceNode = componentNodeMap.get(requiredParent)
				val sourcePort = sourceNode.findPort(requiredInterface.requires)
				val targetNode = componentNodeMap.get(providedParent)
				val targetPort = targetNode.findPort(providedInterface)
				createConnectionEdge(sourceNode, sourcePort, targetNode, targetPort, "gray25")
			}
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
