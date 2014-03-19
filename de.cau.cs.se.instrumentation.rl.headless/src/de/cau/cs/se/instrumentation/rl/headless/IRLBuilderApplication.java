/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.headless;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor; 
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.EObject; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext; 
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet; 

import com.google.inject.Injector;

import de.cau.cs.se.instrumentation.rl.RecordLangStandaloneSetup;
import de.cau.cs.se.instrumentation.rl.generator.RecordLangGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;

/**
 * @author Reiner Jung
 * 
 */
public class IRLBuilderApplication implements IApplication {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello RCP World!");
		final Map args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");
		for (final String arg : appArgs) {
			System.out.println(arg);
		}
	
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("/home/rju/runtime-Instrumentation");
		
		Injector injector = new RecordLangStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE); 
		Resource resource = resourceSet.getResource(
		    URI.createURI("file:/home/rju/runtime-Instrumentation/KiekerMonitoring/src/kieker/common/record/controlflow/ControlFlow.irl"), true);
		
		Model model = (Model) resource.getContents().get(0);
		for (EObject o : model.eContents()) {
			System.out.println(o.toString());
		}
		
		EclipseResourceFileSystemAccess2 fsa = new EclipseResourceFileSystemAccess2(); 
		
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject[] project = workspaceRoot.getProjects(); 
		fsa.setProject(project[0]);
		fsa.setOutputPath("headless-gen/"); 
		
		IProgressMonitor monitor = new NullProgressMonitor(); 
		fsa.setMonitor(monitor);
		
		// invoke generator
		RecordLangGenerator generator = new RecordLangGenerator();
		generator.doGenerate(resource, fsa);
		
		return IApplication.EXIT_OK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		// do nothing at the moment
	}

}
