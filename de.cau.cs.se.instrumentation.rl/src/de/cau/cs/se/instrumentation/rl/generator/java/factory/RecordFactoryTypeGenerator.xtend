package de.cau.cs.se.instrumentation.rl.generator.java.factory

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File

import static extension de.cau.cs.se.instrumentation.rl.generator.java.RlType2JavaTypeExtensions.createPrimitiveTypeName

class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {

	/**
	 * Define language/generation type, which is also used to define the outlet.
	 */
	override getLanguageType() '''java'''

	/**
	 * Compute the directory name for a record type.
	 */
	override directoryName(Type type) '''«(type.eContainer as Model).name.replace('.', File::separator)»'''

	/**
	 * Compute file name.
	 */
	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name»Factory.java'''

	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create the corresponding monitoring record factory
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version) {
		'''
			import x.y.z.ByteBuffer;
			import x.y.z.IRegistry;
			
			public interface IRecordFactory<T> {
				
				T create(ByteBuffer buffer, IRegistry<String> stringRegistry);
				
				T create(Object[] values, IRegistry<String> stringRegistry);
			}
			
			public class «type.name»Factory implements IRecordFactory<«type.name»> {
				
				@Override
				public T create(ByteBuffer buffer, IRegistry<String> stringRegistry) {
					return new «type.name»(buffer, stringRegistry);
				}
				
				@Override
				public T create(Object[] values, IRegistry<String> stringRegistry) {
					return new «type.name»(values, stringRegistry);
				}
			}
		'''
	}

	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	override createTypeName(Classifier classifier) {
		val typeName = if (classifier.sizes.size > 0)
				classifier.class_.createPrimitiveTypeName + classifier.sizes.map[size|'''[]'''].join
			else
				classifier.class_.createPrimitiveTypeName

		typeName + 'Factory'
	}

}
