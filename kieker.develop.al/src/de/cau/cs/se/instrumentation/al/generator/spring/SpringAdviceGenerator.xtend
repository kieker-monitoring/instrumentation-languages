package kieker.develop.al.generator.spring

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.aspectLang.Advice

import static extension kieker.develop.al.generator.CommonJavaTemplates.*

class SpringAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	override generate(Advice input) {
		'''
			package «input.packageName»
			
			«input.collectors.createRecordInputs»
			
			MISSING
		'''
	}
	
}