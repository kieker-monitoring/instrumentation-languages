/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group 
 *  and others.
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
package de.cau.cs.se.kieker.service.eclipse.launch;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.clapper.util.classutil.ClassFilter;
import org.clapper.util.classutil.ClassFinder;
import org.clapper.util.classutil.ClassInfo;
import org.clapper.util.classutil.SubclassClassFilter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

/**
 * @author rju -- initial contribution
 * 
 */
public class ClassMappingTab extends AbstractLaunchConfigurationTab {

	private Composite tab;
	private Tree mappingTree;
	private Table sourceTable;

	private IProject selectedProject; // hack to get the project for dialogs

	/**
	 * Empty constructor.
	 */
	public ClassMappingTab() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.tab = new Composite(parent, SWT.NONE);
		setControl(this.tab);

		final GridLayout layout = new GridLayout(1, true);
		this.tab.setLayout(layout);

		createMapTable();
	}

	/**
	 * Create UI for mapping table.
	 */
	private void createMapTable() {
		final Group group = new Group(this.tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Mapping Table");

		// content
		createMappingTree(group);
		createSourceTable(group);

	}

	/**
	 * Create the mapping tree part of the class mapping view.
	 * 
	 * @param group
	 *            the parent container
	 */
	private void createMappingTree(final Group group) {
		this.mappingTree = new Tree(group, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		this.mappingTree.setLinesVisible(true);
		this.mappingTree.setHeaderVisible(true);
		final GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		this.mappingTree.setLayoutData(data);

		TreeColumn column = new TreeColumn(this.mappingTree, SWT.LEFT);
		column.setText("Path");
		column.setWidth(250);

		column = new TreeColumn(this.mappingTree, SWT.RIGHT);
		column.setText("Id");
		column.setWidth(50);

		final TreeEditor editor = new TreeEditor(this.mappingTree);
		// The editor must have the same size as the cell and must
		// not be any smaller than 50 pixels.
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		editor.minimumWidth = 50;

		this.mappingTree.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				// Clean up any previous editor control
				final Control oldEditor = editor.getEditor();
				if (oldEditor != null) {
					oldEditor.dispose();
				}
				if (e.item != null) {
					if (e.item instanceof TreeItem) {
						final TreeItem item = (TreeItem) e.item;
						if ("class".equals(item.getData("type"))) {
							// The control that will be the editor must be a child of the Tree
							// CHECKSTYLE:OFF cannot use this. here
							final Text newEditor = new Text(mappingTree, SWT.NONE);
							// CHECKSTYLE:ON
							newEditor.setText(item.getText(1));
							newEditor.addModifyListener(new ModifyListener() {
								public void modifyText(final ModifyEvent e) {
									final Text text = (Text) editor.getEditor();
									editor.getItem().setText(1, text.getText());
									updateLaunchConfigurationDialog();
								}
							});
							newEditor.selectAll();
							newEditor.setFocus();
							editor.setEditor(newEditor, item, 1);
						}
					}
				}
			}
		});

		group.pack();
	}

	/**
	 * Create the UI showing imported record libraries.
	 * 
	 * @param group
	 *            parent UI component
	 */
	private void createSourceTable(final Group group) {
		final Composite source = new Composite(group, SWT.NULL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		source.setLayoutData(data);
		final GridLayout layout = new GridLayout(1, false);
		source.setLayout(layout);

		// table
		this.sourceTable = new Table(source, SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		this.sourceTable.setLinesVisible(true);
		this.sourceTable.setHeaderVisible(true);
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		this.sourceTable.setLayoutData(data);
		final String[] titles = { "Libraries" };
		for (int i = 0; i < titles.length; i++) {
			final TableColumn column = new TableColumn(this.sourceTable, SWT.NONE);
			column.setText(titles[i]);
		}

		for (int i = 0; i < titles.length; i++) {
			this.sourceTable.getColumn(i).pack();
		}
		group.pack();

		// buttons
		final Composite sourceButtons = new Composite(source, SWT.NONE);
		final FillLayout buttonLayout = new FillLayout(SWT.HORIZONTAL);
		sourceButtons.setLayout(buttonLayout);

		final Button sourceAddButton = new Button(sourceButtons, SWT.NONE);
		sourceAddButton.setText("Add");

		sourceAddButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				// CHECKSTYLE:OFF this. not allowed
				final TableItem item = new TableItem(sourceTable, SWT.NONE);
				final IFile library = chooseLibraryFile();
				// CHECKSTYLE:ON
				if (library != null) {
					item.setText(0, library.getProjectRelativePath().toString());
					updateLibraryClassMap();
					updateLaunchConfigurationDialog();
				}
			}
		});

		final Button sourceDeleteButton = new Button(sourceButtons, SWT.NONE);
		sourceDeleteButton.setText("Delete");

		sourceDeleteButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				// CHECKSTYLE:OFF this. not allowed
				final int index = sourceTable.getSelectionIndex();
				if (index != -1) {
					sourceTable.remove(index);
					updateLaunchConfigurationDialog();
				}
				// CHECKSTYLE:ON
			}
		});
	}

	/**
	 * Check all libraries in the source list and add their IMonitoringRecord classes to the
	 * mappingTree.
	 */
	private void updateLibraryClassMap() {
		final ClassFinder finder = new ClassFinder();
		for (TableItem tempItem : this.sourceTable.getItems()) {
			final IFile file = this.selectedProject.getFile(tempItem.getText(0));
			finder.add(new File(file.getLocation().toOSString()));
		}

		final ClassFilter filter = new SubclassClassFilter(
		        kieker.common.record.IMonitoringRecord.class);

		final Collection<ClassInfo> classes = new ArrayList<ClassInfo>();
		finder.findClasses(classes, filter);

		for (ClassInfo clazz : classes) {
			addtoTree("", clazz.getClassName(), Arrays.asList(clazz.getClassName().split("\\."))
			        .iterator());
		}
	}

	/**
	 * Add a class to the first level of a tree. This normally results on putting there just the
	 * package name and subsequently call addtoTree for sub items.
	 * 
	 * @param id
	 *            the id of the class
	 * @param className
	 *            name of the class
	 * @param path
	 *            an iterator returning the next level of the class name
	 */
	protected void addtoTree(final String id, final String className, final Iterator<String> path) {
		if (path.hasNext()) {
			final String node = path.next();
			boolean found = false;
			for (TreeItem item : this.mappingTree.getItems()) {
				if (item.getText().equals(node)) {
					found = true;
					this.addtoTree(item, id, className, path);
					break;
				}
			}
			if (!found) {
				final TreeItem newItem = new TreeItem(this.mappingTree, SWT.NONE);
				newItem.setText(0, node);
				if (path.hasNext()) {
					newItem.setText(1, "- package -");
					newItem.setData("type", "package");
				} else {
					newItem.setText(1, id);
					newItem.setData("type", "class");
					newItem.setData("class", className);
				}

				this.addtoTree(newItem, id, className, path);
			}
		}
	}

	/**
	 * Add a class to an arbitrary level of a tree,by adding it to a parent tree item. This results
	 * either on putting there a package node and call subsequently addToTree again or place a node
	 * with the simple class name in the tree.
	 * 
	 * @param parent
	 *            the parent TreeItem
	 * @param id
	 *            the id of the class
	 * @param className
	 *            name of the class
	 * @param path
	 *            an iterator returning the next level of the class name
	 */
	protected void addtoTree(final TreeItem parent, final String id, final String className,
	        final Iterator<String> path) {
		if (path.hasNext()) {
			final String node = path.next();
			boolean found = false;
			for (TreeItem item : parent.getItems()) {
				if (item.getText().equals(node)) {
					found = true;
					this.addtoTree(item, id, className, path);
					break;
				}
			}
			if (!found) {
				final TreeItem newItem = new TreeItem(parent, SWT.NONE);
				newItem.setText(0, node);
				if (path.hasNext()) {
					newItem.setText(1, "- package -");
					newItem.setData("type", "package");
				} else {
					newItem.setText(1, id);
					newItem.setData("type", "class");
					newItem.setData("class", className);
				}

				this.addtoTree(newItem, id, className, path);
			}
		} else {
			if (!"".equals(id)) {
				parent.setText(1, id);
			}
		}
	}

	/**
	 * Choose a library file and return an IFile reference.
	 * 
	 * @return returns either one selected IFile reference or null
	 */
	private IFile chooseLibraryFile() {
		if (this.selectedProject != null) {
			final FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(
			        getShell(), false, this.selectedProject, IResource.FILE);
			dialog.setInitialPattern("*.jar");
			dialog.setTitle("Selection of libraries containing Kieker record classes.");
			if (dialog.open() == Window.OK) {
				final Object[] files = dialog.getResult();
				if (files.length > 0) {
					return (IFile) files[0];
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.
	 * ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
		        new ArrayList<String>());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS,
		        new HashMap<String, String>());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.
	 * ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {
		// get data from the launch configuration an pass it to the form elements
		try {
			final String projectName = configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, "");
			if (!"".equals(projectName))
				this.selectedProject = ResourcesPlugin.getWorkspace().getRoot()
				        .getProject(projectName);
			this.sourceTable.removeAll();
			for (Object library : configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
			        new ArrayList<String>())) {
				final TableItem item = new TableItem(this.sourceTable, SWT.NONE);
				item.setText(0, (String) library);
			}
			this.updateLibraryClassMap();
			@SuppressWarnings("unchecked")
			final Map<String, String> map = configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS,
			        new HashMap<String, String>());
			for (String key : map.keySet()) {
				final String entry = map.get(key);
				this.addtoTree(key, entry, Arrays.asList(entry.split("\\.")).iterator());
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		// Transfer data from the form to the launch configuration
		final List<String> recordLibs = new ArrayList<String>();
		for (int row = 0; row < this.sourceTable.getItemCount(); row++) {
			recordLibs.add(this.sourceTable.getItem(row).getText(0));
		}
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
		        recordLibs);

		final Map<String, String> recordIds = new HashMap<String, String>();
		getMappings(recordIds);
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS,
		        recordIds);
	}

	/**
	 * Retrieve class and class mapping ids for the configuration. Handle first level of the tree.
	 * 
	 * @param recordIds
	 *            map of class and ids
	 */
	private void getMappings(final Map<String, String> recordIds) {
		for (TreeItem item : this.mappingTree.getItems()) {
			if (item.getData("class") != null) { // class node
				try {
					Integer.parseInt(item.getText(1)); // this checks if the text is an integer
					recordIds.put(item.getText(1), (String) item.getData("class"));
				} catch (java.lang.NumberFormatException e) {
					// classes without mapping must not be stored in the map
				}
			} else {
				this.getMappings(item, recordIds);
			}
		}
	}

	/**
	 * Retrieve class and class mapping ids for the configuration. Handle any other level of the
	 * tree.
	 * 
	 * @param parent
	 *            parent tree node
	 * @param recordIds
	 *            map of class and ids
	 */
	private void getMappings(final TreeItem parent, final Map<String, String> recordIds) {
		for (TreeItem item : parent.getItems()) {
			if (item.getData("class") != null) { // class node
				try {
					Integer.parseInt(item.getText(1)); // this checks if the text is an integer
					recordIds.put(item.getText(1), (String) item.getData("class"));
				} catch (java.lang.NumberFormatException e) {
					// classes without mapping must not be stored in the map
				}
			} else {
				this.getMappings(item, recordIds);
			}
		}
	}

	@Override
	public String getName() {
		return "Class Mapping";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug
	 * .core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#canSave()
	 */
	@Override
	public boolean canSave() {
		return true;
	}

}
