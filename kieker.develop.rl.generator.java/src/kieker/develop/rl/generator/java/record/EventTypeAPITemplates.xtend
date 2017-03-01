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
	 * Create methods to access different generated record constants.
	 */
	static def createConstantAccessMethods() '''
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
	 * Create array representation.
	 * 
	 * @param properties ordered list of properties of an event type
	 */
	static def createToArrayRepresentation(List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public Object[] toArray() {
			return new Object[] {
				«properties.filter[!it.isTransient].map[property | '''this.«property.createGetterName»()'''].join(',\n')»
			};
		}
	'''
	
	/**
	 * Create the string registration.
	 * 
	 * @param properties ordered list of properties of an event type
	 */
	static def createStringRegistration(List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void registerStrings(final IRegistry<String> stringRegistry) {	// NOPMD (generated code)
			«properties.filter[!it.isTransient].map[it.createRegisterStringForProperty].filterNull.join('\n')»
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
	
}