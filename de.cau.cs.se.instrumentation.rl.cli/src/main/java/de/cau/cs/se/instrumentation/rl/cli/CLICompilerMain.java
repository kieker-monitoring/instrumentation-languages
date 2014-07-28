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
package de.cau.cs.se.instrumentation.rl.cli;

import java.io.File;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.se.instrumentation.rl.RecordLangStandaloneSetup;
import de.cau.cs.se.instrumentation.rl.generator.RecordLangGenerator;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.tools.util.CLIHelpFormatter;

/**
 * Central class for the headless IRL compiler.
 * 
 * @author Reiner Jung
 * 
 */
public final class CLICompilerMain {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(CLICompilerMain.class);

	/** Legal extensions for IRL files. */
	private static final Object FILE_EXTENSION_IRL = "irl";

	private static final String CMD_ROOT = "r";

	private static final String CMD_ROOT_LONG = "platform-uri";

	private static final String CMD_PROJECT = "p";

	private static final String CMD_PROJECT_LONG = "project";

	private static final String CMD_SOURCE = "s";

	private static final String CMD_SOURCE_LONG = "source";

	private static final String CMD_DESTINATION = "d";

	private static final String CMD_DESTINATION_LONG = "destination";

	private static final String CMD_MAVEN_FOLDER_LAYOUT = "m";

	private static final String CMD_MAVEN_FOLDER_LAYOUT_LONG = "maven";

	private static final String CMD_LANGUAGES = "l";

	private static final String CMD_LANGUAGES_LONG = "languages";

	/** resource set for the compilation. */
	private static XtextResourceSet resourceSet;
	/** Location for the generated code. */
	private static String targetRootPath = "";
	/** Location of the Kieker project parent folder. */
	private static String runtimeRoot = "";
	/** The Kieker eclipse project name. */
	private static String projectName = "Kieker";
	/** The source path for the IRL files. */
	private static String projectSourcePath = "src";
	/** The target path for the IRL files. */
	private static String projectDestinationPath = "src-gen";
	/** The author name for the generated records. */
	private static String author = "Generic Kieker";
	/** The Kieker version for the records. */
	private static String version = "1.10";
	/** Derive value representing the project root path. */
	private static String sourceRootPath = "";
	/** Command line options. */
	private static Options options;

	private static CommandLine commandLine;

	private static String[] selectedLanguageTypes;

	private static boolean mavenFolderLayout;

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

			// EMF and compiler setup
			new org.eclipse.emf.mwe.utils.StandaloneSetup()
					.setPlatformUri(runtimeRoot);

			final Injector injector = new RecordLangStandaloneSetup()
					.createInjectorAndDoEMFRegistration();
			resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
					Boolean.TRUE);

			sourceRootPath = runtimeRoot + "/" + projectName + "/"
					+ projectSourcePath;
			targetRootPath = runtimeRoot + "/" + projectName + "/"
					+ projectDestinationPath;

			CLICompilerMain.directoryWalkerResource("");
			CLICompilerMain.directoryWalkerCompile("");
		} catch (final ParseException e) {
			CLICompilerMain.usage("Parsing failed.  Reason: " + e.getMessage());
			exitCode = 4;
		}
		System.exit(exitCode);
	}

	/**
	 * Collect all resources.
	 * 
	 * @param pathName
	 *            project relative path
	 */
	private static void directoryWalkerResource(final String pathName) {
		final File file = new File(sourceRootPath + "/" + pathName);

		if (file.isDirectory()) {
			for (final String innerFileName : file.list()) {
				CLICompilerMain.directoryWalkerResource(pathName + "/"
						+ innerFileName);
			}
		} else {
			final int i = pathName.lastIndexOf('.');

			if (i > 0) {
				if (FILE_EXTENSION_IRL.equals(pathName.substring(i + 1))) {
					CLICompilerMain.getResource(pathName);
				}
			}
		}
	}

	/**
	 * Walk over the directory tree and compile all files.
	 * 
	 * @param pathName
	 *            relative path name in source folder
	 */
	private static void directoryWalkerCompile(final String pathName) {
		final File file = new File(sourceRootPath + "/" + pathName);

		if (file.isDirectory()) {
			for (final String innerFileName : file.list()) {
				CLICompilerMain.directoryWalkerCompile(pathName + "/"
						+ innerFileName);
			}
		} else {
			final int i = pathName.lastIndexOf('.');

			if (i > 0) {
				final String extension = pathName.substring(i + 1);
				if (FILE_EXTENSION_IRL.equals(extension)) {
					CLICompilerMain.compile(pathName);
				}
			}
		}
	}

	/**
	 * Run the generator for one input file.
	 * 
	 * @param pathName
	 *            relative path of the input file
	 * @param author
	 * @param version
	 */
	private static void compile(final String pathName) {
		LOG.info("Compiling " + sourceRootPath + pathName);

		// load resource
		final Resource resource = CLICompilerMain.getResource(pathName);

		// invoke generator
		final RecordLangGenerator generator = new RecordLangGenerator();
		final IFileSystemAccess fsa = new DirectIOFileSystemAccess(
				targetRootPath);
		generator.setVersion(version);
		generator.setAuthor(author);
		generator.setSelectedLanguageTypes(selectedLanguageTypes);
		generator.setLanguageSpecificTargetFolder(mavenFolderLayout);
		generator.doGenerate(resource, fsa);
	}

	/**
	 * Add a resource for the present project and present project source path to
	 * the resource set and return that resource.
	 * 
	 * @param pathName
	 *            relative path name to the file to be added to the resource set
	 * @return the resource added to the resource set
	 */
	private static Resource getResource(final String pathName) {
		return resourceSet.getResource(
				URI.createURI("platform:/resource/" + projectName + "/"
						+ projectSourcePath + pathName), true);
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
