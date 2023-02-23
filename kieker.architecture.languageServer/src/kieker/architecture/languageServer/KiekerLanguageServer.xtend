package kieker.architecture.languageServer


import de.cau.cs.kieler.klighd.lsp.launch.AbstractLanguageServer


class KiekerLanguageServer extends AbstractLanguageServer {
	def static void main(String[] args) {
		val server = new KiekerLanguageServer
		server.configureAndRun(new KiekerLanguageRegistration, new KiekerLsCreator)
	}
}
