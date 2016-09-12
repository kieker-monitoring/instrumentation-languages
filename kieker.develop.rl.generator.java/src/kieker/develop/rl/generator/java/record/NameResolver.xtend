package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.Constant

import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType

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
	
	static def createPropertyName(Property property) {
		property.name.protectKeywords
	}
	
	/**
	 * Check whether a given name is identical to a keyword of the target language and prepends an _. 
	 */
	private static def protectKeywords(String name) {
		val keywords = #['abstract', 'assert',
			'boolean', 'break', 'byte', 
			'case', 'catch', 'char', 'class', 'const', 'continue',
			'default',  'do', 'double',
			'else', 'enum', 'extends',
			'final', 'finally', 'float', 'for',
			'goto',
			'if', 'implements', 'import', 'instanceof', 'int', 'interface',
			'native', 'new',
			'package', 'private', 'protected', 'public',
			'return', 
			'short', 'static', 'strictfp', 'super',
			'this', 'throw', 'transient', 'try',
			'void', 'volatile', 'while',
			'false', 'null', 'true']
		if (keywords.exists[it.equals(name)])
			'_' + name
		else
			name
	}

		/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present EventType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	static def CharSequence createPropertyFQN(Property property, EventType type) {
		if (type.properties.contains(property)) { 
			return type.name + '.' + property.name
		} else {
			if (type.parent!=null) {
				val result = property.createPropertyFQN(type.parent)
				if (result != null)
					return result
			}
			
			if (type.inherits != null) {
				for (TemplateType templateType : type.inherits) {
					val result = property.createPropertyFQN(templateType)
					if (result != null)
						return result
				}
			}
			return null
		}
	}
	
	/**
	 * Compute the fully qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present EventType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	static def CharSequence createPropertyFQN(Property property, TemplateType type) {
		if (type.properties.contains(property))
			return type.name + '.' + property.name
		else if (type.inherits != null) {
			for (TemplateType templateType : type.inherits) {
				val result = property.createPropertyFQN(templateType)
				if (result != null)
					return result
			}
		}
				
		return null
	}
}