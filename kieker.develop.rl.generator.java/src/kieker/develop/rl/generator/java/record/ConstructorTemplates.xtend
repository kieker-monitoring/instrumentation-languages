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
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.PropertyModifier

/**
 * Template for the constructor of Kieker records.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 */
class ConstructorTemplates {
			
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
		 «allDataProperties.filter[!it.modifiers.exists[it == PropertyModifier.INCREMENT]].map[it.createPropertyName.createParameterComment].join»
		 */
		public «type.name»(«allDataProperties.filter[!it.transient].map[property | createPropertyParameter(property)].join(', ')») {
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
	 * Create array initialization constructor.
	 * 
	 * @param type the event type
	 * @param properties a collection of all properties which are present in this event type.
	 * 
	 * @returns code for the array constructor
	 */
	static def createArrayInitializeConstructor(EventType type, List<Property> properties) '''
		/**
		 * This constructor uses the given array to initialize the fields of this record.
		 * 
		 * @param values
		 *            The values for the record.
		 * @param valueTypes
		 *            The types of the elements in the first array.
		 */
		protected «type.name»(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
			«IF (type.parent === null)»AbstractMonitoringRecord.checkArray(values, valueTypes);
			«ELSE»super(values, valueTypes);
			«ENDIF»«properties.filter[!it.isTransient].createPropertyGenericAssignments(if (type.parent !== null) type.parent.collectAllDataProperties.size else 0)»
		}
	'''
	
	/**
	 * Create the array constructor.
	 * 
	 * @param type the record type
	 * @param allDeclarationProperties list of all properties which have been declared in this type
	 */
	static def createArrayConstructor(EventType type, List<Property> properties) '''
		/**
		 * This constructor converts the given array into a record.
		 * It is recommended to use the array which is the result of a call to {@link #toArray()}.
		 * 
		 * @param values
		 *            The values for the record.
		 */
		public «type.name»(final Object[] values) { // NOPMD (direct store of values)
			«IF (type.parent === null)»AbstractMonitoringRecord.checkArray(values, TYPES);
			«ELSE»super(values, TYPES);
			«ENDIF»«properties.filter[!it.isTransient].createPropertyGenericAssignments(if (type.parent !== null)
					type.parent.collectAllDataProperties.size else 0
			)»
		}
	'''
	
	/**
	 * Create all assignments for the generic constructor based on property name and an array.
	 * 
	 * @param properties
	 * 		properties of the event type
	 * @param offset
	 * 		the array offset
	 * 
	 * @returns all assignments for the given property list
	 */
	private static def CharSequence createPropertyGenericAssignments(Iterable<Property> properties, int offset) {
		val EList<CharSequence> result = new BasicEList<CharSequence>()
		properties.forEach[property, index | result.add(property.createPropertyGenericAssignment(index+offset))]
		return result.join
	}
	
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * Used in the generic constructor.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	private static def CharSequence createPropertyGenericAssignment(Property property, int index) 
	'''this.«property.createPropertyName» = («property.findType.createObjectTypeName») values[«index»];
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
		val type = property.findType
		if (BaseTypes.STRING == BaseTypes.getTypeEnum(type.type) && 
			type.sizes.size == 0
		) { // guarantee initialization is always not null in case of plain strings
			'''this.«property.createPropertyName» = «property.createPropertyName» == null?«if (property.value !== null) property.value.createConstantReference(property) else '""'»:«property.createPropertyName»;
			'''
		} else
			'''this.«property.createPropertyName» = «property.createPropertyName»;
			'''
	}
	
	
	
	private static def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.createConstantName 
			ConstantLiteral : literal.createConstantLiteralName
			BuiltInValueLiteral : property.createConstantName
			default : throw new InternalErrorException("constant reference requested for " + literal.class + " which is not defined.")
		}
	}
	
	
}
