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

import java.lang.reflect.InvocationTargetException;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.ST;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.GeneratorConfiguration;
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
	 * @param style - layout style
	 */
	public AbstractFieldEditorOverlayPage(final int style) {
		super(style);
	}

	/**
	 * Constructor.
	 * @param title - title string
	 * @param style some style setup
	 */
	public AbstractFieldEditorOverlayPage(final String title, final int style) {
		super(title, style);
	}

	/**
	 * Constructor.
	 * @param title - title string
	 * @param image - title image
	 * @param style - layout style
	 */
	public AbstractFieldEditorOverlayPage(final String title, final ImageDescriptor image, final int style) {
		super(title, image, style);
	}

	/**
	 * Show a single preference pages.
	 * @param id - the preference page identification
	 * @param page - the preference page
	 */
	protected void showPreferencePage(final String id, final IPreferencePage page) {
		final IPreferenceNode targetNode = new PreferenceNode(id, page);
		final PreferenceManager manager = new PreferenceManager();
		manager.addToRoot(targetNode);
		final PreferenceDialog dialog =
				new PreferenceDialog(this.getControl().getShell(), manager);
		BusyIndicator.showWhile(this.getControl().getDisplay(), new Runnable() {
			public void run() {
				dialog.create();
				dialog.setMessage(targetNode.getLabelText());
				dialog.open();
			}
		});
	}

	@Override
	protected void createFieldEditors() {
		for (final Class<?> generatorClass : GeneratorConfiguration.getRecordTypeGenerators()) {
			try {
				final AbstractRecordTypeGenerator generator = (AbstractRecordTypeGenerator) generatorClass.getConstructor().newInstance();

				this.addField(new BooleanFieldEditor(TargetsPreferences.GENERATOR_ACTIVE + generator.getId(),
						generator.getDescription(), this.getFieldEditorParent()));
				final FieldEditor commentFieldEditor = new FieldEditor(TargetsPreferences.GENERATOR_HEADER_COMMENT + generator.getId(),
						"Header", this.getFieldEditorParent()) {

					Composite top;
					StyledText comment;

					@Override
					protected void adjustForNumColumns(final int numColumns) {
						((GridData)this.top.getLayoutData()).horizontalSpan = numColumns;
					}

					@Override
					protected void doFillIntoGrid(final Composite parent, final int numColumns) {
						this.top = parent;

						final GridData gd = new GridData(GridData.FILL_HORIZONTAL);
						gd.horizontalSpan = numColumns;
						this.top.setLayoutData(gd);

						final Label label = this.getLabelControl(this.top);
						final GridData labelData = new GridData();
						labelData.horizontalSpan = numColumns;
						label.setLayoutData(labelData);

						this.comment = new StyledText(this.top, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
						final GridData layoutData = new GridData(GridData.FILL_BOTH);
						layoutData.heightHint = this.convertVerticalDLUsToPixels(parent, 50);
						this.comment.setLayoutData(layoutData);

						this.comment.addLineStyleListener(new LineStyleListener() {
							@Override
							public void lineGetStyle(final LineStyleEvent event) {
								// Using ST.BULLET_NUMBER sometimes results in weird alignment.
								//event.bulletIndex = styledText.getLineAtOffset(event.lineOffset);
								final StyleRange styleRange = new StyleRange();
								styleRange.foreground = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
								final int maxLine = comment.getLineCount();
								final int bulletLength = Integer.toString(maxLine).length();
								// Width of number character is half the height in monospaced font, add 1 character width for right padding.
								final int bulletWidth = ((bulletLength + 1) * comment.getLineHeight()) / 2;
								styleRange.metrics = new GlyphMetrics(0, 0, bulletWidth);
								event.bullet = new Bullet(ST.BULLET_TEXT, styleRange);
								// getLineAtOffset() returns a zero-based line index.
								final int bulletLine = comment.getLineAtOffset(event.lineOffset) + 1;
								event.bullet.text = String.format("%" + bulletLength + "s", bulletLine);
							}
						});
						this.comment.addModifyListener(new ModifyListener() {
							@Override
							public void modifyText(final ModifyEvent e) {
								// For line number redrawing.
								comment.redraw();
							}
						});
					}

					@Override
					protected void doLoad() {
						final String comment = this.getPreferenceStore().getString(this.getPreferenceName());
						if (comment != null) {
							this.comment.setText(comment);
						}
					}

					@Override
					protected void doLoadDefault() {
						final String comment = this.getPreferenceStore().getDefaultString(this.getPreferenceName());
						if (comment != null) {
							this.comment.setText(comment);
						}
					}

					@Override
					protected void doStore() {
						this.getPreferenceStore().setValue(this.getPreferenceName(), this.comment.getText());
					}

					@Override
					public int getNumberOfControls() {
						return 1;
					}

				};
				this.addField(commentFieldEditor);
			} catch (final IllegalArgumentException e) {
				e.printStackTrace();
			} catch (final SecurityException e) {
				e.printStackTrace();
			} catch (final InstantiationException e) {
				e.printStackTrace();
			} catch (final IllegalAccessException e) {
				e.printStackTrace();
			} catch (final InvocationTargetException e) {
				e.printStackTrace();
			} catch (final NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		// SpacerFieldEditor spacer = new SpacerFieldEditor(getFieldEditorParent());
		// addField(spacer);

		this.addField(new StringFieldEditor(TargetsPreferences.AUTHOR_NAME, "Author", this.getFieldEditorParent()));
		this.addField(new StringFieldEditor(TargetsPreferences.VERSION_ID, "Version", this.getFieldEditorParent()));
	}

}
