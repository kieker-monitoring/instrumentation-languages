package kieker.develop.rl.generator.c.header

import kieker.develop.rl.generator.TypeInputModel
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordType

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.Type

class RecordTypeGenerator extends AbstractTypeGenerator<RecordType> {
	
		
	override accepts(Type type) {
		if (type instanceof RecordType)
			!(type as RecordType).abstract
		else
			false
	}

	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 */
	override generate(TypeInputModel<RecordType> input) {
		'''
			«input.header»#include <stdlib.h>
			#include <kieker.h>
			
			/*
			 * Author: «if (input.type.author == null) input.author else input.type.author»
			 * Version: «if (input.type.since == null) input.version else input.type.since»
			 */
			«input.type.createStructure»
			
			«input.type.createSerializerDeclaration»
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
	private def createSerializerDeclaration(
		RecordType type) '''
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
