
package de.cau.se.instrumentation.language;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProbeLangStandaloneSetup extends ProbeLangStandaloneSetupGenerated{

	public static void doSetup() {
		new ProbeLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

