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
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.ComplexType

/**
 * Generate the equals method of a Kieker record.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 */
class EqualsMethodTemplate {
	
	/**
	 * Create equals method.
	 * 
	 * @param className name of the Java class representing the EntityType
	 * @param properties list of all properties which are accessible in this EntityType
	 *
	 * @return returns the generated equals method
	 */
	static def CharSequence createEquals(String className, List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean equals(final Object obj) {
			if (obj == null) {
				return false;
			}
			if (obj == this) {
				return true;
			}
			if (obj.getClass() != this.getClass()) {
				return false;
			}
			
			final «className» castedRecord = («className») obj;
			if (this.getLoggingTimestamp() != castedRecord.getLoggingTimestamp()) {
				return false;
			}
			«properties.map[it.createPropertyEqualsTest].join('\n')»
			
			return true;
		}
	'''
	
	/**
	 * Create the equals check for a property of a type.
	 * 
	 * @param property the property for which the equals is created
	 * 
	 * @returns code snippet for the given property 
	 */
	private static def createPropertyEqualsTest(Property property) {
		val type = property.findType
		val simpleTypeAction = createPropertyEqualsTest(type.type, property.createGetterValueExpression)
		if (type.sizes.size > 0) {
			'''
				// get array length
				«FOR size : type.sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«type.sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						if (_«property.createPropertyName»_size«type.sizes.indexOf(size)» != castedRecord.«property.createGetterName»()«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length) {
							return false;
						}
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(type.sizes, 0, property.createPropertyName, simpleTypeAction)»
			'''
		} else
			simpleTypeAction		
	}
	
	/**
	 * Create equal check for simple values.
	 * 
	 * @param typeName name of the type
	 * @param getterExpression value access expression
	 */
	private static def CharSequence createPropertyEqualsTest(Type type, CharSequence getterExpression) throws InternalErrorException {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING: 
					'''
					if (!this.«getterExpression».equals(castedRecord.«getterExpression»)) {
						return false;
					}'''
				case FLOAT: 
					'''
					if (isNotEqual(this.«getterExpression», castedRecord.«getterExpression»)) {
						return false;
					}'''
				case DOUBLE: 
					'''
					if (isNotEqual(this.«getterExpression», castedRecord.«getterExpression»)) {
						return false;
					}'''
				default: 
					'''
					if (this.«getterExpression» != castedRecord.«getterExpression») {
						return false;
					}'''
			}
			EnumerationType:
				'''
				if (this.«getterExpression» != castedRecord.«getterExpression») {
					return false;
				}'''
			ComplexType:
				'''
				if (this.«getterExpression».equals(castedRecord.«getterExpression»)) {
					return false;
				}'''
		}
	}
	
}
