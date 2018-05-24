/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.FileConverter;
import com.google.inject.Inject;
import com.google.inject.Injector;

import kieker.develop.rl.RecordLangStandaloneSetup;
import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * This class controls all aspects of the application's execution.
 *
 * @author Reiner Jung
 *
 * @since 1.15
 */
public class CompilerMain implements IApplication {

	/** Central logger for the compiler. */
	private static final Logger LOGGER = LogManager.getLogger(CompilerMain.class);

	private static final Level DEFAULT_LOGGING_LEVEL = Level.INFO;

	/** Legal extensions for IRL files. */
	private static final Object FILE_EXTENSION_IRL = "irl";

	private static final String DEFAULT_VERSION = "1.15";

	private static final String DEFAULT_AUTHOR = "IRL Generator";

	@Parameter(names = { "-s", "--source" }, description = "The list of files to commit.", required = true)
	private List<String> files;

	@Parameter(names = { "-c", "--comment" }, description = "File containing the comment header.", converter = FileConverter.class)
	private File headerCommentFile;

	@Parameter(names = { "-t", "--api-version" }, description = "Kieker API version.", required = false)
	private String targetVersion;

	@Parameter(names = { "-a", "--default-author" }, description = "Default author used in code comments.", required = false)
	private String defaultAuthor;

	@Parameter(names = { "-V", "--default-version" }, description = "Default version since when a type exists.", required = false)
	private String defaultVersion;

	@Parameter(names = { "-l", "--languages" }, variableArity = true, description = "List of targets", required = true)
	private List<String> languages;

	@Parameter(names = { "-v", "--verbose" }, description = "Verbosity level, default is INFO", converter = LoggingLevelConverter.class)
	private Level loggingLevel;

	@Parameter(names = { "-o", "--output-dirs" }, variableArity = true, description = "List of target directories corresponding with targets", required = true)
	private List<String> targetDirectories;

	@Parameter(names = { "--version" }, description = "Version of the generator", help = true)
	private boolean version;

	@Parameter(names = { "-h", "--help" }, help = true)
	private boolean help;

	/** resource set for the compilation. */
	// @Inject
	private final XtextResourceSet resourceSet = new XtextResourceSet();

	@Inject
	private IResourceValidator resourceValidator;

	public CompilerMain() {
		// default constructor
	}

	@Override
	public Object start(final IApplicationContext context) throws Exception {
		CompilerMain.LOGGER.addAppender(this.createStdoutAppender());
		this.loggingLevel = CompilerMain.DEFAULT_LOGGING_LEVEL;
		this.help = false;
		this.version = false;
		this.languages = new ArrayList<>();
		this.files = new ArrayList<>();
		final Map<?, ?> args = context.getArguments();
		final String presentWorkingDirectory = Paths.get(".").toAbsolutePath().normalize().toString();

		final String[] appArgs = (String[]) args.get("application.args");

		JCommander commander = null;
		try {
			commander = new JCommander(this, appArgs);

			CompilerMain.LOGGER.setLevel(this.loggingLevel);

			if (this.defaultAuthor == null) {
				this.defaultAuthor = CompilerMain.DEFAULT_AUTHOR;
			}
			if (this.defaultVersion == null) {
				this.defaultVersion = CompilerMain.DEFAULT_VERSION;
			}

			if (this.help) {
				commander.usage();
			}
			if (this.version) {
				commander.usage("Version is " + CompilerMain.DEFAULT_VERSION);
			}

			if (!this.version && !this.help) {
				/** evaluate header. */
				if (this.headerCommentFile != null) {
					if (this.headerCommentFile.canRead()) {
						try {
							final String headerComment = this.readHeaderComment();
							this.runCompiler(headerComment, presentWorkingDirectory);
						} catch (final IOException e) {
							CompilerMain.LOGGER.error(String.format("Cannot read header comment file: %s", this.headerCommentFile.getAbsolutePath()), e);
						}
					} else {
						CompilerMain.LOGGER.error(String.format("Cannot read header comment file: %s", this.headerCommentFile.getAbsolutePath()));
					}
				} else {
					this.runCompiler("", presentWorkingDirectory);
				}
			}
		} catch (final ParameterException e) {
			CompilerMain.LOGGER.error(e);
			if (commander != null) {
				commander.usage(e.getLocalizedMessage());
			}
		}

		return IApplication.EXIT_OK;
	}

	private Appender createStdoutAppender() {
		final Appender appender = new ConsoleAppender(new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1} - %m%n"));
		appender.setName("stdout");
		return appender;
	}

