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
package kieker.develop.rl.cli.test;

import java.io.File;
import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.junit.Assert;
import org.junit.Test;

import kieker.develop.rl.cli.DirectIOFileSystemAccess;
import kieker.develop.rl.ouput.config.RecordLangOutputConfigurationProvider;

/**
 * Test class for the DirectIOFileSystemAccess class which is used to
 * Create files and store content provided by a code generator.
 * 
 * Note: The deleteFile and generateFile(fileName,outputConfiguration,contents)
 * methods are not used by the CLICompiler, but to be compliant with the API
 * they are still implemented in a fully functional state.
 * 
 * @author Reiner Jung
 * 
 */
public class TestDirectIOFileSystemAccess {

	private static final String EXAMPLE_FILE_NAME = "example.txt";
	private static final String OUTPUT_CONFIG = "java";

	/**
	 * Default constructor.
	 */
	public TestDirectIOFileSystemAccess() {
		// empty default constructor
	}

	/**
	 * Test if the file is created in the right place.
	 */
	@Test
	public void testGenerateFileStringCharSequence() {
		final String tempDirectory = System.getProperty("java.io.tmpdir");
		final CharSequence contents = "This is test content.";
		final RecordLangOutputConfigurationProvider outputConfigurationProvider = new RecordLangOutputConfigurationProvider();
		final Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations();

		for (final OutputConfiguration configuration : configurations) {
			configuration.setOutputDirectory(".");
		}

		final DirectIOFileSystemAccess fsa = new DirectIOFileSystemAccess(tempDirectory, configurations);
		fsa.generateFile(EXAMPLE_FILE_NAME, contents);

		// check if the file exists
		// this must fail, as a target language "none" should not exist.
		final File file = new File(tempDirectory + File.separator + EXAMPLE_FILE_NAME);
		Assert.assertFalse("File creation should have failed.", file.exists());
	}

	/**
	 * Test if the file is generated in the right place.
	 */
	@Test
	public void testGenerateFileStringStringCharSequence() {
		final String tempDirectory = System.getProperty("java.io.tmpdir");
		final CharSequence contents = "This is test content.";
		final RecordLangOutputConfigurationProvider outputConfigurationProvider = new RecordLangOutputConfigurationProvider();
		final Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations();

		for (final OutputConfiguration configuration : configurations) {
			configuration.setOutputDirectory(".");
		}

		final DirectIOFileSystemAccess fsa = new DirectIOFileSystemAccess(tempDirectory, configurations);
		fsa.generateFile(EXAMPLE_FILE_NAME, OUTPUT_CONFIG, contents);

		// check if the file exists
		final File file = new File(tempDirectory + File.separator + EXAMPLE_FILE_NAME);
		Assert.assertTrue("File creation failed.", file.exists());
		// cleanup
		file.delete();
	}

	/**
	 * Test if the previously created files is deleted.
	 */
	@Test
	public void testDeleteFile() {
		final String tempDirectory = System.getProperty("java.io.tmpdir");
		final CharSequence contents = "This is test content.";
		final RecordLangOutputConfigurationProvider outputConfigurationProvider = new RecordLangOutputConfigurationProvider();
		final Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations();

		for (final OutputConfiguration configuration : configurations) {
			configuration.setOutputDirectory(".");
		}

		final DirectIOFileSystemAccess fsa = new DirectIOFileSystemAccess(tempDirectory, configurations);
		fsa.generateFile(EXAMPLE_FILE_NAME, OUTPUT_CONFIG, contents);

		// check if the file exists
		final File file = new File(tempDirectory + File.separator + EXAMPLE_FILE_NAME);
		Assert.assertTrue("File creation failed.", file.exists());
		// check if the file is deleted
		fsa.deleteFile(EXAMPLE_FILE_NAME);
		Assert.assertFalse("File deletion failed.", file.exists());
	}

}
