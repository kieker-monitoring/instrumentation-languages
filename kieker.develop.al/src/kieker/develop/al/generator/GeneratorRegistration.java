/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.al.generator;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.intermediate.IntermediateModel;
import kieker.develop.rl.generator.IGeneratorProvider;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;

/**
 * Configuration and registration of IAL generators. The class also contains functions for derived
 * values based on the configuration values.
 *
 * @author Reiner Jung
 *
 * @since 1.3
 *
 */
public final class GeneratorRegistration {

	/** extension point name. */
	public static final String GENERATOR_PROVIDER = "kieker.develop.al.generator.provider";
	/** advice extension element name. */
	public static final String ADVICE_EXTENSION_NAME = "advice";
	/** configuration extension element name. */
	public static final String CONFIGURATION_EXTENSION_NAME = "configuration";

	/**
	 * Empty default constructor.
	 */
	private GeneratorRegistration() {
		// utility class nothing to be done here
	}

	/**
	 * Collect all outlets provided by the different generator providers.
	 *
	 * @return Returns a collection of outlet configurations
	 */
	public static Collection<AbstractOutletConfiguration<Advice, Object>> getAdviceOutletConfigurations() {
		final Collection<AbstractOutletConfiguration<Advice, Object>> outletConfigurations = new ArrayList<>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IConfigurationElement[] config = registry
				.getConfigurationElementsFor(GeneratorRegistration.GENERATOR_PROVIDER);

		for (final IConfigurationElement element : config) {
			if (GeneratorRegistration.ADVICE_EXTENSION_NAME.equals(element.getName())) {
				try {
					final Object ext = element.createExecutableExtension("provider");
					System.out.println("success " + ext);
					if (ext instanceof IGeneratorProvider) {
						@SuppressWarnings("unchecked")
						final IGeneratorProvider<Advice, Object> generatorProvider = (IGeneratorProvider<Advice, Object>) ext;
						generatorProvider.addOutletConfigurations(outletConfigurations);
					}
				} catch (final CoreException e) {
					// TODO should be reported as problem
					System.out.println("AL advice generator provider not found for " + element.getNamespaceIdentifier());
				}
			}
		}
		return outletConfigurations;
	}

	/**
	 * Collect all outlets provided by the different generator providers.
	 *
	 * @return Returns a collection of outlet configurations
	 */
	public static Collection<AbstractOutletConfiguration<IntermediateModel, Object>> getConfigurationOutletConfigurations() {
		final Collection<AbstractOutletConfiguration<IntermediateModel, Object>> outletConfigurations = new ArrayList<>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IConfigurationElement[] config = registry
				.getConfigurationElementsFor(GeneratorRegistration.GENERATOR_PROVIDER);

		for (final IConfigurationElement element : config) {
			if (GeneratorRegistration.CONFIGURATION_EXTENSION_NAME.equals(element.getName())) {
				try {
					final Object ext = element.createExecutableExtension("provider");
					System.out.println("success " + ext);
					if (ext instanceof IGeneratorProvider) {
						@SuppressWarnings("unchecked")
						final IGeneratorProvider<IntermediateModel, Object> generatorProvider = (IGeneratorProvider<IntermediateModel, Object>) ext;
						generatorProvider.addOutletConfigurations(outletConfigurations);
					}
				} catch (final CoreException e) {
					// TODO should be reported as problem
					System.out.println("AL configuration generator provider not found for " + element.getNamespaceIdentifier());
				}
			}
		}
		return outletConfigurations;
	}

}
