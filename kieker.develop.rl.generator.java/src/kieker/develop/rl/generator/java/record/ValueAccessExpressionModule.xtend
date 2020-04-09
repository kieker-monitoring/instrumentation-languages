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

import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Value access in a record.
 */
class ValueAccessExpressionModule {
	
	
	/**
	 * Create nested loops for array access.
	 * 
	 * @param sizes the different sizes of arrays, a size of 0 indicates a dynamic array range
	 * @param depth indicates which dimension is addressed
	 * @param propertyName the property of the associated array property
	 * @param simpleTypeAction the action to be performed on non array level
	 */
	static def CharSequence createArrayAccessLoops(EList<ArraySize> sizes, int depth, 
		String propertyName, CharSequence simpleTypeAction
	) {
		'''
			for (int i«depth»=0;i«depth»<«if (sizes.get(depth).size > 0) sizes.get(depth).size else 
				'_' + propertyName + '_size' + depth»;i«depth»++)
				«if (sizes.size-1 > depth)
					createArrayAccessLoops(sizes,depth+1, propertyName, simpleTypeAction)
				else
					simpleTypeAction»
		'''
	}
	
	/**
	 * Create nested loops for array access for expressions, i.e.
	 * 
	 * @param sizes the different sizes of arrays, a size of 0 indicates a dynamic array range
	 * @param depth indicates which dimension is addressed
	 * @param propertyName the property of the associated array property
	 * @param simpleTypeAction the action to be performed on non array level
	 */
	static def CharSequence createArrayAccessLoops4Expressions(EList<ArraySize> sizes, int depth, 
		String propertyName, CharSequence simpleTypeAction,
		String prefix, String suffix
	) {
		'''
			«prefix»
			for (int i«depth»=0;i«depth»<«if (sizes.get(depth).size > 0) sizes.get(depth).size else 
				'_' + propertyName + '_size' + depth»;i«depth»++)
				«if (sizes.size-1 > depth)
					createArrayAccessLoops4Expressions(sizes,depth+1, propertyName, simpleTypeAction, prefix, suffix)
				else
					simpleTypeAction»
			«suffix»
		'''
	}
		
	/**
	 * Creates an getter for a property including all array indices necessary to access
	 * a single value of the array.
	 * 
	 * @return get/is + "capitalized property name" + "()" + "array access code"
	 */
	static def createGetterValueExpression(Property property) {
		val sizes = property.findType.sizes
		'''«property.createGetterName»()«sizes.createArrayValueAccessIndizies»'''
	}
	
	/**
	 * Create property access expression including all array indices necessary to access
	 * a single value of the array.
	 * 
	 * @param property the property to be used in the expression
	 */
	static def createPropertyValueExpression(Property property) '''
		this.«property.name»«property.findType.sizes.createArrayValueAccessIndizies»'''


	/**
	 * This produces a sequence of [0] assuming that arrays follow a matrix layout.
	 */
	static def createCodeToDetermineArraySize(int count) {
		var String result = ''
		var i = 0
		while (i < count) {
			result = result + '[0]'
			i=i+1	
		}
		return result
	}	
	
	/**
	 * Used to compose a sequence of [iX] for every dimension of an array containing
	 * the counter variable. If the variable is primitive the function returns an
	 * empty string. 
	 * 
	 * @param sizes list of array size values representing the array dimensions.
	 */
	private static def CharSequence createArrayValueAccessIndizies(EList<ArraySize> sizes) {
		var String result = ''
		for (i : 0 ..< sizes.size) 
			result = '''«result»[i«i»]'''
		return result
	}

	
}