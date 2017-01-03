package kieker.develop.al.generator.java.aspectj

import java.io.File
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.al.generator.java.JavaAdviceGeneratorProvider

class AspectJAdviceOutletConfiguration extends AbstractOutletConfiguration<Advice, CharSequence> {
	
	public static String TECH_ASPECT_J = "AspectJ"
	
	// TODO update the advice outlet if necessary
	private static String ASPECT_J_ADVICE_OUTLET_ID = "java";
		
	new() {
		super(ASPECT_J_ADVICE_OUTLET_ID, "AspectJ", "./src-gen/java", JavaAdviceGeneratorProvider.LANG_JAVA, TECH_ASPECT_J)
		generators += new AspectJAdviceGenerator()
	}
	
	override outputFilePath(Advice node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(Advice node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''
	
}