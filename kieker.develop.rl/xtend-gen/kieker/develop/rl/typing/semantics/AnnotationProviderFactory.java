package kieker.develop.rl.typing.semantics;

import com.google.common.base.Objects;
import java.util.Map;
import kieker.develop.rl.typing.ITypeProvider;
import kieker.develop.rl.typing.semantics.AnnotationProvider;
import kieker.develop.rl.typing.semantics.AnnotationURIHelper;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

@SuppressWarnings("all")
public class AnnotationProviderFactory {
  /**
   * empty constructor.
   */
  public AnnotationProviderFactory() {
  }
  
  /**
   * Create a new type provider or fetch the already created type provider for the primitive
   * types.
   * 
   * @param resourceSet
   *            The resource set associated with the type provider
   * @param repository
   *            the application model
   * @return Returns the type provider for primitive types.
   */
  public static synchronized AnnotationProvider getTypeProvider(final ResourceSet resourceSet) {
    boolean _notEquals = (!Objects.equal(resourceSet, null));
    if (_notEquals) {
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _protocolToFactoryMap = _resourceFactoryRegistry.getProtocolToFactoryMap();
      final Object object = _protocolToFactoryMap.get(AnnotationURIHelper.PROTOCOL);
      boolean _notEquals_1 = (!Objects.equal(object, null));
      if (_notEquals_1) {
        if ((!(object instanceof ITypeProvider))) {
          System.out.println(((("Provider for " + AnnotationURIHelper.PROTOCOL) + " is ") + object));
          return AnnotationProviderFactory.createTypeProvider(resourceSet);
        } else {
          return ((AnnotationProvider) object);
        }
      } else {
        return AnnotationProviderFactory.createTypeProvider(resourceSet);
      }
    } else {
      throw new IllegalArgumentException("Cannot get type provide without a resourceSet.");
    }
  }
  
  /**
   * Create a new type provider for primitive types and register it with the resource.
   * 
   * @param resourceSet
   *            The resource set associated with the type provider.
   * @param repository
   *            the application model
   * @return Returns the new type provider.
   */
  private static AnnotationProvider createTypeProvider(final ResourceSet resourceSet) {
    final AnnotationProvider typeProvider = new AnnotationProvider(resourceSet);
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _protocolToFactoryMap = _resourceFactoryRegistry.getProtocolToFactoryMap();
    _protocolToFactoryMap.put(AnnotationURIHelper.PROTOCOL, typeProvider);
    return typeProvider;
  }
}
