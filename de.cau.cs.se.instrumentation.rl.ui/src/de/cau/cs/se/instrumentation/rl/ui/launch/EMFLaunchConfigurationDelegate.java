/**
 * 
 */
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
 * @author reiner
 *
 */
public class EMFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	public static final String ATTR_PROJECT = "project";
	public static final String ATTR_TARGET_FILE = "target-file";

	private static final String IRL_EXTENSION = "irl";

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveAllEditors(true);

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(configuration.getAttribute(ATTR_PROJECT, ""));
		final IFile targetFile = project.getFile(project.getFullPath() + "/kieker.ecore" /* + configuration.getAttribute(ATTR_TARGET_FILE, "kieker.ecore") */);

		// create EMF model

		final ResourceSet resourceSet = new ResourceSetImpl();
		final EMFModelGenerator generator = new EMFModelGenerator(resourceSet);

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
					System.out.println(" path " + resource.getFullPath().toString());
					generator.doGenerate(((IFile)resource), output);
				}
			} else if (resource instanceof IFolder) {
				this.compileFolder(((IFolder)resource).members(), output, generator);
			}
		}
	}

}
