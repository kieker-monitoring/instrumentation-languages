package de.cau.cs.se.kieker.service.eclipse.launch;


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.configuration.ConfigurationFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import de.cau.cs.se.kieker.service.Service;
import de.cau.cs.se.kieker.service.eclipse.job.KiekerServiceJob;
import de.cau.cs.se.kieker.service.tcp.TCPClientService;
import de.cau.cs.se.kieker.service.tcp.TCPServerService;

public class KiekerServiceLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	public static final String ATTR_IP = "ip";            // IP address of the service providing monitoring data
	public static final String ATTR_PORT = "port";        // PORT of that service (client mode) or 
	                                                      // PORT to listen to (server mode) 
	public static final String ATTR_TYPE = "type";        // connection mode: server or client
	
	public static final String ATTR_PROJECT = "project";  // the project where the configuration belong to
	
	public static final String ATTR_RECORD_LIBS = "recordTypes";
	public static final String ATTR_RECORD_IDS = "recordIds";

	
	public static final String ATTR_KIEKER_CONFIG = "config"; // reference to the kieker configuration file
	
	@SuppressWarnings("unchecked")
    @Override
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
            IProgressMonitor monitor) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(configuration.getAttribute(ATTR_PROJECT, ""));
		final IFile configurationFile = project.getFile(configuration.getAttribute(ATTR_KIEKER_CONFIG, ""));
		List<String> recordLibraries = (List<String>)configuration.getAttribute(ATTR_RECORD_LIBS, new ArrayList<String>());
		Map<String,String> recordIds = (Map<String,String>)configuration.getAttribute(ATTR_RECORD_IDS, new HashMap<String,String>());

		// How to get a Kieker configuration from an arbitrary configuration file
		Configuration kiekerConfiguration = ConfigurationFactory.createConfigurationFromFile(configurationFile.getLocation().toOSString());

		final int port = configuration.getAttribute(ATTR_PORT, 9000);
		final String hostname = configuration.getAttribute(ATTR_IP, "localhost");
				
		// FIXME this is a dirty hack java.net.URI -> String ->
		// org.eclipse.emf.common.util.URI
		// final URI inputURI = URI.createPlatformResourceURI(probeFile.getFullPath().toPortableString(), true);

		// FIXME Why is a new resource set required? Can we use an already
		// existing Eclipse resource set?
		// final ResourceSet set = new ResourceSetImpl();
		// final Resource setupResource = set.getResource(inputURI, true);

		URL urls[] = new URL[recordLibraries.size()];
		for (int i=0;i<recordLibraries.size();i++) {
	        try {
	            urls[i] = project.getFile(recordLibraries.get(i)).getRawLocationURI().toURL();
            } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
		}
		
		URLClassLoader classLoader = new URLClassLoader(urls,this.getClass().getClassLoader());
		
		Map<Integer, Class<IMonitoringRecord>> records = new HashMap<Integer, Class<IMonitoringRecord>>();
		for (String key : recordIds.keySet()) {
			try {
				Class<?> clazz = classLoader.loadClass(recordIds.get(key));
				records.put(Integer.parseInt(key), (Class<IMonitoringRecord>)clazz);
            } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
		}
		
		Service service;
		if (configuration.getAttribute(ATTR_TYPE, "").equals("SERVER")) {
			service = new TCPServerService (kiekerConfiguration, records, port);
		} else {
			service = new TCPClientService (kiekerConfiguration, records, hostname, port);
		}
		KiekerServiceJob job = new KiekerServiceJob("Kieker Data Bridge",service);
		service.addListener(job);
		job.schedule();
			
    }

}
