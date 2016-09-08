package kieker.develop.rl.generator.java.record

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Type

class JavaOutletConfiguration extends AbstractOutletConfiguration {
	
	private static String JAVA_OUTLET_ID = "java";
		
	new() {
		super(JAVA_OUTLET_ID, "Java record", "./src-gen/java")
		eventTypeGenerators += new EventTypeGenerator
		templateTypeGenerators += new TemplateTypeGenerator
	}
		
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name».java'''
	
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
}