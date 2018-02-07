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

import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.ModelType
import java.util.ArrayList
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.BaseType
import java.util.List
import kieker.develop.rl.recordLang.EnumerationLiteral
import kieker.develop.rl.recordLang.EnumerationType

/**
 * Type resolution and resolving for base and complex types.
 * 
 * @author Reiner Jung
 * @since 1.0
 */
class TypeResolution {
	
	
	/**
	 * Resolve the primitive type for the given literal.
	 */
	static def Type getRequiredType(Literal literal) {
		switch (literal.eContainer) {
			Constant : (literal.eContainer as Constant).type.type
			Property : (literal.eContainer as Property).type.type
			Literal : (literal.eContainer as Literal).getRequiredType
		}
	}
	
	/**
	 * Checks whether the given literal has the given base type.
	 * 
	 * @param literal the literal to test
	 * @param baseType the assumed base type
	 * 
	 * @return returns true if the literal has the assumed type
	 */
	static def boolean isBaseType(Literal literal, BaseTypes baseType) throws InternalErrorException {
		val type = literal.getRequiredType
		switch(type) {
			BaseType: baseType.equals(BaseTypes.getTypeEnum(type))
			default: throw new InternalErrorException(String.format("%s is not an base type."))
		} 
	}
	
	/**
	 * Determine the type of a property. Even if it is an alias.
	 * 
	 * @param property the property
	 * 
	 * @param the type classifier
	 */
	static def Classifier findType(Property property) {
		if (property.type !== null)
			return property.type
		else if (property.foreignKey !== null)
			return property.foreignKey.propertyRef.findType
		else
			return property.referTo.findType
	}
	
	/**
	 * Collect all types which belong to a model type.
	 * 
	 * @param modelType the model type
	 * 
	 * @return collection of complex types in a model type
	 */
	static def collectAllTypes(ModelType modelType) {
		val typeProvider = new TypeProvider(modelType.eResource.resourceSet)
		val allTypes = new ArrayList<ComplexType>
		modelType.types.forEach[
			val additions = switch(it) {
				EventType : typeProvider.findInheritingTypes(it)
				TemplateType: typeProvider.findInheritingTypes(it)
			}
			additions.forEach[if (!allTypes.contains(it)) allTypes.add(it)]
		]
		
		return allTypes
	}
	
	/**
	 * Collect all literals of a enumeration type.
	 * 
	 * @param type an enumeration type
	 * 
	 * @return list of all enumeration literals
	 */
	static def List<EnumerationLiteral> collectAllLiterals(EnumerationType type) {
		val List<EnumerationLiteral> literals = new ArrayList<EnumerationLiteral>()
		
		literals.addLiteralsOf(type)
						
		return literals
	}
	
	/**
	 * Add recursively all literals which belong to the given enumeration type.
	 * 
	 * @param literals list of literals where all additional literals should be added to
	 * @param type an enumeration type
	 * 
	 * @return list of all enumeration literals
	 */
	private static def void addLiteralsOf(List<EnumerationLiteral> literals, EnumerationType type) {
		literals.addAll(type.literals)
		type.inherits.forEach[literals.addLiteralsOf(it)]
	}
}