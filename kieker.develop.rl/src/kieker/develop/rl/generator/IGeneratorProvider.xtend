package kieker.develop.rl.generator

import java.util.Collection
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

/**
 * Interface for outlet configuration providers. The providers must
 * add their outlet configuration to the configuration collection.
 * 
 * @author Reiner Jung
 * @since 1.2
 */
interface IGeneratorProvider {
	
	/**
	 * Add outlet configurations to the global configurations collection.
	 * 
	 * @param configuration collection for all outlet configurations
	 */
	def void addOutletConfigurations(Collection<AbstractOutletConfiguration> configurations)
}