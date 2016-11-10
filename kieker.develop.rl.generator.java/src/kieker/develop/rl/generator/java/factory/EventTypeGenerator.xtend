/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.java.factory

import kieker.develop.rl.generator.TypeInputModel
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.ITypeGenerator

class EventTypeGenerator implements ITypeGenerator<EventType, CharSequence> {
	
	override accepts(Type type) {
		if (type instanceof EventType) {
			!(type as EventType).abstract
		} else
			false
	}

	/**
	 * Primary code generation template.
	 * 
	 * @param type
	 * 		one record type to be used to create the corresponding monitoring record factory
	 */
	override generate(TypeInputModel<EventType> input) {
		val definedAuthor = if (input.type.author == null) input.author else input.type.author
		val definedVersion = if (input.type.since == null) input.version else input.type.since

		'''
			«input.header»package «(input.type.eContainer as Model).name»;
			
			import java.nio.ByteBuffer;

			import kieker.common.record.factory.IRecordFactory;
			import kieker.common.util.registry.IRegistry;
			
			/**
			 * @author «definedAuthor»
			 * 
			 * @since «definedVersion»
			 */
			public final class «input.type.name»Factory implements IRecordFactory<«input.type.name»> {
				
				@Override
				public «input.type.name» create(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {
					return new «input.type.name»(buffer, stringRegistry);
				}
				
				@Override
				public «input.type.name» create(final Object[] values) {
					return new «input.type.name»(values);
				}
				
				public int getRecordSizeInBytes() {
					return «input.type.name».SIZE;
				}
			}
		'''
	}

}
