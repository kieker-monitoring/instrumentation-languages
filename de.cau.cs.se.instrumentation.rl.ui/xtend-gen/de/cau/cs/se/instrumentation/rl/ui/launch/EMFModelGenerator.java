package de.cau.cs.se.instrumentation.rl.ui.launch;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.util.Iterator;
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

@SuppressWarnings("all")
public class EMFModelGenerator {
  private ResourceSet resourceSet;
  
  private EcoreFactory factory = EcoreFactory.eINSTANCE;
  
  /**
   * Constructor.
   */
  public EMFModelGenerator(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  public void doGenerate(final IFile file, final Resource destination) {
    IPath _fullPath = file.getFullPath();
    String _portableString = _fullPath.toPortableString();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_portableString, true);
    final Resource source = this.resourceSet.getResource(_createPlatformResourceURI, true);
    TreeIterator<EObject> _allContents = source.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    final Procedure1<Model> _function = new Procedure1<Model>() {
      public void apply(final Model type) {
        EMFModelGenerator.this.composePackageHierarchy(type, destination);
      }
    };
    IteratorExtensions.<Model>forEach(_filter, _function);
    TreeIterator<EObject> _allContents_1 = source.getAllContents();
    Iterator<PartialRecordType> _filter_1 = Iterators.<PartialRecordType>filter(_allContents_1, PartialRecordType.class);
    final Procedure1<PartialRecordType> _function_1 = new Procedure1<PartialRecordType>() {
      public void apply(final PartialRecordType type) {
        EClass _composeInterface = EMFModelGenerator.this.composeInterface(type, destination);
        EObject _eContainer = type.eContainer();
        String _name = ((Model) _eContainer).getName();
        EMFModelGenerator.this.insert(destination, _composeInterface, _name);
      }
    };
    IteratorExtensions.<PartialRecordType>forEach(_filter_1, _function_1);
    TreeIterator<EObject> _allContents_2 = source.getAllContents();
    Iterator<RecordType> _filter_2 = Iterators.<RecordType>filter(_allContents_2, RecordType.class);
    final Procedure1<RecordType> _function_2 = new Procedure1<RecordType>() {
      public void apply(final RecordType type) {
        EClass _composeClass = EMFModelGenerator.this.composeClass(type, destination);
        EObject _eContainer = type.eContainer();
        String _name = ((Model) _eContainer).getName();
        EMFModelGenerator.this.insert(destination, _composeClass, _name);
      }
    };
    IteratorExtensions.<RecordType>forEach(_filter_2, _function_2);
  }
  
