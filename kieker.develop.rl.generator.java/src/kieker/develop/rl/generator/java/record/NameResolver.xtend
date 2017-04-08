/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.Constant

import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType

/**
 * The name resolver of the Java generator maps
 * IRL entities to names usable in Java.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 */
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
	
	/**
	 * Create a constant name for a literal.
	 * 
	 * @param literal the constant literal
	 * 
	 * @return the property constant literal name
	 */
	static def createConstantLiteralName(ConstantLiteral literal) {
		return literal.value.name.protectKeywords
	}
	
	/**
	 * Create a name for a constant.
	 * 
	 * @param constant the input constant
	 * 
	 * @returns a Java constant name
	 */
	static def createConstantName(Constant constant) {
		return constant.name.protectKeywords
	}
	
	/**
	 * create a constant name based on a property name.
	 * This implies the property name in camel case is converted to a Java constant name.
	 * 
	 * @param property the input property
	 * 
	 * @return the constant name
	 */
	static def createConstantName(Property property) {
		// CaMeL -> CA_ME_L
		return property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase.protectKeywords
	}
	
	/**
	 * Create a Java language property name.
	 * 
	 * @param property the input property to be used
	 * 
	 * @return the target level property name
	 */
	static def createPropertyName(Property property) {
		property.name.protectKeywords
	}
	
	/**
	 * Check whether a given name is identical to a keyword of the target language (Java)
	 * and prepends an _.
	 * 
	 * @param name is a name of a property, constant or method
	 * 
	 * @return Java save name 
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
			if (type.parent !== null) {
				val result = property.createPropertyFQN(type.parent)
				if (result !== null)
					return result
			}
			
			if (type.inherits !== null) {
				for (TemplateType templateType : type.inherits) {
					val result = property.createPropertyFQN(templateType)
					if (result !== null)
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
		else if (type.inherits !== null) {
			for (TemplateType templateType : type.inherits) {
				val result = property.createPropertyFQN(templateType)
				if (result !== null)
					return result
			}
		}
				
		return null
	}
}
