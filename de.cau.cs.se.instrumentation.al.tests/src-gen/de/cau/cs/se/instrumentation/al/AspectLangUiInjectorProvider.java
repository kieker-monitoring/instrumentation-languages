/*
 * generated by Xtext
 */
package kieker.tools.al;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AspectLangUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return kieker.tools.al.ui.internal.AspectLangActivator.getInstance().getInjector("kieker.tools.al.AspectLang");
	}
	
}
