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

import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import static extension kieker.develop.rl.typing.PropertyResolution.*
import kieker.develop.rl.generator.Version
import java.util.ArrayList
import java.util.List

class EventTypeGenerator extends AbstractPythonTypeGenerator<EventType, CharSequence> {
	
	override accepts(ComplexType type) {
		if (type instanceof EventType)
			true // !type.abstract
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
		val allInheritedProperties = collectAllInheritedProperties(allDataProperties, allDeclarationProperties)
		val allInheritedClasses = type.collectAllInheritedClasses
		val typeVersion = if (type.since !== null) type.since else version
		val typeAuthor = if (type.author !== null) type.author else author
		'''
		«header»
		# since «typeVersion»
		# author «typeAuthor»
		
		«allInheritedClasses.createImports»
		
		
		class «type.name»«allInheritedClasses.createExtensions»
		    «type.constants.map[c|c.createConstantDeclaration].join('\n')»
		    def __init__(self«if (allDataProperties.size > 0) ", "»«allDataProperties.filter[!it.isTransient 
													|| (it.isTransient 
													&& !it.isIncrement
													)].map[property | createPropertyParameter(property)].join(', ')»):
		        «IF type.parent !== null»«createSuper(allInheritedProperties)»«ENDIF»
		        «allDeclarationProperties.filter[!it.isIncrement].map[property | createAssignment(property)].join('\n')»
		        «allDeclarationProperties.filter[it.isIncrement].map[property | createIncrementAssignment(property)].join('\n')»
		        «if (allDataProperties.size == 0) "pass"»
		
		    def serialize(self, serializer):
		        «IF type.parent !== null»«createSuperSerialize(allInheritedProperties)»«ENDIF»
		        «allDeclarationProperties.filter[!it.isIncrement].map[property | createParameterSerialization(property)].join ('\n')» 
		        «if (allDataProperties.size == 0) "pass"»
		
		    «allDeclarationProperties.filter[it.isIncrement].map[property | createGetter(property)].join('\n')»
		'''
	}
	
	def collectAllInheritedProperties(List<Property> allDataProperties, List<Property> allDeclarationProperties) {
		var List<Property> properties = new ArrayList<Property>()
		for (Property property : allDataProperties) {
			if (!allDeclarationProperties.contains(property)) {
				properties.add(property)
			}
		}
		return properties
	}
	
	def createSuper(List<Property> properties) {
		'''super().__init__(«properties.filter[!it.isTransient 
													|| (it.isTransient 
													&& !it.isIncrement
													)].map[property | property.createPropertyParameter].join(", ")»)'''
	}
	
	def createSuperSerialize(List<Property> properties) {
		'''super().serialize(serializer)'''
	}
	
	def createExtensions(List<ComplexType> types) {
		if (types.size > 0) {
			''' («types.map[type | type.name].join(", ")»):'''			
		} else {
			''':'''
		}
	}
	
	def createImports(List<ComplexType> types) {
		if (types.size > 0) {
            '''«types.sortWith[a,b | a.fqnName.compareTo(b.fqnName) ].map[type | type.createImport].join("\n")»
			'''	
		}
	}
	
	def collectAllInheritedClasses(EventType type) {
		val types = new ArrayList<ComplexType>()
		if (type.parent !== null)
			types.add(type.parent)
		if (type.inherits !== null)
			types.addAll(type.inherits)
		return types
	}

	/**
	 * Compute the absolute Python package name, which is a FQN name of the record.
	 */
	def recordName(EventType type) '''«(type.eContainer as Model).name.replace('.','::')»::«type.name»'''
}
