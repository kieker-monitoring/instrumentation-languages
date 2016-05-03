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
	/** Header Comment. */
	public static final String GENERATOR_HEADER_COMMENT = TargetsPreferences.class + ".comment.";
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

	public static String getAuthorName(final IEclipsePreferences preferenceStore) {
		return preferenceStore.get(AUTHOR_NAME, DEFAULT_AUTHOR);
	}

	public static void setAuthorName(final IEclipsePreferences preferenceStore, final String author) {
		preferenceStore.put(AUTHOR_NAME, author);
	}

	public static String getVersionID(final IEclipsePreferences preferenceStore) {
		return preferenceStore.get(VERSION_ID, DEFAULT_VERSION);
	}

	public static void setVersionID(final IEclipsePreferences preferenceStore, final String version) {
		preferenceStore.put(VERSION_ID, version);
	}

	public static boolean isGeneratorActive(final IEclipsePreferences preferenceStore, final String id) {
		return preferenceStore.getBoolean(GENERATOR_ACTIVE + id, DEFAULT_GENERATOR_INACTIVE);
	}

	public static void setGeneratorActive(final IEclipsePreferences preferenceStore, final String id, final boolean active) {
		preferenceStore.putBoolean(GENERATOR_ACTIVE + id, active);
	}

	public static String getHeaderComment(final IEclipsePreferences preferenceStore, final String id) {
		return preferenceStore.get(GENERATOR_HEADER_COMMENT + id, "");
	}

	public static void setHeaderComment(final IEclipsePreferences preferenceStore, final String id, final String headerComment) {
		preferenceStore.put(GENERATOR_HEADER_COMMENT + id, headerComment);
	}

}
