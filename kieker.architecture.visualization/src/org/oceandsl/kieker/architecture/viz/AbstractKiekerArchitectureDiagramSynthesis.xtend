package org.oceandsl.kieker.architecture.viz

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
import analysismodel.execution.EDirection
import org.eclipse.elk.core.options.PortLabelPlacement
import java.util.EnumSet

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
	
	protected static val SynthesisOption ALGORITHM = SynthesisOption::createChoiceOption("Used Layout Algorithm", ImmutableList::of(
		DiagramLayoutOptions.ELK_LAYERED,
		DiagramLayoutOptions.GRAPHVIZ_CIRCO,
		DiagramLayoutOptions.GRAPHVIZ_DOT,
		"org.eclipse.elk.graphviz.fdp",
		"org.eclipse.elk.graphviz.neato",
		"org.eclipse.elk.graphviz.twopi"
	), DiagramLayoutOptions.ELK_LAYERED)

	protected static val SynthesisOption SHOW_PORT_LABELS = SynthesisOption::createCheckOption("Show port labels", false);

	protected static val SynthesisOption SHOW_OPERATIONS = SynthesisOption::createCheckOption("Show operations", false);

	protected static val SynthesisOption SHOW_STORAGE = SynthesisOption::createCheckOption("Show storage", false);
	
	
	/**
	 * {@inheritDoc}<br>
	 * <br>
	 * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
	 */
	override getDisplayedSynthesisOptions() {
		return ImmutableList::of(ALGORITHM, SHOW_PORT_LABELS, SHOW_OPERATIONS, SHOW_STORAGE)
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
	
	protected def KPort createPort(PortSide portSide, EObject object, int index, String backgroundColor) {
		return KGraphUtil.createInitializedPort().associateWith(object) => [
			it.setSize(16, 16)
			it.setProperty(CoreOptions.PORT_SIDE, portSide)
			it.setProperty(CoreOptions.PORT_INDEX, index)
			it.setProperty(CoreOptions.PORT_BORDER_OFFSET, -8.0)

			it.addRectangle => [
				it.foregroundInvisible = true
				it.background = backgroundColor.color
				it.foreground = "#000000".color
			]
		]
	}
	
	protected def KPort createOperationPort(PortSide portSide, EObject object, int index, String backgroundColor) {
		return KGraphUtil.createInitializedPort().associateWith(object) => [
			it.setSize(16, 16)
			it.setProperty(CoreOptions.PORT_SIDE, portSide)
			it.setProperty(CoreOptions.PORT_INDEX, index)
			it.setProperty(CoreOptions.PORT_BORDER_OFFSET, -8.0)

			it.addEllipse => [
				it.foregroundInvisible = true
				it.background = backgroundColor.color
				it.foreground = "#000000".color
			]
		]
	}
	
		
	protected def createConnectionEdge(NodePort source, NodePort target, String color) {
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
				it.foreground = "gray25".color
				if (direction === EDirection.WRITE || direction === EDirection.BOTH) it.addHeadArrowDecorator
				if (direction === EDirection.READ || direction === EDirection.BOTH) it.addTailArrowDecorator
			]
		]
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