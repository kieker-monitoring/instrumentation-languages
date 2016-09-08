package kieker.develop.rl.generator.java.junit

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Type

import static extension kieker.develop.rl.generator.java.junit.NameResolver.*

class JUnitOutletConfiguration extends AbstractOutletConfiguration {
	
	private static String JUNIT_OUTLET_ID = "java.junit";
		
	new () {
		super(JUNIT_OUTLET_ID, "JUnit test", "./test-gen/common")
		eventTypeGenerators += new EventTypeGenerator
	}
	
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»TestGenerated«type.name».java'''
	
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.createTestPackageName.replace('.',File::separator)»'''
	
	
}