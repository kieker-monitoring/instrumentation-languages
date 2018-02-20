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
package kieker.develop.rl.generator.java.tests

import kieker.develop.rl.typing.base.BaseTypes
import java.util.Collection
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.EventType
import java.util.List

/**
 * The model factory is used to create programmatically a IRL model based on a model type definition.
 */
class ModelFactory {
	
	/**
	 * Create a classifier for a base type.
	 */
	static def createClassifier(BaseTypes type, Collection<ArraySize> sizes) {
		val result = RecordLangFactory.eINSTANCE.createClassifier
		result.type = RecordLangFactory.eINSTANCE.createBaseType
		result.type.name = type.name.toLowerCase
		if (sizes !== null)
			result.sizes.addAll(sizes)
		
		return result
	}
	
	static def createProperty(String name, Classifier classifier) {
		val result = RecordLangFactory.eINSTANCE.createProperty
		result.name = name
		result.type = classifier
		
		return result
	}
	
	static def createModel(String name) {
		val result = RecordLangFactory.eINSTANCE.createModel
		result.name = name
		
		return result
	}
	
	static def createEventType(String name, EventType parent, List<TemplateType> inherits) {
		val result = RecordLangFactory.eINSTANCE.createEventType
		result.name = name
		result.parent = parent
		if (inherits !== null)
			result.inherits.addAll(inherits)
		result.abstract = false
		
		return result
	}
	
	static def createTemplateType(String name, List<TemplateType> inherits) {
		val result = RecordLangFactory.eINSTANCE.createTemplateType
		result.name = name
		if (inherits !== null)
			result.inherits.addAll(inherits)
		
		return result
	}
}
