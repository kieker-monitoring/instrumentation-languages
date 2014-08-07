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
package de.cau.cs.se.instrumentation.rl.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementComparator;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (irl).
 * 
 * @author Reiner Jung
 */
public class RecordLangNewWizardPage extends WizardPage {
	private Text sourceFolderText;

	private Text sourcePackageText;

	private Text fileText;

	private final ISelection selection;

	private IPackageFragmentRoot sourceFolder;

	private IPackageFragment sourcePackage;

	private String sourceFile = "new_file.irl";

	/**
	 * Constructor for RecordLangNewWizardPage.
	 * 
	 * @param selection selected element in package explorer
	 */
	public RecordLangNewWizardPage(final ISelection selection) {
		super("wizardPage");
		this.setTitle("IRL File");
		this.setDescription("This wizard creates a new file with *.irl extension that can be opened by the IRL editor.");
		this.selection = selection;

		if (this.selection instanceof TreeSelection) {
			final TreeSelection container = (TreeSelection) this.selection;

			final Object element = container.getFirstElement();
			if (element instanceof IPackageFragment) {
				this.sourcePackage = (IPackageFragment) element;
				IJavaElement parent = this.sourcePackage.getParent();
				while (!(parent instanceof IPackageFragmentRoot) && (parent != null)) {
					parent = parent.getParent();
				}
				if (parent != null) {
					this.sourceFolder = (IPackageFragmentRoot) parent;
				}
			} else if (element instanceof IPackageFragmentRoot) {
				this.sourceFolder = (IPackageFragmentRoot) element;
				this.sourcePackage = null;
			} else if (element instanceof IJavaProject) {
				this.sourceFolder = null;
				this.sourcePackage = null;
			} else {
				this.sourceFolder = null;
				this.sourcePackage = null;
			}
		}
	}

	/**
	 * Return the stored file name.
	 * @return file name
	 */
	public String getFileName() {
		return this.sourceFile;
	}

	/**
	 * Return the resource path for the folder containing the new file.
	 * @return path to the selected package
	 */
	public IPath getPackagePath() {
		if (this.sourcePackage != null) {
			return this.sourcePackage.getPath();
		} else {
			return null;
		}
	}

	public IPackageFragment getSourcePackage() {
		return this.sourcePackage;
	}

	/**
	 * Creates the top level control for this dialog
	 * page under the given parent composite.
	 * <p>
	 * Implementors are responsible for ensuring that the created control can be accessed via <code>getControl</code>
	 * </p>
	 * 
	 * @param parent
	 *            the parent composite
	 */
	public void createControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		final GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		// folder
		Label label = new Label(container, SWT.NULL);
		label.setText("&Source folder:");

