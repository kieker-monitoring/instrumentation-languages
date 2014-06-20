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
 * Setup tab for IRL to EMF generator
 * 
 * @author Reiner Jung
 *
 */
public class EMFProjectTab extends AbstractLaunchConfigurationTab implements ILaunchConfigurationTab {

	private Composite tab;
	private Text projectText;
	private Text targetFileText;

	private IProject selectedProject;

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

	/**
	 * Set default values.
	 * 
	 * @param configuration a launch configuration copy
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_PROJECT, "");
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_TARGET_FILE, "generic.ecore");
	}

	/**
	 * Initialize values of the tab from the configuration.
	 * 
	 * @param configuration the configuration holding properties
	 */
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

	/**
	 * Store form data back to the configuration.
	 * 
	 * @param configuration copy of the configuration to by updated by form data
	 */
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_PROJECT,
				this.projectText.getText());
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_TARGET_FILE,
				this.targetFileText.getText());
	}

	/**
	 * The name.
	 */
	public String getName() {
		return "EMF meta-model generation";
	}



}
