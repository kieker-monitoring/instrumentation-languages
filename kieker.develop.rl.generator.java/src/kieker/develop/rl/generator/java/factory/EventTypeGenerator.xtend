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

import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.generator.AbstractTypeGenerator

/**
 * Generator for factories for the event types.
 * 
 * @author Christian Wulf
 * @since 1.2
 */
class EventTypeGenerator extends AbstractTypeGenerator<EventType, CharSequence> {
	
	override accepts(ComplexType type) {
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
	protected override createOutputModel(EventType type, String header, String author, String version) {
		'''
			«this.header»package «(type.eContainer as Model).name»;
			
			import java.nio.ByteBuffer;

			import kieker.common.record.factory.IRecordFactory;
			import kieker.common.record.io.IValueDeserializer;
			import kieker.common.util.registry.IRegistry;
			
			/**
			 * @author «author»
			 * 
			 * @since «version»
			 */
			public final class «type.name»Factory implements IRecordFactory<«type.name»> {
				
				@Override
				public «type.name» create(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {
					return new «type.name»(buffer, stringRegistry);
				}
				
				@Override
				public «type.name» create(final IValueDeserializer deserializer) {
					return new «type.name»(deserializer);
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
