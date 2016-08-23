package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.typing.TypeResolution.*


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
	
	/**
	 * Determine the size of the resulting binary serialization.
	 * 
	 * @param allProperties
	 * 		all properties of a record type
	 * 
	 * @returns
	 * 		the computed value
	 */
	 def static int calculateSize(Iterable<Property> list) {
		list.fold(0)[result, property | result + property.size]
	}
		
	/**
	 * Determine the size of one type.
	 * 
	 * @param property
	 * 		property which serialization size is determined.
	 * 
	 * @returns
	 * 		the serialization size of the property
	 */
	def static private int getSize(Property property) throws InternalErrorException {
		switch (BaseTypes.getTypeEnum(property.findType.type)) {
			case STRING : 4
			case BYTE : 1
			case SHORT: 2
			case INT : 4
			case LONG : 8
			case FLOAT : 4
			case DOUBLE : 8
			case CHAR : 2
			case BOOLEAN : 1
		}
	}
}
