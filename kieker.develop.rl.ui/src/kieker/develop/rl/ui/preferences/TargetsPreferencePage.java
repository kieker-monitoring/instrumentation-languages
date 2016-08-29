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
package kieker.develop.rl.ui.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import kieker.develop.rl.preferences.TargetsPreferences;

// http://www.vogella.com/tutorials/EclipsePreferences/article.html

/**
 * Implements a simple preference page for IRL.
 *
 * Created after: http://xtextcasts.org/episodes/21-preference-page
 *
 * @author Reiner Jung
 *
 */
public class TargetsPreferencePage extends AbstractFieldEditorOverlayPage implements IWorkbenchPreferencePage {

	/** page id constant. */
	public static final String PAGE_ID = "kieker.develop.rl.ui.preferences.TargetsPreferencePage";

	/**
	 * Initialize preference page.
	 */
	public TargetsPreferencePage() {
		super(GRID);
		final IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, TargetsPreferences.PLUGIN_ID);
		this.setPreferenceStore(store);
		this.setDescription("Target and Output Configuration");
	}

	/**
	 *  We override the createControl method.
	 * In case of property pages we create a new PropertyStore as local preference store.
	 * After all control have been create, we enable/disable these controls.
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createControl()
	 */
	@Override
	public void createControl(final Composite parent) {
		// Special treatment for property pages
		super.createControl(parent);
	}

	/**
	 * Initializes the preference page of the given workbench.
	 *
	 * @param workbench the workbench
	 */
	public void init(final IWorkbench workbench) {
	}

}
