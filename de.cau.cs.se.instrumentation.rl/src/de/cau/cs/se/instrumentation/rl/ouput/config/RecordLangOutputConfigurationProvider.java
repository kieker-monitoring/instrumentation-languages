/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ouput.config;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

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

		configurations.add(this.createOutputConfiguration("java", "Java Output Folder", "./src-gen/java"));
		configurations.add(this.createOutputConfiguration("c", "C Output Folder", "./src-gen/c"));
		configurations.add(this.createOutputConfiguration("perl", "Perl Output Folder", "./src-gen/perl"));

		return configurations;
	}

	private OutputConfiguration createOutputConfiguration(final String type, final String description, final String folder) {
		final OutputConfiguration configuration = new OutputConfiguration(type);
		configuration.setDescription(description);
		configuration.setOutputDirectory(folder);
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
