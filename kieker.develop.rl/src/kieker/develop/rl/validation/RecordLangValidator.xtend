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
package kieker.develop.rl.validation

import java.util.ArrayList
import java.util.Collection
import java.util.List
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.RecordLangPackage
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.typing.base.BaseTypes
import org.eclipse.xtext.validation.Check

import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.EnumerationLiteral
import kieker.develop.rl.recordLang.EnumerationType

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 * 
 * @author Reiner Jung
 * @since 1.1
 */
class RecordLangValidator extends AbstractRecordLangValidator {

  	public static val INVALID_NAME = 'invalidName'
  	
  	/**
  	 * Check if an alias is a cyclic definition.
  	 */
  	@Check
  	def checkCyclicAlias(Property property) {
  		if (property.referTo !== null) { // property is just an alias
  			val List<Property> visitedProperties = new ArrayList<Property>()
  			visitedProperties.add(property)
  			var referredProperty = property.referTo
  			
  			while (referredProperty.referTo !== null) {
  				if (visitedProperties.contains(referredProperty)) { // cyclic definition
  					 error('Property alias ' + property.name + ' has a cyclic definition.', 
						RecordLangPackage.Literals::PROPERTY__REFER_TO,
						INVALID_NAME)
					return
  				} 
  				visitedProperties.add(referredProperty)
  				referredProperty = referredProperty.referTo
  			}
  				
  		}
  	}

	/**
	 * Check whether a property has been declared twice with different types. 
	 */
	@Check
	def checkPropertyDeclaration(Property property) {
		val type = property.eContainer
		switch (type) {
			EventType: {
				val properties = type.collectAllProperties
				if (properties.exists[p | p.name.equals(property.name) && p != property]) {
					val Property otherProperty = properties.findFirst[p | p.name.equals(property.name) && p != property]
					//if (!typeAndPackageIdentical(otherProperty.type,property.type))
					error('Property with the same name has already been defined in ' + (otherProperty.eContainer as Type).name + '.', 
						RecordLangPackage.Literals::PROPERTY__NAME,
						INVALID_NAME)
				}
			}
			TemplateType: {
				val properties = type.collectAllProperties
				if (properties.exists[p | p.name.equals(property.name) && p != property]) {
					val Property otherProperty = properties.findFirst[p | p.name.equals(property.name) && p != property]
					//if (!typeAndPackageIdentical(otherProperty.type,property.type))
					error('Property with the same name has already been defined in ' + (otherProperty.eContainer as Type).name + '.', 
						RecordLangPackage.Literals::PROPERTY__NAME,
						INVALID_NAME)
				}
			}
		}
	}
	

	/** 
	 * Check a EventType for multiple inheritance of the same property with different types. 
	 */
	@Check
	def checkEventTypeComposition(EventType type) {
		val Collection<Property> properties = type.collectAllProperties
		if (properties.exists[p | properties.exists[pInner | p.name.equals(pInner.name) && p != pInner]]) {
			val Collection<Pair<Property,Property>> duplicates = new ArrayList<Pair<Property,Property>>()
			properties.forEach[p | duplicates.add(p.findDuplicate(properties))]
			duplicates.forEach[entry | // if (!typeAndPackageIdentical(entry.key.type,entry.value.type))
				error('Multiple property inheritance form ' + entry.key.name + 
						' inherited from ' + (entry.key.eContainer as Type).name + ' and ' + (entry.value.eContainer as Type).name, 
						RecordLangPackage.Literals::EVENT_TYPE__INHERITS,
						INVALID_NAME)
			]
		}
	}
		
	/** 
	 * Check a PartialType for multiple inheritance of the same property with different types. 
	 */	
	@Check
	def checkPartialTypeComposition(TemplateType type) {
		val Collection<Property> properties = type.collectAllProperties
		if (properties.exists[p | properties.exists[pInner | p.name.equals(pInner.name) && p != pInner]]) {
			val Collection<Pair<Property,Property>> duplicates = new ArrayList<Pair<Property,Property>>()
			properties.forEach[p | duplicates.add(p.findDuplicate(properties))]
			duplicates.forEach[entry | // if (!typeAndPackageIdentical(entry.key.type,entry.value.type))
				error('Multiple property inheritance from ' + entry.key.name + 
						' inherited from ' + (entry.key.eContainer as Type).name + ' and ' + (entry.value.eContainer as Type).name, 
						RecordLangPackage.Literals::TEMPLATE_TYPE__INHERITS,
						INVALID_NAME)
			]
		}
	}
	
