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

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.generator.Version
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EnumerationLiteral
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.Model

import static extension kieker.develop.rl.typing.TypeResolution.*
import java.util.List

class EnumerationTypeGenerator extends AbstractTypeGenerator<EnumerationType, CharSequence> {
	
	override accepts(ComplexType type) {
		type instanceof EnumerationType
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
	protected override createOutputModel(EnumerationType type, Version targetVersion, String header, String author, String version) {
	val literals = type.collectAllLiterals
		'''import enum
		class «type.name»(enum):
			«literals.map[it.createLiteral()].join(",\n")»
		
		'''
	}

	/**
	 * Create a literal with optional value assignment.
	 */
	private def createLiteral(EnumerationLiteral literal) '''«literal.name»«IF literal.value !== null»=«literal.value.value»«ELSE»auto()«ENDIF»'''
	
	

	/**
	 * Compute the absolute Python package name, which is a FQN name of the record.
	 */
	def fullyQualifiedName(EnumerationType type) '''«(type.eContainer as Model).name.replace('.','::')»::«type.name»'''

	
	
}
