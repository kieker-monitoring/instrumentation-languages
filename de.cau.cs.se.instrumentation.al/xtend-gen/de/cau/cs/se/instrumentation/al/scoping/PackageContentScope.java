package de.cau.cs.se.instrumentation.al.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumentation.al.applicationLang.Model;
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class PackageContentScope implements IScope {
  private Model model;
  
  private ResourceSet resourceSet;
  
  public PackageContentScope(final ResourceSet resourceSet, final Model model) {
    System.out.println("PackageContentScope");
    this.model = model;
    this.resourceSet = resourceSet;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.xtext.naming.QualifiedName)
   */
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    IEObjectDescription _xblockexpression = null;
    {
      String _plus = ("PackageContentScope.getSingleElement(name) " + name);
      System.out.println(_plus);
      TreeIterator<EObject> _eAllContents = this.model.eAllContents();
      Iterator<RegisteredPackage> _filter = Iterators.<RegisteredPackage>filter(_eAllContents, RegisteredPackage.class);
      final Function1<RegisteredPackage,Boolean> _function = new Function1<RegisteredPackage,Boolean>() {
        public Boolean apply(final RegisteredPackage it) {
          String _name = it.getName();
          String _firstSegment = name.getFirstSegment();
          boolean _equals = _name.equals(_firstSegment);
          return Boolean.valueOf(_equals);
        }
      };
      final RegisteredPackage registeredPackage = IteratorExtensions.<RegisteredPackage>findFirst(_filter, _function);
      IEObjectDescription _xifexpression = null;
      boolean _notEquals = (!Objects.equal(registeredPackage, null));
      if (_notEquals) {
        EPackage _ePackage = registeredPackage.getEPackage();
        QualifiedName _skipFirst = name.skipFirst(1);
        IEObjectDescription _findClassifierInPackageHierarchy = this.findClassifierInPackageHierarchy(_ePackage, _skipFirst);
        _xifexpression = _findClassifierInPackageHierarchy;
      } else {
        return null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  /**
   * Find an classifier in a package hierarchy.
   * 
   * @param ePackage the package to be searched in
   * @param name the relative qualified name of an element of the form (EPackage.)*EClassifier(.(EStructuralFeature.)*)?
   * 
   * @returns an IEObjectDescription for a EClassifier, EAttribute or EReference or null if
   * no matching element was found.
   */
  public IEObjectDescription findClassifierInPackageHierarchy(final EPackage ePackage, final QualifiedName name) {
    int _segmentCount = name.getSegmentCount();
    boolean _equals = (_segmentCount == 1);
    if (_equals) {
      return this.findClassifierInPackage(ePackage, name);
    } else {
      EList<EPackage> _eSubpackages = ePackage.getESubpackages();
      final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
        public Boolean apply(final EPackage it) {
          String _name = it.getName();
          String _firstSegment = name.getFirstSegment();
          boolean _equals = _name.equals(_firstSegment);
          return Boolean.valueOf(_equals);
        }
      };
      final EPackage subPackage = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function);
      boolean _notEquals = (!Objects.equal(subPackage, null));
      if (_notEquals) {
        return this.findClassifierInPackageHierarchy(subPackage, name);
      } else {
        return null;
      }
    }
  }
  
  /**
   * Find a classifier for the given relative qualified name in the given package.
   * 
   * @param ePackage the package to be searched in
   * @param name the name of the classifier or a name starting with a classifier
   * 
   * @returns an IEObjectDescription for a EClassifier, EAttribute or EReference or null if
   * no matching element was found.
   */
  public IEObjectDescription findClassifierInPackage(final EPackage pkg, final QualifiedName name) {
    EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
    final Function1<EClassifier,Boolean> _function = new Function1<EClassifier,Boolean>() {
      public Boolean apply(final EClassifier it) {
        String _name = it.getName();
        String _firstSegment = name.getFirstSegment();
        boolean _equals = _name.equals(_firstSegment);
        return Boolean.valueOf(_equals);
      }
    };
    final EClassifier classifier = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function);
    boolean _notEquals = (!Objects.equal(classifier, null));
    if (_notEquals) {
      int _segmentCount = name.getSegmentCount();
      boolean _equals = (_segmentCount == 1);
      if (_equals) {
        return EObjectDescription.create(name, classifier);
      } else {
        QualifiedName _skipFirst = name.skipFirst(1);
        return this.findPropertyInClassifier(classifier, _skipFirst);
      }
    } else {
      return null;
    }
  }
  
  /**
   * Find a attribute or reference of a classifier, actually in a class, as EDataType does
   * not have properties.
   * 
   * @param classifier the classifier to be searched in
   * @param name the qualified name to be used to match
   * 
   * @returns either an EReference or an EAttribute
   */
  public IEObjectDescription findPropertyInClassifier(final EClassifier classifier, final QualifiedName name) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'class\'"
      + "\nThe method or field class is undefined for the type PackageContentScope"
      + "\nThe method EAllAttributes is undefined for the type PackageContentScope"
      + "\nThe method name is undefined for the type PackageContentScope"
      + "\nThe method EAllReferences is undefined for the type PackageContentScope"
      + "\nThe method name is undefined for the type PackageContentScope"
      + "\nValue must be initialized"
      + "\nType cannot be derived"
      + "\nfindFirst cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n== cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nEReferenceType cannot be resolved");
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.xtext.naming.QualifiedName)
   */
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    String _plus = ("PackageContentScope.getElements(name) " + name);
    System.out.println(_plus);
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.emf.ecore.EObject)
   */
  public IEObjectDescription getSingleElement(final EObject object) {
    String _plus = ("PackageContentScope.getSingleElement(object) " + object);
    System.out.println(_plus);
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.emf.ecore.EObject)
   */
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    String _plus = ("PackageContentScope.getElements(object) " + object);
    System.out.println(_plus);
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getAllElements()
   */
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("PackageContentScope.getAllElements()");
    return null;
  }
}
