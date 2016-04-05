/**
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kieker.tools.al.scoping;

import com.google.common.base.Objects;
import kieker.tools.al.aspectLang.AspectModel;
import org.eclipse.emf.common.util.EList;
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

/**
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class PackageContentScope implements IScope {
  /**
   * Main aspect model.
   */
  private AspectModel model;
  
  /**
   * Resource set containing all resources of named in the model.
   */
  private ResourceSet resourceSet;
  
  /**
   * Create a new package content scope.
   * 
   * @param resourceSet the resource set
   * @param model the aspect model
   */
  public PackageContentScope(final ResourceSet resourceSet, final AspectModel model) {
    this.model = model;
    this.resourceSet = resourceSet;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.xtext.naming.QualifiedName)
   */
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    System.out.println(("PackageContentScope.getSingleElement(name) " + name));
    return null;
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
      final Function1<EPackage, Boolean> _function = (EPackage it) -> {
        String _name = it.getName();
        String _firstSegment = name.getFirstSegment();
        return Boolean.valueOf(_name.equals(_firstSegment));
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
    final Function1<EClassifier, Boolean> _function = (EClassifier it) -> {
      String _name = it.getName();
      String _firstSegment = name.getFirstSegment();
      return Boolean.valueOf(_name.equals(_firstSegment));
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
      final EClass clazz = ((EClass) classifier);
      EList<EAttribute> _eAllAttributes = clazz.getEAllAttributes();
      final Function1<EAttribute, Boolean> _function = (EAttribute it) -> {
        String _name = it.getName();
        String _firstSegment = name.getFirstSegment();
        return Boolean.valueOf(_name.equals(_firstSegment));
      };
      final EAttribute attribute = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function);
      boolean _equals = Objects.equal(attribute, null);
      if (_equals) {
        EList<EReference> _eAllReferences = clazz.getEAllReferences();
        final Function1<EReference, Boolean> _function_1 = (EReference it) -> {
          String _name = it.getName();
          String _firstSegment = name.getFirstSegment();
          return Boolean.valueOf(_name.equals(_firstSegment));
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
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println(("PackageContentScope.getElements(name) " + name));
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.emf.ecore.EObject)
   */
  @Override
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println(("PackageContentScope.getSingleElement(object) " + object));
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.emf.ecore.EObject)
   */
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println(("PackageContentScope.getElements(object) " + object));
    return null;
  }
  
  /**
   * (non-Javadoc)
   * @see org.eclipse.xtext.scoping.IScope#getAllElements()
   */
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("PackageContentScope.getAllElements()");
    return null;
  }
}
