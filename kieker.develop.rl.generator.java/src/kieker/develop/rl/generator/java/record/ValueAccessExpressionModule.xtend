package kieker.develop.rl.generator.java.record

import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.TypeResolution.*

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
	 * Creates an getter for a property including all array indices necessary to access
	 * a single value of the array.
	 * 
	 * @return get/is + "capitalized property name" + "()" + "array access code"
	 */
	static def createGetterValueExpression(Property property) {
		val sizes = property.type.sizes
		'''«property.createGetterName»()«sizes.createArrayValueAccessIndizies»'''
	}
	
	/**
	 * Create property access expression ncluding all array indices necessary to access
	 * a single value of the array.
	 * 
	 * @param property the property to be used in the expression
	 */
	static def createPropertyValueExpression(Property property) '''
		this.«property.name»«property.findType.sizes.createArrayValueAccessIndizies»'''
	
	
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
	
	
}