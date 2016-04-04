package de.cau.cs.se.instrumentation.rl.generator.c.main

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

import static extension de.cau.cs.se.instrumentation.rl.generator.c.CommonCFunctionsExtension.*
import java.util.Calendar

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
	/**
	 * Return the unique id.
	 */
	override getId() '''c.main'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''C code generator'''
	
	/**
	 * No serialization for abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { false }
	
	/**
	 * Compute the directory name for a record type.
	 */
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''

	/**
	 * compute the filename of a c file. 
 	*/
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name.cstyleName».c'''	
	
	/**
	 * Return the language type name.
	 */
	override getOutletType() '''c'''
			
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version) {
		'''
		/***************************************************************************
		 * Copyright «Calendar.getInstance().get(Calendar.YEAR)» Kieker Project (http://kieker-monitoring.net)
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
		#include <stdlib.h>
		#include <kieker.h>
		#include "«type.getDirectoryName»/«type.packageName»_«type.name.cstyleName».h"

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
	private def createSerializer(RecordType type) '''
		/*
		 * Serialize an «type.name» and return the size of the written structure.
		 *
		 * buffer = the buffer to send the data
		 * id = id to identify the record type
		 * offset = store data to buffer at offset
		 * value = the value to be stored
		 *
		 * returns size of written structure
		 */
		int «type.packageName»_«type.name.cstyleName»_serialize(char *buffer, const int id, const int offset, const «type.packageName»_«type.name.cstyleName» value) {
			int length = 0;
			«PropertyEvaluation::collectAllDataProperties(type).map[createValueSerializer].join»
			return length;
		}
	'''
	
	/**
	 * 
	 */
	private def createValueSerializer(Property property) '''
		length += kieker_serialize_«PropertyEvaluation::findType(property).serializerSuffix»(buffer,offset,«property.name»);
	'''
		
	/**
	 * 
	 */
	private def serializerSuffix(Classifier classifier) {
		switch (classifier.type.name) {
			case 'string' : 'string'
			case 'byte' : 'int8'
			case 'short' : 'int16'
			case 'int' : 'int32'
			case 'long' : 'int64'
			case 'float' : 'float'
			case 'double' : 'double'
			case 'char' : 'int16'
			case 'boolean' : 'boolean'
			default : classifier.type.name
		}
	}
		
}