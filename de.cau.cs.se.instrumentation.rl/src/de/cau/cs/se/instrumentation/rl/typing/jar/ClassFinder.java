package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

//TODO add Dependency
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import de.cau.cs.se.instrumentation.rl.recordLang.impl.ModelImpl;

/**
 * Scans jars for classes implementing IMonitoringRecords and triggers the creation of RecordLang-Model-Instances,
 * to make them accessible for IRL elements.
 *
 * @author Yannic Kropp
 *
 */

public class ClassFinder {

	private Set<?> classes;

	/**
	 * creates new ClassFinder and scans whole classpath for IMonitoringRecords
	 */
	protected ClassFinder(final URL[] urls) {
		final PrivilegedClassLoaderAction action = new PrivilegedClassLoaderAction(urls);
		final URLClassLoader classLoader = AccessController.doPrivileged(action);
		final URLClassLoader urlcl = new URLClassLoader(urls);
		final Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forClassLoader(urlcl)).addClassLoader(urlcl));
		try {

			this.classes = reflections.getSubTypesOf(classLoader.loadClass("kieker.common.record.IMonitoringRecord"));
		} catch (final ClassNotFoundException e) {
			// System.out.println(e);
			// System.out.println("IMonitoringRecord is not in ClassPath (no implementing classes possible)");
			this.classes = Collections.EMPTY_SET;
		}
	}

	/**
	 * creates models of IMonitoring-Classes
	 *
	 */
	protected ArrayList<ModelImpl> getModels() throws Exception {
		ArrayList<ModelImpl> resultModels = null;
		final ArrayList<Class<?>> result = new ArrayList<Class<?>>();
		final Iterator queue = this.classes.iterator();
		while (queue.hasNext()) {
			final Class a = (Class) queue.next();
			result.add(a);
		}
		// Trigger Model-Creation
		if (!result.isEmpty()) {
			final DynamicEMFHelper emfHelper = new DynamicEMFHelper();
			resultModels = emfHelper.createTypes(result);
		}
		return resultModels;
	}
}
