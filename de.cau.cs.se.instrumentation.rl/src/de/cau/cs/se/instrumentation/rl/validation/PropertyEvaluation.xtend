package de.cau.cs.se.instrumentation.rl.validation

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property

class PropertyEvaluation {
		/**
	 * Collect recursively a list of all properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def EList<Property> collectAllProperties(RecordType type) {
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
	dispatch static def EList<Property> collectAllProperties(PartialRecordType type) {
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
	dispatch static def EList<Property> collectAllInterfaceProperties(RecordType type) {
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
	dispatch static def EList<Property> collectAllInterfaceProperties(PartialRecordType type) {
		val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
		if (type.parents!=null)
			type.parents.forEach[result.addAll(collectAllInterfaceProperties)]
		result.addAllUnique(type.properties)
		return result
	}
	
	/**
	 * Add elements of the second list to the first list if it is not already in there.
	 */
	def static EList<Property> addAllUnique(EList<Property> list, EList<Property> addList) {
		addList.forEach[item | if (!list.contains(item)) list.add(item)]
		return list
	}
}