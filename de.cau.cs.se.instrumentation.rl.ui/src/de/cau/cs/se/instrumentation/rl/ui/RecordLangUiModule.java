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

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * @author Reiner Jung
 */
public class RecordLangUiModule extends de.cau.cs.se.instrumentation.rl.ui.AbstractRecordLangUiModule {

	/**
	 * Generic UI constructor.
	 * 
	 * @param plugin the parent plugin for the module
	 */
	public RecordLangUiModule(final AbstractUIPlugin plugin) {
		super(plugin);
	}

	/**
	 * Add highlighting calculator for types.
	 * 
	 * @return return the highlighter
	 */
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return TypesHighlightingCalculator.class;
	}

	/**
	 * Add highlighting configuration for types.
	 * 
	 * @return return the configuration
	 */
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return TypesHighlightingConfiguration.class;
	}

	/**
	 * Overriding original implementation.
	 * 
	 * @param binder binder to assign interfaces with classes
	 */
	//	@Override
	//	public void configureBuilderPreferenceStoreInitializer(final com.google.inject.Binder binder) {
	//		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).
	//		annotatedWith(com.google.inject.name.Names.named("builderPreferenceInitializer")).
	//		to(RecordLangBuilderPreferenceAccess.Initializer.class);
	//	}
}
