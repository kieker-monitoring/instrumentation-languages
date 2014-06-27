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
package de.cau.cs.se.instrumentation.rl.ui.launch;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Launcher delegate.
 * 
 * @author Reiner Jung
 *
 */
public class EMFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	/** property constant for the selected project. */
	public static final String ATTR_PROJECT = "project";
	/** property constant for the name of the target file. */
	public static final String ATTR_TARGET_FILE = "target-file";

	/** internal constant for the file extension. */
	private static final String IRL_EXTENSION = "irl";

	/**
	 * Central launcher for the EMF export functionality.
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveAllEditors(true);

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(configuration.getAttribute(ATTR_PROJECT, ""));
		final IFile targetFile = project.getFile(project.getFullPath() + "/kieker.ecore" /* + configuration.getAttribute(ATTR_TARGET_FILE, "kieker.ecore") */);

		// create EMF model

		final ResourceSet resourceSet = new ResourceSetImpl();
		final EMFModelGenerator generator = new EMFModelGenerator(resourceSet);

		if (targetFile.exists()) {
			targetFile.delete(true, null);
		}

		final Resource output = resourceSet.createResource(URI.createURI(targetFile.getFullPath().toPortableString()));

		this.compileFolder(project.members(), output, generator);

		try {
			output.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void compileFolder(final IResource[] members, final Resource output, final EMFModelGenerator generator) throws CoreException {
		for (final IResource resource : members) {
			if (resource instanceof IFile) {
				if (IRL_EXTENSION.equals(((IFile)resource).getFileExtension())) {
					generator.doGenerate(((IFile)resource), output);
				}
			} else if (resource instanceof IFolder) {
				this.compileFolder(((IFolder)resource).members(), output, generator);
			}
		}
	}

}
