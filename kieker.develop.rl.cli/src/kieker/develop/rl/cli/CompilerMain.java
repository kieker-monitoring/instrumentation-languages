package kieker.develop.rl.cli;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import kieker.develop.rl.RecordLangStandaloneSetup;
import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * This class controls all aspects of the application's execution
 */
public class CompilerMain implements IApplication {
	
	/** Central logger for the compiler. */
	private static final Logger LOGGER = LogManager.getLogger(CompilerMain.class);

	@Parameter(names = { "-c", "--source" }, description = "The list of files to commit")
	private List<String> files;

	@Parameter(names = { "-h", "--help" }, help = true)
	private boolean help = false;

	@Parameter(names = { "-l", "--languages" }, variableArity = true, description = "List of targets")
	private List<String> languages;
	
	@Parameter(names = { "-o", "--output-dirs" }, variableArity = true, description = "List of target directories corresponding with targets")
	private List<String> targetDirectories;

	/** resource set for the compilation. */
	// @Inject
	private XtextResourceSet resourceSet = new XtextResourceSet();
	
	@Override
	public Object start(final IApplicationContext context) throws Exception {
		this.help = false;
		this.languages = new ArrayList<>();
		this.files = new ArrayList<>();
		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");

		new JCommander(this, appArgs);

		System.out.println("help " + this.help);
		System.out.println("lang");
		
		final Injector injector = new RecordLangStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		final Collection<AbstractOutletConfiguration<ComplexType, Object>> configurations = GeneratorRegistration.getOutletConfigurations();
		int i = 0;
		for (final String lang : this.languages) {
			String targetDirectory = targetDirectories.get(i);
			i++;
			boolean match = false;
			for (final AbstractOutletConfiguration<ComplexType, Object> configuration : configurations) {
				if (lang.equals(configuration.getLang())) {
					match = true;
					Generator generator = new Generator("/** */", ".", configuration);
					
					for (String file : files) {
						LOGGER.info("Compiling " + file + " ...");
						Resource resource = this.getResource(file);
						generator.generate(resource, targetDirectory);
					}
				}
			}
			System.out.println("\t" + lang + " " + match);
		}
		System.out.println("files");
		for (final String file : this.files) {
			System.out.println("\t" + file);
		}

		return IApplication.EXIT_OK;
	}

	
	/**
	 * Add a resource for the present project and present project source path to
	 * the resource set and return that resource.
	 *
	 * @param pathName
	 *            relative path name to the file to be added to the resource set
	 * @return the resource added to the resource set
	 */
	private Resource getResource(final String pathName) {
		// TODO shouldn't we be able to read files form any location?
		final URI uri = URI.createFileURI(new File(pathName).getAbsolutePath());
		return this.resourceSet.getResource(uri, true);
	}

	
	@Override
	public void stop() {
		// nothing to do
	}

}
