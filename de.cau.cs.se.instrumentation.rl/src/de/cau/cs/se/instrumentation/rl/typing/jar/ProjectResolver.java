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

/**
 * Gets urls of jars from current workspace to use them in own classloader.
 *
 * @author Yannic Kropp
 *
 */
public class ProjectResolver {

	private final ArrayList<IJavaProject> projects;
	private final ArrayList<IProject> iprojects;
	private final IJavaProject current;
	private final IProject icurrent;

	protected ProjectResolver(final IProject owningProject) {
		this.projects = new ArrayList<IJavaProject>(0);
		this.iprojects = new ArrayList<IProject>(0);
		this.current = JavaCore.create(owningProject);
		this.icurrent = owningProject;
		final IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (final IProject iProject : iProjects) {
			this.iprojects.add(iProject);
			this.projects.add(JavaCore.create(iProject));
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
				final IJavaProject project = this.projects.get(i);
				if (project.isOpen()) {
					final IClasspathEntry[] classpath = project.getRawClasspath();
					for (final IClasspathEntry element : classpath) {
						if ((element.getEntryKind() == IClasspathEntry.CPE_LIBRARY) && element.getPath().toString().endsWith(".jar")
								&& !this.projects.contains(element.getPath().toFile().toURI().toURL())) {
							if (element.getPath().toString().startsWith("/")) {
								urls.add(this.iprojects.get(i).getParent().getLocation().append(element.getPath()).toFile().toURI().toURL());
							}
							else {
								urls.add(element.getPath().toFile().toURI().toURL());
							}
						}
					}
				}
			}
		}
		else {
			final IClasspathEntry[] classpath = this.current.getResolvedClasspath(true);
			for (final IClasspathEntry element : classpath) {
				if ((element.getEntryKind() == IClasspathEntry.CPE_LIBRARY) && element.getPath().toString().endsWith(".jar")
						&& !this.projects.contains(element.getPath().toFile().toURI().toURL())) {
					if (element.getPath().toString().startsWith("/")) {
						urls.add(this.icurrent.getParent().getLocation().append(element.getPath()).toFile().toURI().toURL());
					}
					else {
						urls.add(element.getPath().toFile().toURI().toURL());
					}
				}
			}

		}
		return urls;
	}
}
