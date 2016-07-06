package kieker.develop.rl.generator

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.TemplateType
import de.cau.cs.se.geco.architecture.framework.IGenerator

abstract class AbstractTemplateTypeGenerator extends AbstractTypeGenerator
	implements IGenerator<TemplateType,CharSequence> {
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 * @param headerComment
	 *      comment inserted as header comment of the output 
	 */
	override abstract CharSequence generate(TemplateType type)
		
}