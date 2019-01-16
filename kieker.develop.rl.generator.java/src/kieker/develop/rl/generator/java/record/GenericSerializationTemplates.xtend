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
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes

import static kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Contains the templates for generic serialization of a record based on Holger Knoche's idea.
 * 
 * @since 1.4
 * 
 * @author Christian Wulf
 */
class GenericSerializationTemplates {

	/**
	 * Create generic serialization method.
	 * 
	 * @param collection of properties to be serialized.
	 */
	static def createGenericSerialization(List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void serialize(final IValueSerializer serializer) throws BufferOverflowException {
			«properties.filter[!it.isTransient].map[
				it.createPropertyGenericSerialization
			].join('\n')»
		}
		
	'''

	/**
	 * Determine the correct serialization for a property by type.
	 * 
	 * @param property
	 * 		the property to serialize
	 * 
	 * @returns
	 * 		code to serialize the given property
	 */
	private static def createPropertyGenericSerialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// store array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
						serializer.putInt(_«property.createPropertyName»_size«sizes.indexOf(size)»);
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(sizes,0,property.createPropertyName, createValueStoreForSerialization(property))»
			'''
		} else {
			createValueStoreForSerialization(property)
		}
	}

	/**
	 * Create code for a property for generic serialization based on the data types.
	 * 
	 * @param property the property to be processed
	 */
	private static def createValueStoreForSerialization(Property property) {
		val getterName = "this." + createGetterValueExpression(property)
		val type = property.findType.type
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING: '''serializer.putString(«getterName»);'''
				case BYTE: '''serializer.putByte(«getterName»);'''
				case SHORT: '''serializer.putShort(«getterName»);'''
				case INT: '''serializer.putInt(«getterName»);'''
				case LONG: '''serializer.putLong(«getterName»);'''
				case FLOAT: '''serializer.putFloat(«getterName»);'''
				case DOUBLE: '''serializer.putDouble(«getterName»);'''
				case CHAR: '''serializer.putChar(«getterName»);'''
				case BOOLEAN: '''serializer.putBoolean(«getterName»);'''
			}
			EnumerationType: '''serializer.putInt(«getterName».ordinal());'''
		}
	}
}
