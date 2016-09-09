package kieker.develop.rl.generator.java.record

import java.util.List
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

class PropertyConstructionModule {
	
	/**
	 * Create the Java declarations for a list of properties.
	 * 
	 * @param properties the properties to process
	 * 
	 * @return Java code block with declarations
	 */	
	static def createPropertyDeclarations(List<Property> properties) {
		properties.map[property | createPropertyDeclaration(property)].join
	}
	
	/**
	 * Create getter for a list of properties of an EventType
	 * 
	 * @param type the EventType
	 * 
	 * @return Java code block with getters
	 */		
	static def createPropertyGetters(EventType type) {
		type.collectAllGetterDeclarationProperties.map[it.createPropertyGetter].join("\n")
	}
	
	/**
	 * Create a property declaration for a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns  one property declaration
	 */
	private static def createPropertyDeclaration(Property property) 
		'''private «if (property.isTransient)
				'transient'
			else if (!property.isIncrement)
				'final'» «property.findType.createTypeName» «property.createPropertyName»«if (property.increment) ' = ' + property.createConstantName»;
		'''
					
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property(
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	private static def createPropertyGetter(Property property) '''
		public final «property.findType.createTypeName» «property.createGetterName»() {
			return this.«
				if (property.referTo != null)
					'''«property.referTo.createGetterName»()'''
				else
					property.createPropertyName+if (property.isIncrement) '++' else ''»;
		}	
	'''
	
					
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	static def createPropertyTypeArrayEntry(Property property, EventType type) 
		'''«property.findType.createTypeName».class, // «property.createPropertyFQN(type)»
		'''
}