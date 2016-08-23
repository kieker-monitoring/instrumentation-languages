package kieker.develop.rl.typing.semantics;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.function.Consumer;
import kieker.develop.rl.typing.semantics.AnnotationProvider;
import kieker.develop.rl.typing.semantics.AnnotationURIHelper;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.AnnotationsFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

@SuppressWarnings("all")
public class AnnotationScope extends AbstractScope {
  private final AnnotationProvider typeProvider;
  
  private final IQualifiedNameConverter qualifiedNameConverter;
  
  private final Predicate<IEObjectDescription> filter;
  
  public AnnotationScope(final AnnotationProvider typeProvider, final IQualifiedNameConverter qualifiedNameConverter, final Predicate<IEObjectDescription> filter) {
    super(IScope.NULLSCOPE, false);
    this.typeProvider = typeProvider;
    this.qualifiedNameConverter = qualifiedNameConverter;
    this.filter = filter;
  }
  
  @Override
  protected Iterable<IEObjectDescription> getAllLocalElements() {
    final ArrayList<IEObjectDescription> annotations = new ArrayList<IEObjectDescription>();
    Iterable<Annotation> _allAnnotations = this.typeProvider.getAllAnnotations();
    final Consumer<Annotation> _function = (Annotation it) -> {
      String _name = it.getName();
      String _plus = (">> " + _name);
      System.out.println(_plus);
      String _name_1 = it.getName();
      IEObjectDescription _createScopedElement = this.createScopedElement(_name_1);
      annotations.add(_createScopedElement);
    };
    _allAnnotations.forEach(_function);
    return annotations;
  }
  
  private IEObjectDescription createScopedElement(final String fullyQualifiedName) {
    final InternalEObject proxy = this.createProxy(fullyQualifiedName);
    QualifiedName _qualifiedName = this.qualifiedNameConverter.toQualifiedName(fullyQualifiedName);
    final IEObjectDescription eObjectDescription = EObjectDescription.create(_qualifiedName, proxy);
    return eObjectDescription;
  }
  
  private InternalEObject createProxy(final String fullyQualifiedName) {
    System.out.println(("createProxy " + fullyQualifiedName));
    final URI uri = AnnotationURIHelper.getFullURIForClass(fullyQualifiedName);
    Annotation _createAnnotation = AnnotationsFactory.eINSTANCE.createAnnotation();
    final InternalEObject proxy = ((InternalEObject) _createAnnotation);
    proxy.eSetProxyURI(uri);
    return proxy;
  }
}
