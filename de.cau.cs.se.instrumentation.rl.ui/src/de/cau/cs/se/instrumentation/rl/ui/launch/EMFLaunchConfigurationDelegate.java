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
package kieker.tools.rl.ui.launch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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

	/** property constant for the name of the target file. */
	public static final String ATTR_DESTINATION_FILE = "target-file";
	/** property constant for the name of the destination folder. */
	public static final String ATTR_DESTINATION_FOLDER = "destination-folder";
	/** property constant for the selected project. */
	public static final String ATTR_PROJECT = "project";
	/** property constant for the source folders property. */
	public static final String ATTR_SOURCE_FOLDER = "source-folder";

	/** internal constant for the file extension. */
	private static final String IRL_EXTENSION = "irl";

	/**
	 * Default constructor.
	 */
	public EMFLaunchConfigurationDelegate() {
		super();
	}

	/**
	 * Central launcher for the EMF export functionality.
	 *
	 * @throws CoreException API delegated exception
	 *
	 * @param configuration launcher configuration
	 * @param mode mode is either debug or run
	 * @param launch the operation to be launched
	 * @param monitor UI part to display the progress of the launched operation
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveAllEditors(true);

		final String destinationFolder = configuration.getAttribute(ATTR_DESTINATION_FOLDER, "");
		final String destinationFile = configuration.getAttribute(ATTR_DESTINATION_FILE, "");

		final IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(destinationFolder + File.separator + destinationFile));

		final List<String> sourceFolders = configuration.getAttribute(ATTR_SOURCE_FOLDER, new ArrayList<String>());

		// create EMF model

		final ResourceSet resourceSet = new ResourceSetImpl();
		final EMFModelGenerator generator = new EMFModelGenerator(resourceSet);

		if (targetFile.exists()) {
			targetFile.delete(true, null);
		}

		final Resource output = resourceSet.createResource(URI.createURI(targetFile.getFullPath().toPortableString()));

		for (final String folder : sourceFolders) {
			final IPath path = new Path(folder);
			if (path.segmentCount() > 1) {
				this.compileFolder(ResourcesPlugin.getWorkspace().getRoot().getFolder(path).members(),
						output, generator);
			} else if (path.segmentCount() > 0) {
				this.compileFolder(ResourcesPlugin.getWorkspace().getRoot().getProject(folder).members(),
						output, generator);
			}
		}

		try {
			output.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void compileFolder(final IResource[] members, final Resource output, final EMFModelGenerator generator) throws CoreException {
		for (final IResource resource : members) {
			if (resource instanceof IFile) {
				if (IRL_EXTENSION.equals(((IFile) resource).getFileExtension())) {
					generator.doGenerate((IFile) resource, output);
				}
			} else if (resource instanceof IFolder) {
				this.compileFolder(((IFolder) resource).members(), output, generator);
			}
		}
	}

}
