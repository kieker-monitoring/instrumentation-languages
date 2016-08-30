package kieker.develop.rl.generator.delphi

import kieker.develop.rl.generator.IGeneratorProvider
import java.util.ArrayList
import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator
import kieker.develop.rl.ouput.config.OutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
	
	override getRecordTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractRecordTypeGenerator>>()

		generators.add(kieker.develop.rl.generator.delphi.RecordTypeGenerator)
		
		return generators
	}
	
	override getTemplateTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractTemplateTypeGenerator>>()
	
		return generators
	}
	
	override getOutletConfigurations() {
		val outletConfigurations = new ArrayList<OutletConfiguration>()
		
		outletConfigurations.add(new OutletConfiguration("delphi", "Delphi Output Folder", "./src-gen/delphi"))
		
		return outletConfigurations
	}
	
}