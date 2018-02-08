/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.tests

import kieker.develop.rl.typing.base.BaseTypes

/**
 * Generic template interface for code and model templates.
 * 
 * @author Reiner Jung
 */
interface ITemplates {
	def String model (String name, CharSequence types);
	
	def String eventType(String name, boolean abstractType, String parent, String templates, CharSequence body);
	
	def String property(BaseTypes type, String name, boolean transientType, boolean increment, String value);
	
	def String simpleProperty(BaseTypes type, String name);
}