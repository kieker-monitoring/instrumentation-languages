package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.TemplateType

import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import java.util.List

class CommentModule {

	/**
	 * Create sequence of property comments for the documentation.
	 */
	static def createPropertyComments(List<Property> properties) {
		properties.map[property | createPropertyComment(property)].join
	}

	/**
	 * Create an arbitrary comment for a property of a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one comment
	 */
	private static def createPropertyComment(Property property) '''
		* @param «property.name.protectKeywords»
		*            «property.name.protectKeywords»
	'''

	/**
	 * Compute the fully qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	static def CharSequence createPropertyFQN(Property property, TemplateType type) {
		if (type.properties.contains(property))
			return type.name + '.' + property.name
		else if (type.parents != null) {
			for (TemplateType t : type.parents) {
				val result2 = property.createPropertyFQN(t)
				if (result2 != null)
					return result2
			}
		}
				
		return null
	}
	
	/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	static def CharSequence createPropertyFQN(Property property, RecordType type) {
		if (type.properties.contains(property)) { 
			return type.name + '.' + property.name
		} else {
			if (type.parent!=null) {
				val result = property.createPropertyFQN(type.parent)
				if (result != null)
					return result
			}
			
			if (type.parents != null) {
				for (TemplateType t : type.parents) {
					val result = property.createPropertyFQN(t)
					if (result != null)
						return result
				}
			}
			return null
		}
	}
}