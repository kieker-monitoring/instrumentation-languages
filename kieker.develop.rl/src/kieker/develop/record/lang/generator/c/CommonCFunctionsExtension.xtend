package kieker.develop.rl.generator.c

import java.util.regex.Pattern
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.generator.InternalErrorException

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
	def static createTypeName(Classifier classifier) {
		switch (classifier.type.name) {
			case 'key' : 'const char*'
			case 'string' : 'const char*'
			case 'byte' : 'char'
			case 'short' : 'short'
			case 'int' : 'long'
			case 'long' : 'long long'
			case 'float' : 'float'
			case 'double' : 'double'
			case 'boolean' : 'char'
			default : throw new InternalErrorException("Type " + classifier.type.name + " is not supported.")
		}
		
	}
}