	/**
	 * Read a header comment file.
	 *
	 * @return the header comment as string
	 * @throws IOException
	 *             on IO error
	 */
	private String readHeaderComment() throws IOException {
		final StringBuilder commentBuilder = new StringBuilder();
		final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.headerCommentFile));

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			commentBuilder.append(line);
		}

		bufferedReader.close();
		return commentBuilder.toString();
	}

	/**
	 * Run the compiler for all specified files and targets.
	 *
	 * @param headerComment
	 *            header comment to use
	 * @param presentWorkingDirectory
	 *            working directory to use
	 */
	private void runCompiler(final String headerComment, final String presentWorkingDirectory) {
		final Injector injector = new RecordLangStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		/** load all resources. */
		for (final String sourceLocationName : this.files) {
			final File sourceLocation;
			if (sourceLocationName.startsWith("/")) {
				sourceLocation = new File(sourceLocationName);
			} else {
				sourceLocation = new File(presentWorkingDirectory + File.separator + sourceLocationName);
			}
			this.directoryWalkerResource(sourceLocation);
		}

		/** compile all resources. */
		for (final String sourceLocationName : this.files) {
			final File sourceLocation;
			if (sourceLocationName.startsWith("/")) {
				sourceLocation = new File(sourceLocationName);
			} else {
				sourceLocation = new File(presentWorkingDirectory + File.separator + sourceLocationName);
			}

			final File sourceRootLocation;
			if (sourceLocation.isDirectory()) {
				sourceRootLocation = sourceLocation;
			} else {
				sourceRootLocation = sourceLocation.getParentFile();
			}

			this.directoryWalkerCompile(sourceLocation, sourceRootLocation, headerComment);
		}
	}

	/**
	 * Collect all resources.
	 *
	 * @param file
	 *            project relative path
	 */
	private void directoryWalkerResource(final File file) {
		if (file.isDirectory()) {
			for (final File innerFile : file.listFiles()) {
				this.directoryWalkerResource(innerFile);
			}
		} else {
			final int i = file.getAbsolutePath().lastIndexOf('.');

			if (i > 0) {
				if (CompilerMain.FILE_EXTENSION_IRL.equals(file.getAbsolutePath().substring(i + 1))) {
					this.getResource(file);
				}
			}
		}
	}

	/**
	 * Walk over the directory tree and compile all files.
	 *
	 * @param sourceLocation
	 *            source file or directory to be compiled
	 * @param sourceRootLocation
	 *            root of the source location
	 * @param headerComment
	 *            comment to be prepended to the header of each generated file
	 */
	private void directoryWalkerCompile(final File sourceLocation, final File sourceRootLocation, final String headerComment) {
		if (sourceLocation.isDirectory()) {
			for (final File innerFile : sourceLocation.listFiles()) {
				this.directoryWalkerCompile(innerFile, sourceRootLocation, headerComment);
			}
		} else {
			final int i = sourceLocation.getAbsolutePath().lastIndexOf('.');

			if (i > 0) {
				if (CompilerMain.FILE_EXTENSION_IRL.equals(sourceLocation.getAbsolutePath().substring(i + 1))) {
					this.compile(sourceLocation, sourceRootLocation, headerComment);
				}
			}
		}
	}

	private void compile(final File sourceLocation, final File sourceRootLocation, final String headerComment) {
		final String relativeFilePath = sourceLocation.getAbsolutePath().substring(sourceRootLocation.getAbsolutePath().length() + 1);
		final int last = relativeFilePath.lastIndexOf(File.separator);
		final String relativeDirectoryPath;
		if (last >= 0) {
			relativeDirectoryPath = relativeFilePath.substring(0, last);
		} else {
			relativeDirectoryPath = "";
		}

		CompilerMain.LOGGER.info("Compiling " + relativeFilePath + " ...");
		/** lex and parse. */
		final Resource resource = this.getResource(sourceLocation);

		/** validate. */
		final List<Issue> issues = this.resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		for (final Issue issue : issues) {
			switch (issue.getSeverity()) {
			case ERROR:
				CompilerMain.LOGGER.error(String.format("%s:%d:%d: %s", relativeFilePath, issue.getLineNumber(), issue.getColumn(), issue.getMessage()));
				break;
			case IGNORE:
				CompilerMain.LOGGER.warn(String.format("%s:%d:%d: %s", relativeFilePath, issue.getLineNumber(), issue.getColumn(), issue.getMessage()));
				break;
			case WARNING:
				CompilerMain.LOGGER.warn(String.format("%s:%d:%d: %s", relativeFilePath, issue.getLineNumber(), issue.getColumn(), issue.getMessage()));
				break;
			case INFO:
				CompilerMain.LOGGER.info(String.format("%s:%d:%d: %s", relativeFilePath, issue.getLineNumber(), issue.getColumn(), issue.getMessage()));
				break;
			default:
				CompilerMain.LOGGER.error(String.format("%s:%d:%d: %s", relativeFilePath, issue.getLineNumber(), issue.getColumn(), issue.getMessage()));
				break;
			}
		}

		/** compile. */
		if (issues.isEmpty()) {
			final Collection<AbstractOutletConfiguration<ComplexType, Object>> configurations = GeneratorRegistration.getOutletConfigurations();

			int i = 0;
			for (final String language : this.languages) {
				final String targetDirectory = this.targetDirectories.get(i);
				i++;
				for (final AbstractOutletConfiguration<ComplexType, Object> configuration : configurations) {
					if (language.equals(configuration.getLang())) {
						final Generator generator = new Generator(this.loggingLevel, headerComment, this.defaultVersion, this.defaultAuthor, this.targetVersion,
								configuration);
						generator.generate(resource, targetDirectory + File.separator + relativeDirectoryPath, language);
					}
				}
			}
		}
	}

	/**
	 * Add a resource for the present project and present project source path to
	 * the resource set and return that resource.
	 *
	 * @param path
	 *            path to the file to be added to the resource set
	 * @return the resource added to the resource set
	 */
	private Resource getResource(final File path) {
		final URI uri = URI.createFileURI(path.getAbsolutePath());
		return this.resourceSet.getResource(uri, true);
	}

	@Override
	public void stop() {
		// nothing to do
	}

}
