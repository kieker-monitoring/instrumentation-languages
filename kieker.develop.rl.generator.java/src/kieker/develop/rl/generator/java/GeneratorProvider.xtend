package kieker.develop.rl.generator.java

import kieker.develop.rl.generator.IGeneratorProvider
import java.util.ArrayList
import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator
import kieker.develop.rl.ouput.config.OutletConfiguration

class GeneratorProvider implements IGeneratorProvider {
	
	override getRecordTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractRecordTypeGenerator>>()

		generators.add(kieker.develop.rl.generator.java.factory.RecordFactoryTypeGenerator)
		generators.add(kieker.develop.rl.generator.java.record.RecordTypeGenerator)
		generators.add(kieker.develop.rl.generator.java.junit.RecordTypeGenerator)
		
		return generators
	}
	
	override getTemplateTypeGenerators() {
		val generators = new ArrayList<Class<? extends AbstractTemplateTypeGenerator>>()

		generators.add(kieker.develop.rl.generator.java.record.TemplateTypeGenerator)
		
		return generators
	}
	
	override getOutletConfigurations() {
		val outletConfigurations = new ArrayList<OutletConfiguration>()
		
		outletConfigurations.add(new OutletConfiguration("java", "Java Output Folder", "./src-gen/java"))
		outletConfigurations.add(new OutletConfiguration("java-factory", "Java Factory Output Folder", "./src-gen/java-factory"))
		outletConfigurations.add(new OutletConfiguration("junit", "Junit Output Folder", "./test-gen/common"))
		
		return outletConfigurations
	}
	
}