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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * Setup tab for IRL to EMF generator.
 * 
 * @author Reiner Jung
 *
 */
public class EMFProjectTab extends AbstractLaunchConfigurationTab implements ILaunchConfigurationTab {

	private Composite tab;
	private Text destinationFolderText;

	private List<IContainer> sourceContainerList = new ArrayList<IContainer>();
	private TableViewer sourceContainerTable;
	private Text fileText;

	/**
	 * Default constructor.
	 */
	public EMFProjectTab() {
		super();
	}

	/**
	 * create control for run configuration.
	 * 
	 * @param parent parent element in the UI
	 */
	public void createControl(final Composite parent) {
		this.tab = new Composite(parent, SWT.NONE);
		this.setControl(this.tab);

		this.tab.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(1, false);
		this.tab.setLayout(layout);

		// content
		// list of all folders
		this.sourceContainerTable = new TableViewer(this.tab, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		// create the columns
		// not yet implemented
		this.createColumns();

		// make lines and header visible
		final Table table = this.sourceContainerTable.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));

		// set the content provider
		this.sourceContainerTable.setContentProvider(ArrayContentProvider.getInstance());

		// provide the input to the viewer
		// setInput() calls getElements() on the
		// content provider instance
		this.sourceContainerTable.setInput(this.sourceContainerList);


		final Button addButton = new Button(this.tab, SWT.BORDER);
		addButton.setLayoutData(new GridData(GridData.END));
		addButton.setText("Add ...");
		addButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final IContainer selectedfolder = EMFProjectTab.this.chooseSourceFolder();
				if (selectedfolder != null) {
					EMFProjectTab.this.sourceContainerList.add(selectedfolder);
					EMFProjectTab.this.sourceContainerTable.setInput(EMFProjectTab.this.sourceContainerList);
					EMFProjectTab.this.setDirty(true);
				}
				EMFProjectTab.this.updateLaunchConfigurationDialog();
			}
		});

		final Button deleteButton = new Button(this.tab, SWT.BORDER);
		deleteButton.setLayoutData(new GridData(GridData.END));
		deleteButton.setText("Delete");
		deleteButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (!EMFProjectTab.this.sourceContainerTable.getSelection().isEmpty()) {
					final ISelection selection = EMFProjectTab.this.sourceContainerTable.getSelection();
					if (selection instanceof StructuredSelection) {
						for (final Object element : ((StructuredSelection) selection).toList()) {
							EMFProjectTab.this.sourceContainerList.remove(element);
						}

						EMFProjectTab.this.sourceContainerTable.setInput(EMFProjectTab.this.sourceContainerList);
						EMFProjectTab.this.setDirty(true);
						EMFProjectTab.this.updateLaunchConfigurationDialog();
					}


				}
			}
		});

		this.destinationFolderText = new Text(this.tab, SWT.SINGLE | SWT.BORDER);
		this.destinationFolderText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.destinationFolderText.setEditable(false);

		final Button targetButton = new Button(this.tab, SWT.BORDER);
		targetButton.setLayoutData(new GridData(GridData.END));
		targetButton.setText("Browse ...");
		targetButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ContainerSelectionDialog dialog =
						new ContainerSelectionDialog(EMFProjectTab.this.getShell(),
								ResourcesPlugin.getWorkspace().getRoot(), true, "Select a target folder.");
				if (dialog.open() == Window.OK) {
					final Object[] result = dialog.getResult();
					if (result.length > 0) {
						if (result[0] instanceof IPath) {
							EMFProjectTab.this.setDirty(true);
							EMFProjectTab.this.destinationFolderText.setText(((IPath) result[0]).toOSString());
						}
					}
				}
			}
		});

		final Label label = new Label(this.tab, SWT.NONE);
		label.setLayoutData(new GridData(GridData.END));
		label.setText("Filename:");

		this.fileText = new Text(this.tab, SWT.NONE);
		this.fileText.setLayoutData(new GridData(GridData.END));
		this.fileText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(final ModifyEvent e) {
				EMFProjectTab.this.setDirty(true);
				EMFProjectTab.this.updateLaunchConfigurationDialog();
			}
		});
	}

	private void createColumns() {
		final TableViewerColumn folderColumn = new TableViewerColumn(this.sourceContainerTable, SWT.NONE);
		folderColumn.getColumn().setWidth(200);
		folderColumn.getColumn().setText("Folder");
		folderColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof IContainer) {
					return ((IContainer) element).getFullPath().toString();
				} else {
					return "ERROR";
				}
			}
		});
	}

	private IContainer chooseSourceFolder() {
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		final ContainerSelectionDialog dialog =
				new ContainerSelectionDialog(this.getShell(), root,
						false, "Select a source folder.");
		dialog.setTitle("Source Folder Selection");

		if (dialog.open() == Window.OK) {
			final Object[] result = dialog.getResult();
			if (result[0] instanceof IPath) {
				IPath path = (IPath) result[0];
				if (path.segmentCount() > 0) {
					EMFProjectTab.this.setDirty(true);
					final IProject project = root.getProject(path.segment(0));
					path = path.removeFirstSegments(1);
					if (path.segmentCount() > 0) {
						final IFolder folder = project.getFolder(path);
						return folder;
					} else {
						return project;
					}
				} else {
					return null;
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Set default values.
	 * 
	 * @param configuration a launch configuration copy
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(EMFLaunchConfigurationDelegate.ATTR_SOURCE_FOLDER,
				new ArrayList<String>());
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FOLDER, "");
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FILE, "generic.ecore");
	}

	private List<String> createSourceFolderStringList() {
		final List<String> result = new ArrayList<String>();
		for (final IContainer container : this.sourceContainerList) {
			result.add(container.getFullPath().toString());
		}
		return result;
	}

	/**
	 * Initialize values of the tab from the configuration.
	 * 
	 * @param configuration the configuration holding properties
	 */
	public void initializeFrom(final ILaunchConfiguration configuration) {
		try {
			this.sourceContainerList = new ArrayList<IContainer>();
			@SuppressWarnings("unchecked")
			final List<String> sourceFolders =
			configuration.getAttribute(EMFLaunchConfigurationDelegate.ATTR_SOURCE_FOLDER, new ArrayList<String>());
			for (final String folder : sourceFolders) {
				final IPath path = new Path(folder);
				if (path.segmentCount() > 1) {
					this.sourceContainerList.add(ResourcesPlugin.getWorkspace().getRoot().getFolder(path));
				} else {
					this.sourceContainerList.add(ResourcesPlugin.getWorkspace().getRoot().getProject(folder));
				}
			}
			this.sourceContainerTable.setInput(this.sourceContainerList);
			this.destinationFolderText.setText(configuration.getAttribute(
					EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FOLDER,
					""));
			this.fileText.setText(configuration.getAttribute(
					EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FILE, "generic.ecore"));
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
		configuration.setAttribute(EMFLaunchConfigurationDelegate.ATTR_SOURCE_FOLDER,
				this.createSourceFolderStringList());
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FOLDER,
				this.destinationFolderText.getText());
		configuration.setAttribute(
				EMFLaunchConfigurationDelegate.ATTR_DESTINATION_FILE,
				this.fileText.getText());
	}

	/**
	 * The name.
	 * 
	 * @return the name of the tab
	 */
	public String getName() {
		return "EMF meta-model generation";
	}



}
