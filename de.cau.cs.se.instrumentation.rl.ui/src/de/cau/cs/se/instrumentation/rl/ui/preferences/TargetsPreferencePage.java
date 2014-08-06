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
package de.cau.cs.se.instrumentation.rl.ui.preferences;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import de.cau.cs.se.instrumentation.rl.generator.LanguageSetup;
import de.cau.cs.se.instrumentation.rl.preferences.TargetsPreferences;
import de.cau.cs.se.instrumentation.rl.ui.internal.RecordLangActivator;


/**
 * @author Reiner Jung
 * 
 */
public class TargetsPreferencePage extends org.eclipse.jface.preference.PreferencePage
implements org.eclipse.ui.IWorkbenchPreferencePage, org.eclipse.ui.IWorkbenchPropertyPage {

	private static final String WIDGET_DATA_PROPERTY_ID = "name";

	private IAdaptable adaptable;
	private Group langGroup;
	private Group miscGroup;

	/**
	 * Default constructor.
	 */
	public TargetsPreferencePage() {
		super();
		this.setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, TargetsPreferences.NODE_ID));
		System.out.println("Preference store (page) " + this.getPreferenceStore());
	}

	public IAdaptable getElement() {
		return this.adaptable;
	}

	public void setElement(final IAdaptable element) {
		this.adaptable = element;
	}

	/**
	 * Initializes the preference page of the given workbench.
	 * 
	 * @param workbench the workbench
	 */
	public void init(final IWorkbench workbench) {
		System.out.println("CompilerPreferencePage.init" + workbench);
	}

	@Override
	public IPreferenceStore doGetPreferenceStore() {
		return RecordLangActivator.getInstance().getPreferenceStore();
	}

	@Override
	protected Control createContents(final Composite parent) {
		final Composite control = new Composite(parent, SWT.None);
		final GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		control.setLayout(layout);
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		/* languages */
		this.langGroup = new Group(control, SWT.SHADOW_NONE);
		this.langGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		this.langGroup.setText("Languages");
		final GridLayout langLayout = new GridLayout();
		langLayout.numColumns = 1;
		this.langGroup.setLayout(langLayout);

		for (final String language : LanguageSetup.getPresentLanguages()) {
			this.createLanguageCheck(this.langGroup, language, TargetsPreferences.GENERATOR_ACTIVE + language);
		}

		/* misc */
		this.miscGroup = new Group(control, SWT.SHADOW_NONE);
		this.miscGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		this.miscGroup.setText("Miscellaneous");
		final GridLayout miscLayout = new GridLayout();
		miscLayout.numColumns = 2;
		this.miscGroup.setLayout(miscLayout);

		this.createCompilerProperty(this.miscGroup, "Author", TargetsPreferences.AUTHOR_NAME);
		this.createCompilerProperty(this.miscGroup, "Version", TargetsPreferences.VERSION_ID);

		control.pack();

		return control;
	}


	@Override
	protected void performApply() {
		this.storeValues();
		super.performApply();
	}

	@Override
	protected void performDefaults() {
		this.initializeDefaults();
		super.performDefaults();
	}

	/**
	 * Create a string value property for a compiler setting.
	 * 
	 * @param parent the group where the property is contained
	 * @param name the displayed message
	 * @param propertyId the internal property id
	 */
	private void createCompilerProperty(final Composite parent, final String name, final String propertyId) {
		final Label label = new Label(parent, SWT.NONE);
		label.setText(name);
		final Text text = new Text(parent, SWT.NONE);
		text.setData(WIDGET_DATA_PROPERTY_ID, propertyId);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.setText(this.getPreferenceStore().getString(propertyId));
	}

	/**
	 * Create a language checkbox entry.
	 * 
	 * @param parent the preference page group for language
	 * @param name the name of the language
	 * @param propertydirectoryId the associated property id
	 */
	private void createLanguageCheck(final Composite parent, final String name, final String propertyActivatedId) {
		final Button check = new Button(parent, SWT.CHECK);
		check.setText(name);
		check.setData(WIDGET_DATA_PROPERTY_ID, propertyActivatedId);
		check.setSelection(this.getPreferenceStore().getBoolean(propertyActivatedId));
	}


	private void storeValues() {
		for (final String language : LanguageSetup.getPresentLanguages()) {
			this.storeBooleanProperty(this.langGroup.getChildren(), TargetsPreferences.GENERATOR_ACTIVE + language);
		}

		this.storeStringProperty(this.miscGroup.getChildren(), TargetsPreferences.AUTHOR_NAME);
		this.storeStringProperty(this.miscGroup.getChildren(), TargetsPreferences.AUTHOR_NAME);
	}

	private void initializeDefaults() {
		for (final String language : LanguageSetup.getPresentLanguages()) {
			this.retrieveBooleanProperty(this.langGroup.getChildren(), TargetsPreferences.GENERATOR_ACTIVE + language);
		}

		this.retrieveStringProperty(this.miscGroup.getChildren(), TargetsPreferences.AUTHOR_NAME);
		this.retrieveStringProperty(this.miscGroup.getChildren(), TargetsPreferences.AUTHOR_NAME);
	}

	/**
	 * Get a string property from an UI element and store is in the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param dirProperty the requested property
	 */
	private void storeStringProperty(final Control[] children, final String dirProperty) {
		final IPreferenceStore store = this.getPreferenceStore();
		for (final Control child : children) {
			if (dirProperty.equals(child.getData(WIDGET_DATA_PROPERTY_ID))) {
				store.setValue(dirProperty, ((Text) child).getText());
			}
		}
	}

	/**
	 * Get a boolean property from an UI element and store is in the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param dirProperty the requested property
	 */
	private void storeBooleanProperty(final Control[] children, final String checkProperty) {
		final IPreferenceStore store = this.getPreferenceStore();
		for (final Control child : children) {
			if (checkProperty.equals(child.getData(WIDGET_DATA_PROPERTY_ID))) {
				store.setValue(checkProperty, ((Button) child).getSelection());
			}
		}
	}

	/**
	 * Set a string property of an UI element with a value from the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param dirProperty the requested property
	 */
	private void retrieveStringProperty(final Control[] children, final String dirProperty) {
		final IPreferenceStore store = this.getPreferenceStore();
		for (final Control child : children) {
			if (dirProperty.equals(child.getData(WIDGET_DATA_PROPERTY_ID))) {
				((Text) child).setText(store.getDefaultString(dirProperty));
			}
		}
	}

	/**
	 * Set a boolean property of an UI element with a value from the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param dirProperty the requested property
	 */
	private void retrieveBooleanProperty(final Control[] children, final String checkProperty) {
		final IPreferenceStore store = this.getPreferenceStore();
		for (final Control child : children) {
			if (checkProperty.equals(child.getData(WIDGET_DATA_PROPERTY_ID))) {
				((Button) child).setSelection(store.getDefaultBoolean(checkProperty));
			}
		}
	}

	/**
	 * Selection dialog for target directories.
	 * 
	 * @author rju
	 *
	 */
	class DirectorySelector implements SelectionListener {

		private final IAdaptable adaptable;
		private final Text directoryPath;

		public DirectorySelector(final IAdaptable adaptable, final Text directoryPath) {
			this.adaptable = adaptable;
			this.directoryPath = directoryPath;
		}

		public void widgetSelected(final SelectionEvent e) {
			if (this.adaptable instanceof IJavaProject) {
				final ContainerSelectionDialog dialog =
						new ContainerSelectionDialog(TargetsPreferencePage.this.getShell(),
								((IJavaProject) this.adaptable).getProject(), true, "find target directory.");
				dialog.open();
				final Object[] result = dialog.getResult();
				if (result.length > 0) {
					if (result[0] instanceof Path) {
						this.directoryPath.setText(result[0].toString());
					}
				}
			} else {
				System.out.println("ERROR " + this.adaptable);
			}
		}

		public void widgetDefaultSelected(final SelectionEvent e) {
			this.widgetSelected(e);
		}

	}

}
