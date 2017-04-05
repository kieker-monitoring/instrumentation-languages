package kieker.develop.al.generator.java.javaee

import java.io.File
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.generator.java.ConfigurationProperties
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import org.w3c.dom.Document

class JavaEEConfigurationOutletConfiguration extends AbstractOutletConfiguration<IntermediateModel, Document> {
				
	new() {
		super(ConfigurationProperties.JAVA_EE_ADVICE_OUTLET_ID, "Java EE", "./src-gen/java",
			ConfigurationProperties.LANG_JAVA, ConfigurationProperties.TECH_JAVA_EE
		)
		generators += new JavaEEConfigurationGenerator()
	}
	
	override outputFilePath(IntermediateModel node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(IntermediateModel node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}