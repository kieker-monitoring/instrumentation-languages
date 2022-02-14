/***************************************************************************
 * Copyright 2020 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.python

import java.util.Collection
import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import static extension kieker.develop.rl.typing.PropertyResolution.*
import kieker.develop.rl.generator.Version
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.typing.base.BaseTypes
import kieker. develop.rl.generator.python.PropertyHelper
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.BaseType
import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.TemplateType

class EventTypeGenerator extends AbstractTypeGenerator<EventType, CharSequence> {
	
	override accepts(ComplexType type) {
		if (type instanceof EventType)
			!type.abstract
		else
			false
	}
			
	/**
	 * Central code generation template.
	 * 
	 * @param type the event type
	 * 	in this event type (template inherited types and own types)
	 * @param header the header comment
	 * @param author the author of the EvenType
	 * @param version the version of the first occurrence of the type
	 * 
	 * @return a Java class for a Kieker EventType
	 */
	protected override createOutputModel(EventType type, Version targetVersion, String header, String author, String version) {
		val allDataProperties = type.collectAllDataProperties
		val allDeclarationProperties = type.collectAllDeclarationProperties
		'''	
		class «type.name»«type.createExtensions»
			«type.constants.map[c|c.createConstantDeclaration].join('\n')»
			def init(self, «allDataProperties.filter[!it.isTransient 
													|| (it.isTransient 
													&& !it.isIncrement
													)].map[property | createPropertyParameter(property)].join(', ')»):	
				«allDeclarationProperties.filter[!it.isIncrement].map[property | createAssignment(property)].join('\n')»
				«allDeclarationProperties.filter[it.isIncrement].map[property | createIncrementAssignment(property)].join('\n')»
		
			def serialize(self, serializer):
				«allDeclarationProperties.filter[!it.isIncrement].map[property | createParameterSerialization(property)].join ('\n')» 
			
			«allDeclarationProperties.filter[it.isIncrement].map[property | createGetter(property)].join('\n')»
			
		'''
	}
	
	def createExtensions(EventType type){
	'''
	«IF type.parent != null» («type.parent.name», «type.inherits.getTemplates») :«ELSE» :«ENDIF»
	'''	
	}
	
	def getTemplates(EList<TemplateType> parents){
		'''
		«if (parents !== null && parents.size > 0) parents.map[p|p.name].join(",")»
		'''
	}
	def getGetParents(EList<TemplateType> parents){
		'''
		« if (parents !== null && parents.size > 0) parents.map[p|p.name].join(",")»
		'''
	}
	
	def createPropertyParameter(Property property){
		'''«property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase»'''
	}
	
	def createAssignment(Property property){
		val classifier = property.type
		val type = classifier.type
		switch(type){
	    BaseType case BaseTypes.STRING == BaseTypes.getTypeEnum(type) && classifier.sizes.size == 0:
		'''«createPropertyParameter(property)» = «if(property.value!==null) '(self.'+ property.value.createConstantReference(property) else '(""'»
		      if «property.createPropertyParameter» is None 
		      else «property.createPropertyParameter»)'''
		default:
		'''«property.createPropertyParameter» = «property.createPropertyParameter»'''
	}
	
	}
	def createIncrementAssignment(Property property){
		'''«createPropertyParameter(property)» = «property.value.getLiteral»'''
	}
	
	def createParameterSerialization(Property property){
		'''serializer.put_«createTypeName(property.type)»(self.«property.createPropertyParameter»)'''
	}

	def createGetter(Property property){
		'''def get_«property.createPropertyParameter»(self):
	self.«property.createPropertyParameter» +=1
	return self.«property.createPropertyParameter»
		'''
	}
	/**
	 * Create python type names.
	 */
	def createTypeName(Classifier classifier) {
		switch (classifier.type.name) {
			case 'string' : 'string'
			default : classifier.type.name
		}
	}
	
private static def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
			ConstantLiteral : literal.value.name
			BuiltInValueLiteral : property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
			default : throw new InternalErrorException("constant reference requested for " + literal.class + " which is not defined.")
		}
	}
	def createConstantDeclaration(Constant constant){
		'''«constant.name» = «constant.value.getLiteral»'''
	}
	
	def static getLiteral(Literal literal){
	
		switch(literal){
		    IntLiteral: '''«literal.value»'''
			FloatLiteral: '''«literal.value»'''
			BooleanLiteral: '''«if (literal.value) 'True' else 'False'»'''
			ConstantLiteral: '''«literal.value.name»'''
			BuiltInValueLiteral case "KIEKER_VERSION".equals(literal.value): '''kieker.common.util.Version.getVERSION()'''
			StringLiteral :'''"«literal.value»"'''
			ArrayLiteral: '''[ «literal.literals.map[element | element.getLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» ]'''
			default: throw new InternalErrorException('Unknown literal type ' + literal.class.name)
			
		}	
	}
	/**
	 * Create one property for the type declaration.
	 */
	def createProperty(Property property) '''«property.name» => $«property.name»'''
	
	/**
	 * Compute the absolute Python package name, which is a FQN name of the record.
	 */
	def recordName(EventType type) '''«(type.eContainer as Model).name.replace('.','::')»::«type.name»'''
		
	/**
	 * 
	 */
	def createParameterCall(Collection<Property> list) {
		list.map['''$«name»'''].join(', ')
	}
	
	
}
