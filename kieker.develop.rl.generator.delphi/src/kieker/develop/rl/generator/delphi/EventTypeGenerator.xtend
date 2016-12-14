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

import kieker.develop.rl.generator.TypeInputModel
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.ITypeGenerator

class EventTypeGenerator implements ITypeGenerator<EventType, CharSequence> {
		
	override generate(TypeInputModel<EventType> input) {
		''''''
	}
	
	override accepts(Type type) {
		false
	}

	
}