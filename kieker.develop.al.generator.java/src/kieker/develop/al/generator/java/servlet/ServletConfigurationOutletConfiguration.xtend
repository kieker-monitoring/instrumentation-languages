package kieker.develop.al.generator.java.servlet

import java.io.File
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import org.w3c.dom.Document
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.al.generator.java.ConfigurationProperties

class ServletConfigurationOutletConfiguration extends AbstractOutletConfiguration<IntermediateModel, Document> {
		
	new() {
		super(ConfigurationProperties.SERVLET_ADVICE_OUTLET_ID, "Java Servlet", "./src-gen/java", 
			ConfigurationProperties.LANG_JAVA, ConfigurationProperties.TECH_SERVLET
		)
		generators += new ServletConfigurationGenerator()
	}
	
	override outputFilePath(IntermediateModel node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(IntermediateModel node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}