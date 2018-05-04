/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.generator.Version
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EnumerationLiteral
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.Model

import static extension kieker.develop.rl.typing.TypeResolution.*
import java.util.List

/**
 * Generates a Java class for {@link EnumerationType}s.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class EnumerationTypeGenerator extends AbstractTypeGenerator<EnumerationType, CharSequence> {

	override accepts(ComplexType type) {
		type instanceof EnumerationType
	}

	
	/**
	 * Central code generation template.
	 * 
	 * @param type the enumeration type
	 * 	in this event type (template inherited types and own types)
	 * @param targetVersion compiler target version
	 * @param header the header comment
	 * @param author the author of the EnumerationType
	 * @param version the version of the first occurrence of the type
	 * 
	 * @return a Java class for a Kieker EnumerationType
	 */
	override protected createOutputModel(EnumerationType type, Version targetVersion, String header, String author, String version) {
		val literals = type.collectAllLiterals
		'''
			«header»package «(type.eContainer as Model).name»;
			
			/**
			 * @author «author»
			 * API compatibility: Kieker «this.targetVersion.toString»
			 * 
			 * @since «version»
			 */
			public enum «type.name» {
				«literals.map[it.createLiteral(literals.position(it))].join(",\n")»;
				
				private int value;
					
				private «type.name»(final int value) {
					this.value = value;
				}
					
				public int getValue() {
					return this.value;
				}
				
				public static «type.name» getEnum(final int value) {
					for (final «type.name» type : «type.name».values()) {
						if (type.getValue() == value)
							return type;
					}
					throw new RuntimeException("Illegal value for «type.name» enumeration.");
				}
			}
		'''
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
	
	private def CharSequence createLiteral(EnumerationLiteral literal, int ordinal) 
		'''«literal.name»(«IF (literal.value !== null)»«literal.value.value»«ELSE»«ordinal»«ENDIF»)'''
		
}