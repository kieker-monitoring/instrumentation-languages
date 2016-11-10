package kieker.develop.al.generator

import java.util.ArrayList
import java.util.Collection
import kieker.develop.al.aspectLang.Pointcut

abstract class AbstractOutletConfiguration {
	
	/** Name of the outlet. */
	private String name
	
	/** Description of the outlet. */
	private String description
		
	/** Default directory for the outlet. */
	private String directory
	
	/** All generators for event types of this outlet configuration. */
	protected val generators = new ArrayList<Object>

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
	
	def Collection<Object> getEventTypeGenerators() {
		return this.generators
	}
	
	def String outputFilePath(Pointcut pointcut)
	
	def String outputDirectory(Pointcut pointcut)
	
}