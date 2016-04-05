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
package kieker.develop.rl.cli;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.develop.util.CLIHelpFormatter;

/**
 * Central class for the headless IRL compiler.
 * 
 * @author Reiner Jung
 * 
 */
public final class CLICompilerMain {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(CLICompilerMain.class);

	private static final String CMD_ROOT = "r";

	private static final String CMD_ROOT_LONG = "platform-uri";

	private static final String CMD_PROJECT = "p";

	private static final String CMD_PROJECT_LONG = "project";

	private static final String CMD_PROJECT_DIRECTORY = "n";

	private static final String CMD_PROJECT_DIRECTORY_LONG = "project-directory";

	private static final String CMD_SOURCE = "s";

	private static final String CMD_SOURCE_LONG = "source";

	private static final String CMD_DESTINATION = "d";

	private static final String CMD_DESTINATION_LONG = "destination";

	private static final String CMD_MAVEN_FOLDER_LAYOUT = "m";

	private static final String CMD_MAVEN_FOLDER_LAYOUT_LONG = "maven";

	private static final String CMD_LANGUAGES = "l";

	private static final String CMD_LANGUAGES_LONG = "languages";

	private static final String CMD_AUTHOR = "a";

	private static final String CMD_AUHTOR_LONG = "author";

	private static final String CMD_VERSION = "v";

	private static final String CMD_VERSION_LONG = "version";

	/** Command line options. */
	private static Options options;

	private static CommandLine commandLine;

	private static IRLParser parser;

	/**
	 * main class does not need instantiation.
	 */
	private CLICompilerMain() {}

	/**
	 * Main method for the compiler, decoding parameter and execution
	 * compilation.
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(final String[] args) {
		String runtimeRoot = "";
		String projectName = "";
		String projectSourcePath = "src";
		String projectDestinationPath = "src-gen";
		String projectDirectoryName = null;
		String authorName = "Generic Kieker";
		String version = "1.10";

		boolean mavenFolderLayout = false;
		String[] selectedLanguageTypes = {};
		int exitCode = 0;

		CLICompilerMain.declareOptions();
		try {
			// parse the command line arguments
			commandLine = new BasicParser().parse(options, args);

			if (commandLine.hasOption(CMD_ROOT)) {
				runtimeRoot = commandLine.getOptionValue(CMD_ROOT);
			}

			if (commandLine.hasOption(CMD_PROJECT)) {
				projectName = commandLine.getOptionValue(CMD_PROJECT);
			}

			if (commandLine.hasOption(CMD_PROJECT_DIRECTORY)) {
				projectDirectoryName = commandLine.getOptionValue(CMD_PROJECT_DIRECTORY);
			}

			if (commandLine.hasOption(CMD_SOURCE)) {
				projectSourcePath = commandLine.getOptionValue(CMD_SOURCE);
			}

			if (commandLine.hasOption(CMD_DESTINATION)) {
				projectDestinationPath = commandLine
						.getOptionValue(CMD_DESTINATION);
			}

			mavenFolderLayout = commandLine.hasOption(CMD_MAVEN_FOLDER_LAYOUT);

			if (commandLine.hasOption(CMD_LANGUAGES)) {
				selectedLanguageTypes = commandLine.getOptionValues(CMD_LANGUAGES);
			} else {
				CLICompilerMain.usage("No target languages defined.");
				System.exit(-1);
			}

			if (commandLine.hasOption(CMD_AUTHOR)) {
				authorName = commandLine.getOptionValue(CMD_AUTHOR);
			}

			if (commandLine.hasOption(CMD_VERSION)) {
				version = commandLine.getOptionValue(CMD_VERSION);
			}

			parser = new IRLParser(runtimeRoot, projectName, projectDirectoryName, projectSourcePath, projectDestinationPath,
					mavenFolderLayout, selectedLanguageTypes, version, authorName);
			parser.compileAll();
		} catch (final ParseException e) {
			CLICompilerMain.usage("Parsing failed.  Reason: " + e.getMessage());
			exitCode = 4;
		}
		System.exit(exitCode);
	}

	/**
	 * Compile the options for the CLI server.
	 * 
	 * @return The composed options for the CLI server
	 */
	private static Options declareOptions() {
		options = new Options();
		Option option;

		// runtime root
		option = new Option(CMD_ROOT, CMD_ROOT_LONG, true,
				"Root folder of eclipse platfrom/workspace.");
		option.setArgName(CMD_ROOT);
		option.setRequired(true);
		options.addOption(option);

		// eclipse project name
		option = new Option(CMD_PROJECT, CMD_PROJECT_LONG, true,
				"Eclipse project containing the files.");
		option.setArgName(CMD_PROJECT);
		option.setRequired(true);
		options.addOption(option);

		// eclipse project path name
		option = new Option(CMD_PROJECT_DIRECTORY, CMD_PROJECT_DIRECTORY_LONG, true,
				"Directory path name of the project (normally determined automatically).");
		option.setArgName(CMD_PROJECT_DIRECTORY);
		option.setRequired(false);
		options.addOption(option);

		// project relative source folder
		option = new Option(CMD_SOURCE, CMD_SOURCE_LONG, true,
				"Project relative source folder.");
		option.setArgName(CMD_SOURCE);
		option.setRequired(false);
		options.addOption(option);

		// project relative target folder
		option = new Option(CMD_DESTINATION, CMD_DESTINATION_LONG, true,
				"Project relative destination folder.");
		option.setArgName(CMD_DESTINATION);
		option.setRequired(false);
		options.addOption(option);

		// use language specific target folders
		option = new Option(CMD_MAVEN_FOLDER_LAYOUT, CMD_MAVEN_FOLDER_LAYOUT_LONG, false,
				"Use language specific destination folders (maven layout).");
		option.setArgName(CMD_MAVEN_FOLDER_LAYOUT);
		option.setRequired(false);
		options.addOption(option);

		// select languages
		option = new Option(CMD_LANGUAGES, CMD_LANGUAGES_LONG, true,
				"Generate code for all named languages.");
		option.setArgName(CMD_LANGUAGES);
		option.setRequired(true);
		options.addOption(option);

		// set author for the generated code
		option = new Option(CMD_AUTHOR, CMD_AUHTOR_LONG, true,
				"Set author name for the generated code. Default is 'generated'.");
		option.setArgName(CMD_AUTHOR);
		option.setRequired(false);
		options.addOption(option);

		// set author for the generated code
		option = new Option(CMD_VERSION, CMD_VERSION_LONG, true,
				"Set version for the generated code. Default is 'none'.");
		option.setArgName(CMD_VERSION);
		option.setRequired(false);
		options.addOption(option);

		return options;
	}

	/**
	 * Print out the server usage and an additional message describing the cause
	 * of the failure. Finally terminate the server.
	 * 
	 * @param message
	 *            the message to be printed
	 * @param code
	 *            the exit code
	 */
	private static void usage(final String message) {
		CLICompilerMain.LOG.error(message);
		final HelpFormatter formatter = new CLIHelpFormatter();
		formatter.printHelp("irl-compiler", options, true);
	}

}
