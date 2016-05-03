package kieker.develop.rl.generator.java.factory

import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.Type
import java.io.File
import java.util.Calendar

class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {

	/**
	 * Return the unique id.
	 */
	override getId() '''java.factory'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''Java factory'''
	
	/**
	 * No factory for abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { false }

	/**
	 * Define language/generation type, which is also used to define the outlet.
	 */
	override getOutletType() '''java-factory'''

	/**
	 * Compute the directory name for a record type.
	 */
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.', File::separator)»'''

	/**
	 * Compute file name.
	 */
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name»Factory.java'''

	/**
	 * Primary code generation template.
	 * 
	 * @param type
	 * 		one record type to be used to create the corresponding monitoring record factory
	 * @param author
	 * 		generic author name for the record
	 * @param version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version, String headerComment) {
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since

		'''
			«IF (!headerComment.equals(""))»«headerComment.replace("THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)»
			«ENDIF»package «(type.eContainer as Model).name»;
			
			import java.nio.ByteBuffer;

			import kieker.common.record.factory.IRecordFactory;
			import kieker.common.util.registry.IRegistry;
			
			/**
			 * @author «definedAuthor»
			 * 
			 * @since «definedVersion»
			 */
			public final class «type.name»Factory implements IRecordFactory<«type.name»> {
				
				@Override
				public «type.name» create(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {
					return new «type.name»(buffer, stringRegistry);
				}
				
				@Override
				public «type.name» create(final Object[] values) {
					return new «type.name»(values);
				}
				
				public int getRecordSizeInBytes() {
					return «type.name».SIZE;
				}
			}
		'''
	}

}
