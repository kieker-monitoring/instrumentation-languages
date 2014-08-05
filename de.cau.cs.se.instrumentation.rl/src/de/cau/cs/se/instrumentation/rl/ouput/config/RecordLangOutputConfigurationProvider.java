/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ouput.config;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Reiner Jung
 * 
 */
public class RecordLangOutputConfigurationProvider implements IRecordLangOutputConfigurationProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.generator.IOutputConfigurationProvider#getOutputConfigurations()
	 */
	public Set<RecordLangOutputConfiguration> getOutputConfigurations() {
		final Set<RecordLangOutputConfiguration> configurations = new HashSet<RecordLangOutputConfiguration>();

		System.out.println("Set size is " + configurations.size());

		configurations.add(this.createOutputConfiguration("java", "Java Output Folder", "./src-gen/java"));

		System.out.println("Set size is " + configurations.size());

		configurations.add(this.createOutputConfiguration("c", "C Output Folder", "./src-gen/c"));

		System.out.println("Set size is " + configurations.size());

		configurations.add(this.createOutputConfiguration("perl", "Perl Output Folder", "./src-gen/perl"));

		System.out.println("Set size is " + configurations.size());

		return configurations;
	}

	private RecordLangOutputConfiguration createOutputConfiguration(final String type, final String description, final String folder) {
		final RecordLangOutputConfiguration defaultOutputConfiguration = new RecordLangOutputConfiguration(type);
		defaultOutputConfiguration.setDescription(description);
		defaultOutputConfiguration.setOutputDirectory(folder);
		defaultOutputConfiguration.setOverrideExistingResources(true);
		defaultOutputConfiguration.setCreateOutputDirectory(true);
		defaultOutputConfiguration.setCleanUpDerivedResources(true);
		defaultOutputConfiguration.setSetDerivedProperty(true);
		defaultOutputConfiguration.setKeepLocalHistory(true);

		return defaultOutputConfiguration;
	}

}
