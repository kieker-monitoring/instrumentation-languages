/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property

import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.EnumerationType

import static kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Template for the array constructor of Kieker records.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 */
class ToStringConverterTemplates {

	static def CharSequence createToString(EventType type, List<Property> properties) '''
		/**
		 * {@inheritDoc}
		 */
		@Override
		public String toString() {
			String result = "«type.name»: ";
			«properties.filter[!it.isTransient].map[
				it.createPropertyValueLine
			].join('\n')»
		}
	'''
	
	private static def createPropertyValueLine(Property property) '''
		result = "«property.name» = ";
		«property.createPropertyValue»
	'''

	/**
	 * Determine the correct toString serialization for a property by type.
	 * 
	 * @param property
	 * 		the property to serialize
	 * 
	 * @returns
	 * 		code to serialize the given property
	 */
	private static def createPropertyValue(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// store array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.createPropertyName»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops4Expressions(sizes,0,property.createPropertyName, createValueOutput(property),'''result += "{ ";''', '''result += " }";''')»
			'''
		} else {
			createValueOutput(property)
		}
	}

	/**
	 * Create code for a property for generic serialization based on the data types.
	 * 
	 * @param property the property to be processed
	 */
	private static def createValueOutput(Property property) {
		val getterName = "this." + createGetterValueExpression(property)
		val type = property.findType.type
		switch (type) {
			BaseType: '''result += «getterName» + ", ";'''
			EnumerationType: '''result += «getterName».name() + ", ";'''
		}
	}
}