package kieker.develop.rl.ouput.config

import java.util.ArrayList
import java.util.Collection
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.AbstractTypeGenerator

/**
 * Entity class for the outlet configuration.
 */
abstract class AbstractOutletConfiguration {
	/** Name of the outlet. */
	private String name
	
	/** Description of the outlet. */
	private String description
		
	/** default directory for the outlet. */
	private String directory
	
	protected val generators = new ArrayList<AbstractTypeGenerator<? extends Type>>
		
	/**
	 * Create a new outlet entity.
	 */
	new (String name, String description, String directory) {
		this.name = name
		this.description = description
		this.directory = directory
	}
	
	def getName() {
		return this.name
	}
	
	def getDescription() {
		return this.description
	}
	
	def getDirectory() {
		return this.directory
	}
	
	def Collection<AbstractTypeGenerator<? extends Type>> getGenerators() {
		return this.generators
	}
	
	def String outputFilePath(Type type)
	
	def String outputDirectory(Type type)
	
			
}