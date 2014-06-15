/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * @author reiner
 *
 */
public class EMFLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

	/**
	 * 
	 */
	public EMFLaunchConfigurationTabGroup() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	@Override
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
		this.setTabs(new ILaunchConfigurationTab[] { new EMFProjectTab() });
	}

}