	/** 
	 * Check a EnumerationLiteral to have an unique value. 
	 */	
	@Check
	def checkEnumerationLiteralUniqueValue(EnumerationLiteral literal) {
		val type = literal.eContainer as EnumerationType
		val literals = type.collectAllLiterals
		val value = if (literal.value === null) {
			literals.position(literal)
		} else {
			literal.value.value
		}
		val duplicate = literals.findFirst[
			val otherValue = if (it.value === null) {
				literals.position(it)
			} else {
				it.value.value
			}
			otherValue === value && it !== literal
		]
		if (duplicate !== null) {
			error('Enumeration literals ' + duplicate.name + 
						' and ' + literal.name + ' have the same value ' + value, 
						RecordLangPackage.Literals::ENUMERATION_LITERAL__VALUE,
						INVALID_NAME)
		}
	}
	
	
	
	/**
	 * Check it a given constant's type and the assigned value's type match.
	 */
	@Check
	def checkConstantValueTyping(Constant constant) {
		if (constant.value !== null) {
			if (!compareTypesInAssignment(constant.type, constant.value.type, constant.value)) {
				error('Constant type \'' + constant.type.createFQNTypeName + '\' does not match value type \'' + constant.value.type.createFQNTypeName + '\'.', 
							RecordLangPackage.Literals::CONSTANT__TYPE,
							INVALID_NAME)
			}
		}
	}
	
	/**
	 * Check it a given property's type and the assigned value's type match.
	 */
	@Check
	def checkPropertyValueTyping(Property property) {
		if (property.value !== null) {
			if (!compareTypesInAssignment(property.type, property.value.type, property.value)) {
				error('Property type \'' + property.type.createFQNTypeName + '\' does not match value type \'' + property.value.type.createFQNTypeName + '\'.', 
							RecordLangPackage.Literals::PROPERTY__TYPE,
							INVALID_NAME)
			}
		}
	}
	
	/**
	 * Check it a given type of one array element matches the other.
	 */
	@Check
	def checkValueTyping(ArrayLiteral literal) {
		if (literal.literals.size > 0) {
			val type = literal.literals.get(0).type
			if (!literal.literals.forall[element | typeEquality(element.type,type)]) {
				error('Value types ' + literal.literals.map[it.type.createFQNTypeName].join(', ') + ' do not match', 
							RecordLangPackage.Literals::ARRAY_LITERAL__LITERALS)
			}
		}
	}
	
	/**
	 * Create a full qualified type name based on a classifier.
	 * 
	 * @param classifier the classifier where the FQN is computed for
	 */
	private def String createFQNTypeName(Classifier classifier) {
		classifier.type.name + classifier.sizes.map['[' + (if (it.size != 0) it.size else '') + ']'].join
	}
	
	/**
	 * Check if types are a exact match.
	 */
	private def typeEquality(Classifier left, Classifier right) {
		if (left.type.name.equals(right.type.name)) {
			if (left.sizes.size == right.sizes.size) {
				var i=0
				while (i<left.sizes.size) {
					if (left.sizes.get(i).size != right.sizes.get(i).size)
						return false
					i=i+1
				}
				return true
			}
		}
	}
	
	/**
	 * Compare two types for a type match in a value assignment.
	 */
	private def compareTypesInAssignment(Classifier left, Classifier right, Literal literal) {
		return compareClassifierTypesInAssignment(left,right,literal)	
	}
	
	/**
	 * Check if types match in an assignment.
	 */
	private def compareClassifierTypesInAssignment(Classifier left, Classifier right, Literal literal) {
		if (compareClassifierTypeEquvalenceSet(left,right,literal)) {
			if (left.sizes.size == right.sizes.size) {
				var i=0
				while (i<left.sizes.size) {
					if ((left.sizes.get(i).size != right.sizes.get(i).size) &&
						(left.sizes.get(i).size != 0))
						return false
					i=i+1
				}
				return true
			} else
				return false
		} else
			return false
	}
	
	/**
	 * Check if the left and the right type are compatible. First check if they are identical. If
	 * not use checkTypeEquivalenceSet to check for compatible types. This is required for constants values.
	 */
	private def compareClassifierTypeEquvalenceSet(Classifier left, Classifier right, Literal literal) {
		if (left.type.name.equals(right.type.name))
			true
		else 
			checkTypeEquivalenceSet(left,right,literal)
	}
	
