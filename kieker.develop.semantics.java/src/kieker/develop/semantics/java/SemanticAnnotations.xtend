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
package kieker.develop.semantics.java

import kieker.develop.semantics.ISemanticExtension
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.Technology
import kieker.develop.semantics.annotations.TargetLanguage
import kieker.develop.semantics.annotations.Semantics
import kieker.develop.semantics.annotations.AnnotationsFactory
import javax.inject.Inject

/**
 * Semantic annotations for Java.
 * 
 * @author Reiner Jung
 */
class SemanticAnnotations implements ISemanticExtension {
	
	private Semantics model
	
	@Inject extension AspectJSemantics aspectJ
	
	
	new () {
		model = AnnotationsFactory.eINSTANCE.createSemantics
		model => [
			val language = createLanguage("Java")
			it.languages +=  language
			val technology = createTechnology("AspectJ")
			it.technologies += technology
			it.annotations += createAnnotation(language, technology, "operationSignature", aspectJ.createOperationSignature)
			it.annotations += createAnnotation(language, technology, "classSignature", aspectJ.createClassSignature)
			it.annotations += createAnnotation(language, technology, "time", aspectJ.createTimestamp)
			it.annotations += createAnnotation(language, technology, "orderIndex", aspectJ.createOderIndex)
			it.annotations += createAnnotation(language, technology, "traceId", aspectJ.createTraceId)
		]
	}
		
	override getAnnotations() {
		return model.annotations
	}
	
	override getTechnologies() {
		return model.technologies
	}
	
	override getTargetLanguages() {
		return model.languages
	}
	
	override getImplementation(Annotation semantics, Technology technology, TargetLanguage language) {
		semantics.implementations.findFirst[
			it.technology.name.equals(technology.name) &&
			it.language.name.equals(language.name)
		]
	}
	
	private def createTechnology(String name) {
		val result = AnnotationsFactory.eINSTANCE.createTechnology
		result.name = name
		
		return result
	}
	
	private def createLanguage(String name) {
		val result = AnnotationsFactory.eINSTANCE.createTargetLanguage
		result.name = name
		
		return result
	}
	
	private def createAnnotation(TargetLanguage language, Technology technology,
		String name, String implementation
	) {
		val result = AnnotationsFactory.eINSTANCE.createAnnotation
		result.name = name
		result.implementations += createImplementation(language, technology, implementation)
		
		return result
	}
	
	private def createImplementation(TargetLanguage language, Technology technology, String code) {
		val result = AnnotationsFactory.eINSTANCE.createImplementation
		result.language = language
		result.technology = technology
		result.code = code
		
		return result
	}

	
}