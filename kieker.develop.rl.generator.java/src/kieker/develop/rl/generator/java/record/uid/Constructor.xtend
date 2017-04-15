/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.java.record.uid

import kieker.develop.rl.recordLang.Classifier

/**
 * Part of the UID calculator.
 * 
 * @author Reiner Jung
 * @since 1.0
 */
class Constructor {
	private String name
	private EVisibility visibility
	private Classifier[] signature
	
	new (String name, EVisibility visibility, Classifier[] signature) {
		this.name = name
		this.visibility = visibility
		this.signature = signature
	}
	
	def String getName() {
		return name
	}
	
	def EVisibility getVisibility() {
		return visibility
	}
	
	def Classifier[] getSignature() {
		return signature
	}
}
