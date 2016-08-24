package kieker.develop.rl.generator.c

import kieker.develop.rl.generator.IGeneratorProvider
import java.util.ArrayList
import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator
import kieker.develop.rl.ouput.config.OutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
	
	override getRecordTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractRecordTypeGenerator>>()

		generators.add(kieker.develop.rl.generator.c.header.RecordTypeGenerator)
		generators.add(kieker.develop.rl.generator.c.main.RecordTypeGenerator)
		
		return generators
	}
	
	override getTemplateTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractTemplateTypeGenerator>>()
		
		return generators
	}
	
	override getOutletConfigurations() {
		val outletConfigurations = new ArrayList<OutletConfiguration>()
		
		outletConfigurations.add(new OutletConfiguration("c", "C Output Folder", "./src-gen/c"))
		
		return outletConfigurations
	}
	
}