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
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * This class provides templates for deprecated and active
 * API functions including string registry and storage functions.
 * 
 * It is intended to move these templates to proper locations.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 * 
 */
class EventTypeAPITemplates {
		
	/**
	 * Create code supporting the deprecated API.
	 */
	static def createDeprecatedAPI() '''
		/**
		 * {@inheritDoc}
		 * 
		 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.
		 */
		@Override
		@Deprecated
		public void initFromArray(final Object[] values) {
			throw new UnsupportedOperationException();
		}
		
		/**
		 * {@inheritDoc}
		 * 
		 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.
		 */
		@Override
		@Deprecated
		public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
			throw new UnsupportedOperationException();
		}
	'''
	
	/**
	 * In instantiable classes (non abstract classes) additional features must be added.
	 * 
	 * @param properties all properties which are accessible in this type.
	 */
	static def createActualAPI(List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public Object[] toArray() {
			return new Object[] {
				«properties.filter[!it.isTransient].map[property | '''this.«property.createGetterName»()'''].join(',\n')»
			};
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void registerStrings(final IRegistry<String> stringRegistry) {	// NOPMD (generated code)
			«properties.filter[!it.isTransient].map[it.createRegisterStringForProperty].filterNull.join('\n')»
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
			«properties.filter[!it.isTransient].map[it.createPropertyBinarySerialization].join('\n')»
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Class<?>[] getValueTypes() {
			return TYPES; // NOPMD
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public String[] getValueNames() {
			return PROPERTY_NAMES; // NOPMD
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public int getSize() {
			return SIZE;
		}
	'''
	
	/**
	 * Create string registry access for the given property.
	 * 
	 * @param property 
	 * 
	 * @returns result register access or null
	 */
	private static def CharSequence createRegisterStringForProperty(Property property) {
		if (BaseTypes.getTypeEnum(property.type.type).equals(BaseTypes.STRING)) {
			val simpleAction = '''stringRegistry.get(this.«createGetterValueExpression(property)»);'''
			val type = property.findType
			if (type.sizes.size > 0) {
				'''
					// get array length
					«FOR size : type.sizes»
						«IF (size.size == 0)»
							int _«property.createPropertyName»_size«type.sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						«ENDIF»
					«ENDFOR»
					«property.type.sizes.createArrayAccessLoops(0, property.createPropertyName, simpleAction)»
				'''
			} else
				simpleAction
			
		} else
			null
	}
	
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