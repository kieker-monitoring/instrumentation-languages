package de.cau.cs.se.instrumentation.rl.ui.preferences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;

/**
 * superclass for FieldEditorPreferencePage; can be used for preference pages and property pages
 *
 * Created after https://www.eclipse.org/articles/Article-Mutatis-mutandis/overlay-pages.html
 *
 * @author Yannic Kropp
 *
 */
public abstract class FieldEditorOverlayPage
extends FieldEditorPreferencePage
implements IWorkbenchPropertyPage {

	/*** Name of resource property for the selection of workbench or project settings ***/
	public static final String USEPROJECTSETTINGS = "useProjectSettings";

	private static final String FALSE = "false";
	private static final String TRUE = "true";

	// Stores all created field editors
	private final List editors = new ArrayList();

	// Stores owning element of properties
	private IAdaptable element;

	// Additional buttons for property pages
	private Button useWorkspaceSettingsButton,
	useProjectSettingsButton,
	configureButton;

	// Overlay preference store for property pages
	private IPreferenceStore overlayStore;

	// The image descriptor of this pages title image
	private ImageDescriptor image;

	// Cache for page id
	private String pageId;

	/**
	 * Constructor
	 * @param style - layout style
	 */
	public FieldEditorOverlayPage(final int style) {
		super(style);
	}

	/**
	 * Constructor
	 * @param title - title string	 */
	public FieldEditorOverlayPage(final String title, final int style) {
		super(title, style);
	}

	/**
	 * Constructor
	 * @param title - title string
	 * @param image - title image
	 * @param style - layout style
	 */
	public FieldEditorOverlayPage(
			final String title,
			final ImageDescriptor image,
			final int style) {
		super(title, image, style);
		this.image = image;
	}

	/**
	 * Returns the id of the current preference page as defined in plugin.xml
	 * Subclasses must implement.
	 *
	 * @return - the qualifier
	 */
	protected abstract String getPageId();

	/**
	 * Receives the object that owns the properties shown in this property page.
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 */
	public void setElement(final IAdaptable element) {
		this.element = element;
	}

	/**
	 * Delivers the object that owns the properties shown in this property page.
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 */
	public IAdaptable getElement() {
		return this.element;
	}

	/**
	 * Returns true if this instance represents a property page
	 * @return - true for property pages, false for preference pages
	 */
	public boolean isPropertyPage() {
		return this.getElement() != null;
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
	 *  We override the createControl method.
	 * In case of property pages we create a new PropertyStore as local preference store.
	 * After all control have been create, we enable/disable these controls.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createControl()
	 */
	@Override
	public void createControl(final Composite parent) {
		// Special treatment for property pages
		if (this.isPropertyPage()) {
			// Cache the page id
			this.pageId = this.getPageId();
			// Create an overlay preference store and fill it with properties
			try {
				this.overlayStore =
						new PropertyStore(
								(((IJavaElement) this.getElement()).getCorrespondingResource()),
								super.getPreferenceStore(),
								this.pageId);
			} catch (final JavaModelException e) {
				e.printStackTrace();
			}
			// Set overlay store as current preference store
		}
		super.createControl(parent);
		// Update state of all subclass controls
		if (this.isPropertyPage()) {
			this.updateFieldEditors();
		}
	}

	/**
	 * We override the createContents method.
	 * In case of property pages we insert two radio buttons at the top of the page.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(final Composite parent) {
		if (this.isPropertyPage()) {
			this.createSelectionGroup(parent);
		}
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
			public void widgetSelected(final SelectionEvent e) {
				FieldEditorOverlayPage.this.configureWorkspaceSettings();
			}
		});
		// Set workspace/project radio buttons
		try {
			final String use =
					((IJavaElement) this.getElement()).getCorrespondingResource().getPersistentProperty(
							new QualifiedName(this.pageId, USEPROJECTSETTINGS));
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
	 * Convenience method creating a radio button
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
				FieldEditorOverlayPage.this.configureButton.setEnabled(
						button == FieldEditorOverlayPage.this.useWorkspaceSettingsButton);
				FieldEditorOverlayPage.this.updateFieldEditors();
			}
		});
		return button;
	}

	/**
	 * Returns in case of property pages the overlay store,
	 * in case of preference pages the standard preference store
	 * @see org.eclipse.jface.preference.PreferencePage#getPreferenceStore()
	 */
	@Override
	public IPreferenceStore getPreferenceStore() {
		if (this.isPropertyPage()) {
			return this.overlayStore;
		}
		return super.getPreferenceStore();
	}

	/*
	 * Enables or disables the field editors and buttons of this page
	 */
	private void updateFieldEditors() {
		// We iterate through all field editors
		final boolean enabled = this.useProjectSettingsButton.getSelection();
		this.updateFieldEditors(enabled);
	}

	/**
	 * Enables or disables the field editors and buttons of this page
	 * Subclasses may override.
	 * @param enabled - true if enabled
	 */
	protected void updateFieldEditors(final boolean enabled) {
		final Composite parent = this.getFieldEditorParent();
		final Iterator it = this.editors.iterator();
		while (it.hasNext()) {
			final FieldEditor editor = (FieldEditor) it.next();
			editor.setEnabled(enabled, parent);
		}
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
		final boolean result = super.performOk();
		if (result && this.isPropertyPage()) {
			// Save state of radiobuttons in project properties
			try {
				final String value =
						(this.useProjectSettingsButton.getSelection()) ? TRUE : FALSE;
				((IJavaElement)this.getElement()).getCorrespondingResource().setPersistentProperty(
						new QualifiedName(this.pageId, USEPROJECTSETTINGS),
						value);
			} catch (final CoreException e) {
			}
		}
		return result;
	}

	/**
	 * We override the performDefaults method. In case of property pages we
	 * switch back to the workspace settings and disable the field editors.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		if (this.isPropertyPage()) {
			this.useWorkspaceSettingsButton.setSelection(true);
			this.useProjectSettingsButton.setSelection(false);
			this.configureButton.setEnabled(true);
			this.updateFieldEditors();
		}
		super.performDefaults();
	}

	/**
	 * Creates a new preferences page and opens it
	 * @see com.bdaum.SpellChecker.preferences.SpellCheckerPreferencePage#configureWorkspaceSettings()
	 */
	protected void configureWorkspaceSettings() {
		try {
			// create a new instance of the current class
			final IPreferencePage page =
					this.getClass().newInstance();
			page.setTitle(this.getTitle());
			page.setImageDescriptor(this.image);
			// and show it
			this.showPreferencePage(this.pageId, page);
		} catch (final InstantiationException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Show a single preference pages
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

}
