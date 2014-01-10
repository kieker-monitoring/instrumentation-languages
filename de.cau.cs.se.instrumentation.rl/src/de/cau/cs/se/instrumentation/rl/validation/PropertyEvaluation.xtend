package de.cau.cs.se.instrumentation.rl.validation

import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import java.util.Collection

class PropertyEvaluation {
	
	/* -- data properties -- */
	
	/* used in code generation to determine the storage structure */
	
	/**
	 * Collect recursively a list of all data properties. Meaning aliases must be ignored.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllDataProperties(RecordType type) {
		val Collection<Property> result = if (type.parent != null)
			type.parent.collectAllDataProperties
		else 
			new ArrayList<Property>()
		if (type.parents != null) 
			type.parents.forEach[result.addAllUnique(collectAllDataProperties)]
		return result.addAllUnique(type.properties.filter[property | (property.referTo == null)])
	}
		
	
	/**
	 * Collect recursively a list of all data properties. Meaning aliases must be ignored.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllDataProperties(PartialRecordType type) {
		val Collection<Property> result = new ArrayList<Property>()
		if (type.parents != null)
			type.parents.forEach[iface | result.addAllUnique(iface.collectAllDataProperties)]
		return result.addAllUnique(type.properties.filter[property | (property.referTo == null)])
	}
	
	/* -- data and alias properties -- */

	/* used for validation and scoping */
	
	/**
	 * Collect recursively a list of all data and alias properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllProperties(RecordType type) {
		val Collection<Property> result = if (type.parent != null)
			type.parent.collectAllDataProperties
		else 
			new ArrayList<Property>()
		if (type.parents != null) 
			type.parents.forEach[result.addAllUnique(collectAllProperties)]
		return result.addAllUnique(type.properties)
	}
	
	/**
	 * Collect recursively a list of all data and alias properties.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllProperties(PartialRecordType type) {
		val Collection<Property> result = new ArrayList<Property>()
		if (type.parents != null)
			type.parents.forEach[iface | result.addAllUnique(iface.collectAllProperties)]
		return result.addAllUnique(type.properties)
	}
	
	/* -- interface properties -- */
	
	/* used to collect properties realized via templates */
	
	/**
	 * Collect recursively a list of all properties declared in templates referenced by the given type.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllTemplateProperties(RecordType type) {
		if (type.parents != null) {
			val Collection<Property> result = new ArrayList<Property>()
			type.parents.forEach[iface | result.addAllUnique(iface.collectAllTemplateProperties)]
			return result
		} else
			return new ArrayList<Property>()
	}
		
	
	/**
	 * Collect recursively a list of all properties declared in templates referenced by the given type.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	dispatch static def Collection<Property> collectAllTemplateProperties(PartialRecordType type) {
		val EList<Property> result = new org.eclipse.emf.common.util.BasicEList<Property>()
		if (type.parents!=null)
			type.parents.forEach[iface | result.addAllUnique(iface.collectAllTemplateProperties)]
		return result.addAllUnique(type.properties)
	}
	
	/* -- helper functions -- */
	
	/**
	 * Add elements of the second list to the first list if it is not already in there.
	 */
	def static Collection<Property> addAllUnique(Collection<Property> list, Iterable<Property> addList) {
		addList.forEach[item | if (!list.containsProperty(item)) list.add(item)]
		return list
	}
	
	/**
	 * check if a property of a given name does already exist in the collected list of properties.
	 */
	def static boolean containsProperty (Collection<Property> list, Property item) {
		for (Property p : list) {
			if (p.name.equals(item.name))
				return true
		}
		return false
	}
		
}