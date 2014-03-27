package de.cau.cs.se.instrumentation.al.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumentation.al.applicationLang.Model;
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
      System.out.println(("PackageContentScope.getSingleElement(name) " + name));
      TreeIterator<EObject> _eAllContents = this.model.eAllContents();
      Iterator<RegisteredPackage> _filter = Iterators.<RegisteredPackage>filter(_eAllContents, RegisteredPackage.class);
      final Function1<RegisteredPackage,Boolean> _function = new Function1<RegisteredPackage,Boolean>() {
        public Boolean apply(final RegisteredPackage it) {
          String _name = it.getName();
          String _firstSegment = name.getFirstSegment();
          return Boolean.valueOf(_name.equals(_firstSegment));
        }
      };
      final RegisteredPackage registeredPackage = IteratorExtensions.<RegisteredPackage>findFirst(_filter, _function);
      IEObjectDescription _xifexpression = null;
      boolean _notEquals = (!Objects.equal(registeredPackage, null));
      if (_notEquals) {
        EPackage _ePackage = registeredPackage.getEPackage();
        QualifiedName _skipFirst = name.skipFirst(1);
        _xifexpression = this.findClassifierInPackageHierarchy(_ePackage, _skipFirst);
      } else {
        return null;
      }
      _xblockexpression = _xifexpression;
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
          return Boolean.valueOf(_name.equals(_firstSegment));
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
        return Boolean.valueOf(_name.equals(_firstSegment));
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
    if ((classifier instanceof EClass)) {
      final EClass class_ = ((EClass) classifier);
      EList<EAttribute> _eAllAttributes = class_.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
        public Boolean apply(final EAttribute it) {
          String _name = it.getName();
          String _firstSegment = name.getFirstSegment();
          return Boolean.valueOf(_name.equals(_firstSegment));
        }
      };
      final EAttribute attribute = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function);
      boolean _equals = Objects.equal(attribute, null);
      if (_equals) {
        EList<EReference> _eAllReferences = class_.getEAllReferences();
        final Function1<EReference,Boolean> _function_1 = new Function1<EReference,Boolean>() {
          public Boolean apply(final EReference it) {
            String _name = it.getName();
            String _firstSegment = name.getFirstSegment();
            return Boolean.valueOf(_name.equals(_firstSegment));
          }
        };
        final EReference reference = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_1);
        boolean _notEquals = (!Objects.equal(reference, null));
        if (_notEquals) {
          int _segmentCount = name.getSegmentCount();
          boolean _greaterThan = (_segmentCount > 1);
          if (_greaterThan) {
            EClass _eReferenceType = reference.getEReferenceType();
            QualifiedName _skipFirst = name.skipFirst(1);
            return this.findPropertyInClassifier(_eReferenceType, _skipFirst);
          } else {
            return EObjectDescription.create(name, reference);
          }
        } else {
          return null;
        }
      } else {
        return EObjectDescription.create(name, attribute);
      }
    } else {
      return null;
    }
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.xtext.naming.QualifiedName)
   */
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println(("PackageContentScope.getElements(name) " + name));
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.emf.ecore.EObject)
   */
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println(("PackageContentScope.getSingleElement(object) " + object));
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.emf.ecore.EObject)
   */
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println(("PackageContentScope.getElements(object) " + object));
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
