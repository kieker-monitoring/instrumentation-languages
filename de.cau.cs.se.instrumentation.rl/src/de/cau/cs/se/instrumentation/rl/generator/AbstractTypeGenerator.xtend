package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

abstract class AbstractTypeGenerator {
			
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
	 * Collect recursively a list of all properties of interfaces and add those of
	 * the type.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	def EList<Property> collectAllImplementationProperties(RecordType type) {
		val EList<Property> result = PropertyEvaluation::collectAllInterfaceProperties(type)
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