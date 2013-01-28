/**
 * 
 */
package de.cau.cs.se.kieker.service.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;


/**
 * @author rju
 *
 */
public class ClassMappingTab extends AbstractLaunchConfigurationTab {

	private Composite tab;
	private Table mappingTable;
	private Table sourceTable;
	
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
	
	private void createSourceTable(Group group) {
		sourceTable = new Table (group, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		sourceTable.setLinesVisible (true);
		sourceTable.setHeaderVisible (true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		sourceTable.setLayoutData(data);
		String[] titles = {"Libraries", "Modify"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (sourceTable, SWT.NONE);
			column.setText (titles [i]);
		}
		TableItem item = new TableItem (sourceTable, SWT.NONE);
		item.setText (0, "-- add new library --");
		item.setText (1, "(Button)");
		
		for (int i=0; i<titles.length; i++) {
			sourceTable.getColumn (i).pack ();
		}	
		group.pack ();
	}

	@Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void initializeFrom(ILaunchConfiguration configuration) {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public String getName() {
	    return "Class Mapping";
    }

}
