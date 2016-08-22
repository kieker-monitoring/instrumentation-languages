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
package kieker.develop.rl.ui.launch;

import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nTemplateType cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nRecordType cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nTemplateType cannot be resolved to a type."
      + "\nRecordType cannot be resolved to a type."
      + "\nThe method or field eContainer is undefined for the type void"
      + "\nThe method or field eContainer is undefined for the type void"
      + "\nThe method composePackageHierarchy(Model, Resource) from the type EMFModelGenerator refers to the missing type Model"
      + "\nThe method createInterface(TemplateType) from the type EMFModelGenerator refers to the missing type TemplateType"
      + "\nThe method createClass(RecordType) from the type EMFModelGenerator refers to the missing type RecordType"
      + "\nThe method composeInterface(TemplateType, Resource) from the type EMFModelGenerator refers to the missing type TemplateType"
      + "\nThe method composeClass(RecordType, Resource) from the type EMFModelGenerator refers to the missing type RecordType"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
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
  public void composePackageHierarchy(final /* Model */Object model, final Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nsplit cannot be resolved");
  }
  
  public void composePackageHierarchy(final String[] modelName, final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final Consumer<EPackage> _function = (EPackage p) -> {
      String _name = p.getName();
      Object _get = modelName[0];
      boolean _equals = _name.equals(_get);
      if (_equals) {
        Iterable<String> _tail = IterableExtensions.<String>tail(((Iterable<String>)Conversions.doWrapArray(modelName)));
        this.checkChildPackages(_tail, p);
      }
    };
    _filter.forEach(_function);
    EList<EObject> _contents_1 = resource.getContents();
    Iterable<EPackage> _filter_1 = Iterables.<EPackage>filter(_contents_1, EPackage.class);
    final Function1<EPackage, Boolean> _function_1 = (EPackage p) -> {
      String _name = p.getName();
      Object _get = modelName[0];
      return Boolean.valueOf(_name.equals(_get));
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
    final Consumer<EPackage> _function = (EPackage p) -> {
      String _name = p.getName();
      boolean _equals = _name.equals(nodeName);
      if (_equals) {
        this.checkChildPackages(tailList, p);
      }
    };
    _eSubpackages.forEach(_function);
    EList<EPackage> _eSubpackages_1 = parent.getESubpackages();
    final Function1<EPackage, Boolean> _function_1 = (EPackage p) -> {
      String _name = p.getName();
      return Boolean.valueOf(_name.equals(nodeName));
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
    final Function1<EClassifier, Boolean> _function = (EClassifier it) -> {
      String _name = it.getName();
      String _name_1 = classifier.getName();
      return Boolean.valueOf(_name.equals(_name_1));
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
    final Function1<EPackage, Boolean> _function = (EPackage it) -> {
      String _get = packagePath[0];
      String _name = it.getName();
      return Boolean.valueOf(_get.equals(_name));
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
      final Function1<EPackage, Boolean> _function = (EPackage it) -> {
        String _get = ((String[])Conversions.unwrapArray(packagePath, String.class))[0];
        String _name = it.getName();
        return Boolean.valueOf(_get.equals(_name));
      };
      EPackage _findFirst = IterableExtensions.<EPackage>findFirst(_eSubpackages, _function);
      Iterable<String> _tail = IterableExtensions.<String>tail(packagePath);
      return this.findPackage(_findFirst, _tail);
    }
  }
  
  /**
   * Search for a class in the resource specified by the record type.
   */
  public EClass findResultClass(final /* Type */Object type, final Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nget cannot be resolved"
      + "\nfindResultClass cannot be resolved"
      + "\ntail cannot be resolved");
  }
  
  public EClass findResultClass(final /* Type */Object type, final EPackage pkg, final Iterable<String> packagePath) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfindResultClass cannot be resolved");
  }
  
  /**
   * Compose an EMF interface for the given partial record type/template.
   */
  public EClass createInterface(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  /**
   * Compose an EMF class for the given record type.
   */
  public EClass createClass(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nabstract cannot be resolved");
  }
  
  /**
   * Complete the interface construction with inheritance and attributes.
   */
  public void composeInterface(final /* TemplateType */Object type, final Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method findResultClass(Type, Resource) from the type EMFModelGenerator refers to the missing type Type"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nfindResultClass cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Complete the class construction with inheritance and attributes.
   */
  public void composeClass(final /* RecordType */Object type, final Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method findResultClass(Type, Resource) from the type EMFModelGenerator refers to the missing type Type"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nfindResultClass cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nfindResultClass cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Check if a given feature already exists.
   */
  public void addUnique(final EList<EStructuralFeature> list, final EAttribute attribute) {
    final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature it) -> {
      String _name = it.getName();
      String _name_1 = attribute.getName();
      return Boolean.valueOf(_name.equals(_name_1));
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
    throw new Error("Unresolved compilation problems:"
      + "\nClassifier cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\n!= cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmapToEMFLiteral cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public EDataType getMapToEMFLiteral(final String name) {
    EDataType _switchResult = null;
    switch (name) {
      case "byte":
        _switchResult = EcorePackage.Literals.EBYTE;
        break;
      case "short":
        _switchResult = EcorePackage.Literals.ESHORT;
        break;
      case "int":
        _switchResult = EcorePackage.Literals.EINT;
        break;
      case "long":
        _switchResult = EcorePackage.Literals.ELONG;
        break;
      case "float":
        _switchResult = EcorePackage.Literals.EFLOAT;
        break;
      case "double":
        _switchResult = EcorePackage.Literals.EDOUBLE;
        break;
      case "string":
        _switchResult = EcorePackage.Literals.ESTRING;
        break;
      case "boolean":
        _switchResult = EcorePackage.Literals.EBOOLEAN;
        break;
      default:
        _switchResult = EcorePackage.Literals.EBOOLEAN;
        break;
    }
    return _switchResult;
  }
}
