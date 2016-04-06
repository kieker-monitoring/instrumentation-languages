package kieker.develop.rl.generator.java.record

import java.util.List
import kieker.develop.rl.recordLang.Property

import static extension kieker.develop.rl.validation.PropertyEvaluation.*
import static extension kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*

import kieker.develop.rl.typing.BaseTypes
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.RecordType

class ConstantConstructionModule {
	
	/**
	 * Create default constants for a set of given properties.
	 * 
	 * @param properties list of properties of a type
	 */
	static def createDefaultConstants (List<Property> properties) {
		properties.filter[
			it.value != null || 
			(it.findType.type.name.equals(BaseTypes.STRING.name) && it.findType.sizes.size == 0)
		].map[property | createDefaultConstant(property)].join
	}
	
	/**
	 * Create user specified constants.
	 */
	static def createUserConstants(RecordType type) {
		type.constants.map[const | createDefaultConstant(const)].join
	}
	
	/**
	 * Create a property constant based on the language constant expression.
	 * 
	 * @param constant
	 * 		a default constant object
	 * 
	 * @returns a constant declaration
	 */
	private static def createDefaultConstant(Constant constant) '''
		public static final «constant.type.createTypeName» «constant.name.protectKeywords» = «constant.value.createLiteral»;
	'''
	
	/**
	 * Create a property constant based on the language property expression.
	 * 
	 * @param property
	 * 		a default constant object
	 * 
	 * @returns a constant declaration
	 */
	private static def createDefaultConstant(Property property) '''
		public static final «property.type.createTypeName» «property.name.createConstantName.protectKeywords» = «if (property.value==null) '""' else property.value.createLiteral»;
	'''

			
	/**
	 * Literal mapping
	 */
	private static def CharSequence createLiteral(Literal literal) {
		switch (literal) {
			IntLiteral: '''«literal.value»«if (literal.getRequiredType.name.equals('long')) 'L'»'''
			FloatLiteral: '''«literal.value»«if (literal.getRequiredType.name.equals('float')) 'f'»'''
			BooleanLiteral: '''«if (literal.value) 'true' else 'false'»'''
			ConstantLiteral: '''«literal.value.name»'''
			BuiltInValueLiteral case "KIEKER_VERSION".equals(literal.value): '''kieker.common.util.Version.getVERSION()'''
			StringLiteral case literal.getRequiredType.name.equals('string'): '''"«literal.value»"'''
			StringLiteral case literal.getRequiredType.name.equals('char'): '\'' + literal.value + '\''
			ArrayLiteral: '''{ «literal.literals.map[element | element.createLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» }'''
			default: 'ERROR ' + literal.class.name
		}	
	}
		
	/**
	 * Resolve the primitive type for the given literal.
	 */
	private static def BaseType getRequiredType(Literal literal) {
		switch (literal.eContainer) {
			Constant : (literal.eContainer as Constant).type.type
			Property : (literal.eContainer as Property).type.type
			Literal : (literal.eContainer as Literal).getRequiredType
		}
	}
}