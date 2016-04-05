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

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

/**
 * Utility class for preference constants.
 * 
 * @author Reiner Jung
 * 
 */
public final class TargetsPreferences {

	/** Node id for the preference store. */
	public static final String PLUGIN_ID = "kieker.develop.rl";
	/** Constant prefix for generator activation. */
	public static final String GENERATOR_ACTIVE = TargetsPreferences.class + ".generator.";
	/** Constant for author name in generators. */
	public static final String AUTHOR_NAME = TargetsPreferences.class + ".author";
	/** Constant for version id in generators. */
	public static final String VERSION_ID = TargetsPreferences.class + ".version";
	/** Default author. */
	public static final String DEFAULT_AUTHOR = "Generic Kieker";
	/** Default version. */
	public static final String DEFAULT_VERSION = "1.10";
	/** Default deactivate all generators. */
	public static final boolean DEFAULT_GENERATOR_INACTIVE = false;

	/**
	 * Dummy constructor.
	 */
	private TargetsPreferences() {}

	public static IEclipsePreferences getPreferenceStore() {
		return InstanceScope.INSTANCE.getNode(PLUGIN_ID);
	}

	public static String getAuthorName() {
		return TargetsPreferences.getPreferenceStore().get(AUTHOR_NAME, DEFAULT_AUTHOR);
	}

	public static void setAuthorName(final String author) {
		TargetsPreferences.getPreferenceStore().put(AUTHOR_NAME, author);
	}

	public static String getVersionID() {
		return TargetsPreferences.getPreferenceStore().get(VERSION_ID, DEFAULT_VERSION);
	}

	public static void setVersionID(final String version) {
		TargetsPreferences.getPreferenceStore().put(VERSION_ID, version);
	}

	public static boolean isGeneratorActive(final String id) {
		return TargetsPreferences.getPreferenceStore().getBoolean(GENERATOR_ACTIVE + id, DEFAULT_GENERATOR_INACTIVE);
	}

	public static void setGeneratorActive(final String id, final boolean active) {
		TargetsPreferences.getPreferenceStore().putBoolean(GENERATOR_ACTIVE + id, active);
	}

}
