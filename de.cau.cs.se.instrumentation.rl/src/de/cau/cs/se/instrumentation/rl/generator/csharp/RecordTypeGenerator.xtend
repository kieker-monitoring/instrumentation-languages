package de.cau.cs.se.instrumentation.rl.generator.csharp

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
	override getId() '''csharp'''
	
	override getDescription() '''C# record generator'''
	
	override getOutletType() '''csharp'''
			
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».cs'''
	
	override supportsAbstractRecordType() { true }
	
	override createContent(RecordType type, String author, String version) {
	}
	

	
}