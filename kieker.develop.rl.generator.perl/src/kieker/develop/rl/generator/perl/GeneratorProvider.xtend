package kieker.develop.rl.generator.perl

import java.util.Collection
import kieker.develop.rl.generator.IGeneratorProvider
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
	
	override addOutletConfigurations(Collection<AbstractOutletConfiguration> configurations) {
		configurations += new PerlOutletConfiguration()
	}
	
}