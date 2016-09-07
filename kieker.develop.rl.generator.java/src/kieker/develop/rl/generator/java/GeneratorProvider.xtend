package kieker.develop.rl.generator.java

import java.util.Collection
import kieker.develop.rl.generator.IGeneratorProvider
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.generator.java.record.JavaOutletConfiguration
import kieker.develop.rl.generator.java.factory.FactoryOutletConfiguration
import kieker.develop.rl.generator.java.junit.JUnitOutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
		
	override addOutletConfigurations(Collection<AbstractOutletConfiguration> configurations) {
		configurations += new JavaOutletConfiguration()
		configurations += new FactoryOutletConfiguration()
		configurations += new JUnitOutletConfiguration()	
	}
	
}