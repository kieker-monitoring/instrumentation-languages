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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;

/**
 * Initializes EMF support. Primarily registers project.
 * 
 * @author Reiner Jung
 */
public class StandaloneSetup {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(StandaloneSetup.class);

	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
	}

	protected ResourceSet resourceSet = new ResourceSetImpl();
	protected Registry registry = EPackage.Registry.INSTANCE;

	private String projectDirectoryName = null;
	private String platformRootPath = null;
	private boolean configured;

	/**
	 * Empty dummy constructor.
	 */
	public StandaloneSetup() {}

	public String getPlatformRootPath() {
		return this.platformRootPath;
	}

	/**
	 * Set the real project directory name.
	 * 
	 * @param projectDirectoryName
	 *            the directory name
	 */
	public void setProjectDirectoryName(final String projectDirectoryName) {
		this.projectDirectoryName = projectDirectoryName;
	}

	public boolean isConfigured() {
		return this.configured;
	}

	/**
	 * Initialize the project registry map.
	 * 
	 * @param pathToPlatform
	 *            the platform URI
	 * @return returns true on success
	 */
	public boolean initialize(final String pathToPlatform) {
		final File platformPath = new File(pathToPlatform);
		if (platformPath.exists()) {
			if (platformPath.isDirectory()) {
				try {
					this.platformRootPath = platformPath.getCanonicalPath();
					LOG.info("Registering platform uri '" + this.platformRootPath + "'");
					if (!this.registerProjects(platformPath)) {
						LOG.error("No projects found in platform location '" + this.platformRootPath);
					} else {
						this.configured = true;
						return true;
					}
				} catch (final IOException e) {
					LOG.error("Error when registering platform location " + pathToPlatform, e);
				}
			} else {
				LOG.error("The specified platform location " + pathToPlatform + " is not a directory.");
			}
		} else {
			LOG.error("The specified platform location " + pathToPlatform + " does not exist.");
		}

		this.configured = false;
		return false;
	}

	/**
	 * Register all projects in the platformURI.
	 * 
	 * @param platformPath
	 *            the platform URI as file path
	 * @return true if projects where found
	 */
	private boolean registerProjects(final File platformPath) {
		final File[] files = platformPath.listFiles();
		boolean containsProject = false;
		if (files != null) {
			for (final File file : files) {
				if (file.exists() && file.isDirectory() && !file.getName().startsWith(".")) {
					if (this.projectDirectoryName != null) {
						if (this.projectDirectoryName.equals(file.getName())) {
							containsProject |= this.findAndRegisterProject(file);
						}
					} else {
						containsProject |= this.findAndRegisterProject(file);
					}

				}
			}
		}

		return containsProject;
	}

	/**
	 * Detect if a folder contains a .project file.
	 * 
	 * @param projectDirectory
	 *            project directory
	 * @return true if a project was found
	 */
	private boolean findAndRegisterProject(final File projectDirectory) {
		final File[] projectFiles = projectDirectory.listFiles();
		for (final File projectFile : projectFiles) {
			if (projectFile.exists() && ".project".equals(projectFile.getName())) {
				return this.registerProject(projectFile);
			}
		}

		return false;
	}

	/**
	 * Register a project specified by the given .project file.
	 * 
	 * @param projectFile
	 *            the project file
	 * @return true if a project was found
	 */
	private boolean registerProject(final File projectFile) {
		try {
			final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(projectFile));
			final String name = document.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();

			final URI uri = URI.createFileURI(projectFile.getParentFile().getCanonicalPath() + File.separator);
			final URI existing = EcorePlugin.getPlatformResourceMap().get(name);
			if (existing != null) {
				LOG.error("Duplicate project " + name + " at '" + uri + "'. Prev was: '" + existing + "'.");
				return false;
			} else {
				EcorePlugin.getPlatformResourceMap().put(name, uri);
				return true;
			}
		} catch (final FileNotFoundException e) {
			LOG.error("Project file " + projectFile.getAbsolutePath() + " does not exist.");
		} catch (final SAXException e) {
			LOG.error("Project file " + projectFile.getAbsolutePath() + " is corrupt.");
		} catch (final IOException e) {
			LOG.error("Project file " + projectFile.getAbsolutePath() + " cannot be read.", e);
		} catch (final ParserConfigurationException e) {
			LOG.error("Configuration of the project file reader is broken.");
		}
		return false;
	}

}
