package kieker.develop.rl.typing.semantics;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.function.Consumer;
import kieker.develop.rl.typing.semantics.AnnotationResource;
import kieker.develop.rl.typing.semantics.AnnotationURIHelper;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.Semantics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;

@SuppressWarnings("all")
public class AnnotationProvider implements Resource.Factory {
  private final ResourceSet resourceSet;
  
  /**
   * Construct the type provider.
   * 
   * @param resourceSet
   *            context resource set
   * @param model
   *            the application model
   */
  public AnnotationProvider(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  /**
   * Provides a list of all primitive types.
   * 
   * @return Returns an iterable with all primitive types.
   */
  public Iterable<Annotation> getAllAnnotations() {
    final ArrayList<Annotation> annotations = new ArrayList<Annotation>();
    URI _createResourceURI = AnnotationURIHelper.createResourceURI();
    final Resource resource = this.resourceSet.getResource(_createResourceURI, true);
    EList<EObject> _contents = resource.getContents();
    Iterable<Semantics> _filter = Iterables.<Semantics>filter(_contents, Semantics.class);
    final Consumer<Semantics> _function = (Semantics it) -> {
      EList<Annotation> _annotations = it.getAnnotations();
      annotations.addAll(_annotations);
    };
    _filter.forEach(_function);
    return annotations;
  }
  
  /**
   * Find the type for a given name and return it.
   * 
   * @param name
   *            The name of the type.
   * @return Returns the primitive type for a given type name, or null.
   */
  public Annotation findTypeByName(final String name) {
    boolean _isEmpty = Strings.isEmpty(name);
    if (_isEmpty) {
      throw new IllegalArgumentException("Internal error: Empty type name.");
    }
    final URI resourceURI = AnnotationURIHelper.createResourceURI();
    Resource _resource = this.resourceSet.getResource(resourceURI, true);
    final AnnotationResource resource = ((AnnotationResource) _resource);
    EObject _eObject = resource.getEObject(name);
    return ((Annotation) _eObject);
  }
  
  /**
   * Create a type resource for a given URI.
   * 
   * @param uri
   *            The URI for the resource
   */
  @Override
  public AnnotationResource createResource(final URI uri) {
    return new AnnotationResource(uri);
  }
}
