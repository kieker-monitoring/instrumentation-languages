package kieker.develop.rl.generator.java.record

import kieker.develop.rl.validation.PropertyEvaluation
import kieker.develop.rl.recordLang.Property


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
		if (PropertyEvaluation::findType(property).type.name.equals('boolean')) 
			'''is«property.name.toFirstUpper»'''
		else
			'''get«property.name.toFirstUpper»'''
	}
	
	/**
	 * create a constant name from a standard name camel case name.
	 */
	static def createConstantName(String name) {
		// CaMeL -> CA_ME_L
		return name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
	}
	
	/**
	 * Check whether a given name is identical to a keyword of the target language and prepends an _. 
	 */
	static def protectKeywords(String name) {
		val keywords = #[ 'interface', 'class', 'private', 'protected', 'public', 'return', 'final', 'volatile', 'if', 'else', 'for', 'foreach' ]
		if (keywords.exists[it.equals(name)])
			'_' + name
		else
			name
	}

}