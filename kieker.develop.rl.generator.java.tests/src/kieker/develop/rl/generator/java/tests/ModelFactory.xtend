package kieker.develop.rl.generator.java.tests

import kieker.develop.rl.typing.base.BaseTypes
import java.util.Collection
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.EventType
import java.util.List

class ModelFactory {
	
	/**
	 * Create a classifier for a base type.
	 */
	static def createClassifier(BaseTypes type, Collection<ArraySize> sizes) {
		val result = RecordLangFactory.eINSTANCE.createClassifier
		result.type = RecordLangFactory.eINSTANCE.createBaseType
		result.type.name = type.name.toLowerCase
		if (sizes != null)
			result.sizes.addAll(sizes)
		
		return result
	}
	
	static def createProperty(String name, Classifier classifier) {
		val result = RecordLangFactory.eINSTANCE.createProperty
		result.name = name
		result.type = classifier
		
		return result
	}
	
	static def createModel(String name) {
		val result = RecordLangFactory.eINSTANCE.createModel
		result.name = name
		
		return result
	}
	
	static def createEventType(String name, EventType parent, List<TemplateType> inherits) {
		val result = RecordLangFactory.eINSTANCE.createEventType
		result.name = name
		result.parent = parent
		if (inherits != null)
			result.inherits.addAll(inherits)
		result.abstract = false
		
		return result
	}
	
	static def createTemplateType(String name, List<TemplateType> inherits) {
		val result = RecordLangFactory.eINSTANCE.createTemplateType
		result.name = name
		if (inherits != null)
			result.inherits.addAll(inherits)
		
		return result
	}
}