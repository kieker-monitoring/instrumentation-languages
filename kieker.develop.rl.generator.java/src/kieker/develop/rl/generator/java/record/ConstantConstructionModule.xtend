package kieker.develop.rl.generator.java.record

import java.util.List
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.generator.InternalErrorException

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.TypeResolution.*

class ConstantConstructionModule {
	
	/**
	 * Create default constants for a set of given properties.
	 * 
	 * @param properties list of properties of a type
	 */
	static def createDefaultConstants (List<Property> properties) {
		properties.filter[
			val type = it.findType
			it.value != null || 
			(BaseTypes.STRING == BaseTypes.getTypeEnum(type.type) && type.sizes.size == 0)
		].map[property | createDefaultConstant(property)].join
	}
	
	/**
	 * Create user specified constants.
	 */
	static def createUserConstants(EventType type) {
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
		public static final «constant.type.createTypeName» «constant.createConstantName» = «constant.value.createLiteral»;
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
		public static final «property.type.createTypeName» «property.createConstantName» = «if (property.value==null) '""' else property.value.createLiteral»;
	'''

			
	/**
	 * Literal mapping
	 */
	private static def CharSequence createLiteral(Literal literal) throws InternalErrorException {
		switch (literal) {
			IntLiteral: '''«literal.value»«if (literal.isType(BaseTypes.LONG)) 'L'»'''
			FloatLiteral: '''«literal.value»«if (literal.isType(BaseTypes.FLOAT)) 'f'»'''
			BooleanLiteral: '''«if (literal.value) 'true' else 'false'»'''
			ConstantLiteral: '''«literal.value.name»'''
			BuiltInValueLiteral case "KIEKER_VERSION".equals(literal.value): '''kieker.common.util.Version.getVERSION()'''
			StringLiteral case literal.isType(BaseTypes.STRING): '''"«literal.value»"'''
			StringLiteral case literal.isType(BaseTypes.CHAR): '\'' + literal.value + '\''
			ArrayLiteral: '''{ «literal.literals.map[element | element.createLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» }'''
			default: throw new InternalErrorException('Unknown literal type ' + literal.class.name)
		}	
	}
		
}