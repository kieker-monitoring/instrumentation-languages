package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.typing.base.BaseTypes

class JavaTypeMapping {

	private new() {
		// extension class
	}

	/**
	 * @param classifier
	 * 		A type name of the record language
	 * @return 
	 * 		the Java type name of the given <code>classifier</code>
	 */
	static def createPrimitiveTypeName(BaseType type) throws InternalErrorException {
		switch (BaseTypes.getTypeEnum(type)) {
			case INT: 'int'
			case LONG: 'long'
			case SHORT: 'short'
			case DOUBLE: 'double'
			case FLOAT: 'float'
			case CHAR: 'char'
			case BYTE: 'byte'
			case STRING: 'String'
			case BOOLEAN: 'boolean'
		}
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	static def createPrimitiveWrapperTypeName(BaseType type)  throws InternalErrorException {
		switch (BaseTypes.getTypeEnum(type)) {
			case INT: 'Integer'
			case LONG: 'Long'
			case SHORT: 'Short'
			case DOUBLE: 'Double'
			case FLOAT: 'Float'
			case CHAR: 'Character'
			case BYTE: 'Byte'
			case STRING: 'String'
			case BOOLEAN: 'Boolean'		
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
