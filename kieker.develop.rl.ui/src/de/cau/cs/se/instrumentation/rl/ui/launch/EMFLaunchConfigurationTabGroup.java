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
package kieker.develop.rl.ui.launch;

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
		// Auto-generated constructor stub
	}

	/**
	 * Setup tabs.
	 * 
	 * @param dialog the launch configuration dialog
	 * @param mode execution mode
	 */
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
		this.setTabs(new ILaunchConfigurationTab[] { new EMFProjectTab() });
	}

}
