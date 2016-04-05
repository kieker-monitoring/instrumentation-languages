/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
package kieker.tools.rl.ui;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import kieker.tools.rl.recordLang.Classifier;

/**
 * @author Reiner Jung
 * 
 */
public class TypesHighlightingCalculator implements ISemanticHighlightingCalculator {

	private static final String AUTHOR_TAG = "@author";
	private static final String SINCE_TAG = "@since";

	/**
	 * 
	 */
	public TypesHighlightingCalculator() {
		// empty constructor
	}

	/**
	 * Choose nodes for highlighting.
	 * 
	 * @param resource the Xtext resource model
	 * @param acceptor an expression function determining what to highlight
	 */
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
			// set special colors for tags
			if (node.getGrammarElement() instanceof Keyword) {
				final Keyword keyword = (Keyword) node.getGrammarElement();
				if (AUTHOR_TAG.equals(keyword.getValue())
						|| SINCE_TAG.equals(keyword.getValue())) {
					this.highlightNode(node, TypesHighlightingConfiguration.TAG_ID, acceptor);
				}


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
