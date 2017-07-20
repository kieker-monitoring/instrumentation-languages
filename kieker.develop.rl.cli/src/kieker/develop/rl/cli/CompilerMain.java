package kieker.develop.rl.cli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import kieker.develop.rl.generator.GeneratorRegistration;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * This class controls all aspects of the application's execution
 */
public class CompilerMain implements IApplication {

	@Parameter(description = "The list of files to commit")
	private List<String> files;

	@Parameter(names = { "-h", "--help" }, help = true)
	private boolean help = false;

	@Parameter(names = { "-l", "--languages" }, variableArity = true, description = "List of targets")
	private List<String> languages;

	@Override
	public Object start(final IApplicationContext context) throws Exception {
		this.help = false;
		this.languages = new ArrayList<>();
		this.files = new ArrayList<>();
		System.out.println("Hello RCP World!");
		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");

		new JCommander(this, appArgs);

		System.out.println("help " + this.help);
		System.out.println("lang");
		final Collection<AbstractOutletConfiguration<ComplexType, Object>> configurations = GeneratorRegistration.getOutletConfigurations();
		for (final String lang : this.languages) {
			boolean match = false;
			for (final AbstractOutletConfiguration<ComplexType, Object> configuration : configurations) {
				if (lang.equals(configuration.getLang())) {
					match = true;
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

	@Override
	public void stop() {
		// nothing to do
	}

}
