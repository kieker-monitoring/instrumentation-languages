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
package de.cau.cs.se.instrumentation.al.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Scope for an EPackage.
 * 
 * @author Reiner Jung
 */
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
    String _string = name.toString();
    final URI ePackageURI = URI.createURI(_string, true);
    final URI plainPackageURI = ePackageURI.trimFragment();
    final String fragment = ePackageURI.fragment();
    Resource resource = this.resourceSet.getResource(plainPackageURI, true);
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EObject> _contents_1 = resource.getContents();
      EObject _get = _contents_1.get(0);
      EPackage ePackage = ((EPackage) _get);
      boolean _notEquals = (!Objects.equal(fragment, null));
      if (_notEquals) {
        String[] list = fragment.split(".");
        EList<EPackage> _eSubpackages = ePackage.getESubpackages();
        QualifiedName _xifexpression = null;
        final String[] _converted_list = (String[])list;
        boolean _isEmpty_1 = ((List<String>)Conversions.doWrapArray(_converted_list)).isEmpty();
        if (_isEmpty_1) {
          QualifiedName _create = QualifiedName.create(fragment);
          _xifexpression = _create;
        } else {
          QualifiedName _create_1 = QualifiedName.create(list);
          _xifexpression = _create_1;
        }
        EPackage _findPackage = this.findPackage(_eSubpackages, _xifexpression);
        ePackage = _findPackage;
      }
      boolean _notEquals_1 = (!Objects.equal(ePackage, null));
      if (_notEquals_1) {
        return EObjectDescription.create(name, ePackage);
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
  
  public EPackage findPackage(final EList<EPackage> ePackages, final QualifiedName qualifiedPackageName) {
    final String packageName = qualifiedPackageName.getFirstSegment();
    final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
      public Boolean apply(final EPackage it) {
        String _name = it.getName();
        boolean _equals = _name.equals(packageName);
        return Boolean.valueOf(_equals);
      }
    };
    final EPackage ePackage = IterableExtensions.<EPackage>findFirst(ePackages, _function);
    boolean _notEquals = (!Objects.equal(ePackage, null));
    if (_notEquals) {
      int _segmentCount = qualifiedPackageName.getSegmentCount();
      boolean _greaterThan = (_segmentCount > 1);
      if (_greaterThan) {
        EList<EPackage> _eSubpackages = ePackage.getESubpackages();
        QualifiedName _skipFirst = qualifiedPackageName.skipFirst(1);
        return this.findPackage(_eSubpackages, _skipFirst);
      } else {
        return ePackage;
      }
    } else {
      return null;
    }
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    String _plus = ("EPackageScope.getElements(name) " + name);
    System.out.println(_plus);
    ArrayList<IEObjectDescription> _arrayList = new ArrayList<IEObjectDescription>();
    final Collection<IEObjectDescription> result = _arrayList;
    IEObjectDescription _singleElement = this.getSingleElement(name);
    result.add(_singleElement);
    return result;
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    String _plus = ("EPackageScope.getSingleElement(object) " + object);
    System.out.println(_plus);
    return null;
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    String _plus = ("EPackageScope.getElements(object) " + object);
    System.out.println(_plus);
    ArrayList<IEObjectDescription> _arrayList = new ArrayList<IEObjectDescription>();
    final Collection<IEObjectDescription> result = _arrayList;
    IEObjectDescription _singleElement = this.getSingleElement(object);
    result.add(_singleElement);
    return result;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("EPackageScope.getAllElements()");
    ArrayList<IEObjectDescription> _arrayList = new ArrayList<IEObjectDescription>();
    final Collection<IEObjectDescription> result = _arrayList;
    return result;
  }
}
