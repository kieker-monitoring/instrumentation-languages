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
package de.cau.cs.se.instrumentation.rl.ui;

import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.OUTPUT_PREFERENCE_TAG; // NOCS

import org.eclipse.jface.preference.IPreferenceStore; // NOCS
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.ui.editor.preferences.PreferenceConstants;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.cau.cs.se.instrumentation.rl.ouput.config.IRecordLangOutputConfigurationProvider;
import de.cau.cs.se.instrumentation.rl.ouput.config.RecordLangOutputConfiguration;

/**
 * @author Reiner Jung
 *
 */
@Singleton
public class RecordLangBuilderPreferenceAccess {

	/**
	 * Name of a preference for configuring whether the builder participant is enabled or not.
	 */
	public static final String PREF_AUTO_BUILDING = "autobuilding"; //$NON-NLS-1$

	/** used to describe an active generator. */
	public static final String GENERATOR_ACTIVE = "generator-active";

	private IPreferenceStoreAccess preferenceStoreAccess;

	/**
	 * 
	 */
	public RecordLangBuilderPreferenceAccess() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	public void setPreferenceStoreAccess(final IPreferenceStoreAccess preferenceStoreAccess) {
		this.preferenceStoreAccess = preferenceStoreAccess;
	}

	/**
	 * local get key helper.
	 * 
	 * @param outputConfiguration the output configuration
	 * @param preferenceName the name of the preference to search for
	 * 
	 * @return the correct search key
	 */
	public static String getKey(final OutputConfiguration outputConfiguration, final String preferenceName) {
		return OUTPUT_PREFERENCE_TAG + PreferenceConstants.SEPARATOR + outputConfiguration.getName()
				+ PreferenceConstants.SEPARATOR + preferenceName;
	}

	/**
	 * Tell if auto build is enabled.
	 * 
	 * @param context local context
	 * @return true is the parameter is set.
	 */
	public boolean isAutoBuildEnabled(final Object context) {
		final IPreferenceStore preferenceStore = this.preferenceStoreAccess.getContextPreferenceStore(context);
		return preferenceStore.contains(PREF_AUTO_BUILDING) ? preferenceStore.getBoolean(PREF_AUTO_BUILDING) : true; // NOCS
	}

	/**
	 * Set auto build parameter.
	 * 
	 * @param context local context
	 * @param enabled the value to be set
	 */
	public void setAutoBuildEnabled(final Object context, final boolean enabled) {
		final IPreferenceStore preferenceStore = this.preferenceStoreAccess.getWritablePreferenceStore(context);
		preferenceStore.setValue(PREF_AUTO_BUILDING, enabled);
	}

	/** Initializer. */
	public static class Initializer implements IPreferenceStoreInitializer {

		private IRecordLangOutputConfigurationProvider outputConfigurationProvider;

		/** Default constructor. */
		public Initializer() { }

		public IRecordLangOutputConfigurationProvider getOutputConfigurationProvider() {
			return this.outputConfigurationProvider;
		}

		@Inject
		public void setOutputConfigurationProvider(final IRecordLangOutputConfigurationProvider outputConfigurationProvider) {
			this.outputConfigurationProvider = outputConfigurationProvider;
		}

		/**
		 * Initialize from preference store.
		 * 
		 * @param preferenceStoreAccess access to the preference store.
		 */
		public void initialize(final IPreferenceStoreAccess preferenceStoreAccess) {
			final IPreferenceStore store = preferenceStoreAccess.getWritablePreferenceStore();
			this.intializeBuilderPreferences(store);
			this.initializeOutputPreferences(store);
		}

		private void intializeBuilderPreferences(final IPreferenceStore store) {
			store.setDefault(PREF_AUTO_BUILDING, true);
		}

		private void initializeOutputPreferences(final IPreferenceStore store) {
			for (final RecordLangOutputConfiguration configuration : this.outputConfigurationProvider.getOutputConfigurations()) {
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_NAME),
						configuration.getName());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_DESCRIPTION),
						configuration.getDescription());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_DERIVED),
						configuration.isSetDerivedProperty());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_DIRECTORY),
						configuration.getOutputDirectory());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_CREATE_DIRECTORY),
						configuration.isCreateOutputDirectory());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_CLEAN_DIRECTORY),
						configuration.isCanClearOutputDirectory());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_OVERRIDE),
						configuration.isOverrideExistingResources());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_CLEANUP_DERIVED),
						configuration.isCleanUpDerivedResources());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.INSTALL_DSL_AS_PRIMARY_SOURCE),
						configuration.isInstallDslAsPrimarySource());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.HIDE_LOCAL_SYNTHETIC_VARIABLES),
						configuration.isHideSyntheticLocalVariables());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, EclipseOutputConfigurationProvider.OUTPUT_KEEP_LOCAL_HISTORY),
						configuration.isKeepLocalHistory());
				store.setDefault(RecordLangBuilderPreferenceAccess.getKey(configuration, RecordLangBuilderPreferenceAccess.GENERATOR_ACTIVE),
						configuration.isActive());
			}
		}

	}



}
