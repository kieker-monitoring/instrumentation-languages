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
 * @since 1.0
 */
public final class TargetsPreferences {

	/** Node id for the preference store. */
	public static final String PLUGIN_ID = "kieker.develop.rl";
	/** Constant prefix for generator activation. */
	public static final String GENERATOR_ACTIVE = TargetsPreferences.class + ".generator.";
	/** Constant for author name in generators. */
	public static final String AUTHOR_NAME = TargetsPreferences.class + ".author";
	/** Constant for the target version of Kieker. */
	public static final String TARGET_VERSION = TargetsPreferences.class + ".targetVersion";
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

	/**
	 * Get the author name from the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @return Returns the default author name
	 */
	public static String getAuthorName(final IEclipsePreferences preferenceStore) {
		return preferenceStore.get(AUTHOR_NAME, DEFAULT_AUTHOR);
	}

	/**
	 * Store the author name in the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param author
	 *            the author name to be stored
	 */
	public static void setAuthorName(final IEclipsePreferences preferenceStore, final String author) {
		preferenceStore.put(AUTHOR_NAME, author);
	}
	

	/**
	 * Get the Kieker target version from the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @return Returns the target version
	 */
	public static String getTargetVersion(IEclipsePreferences preferenceStore) {
		return preferenceStore.get(TARGET_VERSION, DEFAULT_VERSION);
	}
	
	/**
	 * Store the target version in the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param targetVersion
	 *            the target version to be stored
	 */
	public static void setTargetVersion(final IEclipsePreferences preferenceStore, final String targetVersion) {
		preferenceStore.put(TARGET_VERSION, targetVersion);
	}

	/**
	 * Get the version id from the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @return Returns the default version ID
	 */
	public static String getVersionID(final IEclipsePreferences preferenceStore) {
		return preferenceStore.get(VERSION_ID, DEFAULT_VERSION);
	}

	/**
	 * Store the version id for the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param version
	 *            the version ID to be stored
	 */
	public static void setVersionID(final IEclipsePreferences preferenceStore, final String version) {
		preferenceStore.put(VERSION_ID, version);
	}

	/**
	 * Check if the generator is set active in the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param id
	 *            the generator id
	 * @return Returns true if active
	 */
	public static boolean isGeneratorActive(final IEclipsePreferences preferenceStore, final String id) {
		return preferenceStore.getBoolean(GENERATOR_ACTIVE + id, DEFAULT_GENERATOR_INACTIVE);
	}

	/**
	 * Store the generator state to the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param id
	 *            the generator id
	 * @param active
	 *            the state of the generator
	 */
	public static void setGeneratorActive(final IEclipsePreferences preferenceStore, final String id, final boolean active) {
		preferenceStore.putBoolean(GENERATOR_ACTIVE + id, active);
	}

	/**
	 * Get the header comment from the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param id
	 *            the generator id
	 * @return Returns the header comment
	 */
	public static String getHeaderComment(final IEclipsePreferences preferenceStore, final String id) {
		return preferenceStore.get(GENERATOR_HEADER_COMMENT + id, "");
	}

	/**
	 * Store the header comment in the specified preference store.
	 *
	 * @param preferenceStore
	 *            the preference store
	 * @param id
	 *            the generator id
	 *            the id of the generator
	 * @param headerComment
	 *            the header comment
	 */
	public static void setHeaderComment(final IEclipsePreferences preferenceStore, final String id, final String headerComment) {
		preferenceStore.put(GENERATOR_HEADER_COMMENT + id, headerComment);
	}

}
