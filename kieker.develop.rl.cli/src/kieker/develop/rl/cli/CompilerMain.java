package kieker.develop.rl.cli;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;
import com.google.inject.Injector;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.develop.rl.RecordLangStandaloneSetup;
import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.typing.jar.guava.GuavaModelTypeProviderFactory;

/**
 * This class controls all aspects of the application's execution
 */
public class CompilerMain implements IApplication {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(CompilerMain.class);

	@Parameter(names = { "-i", "--input" }, description = "Input path")
	private String sourcePath;

	@Parameter(names = { "-p", "--project" }, variableArity = true, description = "Output base path")
	private String outputPath;

	@Parameter(names = { "-h", "--help" }, help = true)
	private boolean help = false;

	@Parameter(names = { "-o", "--outlets" }, variableArity = true, description = "List of target outlets")
	private List<String> languages;

	@Parameter(names = { "-f",
		"--file-headers" }, variableArity = true, description = "List of headers", splitter = ColonParameterSplitter.class, converter = FileConverter.class)
	private List<File> fileHeaders;

	@Parameter(names = { "-a", "--author" }, description = "Set default author name", required = false)
	private String author;

	@Parameter(names = { "-s", "--since" }, description = "Set default since value", required = false)
	private String version;

	@Parameter(names = { "-l",
		"--class-path" }, description = "Classpath for libraries containing Kieker record classes", splitter = ColonParameterSplitter.class, required = false, converter = FileConverter.class)
	private List<File> jarFiles;

	@Parameter(names = { "-t",
		"--outlet-paths" }, description = "Relative path from the project root for the target code directories", splitter = ColonParameterSplitter.class, required = false)
	private List<String> outletPaths;

	@Override
	public Object start(final IApplicationContext context) throws Exception {
		this.author = "no author";
		this.version = "no version";
		this.help = false;
		this.languages = new ArrayList<>();
		this.outputPath = null;

		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");

		new JCommander(this, appArgs);

		String output = null;
		final Collection<AbstractOutletConfiguration<ComplexType, Object>> configurations = GeneratorRegistration.getOutletConfigurations();
		for (final String lang : this.languages) {
			for (final AbstractOutletConfiguration<ComplexType, Object> configuration : configurations) {
				if (lang.equals(configuration.getName())) {
					if (output == null) {
						output = lang;
					} else {
						output += output + ", " + lang;
					}
				}
			}
		}
		LOG.info("Generating code for " + output);
		LOG.info("Output " + this.outputPath);

		/** read all provided headers. */
		final List<String> headerComments = new ArrayList<>();
		for (final File header : this.fileHeaders) {
			if (header.isFile()) {
				final byte[] bytes = Files.readAllBytes(header.toPath());
				headerComments.add(new String(bytes));
			} else {
				LOG.error("Header template " + header.getName() + " is not readable.");
				return IApplication.EXIT_OK;
			}
		}

		if (headerComments.size() < this.languages.size()) {
			LOG.error("There are missing header templates. Refer to a template file for each outlet.");
			return IApplication.EXIT_OK;
		}

		/** initialize classpath. */
		if (this.jarFiles != null) {
			GuavaModelTypeProviderFactory.getJars().addAll(this.jarFiles);
		}

		/** initialize generator. */
		final Injector injector = new RecordLangStandaloneSetup().createInjectorAndDoEMFRegistration();

		final Compiler compiler = injector.getInstance(Compiler.class);

		final Collection<AbstractOutletConfiguration<ComplexType, Object>> outlets = GeneratorRegistration.getOutletConfigurations();

		compiler.configure(outlets, this.languages, this.outletPaths, headerComments, this.version, this.author);

		compiler.compile(this.sourcePath, this.outputPath);

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}

}
