/**
 * 
 */
package de.cau.cs.se.kieker.service.launch;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
 * @author rju
 * 
 */
public class ClassMappingTab extends AbstractLaunchConfigurationTab {

	private Composite tab;
	private Tree mappingTree;
	private Table sourceTable;

	IProject selectedProject; // hack to get the project for dialogs

	@Override
	public void createControl(Composite parent) {
		tab = new Composite(parent, SWT.NONE);
		setControl(tab);

		final GridLayout layout = new GridLayout(1, true);
		tab.setLayout(layout);

		createMapTable();
	}

	private void createMapTable() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Mapping Table");

		// content
		createMappingTree(group);
		createSourceTable(group);

	}

	private void createMappingTree(Group group) {
		mappingTree = new Tree(group, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		mappingTree.setLinesVisible(true);
		mappingTree.setHeaderVisible(true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		mappingTree.setLayoutData(data);
		
		TreeColumn column = new TreeColumn(mappingTree, SWT.LEFT);
		column.setText("Path");
		column.setWidth(250);
		
		column = new TreeColumn(mappingTree, SWT.RIGHT);
		column.setText("Id");
		column.setWidth(50);
		
		final TreeEditor editor = new TreeEditor(mappingTree);
        //The editor must have the same size as the cell and must
        //not be any smaller than 50 pixels.
        editor.horizontalAlignment = SWT.LEFT;
        editor.grabHorizontal = true;
        editor.minimumWidth = 50;
        
        mappingTree.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
            	// Clean up any previous editor control
                Control oldEditor = editor.getEditor();
                if (oldEditor != null)
                	oldEditor.dispose();
            	if (e.item == null)
            		return;
        		if (e.item instanceof TreeItem) {
        			TreeItem item = (TreeItem)e.item;
        			if (item.getData("type").equals("class")) {
	                    // The control that will be the editor must be a child of the Tree
	                    Text newEditor = new Text(mappingTree, SWT.NONE);
	                    newEditor.setText(item.getText(1));
	                    newEditor.addModifyListener(new ModifyListener() {
	                            public void modifyText(ModifyEvent e) {
	                                    Text text = (Text)editor.getEditor();
	                                    editor.getItem().setText(1,text.getText());
	                            }
	                    });
	                    newEditor.selectAll();
	                    newEditor.setFocus();
	                    editor.setEditor(newEditor, item, 1);
        			}
        		}
            }
        });
        		
		group.pack();
	}

	/**
	 * Create the UI showing imported record libraries
	 * 
	 * @param group
	 */
	private void createSourceTable(Group group) {
		Composite source = new Composite(group, SWT.NULL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		source.setLayoutData(data);
		final GridLayout layout = new GridLayout(1, false);
		source.setLayout(layout);

		// table
		sourceTable = new Table(source, SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		sourceTable.setLinesVisible(true);
		sourceTable.setHeaderVisible(true);
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		sourceTable.setLayoutData(data);
		String[] titles = { "Libraries" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(sourceTable, SWT.NONE);
			column.setText(titles[i]);
		}

		for (int i = 0; i < titles.length; i++) {
			sourceTable.getColumn(i).pack();
		}
		group.pack();

		// buttons
		Composite sourceButtons = new Composite(source, SWT.NONE);
		FillLayout buttonLayout = new FillLayout(SWT.HORIZONTAL);
		sourceButtons.setLayout(buttonLayout);

		Button sourceAddButton = new Button(sourceButtons, SWT.NONE);
		sourceAddButton.setText("Add");

		sourceAddButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem item = new TableItem(sourceTable, SWT.NONE);
				IFile library = chooseLibraryFile();
				if (library != null) {
					item.setText(0, library.getProjectRelativePath().toString());
					ClassFinder finder = new ClassFinder();
					Collection<URL> urls = new ArrayList<URL>();
					for (TableItem tempItem : sourceTable.getItems()) {
						try {
							IFile file = selectedProject.getFile(tempItem.getText(0));
							urls.add(file.getLocationURI().toURL());
							finder.add(new File(file.getLocation().toOSString()));
						} catch (MalformedURLException e1) {
							// TODO This should not happen, as the URI is synthesised by Eclipse
							e1.printStackTrace();
						}
					}

					ClassFilter filter = new SubclassClassFilter(
					        kieker.common.record.IMonitoringRecord.class);

					Collection<ClassInfo> classes = new ArrayList<ClassInfo>();
					finder.findClasses(classes, filter);

					for (ClassInfo clazz : classes) {
						addtoTree(mappingTree,Arrays.asList(clazz.getClassName().split("\\.")).iterator());
					}

					updateLaunchConfigurationDialog();
				}
			}
		});

		Button sourceDeleteButton = new Button(sourceButtons, SWT.NONE);
		sourceDeleteButton.setText("Delete");

		sourceDeleteButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = sourceTable.getSelectionIndex();
				if (index != -1) {
					sourceTable.remove(index);
					updateLaunchConfigurationDialog();
				}
			}
		});
	}

	protected void addtoTree(Tree tree, Iterator<String> path) {
		if (path.hasNext()) {
			String node = path.next();
			boolean found = false;
			for (TreeItem item : tree.getItems()) {
				if (item.getText().equals(node)) {
					found = true;
					addtoTree (item,path);
					break;
				}
			}
			if (!found) {
				TreeItem newItem = new TreeItem (tree,SWT.NONE);
				newItem.setText(0,node);
				newItem.setText(1,path.hasNext()?"- package -":"");
				newItem.setData("type",path.hasNext()?"package":"class");
				addtoTree (newItem,path);
			}
		}
    }
	
	protected void addtoTree(TreeItem parent, Iterator<String> path) {
		if (path.hasNext()) {
			String node = path.next();
			boolean found = false;
			for (TreeItem item : parent.getItems()) {
				if (item.getText().equals(node)) {
					found = true;
					addtoTree (item,path);
					break;
				}
			}
			if (!found) {
				TreeItem newItem = new TreeItem (parent,SWT.NONE);
				newItem.setText(0,node);
				newItem.setText(1,path.hasNext()?"- package -":"");
				newItem.setData("type",path.hasNext()?"package":"class");
				addtoTree (newItem,path);
			}
		}
    }

	private IFile chooseLibraryFile() {
		if (selectedProject != null) {
			FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(
			        getShell(), false, selectedProject, IResource.FILE);
			dialog.setInitialPattern("*.jar");
			dialog.setTitle("Selection of libraries containing Kieker record classes.");
			if (dialog.open() == Window.OK) {
				final Object[] files = dialog.getResult();
				if (files.length > 0)
					return (IFile) files[0];
			}
		}
		return null;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
		        new ArrayList<String>());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS,
		        new HashMap<String, String>());
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// get data from the launch configuration an pass it to the form elements
		try {
			selectedProject = ResourcesPlugin
			        .getWorkspace()
			        .getRoot()
			        .getProject(
			                configuration.getAttribute(
			                        KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, ""));
			sourceTable.removeAll();
			for (Object library : configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
			        new ArrayList<String>())) {
				TableItem item = new TableItem(sourceTable, SWT.NONE);
				item.setText(0, (String) library);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// Transfer data from the form to the launch configuration
		List<String> recordLibs = new ArrayList<String>();
		for (int row = 0; row < sourceTable.getItemCount(); row++) {
			recordLibs.add(sourceTable.getItem(row).getText(0));
		}
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS,
		        recordLibs);

		Map<String, String> recordIds = new HashMap<String, String>();
		for (int row = 0; row < mappingTree.getItemCount(); row++) {
			recordIds.put(mappingTree.getItem(row).getText(0), mappingTree.getItem(row)
			        .getText(1));
		}
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS,
		        recordIds);
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
	public boolean isValid(ILaunchConfiguration launchConfig) {
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
