package kieker.architecture.languageServer

import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.klighd.lsp.launch.AbstractLsCreator
import java.util.List
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.util.Modules2
import org.eclipse.xtext.IGrammarAccess
import de.cau.cs.kieler.kgraph.text.services.KGraphGrammarAccess
import com.google.inject.name.Names
import org.eclipse.xtext.Constants

class KiekerLsCreator extends AbstractLsCreator {
	override getLanguageServerExtensions() {
		val List<ILanguageServerExtension> iLanguageServerExtensions = #[
			injector.getInstance(KiekerRegistrationLanguageServerExtension)
		]
		return iLanguageServerExtensions
	}

	override getRemoteInterface() {
		KGraphLanguageClient
	}
	
	override createLSModules(boolean socket) {
        return Modules2.mixin(
            super.createLSModules(socket),
            [
                bind(IGrammarAccess).to(KGraphGrammarAccess)
                bind(String).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("de.cau.cs.kieler.kgraph.text.KGraph");    
            ]    
        )
    }
}
