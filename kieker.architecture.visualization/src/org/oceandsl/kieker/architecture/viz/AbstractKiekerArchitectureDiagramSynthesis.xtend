package org.oceandsl.kieker.architecture.viz

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions

abstract class AbstractKiekerArchitectureDiagramSynthesis<T> extends AbstractDiagramSynthesis<T> {
	
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
}