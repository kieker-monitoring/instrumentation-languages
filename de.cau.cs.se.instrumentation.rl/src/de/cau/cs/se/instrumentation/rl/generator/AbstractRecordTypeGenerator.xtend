package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.generator.AbstractTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType

abstract class AbstractRecordTypeGenerator extends AbstractTypeGenerator {
		
	/**
	 * Return the description for the preference dialog of the generator.
	 */	
	def abstract String getDescription()
	
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
	def abstract CharSequence createContent(RecordType type, String author, String version)
	
}