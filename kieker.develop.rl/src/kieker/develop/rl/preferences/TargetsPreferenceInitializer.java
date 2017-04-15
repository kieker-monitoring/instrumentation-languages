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
package kieker.develop.rl.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * @author Reiner Jung
 * @since 1.0
 */
public class TargetsPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Dummy constructor.
	 */
	public TargetsPreferenceInitializer() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		for (final AbstractOutletConfiguration<ComplexType, Object> configuration : GeneratorRegistration.getOutletConfigurations()) {
			TargetsPreferenceInitializer.getPreferenceStore().putBoolean(TargetsPreferences.GENERATOR_ACTIVE + configuration.getName(),
					TargetsPreferences.DEFAULT_GENERATOR_INACTIVE);
		}

		TargetsPreferenceInitializer.getPreferenceStore().put(TargetsPreferences.AUTHOR_NAME, TargetsPreferences.DEFAULT_AUTHOR);
		TargetsPreferenceInitializer.getPreferenceStore().put(TargetsPreferences.VERSION_ID, TargetsPreferences.DEFAULT_VERSION);
	}

	/**
	 * Provide a default scope for the generator.
	 *
	 * @return return the default scope
	 */
	public static IEclipsePreferences getPreferenceStore() {
		return DefaultScope.INSTANCE.getNode(TargetsPreferences.PLUGIN_ID);
	}

}
