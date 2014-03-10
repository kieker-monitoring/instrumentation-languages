package de.cau.cs.se.instrumentation.rl.generator.c

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import java.util.regex.Pattern
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
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
	override createContent(RecordType type, String author, String version) '''
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
	#include <stdlib.h>
	#include <kieker.h>
	#include "«type.directoryName»/«type.packageName»_«type.name.cstyle».h"

	/**
	 * Author: «author»
	 * Version: «version»
	 */
	«type.createSerializer»
	'''
	
	def String getCstyle(String string) {
		return Pattern::compile('([A-Z])').matcher(string).replaceAll("_$1").toLowerCase.substring(1)
	}
	
	/**
	 * Compute the directory name for a record type.
	 */
	override directoryName(Type type) '''c«File::separator»«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name.cstyle».c'''
	
	/**
	 * Compute the package name used as prefix for all functions.
	 */
	def packageName(RecordType type) '''«(type.eContainer as Model).name.replace('.','_')»'''
					
	/**
	 * Determine the right C string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a C type name
	 */
	override createTypeName(Classifier classifier) {
		switch (classifier.class_.name) {
			case 'key' : 'const char*'
			case 'string' : 'const char*'
			case 'byte' : 'char'
			case 'short' : 'short'
			case 'int' : 'long'
			case 'long' : 'long long'
			case 'float' : 'float'
			case 'double' : 'double'
			case 'boolean' : 'char'
			default : classifier.class_.name
		}
		
	}
	
	/**
	 * Generate the serializer for the given record type.
	 */
	def createSerializer(RecordType type) '''
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
		int «type.packageName»_«type.name.cstyle»_serialize(char *buffer, const int id, const int offset, const «type.packageName»_«type.name.cstyle» value) {
			int length = 0;
			«PropertyEvaluation::collectAllDataProperties(type).map[createValueSerializer].join»
			return length;
		}
	'''
	
	/**
	 * 
	 */
	def createValueSerializer(Property property) '''
		length += kieker_serialize_«property.findType.serializerSuffix»(buffer,offset,«property.name»);
	'''
		
	/**
	 * 
	 */
	def serializerSuffix(Classifier classifier) {
		switch (classifier.class_.name) {
			case 'string' : 'string'
			case 'byte' : 'int8'
			case 'short' : 'int16'
			case 'int' : 'int32'
			case 'long' : 'int64'
			case 'float' : 'float'
			case 'double' : 'double'
			case 'char' : 'int16'
			case 'boolean' : 'boolean'
			default : classifier.class_.name
		}
	}
		
}