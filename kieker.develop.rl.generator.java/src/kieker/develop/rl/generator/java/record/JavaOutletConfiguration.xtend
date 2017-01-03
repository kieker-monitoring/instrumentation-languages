package kieker.develop.rl.generator.java.record

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.java.GeneratorProvider

class JavaOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String JAVA_OUTLET_ID = "java"
		
	new() {
		super(JAVA_OUTLET_ID, "Java record", "./src-gen/java", GeneratorProvider.LANG_JAVA, GeneratorProvider.TECH_KIEKER_JAVA)
		generators += new EventTypeGenerator
		generators += new TemplateTypeGenerator
	}
		
	override outputFilePath(ComplexType node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(ComplexType node) '''«(node.eContainer as Model).name.replace('.',File::separator)»'''
	
	
	
}