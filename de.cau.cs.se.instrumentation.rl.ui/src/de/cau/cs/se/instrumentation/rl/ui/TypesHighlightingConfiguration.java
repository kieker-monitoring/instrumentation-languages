/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author Reiner Jung
 * 
 */
public class TypesHighlightingConfiguration extends DefaultHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String TYPE_ID = "type";

	/**
	 * 
	 */
	public TypesHighlightingConfiguration() {
		super();
	}

	@Override
	public void configure(final IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(TYPE_ID, "Type", this.typeTextStyle());
	}

	public TextStyle typeTextStyle() {
		final TextStyle textStyle = this.defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 42, 42));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
