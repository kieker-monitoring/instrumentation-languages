/**
 * 
 */
package de.cau.cs.se.kieker.service.launch;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kieker.common.record.IMonitoringRecord;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;


/**
 * @author rju
 *
 */
public class ClassMappingTab extends AbstractLaunchConfigurationTab {

	private Composite tab;
	private Table mappingTable;
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
		createMappingTable(group);
		createSourceTable(group);
		
	}
	
	private void createMappingTable(Group group) {
		mappingTable = new Table (group, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		mappingTable.setLinesVisible (true);
		mappingTable.setHeaderVisible (true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		mappingTable.setLayoutData(data);
		String[] titles = {"Id", "Class"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (mappingTable, SWT.NONE);
			column.setText (titles [i]);
		}
		
		for (int i=0; i<titles.length; i++) {
			mappingTable.getColumn (i).pack ();
		}	
		group.pack ();
	}
	
	/**
	 * Create the UI showing imported record libraries
	 * 
	 * @param group
	 */
	private void createSourceTable(Group group) {
		Composite source = new Composite (group, SWT.NULL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		source.setLayoutData(data);
		final GridLayout layout = new GridLayout(1, false);
		source.setLayout(layout);
		
		// table
		sourceTable = new Table (source, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		sourceTable.setLinesVisible (true);
		sourceTable.setHeaderVisible (true);
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		sourceTable.setLayoutData(data);
		String[] titles = {"Libraries"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (sourceTable, SWT.NONE);
			column.setText (titles [i]);
		}
		
		for (int i=0; i<titles.length; i++) {
			sourceTable.getColumn (i).pack ();
		}
		group.pack ();
		
		// buttons
		Composite sourceButtons = new Composite (source,SWT.NONE);
		FillLayout buttonLayout = new FillLayout (SWT.HORIZONTAL);
		sourceButtons.setLayout(buttonLayout);
		
		Button sourceAddButton = new Button (sourceButtons,SWT.NONE);
		sourceAddButton.setText("Add");
		
		sourceAddButton.addSelectionListener(new SelectionAdapter() {

			@Override
            public void widgetSelected(SelectionEvent e) {
				TableItem item = new TableItem (sourceTable, SWT.NONE);
	            IFile library = chooseLibraryFile();
	            if (library != null) {
	            	item.setText(0, library.getProjectRelativePath().toString());
	            	List<URL> tempURLs = new ArrayList<URL>();
	            	for (TableItem tempItem : sourceTable.getItems()) {
	            		
	            		try {
	                        tempURLs.add(selectedProject.getFile(tempItem.getText(0)).getRawLocationURI().toURL());
                        } catch (MalformedURLException e1) {
	                        // TODO Auto-generated catch block
	                        e1.printStackTrace();
                        }
	            	}
	          
	            	URL urls[] = tempURLs.toArray(new URL[tempURLs.size()]);
	            	Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(urls).setScanners(new ResourcesScanner()));
	            	Set<Class<? extends IMonitoringRecord>> classes = reflections.getSubTypesOf(kieker.common.record.IMonitoringRecord.class);
	            	
	            	for (Class<? extends IMonitoringRecord> clazz : classes) {
	            		boolean classListed = false;
	            		for (TableItem tempItem : mappingTable.getItems()) {
	            			if (tempItem.getText(1).equals(clazz.getCanonicalName())) {
	            				classListed = true;
	            				break;
	            			}
	            		}
	            		if (!classListed) {
	            			TableItem newItem = new TableItem (mappingTable, SWT.NONE);
	            			newItem.setText(0, "");
	            			newItem.setText(1,clazz.getCanonicalName());
	            		}
	            	}
	            	
	            	updateLaunchConfigurationDialog();
	            }
            }			
		});
		
		Button sourceDeleteButton = new Button (sourceButtons,SWT.NONE);
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
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS, new ArrayList<String>());
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS, new HashMap<String,String>());
    }

	@Override
    public void initializeFrom(ILaunchConfiguration configuration) {
		// get data from the launch configuration an pass it to the form elements
		try {
	        selectedProject = ResourcesPlugin.getWorkspace().getRoot().getProject(configuration.getAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT,""));
			sourceTable.removeAll();
	        for (Object library : configuration.getAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS, new ArrayList<String>())) {
	        	TableItem item = new TableItem (sourceTable, SWT.NONE);
	        	item.setText(0, (String)library);
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
		for (int row=0;row<sourceTable.getItemCount();row++) {
			recordLibs.add(sourceTable.getItem(row).getText(0));
		}
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_LIBS, recordLibs);
		
		Map<String,String> recordIds = new HashMap<String,String>();
		for (int row=0;row<mappingTable.getItemCount();row++) {
			recordIds.put(mappingTable.getItem(row).getText(0),mappingTable.getItem(row).getText(1));
		}
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_RECORD_IDS, recordIds);
    }

	@Override
    public String getName() {
	    return "Class Mapping";
    }
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug
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
