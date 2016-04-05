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
package kieker.develop.rl.ui.wizards;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "irl". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 *
 * @author Reiner Jung
 */
public class RecordLangNewWizard extends Wizard implements INewWizard {
	private RecordLangNewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for RecordLangNewWizard.
	 */
	public RecordLangNewWizard() {
		super();
		this.setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		this.page = new RecordLangNewWizardPage(this.selection);
		this.addPage(this.page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 *
	 * @return true if the operation was successful
	 */
	@Override
	public boolean performFinish() {
		final String selectedPackage = this.page.getSourcePackage().getElementName();
		final String sourceText = this.page.getSourcePackageText();
		boolean result = true;

		if (!sourceText.equals(selectedPackage)) {
			result = MessageDialog.openQuestion(this.getShell(), "Package doesn't exist", "The package you selected doesn't exist yet. \n \n Shall it be created?");
		}
		if (result) {
			final IRunnableWithProgress op = new IRunnableWithProgress() {

				public void run(final IProgressMonitor monitor) throws InvocationTargetException {
					try {
						if (!sourceText.equals(selectedPackage)) {
							RecordLangNewWizard.this.page.setSourcePackage(RecordLangNewWizard.
									this.page.getSourceFolder().createPackageFragment(sourceText, false, monitor));
						}
						RecordLangNewWizard.this.doFinish(monitor);
					} catch (final CoreException e) {
						throw new InvocationTargetException(e);
					} finally {
						monitor.done();
					}
				}

			};
			try {
				this.getContainer().run(true, false, op);
				return true;
			} catch (final InterruptedException e) {
				return false;
			} catch (final InvocationTargetException e) {
				final Throwable realException = e.getTargetException();
				MessageDialog.openError(this.getShell(), "Error", realException.getMessage());
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */
	private void doFinish(final IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Creating " + this.page.getFileName(), 2);

		final IFolder container = (IFolder) this.page.getSourcePackage().getResource();
		final IFile file = container.getFile(this.page.getFileName());
		file.create(new ByteArrayInputStream(this.templateContents(
				this.page.getSourcePackage().getElementName()).getBytes()), false, monitor);

		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		this.getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				final IWorkbenchPage localPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(localPage, file, true);
				} catch (final PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 */
	private String templateContents(final String location) {
		if (!location.isEmpty()) {
			return "/***************************************************************************\n"
					+ " * Copyright 2014 Kieker Project (http://kieker-monitoring.net)\n"
					+ " *\n"
					+ " * Licensed under the Apache License, Version 2.0 (the \"License\");\n"
					+ " * you may not use this file except in compliance with the License.\n"
					+ " * You may obtain a copy of the License at\n"
					+ " *\n"
					+ " *     http://www.apache.org/licenses/LICENSE-2.0\n"
					+ " *\n"
					+ " * Unless required by applicable law or agreed to in writing, software\n"
					+ " * distributed under the License is distributed on an \"AS IS\" BASIS,\n"
					+ " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
					+ " * See the License for the specific language governing permissions and\n"
					+ " * limitations under the License.\n"
					+ " ***************************************************************************/\n"
					+ "package " + location + "\n\n";
		} else {
			return "/***************************************************************************\n"
					+ " * Copyright 2014 Kieker Project (http://kieker-monitoring.net)\n"
					+ " *\n"
					+ " * Licensed under the Apache License, Version 2.0 (the \"License\");\n"
					+ " * you may not use this file except in compliance with the License.\n"
					+ " * You may obtain a copy of the License at\n"
					+ " *\n"
					+ " *     http://www.apache.org/licenses/LICENSE-2.0\n"
					+ " *\n"
					+ " * Unless required by applicable law or agreed to in writing, software\n"
					+ " * distributed under the License is distributed on an \"AS IS\" BASIS,\n"
					+ " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
					+ " * See the License for the specific language governing permissions and\n"
					+ " * limitations under the License.\n"
					+ " ***************************************************************************/\n"
					+ "\n\n";
		}
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 *
	 * @param workbench
	 * @param selection
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) { // NOCS
		this.selection = selection;
	}
}



