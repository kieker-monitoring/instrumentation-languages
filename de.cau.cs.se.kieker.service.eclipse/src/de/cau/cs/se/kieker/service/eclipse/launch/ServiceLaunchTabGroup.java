/**
 * 
 */
package de.cau.cs.se.kieker.service.eclipse.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * @author rju
 * 
 */
public class ServiceLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

	/**
	 * 
	 */
	public ServiceLaunchTabGroup() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse
	 * .debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		final ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new ServiceSetupTab(), new ClassMappingTab() };
		setTabs(tabs);
	}

}
