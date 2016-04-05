package kieker.develop.rl.generator.delphi

import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Type
import java.io.File
import kieker.develop.rl.recordLang.Model

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