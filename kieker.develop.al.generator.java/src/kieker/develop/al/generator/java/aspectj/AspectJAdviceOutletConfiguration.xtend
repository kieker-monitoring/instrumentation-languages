package kieker.develop.al.generator.java.aspectj

import java.io.File
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

class AspectJAdviceOutletConfiguration extends AbstractOutletConfiguration<Advice, CharSequence> {
	
	private static String ASPECTJ_ADVICE_OUTLET_ID = "java";
	
	new() {
		super(ASPECTJ_ADVICE_OUTLET_ID, "AspectJ", "./src-gen/java")
		generators += new AspectJAdviceGenerator()
	}
	
	override outputFilePath(Advice node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(Advice node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}