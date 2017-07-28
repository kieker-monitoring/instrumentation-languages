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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.develop.rl.CLIPreferenceStore;
import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.generator.RecordLangGenerator;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.preferences.TargetsPreferences;
import kieker.develop.rl.recordLang.ComplexType;

import de.cau.cs.se.geco.architecture.framework.IGenerator;

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

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject
	private IResourceFactory resourceFactory;

	private final IEclipsePreferences preferenceStore;

	/**
	 * Construct an IRL parser.
	 *
	 * @param selectedLanguageTypes
	 *            array of language outlet names
	 * @param headerComments
	 *            set of comments matching the languages
	 * @param version
	 *            default version
	 * @param author
	 *            default author
	 */
	public IRLParser() {
		this.preferenceStore = CLIPreferenceStore.INSTANCE;
	}

	public void configureParser(final List<String> selectedLanguageTypes, final List<String> headerComments, final String version, final String author) {
		TargetsPreferences.setAuthorName(this.preferenceStore, author);
		TargetsPreferences.setVersionID(this.preferenceStore, version);
		// setup language activation
		for (final AbstractOutletConfiguration<ComplexType, Object> outlet : GeneratorRegistration.getOutletConfigurations()) {
			for (final IGenerator<? extends ComplexType, ? extends Object> generator : outlet.getGenerators()) {
				try {
					final String language = outlet.getName();
					TargetsPreferences.setGeneratorActive(this.preferenceStore, language, false);
					int i = 0;
					for (final String selected : selectedLanguageTypes) {
						if (selected.equals(language)) {
							TargetsPreferences.setGeneratorActive(this.preferenceStore, language, true);
							TargetsPreferences.setHeaderComment(this.preferenceStore, language, headerComments.get(i));
						}
						i++;
					}
				} catch (final IllegalArgumentException e) {
					e.printStackTrace();
				} catch (final SecurityException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 *
	 * @param sourcePathPrefix
	 * @param targetPathPrefix
	 */
	public void compile(final String sourcePathPrefix, final String targetPathPrefix) {
		this.directoryWalkerCompile(sourcePathPrefix, targetPathPrefix, "");
	}

	/**
	 * Walk over the directory tree and compile all files.
	 *
	 * @param sourcePathPrefix
	 * @param targetPathPrefix
	 * @param pathName
	 *            relative path name in source folder
	 */
	private void directoryWalkerCompile(final String sourcePathPrefix, final String projectPathPrefix, final String pathName) {
		final File file = new File(sourcePathPrefix + File.separator + pathName);

		if (file.isDirectory()) {
			for (final String innerFileName : file.list()) {
				this.directoryWalkerCompile(sourcePathPrefix, projectPathPrefix, pathName + File.separator + innerFileName);
			}
		} else {
			final int i = pathName.lastIndexOf('.');

			if (i > 0) {
				final String extension = pathName.substring(i + 1);
				if (FILE_EXTENSION_IRL.equals(extension)) {
					this.compile(sourcePathPrefix, projectPathPrefix, pathName);
				}
			}
		}
	}

	/**
	 * Run the generator for one input file.
	 *
	 * @param sourcePathPrefix
	 *            complete path to a source code root directory
	 * @param projectPathPrefix
	 *            complete path of the project
	 * @param pathName
	 *            relative path of the input file
	 */
	private void compile(final String sourcePathPrefix, final String projectPathPrefix, final String pathName) {
		LOG.info("Compiling " + sourcePathPrefix + File.separator + pathName);

		try {
			/** parse a file. */
			final ResourceSet resourceSet = this.resourceSetProvider.get();

			final File inFile = new File(sourcePathPrefix + File.separator + pathName);

			final InputStream in = new FileInputStream(inFile);

			final Resource resource = this.resourceFactory.createResource(URI.createURI(inFile.getAbsolutePath()));
			resourceSet.getResources().add(resource);
			resource.load(in, null);

			/** generate output. */
			final RecordLangGenerator generator = new RecordLangGenerator();
			final IFileSystemAccess2 fsa = new DirectIOFileSystemAccess(projectPathPrefix, GeneratorRegistration.getOutletConfigurations());
			generator.doGenerate(resource, fsa, null);
		} catch (final IOException e) {
			LOG.error("File read error ", e);
		}

	}

}
