package kieker.develop.al.generator.java.aspectj

import java.io.File
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.al.generator.java.ConfigurationProperties

class AspectJAdviceOutletConfiguration extends AbstractOutletConfiguration<Advice, CharSequence> {
			
	new() {
		super(ConfigurationProperties.ASPECT_J_ADVICE_OUTLET_ID, "AspectJ", "./src-gen/java", 
			ConfigurationProperties.LANG_JAVA, ConfigurationProperties.TECH_ASPECT_J
		)
		generators += new AspectJAdviceGenerator()
	}
	
	override outputFilePath(Advice node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(Advice node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}