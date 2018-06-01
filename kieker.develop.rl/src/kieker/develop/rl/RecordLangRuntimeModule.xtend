/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl

import kieker.develop.rl.typing.jar.JarModelGlobalScopeProvider
import com.google.inject.Binder
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import com.google.inject.Singleton
import kieker.develop.rl.scoping.SemanticAnnotationHandler
import kieker.develop.rl.scoping.ISemanticAnnotationHandler
import kieker.develop.rl.outlet.RecordLangOutletConfigurationProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 * 
 * @author Reiner Jung
 */
class RecordLangRuntimeModule extends AbstractRecordLangRuntimeModule {
	/**
	 * {@inheritDoc}<br>
	 * This extension registers the custom {@link TypeGlobalScopeProvider} that realizes e.g. the
	 * correct linking of primitive data types. The implementation of that part is broadly transfered
	 * from the JVMTypes binding.
	 */
	override Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return JarModelGlobalScopeProvider
	}

	/**
	 * Register my own output outlet provider. We need an outlet for each language.
	 */
	override void configure(Binder binder) {
		super.configure(binder)
		binder.bind(IOutputConfigurationProvider).to(RecordLangOutletConfigurationProvider).in(Singleton)
		// TODO what is this doing here?
		binder.bind(ISemanticAnnotationHandler).to(SemanticAnnotationHandler).in(Singleton)
	}
}
