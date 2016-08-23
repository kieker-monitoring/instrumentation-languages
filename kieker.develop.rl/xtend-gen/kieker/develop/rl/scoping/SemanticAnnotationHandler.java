package kieker.develop.rl.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Singleton;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kieker.develop.rl.scoping.ISemanticAnnotationHandler;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Singleton
@SuppressWarnings("all")
public class SemanticAnnotationHandler implements ISemanticAnnotationHandler {
  private final static String SEMANTIC_ANNOTATION = "kieker.develop.semantics.SemanticAnnotation";
  
  private final Semantics model = AnnotationsFactory.eINSTANCE.createSemantics();
  
  public SemanticAnnotationHandler() {
    final Map<String, Annotation> annotations = new HashMap<String, Annotation>();
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] config = registry.getConfigurationElementsFor(SemanticAnnotationHandler.SEMANTIC_ANNOTATION);
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
                EList<Annotation> _annotations_1 = this.model.getAnnotations();
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
  }
  
  @Override
  public Semantics getSemantics() {
    System.out.println("get semantics");
    return this.model;
  }
  
  @Override
  public Collection<Annotation> getAnnotations() {
    return this.model.getAnnotations();
  }
}
