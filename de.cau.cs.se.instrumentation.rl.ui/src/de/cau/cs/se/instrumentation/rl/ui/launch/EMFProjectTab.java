/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ui.launch;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author reiner
 *
 */
public class EMFProjectTab extends AbstractLaunchConfigurationTab implements ILaunchConfigurationTab {

	private Composite tab;
	private Text projectText;
	private Text targetFileText;

	private IProject selectedProject;

	@Override
	public void createControl(final Composite parent) {
		this.tab = new Composite(parent, SWT.NONE);
		this.setControl(this.tab);

		this.tab.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		this.tab.setLayout(layout);

		// content
		this.projectText = new Text(this.tab, SWT.SINGLE | SWT.BORDER);
		this.projectText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.projectText.setEditable(false);
		final Button button = new Button(this.tab, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));
		button.setText("Browse ...");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				EMFProjectTab.this.selectedProject = EMFProjectTab.this.chooseProject();
				if (EMFProjectTab.this.selectedProject != null) {
					EMFProjectTab.this.projectText.setText(EMFProjectTab.this.selectedProject.getName());
				}
				EMFProjectTab.this.updateLaunchConfigurationDialog();
			}
		});

		this.targetFileText = new Text(this.tab, SWT.SINGLE | SWT.BORDER);
		this.targetFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.targetFileText.setEditable(false);
	}

	private IProject chooseProject() {
		final ILabelProvider labelProvider = new WorkbenchLabelProvider();
		final ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				this.getShell(), labelProvider);
		dialog.setTitle("Project Selection");
		dialog.setMessage("Select a project to constrain your search.");
		dialog.setElements(ResourcesPlugin.getWorkspace().getRoot()
				.getProjects());

		if (dialog.open() == Window.OK) {
			return (IProject) dialog.getFirstResult();
		}
		return null;
	}

	@Override
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_PROJECT, "");
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_TARGET_FILE, "generic.ecore");
	}

	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {
		try {
			this.projectText.setText(configuration.getAttribute(EMFLaunchConfigurationDelegate.ATTR_PROJECT, ""));
			if (!this.projectText.getText().equals("")) {
				this.selectedProject = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(this.projectText.getText());
			} else {
				this.selectedProject = null;
			}
		} catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_PROJECT,
				this.projectText.getText());
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_TARGET_FILE,
				this.targetFileText.getText());
	}

	@Override
	public String getName() {
		return "EMF meta-model generation";
	}



}
