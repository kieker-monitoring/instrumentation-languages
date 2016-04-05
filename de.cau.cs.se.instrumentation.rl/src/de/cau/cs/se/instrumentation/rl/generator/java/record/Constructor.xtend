package kieker.tools.rl.generator.java.record

import kieker.tools.rl.recordLang.Classifier

class Constructor {
	private String name
	private EVisibility visibility
	private Classifier[] signature
	
	new (String name, EVisibility visibility, Classifier[] signature) {
		this.name = name
		this.visibility = visibility
		this.signature = signature
	}
	
	def String getName() {
		return name
	}
	
	def EVisibility getVisibility() {
		return visibility
	}
	
	def Classifier[] getSignature() {
		return signature
	}
}
