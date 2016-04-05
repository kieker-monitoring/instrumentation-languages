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
package kieker.develop.record.lang.ouput.config;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import kieker.develop.rl.generator.GeneratorConfiguration;

import de.cau.cs.se.instrumentation.rl.ouput.config.OutletConfiguration;

/**
 * Based on http://xtextcasts.org/episodes/15-output-configurations.
 * 
 * @author Reiner Jung
 * 
 */
public class RecordLangOutputConfigurationProvider implements IOutputConfigurationProvider {

	/**
	 * Empty constructor.
	 */
	public RecordLangOutputConfigurationProvider() {}

	/**
	 * Create outlet configurations.
	 * 
	 * @return set of outlet configurations
	 */
	public Set<OutputConfiguration> getOutputConfigurations() {
		final Set<OutputConfiguration> configurations = new HashSet<OutputConfiguration>();

		for (final OutletConfiguration outlet : GeneratorConfiguration.OUTLET_CONFIGURATIONS) {
			configurations.add(this.createOutputConfiguration(outlet));
		}

		return configurations;
	}

	private OutputConfiguration createOutputConfiguration(final OutletConfiguration outlet) {
		final OutputConfiguration configuration = new OutputConfiguration(outlet.getName());
		configuration.setDescription(outlet.getDescription());
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
