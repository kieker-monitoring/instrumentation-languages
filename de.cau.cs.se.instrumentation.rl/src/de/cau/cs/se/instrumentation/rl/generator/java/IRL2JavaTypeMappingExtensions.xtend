package de.cau.cs.se.instrumentation.rl.generator.java;

import org.eclipse.emf.ecore.EClassifier

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
	def static createPrimitiveTypeName(EClassifier classifier) {
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
			default: classifier.name
		}
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	def static createPrimitiveWrapperTypeName(EClassifier classifier) {
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
			default: classifier.name
		}
	}
}
