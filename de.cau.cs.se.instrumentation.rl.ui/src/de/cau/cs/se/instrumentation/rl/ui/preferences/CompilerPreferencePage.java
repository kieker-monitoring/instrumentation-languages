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

import de.cau.cs.se.instrumentation.rl.generator.RecordLangGenerator;
import de.cau.cs.se.instrumentation.rl.ui.internal.RecordLangActivator;


/**
 * @author rju
 * 
 */
public class CompilerPreferencePage extends org.eclipse.jface.preference.PreferencePage
implements org.eclipse.ui.IWorkbenchPreferencePage, org.eclipse.ui.IWorkbenchPropertyPage {

	private static final String WIDGET_DATA_PROPERTY_ID = "name";

	private IAdaptable adaptable;
	private Group langGroup;
	private Group miscGroup;

	/**
	 * Default constructor.
	 */
	public CompilerPreferencePage() {
		super();
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
		langLayout.numColumns = 3;
		this.langGroup.setLayout(langLayout);

		this.createLanguageCheck(this.langGroup, "Java", RecordLangGenerator.JAVA_CHECK_PROPERTY);
		this.createLanguageDirectory(this.langGroup, RecordLangGenerator.JAVA_DIR_PROPERTY);
		this.createLanguageCheck(this.langGroup, "C", RecordLangGenerator.C_CHECK_PROPERTY);
		this.createLanguageDirectory(this.langGroup, RecordLangGenerator.C_DIR_PROPERTY);
		this.createLanguageCheck(this.langGroup, "Perl", RecordLangGenerator.PERL_CHECK_PROPERTY);
		this.createLanguageDirectory(this.langGroup, RecordLangGenerator.PERL_DIR_PROPERTY);

		/* misc */
		this.miscGroup = new Group(control, SWT.SHADOW_NONE);
		this.miscGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		this.miscGroup.setText("Miscellaneous");
		final GridLayout miscLayout = new GridLayout();
		miscLayout.numColumns = 2;
		this.miscGroup.setLayout(miscLayout);

		this.createCompilerProperty(this.miscGroup, "Author", RecordLangGenerator.AUTHOR_PROPERTY);
		this.createCompilerProperty(this.miscGroup, "Version", RecordLangGenerator.VERSION_PROPERTY);

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

	/**
	 * Create a language directory entry.
	 * 
	 * @param parent the preference page group for language
	 * @param name the name of the language
	 * @param propertyDirectoryId the associated property id
	 */
	private void createLanguageDirectory(final Composite parent, final String propertyDirectoryId) {
		final Text directoryPath = new Text(parent, SWT.SINGLE);
		directoryPath.setData(WIDGET_DATA_PROPERTY_ID, propertyDirectoryId);
		directoryPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		directoryPath.setText(this.getPreferenceStore().getString(propertyDirectoryId));
		final Button browse = new Button(parent, SWT.PUSH);
		browse.setText("Browse ...");
		browse.addSelectionListener(new DirectorySelector(this.adaptable, directoryPath));

	}

	private void storeValues() {
		final IPreferenceStore store = this.getPreferenceStore();
		this.storeStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.JAVA_DIR_PROPERTY);
		this.storeStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.C_DIR_PROPERTY);
		this.storeStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.PERL_DIR_PROPERTY);

		this.storeBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.JAVA_CHECK_PROPERTY);
		this.storeBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.C_CHECK_PROPERTY);
		this.storeBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.PERL_CHECK_PROPERTY);

		this.storeStringProperty(this.miscGroup.getChildren(), store, RecordLangGenerator.AUTHOR_PROPERTY);
		this.storeStringProperty(this.miscGroup.getChildren(), store, RecordLangGenerator.VERSION_PROPERTY);
	}

	/**
	 * Get a string property from an UI element and store is in the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param store the store
	 * @param dirProperty the requested property
	 */
	private void storeStringProperty(final Control[] children, final IPreferenceStore store, final String dirProperty) {
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
	 * @param store the store
	 * @param dirProperty the requested property
	 */
	private void storeBooleanProperty(final Control[] children, final IPreferenceStore store, final String checkProperty) {
		for (final Control child : children) {
			if (checkProperty.equals(child.getData(WIDGET_DATA_PROPERTY_ID))) {
				store.setValue(checkProperty, ((Button) child).getSelection());
			}
		}
	}

	private void initializeDefaults() {
		final IPreferenceStore store = this.getPreferenceStore();
		this.retrieveStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.JAVA_DIR_PROPERTY);
		this.retrieveStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.C_DIR_PROPERTY);
		this.retrieveStringProperty(this.langGroup.getChildren(), store, RecordLangGenerator.PERL_DIR_PROPERTY);

		this.retrieveBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.JAVA_CHECK_PROPERTY);
		this.retrieveBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.C_CHECK_PROPERTY);
		this.retrieveBooleanProperty(this.langGroup.getChildren(), store, RecordLangGenerator.PERL_CHECK_PROPERTY);

		this.retrieveStringProperty(this.miscGroup.getChildren(), store, RecordLangGenerator.AUTHOR_PROPERTY);
		this.retrieveStringProperty(this.miscGroup.getChildren(), store, RecordLangGenerator.VERSION_PROPERTY);
	}

	/**
	 * Set a string property of an UI element with a value from the preference store.
	 * 
	 * @param children all UI elements to check for data
	 * @param store the store
	 * @param dirProperty the requested property
	 */
	private void retrieveStringProperty(final Control[] children, final IPreferenceStore store, final String dirProperty) {
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
	 * @param store the store
	 * @param dirProperty the requested property
	 */
	private void retrieveBooleanProperty(final Control[] children, final IPreferenceStore store, final String checkProperty) {
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
						new ContainerSelectionDialog(CompilerPreferencePage.this.getShell(),
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
