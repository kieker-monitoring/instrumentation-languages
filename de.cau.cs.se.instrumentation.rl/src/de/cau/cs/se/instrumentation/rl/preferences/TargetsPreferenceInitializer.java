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
package de.cau.cs.se.instrumentation.rl.preferences;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.GeneratorConfiguration;

/**
 * @author Reiner Jung
 * 
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
		for (final Class<?> generatorClass : GeneratorConfiguration.RECORD_TYPE_GENERATORS) {
			try {
				final AbstractRecordTypeGenerator generator = (AbstractRecordTypeGenerator) generatorClass.getConstructor().newInstance();
				TargetsPreferenceInitializer.getPreferenceStore().
						putBoolean(TargetsPreferences.GENERATOR_ACTIVE + generator.getId(),
								TargetsPreferences.DEFAULT_GENERATOR_INACTIVE);
			} catch (final IllegalArgumentException e) {
				e.printStackTrace();
			} catch (final SecurityException e) {
				e.printStackTrace();
			} catch (final InstantiationException e) {
				e.printStackTrace();
			} catch (final IllegalAccessException e) {
				e.printStackTrace();
			} catch (final InvocationTargetException e) {
				e.printStackTrace();
			} catch (final NoSuchMethodException e) {
				e.printStackTrace();
			}
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
