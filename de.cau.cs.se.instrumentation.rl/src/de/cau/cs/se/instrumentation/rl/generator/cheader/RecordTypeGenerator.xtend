package de.cau.cs.se.instrumentation.rl.generator.cheader

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import java.io.File
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

class RecordTypeGenerator extends de.cau.cs.se.instrumentation.rl.generator.c.RecordTypeGenerator {
	
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
	
	/*
	 * Author: «author»
	 * Version: «version»
	 */
	«type.createStructure»
	
	«type.createSerializerDeclaration»
	'''
	
	def createStructure(RecordType type) '''
		typedef struct {
			«PropertyEvaluation::collectAllDataProperties(type).map[createPropertyDeclaration].join»
		} «type.packageName»_«type.name.cstyle»;
	'''
	
	def createPropertyDeclaration(Property property) '''
		«property.findType.createTypeName» «property.name»;
	'''
		
	/**
	 * Generate the serializer for the given record type.
	 */
	def createSerializerDeclaration(RecordType type) '''
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
		int «type.packageName»_«type.name.cstyle»_serialize(char *buffer, const int id, const int offset, const «type.packageName»_«type.name.cstyle» value);
	'''
	
	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name.cstyle».h'''
}