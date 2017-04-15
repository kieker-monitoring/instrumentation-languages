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
package kieker.develop.rl.outlet;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * Based on http://xtextcasts.org/episodes/15-output-configurations.
 *
 * @author Reiner Jung
 * @since 1.1
 *
 */
public class RecordLangOutletConfigurationProvider implements IOutputConfigurationProvider {

	/**
	 * Empty constructor.
	 */
	public RecordLangOutletConfigurationProvider() {}

	/**
	 * Create outlet configurations.
	 *
	 * @return set of outlet configurations
	 */
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		final Set<OutputConfiguration> configurations = new HashSet<>();

		for (final AbstractOutletConfiguration<ComplexType, Object> outlet : GeneratorRegistration.getOutletConfigurations()) {
			configurations.add(this.createOutputConfiguration(outlet));
		}

		return configurations;
	}

	private OutputConfiguration createOutputConfiguration(final AbstractOutletConfiguration<ComplexType, Object> outlet) {
		final OutputConfiguration configuration = new OutputConfiguration(outlet.getName());
		configuration.setDescription(outlet.getDescription() + " output folder");
		configuration.setOutputDirectory(outlet.getDirectory());
		configuration.setCleanUpDerivedResources(true);
		configuration.setOverrideExistingResources(true);
		configuration.setSetDerivedProperty(true);
		configuration.setCreateOutputDirectory(true);
		configuration.setCanClearOutputDirectory(true);
		configuration.setInstallDslAsPrimarySource(false);
		configuration.setHideSyntheticLocalVariables(true);

		return configuration;
	}

}
