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
package kieker.develop.rl.generator.delphi

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType

class EventTypeGenerator extends AbstractTypeGenerator<EventType, CharSequence> {
		
		/**
	 * Central code generation template.
	 * 
	 * @param type the event type
	 * 	in this event type (template inherited types and own types)
	 * @param header the header comment
	 * @param author the author of the EvenType
	 * @param version the version of the first occurrence of the type
	 * 
	 * @return a Java class for a Kieker EventType
	 */
	protected override createOutputModel(EventType type, String header, String author, String version) {
		''''''
	}
	
	override accepts(ComplexType type) {
		false
	}

	
}