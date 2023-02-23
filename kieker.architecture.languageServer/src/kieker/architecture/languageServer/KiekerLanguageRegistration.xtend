package kieker.architecture.languageServer

import de.cau.cs.kieler.klighd.lsp.launch.ILanguageRegistration
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import kieker.develop.al.aspectLang.AspectLangPackage
import kieker.develop.rl.recordLang.RecordLangPackage
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import kieker.develop.al.ide.AspectLangIdeSetup

class KiekerLanguageRegistration implements ILanguageRegistration {
	override bindAndRegisterLanguages() {
		// There needs to be at least one XText language supported, as the KGraphLSExtension fails otherwise bc of that.
		// "No Xtext languages have been registered. Please make sure you have added the languages\'s setup class in \'/META-INF/services/org.eclipse.xtext.ISetup\'
		// in LanguageServerImpl.
		KGraphLSSetup.doLSSetup
		AspectLangIdeSetup.doLSSetup
		// Initialize the model packages by making sure they have been called.
		var recordPackageInstance = RecordLangPackage.eINSTANCE
		var aspectPackageInstance = AspectLangPackage.eINSTANCE

		// use the variables to remove unused warning
		recordPackageInstance = recordPackageInstance
		aspectPackageInstance = aspectPackageInstance

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);

	}
}
