package kieker.develop.rl.generator.java.record

import java.util.List
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.validation.PropertyEvaluation.*
import static extension kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*

class PropertyConstructionModule {
	
	static def createProperties(List<Property> properties) {
		properties.map[property | createPropertyDeclaration(property)].join
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
		'''private final «property.findType.createTypeName» «property.name.protectKeywords»;
		'''
}