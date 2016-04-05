package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BaseType

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
	def static createPrimitiveTypeName(BaseType classifier) {
		switch (classifier.name) {
			case 'int': 'int'
			case 'long': 'long'
			case 'short': 'short'
			case 'double': 'double'
			case 'float': 'float'
			case 'char': 'char'
			case 'byte': 'byte'
			case 'string': 'String'
			case 'boolean': 'boolean'
			default: throw new InternalErrorException("Base type " + classifier.name + " is not a defined mapping type.")
		}
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	def static createPrimitiveWrapperTypeName(BaseType classifier) {
		switch (classifier.name) {
			case 'int': 'Integer'
			case 'long': 'Long'
			case 'short': 'Short'
			case 'double': 'Double'
			case 'float': 'Float'
			case 'char': 'Character'
			case 'byte': 'Byte'
			case 'string': 'String'
			case 'boolean': 'Boolean'
			default: throw new InternalErrorException("Base type " + classifier.name + " is not a defined mapping type.")
		}
	}
}
