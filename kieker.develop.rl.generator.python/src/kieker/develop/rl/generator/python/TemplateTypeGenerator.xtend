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
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Model
import static extension kieker.develop.rl.typing.PropertyResolution.*
import kieker.develop.rl.generator.Version
import org.eclipse.emf.common.util.EList

class TemplateTypeGenerator extends AbstractPythonTypeGenerator<TemplateType, CharSequence>{

	override accepts(ComplexType type) {
		type instanceof TemplateType
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
	protected override createOutputModel(TemplateType type, Version targetVersion, String header, String author, String version) {
		val allDataProperties = type.collectAllDataProperties
		val allDeclarationProperties = type.collectAllTemplateProperties
		val allInheritedClasses = type.inherits
		val typeVersion = if (type.since !== null) type.since else version
		val typeAuthor = if (type.author !== null) type.author else author
		System.err.println("TEMPLATE " + type.name)
		'''
		«header»
		# version «typeVersion»
		# author «typeAuthor»
		
		«allInheritedClasses.createImports»
		
		class «type.name»«allInheritedClasses.createExtensions»
			«type.constants.map[c|c.createConstantDeclaration].join('\n')»
			def __init__(self«if (allDataProperties.size > 0) ", "»«allDataProperties.filter[!it.isTransient 
													|| (it.isTransient 
													&& !it.isIncrement
													)].map[property | createPropertyParameter(property)].join(', ')»):	
				«allDeclarationProperties.filter[!it.isIncrement].map[property | createAssignment(property)].join('\n')»
				«allDeclarationProperties.filter[it.isIncrement].map[property | createIncrementAssignment(property)].join('\n')»
				«if (allDataProperties.size == 0) "pass"»
		'''
	}
	
	def createExtensions(EList<TemplateType> types) {
		if (types.size > 0) {
			''' («types.map[type | type.name].join(", ")»):'''			
		} else {
			''':'''
		}
	}

	def createImport(ComplexType type) {
		val packageName = (type.eContainer as Model).name
		'''from «packageName».«type.name» import «type.name»'''
	}
	
	def createImports(EList<TemplateType> types) {
		if (types.size > 0) {
			'''«types.map[type | type.createImport].join("\n")»
			'''	
		} else
			''''''
	}

	/**
	 * Compute the absolute Python package name, which is a FQN name of the record.
	 */
	def recordName(TemplateType type) '''«(type.eContainer as Model).name.replace('.','::')»::«type.name»'''
}
