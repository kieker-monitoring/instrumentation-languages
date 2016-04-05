package kieker.tools.rl.generator

import kieker.tools.rl.generator.AbstractTypeGenerator
import kieker.tools.rl.recordLang.RecordType

abstract class AbstractRecordTypeGenerator extends AbstractTypeGenerator {
		
	/**
	 * Return the description for the preference dialog of the generator.
	 */	
	def abstract String getDescription()
	
	/**
	 * Returns if the generator also supports record types.
	 */
	def abstract boolean supportsAbstractRecordType()
	
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