package kieker.develop.rl.generator.modeltypes

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral

class TargetModelFactory {
	
	static def Property duplicate(Property property) {
		val duplicate = RecordLangFactory.eINSTANCE.createProperty
		
		duplicate.name = property.name
		duplicate.type = property.type.duplicate
		duplicate.referTo = property.referTo // TODO this might be wrong as it might have to refer to the duplicate of the property
		duplicate.value = if (property.value != null) property.value.duplicateLiteral else null
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
	
	static def Classifier duplicate (Classifier classifier) {
		val duplicate = RecordLangFactory.eINSTANCE.createClassifier
		
		duplicate.type = classifier.type
		classifier.sizes.forEach[duplicate.sizes += it.duplicate]
						
		return duplicate
	}
	
	static def ArraySize duplicate (ArraySize arraySize) {
		val duplicate = RecordLangFactory.eINSTANCE.createArraySize
		
		duplicate.size = arraySize.size
		
		return duplicate
	}
	
	static def dispatch StringLiteral duplicateLiteral (StringLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createStringLiteral
	
		duplicate.value = literal.value
	
		return duplicate	
	}
	
	static def dispatch IntLiteral duplicateLiteral (IntLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createIntLiteral
	
		duplicate.value = literal.value
		
		return duplicate	
	}
	
	static def dispatch FloatLiteral duplicateLiteral (FloatLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createFloatLiteral

		duplicate.value = literal.value
	
		return duplicate	
	}
	
	static def dispatch BooleanLiteral duplicateLiteral (BooleanLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createBooleanLiteral

		duplicate.value = literal.value
	
		return duplicate	
	}
	
	static def dispatch ConstantLiteral duplicateLiteral (ConstantLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createConstantLiteral

		duplicate.value = literal.value
	
		return duplicate	
	}
	
	static def dispatch ArrayLiteral duplicateLiteral (ArrayLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createArrayLiteral
		
		literal.literals.forEach[duplicate.literals += it.duplicateLiteral]
	
		return duplicate	
	}
	
	static def dispatch BuiltInValueLiteral duplicateLiteral (BuiltInValueLiteral literal) {
		val duplicate = RecordLangFactory.eINSTANCE.createBuiltInValueLiteral
		
		duplicate.value = literal.value
	
		return duplicate	
	}
	
}