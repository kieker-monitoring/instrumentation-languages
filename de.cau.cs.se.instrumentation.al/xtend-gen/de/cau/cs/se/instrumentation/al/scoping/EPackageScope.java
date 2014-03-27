package de.cau.cs.se.instrumentation.al.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

@SuppressWarnings("all")
public class EPackageScope implements IScope {
  private ResourceSet resourceSet;
  
  /**
   * Create a new EPackageScope in the context of a resource set.
   * 
   * @param resourceSet the resource set where the packages should be searched for.
   */
  public EPackageScope(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    System.out.println(("EPackageScope.getSingleElement(name) " + name));
    String _string = name.toString();
    final URI ePackageURI = URI.createURI(_string, true);
    EPackage ePackage = null;
    String _fragment = ePackageURI.fragment();
    boolean _equals = Objects.equal(_fragment, null);
    if (_equals) {
      Resource resource = this.resourceSet.getResource(ePackageURI, true);
      EList<EObject> _contents = resource.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        return null;
      } else {
        EList<EObject> _contents_1 = resource.getContents();
        EObject _get = _contents_1.get(0);
        ePackage = ((EPackage) _get);
      }
    } else {
      EObject _eObject = this.resourceSet.getEObject(ePackageURI, true);
      ePackage = ((EPackage) _eObject);
    }
    return EObjectDescription.create(name, ePackage);
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println(("EPackageScope.getElements(name) " + name));
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    IEObjectDescription _singleElement = this.getSingleElement(name);
    result.add(_singleElement);
    return result;
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println(("EPackageScope.getSingleElement(object) " + object));
    return null;
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println(("EPackageScope.getElements(object) " + object));
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    IEObjectDescription _singleElement = this.getSingleElement(object);
    result.add(_singleElement);
    return result;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("EPackageScope.getAllElements()");
    final Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
    return result;
  }
}