		this.sourceFolderText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		this.sourceFolderText.setLayoutData(gd);
		if (this.sourceFolder != null) {
			this.sourceFolderText.setText(this.generatedLocalPath(this.sourceFolder));
		}
		this.sourceFolderText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				RecordLangNewWizardPage.this.dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				RecordLangNewWizardPage.this.handleSourceFolderBrowse();
			}
		});

		// package
		label = new Label(container, SWT.NULL);
		label.setText("&Package:");

		this.sourcePackageText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		this.sourcePackageText.setLayoutData(gd);
		if (this.sourcePackage != null) {
			this.sourcePackageText.setText(this.sourcePackage.getElementName());
		}
		this.sourcePackageText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				RecordLangNewWizardPage.this.dialogChanged();
			}
		});

		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				RecordLangNewWizardPage.this.handlePackageBrowse();
			}
		});

		// File
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		this.fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		this.fileText.setLayoutData(gd);
		this.fileText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				RecordLangNewWizardPage.this.dialogChanged();
			}
		});
		this.initialize();
		this.dialogChanged();
		this.setControl(container);
	}

	private String generatedLocalPath(final IPackageFragmentRoot fragmentRoot) {
		final IPath path = fragmentRoot.getPath();
		return path.removeFirstSegments(1).toString();
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	private void initialize() {
		if ((this.selection != null)
				&& !this.selection.isEmpty()
				&& (this.selection instanceof IStructuredSelection)) {
			final IStructuredSelection ssel = (IStructuredSelection) this.selection;
			if (ssel.size() > 1) {
				return;
			}
			final Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer) {
					container = (IContainer) obj;
				} else {
					container = ((IResource) obj).getParent();
				}
				this.sourceFolderText.setText(container.getFullPath().toString());
			}
		}
		this.fileText.setText(this.sourceFile);
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleSourceFolderBrowse() {
		this.sourceFolder = this.chooseSourceFolder();
		this.sourceFolderText.setText(this.generatedLocalPath(this.sourceFolder));
	}

	private IPackageFragmentRoot chooseSourceFolder() {
		final ISelectionStatusValidator validator = new ISelectionStatusValidator() {

			public IStatus validate(final Object[] selection) { // NOCS
				if (selection.length == 1) {
					if (this.isSelectedValid(selection[0])) {
						return Status.OK_STATUS;
					} else {
						return Status.CANCEL_STATUS;
					}
				} else {
					return Status.CANCEL_STATUS;
				}
			}

			private boolean isSelectedValid(final Object element) {
				try {
					if (element instanceof IJavaProject) {
						final IJavaProject jproject = (IJavaProject) element;
						final IPath path = jproject.getProject().getFullPath();
						return jproject.findPackageFragmentRoot(path) != null;
					} else if (element instanceof IPackageFragmentRoot) {
						return ((IPackageFragmentRoot) element).getKind() == IPackageFragmentRoot.K_SOURCE;
					}
					return true;
				} catch (final JavaModelException e) {
					return false;
				}
			}

		};

		final ViewerFilter filter = new ViewerFilter() {
			private final Class<?>[] acceptedClasses = new Class<?>[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class };

			@Override
			public boolean select(final Viewer viewer, final Object parent, final Object element) {
				if (element instanceof IPackageFragmentRoot) {
					try {
						return ((IPackageFragmentRoot) element).getKind() == IPackageFragmentRoot.K_SOURCE;
					} catch (final JavaModelException e) {
						return false;
					}
				}
				for (final Class<?> acceptedClasse : this.acceptedClasses) {
					if (acceptedClasse.isInstance(element)) {
						return true;
					}
				}
				return false;
			}
		};

		final StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		final ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);

		final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(this.getShell(), labelProvider, provider);
		dialog.setValidator(validator);
		dialog.setComparator(new JavaElementComparator());
		dialog.setTitle("Select source folder");
		dialog.setMessage("Select a source folder");
		dialog.addFilter(filter);
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.setInitialSelection(this.sourceFolder);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			final Object element = dialog.getFirstResult();
			if (element instanceof IJavaProject) {
				final IJavaProject jproject = (IJavaProject) element;
				return jproject.getPackageFragmentRoot(jproject.getProject());
			} else if (element instanceof IPackageFragmentRoot) {
				return (IPackageFragmentRoot) element;
			}
			return null;
		}
		return null;
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handlePackageBrowse() {
		this.sourcePackage = this.choosePackage();
		this.sourcePackageText.setText(this.sourcePackage.getElementName());
	}

	private IPackageFragment choosePackage() {
		final IPackageFragmentRoot froot = this.sourceFolder;
		IJavaElement[] packages = null;
		try {
			if ((froot != null) && froot.exists()) {
				packages = froot.getChildren();
			}
		} catch (final JavaModelException e) {
		}
		if (packages == null) {
			packages = new IJavaElement[0];
		}

		final ElementListSelectionDialog dialog = new ElementListSelectionDialog(this.getShell(),
				new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT));
		dialog.setIgnoreCase(false);
		dialog.setTitle("Select package");
		dialog.setMessage("Select a package for the IRL file.");
		dialog.setEmptyListMessage("---");
		dialog.setElements(packages);
		dialog.setHelpAvailable(false);

		final IPackageFragment pack = this.sourcePackage;
		if (pack != null) {
			dialog.setInitialSelections(new Object[] { pack });
		}

		if (dialog.open() == Window.OK) {
			return (IPackageFragment) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		/* source folder */
		if (this.sourceFolder != null) {
			final IResource sourceFolderResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(this.sourceFolder.getPath());
			if (this.sourceFolderText.getText().length() == 0) {
				this.updateStatus("A source folder must be specified");
				return;
			}
			if ((sourceFolderResource == null) || ((sourceFolderResource.getType() & IResource.FOLDER) == 0)) {
				this.updateStatus("Source folder must exist");
				return;
			}
			if (!sourceFolderResource.isAccessible()) {
				this.updateStatus("Project must be writable");
				return;
			}
		}

		/* source package */
		if (this.sourcePackage != null) {
			final IResource sourcePackageResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(this.sourcePackage.getPath());
			if (this.sourcePackageText.getText().length() == 0) {
				this.updateStatus("A source package must be specified");
			}
			if ((sourcePackageResource == null) || ((sourcePackageResource.getType() & IResource.FOLDER) == 0)) {
				this.updateStatus("Source package must exist");
				return;
			}
			if (!sourcePackageResource.isAccessible()) {
				this.updateStatus("Project must be writable");
				return;
			}
		}

		/* file name */
		this.sourceFile = this.fileText.getText();

		if (this.sourceFile.length() == 0) {
			this.updateStatus("File name must be specified");
			return;
		}
		if (this.sourceFile.replace('\\', '/').indexOf('/', 1) > 0) {
			this.updateStatus("File name must be valid");
			return;
		}
		final int dotLoc = this.sourceFile.lastIndexOf('.');
		if (dotLoc != -1) {
			final String ext = this.sourceFile.substring(dotLoc + 1);
			if (!"irl".equalsIgnoreCase(ext)) {
				this.updateStatus("File extension must be \"irl\"");
				return;
			}
		}
		this.updateStatus(null);
	}

	private void updateStatus(final String message) {
		this.setErrorMessage(message);
		this.setPageComplete(message == null);
	}

}
