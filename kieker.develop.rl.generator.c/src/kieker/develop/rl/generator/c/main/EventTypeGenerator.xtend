/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.c.main

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.typing.base.BaseTypes

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.generator.Version
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.EnumerationType

/**
 * Generator for event types producing the serialization function for C.
 * 
 * @author Reiner Jung
 * @since 1.0
 */
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
		'''
		«this.header»#include <stdlib.h>
		#include <kieker.h>
		#include "«type.name.cstyleName».h"

		/**
		 * Author: «author»
		 * Version: «version»
		 */
		«type.createSerializer»
		'''
	}
	
	/**
	 * Generate the serializer for the given record type.
	 */
	private def createSerializer(EventType type) '''
		/*
		 * Serialize an «type.name» and return the size of the written structure.
		 *
		 * buffer = the buffer to send the data
		 * offset = store data to buffer at offset
		 * value = the value to be stored
		 *
		 * returns size of written structure
		 */
		int «type.packageName»_«type.name.cstyleName»_serialize(char *buffer, const int offset, const «type.packageName»_«type.name.cstyleName» value) {
			int position = offset;

			«type.collectAllDataProperties.map[createValueSerializerInvocation].join»

			return position;
		}
	'''
	
	/**
	 * 
	 */
	private def createValueSerializerInvocation(Property property) '''
		position += «property.findType.valueSerializerName»(buffer, position, value.«property.name»);
	'''
		
	/**
	 * 
	 */
	private def valueSerializerName(Classifier classifier) throws InternalErrorException {
		val type = classifier.type
		'kieker_serialize_' + switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case STRING : 'string'
				case BYTE : 'int8'
				case SHORT : 'int16'
				case INT : 'int32'
				case LONG : 'int64'
				case FLOAT : 'float'
				case DOUBLE : 'double'
				case CHAR : 'int16'
				case BOOLEAN : 'boolean'
				default: throw new InternalErrorException("%s is not a value base type.", type.name)
			}
			EnumerationType: type.name
		}
	}
			
}
