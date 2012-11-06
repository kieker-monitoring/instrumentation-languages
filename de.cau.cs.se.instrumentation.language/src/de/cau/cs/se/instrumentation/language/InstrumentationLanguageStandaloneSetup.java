
package de.cau.cs.se.instrumentation.language;

import de.cau.cs.se.instrumentation.language.InstrumentationLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InstrumentationLanguageStandaloneSetup extends InstrumentationLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new InstrumentationLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

