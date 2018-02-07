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
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.typing.base.BaseTypes

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.BaseType

/**
 * Template for the parameterized constructor of Kieker records.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 */
class ParameterizedConstructorTemplates {
			
	/**
	 * Create a constructor for an EventType which gets its data from its sequence of parameters.
	 * 
	 * @param type the EventType
	 * @param allDataProperties list of all data properties
	 * @param allDeclarationProperties list of all properties which have been declared in this type
	 * 
	 * @return returns the constructor 
	 */
	static def createParameterizedConstructor(EventType type, 
		List<Property> allDataProperties, List<Property> allDeclarationProperties
	) '''
		/**
		 * Creates a new instance of this class using the given parameters.
		 * 
		 «allDataProperties.filter[!it.isIncrement].map[it.createPropertyName.createParameterComment].join»
		 */
		public «type.name»(«allDataProperties.filter[!it.isTransient || (it.isTransient && !it.isIncrement)].map[property | createPropertyParameter(property)].join(', ')») {
			«if (type.parent !== null) 'super(' + type.parent.collectAllDataProperties.filter[!it.isIncrement].map[name].join(', ')+');'»
			«allDeclarationProperties.filter[!it.isIncrement].map[property | createPropertyAssignment(property)].join»
		}
	'''
	
	/**
	 * Create an arbitrary comment for a parameter of the parameterized constructor.
	 * 
	 * @param name the name of the parameter based on the property name
	 * 
	 * @returns one comment
	 */
	private static def createParameterComment(String name) '''
		* @param «name»
		*            «name»
	'''
	
	/**
	 * Create one entry for the constructor parameter sequence.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one parameter for the given property
	 */
	private static def createPropertyParameter(Property property) 
		'''final «property.findType.createTypeName» «property.createPropertyName»'''
		
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	private static def CharSequence createPropertyAssignment(Property property) throws InternalErrorException {
		val classifier = property.findType
		val type = classifier.type
		switch(type) {
			BaseType case BaseTypes.STRING == BaseTypes.getTypeEnum(type as BaseType) && classifier.sizes.size == 0:
				// guarantee initialization is always not null in case of plain strings
				'''this.«property.createPropertyName» = «property.createPropertyName» == null?«if (property.value !== null) property.value.createConstantReference(property) else '""'»:«property.createPropertyName»;
				'''
			default:
				'''this.«property.createPropertyName» = «property.createPropertyName»;
				'''
		}
	}
	
	/**
	 * Create a reference to a constant depending on its source. This includes automatic string constants, 
	 * literal constants, and built in constants.
	 * 
	 * @param literal the source of the constant
	 * @param the corresponding property
	 * 
	 * @return source code for the constant
	 * 
	 * @throws unsupportet literals will cause an exception. This includes all numerical literals.
	 */
	private static def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.createConstantName 
			ConstantLiteral : literal.createConstantLiteralName
			BuiltInValueLiteral : property.createConstantName
			default : throw new InternalErrorException("constant reference requested for " + literal.class + " which is not defined.")
		}
	}
	
	
}
