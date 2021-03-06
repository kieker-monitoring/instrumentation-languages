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
package kieker.develop.rl.typing.semantics

import java.io.IOException
import java.io.InputStream
import java.util.HashMap
import java.util.Map
import kieker.develop.semantics.ISemanticExtension
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.AnnotationsFactory
import kieker.develop.semantics.annotations.Semantics
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import kieker.develop.semantics.annotations.Technology

/**
 * Resource for semantic annotations.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class SemanticAnnotationResource extends ResourceImpl {
	
	public static final String SEMANTIC_ANNOTATION = "kieker.develop.semantics.SemanticAnnotation"
		
	new(URI uri) {
		super(uri)
	}
	
	/**
	 * Return an EObject with the name specified by the uriFragment.
	 * 
	 * @param uriFragment
	 * 
	 * @return the EObject identified by the uriFragment or null if no such object exists. 
	 */
	override EObject getEObject(String uriFragment) {
		if (!this.getContents().empty) {
			return super.getEObject(uriFragment)
		} else
			return super.getEObject(uriFragment)
	}

	/**
	 * Compute the uriFragment for a given EObject.
	 * 
	 * @param eObject the object the fragment is computed for.
	 * 
	 * @return returns the uriFragment for the given object.
	 */
	override String getURIFragment(EObject eObject) {
		if (eObject instanceof Annotation) {
			return eObject.name
		} else {
			return super.getURIFragment(eObject)
		}
	}

	/**
	 * load the resource iff it is not already loaded.
	 */
	override void load(Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.doLoad(null, null)
		}
	}

	/**
	 * Saving this resource is not allowed, as it is a virtual resource.
	 */
	override void save(Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException()
	}

	/**
	 * This routine is called from ResourceImpl load after the load method above is triggered.
	 * It initializes the primitive type mirror.
	 * 
	 * @param inputStream
	 * @param options
	 * 
	 * @throws IOException
	 */
	override void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		if (this.getURI() !== null) {
			createModel()
		} else {
			try {
				throw new IOException("URI not set on AnnotationResource.onLoad");
			} catch (IOException e) {
				e.printStackTrace()
			}
		}
	}
	
	private def createModel() {
		val Semantics model = AnnotationsFactory.eINSTANCE.createSemantics
		val Map<String,Annotation> annotations = new HashMap<String,Annotation>()
		val Map<String,Technology> technologies = new HashMap<String,Technology>()
		
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
	          		semanticExtension.technologies.forEach[
	          			if (!technologies.containsKey(it.name)) {
	          				val technology = AnnotationsFactory.eINSTANCE.createTechnology()
	          				technology.name = it.name
	          				technologies.put(it.name, technology)
	          				model.technologies += technology	
	          			}
	          		]
	          	}
			]
	    } catch (CoreException ex) {
	      	System.out.println(ex.getMessage())
	    }
	    
	    this.getContents().addAll(model)
	}
	
	
	
}