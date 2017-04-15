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

import kieker.develop.rl.recordLang.BaseType
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
	static def BaseType getRequiredType(Literal literal) {
		switch (literal.eContainer) {
			Constant : (literal.eContainer as Constant).type.type
			Property : (literal.eContainer as Property).type.type
			Literal : (literal.eContainer as Literal).getRequiredType
		}
	}
	
	static def boolean isType(Literal literal, BaseTypes baseType) throws InternalErrorException {
		baseType.equals(BaseTypes.getTypeEnum(literal.getRequiredType)) 
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
}