	/**
	 * Check if types match.
	 */
	private def checkTypeEquivalenceSet(Classifier left, Classifier right, Literal literal) {
		if (left.type.name.equals('double')) {
				if (right.type.name.equals('float')) {
					if (literal instanceof FloatLiteral)
						true
					else if (literal instanceof ArrayLiteral)
						checkAllLiteralsArtOfType(FloatLiteral, literal)
				} else
					false
			} else if (left.type.name.equals('long')) {
				if (right.type.name.equals('int')) {
					if (literal instanceof IntLiteral)
						if ((literal.value >= Long.MIN_VALUE) && 
							(literal.value <= Long.MAX_VALUE))
							true
						else
						 	false
					else if (literal instanceof ArrayLiteral)
						checkAllLiteralsArtOfType(IntLiteral, literal)
				} else
					false
			} else if (left.type.name.equals('byte')) {
				if (right.type.name.equals('int')) {
					if (literal instanceof IntLiteral)
						if ((literal.value >= Byte.MIN_VALUE) && 
							(literal.value <= Byte.MAX_VALUE))
							true
						else
						 	false
					else if (literal instanceof ArrayLiteral)
						checkAllLiteralsArtOfType(IntLiteral, literal)
				} else
					false
			} else if (left.type.name.equals('short')) {
				if (right.type.name.equals('int')) {
					if (literal instanceof IntLiteral)
						if ((literal.value >= Short.MIN_VALUE) && 
							(literal.value <= Short.MAX_VALUE))
							true
						else
						 	false
					else if (literal instanceof ArrayLiteral)
						checkAllLiteralsArtOfType(IntLiteral, literal)
				} else
					false
			} else
				false
	}
	
	
	
	/**
	 * Check in depth if all elements match the specific type.
	 */
	private def boolean checkAllLiteralsArtOfType(Class<? extends Literal> type, ArrayLiteral literal) {
		literal.literals.forall[element |
			if (element instanceof ArrayLiteral) 
				checkAllLiteralsArtOfType(type, element)
			else 
				type.isInstance(element)
		]
	}
	
	/**
	 * Compute the classifier for a literal.
	 */
	private def dispatch Classifier getType(StringLiteral literal) {
		if (literal.value.length != 1) 
			createPrimitiveClassifier(BaseTypes.STRING.getType)
		else
			createPrimitiveClassifier(BaseTypes.CHAR.getType)
	}
	private def dispatch Classifier getType(IntLiteral literal) { createPrimitiveClassifier(BaseTypes.INT.getType) }
	private def dispatch Classifier getType(FloatLiteral literal) { createPrimitiveClassifier(BaseTypes.FLOAT.getType) }
	private def dispatch Classifier getType(BooleanLiteral literal) { createPrimitiveClassifier(BaseTypes.BOOLEAN.getType) }
	private def dispatch Classifier getType(ConstantLiteral literal) { literal.value.type }
	private def dispatch Classifier getType(BuiltInValueLiteral literal) {
		switch (literal.value) {
			case "KIEKER_VERSION" :  createPrimitiveClassifier(BaseTypes.STRING.getType)
			// add further built-in values here.
		}
	}
	private def dispatch Classifier getType(ArrayLiteral literal) {
		val classifier = getType(literal.literals.get(0))
		val size = RecordLangFactory::eINSTANCE.createArraySize
		size.setSize(literal.literals.size)
		classifier.sizes.add(0,size)
		return classifier		
	}
		
	private def dispatch Classifier getType(Literal literal) {
		throw new InternalErrorException('Unhandled literal type')
	}
	
	private def createPrimitiveClassifier(BaseType type) {
		val classifier = RecordLangFactory::eINSTANCE.createClassifier()
		classifier.setType(type)
		return classifier
	}
	
	/* -- service routines -- */
		
	private def Pair<Property, Property> findDuplicate(Property property, Collection<Property> properties) {
		val Property second = properties.findFirst[p | property.name.equals(p.name) && p != property]
		return new Pair(property,second)
	}
	
	private	def int position(List<EnumerationLiteral> literals, EnumerationLiteral literal) {
		var position = 0
		for (EnumerationLiteral element : literals) {
			if (element === literal)
				return position
			position++
		}
		return -1
	}
	
}
