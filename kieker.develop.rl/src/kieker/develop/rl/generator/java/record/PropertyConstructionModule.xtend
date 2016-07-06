package kieker.develop.rl.generator.java.record

import java.util.List
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.generator.java.record.NameResolver.*

import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import kieker.develop.rl.recordLang.RecordType

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
		'''private final «property.findType.createTypeName» «property.createName»;
		'''
		
		
	static def createPropertyGetters(RecordType type) {
		type.collectAllGetterDeclarationProperties.map[it.createPropertyGetter].join("\n")
	}
	
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
					property.createName»;
		}	
	'''
}