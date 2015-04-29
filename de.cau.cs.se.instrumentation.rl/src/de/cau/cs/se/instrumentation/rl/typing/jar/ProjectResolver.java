package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ProjectResolver {

	/**
	 * Gets urls of jars from current workspace to use them in own classloader.
	 *
	 * @author Yannic Kropp
	 *
	 */
	private final ArrayList<IJavaProject> projects;

	protected ProjectResolver() { // TODO choose only one Project and not all in workspace
		this.projects = new ArrayList<IJavaProject>(0);
		final IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (final IProject iProject : iProjects) {
			this.projects.add(JavaCore.create(iProject));
		}

	}

	protected ArrayList<URL> findUrls() throws JavaModelException, MalformedURLException { // TODO try catch; adapt if only one project is selected (see Constructor)
		final ArrayList<URL> urls = new ArrayList<URL>(0);
		for (int i = 0; i < this.projects.size(); i++) {
			final IClasspathEntry[] classpath = this.projects.get(i).getRawClasspath();
			for (final IClasspathEntry element : classpath) {
				if ((element.getEntryKind() == 1) && element.getPath().toString().endsWith(".jar")
						&& !this.projects.contains(element.getPath().toFile().toURI().toURL())) {
					urls.add(element.getPath().toFile().toURI().toURL());
				}
			}
		}
		return urls;
	}
}
