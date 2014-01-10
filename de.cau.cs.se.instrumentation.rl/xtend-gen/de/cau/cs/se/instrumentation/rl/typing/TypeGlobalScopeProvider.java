package de.cau.cs.se.instrumentation.rl.typing;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import de.cau.cs.se.instrumentation.rl.typing.ITypeProvider;
import de.cau.cs.se.instrumentation.rl.typing.PrimitiveTypeScope;
import de.cau.cs.se.instrumentation.rl.typing.TypeProviderFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

@SuppressWarnings("all")
public class TypeGlobalScopeProvider extends DefaultGlobalScopeProvider {
  @Inject
  private TypeProviderFactory typeProviderFactory;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
    EClass _eReferenceType = reference.getEReferenceType();
    final IScope parentTypeScope = this.getParentTypeScope(resource, reference, filter, _eReferenceType);
    EClass _eReferenceType_1 = reference.getEReferenceType();
    return super.getScope(parentTypeScope, resource, false, _eReferenceType_1, filter);
  }
  
  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) {
    boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.ECLASSIFIER, referenceType);
    if (_isAssignableFrom) {
      boolean _notEquals = (!Objects.equal(resource, null));
      if (_notEquals) {
        final ResourceSet resourceSet = resource.getResourceSet();
        boolean _notEquals_1 = (!Objects.equal(resourceSet, null));
        if (_notEquals_1) {
          final ITypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(resourceSet);
          PrimitiveTypeScope _primitiveTypeScope = new PrimitiveTypeScope(typeProvider, this.qualifiedNameConverter, filter);
          return _primitiveTypeScope;
        } else {
          IllegalStateException _illegalStateException = new IllegalStateException("context must be contained in a resource set");
          throw _illegalStateException;
        }
      } else {
        IllegalStateException _illegalStateException_1 = new IllegalStateException("context must be contained in a resource");
        throw _illegalStateException_1;
      }
    } else {
      return IScope.NULLSCOPE;
    }
  }
}
