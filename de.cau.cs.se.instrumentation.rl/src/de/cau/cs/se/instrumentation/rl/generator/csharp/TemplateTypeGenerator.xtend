package de.cau.cs.se.instrumentation.rl.generator.csharp

import de.cau.cs.se.instrumentation.rl.generator.AbstractTemplateTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File

class TemplateTypeGenerator extends AbstractTemplateTypeGenerator {
	
	override getId() '''csharp'''
	
	override getOutletType() '''csharp'''
	
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».cs'''

	override createContent(TemplateType type, String author, String version) {
		
	}
		
}