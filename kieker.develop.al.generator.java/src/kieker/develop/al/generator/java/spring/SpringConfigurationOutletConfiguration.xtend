package kieker.develop.al.generator.java.spring

import java.io.File
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.generator.java.ConfigurationProperties
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import org.w3c.dom.Document

class SpringConfigurationOutletConfiguration extends AbstractOutletConfiguration<IntermediateModel, Document> {
			
	new() {
		super(ConfigurationProperties.SPRING_CONFIGURATION_OUTLET_ID, "Spring", "./src-gen/java", 
			ConfigurationProperties.LANG_JAVA, ConfigurationProperties.TECH_ASPECT_J
		)
		generators += new SpringConfigurationGenerator
	}
	
	override outputFilePath(IntermediateModel node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(IntermediateModel node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}