package kieker.tools.rl.generator.delphi

import kieker.tools.rl.generator.AbstractRecordTypeGenerator
import kieker.tools.rl.recordLang.RecordType
import kieker.tools.rl.recordLang.Type
import java.io.File
import kieker.tools.rl.recordLang.Model

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
		
	override getId() '''delphi'''
	
	override getDescription() '''Delphi record generator'''
	
	/**
	 * Create abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { true }
	
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».pas'''
	
	override getOutletType() '''delphi'''
	
	override createContent(RecordType type, String author, String version) {
		''''''
	}
	
}