  /**
   * Check if a package hierarchy exists for the given model and if not
   * add one to the hierarchy. For all root packages add that to the resource
   */
  public void composePackageHierarchy(final Model model, final Resource resource) {
    String _name = model.getName();
    final String[] modelName = _name.split("\\.");
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Procedure1<EPackage> _function = new Procedure1<EPackage>() {
      public void apply(final EPackage p) {
        String _name = p.getName();
        Object _get = modelName[0];
        boolean _equals = _name.equals(_get);
        if (_equals) {
          Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(modelName)));
          EMFModelGenerator.this.checkChildPackages(_tail, p);
        }
      }
    };
    IterableExtensions.<EPackage>forEach(_filter, _function);
    EList<EObject> _contents_1 = resource.getContents();
    Iterable<EPackage> _filter_1 = Iterables.<EPackage>filter(_contents_1, EPackage.class);
    final Function1<EPackage,Boolean> _function_1 = new Function1<EPackage,Boolean>() {
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
    final Procedure1<EPackage> _function = new Procedure1<EPackage>() {
      public void apply(final EPackage p) {
        String _name = p.getName();
        boolean _equals = _name.equals(nodeName);
        if (_equals) {
          EMFModelGenerator.this.checkChildPackages(tailList, p);
        }
      }
    };
    IterableExtensions.<EPackage>forEach(_eSubpackages, _function);
    EList<EPackage> _eSubpackages_1 = parent.getESubpackages();
    final Function1<EPackage,Boolean> _function_1 = new Function1<EPackage,Boolean>() {
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
  
  public void insert(final Resource resource, final EClassifier classifier, final String packageName) {
    final String[] packagePath = packageName.split("\\.");
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
      public Boolean apply(final EPackage it) {
        String _get = packagePath[0];
        String _name = it.getName();
        return Boolean.valueOf(_get.equals(_name));
      }
    };
    EPackage _findFirst = IterableExtensions.<EPackage>findFirst(_filter, _function);
    Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(packagePath)));
    this.findAndinsert(_findFirst, classifier, _tail);
  }
  
  public void findAndinsert(final EPackage pkg, final EClassifier classifier, final Iterable<String> packagePath) {
    boolean _isEmpty = IterableExtensions.isEmpty(packagePath);
    if (_isEmpty) {
      EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
      _eClassifiers.add(classifier);
    } else {
      EList<EPackage> _eSubpackages = pkg.getESubpackages();
      final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
        public Boolean apply(final EPackage it) {
          String _get = ((String[])Conversions.unwrapArray(packagePath, String.class))[0];
          String _name = it.getName();
          return Boolean.valueOf(_get.equals(_name));
        }
      };
      EPackage _findFirst = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function);
      Iterable<String> _tail = IterableExtensions.<String>tail(packagePath);
      this.findAndinsert(_findFirst, classifier, _tail);
    }
  }
  
  /**
   * Compose an EMF class for the given record type.
   */
  public EClass composeClass(final RecordType type, final Resource resource) {
    final EClass clazz = this.factory.createEClass();
    String _name = type.getName();
    clazz.setName(_name);
    boolean _isAbstract = type.isAbstract();
    clazz.setAbstract(_isAbstract);
    clazz.setInterface(false);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      EList<EClass> _eSuperTypes = clazz.getESuperTypes();
      RecordType _parent_1 = type.getParent();
      EClass _findResultClass = this.findResultClass(_parent_1, resource);
      _eSuperTypes.add(_findResultClass);
    }
    EList<PartialRecordType> _parents = type.getParents();
    boolean _isEmpty = _parents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<PartialRecordType> _parents_1 = type.getParents();
      final Procedure1<PartialRecordType> _function = new Procedure1<PartialRecordType>() {
        public void apply(final PartialRecordType iface) {
          EList<EClass> _eSuperTypes = clazz.getESuperTypes();
          EClass _findResultClass = EMFModelGenerator.this.findResultClass(iface, resource);
          _eSuperTypes.add(_findResultClass);
        }
      };
      IterableExtensions.<PartialRecordType>forEach(_parents_1, _function);
    }
    EList<Property> _properties = type.getProperties();
    final Procedure1<Property> _function_1 = new Procedure1<Property>() {
      public void apply(final Property property) {
        EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
        EAttribute _composeProperty = EMFModelGenerator.this.composeProperty(property);
        _eStructuralFeatures.add(_composeProperty);
      }
    };
    IterableExtensions.<Property>forEach(_properties, _function_1);
    return clazz;
  }
  
  public EAttribute composeProperty(final Property property) {
    final EAttribute attribute = this.factory.createEAttribute();
    String _name = property.getName();
    attribute.setName(_name);
    String _name_1 = property.getName();
    String _plus = (" attribute " + _name_1);
    System.out.println(_plus);
    Classifier _type = property.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      Classifier _type_1 = property.getType();
      EClassifier _class_ = _type_1.getClass_();
      boolean _notEquals_1 = (!Objects.equal(_class_, null));
      if (_notEquals_1) {
        Classifier _type_2 = property.getType();
        EClassifier _class__1 = _type_2.getClass_();
        String _name_2 = _class__1.getName();
        EDataType _mapToEMfLiteral = this.getMapToEMfLiteral(_name_2);
        attribute.setEType(_mapToEMfLiteral);
      }
    }
    return attribute;
  }
  
  public EDataType getMapToEMfLiteral(final String name) {
    EDataType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(name,"byte")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EBYTE;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"short")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ESHORT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"int")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EINT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"long")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ELONG;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"float")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EFLOAT;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"double")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EDOUBLE;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"string")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.ESTRING;
      }
    }
    if (!_matched) {
      if (Objects.equal(name,"boolean")) {
        _matched=true;
        _switchResult = EcorePackage.Literals.EBOOLEAN;
      }
    }
    if (!_matched) {
      _switchResult = EcorePackage.Literals.EBOOLEAN;
    }
    return _switchResult;
  }
  
  /**
   * Search for a class in the resource specified by the record type.
   */
  public EClass findResultClass(final Type type, final Resource resource) {
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    final String[] packagePath = _name.split("\\.");
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
      public Boolean apply(final EPackage p) {
        String _name = p.getName();
        Object _get = packagePath[0];
        return Boolean.valueOf(_name.equals(_get));
      }
    };
    final EPackage pkg = IterableExtensions.<EPackage>findFirst(_filter, _function);
    Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(packagePath)));
    return this.findResultClass(type, pkg, _tail);
  }
  
  public EClass findResultClass(final Type type, final EPackage pkg, final Iterable<String> packagePath) {
    boolean _isEmpty = IterableExtensions.isEmpty(packagePath);
    if (_isEmpty) {
      EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
      final Function1<EClassifier,Boolean> _function = new Function1<EClassifier,Boolean>() {
        public Boolean apply(final EClassifier clazz) {
          String _name = clazz.getName();
          String _name_1 = type.getName();
          return Boolean.valueOf(_name.equals(_name_1));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function);
      return ((EClass) _findFirst);
    } else {
      EList<EPackage> _eSubpackages = pkg.getESubpackages();
      final Function1<EPackage,Boolean> _function_1 = new Function1<EPackage,Boolean>() {
        public Boolean apply(final EPackage p) {
          String _name = p.getName();
          Object _get = ((Object[])Conversions.unwrapArray(packagePath, Object.class))[0];
          return Boolean.valueOf(_name.equals(_get));
        }
      };
      final EPackage subpkg = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function_1);
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
  public EClass composeInterface(final PartialRecordType type, final Resource resource) {
    final EClass clazz = this.factory.createEClass();
    String _name = type.getName();
    clazz.setName(_name);
    clazz.setInterface(true);
    clazz.setAbstract(true);
    return clazz;
  }
}
