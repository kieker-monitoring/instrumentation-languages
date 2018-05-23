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
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.BaseType

/**
 * Templates for constants.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung
 */
class ConstantConstructionTemplates {
	
	/**
	 * Create default constants for a set of given properties.
	 * 
	 * @param properties list of properties of a type
	 */
	static def createDefaultConstants (List<Property> properties) {
		val defaultConstants = properties.filter[
			val type = it.findType
			it.value !== null || 
			(type.type.isStringType && type.sizes.size == 0)
		]
		
		if (defaultConstants.empty) 
			''''''
		else '''
			/** default constants. */
			«defaultConstants.map[property | createDefaultConstant(property)].join»
		'''
	}
	
	/**
	 * Checks whether the given type is a base type and that base type is of type string.
	 * 
	 * @param a potential base type
	 * 
	 * @return returns true for strings and false for all other types
	 */
	private def static boolean isStringType(Type type) {
		if (type instanceof BaseType)
			BaseTypes.getTypeEnum(type) == BaseTypes.STRING
		else
			false
	}
	 
	
	/**
	 * Create user specified constants.
	 * 
	 * @param type event type
	 */
	static def createUserConstants(EventType type) {
		if (type.constants.size > 0) '''
			/** user-defined constants. */
			«type.constants.map[const | createDefaultConstant(const)].join»
		''' else ''''''
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
		public static final «property.type.createTypeName» «property.createConstantName» = «if (property.value === null) '""' else property.value.createLiteral»;
	'''

			
	/**
	 * Literal mapping
	 */
	static def CharSequence createLiteral(Literal literal) throws InternalErrorException {
		switch (literal) {
			IntLiteral: '''«literal.value»«if (literal.isBaseType(BaseTypes.LONG)) 'L'»'''
			FloatLiteral: '''«literal.value»«if (literal.isBaseType(BaseTypes.FLOAT)) 'f'»'''
			BooleanLiteral: '''«if (literal.value) 'true' else 'false'»'''
			ConstantLiteral: '''«literal.value.name»'''
			BuiltInValueLiteral case "KIEKER_VERSION".equals(literal.value): '''kieker.common.util.Version.getVERSION()'''
			StringLiteral case literal.isBaseType(BaseTypes.STRING): '''"«literal.value»"'''
			StringLiteral case literal.isBaseType(BaseTypes.CHAR): '\'' + literal.value + '\''
			ArrayLiteral: '''{ «literal.literals.map[element | element.createLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» }'''
			default: throw new InternalErrorException('Unknown literal type ' + literal.class.name)
		}	
	}
		
}
