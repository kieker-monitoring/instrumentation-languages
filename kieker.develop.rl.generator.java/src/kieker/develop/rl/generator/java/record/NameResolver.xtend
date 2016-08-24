package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.Constant

import static extension kieker.develop.rl.typing.TypeResolution.*

class NameResolver {
	
	/**
	 * Returns the correct name for a getter following Java conventions.
	 * 
	 * @param property
	 * 		a property of a record type
	 * 
	 * @returns the name of the getter of the property
	 */
	static def CharSequence createGetterName(Property property) {
		if (property.findType.type.name.equals('boolean')) 
			'''is«property.name.toFirstUpper»'''
		else
			'''get«property.name.toFirstUpper»'''
	}
	
	static def createConstantLiteralName(ConstantLiteral literal) {
		return literal.value.name.protectKeywords
	}
	
	static def createConstantName(Constant constant) {
		return constant.name.protectKeywords
	}
	
	/**
	 * create a constant name from a standard name camel case name.
	 */
	static def createConstantName(Property property) {
		// CaMeL -> CA_ME_L
		return property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase.protectKeywords
	}
	
	static def createName(Property property) {
		property.name.protectKeywords
	}
	
	/**
	 * Check whether a given name is identical to a keyword of the target language and prepends an _. 
	 */
	private static def protectKeywords(String name) {
		val keywords = #[ 'interface', 'class', 'private', 'protected', 'public', 'return', 'final', 'volatile', 'if', 'else', 'for', 'foreach' ]
		if (keywords.exists[it.equals(name)])
			'_' + name
		else
			name
	}

}