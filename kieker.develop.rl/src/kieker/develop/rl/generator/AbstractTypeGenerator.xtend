package kieker.develop.rl.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.recordLang.ComplexType

abstract class AbstractTypeGenerator<S extends ComplexType, T> implements IGenerator<S, T>, IAcceptType, IConfigureParameters {

	protected String header
	
	protected String author
	
	protected String version
	
	override configure(String header, String author, String version) {
		this.header = header
		this.author = author
		this.version = version
	}
	
	/**
	 * Primary code generation function.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 */
	override generate(S input) {
		val definedAuthor = if (input.author == null) this.author else input.author
		val definedVersion = if (input.since == null) this.version else input.since

		return createOutputModel(input, header, definedAuthor, definedVersion)
	}
		
	protected abstract def T createOutputModel(S type, String header, String author, String version)
	
}