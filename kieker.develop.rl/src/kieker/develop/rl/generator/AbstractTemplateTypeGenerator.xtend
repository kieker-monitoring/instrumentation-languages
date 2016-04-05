package kieker.develop.rl.generator

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.TemplateType

abstract class AbstractTemplateTypeGenerator extends AbstractTypeGenerator {
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
	def abstract CharSequence createContent(TemplateType type, String author, String version);
		
}