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
package kieker.develop.rl.scoping

import com.google.inject.Singleton
import java.util.Collection
import java.util.HashMap
import java.util.Map
import kieker.develop.semantics.ISemanticExtension
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.AnnotationsFactory
import kieker.develop.semantics.annotations.Semantics
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform

/**
 * TODO This annotation handler duplicates code from the SemanticAnnotationResource.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
@Singleton
class SemanticAnnotationHandler implements ISemanticAnnotationHandler {
	static final String SEMANTIC_ANNOTATION = "kieker.develop.semantics.SemanticAnnotation"
	
	val Semantics model = AnnotationsFactory.eINSTANCE.createSemantics
		
	new() {	
		val Map<String,Annotation> annotations = new HashMap<String,Annotation>()
		
		val registry = Platform.getExtensionRegistry()
		val config = registry.getConfigurationElementsFor(SEMANTIC_ANNOTATION)
  		try {
  			config.forEach[element |
  				val semanticExtension = element.createExecutableExtension("annotations")
  				if (semanticExtension instanceof ISemanticExtension) {
	          		semanticExtension.annotations.forEach[
	          			if (annotations.containsKey(it.name)) {
	          				annotations.get(it.name).implementations += it.implementations
	          			} else {
	          				val annotationDecl = AnnotationsFactory.eINSTANCE.createAnnotation()
	          				annotationDecl.name = it.name
	          				annotationDecl.implementations += it.implementations
	          				annotations.put(it.name, annotationDecl)
	          				model.annotations += annotationDecl
	          			}
	          		]
	          	}
			]
	    } catch (CoreException ex) {
	      	System.out.println(ex.getMessage())
	    }
	}
	
	override Semantics getSemantics() {
		System.out.println("get semantics")
		return model
	}
		
	override Collection<Annotation> getAnnotations() {
		return model.annotations
	}
}