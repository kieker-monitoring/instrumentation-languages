package kieker.develop.semantics.java

import kieker.develop.semantics.ISemanticExtension
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.Technology
import kieker.develop.semantics.annotations.TargetLanguage
import kieker.develop.semantics.annotations.Semantics
import kieker.develop.semantics.annotations.AnnotationsFactory

class SemanticAnnotations implements ISemanticExtension {
	
	private Semantics model
	
	new () {
		model = AnnotationsFactory.eINSTANCE.createSemantics
		model => [
			val language = createLanguage("Java")
			it.languages +=  language
			val technology = createTechnology("AspectJ")
			it.technologies += technology
			it.annotations += createAnnotationOperationSiganture(language, technology)
		]
	}
	
	override getAnnotations() {
		return model.annotations
	}
	
	override getTechnologies() {
		return model.technologies
	}
	
	override getTargetLanguages() {
		return model.languages
	}
	
	override getImplementation(Annotation semantics, Technology technology, TargetLanguage language) {
		semantics.implementations.findFirst[
			it.technology.name.equals(technology.name) &&
			it.language.name.equals(language.name)
		]
	}
	
	private def createTechnology(String name) {
		val result = AnnotationsFactory.eINSTANCE.createTechnology
		result.name = name
		
		return result
	}
	
	private def createLanguage(String name) {
		val result = AnnotationsFactory.eINSTANCE.createTargetLanguage
		result.name = name
		
		return result
	}
	
	private def createAnnotationOperationSiganture(TargetLanguage language, Technology technology) {
		val result = AnnotationsFactory.eINSTANCE.createAnnotation
		result.name = "operationSignature"
		result.implementations += createImplementation(language, technology, '''getSignature''')
		
		return result
	}
	
	private def createImplementation(TargetLanguage language, Technology technology, String code) {
		val result = AnnotationsFactory.eINSTANCE.createImplementation
		result.language = language
		result.technology = technology
		result.code = code
		
		return result
	}

	
}