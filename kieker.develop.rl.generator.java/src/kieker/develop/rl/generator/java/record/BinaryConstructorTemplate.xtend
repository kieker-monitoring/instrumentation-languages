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
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.generator.InternalErrorException

/**
 * Contains the templates for generation of the binary buffer constructor. 
 * The binary buffer constructor uses a binary buffer as source to initialize
 * the event type values.
 * 
 * @author Reiner Jung
 * @since 1.3 
 */
class BinaryConstructorTemplate {

	/**
	 * Create buffer initialization constructor.
	 * 
	 * @param type the EventType
	 * @param properties the collection of properties to be initialized in this constructor
	 * 
	 * @return returns a binary buffer reader constructor
	 */
	static def createBufferReadConstructor(EventType type, List<Property> properties) '''
		/**
		 * This constructor converts the given buffer into a record.
		 * 
		 * @param buffer
		 *            The bytes for the record
		 * @param stringRegistry
		 *            The string registry for deserialization
		 * 
		 * @throws BufferUnderflowException
		 *             if buffer not sufficient
		 *
		 * @deprecated since 1.13. Use {@link #«type.name»(IValueDeserializer)} instead.
		 */
		@Deprecated
		public «type.name»(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
			«IF (type.parent !== null)»super(buffer, stringRegistry);
			«ENDIF»«properties.filter[!it.isTransient].map[property | createPropertyBinaryDeserialization(property)].join('\n')»
		}
	'''

	/**
	 * Determine the correct deserialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to deserialize
	 * 
	 * @returns
	 * 		code to deserialize the given property 
	 */
	private static def createPropertyBinaryDeserialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// load array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = buffer.getInt();
					«ENDIF»
				«ENDFOR»
				this.«property.createPropertyName» = new «property.findType.createTypeInstantiationName(property.createPropertyName)»;
				«createArrayAccessLoops(sizes, 0, property.createPropertyName, createValueAssignmentForDeserialization(sizes,property))»
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
			classifier.type.createJavaTypeName + classifier.sizes.map [ size |
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
	 * Create code to get values from the input buffer.
	 */
	private static def createPropertyPrimitiveTypeDeserialization(Type type) {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING: '''stringRegistry.get(buffer.getInt())'''
				case BYTE: '''buffer.get()'''
				case SHORT: '''buffer.getShort()'''
				case INT: '''buffer.getInt()'''
				case LONG: '''buffer.getLong()'''
				case FLOAT: '''buffer.getFloat()'''
				case DOUBLE: '''buffer.getDouble()'''
				case CHAR: '''buffer.getChar()'''
				case BOOLEAN: '''buffer.get()==1?true:false'''
			}
			EnumerationType: '''«type.name».valueOf(buffer.getInt())'''
			default: throw new InternalErrorException("createPropertyPrimitiveTypeDeserializarion does not support complex types.")
		}
	}
}
