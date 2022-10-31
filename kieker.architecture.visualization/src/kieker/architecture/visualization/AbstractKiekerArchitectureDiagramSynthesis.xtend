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

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import org.eclipse.emf.ecore.EObject
import javax.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.kgraph.KPort
import org.eclipse.elk.core.options.PortSide
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.klighd.kgraph.KNode
import org.eclipse.elk.core.options.EdgeType
import kieker.model.analysismodel.execution.EDirection
import org.eclipse.elk.core.options.PortLabelPlacement
import java.util.EnumSet
import kieker.architecture.visualization.display.model.EPortType
import de.cau.cs.kieler.klighd.kgraph.KEdge
import org.eclipse.elk.core.options.EdgeLabelPlacement
import java.util.Map
import kieker.model.analysismodel.execution.Invocation
import kieker.model.analysismodel.statistics.StatisticsModel
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.model.analysismodel.execution.StorageDataflow

/**
 * @author Reiner Jung
 * @since 1.3.0
 */
abstract class AbstractKiekerArchitectureDiagramSynthesis<T> extends AbstractDiagramSynthesis<T> {
	
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
	
	protected static val DATAFLOW_BG_PROVIDE_COLOR = "#ffffff"
	protected static val DATAFLOW_BG_REQUIRE_COLOR = "#9090ff"
	protected static val DATAFLOW_FG_COLOR = "#0000f0"
	
	protected static val CALL_BG_PROVIDE_COLOR = "#ffffff"
	protected static val CALL_BG_REQUIRE_COLOR = "gray25"
	protected static val CALL_FG_COLOR = "#000000"

	
	protected static val SynthesisOption ALGORITHM = SynthesisOption::createChoiceOption("Used Layout Algorithm", ImmutableList::of(
		DiagramLayoutOptions.ELK_LAYERED,
		DiagramLayoutOptions.GRAPHVIZ_CIRCO,
		DiagramLayoutOptions.GRAPHVIZ_DOT,
		"org.eclipse.elk.graphviz.fdp",
		"org.eclipse.elk.graphviz.neato",
		"org.eclipse.elk.graphviz.twopi"
	), DiagramLayoutOptions.ELK_LAYERED)

	protected static val SynthesisOption SHOW_EDGE_LABELS = SynthesisOption::createCheckOption("Show edge labels", false);
	
	protected static val SynthesisOption SHOW_PORT_LABELS = SynthesisOption::createCheckOption("Show port labels", false);

	protected static val SynthesisOption SHOW_OPERATIONS = SynthesisOption::createCheckOption("Show operations", false);

	protected static val SynthesisOption SHOW_STORAGE = SynthesisOption::createCheckOption("Show storage", false);
	
	protected Map<Object, NodePort> object2NodePortMap
					
	/**
	 * {@inheritDoc}<br>
	 * <br>
	 * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
	 */
	override getDisplayedSynthesisOptions() {
		return ImmutableList::of(ALGORITHM, SHOW_EDGE_LABELS, SHOW_PORT_LABELS, SHOW_OPERATIONS, SHOW_STORAGE)
	}
		
