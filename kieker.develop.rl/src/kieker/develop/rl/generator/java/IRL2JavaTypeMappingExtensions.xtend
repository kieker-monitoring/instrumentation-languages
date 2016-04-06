package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.typing.BaseTypes
import kieker.develop.rl.recordLang.Classifier

class IRL2JavaTypeMappingExtensions {

	private new() {
		// extension class
	}

	/**
	 * @param classifier
	 * 		A type name of the record language
	 * @return 
	 * 		the Java type name of the given <code>classifier</code>
	 */
	static def createPrimitiveTypeName(BaseType classifier) {
		switch (classifier.name) {
			case BaseTypes.INT.typeName: 'int'
			case BaseTypes.LONG.typeName: 'long'
			case BaseTypes.SHORT.typeName: 'short'
			case BaseTypes.DOUBLE.typeName: 'double'
			case BaseTypes.FLOAT.typeName: 'float'
			case BaseTypes.CHAR.typeName: 'char'
			case BaseTypes.BYTE.typeName: 'byte'
			case BaseTypes.STRING.typeName: 'String'
			case BaseTypes.BOOLEAN.typeName: 'boolean'
			default: throw new InternalErrorException("Base type " + classifier.name + " is not a defined mapping type.")
		}
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	static def createPrimitiveWrapperTypeName(BaseType classifier) {
		switch (classifier.name) {
			case BaseTypes.INT.typeName: 'Integer'
			case BaseTypes.LONG.typeName: 'Long'
			case BaseTypes.SHORT.typeName: 'Short'
			case BaseTypes.DOUBLE.typeName: 'Double'
			case BaseTypes.FLOAT.typeName: 'Float'
			case BaseTypes.CHAR.typeName: 'Character'
			case BaseTypes.BYTE.typeName: 'Byte'
			case BaseTypes.STRING.typeName: 'String'
			case BaseTypes.BOOLEAN.typeName: 'Boolean'
			default: throw new InternalErrorException("Base type " + classifier.name + " is not a defined mapping type.")
		}
	}
	
		/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else
			classifier.type.createPrimitiveTypeName
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createObjectTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else
			classifier.type.createPrimitiveWrapperTypeName
	}
	
	/**
	 * Determine the right Java string for a given system array type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createArrayTypeName(Classifier classifier) {
		val primitiveTypeName = classifier.type.createPrimitiveTypeName
		val arrayBrackets = classifier.sizes.map[size | '''[]''' ].join
		primitiveTypeName + arrayBrackets
	}
}
