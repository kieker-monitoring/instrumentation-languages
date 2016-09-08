package kieker.develop.rl.ouput.config

import java.util.ArrayList
import java.util.Collection
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType

/**
 * Entity class for the outlet configuration.
 */
abstract class AbstractOutletConfiguration {
	/** Name of the outlet. */
	private String name
	
	/** Description of the outlet. */
	private String description
		
	/** Default directory for the outlet. */
	private String directory
	
	/** All generators for event types of this outlet configuration. */
	protected val eventTypeGenerators = new ArrayList<AbstractTypeGenerator<EventType>>
	
	/** All generators for template types of this outlet configuration. */
	protected val templateTypeGenerators = new ArrayList<AbstractTypeGenerator<TemplateType>>

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
	
	def Collection<AbstractTypeGenerator<EventType>> getEventTypeGenerators() {
		return this.eventTypeGenerators
	}
	
	def Collection<AbstractTypeGenerator<TemplateType>> getTemplateTypeGenerators() {
		return this.templateTypeGenerators
	}
	
	def String outputFilePath(Type type)
	
	def String outputDirectory(Type type)
	
			
}