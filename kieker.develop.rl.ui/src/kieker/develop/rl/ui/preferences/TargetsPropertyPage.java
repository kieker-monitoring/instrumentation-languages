/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import kieker.develop.rl.preferences.TargetsPreferences;

/**
 * @author Reiner Jung
 *
 */
public class TargetsPropertyPage extends AbstractFieldEditorOverlayPage implements IWorkbenchPropertyPage {


	/** Name of resource property for the selection of workbench or project settings. */
	public static final String USEPROJECTSETTINGS = "useProjectSettings";

	/** Cache for page id. */
	public static final String PAGE_ID = "kieker.develop.rl.ui.preferences.TargetsPropertyPage";

	private static final String FALSE = "false";
	private static final String TRUE = "true";

	/** The imageDescriptor descriptor of this pages title imageDescriptor. */
	private ImageDescriptor imageDescriptor;

	// Stores all created field editors
	private final List<FieldEditor> editors = new ArrayList<FieldEditor>();

	/** Stores owning element of properties. */
	private IAdaptable element;

	/** Additional buttons for property pages. */
	private Button useWorkspaceSettingsButton;
	private Button useProjectSettingsButton;
	private Button configureButton;

	/** Overlay preference store for property pages. */
	private IPreferenceStore overlayStore;

	/**
	 * Property page initialization.
	 */
	public TargetsPropertyPage() {
		super(GRID);
		final IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, TargetsPreferences.PLUGIN_ID);
		this.setPreferenceStore(store);
		this.setDescription("Target and Output Configuration");
	}

	/**
	 * Configurable initialization constructor.
	 * @param title - title string
	 * @param imageDescriptor - title imageDescriptor
	 * @param style - layout style
	 */
	public TargetsPropertyPage(final String title, final ImageDescriptor imageDescriptor, final int style) {
		super(title, imageDescriptor, style);
		this.imageDescriptor = imageDescriptor;
		final IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, TargetsPreferences.PLUGIN_ID);
		this.setPreferenceStore(store);
		this.setDescription("Target and Output Configuration");
	}

	/**
	 * Receives the object that owns the properties shown in this property page.
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param element the owner of the page
	 */
	public void setElement(final IAdaptable element) {
		this.element = element;
	}

	/**
	 * Delivers the object that owns the properties shown in this property page.
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 *
	 * @return the owner of the page
	 */
	public IAdaptable getElement() {
		return this.element;
	}

	/**
	 * Returns in case of property pages the overlay store, in case of preference pages the standard preference store.
	 * @see org.eclipse.jface.preference.PreferencePage#getPreferenceStore()
	 */
	@Override
	public IPreferenceStore getPreferenceStore() {
		return this.overlayStore;
	}

	/**
	 * We override the createControl method.
	 * In case of property pages we create a new PropertyStore as local preference store.
	 * After all control have been create, we enable/disable these controls.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createControl()
	 */
	@Override
	public void createControl(final Composite parent) {
		// Create an overlay preference store and fill it with properties
		try {
			this.overlayStore =
					new PropertyStore(
							this.getResource(),
							super.getPreferenceStore(),
							PAGE_ID);
		} catch (final JavaModelException e) {
			e.printStackTrace();
		}
		// Set overlay store as current preference store
		super.createControl(parent);
		// Update state of all subclass controls
		this.updateFieldEditors();
	}

	/**
	 * We override the createContents method.
	 * In case of property pages we insert two radio buttons at the top of the page.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(final Composite parent) {
		this.createSelectionGroup(parent);
		return super.createContents(parent);
	}

	/**
	 * Creates and initializes a selection group with two choice buttons and one push button.
	 * @param parent - the parent composite
	 */
	private void createSelectionGroup(final Composite parent) {
		final Composite comp = new Composite(parent, SWT.NONE);
		final GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		comp.setLayout(layout);
		comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final Composite radioGroup = new Composite(comp, SWT.NONE);
		radioGroup.setLayout(new GridLayout());
		radioGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.useWorkspaceSettingsButton = this.createRadioButton(radioGroup, "Use &workspace settings");
		this.useProjectSettingsButton = this.createRadioButton(radioGroup, "Use pr&oject settings");
		this.configureButton = new Button(comp, SWT.PUSH);
		this.configureButton.setText("&Configure Workspace Settings ...");
		this.configureButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				try {
					// create a new instance of the current class
					final IPreferencePage page =
							TargetsPropertyPage.this.getClass().newInstance();
					page.setTitle(TargetsPropertyPage.this.getTitle());
					page.setImageDescriptor(TargetsPropertyPage.this.imageDescriptor);
					// and show it
					TargetsPropertyPage.this.showPreferencePage(TargetsPropertyPage.PAGE_ID,
							TargetsPropertyPage.this);
				} catch (final InstantiationException exception) {
					exception.printStackTrace();
				} catch (final IllegalAccessException exception) {
					exception.printStackTrace();
				}
			}
		});

		// Set workspace/project radio buttons
		try {
			final String use = this.getResource().getPersistentProperty(new QualifiedName(PAGE_ID, USEPROJECTSETTINGS));
			if (TRUE.equals(use)) {
				this.useProjectSettingsButton.setSelection(true);
				this.configureButton.setEnabled(false);
			} else {
				this.useWorkspaceSettingsButton.setSelection(true);
			}
		} catch (final CoreException e) {
			this.useWorkspaceSettingsButton.setSelection(true);
		}
	}

	/**
	 * Enables or disables the field editors and buttons of this page.
	 */
	private void updateFieldEditors() {
		// We iterate through all field editors
		final boolean enabled = this.useProjectSettingsButton.getSelection();
		this.updateFieldEditors(enabled);
	}

	/**
	 * Enables or disables the field editors and buttons of this page.
	 * Subclasses may override.
	 * @param enabled - true if enabled
	 */
	protected void updateFieldEditors(final boolean enabled) {
		final Composite parent = this.getFieldEditorParent();
		for (final FieldEditor editor : this.editors) {
			editor.setEnabled(enabled, parent);
		}
	}

	/**
	 * We override the addField method. This allows us to store each field editor added by subclasses
	 * in a list for later processing.
	 *
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#addField(org.eclipse.jface.preference.FieldEditor)
	 */
	@Override
	protected void addField(final FieldEditor editor) {
		this.editors.add(editor);
		super.addField(editor);
	}


	/**
	 * We override the performOk method. In case of property pages we copy the values in the
	 * overlay store into the property values of the selected project.
	 * We also save the state of the radio buttons.
	 *
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		if (super.performOk()) {
			// Save state of radiobuttons in project properties
			try {
				final String value = (this.useProjectSettingsButton.getSelection()) ? TRUE : FALSE; // NOCS
				this.getResource().setPersistentProperty(
						new QualifiedName(PAGE_ID, USEPROJECTSETTINGS),
						value);
				return true;
			} catch (final CoreException e) {
				return false;
			}

		} else {
			return true;
		}
	}

	/**
	 * Convenience method creating a radio button.
	 * @param parent - the parent composite
	 * @param label - the button label
	 * @return - the new button
	 */
	private Button createRadioButton(final Composite parent, final String label) {
		final Button button = new Button(parent, SWT.RADIO);
		button.setText(label);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				TargetsPropertyPage.this.configureButton.setEnabled(
						button == TargetsPropertyPage.this.useWorkspaceSettingsButton);
				TargetsPropertyPage.this.updateFieldEditors();
			}
		});
		return button;
	}

	/**
	 * Determine the correct resource for a given IAdaptable.
	 *
	 * @return a resource for the IAdaptable or null is no mapping exists.
	 * @throws JavaModelException
	 */
	private IResource getResource() throws JavaModelException {
		if (this.element instanceof IJavaElement) {
			return ((IJavaElement) this.element).getCorrespondingResource();
		} else if (this.element instanceof IProject) {
			return (IProject) this.element;
		} else {
			System.out.println("Element type is " + this.element.getClass().getCanonicalName());
			return null;
		}
	}

	/**
	 * We override the performDefaults method. In case of property pages we
	 * switch back to the workspace settings and disable the field editors.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		this.useWorkspaceSettingsButton.setSelection(true);
		this.useProjectSettingsButton.setSelection(false);
		this.configureButton.setEnabled(true);
		this.updateFieldEditors();

		super.performDefaults();
	}

}
