package kieker.develop.rl.generator.java.junit

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model

import static extension kieker.develop.rl.generator.java.junit.NameResolver.*
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.java.GeneratorProvider

class JUnitOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String JUNIT_OUTLET_ID = "java.junit";
		
	new () {
		super(JUNIT_OUTLET_ID, "JUnit test", "./test-gen/common", GeneratorProvider.LANG_JAVA, GeneratorProvider.TECH_JUNIT)
		generators += new EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»TestGenerated«type.name».java'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.createTestPackageName.replace('.',File::separator)»'''
	
	
}