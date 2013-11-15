package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.generator.AbstractTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier

abstract class AbstractRecordTypeGenerator extends AbstractTypeGenerator {
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
	def abstract CharSequence createContent(RecordType type, String author, String version);
	
	/**
	 * Convert a classifier into a primitive type for a
	 * target language.
	 * 
	 * @param classifier
	 * 		a classifier specifying a primitive type
	 */
	def abstract CharSequence createTypeName(Classifier classifier);
}