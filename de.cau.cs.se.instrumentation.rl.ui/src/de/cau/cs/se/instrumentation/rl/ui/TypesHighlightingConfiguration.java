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

	/** Bogous type id. */
	public static final String TYPE_ID = "type";
	/** tag id. */
	public static final String TAG_ID = "tag";

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
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tag", this.tagTextStyle());
	}

	/**
	 * Define text style for types.
	 * 
	 * @return the text style
	 */
	public TextStyle typeTextStyle() {
		final TextStyle textStyle = this.defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 42, 42));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	/**
	 * Define text style for types.
	 * 
	 * @return the text style
	 */
	public TextStyle tagTextStyle() {
		final TextStyle textStyle = this.defaultTextStyle().copy();
		textStyle.setColor(new RGB(129, 129, 199));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
