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
package kieker.develop.rl.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.custom.BusyIndicator;

import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.preferences.TargetsPreferences;

/**
 * superclass for FieldEditorPreferencePage; can be used for preference pages and property pages.
 *
 * Created after https://www.eclipse.org/articles/Article-Mutatis-mutandis/overlay-pages.html
 *
 * @author Yannic Kropp
 *
 */
public abstract class AbstractFieldEditorOverlayPage extends FieldEditorPreferencePage {

	/**
	 * Constructor.
	 *
	 * @param style
	 *            - layout style
	 */
	public AbstractFieldEditorOverlayPage(final int style) {
		super(style);
	}

	/**
	 * Constructor.
	 *
	 * @param title
	 *            - title string
	 * @param style
	 *            some style setup
	 */
	public AbstractFieldEditorOverlayPage(final String title, final int style) {
		super(title, style);
	}

	/**
	 * Constructor.
	 *
	 * @param title
	 *            - title string
	 * @param image
	 *            - title image
	 * @param style
	 *            - layout style
	 */
	public AbstractFieldEditorOverlayPage(final String title, final ImageDescriptor image, final int style) {
		super(title, image, style);
	}

	/**
	 * Show a single preference pages.
	 *
	 * @param id
	 *            - the preference page identification
	 * @param page
	 *            - the preference page
	 */
	protected void showPreferencePage(final String id, final IPreferencePage page) {
		final IPreferenceNode targetNode = new PreferenceNode(id, page);
		final PreferenceManager manager = new PreferenceManager();
		manager.addToRoot(targetNode);
		final PreferenceDialog dialog = new PreferenceDialog(this.getControl().getShell(), manager);
		BusyIndicator.showWhile(this.getControl().getDisplay(), new Runnable() {
			@Override
			public void run() {
				dialog.create();
				dialog.setMessage(targetNode.getLabelText());
				dialog.open();
			}
		});
	}

	@Override
	protected void createFieldEditors() {
		for (final AbstractOutletConfiguration outletConfiguration : GeneratorRegistration.getOutletConfigurations()) {
			this.addField(new BooleanFieldEditor(TargetsPreferences.GENERATOR_ACTIVE + outletConfiguration.getName(),
					outletConfiguration.getDescription() + " generator", this.getFieldEditorParent()));
			final FieldEditor commentFieldEditor = new CommentFieldEditor(
					TargetsPreferences.GENERATOR_HEADER_COMMENT + outletConfiguration.getName(), "Header",
					this.getFieldEditorParent());
			this.addField(commentFieldEditor);
		}

		// SpacerFieldEditor spacer = new SpacerFieldEditor(getFieldEditorParent());
		// addField(spacer);

		this.addField(new StringFieldEditor(TargetsPreferences.AUTHOR_NAME, "Author", this.getFieldEditorParent()));
		this.addField(new StringFieldEditor(TargetsPreferences.VERSION_ID, "Version", this.getFieldEditorParent()));
	}

}
