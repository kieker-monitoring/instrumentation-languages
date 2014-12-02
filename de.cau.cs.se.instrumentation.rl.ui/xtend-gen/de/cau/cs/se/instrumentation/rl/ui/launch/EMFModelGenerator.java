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
package de.cau.cs.se.instrumentation.rl.ui.launch;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.util.Iterator;
import java.util.function.Consumer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Provides an example generator for EMF models out of IRL specification.
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class EMFModelGenerator {
  private final static String SERVICE_PACKAGE = "kieker.common.model";
  
  private final static String KIEKER_ROOT_PACKAGE = "kieker.common.record";
  
  private final static String KIEKER_ROOT_RECORD = "AbstractMonitoringRecord";
  
  private ResourceSet resourceSet;
  
  private EcoreFactory factory = EcoreFactory.eINSTANCE;
  
  private EClass abstractRecordClass;
  
  /**
   * Constructor.
   */
  public EMFModelGenerator(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  /**
   * Primary generation method.
   * 
   * @param file the IRL file to be interpreted
   * @param destination the EMF model resource
   */
  public void doGenerate(final IFile file, final Resource destination) {
    IPath _fullPath = file.getFullPath();
    String _portableString = _fullPath.toPortableString();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_portableString, true);
    final Resource source = this.resourceSet.getResource(_createPlatformResourceURI, true);
    String[] _split = EMFModelGenerator.KIEKER_ROOT_PACKAGE.split("\\.");
    this.composePackageHierarchy(_split, destination);
    String[] _split_1 = EMFModelGenerator.SERVICE_PACKAGE.split("\\.");
    this.composePackageHierarchy(_split_1, destination);
    TreeIterator<EObject> _allContents = source.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    final Procedure1<Model> _function = new Procedure1<Model>() {
      public void apply(final Model type) {
        EMFModelGenerator.this.composePackageHierarchy(type, destination);
      }
    };
    IteratorExtensions.<Model>forEach(_filter, _function);
    EClass _createAbstractRecordClass = this.createAbstractRecordClass();
    this.insert(destination, _createAbstractRecordClass, EMFModelGenerator.KIEKER_ROOT_PACKAGE);
    EPackage _findPackage = this.findPackage(destination, EMFModelGenerator.KIEKER_ROOT_PACKAGE);
    EList<EClassifier> _eClassifiers = _findPackage.getEClassifiers();
    final Function1<EClassifier, Boolean> _function_1 = new Function1<EClassifier, Boolean>() {
      public Boolean apply(final EClassifier it) {
        String _name = it.getName();
        return Boolean.valueOf(EMFModelGenerator.KIEKER_ROOT_RECORD.equals(_name));
      }
    };
    EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function_1);
    this.abstractRecordClass = ((EClass) _findFirst);
    EClass _createContainmentClass = this.createContainmentClass();
    this.insert(destination, _createContainmentClass, EMFModelGenerator.SERVICE_PACKAGE);
    TreeIterator<EObject> _allContents_1 = source.getAllContents();
    Iterator<TemplateType> _filter_1 = Iterators.<TemplateType>filter(_allContents_1, TemplateType.class);
    final Procedure1<TemplateType> _function_2 = new Procedure1<TemplateType>() {
      public void apply(final TemplateType type) {
        EClass _createInterface = EMFModelGenerator.this.createInterface(type);
        EObject _eContainer = type.eContainer();
        String _name = ((Model) _eContainer).getName();
        EMFModelGenerator.this.insert(destination, _createInterface, _name);
      }
    };
    IteratorExtensions.<TemplateType>forEach(_filter_1, _function_2);
    TreeIterator<EObject> _allContents_2 = source.getAllContents();
    Iterator<RecordType> _filter_2 = Iterators.<RecordType>filter(_allContents_2, RecordType.class);
    final Procedure1<RecordType> _function_3 = new Procedure1<RecordType>() {
      public void apply(final RecordType type) {
        EClass _createClass = EMFModelGenerator.this.createClass(type);
        EObject _eContainer = type.eContainer();
        String _name = ((Model) _eContainer).getName();
        EMFModelGenerator.this.insert(destination, _createClass, _name);
      }
    };
    IteratorExtensions.<RecordType>forEach(_filter_2, _function_3);
    TreeIterator<EObject> _allContents_3 = source.getAllContents();
    Iterator<TemplateType> _filter_3 = Iterators.<TemplateType>filter(_allContents_3, TemplateType.class);
    final Procedure1<TemplateType> _function_4 = new Procedure1<TemplateType>() {
      public void apply(final TemplateType type) {
        EMFModelGenerator.this.composeInterface(type, destination);
      }
    };
    IteratorExtensions.<TemplateType>forEach(_filter_3, _function_4);
    TreeIterator<EObject> _allContents_4 = source.getAllContents();
    Iterator<RecordType> _filter_4 = Iterators.<RecordType>filter(_allContents_4, RecordType.class);
    final Procedure1<RecordType> _function_5 = new Procedure1<RecordType>() {
      public void apply(final RecordType type) {
        EMFModelGenerator.this.composeClass(type, destination);
      }
    };
    IteratorExtensions.<RecordType>forEach(_filter_4, _function_5);
  }
  
  /**
   * Create the abstract record of Kieker which is hidden from IRL.
   */
  public EClass createAbstractRecordClass() {
    final EClass clazz = this.factory.createEClass();
    clazz.setName(EMFModelGenerator.KIEKER_ROOT_RECORD);
    clazz.setAbstract(true);
    clazz.setInterface(false);
    final EAttribute attribute = this.factory.createEAttribute();
    attribute.setName("loggingTimestamp");
    EDataType _mapToEMFLiteral = this.getMapToEMFLiteral("long");
    attribute.setEType(_mapToEMFLiteral);
    EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
    _eStructuralFeatures.add(attribute);
    return clazz;
  }
  
  public EClass createContainmentClass() {
    final EClass clazz = this.factory.createEClass();
    clazz.setName("MonitoringModel");
    clazz.setAbstract(false);
    clazz.setInterface(false);
    final EReference reference = this.factory.createEReference();
    reference.setName("data");
    reference.setEType(this.abstractRecordClass);
    reference.setContainment(true);
    reference.setLowerBound(0);
    reference.setUpperBound((-1));
    reference.setOrdered(true);
    EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
    _eStructuralFeatures.add(reference);
    return clazz;
  }
  
  /**
   * Check if a package hierarchy exists for the given model and if not
   * add one to the hierarchy. For all root packages add that to the resource
   */
  public void composePackageHierarchy(final Model model, final Resource resource) {
    String _name = model.getName();
    final String[] modelName = _name.split("\\.");
    this.composePackageHierarchy(modelName, resource);
  }
  
  public void composePackageHierarchy(final String[] modelName, final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Consumer<EPackage> _function = new Consumer<EPackage>() {
      public void accept(final EPackage p) {
        String _name = p.getName();
        Object _get = modelName[0];
        boolean _equals = _name.equals(_get);
        if (_equals) {
          Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(modelName)));
          EMFModelGenerator.this.checkChildPackages(_tail, p);
        }
      }
    };
    _filter.forEach(_function);
    EList<EObject> _contents_1 = resource.getContents();
    Iterable<EPackage> _filter_1 = Iterables.<EPackage>filter(_contents_1, EPackage.class);
    final Function1<EPackage, Boolean> _function_1 = new Function1<EPackage, Boolean>() {
      public Boolean apply(final EPackage p) {
        String _name = p.getName();
        Object _get = modelName[0];
        return Boolean.valueOf(_name.equals(_get));
      }
    };
    boolean _exists = IterableExtensions.<EPackage>exists(_filter_1, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      String _get = modelName[0];
      final EPackage rootNode = this.composePackage(_get, "http://www.kieker-monitoring.net");
      Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(modelName)));
      this.createPackageChain(_tail, rootNode);
      EList<EObject> _contents_2 = resource.getContents();
      _contents_2.add(rootNode);
    }
  }
  
  /**
   * Check recursively if all child packages exist. If not create.
   */
  public void checkChildPackages(final Iterable<String> modelName, final EPackage parent) {
    boolean _isEmpty = IterableExtensions.isEmpty(modelName);
    if (_isEmpty) {
      return;
    }
    final String nodeName = ((String[])Conversions.unwrapArray(modelName, String.class))[0];
    final Iterable<String> tailList = IterableExtensions.<String>tail(modelName);
    EList<EPackage> _eSubpackages = parent.getESubpackages();
    final Consumer<EPackage> _function = new Consumer<EPackage>() {
      public void accept(final EPackage p) {
        String _name = p.getName();
        boolean _equals = _name.equals(nodeName);
        if (_equals) {
          EMFModelGenerator.this.checkChildPackages(tailList, p);
        }
      }
    };
    _eSubpackages.forEach(_function);
    EList<EPackage> _eSubpackages_1 = parent.getESubpackages();
    final Function1<EPackage, Boolean> _function_1 = new Function1<EPackage, Boolean>() {
      public Boolean apply(final EPackage p) {
        String _name = p.getName();
        return Boolean.valueOf(_name.equals(nodeName));
      }
    };
    boolean _exists = IterableExtensions.<EPackage>exists(_eSubpackages_1, _function_1);
    boolean _not = (!_exists);
    if (_not) {
      this.createPackageChain(modelName, parent);
    }
  }
  
  /**
   * Compose a package based on a name and the parent package URI.
   */
  public EPackage composePackage(final String name, final String parentURI) {
    final EPackage p = this.factory.createEPackage();
    p.setName(name);
    p.setNsPrefix(name);
    p.setNsURI(((parentURI + "/") + name));
    return p;
  }
  
  /**
   * Create a package chain.
   */
  public void createPackageChain(final Iterable<String> modelName, final EPackage parent) {
    EPackage p = parent;
    for (final String nodeName : modelName) {
      {
        String _nsURI = p.getNsURI();
        final EPackage subPackage = this.composePackage(nodeName, _nsURI);
        EList<EPackage> _eSubpackages = p.getESubpackages();
        _eSubpackages.add(subPackage);
        p = subPackage;
      }
    }
  }
  
  /**
   * Insert classifier into a package.
   */
  public void insert(final Resource resource, final EClassifier classifier, final String packageName) {
    final EPackage pkg = this.findPackage(resource, packageName);
    EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
    final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
      public Boolean apply(final EClassifier it) {
        String _name = it.getName();
        String _name_1 = classifier.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      }
    };
    boolean _exists = IterableExtensions.<EClassifier>exists(_eClassifiers, _function);
    boolean _not = (!_exists);
    if (_not) {
      EList<EClassifier> _eClassifiers_1 = pkg.getEClassifiers();
      _eClassifiers_1.add(classifier);
    }
  }
  
  /**
   * Find the correct nested package.
   */
  public EPackage findPackage(final Resource resource, final String packageName) {
    final String[] packagePath = packageName.split("\\.");
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Function1<EPackage, Boolean> _function = new Function1<EPackage, Boolean>() {
      public Boolean apply(final EPackage it) {
        String _get = packagePath[0];
        String _name = it.getName();
        return Boolean.valueOf(_get.equals(_name));
      }
    };
    EPackage _findFirst = IterableExtensions.<EPackage>findFirst(_filter, _function);
    Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(packagePath)));
    return this.findPackage(_findFirst, _tail);
  }
  
  /**
   * Find the correct nested package.
   */
  public EPackage findPackage(final EPackage parent, final Iterable<String> packagePath) {
    boolean _isEmpty = IterableExtensions.isEmpty(packagePath);
    if (_isEmpty) {
      return parent;
    } else {
      EList<EPackage> _eSubpackages = parent.getESubpackages();
      final Function1<EPackage, Boolean> _function = new Function1<EPackage, Boolean>() {
        public Boolean apply(final EPackage it) {
          String _get = ((String[])Conversions.unwrapArray(packagePath, String.class))[0];
          String _name = it.getName();
          return Boolean.valueOf(_get.equals(_name));
        }
      };
      EPackage _findFirst = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function);
      Iterable<String> _tail = IterableExtensions.<String>tail(packagePath);
      return this.findPackage(_findFirst, _tail);
    }
  }
  
  /**
   * Search for a class in the resource specified by the record type.
   */
  public EClass findResultClass(final Type type, final Resource resource) {
    System.err.println(("findResultClass2: type " + type));
    System.err.println(("findResultClass2:   resource " + resource));
    String _name = type.getName();
    String _plus = ("findResultClass2: name " + _name);
    System.err.println(_plus);
    String _name_1 = type.getName();
    boolean _notEquals = (!Objects.equal(_name_1, null));
    if (_notEquals) {
      EObject _eContainer = type.eContainer();
      String _plus_1 = ("findResultClass2: parent " + _eContainer);
      System.err.println(_plus_1);
      EObject _eContainer_1 = type.eContainer();
      String _name_2 = ((Model) _eContainer_1).getName();
      String _plus_2 = ("findResultClass2: parent name " + _name_2);
      System.err.println(_plus_2);
      EObject _eContainer_2 = type.eContainer();
      String _name_3 = ((Model) _eContainer_2).getName();
      final String[] packagePath = _name_3.split("\\.");
      EList<EObject> _contents = resource.getContents();
      Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
      final Function1<EPackage, Boolean> _function = new Function1<EPackage, Boolean>() {
        public Boolean apply(final EPackage p) {
          String _name = p.getName();
          Object _get = packagePath[0];
          return Boolean.valueOf(_name.equals(_get));
        }
      };
      final EPackage pkg = IterableExtensions.<EPackage>findFirst(_filter, _function);
      Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(packagePath)));
      return this.findResultClass(type, pkg, _tail);
    } else {
      return null;
    }
  }
  
  public EClass findResultClass(final Type type, final EPackage pkg, final Iterable<String> packagePath) {
    boolean _isEmpty = IterableExtensions.isEmpty(packagePath);
    if (_isEmpty) {
      System.err.println(("findResultClass3: type " + type));
      String _name = type.getName();
      String _plus = ("findResultClass3: type name " + _name);
      System.err.println(_plus);
      System.err.println(("findResultClass3: package " + pkg));
      EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
      String _plus_1 = ("findResultClass3: package classifiers " + _eClassifiers);
      System.err.println(_plus_1);
      EList<EClassifier> _eClassifiers_1 = pkg.getEClassifiers();
      final Consumer<EClassifier> _function = new Consumer<EClassifier>() {
        public void accept(final EClassifier clazz) {
          System.err.println(("findResultClass3: clazz " + clazz));
          String _name = clazz.getName();
          String _plus = ("findResultClass3: clazz name " + _name);
          System.err.println(_plus);
        }
      };
      _eClassifiers_1.forEach(_function);
      EList<EClassifier> _eClassifiers_2 = pkg.getEClassifiers();
      final Function1<EClassifier, Boolean> _function_1 = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier clazz) {
          String _name = clazz.getName();
          String _name_1 = type.getName();
          return Boolean.valueOf(_name.equals(_name_1));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_eClassifiers_2, _function_1);
      return ((EClass) _findFirst);
    } else {
      EList<EPackage> _eSubpackages = pkg.getESubpackages();
      final Function1<EPackage, Boolean> _function_2 = new Function1<EPackage, Boolean>() {
        public Boolean apply(final EPackage p) {
          String _name = p.getName();
          Object _get = ((Object[])Conversions.unwrapArray(packagePath, Object.class))[0];
          return Boolean.valueOf(_name.equals(_get));
        }
      };
      final EPackage subpkg = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function_2);
      boolean _equals = Objects.equal(subpkg, null);
      if (_equals) {
        return null;
      } else {
        Iterable<String> _tail = IterableExtensions.<String>tail(packagePath);
        return this.findResultClass(type, subpkg, _tail);
      }
    }
  }
  
  /**
   * Compose an EMF interface for the given partial record type/template.
   */
  public EClass createInterface(final TemplateType type) {
    final EClass clazz = this.factory.createEClass();
    String _name = type.getName();
    clazz.setName(_name);
    clazz.setInterface(true);
    clazz.setAbstract(true);
    return clazz;
  }
  
  /**
   * Compose an EMF class for the given record type.
   */
  public EClass createClass(final RecordType type) {
    final EClass clazz = this.factory.createEClass();
    String _name = type.getName();
    clazz.setName(_name);
    boolean _isAbstract = type.isAbstract();
    clazz.setAbstract(_isAbstract);
    clazz.setInterface(false);
    return clazz;
  }
  
  /**
   * Complete the interface construction with inheritance and attributes.
   */
  public void composeInterface(final TemplateType type, final Resource resource) {
    final EClass clazz = this.findResultClass(type, resource);
    EList<TemplateType> _parents = type.getParents();
    boolean _isEmpty = _parents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
        public void accept(final TemplateType iface) {
          EList<EClass> _eSuperTypes = clazz.getESuperTypes();
          EClass _findResultClass = EMFModelGenerator.this.findResultClass(iface, resource);
          _eSuperTypes.add(_findResultClass);
        }
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    final Consumer<Property> _function_1 = new Consumer<Property>() {
      public void accept(final Property property) {
        EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
        EAttribute _composeProperty = EMFModelGenerator.this.composeProperty(property);
        EMFModelGenerator.this.addUnique(_eStructuralFeatures, _composeProperty);
      }
    };
    _properties.forEach(_function_1);
  }
  
  /**
   * Complete the class construction with inheritance and attributes.
   */
  public void composeClass(final RecordType type, final Resource resource) {
    final EClass clazz = this.findResultClass(type, resource);
    boolean _notEquals = (!Objects.equal(clazz, null));
    if (_notEquals) {
      RecordType _parent = type.getParent();
      boolean _notEquals_1 = (!Objects.equal(_parent, null));
      if (_notEquals_1) {
        RecordType _parent_1 = type.getParent();
        final EClass superType = this.findResultClass(_parent_1, resource);
        boolean _notEquals_2 = (!Objects.equal(superType, null));
        if (_notEquals_2) {
          EList<EClass> _eSuperTypes = clazz.getESuperTypes();
          _eSuperTypes.add(superType);
        } else {
          return;
        }
      } else {
        EList<EClass> _eSuperTypes_1 = clazz.getESuperTypes();
        _eSuperTypes_1.add(this.abstractRecordClass);
      }
      EList<TemplateType> _parents = type.getParents();
      boolean _isEmpty = _parents.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<TemplateType> _parents_1 = type.getParents();
        final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
          public void accept(final TemplateType iface) {
            EList<EClass> _eSuperTypes = clazz.getESuperTypes();
            EClass _findResultClass = EMFModelGenerator.this.findResultClass(iface, resource);
            _eSuperTypes.add(_findResultClass);
          }
        };
        _parents_1.forEach(_function);
      }
      EList<Property> _properties = type.getProperties();
      final Consumer<Property> _function_1 = new Consumer<Property>() {
        public void accept(final Property property) {
          EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
          EAttribute _composeProperty = EMFModelGenerator.this.composeProperty(property);
          EMFModelGenerator.this.addUnique(_eStructuralFeatures, _composeProperty);
        }
      };
      _properties.forEach(_function_1);
    }
  }
  
  /**
   * Check if a given feature already exists.
   */
  public void addUnique(final EList<EStructuralFeature> list, final EAttribute attribute) {
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature it) {
        String _name = it.getName();
        String _name_1 = attribute.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      }
    };
    boolean _exists = IterableExtensions.<EStructuralFeature>exists(list, _function);
    boolean _not = (!_exists);
    if (_not) {
      list.add(attribute);
    }
  }
  
  /**
   * Create an EMF attribute for a given IRL property.
   */
  public EAttribute composeProperty(final Property property) {
    final EAttribute attribute = this.factory.createEAttribute();
    String _name = property.getName();
    attribute.setName(_name);
    Classifier type = null;
    Classifier _type = property.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      attribute.setDerived(false);
      Classifier _type_1 = property.getType();
      EClassifier _class_ = _type_1.getClass_();
      boolean _notEquals_1 = (!Objects.equal(_class_, null));
      if (_notEquals_1) {
        Classifier _type_2 = property.getType();
        type = _type_2;
      }
    } else {
      attribute.setDerived(true);
      Property originalProperty = property;
      while ((!Objects.equal(originalProperty.getReferTo(), null))) {
        Property _referTo = originalProperty.getReferTo();
        originalProperty = _referTo;
      }
      Classifier _type_3 = originalProperty.getType();
      type = _type_3;
    }
    EClassifier _class__1 = type.getClass_();
    String _name_1 = _class__1.getName();
    EDataType _mapToEMFLiteral = this.getMapToEMFLiteral(_name_1);
    attribute.setEType(_mapToEMFLiteral);
    EList<ArraySize> _sizes = type.getSizes();
    boolean _notEquals_2 = (!Objects.equal(_sizes, null));
    if (_notEquals_2) {
      EList<ArraySize> _sizes_1 = type.getSizes();
      boolean _isEmpty = _sizes_1.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<ArraySize> _sizes_2 = type.getSizes();
        ArraySize _get = _sizes_2.get(0);
        final int size = _get.getSize();
        if ((size == 0)) {
          attribute.setLowerBound(0);
          attribute.setUpperBound((-1));
        } else {
          attribute.setLowerBound(size);
          attribute.setUpperBound(size);
        }
      } else {
        attribute.setLowerBound(1);
        attribute.setUpperBound(1);
      }
    } else {
      attribute.setLowerBound(1);
      attribute.setUpperBound(1);
    }
    return attribute;
  }
  
  public EDataType getMapToEMFLiteral(final String name) {
    EDataType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(name, "byte")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EBYTE;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "short")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ESHORT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "int")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EINT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "long")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ELONG;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "float")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EFLOAT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "double")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EDOUBLE;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "string")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ESTRING;
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "boolean")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EBOOLEAN;
      }
    }
    if (!_matched) {
      _switchResult = EcorePackage.Literals.EBOOLEAN;
    }
    return _switchResult;
  }
}
