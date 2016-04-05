package kieker.tools.rl.validation

import kieker.tools.rl.recordLang.TemplateType
import kieker.tools.rl.recordLang.Property
import kieker.tools.rl.recordLang.RecordType
import java.util.ArrayList
import kieker.tools.rl.recordLang.Classifier
import kieker.tools.rl.generator.InternalErrorException
import java.util.List

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
	dispatch static def List<Property> collectAllDataProperties(RecordType type) {
		val list = new ArrayList<Property>()
		list.addAll(collectAllProperties(type).filter[property | (property.referTo == null)])
		return list
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
	dispatch static def List<Property> collectAllDataProperties(TemplateType type) {
		val list = new ArrayList<Property>()
		list.addAll(collectAllProperties(type).filter[property | (property.referTo == null)])
		return list
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
	dispatch static def List<Property> collectAllProperties(RecordType type) {
		val List<Property> result =
			if (type.parent != null)
				type.parent.collectAllProperties
			else 
				new ArrayList<Property>()
		
		if (type.parents != null) 
			type.parents.forEach[result.addAllUnique(it.collectAllProperties)]
	
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
	dispatch static def List<Property> collectAllProperties(TemplateType type) {
		val List<Property> result = new ArrayList<Property>()
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
	dispatch static def List<Property> collectAllTemplateProperties(RecordType type) {
		if (type.parents != null) {
			val List<Property> result = new ArrayList<Property>()
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
	dispatch static def List<Property> collectAllTemplateProperties(TemplateType type) {
		val List<Property> result = new ArrayList<Property>()
		if (type.parents!=null)
			type.parents.forEach[iface | result.addAllUnique(iface.collectAllTemplateProperties)]
		return result.addAllUnique(type.properties)
	}
	
	/* -- helper functions -- */
	
	/**
	 * Add elements of the second list to the first list if it is not already in there.
	 */
	def static List<Property> addAllUnique(List<Property> list, List<Property> addList) {
		addList.forEach[item | if (!list.containsProperty(item)) list.add(item)]
		return list
	}
	
	/**
	 * Check if a property of a given name and of the same type does already exist in the collected list of properties.
	 * 
	 * @param list property collection
	 * @param item the property to check against the list
	 * 
	 * @returns
	 * 		true if a property of the same name and type already exists, else false
	 */
	def static boolean containsProperty (List<Property> list, Property item) {
		for (Property p : list) {
			if (p.name.equals(item.name) && (p.findType.type.name.equals(item.findType.type.name)))
				return true
		}
		return false
	}
	
	/**
	 * Determine the type of a property. Even if it is an alias.
	 * 
	 * @param property the property
	 * 
	 * @param the type classifier
	 */
	def static Classifier findType(Property property) {
		if (property.type != null)
			return property.type
		else
			return property.referTo.findType
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
	def static private int getSize(Property property) {
		switch (PropertyEvaluation::findType(property).type.name) {
			case 'string' : 4
			case 'byte' : 1
			case 'short' : 2
			case 'int' : 4
			case 'long' : 8
			case 'float' : 4
			case 'double' : 8
			case 'char' : 2
			case 'boolean' : 1
			default: throw new InternalErrorException(PropertyEvaluation::findType(property).type.name + 'is not a valid type name')
		}
	}
		
}