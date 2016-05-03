package kieker.develop.rl.generator.c.header

import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Property
import java.io.File
import kieker.develop.rl.validation.PropertyEvaluation

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*
import java.util.Calendar

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
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version, String headerComment) {
		'''
		«IF (!headerComment.equals(""))»«headerComment.replace("THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)»
		«ENDIF»#include <stdlib.h>
		#include <kieker.h>
		
		/*
		 * Author: «author»
		 * Version: «version»
		 */
		«type.createStructure»
		
		«type.createSerializerDeclaration»
		'''
	}
	
	private def createStructure(RecordType type) '''
		typedef struct {
			«PropertyEvaluation::collectAllDataProperties(type).map[createPropertyDeclaration].join»
		} «type.packageName»_«type.name.cstyleName»;
	'''
	
	private def createPropertyDeclaration(Property property) '''
		«PropertyEvaluation::findType(property).createTypeName» «property.name»;
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