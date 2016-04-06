package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordType
import java.util.List

import static extension kieker.develop.rl.validation.PropertyEvaluation.*
import java.util.ArrayList

class RecordTypePropertyResolutionModule {
	/**
	 * Collect recursively a list of all properties which are defined in an template and
	 * not inherited from predecessors.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require getters
	 */
	static def List<Property> collectAllGetterDeclarationProperties(RecordType type) {
		var List<Property> result = type.collectAllProperties
		if (type.parent != null)
			return result.removeAlreadyImplementedProperties(type.parent)
		else
			return result
	}
	
	
	/**
	 * Collect all properties which must be declared for this type. In total that are:
	 * - properties declared by the type, which are not an alias.
	 * - properties declared by any imported interface, which are not implemented in a parent type
	 *   and which are not an alias.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require declaration
	 */
	static def List<Property> collectAllDeclarationProperties(RecordType type) {
		var List<Property> properties = new ArrayList<Property>() 
		properties.addAll(type.collectAllTemplateProperties)
		properties.addAll(type.properties)
		
		val List<Property> declarationProperties = new ArrayList<Property>()
		properties.forEach[property | if (property.referTo == null) declarationProperties.add(property)]
				
		if (type.parent != null)
			return declarationProperties.removeAlreadyImplementedProperties(type.parent)
		else
			return declarationProperties
	}
	
	/**
	 * Find properties implemented in a type and remove them from the list of properties.
	 * 
	 * @param type
	 * 		the parent type of the type where the property list belongs to
	 * 
	 * @returns
	 * 		the remaining list of properties
	 */
	private static def List<Property> removeAlreadyImplementedProperties(List<Property> list, RecordType parentType) {
		val List<Property> allParentProperties = parentType.collectAllProperties
		var result = list // necessary for the loop below. very ugly 
		for (Property parentProperty : allParentProperties) {
			val property = result.findFirst[it.name.equals(parentProperty.name)]
			result.remove(property)
		}
				
		return result
	}	
}