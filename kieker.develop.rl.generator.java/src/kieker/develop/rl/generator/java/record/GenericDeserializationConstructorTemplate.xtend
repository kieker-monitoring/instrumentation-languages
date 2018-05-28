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
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.typing.base.BaseTypes
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Contains the templates for generation of the generic deserialization constructor based on Holger Knoche's idea.
 * 
 * @author Christian Wulf
 * @since 1.4
 */
class GenericDeserializationConstructorTemplate {

	/**
	 * Create generic deserialization constructor.
	 * 
	 * @param type the EventType
	 * @param properties the collection of properties to be initialized in this constructor
	 * 
	 * @return returns a generic deserialization constructor
	 */
	static def createGenericDeserializationConstructor(EventType type, List<Property> properties) '''
		/**
		 * @param deserializer
		 *            The deserializer to use
		 * @throws RecordInstantiationException 
		 *            when the record could not be deserialized
		 */
		public «type.name»(final IValueDeserializer deserializer) throws RecordInstantiationException {
			«IF (type.parent !== null)»super(deserializer);
			«ENDIF»«properties.filter[!it.isTransient].map[
				property | createPropertyGenericDeserialization(property)
			].join('\n')»
			«properties.filter[it.isTransient].map[
				property | createPropertyGenericDefaultInitialization(property)
			].join('\n')»
		}
	'''
	
	/**
	 * Determine the correct default initialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to initialize
	 * 
	 * @returns
	 * 		code to initialize the given property 
	 */
	private def static createPropertyGenericDefaultInitialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// load array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = 0;
					«ENDIF»
				«ENDFOR»
				this.«property.createPropertyName» = new «property.findType.createTypeInstantiationName(property.createPropertyName)»;
				«createArrayAccessLoops(sizes,0, property.createPropertyName, createValueAssignmentForDefaultInitialization(sizes,property))»
			'''
		} else
			'''this.«property.createPropertyName» = «(property.findType.type as BaseType).createDefaultValue»;'''
	}

	/**
	 * Determine the correct deserialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to deserialize
	 * 
	 * @returns
	 * 		code to deserialize the given property 
	 */
	private static def createPropertyGenericDeserialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// load array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = deserializer.getInt();
					«ENDIF»
				«ENDFOR»
				this.«property.createPropertyName» = new «property.findType.createTypeInstantiationName(property.createPropertyName)»;
				«createArrayAccessLoops(sizes,0, property.createPropertyName, createValueAssignmentForDeserialization(sizes,property))»
			'''
		} else
			'''this.«property.createPropertyName» = «property.findType.type.createPropertyPrimitiveTypeDeserialization»;'''
	}

	/**
	 * Determine the name and additional array sizes for an array deserialization.
	 * For example property[2][_property_size1][6] or just property for simple fields
	 */
	private static def CharSequence createTypeInstantiationName(Classifier classifier, String name) {
		if (classifier.sizes.size > 0)
			classifier.type.createJavaTypeName + classifier.sizes.map [size |
				size.createArraySize(name, classifier.sizes.indexOf(size))
			].join
		else
			classifier.type.createJavaTypeName
	}

	/**
	 * Creates code for fixed and runtime array sizes according to the record model.
	 */
	private static def createArraySize(ArraySize size, String name, int index) {
		if (size.size > 0)
			'''[«size.size»]'''
		else
			'''[_«name»_size«index»]'''
	}

	/**
	 * Assignment for a primitive value
	 */
	private static def createValueAssignmentForDeserialization(EList<ArraySize> sizes, Property property) {
		return '''«property.createPropertyValueExpression» = «property.findType.type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Default initialization assignment for a primitive value
	 */
	private static def createValueAssignmentForDefaultInitialization(EList<ArraySize> sizes, Property property) {
		return '''«property.createPropertyValueExpression» = «property.findType.type.createDefaultValue»;'''
	}

	private static def createDefaultValue(Type type) {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING: '''""'''
				case BYTE: '''0'''
				case SHORT: '''(short) 0'''
				case INT: '''0'''
				case LONG: '''0L'''
				case FLOAT: '''0.0'''
				case DOUBLE: '''0.0'''
				case CHAR: "' '"
				case BOOLEAN: '''false'''
			}
			EnumerationType: '''«type.name».«type.literals.get(0)»'''
		}
	}

	/**
	 * Create code to get values from the input buffer.
	 */
	private static def createPropertyPrimitiveTypeDeserialization(Type type) {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING: '''deserializer.getString()'''
				case BYTE: '''deserializer.getByte()'''
				case SHORT: '''deserializer.getShort()'''
				case INT: '''deserializer.getInt()'''
				case LONG: '''deserializer.getLong()'''
				case FLOAT: '''deserializer.getFloat()'''
				case DOUBLE: '''deserializer.getDouble()'''
				case CHAR: '''deserializer.getChar()'''
				case BOOLEAN: '''deserializer.getBoolean()'''
			}
			EnumerationType: '''deserializer.getEnumeration(«type.name».class)'''	
		}
	}
}
