package kieker.develop.rl.generator.delphi

import java.util.Collection
import kieker.develop.rl.generator.IGeneratorProvider
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
	
	override void addOutletConfigurations(Collection<AbstractOutletConfiguration> configurations) {
		configurations.add(new DelphiOutletConfiguration())		
	}
	
}