package kieker.develop.rl.generator.java.factory

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.java.GeneratorProvider

class FactoryOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String FACTORY_OUTLET_ID = "java.factory";
		
	new() {
		super(FACTORY_OUTLET_ID, "Java factory", "./src-gen/java-factory", GeneratorProvider.LANG_JAVA, GeneratorProvider.TECH_KIEKER_JAVA)
		generators += new EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name»Factory.java'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.', File::separator)»'''
	
}