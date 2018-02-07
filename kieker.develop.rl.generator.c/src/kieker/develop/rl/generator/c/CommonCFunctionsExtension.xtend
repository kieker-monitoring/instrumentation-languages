/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.c

import java.util.regex.Pattern
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.typing.base.BaseTypes
import java.io.File
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.ComplexType

/**
 * @author Reiner Jung
 * 
 * @since 1.0
 */
class CommonCFunctionsExtension {
	
	/**
	 * Converts Java style identifiers to C style identifiers.
	 */
	def static String cstyleName(String string) {
		return Pattern::compile('([A-Z])').matcher(string).replaceAll("_$1").toLowerCase.substring(1)
	}
		
	/**
	 * Compute the package name used as prefix for all functions.
	 */
	def static packageName(EventType type) '''«(type.eContainer as Model).name.replace('.','_')»'''
	
	def static directoryPathName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
	/**
	 * Determine the right C string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a C type name
	 */
	def static createTypeName(Classifier classifier) throws InternalErrorException {
		val type = classifier.type
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING : 'const char*'
				case CHAR : 'char'
				case SHORT : 'short'
				case INT : 'long'
				case LONG : 'long long'
				case FLOAT : 'float'
				case DOUBLE : 'double'
				case BOOLEAN : 'char'
				case BYTE : 'unsigned char'
				default: throw new InternalErrorException(String.format("%s is not a valid type.", type.name))
			}
			EnumerationType: type.name
			ComplexType: type.name
		}
	}
}