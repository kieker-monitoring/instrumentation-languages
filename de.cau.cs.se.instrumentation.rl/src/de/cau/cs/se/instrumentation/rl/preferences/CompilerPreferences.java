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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

import de.cau.cs.se.instrumentation.rl.generator.LanguageSetup;

/**
 * Utility class for preference constants.
 * 
 * @author Reiner Jung
 * 
 */
public final class CompilerPreferences {

	/** Constant prefix for generator activation. */
	public static final String GENERATOR_ACTIVE = CompilerPreferences.class + ".generator.";
	/** Constant for author name in generators. */
	public static final String AUTHOR_NAME = CompilerPreferences.class + ".author";
	/** Constant for version id in generators. */
	public static final String VERSION_ID = CompilerPreferences.class + ".version";

	/**
	 * Dummy constructor.
	 */
	private CompilerPreferences() {}

	public static IEclipsePreferences getPreferenceStore() {
		return InstanceScope.INSTANCE.getNode("de.cau.cs.se.instrumentation.rl");
	}

	public static Map<String, Boolean> getGeneratorActivationProperty() {
		final Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (final String language : LanguageSetup.getPresentLanguages()) {
			map.put(language, CompilerPreferences.getPreferenceStore().getBoolean(GENERATOR_ACTIVE + language, false));
		}
		return map;
	}

	public static String getAuthorName() {
		return CompilerPreferences.getPreferenceStore().get(AUTHOR_NAME, "Generic Kieker");
	}

	public static void setAuthorName(final String author) {
		CompilerPreferences.getPreferenceStore().put(AUTHOR_NAME, author);
	}

	public static String getVersionID() {
		return CompilerPreferences.getPreferenceStore().get(VERSION_ID, "1.10");
	}

	public static void setVersionID(final String version) {
		CompilerPreferences.getPreferenceStore().put(VERSION_ID, version);
	}

	public static boolean isGeneratorActive(final String language) {
		return CompilerPreferences.getPreferenceStore().getBoolean(GENERATOR_ACTIVE + language, false);
	}

	public static void setGeneratorActive(final String language, final boolean active) {
		CompilerPreferences.getPreferenceStore().putBoolean(GENERATOR_ACTIVE + language, active);
	}

}
