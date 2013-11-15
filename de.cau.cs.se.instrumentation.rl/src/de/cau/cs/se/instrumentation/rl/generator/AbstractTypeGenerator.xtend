package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type

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
	 * Collect recursively a list of all properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch def EList<Property> collectAllProperties(RecordType type) {
		if (type.parent != null) {
			val EList<Property> result = type.parent.collectAllProperties
			if (type.parents != null) 
				type.parents.forEach[result.addAll(collectAllProperties)]
			result.addAllUnique(type.properties)
			return result
		} else {
			val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
			if (type.parents != null) 
				type.parents.forEach[result.addAll(collectAllProperties)]
			result.addAllUnique(type.properties)
			return result
		}
	}
		
	
	/**
	 * Collect recursively a list of all properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch def EList<Property> collectAllProperties(PartialRecordType type) {
		val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
		if (type.parents != null)
			type.parents.forEach[result.addAll(collectAllProperties)]
		result.addAllUnique(type.properties)
		return result
	}
	
	/**
	 * Collect recursively a list of all properties of interfaces
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch def EList<Property> collectAllInterfaceProperties(RecordType type) {
		if (type.parents != null) {
			val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
			type.parents.forEach[result.addAll(collectAllInterfaceProperties)]
			return result
		} else {
			return new org.eclipse.emf.common.util.BasicEList<Property>()
		}
	}
		
	
	/**
	 * Collect recursively a list of all properties of interfaces
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch def EList<Property> collectAllInterfaceProperties(PartialRecordType type) {
		val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
		if (type.parents!=null)
			type.parents.forEach[result.addAll(collectAllInterfaceProperties)]
		result.addAllUnique(type.properties)
		return result
	}
	
	/**
	 * Add elements of the second list to the first list if it is not already in there.
	 */
	def EList<Property> addAllUnique(EList<Property> list, EList<Property> addList) {
		addList.forEach[item | if (!list.contains(item)) list.add(item)]
		return list
	}
	
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
		val EList<Property> result = type.collectAllInterfaceProperties
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