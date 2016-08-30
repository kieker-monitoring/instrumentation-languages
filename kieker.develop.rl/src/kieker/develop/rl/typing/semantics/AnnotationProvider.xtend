package kieker.develop.rl.typing.semantics

import kieker.develop.semantics.annotations.Annotation
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.util.Strings
import java.util.ArrayList
import kieker.develop.semantics.annotations.Semantics

class AnnotationProvider implements Resource.Factory {
		
	private val ResourceSet resourceSet;

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
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	def Iterable<Annotation> getAllAnnotations() {
		val annotations = new ArrayList<Annotation>
		
		val resource = resourceSet.getResource(AnnotationURIHelper.createResourceURI(), true)
		resource.getContents().filter(Semantics).forEach[annotations.addAll(it.annotations)]
		
		return annotations
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

		val URI resourceURI = AnnotationURIHelper.createResourceURI()
		val AnnotationResource resource = this.resourceSet.getResource(resourceURI, true) as AnnotationResource

		return resource.getEObject(name) as Annotation
	}

	/**
	 * Create a type resource for a given URI.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	override AnnotationResource createResource(URI uri) {
		return new AnnotationResource(uri)
	}
	
}