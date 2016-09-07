package kieker.develop.rl.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.recordLang.Type

abstract class AbstractTypeGenerator<T extends Type> implements IGenerator<TypeInputModel<T>, CharSequence> {

	/**
	 * Primary code generation template.
	 * 
	 * @param type
	 * 		one record type to be used to create monitoring record
	 */
	override CharSequence generate(TypeInputModel<T> type)
	
	def boolean accepts(Type type)
}