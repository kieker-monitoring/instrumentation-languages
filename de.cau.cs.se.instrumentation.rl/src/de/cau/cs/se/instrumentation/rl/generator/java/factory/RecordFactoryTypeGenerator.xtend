package de.cau.cs.se.instrumentation.rl.generator.java.factory

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File

import static extension de.cau.cs.se.instrumentation.rl.generator.java.RlType2JavaTypeExtensions.*

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
	 * @params type
	 * 		one record type to be used to create the corresponding monitoring record factory
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version) {
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since

		'''
			/***************************************************************************
			 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
			 *
			 * Licensed under the Apache License, Version 2.0 (the "License");
			 * you may not use this file except in compliance with the License.
			 * You may obtain a copy of the License at
			 *
			 *     http://www.apache.org/licenses/LICENSE-2.0
			 *
			 * Unless required by applicable law or agreed to in writing, software
			 * distributed under the License is distributed on an "AS IS" BASIS,
			 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			 * See the License for the specific language governing permissions and
			 * limitations under the License.
			 ***************************************************************************/

			package «(type.eContainer as Model).name»;
			
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
	def createTypeName(Classifier classifier) {
		val typeName = if (classifier.sizes.size > 0)
				classifier.class_.createPrimitiveTypeName + classifier.sizes.map[size|'''[]'''].join
			else
				classifier.class_.createPrimitiveTypeName

		typeName + 'Factory'
	}

}
