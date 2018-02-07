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

import java.util.List
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.ConstantConstructionTemplates.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Generate code for property declaration, constant fields, getters and setters.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class PropertyConstructionModule {
	
	/**
	 * Create the Java declarations for a list of properties.
	 * 
	 * @param properties the properties to process
	 * 
	 * @return Java code block with declarations
	 */	
	static def createPropertyDeclarations(List<Property> properties) {
		properties.map[property | createPropertyDeclaration(property)].join
	}
	
	/**
	 * Create getter for a list of properties of an EventType
	 * 
	 * @param type the EventType
	 * 
	 * @return Java code block with getters
	 */		
	static def createPropertyGettersAndSetters(EventType type) {
		type.collectAllGetterDeclarationProperties.map[it.createPropertyGetterAndSetter].join("\n")
	}
	
	/**
	 * Create a property declaration for a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns  one property declaration
	 */
	private static def createPropertyDeclaration(Property property) '''
		private «if (!property.isChangable && !property.isIncrement) 'final '»«property.findType.createTypeName» «property.createPropertyName»«property.initialValue»;
	'''
		
	/**
	 * Create the constant initializer for strings and incremental values
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns  one property declaration
	 */			
	private static def initialValue(Property property) {
		if (property.increment) {
			if (property.value !== null) {
				val type = property.findType.type
				switch (type) {
					BaseType: switch (BaseTypes.getTypeEnum(type)) {
						case BYTE: return ' = ' + property.value.createLiteral
						case SHORT: return ' = ' + property.value.createLiteral
						case INT: return ' = ' + property.value.createLiteral
						case LONG: return ' = ' + property.value.createLiteral
						default: return ''
					}
					default: ''
				}
			} else { 
				return ''
			}
		}
	}
					
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	private static def createPropertyGetterAndSetter(Property property) '''
		public final «property.findType.createTypeName» «property.createGetterName»() {
			return this.«
				if (property.referTo !== null)
					'''«property.referTo.createGetterName»()'''
				else
					property.createPropertyName+if (property.isIncrement) '++' else ''»;
		}
		
		«IF property.isChangable && !property.isIncrement»
		public final void «property.createSetterName»(«property.findType.createTypeName» «property.createPropertyName») {
			«IF (property.referTo !== null)»
				«property.referTo.createSetterName»(«property.createPropertyName»);
			«ELSE»
				this.«property.createPropertyName» = «property.createPropertyName»;
			«ENDIF»
		}
		«ENDIF»
	'''
	
					
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	static def createPropertyTypeArrayEntry(Property property, EventType type) 
		'''«property.findType.createTypeName».class, // «property.createPropertyFQN(type)»
		'''
}
