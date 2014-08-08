package de.cau.cs.se.instrumentation.rl.generator.java.factory

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import org.eclipse.emf.ecore.EClassifier

class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {
		
	override getLanguageType() '''java'''
	
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
	
	override directoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''

	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name»Factory.java'''
	
	override createTypeName(Classifier classifier) {
		val typeName = if (classifier.sizes.size>0)
			classifier.class_.createPrimitiveTypeName + 
			classifier.sizes.map[size | '''[]''' ].join
		else
			classifier.class_.createPrimitiveTypeName

		typeName + 'Factory'
	}

	/**
	 * Determine the right Java string for a given system type.
	 */
	def createPrimitiveTypeName(EClassifier classifier) {
		switch (classifier.name) {
			case 'int' : 'int'
			case 'long' : 'long'
			case 'short' : 'short'
			case 'double' : 'double'
			case 'float' : 'float'
			case 'char' : 'char'
			case 'byte' : 'byte'
			case 'string' : 'String'
			case 'boolean' : 'boolean'
			default : classifier.name
		}	
	}
}