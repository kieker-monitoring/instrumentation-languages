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

import kieker.develop.semantics.annotations.Annotation
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.util.Strings
import java.util.ArrayList
import kieker.develop.semantics.annotations.Semantics
import kieker.develop.semantics.annotations.Technology

/**
 * Provider for semantic annotations.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class SemanticAnnotationProvider implements Resource.Factory {
	
	/** */
	public static final String ELEMENTS = "/Elements" //$NON-NLS-1$
	/** */
	public static final String PROTOCOL = "annotation" //$NON-NLS-1$
	/** */
	public static final String OBJECTS = "/Snippets/" //$NON-NLS-1$
		
	private val ResourceSet resourceSet

	/**
	 * Construct the type provider.
	 *
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
	 */
	new(ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}

	/**
	 * Construct a full URI for a class.
	 *
	 * @param fullQualifiedClassName
	 *            the full qualified class name
	 * @return a complete URI
	 */
	def URI getFullURIForClass(String fullQualifiedClassName) {
		val StringBuilder uriBuilder = new StringBuilder(48)
		uriBuilder.append(PROTOCOL)
		uriBuilder.append(':')
		uriBuilder.append(OBJECTS).append(fullQualifiedClassName)
		uriBuilder.append('#')
		uriBuilder.append(fullQualifiedClassName)
		return URI.createURI(uriBuilder.toString())
	}

	/**
	 * Provides a list of all annotations.
	 *
	 * @return Returns an iterable with all annotations.
	 */
	def Iterable<Annotation> getAllAnnotations() {
		val annotations = new ArrayList<Annotation>
		
		val resource = resourceSet.getResource(createResourceURI(), true)
		resource.getContents().filter(Semantics).forEach[annotations.addAll(it.annotations)]
		
		return annotations
	}
	
	/**
	 * Provides a list of all technologies.
	 *
	 * @return Returns an iterable with all technologies.
	 */
	def Iterable<Technology> getAllTechnologies() {
		val technologies = new ArrayList<Technology>
		
		val resource = resourceSet.getResource(createResourceURI(), true)
		resource.getContents().filter(Semantics).forEach[technologies.addAll(it.technologies)]
		
		return technologies
	}

	/**
	 * Find the type for a given name and return it.
	 *
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	def Annotation findTypeByName(String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.")
		}

		val URI resourceURI = createResourceURI()
		val SemanticAnnotationResource resource = this.resourceSet.getResource(resourceURI, true) as SemanticAnnotationResource

		return resource.getEObject(name) as Annotation
	}

	/**
	 * Create a type resource for a given URI.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	override SemanticAnnotationResource createResource(URI uri) {
		return new SemanticAnnotationResource(uri)
	}
	
		/**
	 * Create the URI for the virtual resource.
	 *
	 * @return the URI
	 */
	private def URI createResourceURI() {
		return URI.createURI(PROTOCOL + ':' + ELEMENTS)
	}
}