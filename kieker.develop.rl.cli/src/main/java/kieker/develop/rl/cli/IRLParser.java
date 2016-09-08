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

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.develop.rl.RecordLangStandaloneSetup;
import kieker.develop.rl.generator.AbstractEventTypeGenerator;
import kieker.develop.rl.generator.GeneratorConfiguration;
import kieker.develop.rl.generator.RecordLangGenerator;
import kieker.develop.rl.ouput.config.RecordLangOutputConfigurationProvider;
import kieker.develop.rl.preferences.TargetsPreferenceInitializer;
import kieker.develop.rl.preferences.TargetsPreferences;

/**
 * Parser class.
 *
 * From http://davehofmann.de/blog/?tag=standalone
 *
 * @author Reiner Jung
 *
 */
public class IRLParser {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(IRLParser.class);

	/** Legal extensions for IRL files. */
	private static final Object FILE_EXTENSION_IRL = "irl";

	/** resource set for the compilation. */
	@Inject
	private XtextResourceSet resourceSet;

	/** Project location in host path notation */
	private final String projectHostPath;
	/** The Kieker eclipse project name. */
	private final String projectName;
	/** The source path for the IRL files. */
	private final String projectSourcePath;
	/** Derive value representing the project root path. */
	private final String sourceRootPath;

	private final StandaloneSetup setup;

	private Set<OutputConfiguration> configurations;

	/**
	 * Construct an IRL parser.
	 *
	 * @param platformUri
	 *            the platform root
	 * @param projectSourcePath
	 *            project local path to sources
	 * @param projectDestinationPath
	 *            project local path to generated sources
	 * @param projectName
	 *            project name
	 * @param projectDirectoryName
	 *            project path name (optional, can be null)
	 * @param author
	 *            author name for the code generation
	 * @param version
	 *            kieker version
	 * @param selectedLanguageTypes
	 *            list of languages
	 * @param mavenFolderLayout
	 *            maven directory layout
	 */
	public IRLParser(final String platformUri, final String projectName, final String projectDirectoryName,
			final String projectSourcePath, final String projectDestinationPath,
			final boolean mavenFolderLayout, final String[] selectedLanguageTypes, final String version, final String author) {
		this.projectSourcePath = projectSourcePath;
		this.projectName = projectName;

		this.setup = new StandaloneSetup();
		this.setup.setProjectDirectoryName(projectDirectoryName);

		if (this.setup.initialize(platformUri)) {

			// query real path name of project
			final URI projectURI = EcorePlugin.getPlatformResourceMap().get(projectName);
			if (projectURI != null) {
				final String realProjectPathName = projectURI.trimSegments(1).lastSegment();

				final Injector injector = new RecordLangStandaloneSetup().createInjectorAndDoEMFRegistration();
				injector.injectMembers(this);
				this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

				this.sourceRootPath = platformUri + File.separator + realProjectPathName + File.separator + projectSourcePath;
				this.projectHostPath = platformUri + File.separator + realProjectPathName;

				// setup generator preferences
				new TargetsPreferenceInitializer().initializeDefaultPreferences();
				final IEclipsePreferences preferenceStore = TargetsPreferenceInitializer.getPreferenceStore();

				TargetsPreferences.setAuthorName(preferenceStore, author);
				TargetsPreferences.setVersionID(preferenceStore, version);
				// setup language activation
				for (final Class<?> generatorClass : GeneratorConfiguration.getEventTypeGenerators()) {
					try {
						final AbstractEventTypeGenerator generator = (AbstractEventTypeGenerator) generatorClass.getConstructor().newInstance();
						TargetsPreferences.setGeneratorActive(preferenceStore, generator.getId(), false);
						for (final String selected : selectedLanguageTypes) {
							if (selected.equals(generator.getId())) {
								TargetsPreferences.setGeneratorActive(preferenceStore, generator.getId(), true);
							}
						}
					} catch (final IllegalArgumentException e) {
						e.printStackTrace();
					} catch (final SecurityException e) {
						e.printStackTrace();
					} catch (final InstantiationException e) {
						e.printStackTrace();
					} catch (final IllegalAccessException e) {
						e.printStackTrace();
					} catch (final InvocationTargetException e) {
						e.printStackTrace();
					} catch (final NoSuchMethodException e) {
						e.printStackTrace();
					}
				}
				// setup outlets
				final IOutputConfigurationProvider outputConfigurationProvider = new RecordLangOutputConfigurationProvider();
				this.configurations = outputConfigurationProvider.getOutputConfigurations();

				if (mavenFolderLayout) {
					for (final OutputConfiguration configuration : this.configurations) {
						configuration.setOutputDirectory(projectDestinationPath + File.separator + configuration.getName());
					}
				} else {
					for (final OutputConfiguration configuration : this.configurations) {
						configuration.setOutputDirectory(projectDestinationPath);
					}
				}
			} else {
				LOG.error("Specified project " + projectName + " cannot be found.");
				this.sourceRootPath = null;
				this.projectHostPath = null;
				this.configurations = null;
			}
		} else {
			this.sourceRootPath = null;
			this.projectHostPath = null;
			this.configurations = null;
		}
	}

	/**
	 * Central compiler hook.
	 */
	public void compileAll() {
		if (this.setup.isConfigured()) {
			this.directoryWalkerResource("");
			this.directoryWalkerCompile("");
		}
	}

	/**
	 * Collect all resources.
	 *
	 * @param pathName
	 *            project relative path
	 */
	private void directoryWalkerResource(final String pathName) {
		final File file = new File(this.sourceRootPath + File.separator + pathName);

		if (file.isDirectory()) {
			for (final String innerFileName : file.list()) {
				this.directoryWalkerResource(pathName + File.separator + innerFileName);
			}
		} else {
			final int i = pathName.lastIndexOf('.');

			if (i > 0) {
				if (FILE_EXTENSION_IRL.equals(pathName.substring(i + 1))) {
					this.getResource(pathName);
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
	private void directoryWalkerCompile(final String pathName) {
		final File file = new File(this.sourceRootPath + File.separator + pathName);

		if (file.isDirectory()) {
			for (final String innerFileName : file.list()) {
				this.directoryWalkerCompile(pathName + File.separator + innerFileName);
			}
		} else {
			final int i = pathName.lastIndexOf('.');

			if (i > 0) {
				final String extension = pathName.substring(i + 1);
				if (FILE_EXTENSION_IRL.equals(extension)) {
					this.compile(pathName);
				}
			}
		}
	}

	/**
	 * Add a resource for the present project and present project source path to
	 * the resource set and return that resource.
	 *
	 * @param pathName
	 *            relative path name to the file to be added to the resource set
	 * @return the resource added to the resource set
	 */
	private Resource getResource(final String pathName) {
		final URI uri = URI.createURI("platform:/resource/" + this.projectName + "/" + this.projectSourcePath + pathName);
		return this.resourceSet.getResource(uri, true);
	}

	/**
	 * Run the generator for one input file.
	 *
	 * @param pathName
	 *            relative path of the input file
	 * @param author
	 * @param version
	 */
	private void compile(final String pathName) {
		LOG.info("Compiling " + this.sourceRootPath + pathName);

		// load resource
		final Resource resource = this.getResource(pathName);

		// invoke generator
		final RecordLangGenerator generator = new RecordLangGenerator();
		final IFileSystemAccess2 fsa = new DirectIOFileSystemAccess(this.projectHostPath, this.configurations);

		generator.doGenerate(resource, fsa, null);
	}

}
