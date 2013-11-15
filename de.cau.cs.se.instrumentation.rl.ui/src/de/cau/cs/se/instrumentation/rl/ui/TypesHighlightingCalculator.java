/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ui;

import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;

/**
 * @author Reiner Jung
 * 
 */
public class TypesHighlightingCalculator implements ISemanticHighlightingCalculator {

	/**
	 * 
	 */
	public TypesHighlightingCalculator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
		if ((resource == null) || (resource.getParseResult() == null)) {
			return;
		}

		final INode root = resource.getParseResult().getRootNode();
		final BidiTreeIterator<INode> iterator = root.getAsTreeIterable().iterator();
		while (iterator.hasNext()) {
			final INode node = iterator.next();
			if (node.getSemanticElement() instanceof Classifier) {
				this.highlightNode(node, TypesHighlightingConfiguration.TYPE_ID, acceptor);
			}
		}
	}

	/**
	 * 
	 * @param node
	 * @param id
	 * @param acceptor
	 */
	private void highlightNode(final INode node, final String id, final IHighlightedPositionAcceptor acceptor) {
		if (node == null) {
			return;
		}
		if (node instanceof ILeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (final ILeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

}
