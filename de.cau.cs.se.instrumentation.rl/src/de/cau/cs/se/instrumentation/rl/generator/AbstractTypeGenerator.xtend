package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

abstract class AbstractTypeGenerator {
	
	protected var boolean languageSpecificFolder;
			
	/**
	 * Compute the directory name for a given type based on the package it belongs to.
	 * 
	 * @param type
	 * 		the type model
	 */
	def abstract CharSequence directoryName(Type type);
	
	/**
	 * Return the complete filename of the file type this generator produces in correct
	 * language format for the given record.
	 */
	def abstract String fileName(Type type);
	
	/**
	 * Convert a classifier into a primitive type for a
	 * target language.
	 * 
	 * @param classifier
	 * 		a classifier specifying a primitive type
	 */
	def abstract CharSequence createTypeName(Classifier classifier);
	
	/**
	 * Returns the language type the generator supports.
	 */
	def abstract String getLanguageType();
		
	/**
	 * Determine the size of the resulting binary serialization.
	 * 
	 * @param allProperties
	 * 		all properties of a record type
	 * 
	 * @returns
	 * 		the computed value
	 */
	 def int calculateSize(Iterable<Property> list) {
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
	def private int getSize(Property property) {
		switch (PropertyEvaluation::findType(property).class_.name) {
			case 'string' : 4
			case 'byte' : 1
			case 'short' : 2
			case 'int' : 4
			case 'long' : 8
			case 'float' : 4
			case 'double' : 8
			case 'char' : 2
			case 'boolean' : 1
			default: throw new InternalErrorException(PropertyEvaluation::findType(property).class_.name + 'is not a valid type name')
		}
	}
		
}