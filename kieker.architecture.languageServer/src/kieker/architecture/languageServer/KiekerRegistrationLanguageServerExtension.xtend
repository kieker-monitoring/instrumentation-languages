package kieker.architecture.languageServer

import de.cau.cs.kieler.klighd.lsp.launch.AbstractRegistrationLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.launch.Language

class KiekerRegistrationLanguageServerExtension extends AbstractRegistrationLanguageServerExtension {
    override getLanguageExtensions() {
        return newArrayList(
            new Language("xmi", "Execution Model", #[]),
            new Language("xmi", "Assembly Model", #[])
        )
    }	
}
