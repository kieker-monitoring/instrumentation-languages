package kieker.develop.rl.generator.modeltypes

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.RecordLangFactory

class TargetModelFactory {
	
	static def Property duplicate(Property property) {
		val duplicate = RecordLangFactory.eINSTANCE.createProperty
		
		duplicate.name = property.name
		duplicate.type = property.type
		duplicate.value = property.value
		duplicate.semantics = property.semantics
				
		return duplicate
	}
	
	static def Constant duplicate(Constant constant) {
		val duplicate = RecordLangFactory.eINSTANCE.createConstant
		
		duplicate.name = constant.name
		duplicate.type = constant.type
		duplicate.value = constant.value
						
		return duplicate
	}
}