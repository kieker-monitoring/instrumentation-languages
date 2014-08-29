/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ouput.config;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import de.cau.cs.se.instrumentation.rl.generator.GeneratorConfiguration;

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

	public Set<OutputConfiguration> getOutputConfigurations() {
		final Set<OutputConfiguration> configurations = new HashSet<OutputConfiguration>();

		for (final OutletConfiguration outlet : GeneratorConfiguration.outletConfigurations) {
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
