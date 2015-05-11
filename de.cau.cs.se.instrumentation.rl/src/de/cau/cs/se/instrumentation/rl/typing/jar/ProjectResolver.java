package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Gets urls of jars from current workspace to use them in own classloader.
 *
 * @author Yannic Kropp
 *
 */
public class ProjectResolver {

	private final ArrayList<IJavaProject> projects;
	private IJavaProject current;

	protected ProjectResolver(final URI projectUri) {
		final String[] temp = projectUri.toString().split("/");
		final String projectName = temp[temp.length - 4];
		this.projects = new ArrayList<IJavaProject>(0);
		this.current = null;
		final IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (final IProject iProject : iProjects) {
			this.projects.add(JavaCore.create(iProject));
			if (iProject.getName().equals(projectName)) {
				this.current = JavaCore.create(iProject);
			}

		}
	}

	/**
	 *
	 * returns all referenced jars (URLs) in this.current; if this.current is null returns all jars in workspace
	 *
	 */
	protected ArrayList<URL> findUrls() throws JavaModelException, MalformedURLException {
		final ArrayList<URL> urls = new ArrayList<URL>(0);
		if (this.current == null) {
			for (int i = 0; i < this.projects.size(); i++) {
				final IClasspathEntry[] classpath = this.projects.get(i).getRawClasspath();
				for (final IClasspathEntry element : classpath) {
					if ((element.getEntryKind() == 1) && element.getPath().toString().endsWith(".jar")
							&& !this.projects.contains(element.getPath().toFile().toURI().toURL())) {
						urls.add(element.getPath().toFile().toURI().toURL());
					}
				}
			}
		}
		else {
			final IClasspathEntry[] classpath = this.current.getRawClasspath();
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
