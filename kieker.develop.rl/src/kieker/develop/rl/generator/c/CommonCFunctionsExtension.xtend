package kieker.develop.rl.generator.c

import java.util.regex.Pattern
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.typing.BaseTypes

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
	def static packageName(RecordType type) '''«(type.eContainer as Model).name.replace('.','_')»'''
	
	/**
	 * Determine the right C string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a C type name
	 */
	def static createTypeName(Classifier classifier) throws InternalErrorException {
		switch (BaseTypes.getTypeEnum(classifier.type)) {
			case STRING : 'const char*'
			case CHAR : 'char'
			case SHORT : 'short'
			case INT : 'long'
			case LONG : 'long long'
			case FLOAT : 'float'
			case DOUBLE : 'double'
			case BOOLEAN : 'char'
			case BYTE : 'unsigned char'
		}
		
	}
}