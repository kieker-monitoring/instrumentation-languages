package kieker.develop.rl.typing

import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.Classifier

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
	def static Classifier findType(Property property) {
		if (property.type != null)
			return property.type
		else
			return property.referTo.findType
	}
}