	protected def createOperation(EObject object, String label) {
		object.createNode().associateWith(object) => [
			it.addEllipse => [
				it.lineWidth = 2
				it.background = "white".color
				it.foreground = "black".color
				it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)

				it.addText(label) => [
					it.fontSize = 15
					it.fontBold = true
					it.cursorSelectable = false
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
				]
			]
		]
	}
	
	protected def createStorage(EObject storage, String label) {
		createNode().associateWith(storage) => [
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

				it.addText(label) => [
					it.fontSize = 15
					it.fontBold = true
					it.cursorSelectable = false
					it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0)
				]
			]
		]
	}
	
	protected def KPort createInterfaceProvidedPort(PortSide portSide, EObject object, int index, EPortType portType) {
		val foregroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_FG_COLOR else DATAFLOW_FG_COLOR
		val backgroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_BG_PROVIDE_COLOR else DATAFLOW_BG_PROVIDE_COLOR
		createInterfacePort(portSide, object, index, foregroundColor, backgroundColor)
	}

	protected def KPort createInterfaceRequiredPort(PortSide portSide, EObject object, int index, EPortType portType) {
		val foregroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_FG_COLOR else DATAFLOW_FG_COLOR
		val backgroundColor = if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_BG_REQUIRE_COLOR else DATAFLOW_BG_REQUIRE_COLOR
		createInterfacePort(portSide, object, index, foregroundColor, backgroundColor)
	}
	
	protected def KPort createInterfacePort(PortSide portSide, EObject object, int index, String foregroundColor, String backgroundColor) {
		return KGraphUtil.createInitializedPort().associateWith(object) => [
			it.setSize(16, 16)
			it.setProperty(CoreOptions.PORT_SIDE, portSide)
			it.setProperty(CoreOptions.PORT_INDEX, index)
			it.setProperty(CoreOptions.PORT_BORDER_OFFSET, -8.0)

			it.addRectangle => [
				it.foregroundInvisible = true
				it.background = backgroundColor.color
				it.foreground = foregroundColor.color
			]
		]
	}

	protected def KPort createOperationProvidedPort(PortSide portSide, EObject object, int index, EPortType portType, String color) {
		val foregroundColor = portType.foregroundColorForPortType
		val backgroundColor = color // portType.backgroundProvidedColorForPortType
		createOperationPort(portSide, object, index, foregroundColor, backgroundColor)
	}

	protected def KPort createOperationRequiredPort(PortSide portSide, EObject object, int index, EPortType portType) {
		val foregroundColor = portType.foregroundColorForPortType
		val backgroundColor = portType.backgroundRequiredColorForPortType
		createOperationPort(portSide, object, index, foregroundColor, backgroundColor)
	}
	
	protected def getForegroundColorForPortType(EPortType portType) {
		if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_FG_COLOR else DATAFLOW_FG_COLOR
	}

	protected def getBackgroundRequiredColorForPortType(EPortType portType) {
		if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_BG_REQUIRE_COLOR else DATAFLOW_BG_REQUIRE_COLOR
	}

	protected def getBackgroundProvidedColorForPortType(EPortType portType) {
		if (#[EPortType.INTERFACE_CALL, EPortType.OPERATION_CALL].contains(portType)) CALL_BG_PROVIDE_COLOR else DATAFLOW_BG_PROVIDE_COLOR
	}
	
	protected def KPort createOperationPort(PortSide portSide, EObject object, int index, String foregroundColor, String backgroundColor) {
		return KGraphUtil.createInitializedPort().associateWith(object) => [
			it.setSize(16, 16)
			it.setProperty(CoreOptions.PORT_SIDE, portSide)
			it.setProperty(CoreOptions.PORT_INDEX, index)
			it.setProperty(CoreOptions.PORT_BORDER_OFFSET, -8.0)

			it.addEllipse => [
				it.foregroundInvisible = true
				it.background = backgroundColor.color
				it.foreground = foregroundColor.color
			]
		]
	}
	
	protected def createConnection(Object source, Object target, String color) {
		if (source !== null && target !== null) {
			val caller = object2NodePortMap.get(source)
			val callee = object2NodePortMap.get(target)
			createConnectionEdge(caller, callee, color)
		}
	}
	
	protected def createControlFlowLabel(StatisticsModel statisticsModel, Invocation invocation) {
		val statisticRecord = statisticsModel.statistics.get(invocation)
		statisticRecord.properties.entrySet.map[entry |
			'''«entry.key» : «entry.value»'''	
		].join("\n")
	}
	
	protected def createOperationDataFlowLabel(StatisticsModel statisticsModel, OperationDataflow dataflow) {
		val statisticRecord = statisticsModel.statistics.get(dataflow)
		statisticRecord.properties.entrySet.map[entry |
			'''«entry.key» : «entry.value»'''	
		].join("\n")
	}

	protected def createStorageDataFlowLabel(StatisticsModel statisticsModel, StorageDataflow dataflow) {
		val statisticRecord = statisticsModel.statistics.get(dataflow)
		statisticRecord.properties.entrySet.map[entry |
			'''«entry.key» : «entry.value»'''	
		].join("\n")
	}
		
	protected def createConnection(Object source, Object target, String color, String label) {
		if (source !== null && target !== null) {
			val caller = object2NodePortMap.get(source)
			val callee = object2NodePortMap.get(target)
			createConnectionEdge(caller, callee, color).addLabel(label)
		}
	}
	
	protected def createConnectionEdge(NodePort source, NodePort target, String color) {
//		System.err.println("SOURCE " + source + "  TARGET " + target + "  COLOR " + color)
//		if (source !== null)
//			System.err.println("source node " + source.node)
//		else
//			System.err.println("Source node broken")
//		if (target !== null)
//			System.err.println("target node " + target.node)
//		else
//			System.err.println("Target node broken")
		createConnectionEdge(source.node, source.port, target.node, target.port, color)
	}
	
	protected def createConnectionEdge(KNode sourceNode, KPort sourcePort, KNode targetNode, KPort targetPort, String color) {
		createEdge() => [
			it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
			it.source = sourceNode
			if (sourcePort !== null) it.sourcePort = sourcePort
			it.target = targetNode
			if (targetPort !== null) it.targetPort = targetPort

			it.addPolyline() => [
				it.lineWidth = 2
				it.foreground = color.color
				it.addHeadArrowDecorator
			]
		]
	}
	
	protected def createOperationStorageAccess(KNode operationNode, KNode storageNode, EDirection direction) {
		createEdge() => [
			it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
			it.source = operationNode
			it.target = storageNode

			it.addPolyline() => [
				it.lineWidth = 2
				it.foreground = DATAFLOW_FG_COLOR.color
				if (direction === EDirection.WRITE || direction === EDirection.BOTH) it.addHeadArrowDecorator
				if (direction === EDirection.READ || direction === EDirection.BOTH) it.addTailArrowDecorator
			]
		]
	}
	
	protected def createOperationDataflowAccess(KNode sourceNode, KNode targetNode, EDirection direction) {
		createEdge() => [
			it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
			it.source = sourceNode
			it.target = targetNode

			it.addPolyline() => [
				it.lineWidth = 2
				it.foreground = DATAFLOW_FG_COLOR.color
				if (direction === EDirection.WRITE || direction === EDirection.BOTH) it.addHeadArrowDecorator
				if (direction === EDirection.READ || direction === EDirection.BOTH) it.addTailArrowDecorator
			]
		]
	}

	protected def KEdge addLabel(KEdge edge, String text) {
		if (SHOW_EDGE_LABELS.booleanValue) {
			val label = KGraphUtil.createInitializedLabel(edge)
			label.text = text
			label.setProperty(CoreOptions.EDGE_LABELS_PLACEMENT, EdgeLabelPlacement.CENTER)
		}
		return edge
	}
	
	protected def KPort addLabel(KPort port, String text) {
		if (SHOW_PORT_LABELS.booleanValue) {
			val label = KGraphUtil.createInitializedLabel(port)
			label.text = text
			label.setProperty(CoreOptions.PORT_LABELS_PLACEMENT, EnumSet.of(PortLabelPlacement.OUTSIDE, PortLabelPlacement.NEXT_TO_PORT_IF_POSSIBLE))
		}
		return port
	}
}
