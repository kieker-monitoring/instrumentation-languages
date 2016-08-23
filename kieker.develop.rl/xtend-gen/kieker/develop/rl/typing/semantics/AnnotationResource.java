package kieker.develop.rl.typing.semantics;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kieker.develop.semantics.ISemanticExtension;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.AnnotationsFactory;
import kieker.develop.semantics.annotations.Implementation;
import kieker.develop.semantics.annotations.Semantics;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class AnnotationResource extends ResourceImpl {
  private final static String SEMANTIC_ANNOTATION = "kieker.develop.semantics.SemanticAnnotation";
  
  public AnnotationResource(final URI uri) {
    super(uri);
  }
  
  /**
   * Return an EObject with the name specified by the uriFragment.
   * 
   * @param uriFragment
   * 
   * @return the EObject identified by the uriFragment or null if no such object exists.
   */
  @Override
  public EObject getEObject(final String uriFragment) {
    EList<EObject> _contents = this.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      System.out.println(("uri " + uriFragment));
      return super.getEObject(uriFragment);
    } else {
      return super.getEObject(uriFragment);
    }
  }
  
  /**
   * Compute the uriFragment for a given EObject.
   * 
   * @param eObject the object the fragment is computed for.
   * 
   * @return returns the uriFragment for the given object.
   */
  @Override
  public String getURIFragment(final EObject eObject) {
    if ((eObject instanceof Annotation)) {
      return ((Annotation) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
  }
  
  /**
   * load the resource iff it is not already loaded.
   */
  @Override
  public void load(final Map<?, ?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  /**
   * Saving this resource is not allowed, as it is a virtual resource.
   */
  @Override
  public void save(final Map<?, ?> options) throws IOException {
    throw new UnsupportedOperationException();
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
  @Override
  public void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    URI _uRI = this.getURI();
    boolean _notEquals = (!Objects.equal(_uRI, null));
    if (_notEquals) {
      this.createModel();
    } else {
      try {
        throw new IOException("URI not set on AnnotationResource.onLoad");
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  private boolean createModel() {
    boolean _xblockexpression = false;
    {
      final Semantics model = AnnotationsFactory.eINSTANCE.createSemantics();
      final Map<String, Annotation> annotations = new HashMap<String, Annotation>();
      final IExtensionRegistry registry = Platform.getExtensionRegistry();
      final IConfigurationElement[] config = registry.getConfigurationElementsFor(AnnotationResource.SEMANTIC_ANNOTATION);
      try {
        final Consumer<IConfigurationElement> _function = (IConfigurationElement element) -> {
          try {
            final Object ext = element.createExecutableExtension("annotations");
            if ((ext instanceof ISemanticExtension)) {
              final ISemanticExtension semanticExtension = ((ISemanticExtension) ext);
              Collection<Annotation> _annotations = semanticExtension.getAnnotations();
              final Consumer<Annotation> _function_1 = (Annotation it) -> {
                String _name = it.getName();
                boolean _containsKey = annotations.containsKey(_name);
                if (_containsKey) {
                  String _name_1 = it.getName();
                  Annotation _get = annotations.get(_name_1);
                  EList<Implementation> _implementations = _get.getImplementations();
                  EList<Implementation> _implementations_1 = it.getImplementations();
                  Iterables.<Implementation>addAll(_implementations, _implementations_1);
                } else {
                  final Annotation annotationDecl = AnnotationsFactory.eINSTANCE.createAnnotation();
                  String _name_2 = it.getName();
                  annotationDecl.setName(_name_2);
                  EList<Implementation> _implementations_2 = annotationDecl.getImplementations();
                  EList<Implementation> _implementations_3 = it.getImplementations();
                  Iterables.<Implementation>addAll(_implementations_2, _implementations_3);
                  String _name_3 = it.getName();
                  annotations.put(_name_3, annotationDecl);
                  EList<Annotation> _annotations_1 = model.getAnnotations();
                  _annotations_1.add(annotationDecl);
                }
              };
              _annotations.forEach(_function_1);
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        ((List<IConfigurationElement>)Conversions.doWrapArray(config)).forEach(_function);
      } catch (final Throwable _t) {
        if (_t instanceof CoreException) {
          final CoreException ex = (CoreException)_t;
          String _message = ex.getMessage();
          System.out.println(_message);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      EList<EObject> _contents = this.getContents();
      _xblockexpression = CollectionExtensions.<Semantics>addAll(_contents, model);
    }
    return _xblockexpression;
  }
}
