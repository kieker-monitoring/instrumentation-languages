/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.rl.typing

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.EventType
import java.util.List
import java.util.ArrayList
import kieker.develop.rl.recordLang.TemplateType

import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.PropertyModifier

/**
 * Functions used to support the resolution of
 * properties.
 * 
 * @author Reiner Jung
 * @since 1.2
 */
class PropertyResolution {
	
		
	// TODO these should be used everywhere
	static def isTransient(Property property) {
		property.modifiers.exists[it == PropertyModifier.TRANSIENT]
	}
	
	static def isIncrement(Property property) {
		property.modifiers.exists[it == PropertyModifier.INCREMENT]
	}
		
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
	static def List<Property> collectAllDataProperties(EventType type) {
		val list = new ArrayList<Property>()
		list.addAll(collectAllProperties(type).filter[it.referTo === null])
		return list
	}
	
	/**
	 * Collect recursively a list of all data properties which are persistent.
	 * Meaning aliases and transient properties must be ignored.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	static def List<Property> collectAllPersistentDataProperties(EventType type) {
		val list = new ArrayList<Property>()
		list.addAll(collectAllProperties(type).filter[it.referTo === null && !it.transient])
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
	static def List<Property> collectAllDataProperties(TemplateType type) {
		val list = new ArrayList<Property>()
		list.addAll(collectAllProperties(type).filter[it.referTo === null])
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
	static def List<Property> collectAllProperties(EventType type) {
		val List<Property> result =
			if (type.parent !== null)
				type.parent.collectAllProperties
			else 
				new ArrayList<Property>()
		
		if (type.inherits !== null) 
			type.inherits.forEach[result.addAllUnique(it.collectAllProperties)]
	
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
	static def List<Property> collectAllProperties(TemplateType type) {
		val List<Property> result = new ArrayList<Property>()
		if (type.inherits !== null)
			type.inherits.forEach[iface | result.addAllUnique(iface.collectAllProperties)]

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
	static def List<Property> collectAllTemplateProperties(EventType type) {
		if (type.inherits !== null) {
			val List<Property> result = new ArrayList<Property>()
			type.inherits.forEach[iface | result.addAllUnique(iface.collectAllTemplateProperties)]
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
	static def List<Property> collectAllTemplateProperties(TemplateType type) {
		val List<Property> result = new ArrayList<Property>()
		if (type.inherits !== null)
			type.inherits.forEach[iface | result.addAllUnique(iface.collectAllTemplateProperties)]
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
	 * Collect recursively a list of all properties which are defined in an template and
	 * not inherited from predecessors.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require getters
	 */
	static def List<Property> collectAllGetterDeclarationProperties(EventType type) {
		var List<Property> result = type.collectAllProperties
		if (type.parent !== null)
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
	static def List<Property> collectAllDeclarationProperties(EventType type) {
		var List<Property> properties = new ArrayList<Property>() 
		properties.addAll(type.collectAllTemplateProperties)
		properties.addAll(type.properties)
		
		val List<Property> declarationProperties = new ArrayList<Property>()
		properties.forEach[property | if (property.referTo === null) declarationProperties.add(property)]
				
		if (type.parent !== null)
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
	private static def List<Property> removeAlreadyImplementedProperties(List<Property> list, EventType parentType) {
		val List<Property> allParentProperties = parentType.collectAllProperties
		var result = list // necessary for the loop below. very ugly 
		for (Property parentProperty : allParentProperties) {
			val property = result.findFirst[it.name.equals(parentProperty.name)]
			result.remove(property)
		}
				
		return result
	}	
}