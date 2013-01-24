package de.cau.cs.se.kieker.service.launch;

import java.io.Serializable;
import java.util.HashMap;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.cau.cs.se.kieker.service.job.ClientKiekerServiceJob;
import de.cau.cs.se.kieker.service.job.KiekerServiceJob;
import de.cau.cs.se.kieker.service.job.ServerKiekerServiceJob;

public class KiekerServiceLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	public static final String ATTR_IP = "ip";
	public static final String ATTR_PORT = "port";
	public static final String ATTR_TYPE = "type";
	
	public static final String ATTR_PROJECT = "project";
	
	public static final String ATTR_PROBE = "probe";
	
	public static final String ATTR_KIEKER_CONFIG = "config";
	
	@Override
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
            IProgressMonitor monitor) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(configuration.getAttribute(ATTR_PROJECT, ""));
		final IFile configurationFile = project.getFile(configuration.getAttribute(ATTR_KIEKER_CONFIG, ""));
		final IFile probeFile = project.getFile(configuration.getAttribute(ATTR_KIEKER_CONFIG, ""));
		
		Configuration kiekerConfiguration = ConfigurationFactory.createConfigurationFromFile(configurationFile.getLocation().toOSString());

		final int port = configuration.getAttribute(ATTR_PORT, 9000);
		final String ip = configuration.getAttribute(ATTR_IP, "localhost");
				
		// FIXME this is a dirty hack java.net.URI -> String ->
		// org.eclipse.emf.common.util.URI
		final URI inputURI = URI.createPlatformResourceURI(probeFile.getFullPath().toPortableString(), true);

		// FIXME Why is a new resource set required? Can we use an already
		// existing Eclipse resource set?
		final ResourceSet set = new ResourceSetImpl();
		final Resource setupResource = set.getResource(inputURI, true);

		Map<Long, Class<IMonitoringRecord>> records = null; 
		// http://www.slideshare.net/pieceoflena/eclipse-launching-framework
		
		KiekerServiceJob job;
		if (configuration.getAttribute(ATTR_PROJECT, "").equals("SERVER")) {
			job = new ServerKiekerServiceJob("Server",port,records,kiekerConfiguration);
		} else {
			job = new ClientKiekerServiceJob("Client",ip,port,records,kiekerConfiguration);
		}
		job.schedule();
			
    }

}
