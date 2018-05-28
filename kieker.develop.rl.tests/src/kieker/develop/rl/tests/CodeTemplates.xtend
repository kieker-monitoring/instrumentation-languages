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
package kieker.develop.rl.tests

import kieker.develop.rl.typing.base.BaseTypes

class CodeTemplates implements ITemplates {
	override String model (String name, CharSequence types) '''
		package «name»
		
		«types»	
	'''
	
	override String eventType(String name, boolean abstractType, String parent, String templates, CharSequence body) '''
		«if (abstractType) 'abstract '»entity «name»«if (parent !== null) ' extends ' + parent»«if (templates !== null) ' : ' + templates»«IF body !== null» {
			«body»
		}«ENDIF»
		
	'''
	
	override String property(BaseTypes type, String name, boolean transientType, boolean increment, String value) '''
		«if (transientType) 'transient '»«if (increment) 'auto-increment'»«type.name.toLowerCase» «name»«if (value !== null) ' = '»«value»
	'''

	override String simpleProperty(BaseTypes type, String name) {
		property(type, name, false, false, null)
	}
		
}
