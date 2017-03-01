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

import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.Property
import java.util.List

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Contains the templates for serialization of a record.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 */
class SerializationTemplates {

	/**
	 * Create binary serialization method.
	 * 
	 * @param collection of properties to be serialized.
	 */
	static def createBinarySerialization(List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
			«properties.filter[!it.isTransient].map[it.createPropertyBinarySerialization].join('\n')»
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
	private static def createPropertyBinarySerialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// store array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
						buffer.putInt(_«property.createPropertyName»_size«sizes.indexOf(size)»);
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(sizes,0,property.createPropertyName, createValueStoreForSerialization(property))»
			'''
		} else {
			createValueStoreForSerialization(property)
		}
	}
	
		/**
	 * Create code for a property for binary serialization based on the data types.
	 * 
	 * @param property the property to be processed
	 */
	private static def createValueStoreForSerialization(Property property) {
		val getterName = "this." + createGetterValueExpression(property)
		switch (BaseTypes.getTypeEnum(property.findType.type)) {
			case STRING : '''buffer.putInt(stringRegistry.get(«getterName»));'''
			case BYTE : '''buffer.put((byte)«getterName»);'''
			case SHORT : '''buffer.putShort(«getterName»);'''
			case INT : '''buffer.putInt(«getterName»);'''
			case LONG : '''buffer.putLong(«getterName»);'''
			case FLOAT : '''buffer.putFloat(«getterName»);'''
			case DOUBLE : '''buffer.putDouble(«getterName»);'''
			case CHAR : '''buffer.putChar(«getterName»);'''
			case BOOLEAN : '''buffer.put((byte)(«getterName»?1:0));'''
		}
	}	
}