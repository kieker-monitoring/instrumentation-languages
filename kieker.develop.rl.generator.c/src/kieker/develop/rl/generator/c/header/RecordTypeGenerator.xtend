package kieker.develop.rl.generator.c.header

import java.io.File
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Type

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import static extension kieker.develop.rl.typing.PropertyResolution.*

class RecordTypeGenerator extends kieker.develop.rl.generator.c.main.RecordTypeGenerator {

	/**
	 * Return the unique id.
	 */
	override getId() '''c.header'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''C header file generator'''
	
	/**
	 * No header for abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { false }

	/**
	 * File name for c-header files.
	 */	
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name.cstyleName».h'''
		
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 */
	override generate(RecordType type) {
		'''
		«header»#include <stdlib.h>
		#include <kieker.h>
		
		/*
		 * Author: «if (type.author == null) author else type.author»
		 * Version: «if (type.since == null) version else type.since»
		 */
		«type.createStructure»
		
		«type.createSerializerDeclaration»
		'''
	}
	
	private def createStructure(RecordType type) '''
		typedef struct {
			«type.collectAllDataProperties.map[createPropertyDeclaration].join»
		} «type.packageName»_«type.name.cstyleName»;
	'''
	
	private def createPropertyDeclaration(Property property) '''
		«property.findType.createTypeName» «property.name»;
	'''
		
	/**
	 * Generate the serializer for the given record type.
	 */
	private def createSerializerDeclaration(RecordType type) '''
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
		int «type.packageName»_«type.name.cstyleName»_serialize(char *buffer, const int id, const int offset, const «type.packageName»_«type.name.cstyleName» value);
	'''
		

}