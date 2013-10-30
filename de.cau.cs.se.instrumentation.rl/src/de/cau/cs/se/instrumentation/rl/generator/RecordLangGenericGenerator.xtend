package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier

abstract class RecordLangGenericGenerator {
	
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	def abstract CharSequence createContent(RecordType type, String author, String version);
		
	/**
	 * Convert a classifier into a primitive type for a
	 * target language.
	 * 
	 * @param classifier
	 * 		a classifier specifying a primitive type
	 */
	def abstract CharSequence createTypeName(Classifier classifier);
	
	/**
	 * Compute the directory name for a given type based on the package it belongs to.
	 * 
	 * @param type
	 * 		the type model
	 */
	def abstract CharSequence directoryName(RecordType type);
	
	/**
	 * Return the extension of the file type this generator produces.
	 */
	def abstract String getFileExtension();
	
	/**
	 * Collect recursively a list of all properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	def EList<Property> collectAllProperties(RecordType type) {
		var EList<Property> result
		if (type.parent!=null)
			result = type.parent.collectAllProperties
		else
			result = new org.eclipse.emf.common.util.BasicEList<Property>()
		result.addAll(type.properties)
		return result
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
	 def int calculateSize(EList<Property> list) {
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
		switch (property.type.class_.name) {
			case 'key' : 4
			case 'string' : 4
			case 'byte' : 1
			case 'short' : 2
			case 'int' : 4
			case 'long' : 8
			case 'float' : 4
			case 'double' : 8
			case 'char' : 2
			case 'boolean' : 1
		}
	}
}