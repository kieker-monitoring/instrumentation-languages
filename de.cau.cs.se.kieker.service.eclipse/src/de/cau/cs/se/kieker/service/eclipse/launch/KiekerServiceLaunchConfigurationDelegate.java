/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group 
 *  and others.
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
package de.cau.cs.se.kieker.service.eclipse.launch;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.configuration.ConfigurationFactory;

import de.cau.cs.se.kieker.service.AbstractService;
import de.cau.cs.se.kieker.service.eclipse.Activator;
import de.cau.cs.se.kieker.service.eclipse.job.KiekerServiceJob;
import de.cau.cs.se.kieker.service.jms.JMSEmbeddedService;
import de.cau.cs.se.kieker.service.jms.JMSService;
import de.cau.cs.se.kieker.service.tcp.TCPClientService;
import de.cau.cs.se.kieker.service.tcp.TCPMultiServerService;
import de.cau.cs.se.kieker.service.tcp.TCPSingleServerService;

/**
 * Service launch delegate for the Kieker bridge.
 * 
 * @author rju -- initial contribution
 * 
 */
public class KiekerServiceLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	public static final String ATTR_IP = "ip"; // IP address of the service providing monitoring
											   // data
	public static final String ATTR_CLIENT_PORT = "client-port"; // PORT of that service (client
																 // mode)
	public static final String ATTR_JMS_PORT = "jms-port"; // PORT of the embedded JMS
	public static final String ATTR_SERVER_PORT = "server-port"; // PORT to listen to (server mode)
	public static final String ATTR_USER = "user"; // JMS user name
	public static final String ATTR_PASSWORD = "password"; // JMS password
	public static final String ATTR_URL = "url"; // JMS url

	public static final String ATTR_TYPE = "type"; // connection mode: server or client

	public static final String ATTR_PROJECT = "project"; // the project where the configuration
														 // belong to

	public static final String ATTR_RECORD_LIBS = "recordTypes";
	public static final String ATTR_RECORD_IDS = "recordIds";

	public static final String ATTR_KIEKER_CONFIG = "config"; // reference to the kieker
															  // configuration file

	/**
	 * Constructor.
	 */
	public KiekerServiceLaunchConfigurationDelegate() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.
	 * ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void launch(final ILaunchConfiguration configuration, final String mode,
	        final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
		        .getProject(configuration.getAttribute(ATTR_PROJECT, ""));
		final IFile configurationFile = project.getFile(configuration.getAttribute(
		        ATTR_KIEKER_CONFIG, ""));
		final List<String> recordLibraries = (List<String>) configuration.getAttribute(
		        ATTR_RECORD_LIBS, new ArrayList<String>());
		final Map<String, String> recordIds = (Map<String, String>) configuration.getAttribute(
		        ATTR_RECORD_IDS, new HashMap<String, String>());

		// How to get a Kieker configuration from an arbitrary configuration file
		final Configuration kiekerConfiguration = ConfigurationFactory
		        .createConfigurationFromFile(configurationFile.getLocation().toOSString());

		final URL[] urls = new URL[recordLibraries.size()];
		for (int i = 0; i < recordLibraries.size(); i++) {
			try {
				urls[i] = project.getFile(recordLibraries.get(i)).getRawLocationURI().toURL();
			} catch (MalformedURLException e) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				        "Malformed library URI " + recordLibraries.get(i), e));
			}
		}

		final URLClassLoader classLoader = new URLClassLoader(urls, this.getClass()
		        .getClassLoader());

		final Map<Integer, Class<IMonitoringRecord>> records = new HashMap<Integer, Class<IMonitoringRecord>>();
		for (String key : recordIds.keySet()) {
			try {
				final Class<?> clazz = classLoader.loadClass(recordIds.get(key));
				records.put(Integer.parseInt(key), (Class<IMonitoringRecord>) clazz);
			} catch (ClassNotFoundException e) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				        "Record class  " + recordIds.get(key) + " not found.", e));
			}
		}

		AbstractService service;
		String type = configuration.getAttribute(ATTR_TYPE, "");
		if (ServiceTypes.TCP_SERVER.name().equals(type)) {
			final int port = configuration.getAttribute(ATTR_SERVER_PORT, 9000);
			service = new TCPSingleServerService(kiekerConfiguration, records, port);
		} else if (ServiceTypes.TCP_MULTI_SERVER.name().equals(type)) {
			final int port = configuration.getAttribute(ATTR_SERVER_PORT, 9000);
			service = new TCPMultiServerService(kiekerConfiguration, records, port);
		} else if (ServiceTypes.TCP_CLIENT.name().equals(type)) {
			final int port = configuration.getAttribute(ATTR_CLIENT_PORT, 9000);
			final String hostname = configuration.getAttribute(ATTR_IP, "localhost");
			service = new TCPClientService(kiekerConfiguration, records, hostname, port);
		} else if (ServiceTypes.JMS_CLIENT.name().equals(type)) {
			final String username = configuration.getAttribute(ATTR_USER, "");
			final String password = configuration.getAttribute(ATTR_PASSWORD, "");

			try {
				final URI uri = new URI(configuration.getAttribute(ATTR_URL, ""));
				service = new JMSService(kiekerConfiguration, records, username, password, uri);
			} catch (URISyntaxException e) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				        "Malformed JMS URI " + configuration.getAttribute(ATTR_URL, ""), e));
			}
		} else if (ServiceTypes.JMS_EMBEDDED.name().equals(type)) {
			final int port = configuration.getAttribute(ATTR_JMS_PORT, 9000);
			try {
				service = new JMSEmbeddedService(kiekerConfiguration, records, port);
			} catch (URISyntaxException e) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				        "Auto-generated JMS URI is malformed.", e));
			}
		} else {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
			        "Missing implementation for server start of "
			                + configuration.getAttribute(ATTR_TYPE, "")));
		}
		final KiekerServiceJob job = new KiekerServiceJob("Kieker Data Bridge", service);
		service.addListener(job);
		job.schedule();
	}

}
