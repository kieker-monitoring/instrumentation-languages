package kieker.develop.rl.generator

import java.util.Collection
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

interface IGeneratorProvider {
	def void addOutletConfigurations(Collection<AbstractOutletConfiguration> configurations)
}