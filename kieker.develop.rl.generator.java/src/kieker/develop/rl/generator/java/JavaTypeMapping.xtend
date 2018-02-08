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
package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Type

/**
 * Mapping of IRL to Java types.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class JavaTypeMapping {

	private new() {
		// extension class
	}

	/**
	 * @param classifier
	 * 		A type name of the record language
	 * @return 
	 * 		the Java type name of the given <code>classifier</code>
	 */
	static def createJavaTypeName(Type type) throws InternalErrorException {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case INT: 'int'
				case LONG: 'long'
				case SHORT: 'short'
				case DOUBLE: 'double'
				case FLOAT: 'float'
				case CHAR: 'char'
				case BYTE: 'byte'
				case STRING: 'String'
				case BOOLEAN: 'boolean'
			}
			EnumerationType: type.name
			ComplexType: type.name
		}
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	static def createJavaObjectTypeName(Type type)  throws InternalErrorException {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case INT: 'Integer'
				case LONG: 'Long'
				case SHORT: 'Short'
				case DOUBLE: 'Double'
				case FLOAT: 'Float'
				case CHAR: 'Character'
				case BYTE: 'Byte'
				case STRING: 'String'
				case BOOLEAN: 'Boolean'
			}
			EnumerationType: type.name
			ComplexType: type.name
		}
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else {
			val type = classifier.type
			switch (type) {
				BaseType: type.createJavaTypeName
				EnumerationType: type.name
				EventType: type.name
			}
		}
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createObjectTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else {
			val type = classifier.type
			switch (type) {
				BaseType: type.createJavaObjectTypeName
				EnumerationType: type.name
				EventType: type.name
			}
		}
	}
	
	/**
	 * Determine the right Java string for a given system array type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	static def createArrayTypeName(Classifier classifier) {
		val type = classifier.type
		val typeName = switch (type) {
			BaseType: type.createJavaTypeName
			EnumerationType: type.name
			EventType: type.name
		}
		val arrayBrackets = classifier.sizes.map[size | '''[]''' ].join
		return typeName + arrayBrackets
	}

}
