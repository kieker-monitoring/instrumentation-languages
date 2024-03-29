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
package kieker.develop.rl.generator.modeltypes

import kieker.develop.geco.IGenerator
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.geco.TraceModelProvider
import kieker.develop.rl.recordLang.RecordLangFactory

/**
 * Extension template type generator.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class ExtensionsTemplateTypeGenerator implements IGenerator<ModelSubType, TemplateType> {

	var String author
	var String version
	
	var TraceModelProvider<ModelSubType, TemplateType> traceModelProvider
	
	override generate(ModelSubType input) {
		val result = RecordLangFactory.eINSTANCE.createTemplateType
		
		traceModelProvider.add(input, result) // establish model trace
		
		result.name = input.name
		result.author = author
		result.since = version
		
		result.inherits.addAll(input.extensions)
						
		return result
	}
	
	def setTraceModel(TraceModelProvider<ModelSubType, TemplateType> provider) {
		this.traceModelProvider = provider
	}
	
	def void setAuthor(String author) {
		this.author = author
	}
	
	def void setVersion (String version) {
		this.version = version
	}
	
}