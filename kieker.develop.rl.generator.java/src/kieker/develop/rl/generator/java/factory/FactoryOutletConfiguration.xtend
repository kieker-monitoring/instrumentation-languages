package kieker.develop.rl.generator.java.factory

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Type

class FactoryOutletConfiguration extends AbstractOutletConfiguration {
	
	private static String FACTORY_OUTLET_ID = "java.factory";
		
	new() {
		super(FACTORY_OUTLET_ID, "Java factory", "./src-gen/java-factory")
		generators += new RecordFactoryTypeGenerator
	}
	
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name»Factory.java'''
	
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.replace('.', File::separator)»'''
	
}