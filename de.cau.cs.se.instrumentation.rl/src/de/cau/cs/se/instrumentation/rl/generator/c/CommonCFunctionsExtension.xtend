package de.cau.cs.se.instrumentation.rl.generator.c

import java.util.regex.Pattern
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier

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
}