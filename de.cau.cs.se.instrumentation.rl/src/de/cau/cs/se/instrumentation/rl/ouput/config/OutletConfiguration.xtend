package de.cau.cs.se.instrumentation.rl.ouput.config

/**
 * Entity class for the outlet configuration.
 */
class OutletConfiguration {
	/** Name of the outlet. */
	private String name
	
	/** Description of the outlet. */
	private String description
	
	/** default directory for the outlet. */
	private String directory
	
	/**
	 * Create a new outlet entity.
	 */
	new (String outletName, String description, String directory) {
		this.name = name
		this.description = description
		this.directory = directory
	}
	
	def getName() {
		return name
	}
	
	def getDescription() {
		return description
	}
	
	def getDirectory() {
		return directory
	}
			
}