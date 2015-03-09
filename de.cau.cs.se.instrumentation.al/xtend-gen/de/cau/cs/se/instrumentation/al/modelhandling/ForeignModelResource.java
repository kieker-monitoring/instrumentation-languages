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
package de.cau.cs.se.instrumentation.al.modelhandling;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.Containment;
import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.MethodModifier;
import de.cau.cs.se.instrumantation.model.structure.Model;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.ParameterModifier;
import de.cau.cs.se.instrumantation.model.structure.StructureFactory;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumantation.model.structure.TypeReference;
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
@SuppressWarnings("all")
public class ForeignModelResource extends ResourceImpl {
  /**
   * hierarchy mapping model factory.
   */
  private final StructureFactory structureFactory = StructureFactory.eINSTANCE;
  
  /**
   * Model of the application to be instrumented.
   */
  private final ApplicationModel applicationModel;
  
  /**
   * Resulting hierarchy model.
   */
  private Model resultModel;
  
  /**
   * Helper variable to prohibit recursion of model loading.
   */
  private boolean loading = false;
  
  /**
   * Map containing all interface declarations.
   */
  private final Map<String, EObject> interfaceMap = new HashMap<String, EObject>();
  
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param applicationModel the application model
   */
  public ForeignModelResource(final URI uri, final ApplicationModel applicationModel) {
    super(uri);
    this.applicationModel = applicationModel;
  }
  
  /**
   * Return an EObject with the name specified by the uriFragment.
   * 
   * @param uriFragment
   * 
   * @return the EObject identified by the uriFragment or null if no such object exists.
   */
  public EObject getEObject(final String uriFragment) {
    EList<EObject> _contents = this.getContents();
    String _plus = ("this.getContents " + _contents);
    System.out.println(_plus);
    EList<EObject> _contents_1 = this.getContents();
    boolean _isEmpty = _contents_1.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EObject> _contents_2 = this.getContents();
      EObject _get = _contents_2.get(0);
      String _plus_1 = ("this.getContents get element " + _get);
      System.out.println(_plus_1);
      EList<EObject> _contents_3 = this.getContents();
      EObject _get_1 = null;
      if (_contents_3!=null) {
        _get_1=_contents_3.get(0);
      }
      EList<Container> _contents_4 = ((Model) _get_1).getContents();
      Container _findFirst = null;
      if (_contents_4!=null) {
        final Function1<Container, Boolean> _function = new Function1<Container, Boolean>() {
          public Boolean apply(final Container it) {
            String _uRIFragment = ForeignModelResource.this.getURIFragment(it);
            return Boolean.valueOf(uriFragment.equals(_uRIFragment));
          }
        };
        _findFirst=IterableExtensions.<Container>findFirst(_contents_4, _function);
      }
      final EObject object = _findFirst;
      boolean _notEquals = (!Objects.equal(object, null));
      if (_notEquals) {
        return object;
      } else {
        return super.getEObject(uriFragment);
      }
    } else {
      return super.getEObject(uriFragment);
    }
  }
  
  /**
   * Compute the uriFragment for a given EObject.
   * 
   * @param eObject the object the fragment is computed for.
   * 
   * @return returns the uriFragment for the given object.
   */
  public String getURIFragment(final EObject eObject) {
    if ((eObject instanceof NamedElement)) {
      return ((NamedElement) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
  }
  
  /**
   * load the resource iff it is not already loaded.
   */
  public void load(final Map<?, ?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  /**
   * Saving this resource is not allowed, as it is a virtual resource.
   */
  public void save(final Map<?, ?> options) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  /**
   * This routine is called from ResourceImpl load after the load method above is triggered.
   * It initializes the primitive type mirror.
   * 
   * TODO fix documentation
   * 
   * @param inputStream
   * @param options
   * 
   * @throws IOException
   */
  public void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    URI _uRI = this.getURI();
    boolean _notEquals = (!Objects.equal(_uRI, null));
    if (_notEquals) {
      this.createModel();
    } else {
      try {
        throw new IOException("URI not set on ForeignModelResource.onLoad");
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  /**
   * Helper routine to get a special part of the result model.
   */
  public EList<Type> getAllDataTypes() {
    return this.resultModel.getTypes();
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private boolean createModel() {
    boolean _xifexpression = false;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.applicationModel, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (!this.loading);
    }
    if (_and) {
      boolean _xblockexpression = false;
      {
        this.loading = true;
        final List<RegisteredPackage> usePackages = this.applicationModel.getUsePackages();
        for (final RegisteredPackage usePackage : usePackages) {
          {
            EPackage _ePackage = usePackage.getEPackage();
            Resource _eResource = _ePackage.eResource();
            final ResourceSet resourceSet = _eResource.getResourceSet();
            Resource _eResource_1 = usePackage.eResource();
            EList<EObject> _contents = _eResource_1.getContents();
            _contents.get(0);
            EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
            EPackage _ePackage_1 = usePackage.getEPackage();
            String _nsURI = _ePackage_1.getNsURI();
            EPackage _ePackage_2 = usePackage.getEPackage();
            _packageRegistry.put(_nsURI, _ePackage_2);
            final Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
            final Map<String, Object> extensiontoFactoryMap = registry.getExtensionToFactoryMap();
            EPackage _ePackage_3 = usePackage.getEPackage();
            String _name = _ePackage_3.getName();
            XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
            extensiontoFactoryMap.put(_name, _xMIResourceFactoryImpl);
          }
        }
        String _model = this.applicationModel.getModel();
        URI _createPlatformResourceURI = URI.createPlatformResourceURI(_model, true);
        final Resource source = this.resourceSet.getResource(_createPlatformResourceURI, true);
        Model _createModel = this.structureFactory.createModel();
        this.resultModel = _createModel;
        this.determineInterfaces(source);
        this.determineContainerHierarchy(source);
        EList<EObject> _contents = this.getContents();
        _contents.add(this.resultModel);
        _xblockexpression = this.loading = false;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
   * The hierarchy does not differentiate between packages, components or classes as only the
   * hierarchy must be known.
   * 
   * @param source
   */
  private void determineContainerHierarchy(final Resource source) {
    final Iterator<EObject> iterator = source.getAllContents();
    while (iterator.hasNext()) {
      {
        final EObject object = iterator.next();
        EClass _eClass = object.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Repository");
        if (_equals) {
          Object _feature = this.getFeature(object, "components__Repository");
          final EList<EObject> components = ((EList<EObject>) _feature);
          for (final EObject component : components) {
            {
              final Container container = this.structureFactory.createContainer();
              Object _feature_1 = this.getFeature(component, "entityName");
              final String fullQualifiedName = ((String) _feature_1);
              final String[] names = fullQualifiedName.split("\\.");
              int _size = ((List<String>)Conversions.doWrapArray(names)).size();
              boolean _equals_1 = (_size == 0);
              if (_equals_1) {
                ((List<String>)Conversions.doWrapArray(names)).add(((String) fullQualifiedName));
              }
              final QualifiedName name = QualifiedName.create(names);
              String _lastSegment = name.getLastSegment();
              container.setName(_lastSegment);
              container.setPredecessor(component);
              this.addInterfaces(container, component);
              this.insertContainerInHierarchy(this.resultModel, container, name);
            }
          }
        }
      }
    }
  }
  
  /**
   * Identify the interfaces a given container implements and add that interface
   * to the hierarchy structure.
   * 
   * @param container the container the interfaces are added to
   * @param component the PCM model component
   */
  private void addInterfaces(final Container container, final EObject component) {
    Object _feature = this.getFeature(component, "providedRoles_InterfaceProvidingEntity");
    final EList<EObject> providedInterfaces = ((EList<EObject>) _feature);
    for (final EObject providedInterface : providedInterfaces) {
      {
        Object _feature_1 = this.getFeature(providedInterface, "entityName");
        final String name = ((String) _feature_1);
        final Container interfaze = this.structureFactory.createContainer();
        final EObject interfazeDeclaration = this.interfaceMap.get(name);
        interfaze.setName(name);
        interfaze.setPredecessor(providedInterface);
        EList<Method> _methods = interfaze.getMethods();
        Collection<EObject> _determineMethods = this.determineMethods(interfazeDeclaration);
        this.createMethods(_methods, _determineMethods);
        EList<Container> _contents = container.getContents();
        _contents.add(interfaze);
      }
    }
  }
  
  /**
   * Create methods for an interface in the intermediate model.
   */
  private void createMethods(final EList<Method> list, final Collection<EObject> objects) {
    final Consumer<EObject> _function = new Consumer<EObject>() {
      public void accept(final EObject signature) {
        Method _createMethod = ForeignModelResource.this.createMethod(signature);
        list.add(_createMethod);
      }
    };
    objects.forEach(_function);
  }
  
  /**
   * Construct a method in the application model based on the PCM structure.
   * 
   * @param signature the method signature from the PCM repository to be used to create
   * the application model method signature.
   * 
   * @return returns an application model method declaration.
   */
  private Method createMethod(final EObject signature) {
    final Method method = this.structureFactory.createMethod();
    Object _feature = this.getFeature(signature, "entityName");
    method.setName(((String) _feature));
    method.setPredecessor(signature);
    final MethodModifier modifier = this.structureFactory.createMethodModifier();
    modifier.setName("public");
    method.setModifier(modifier);
    EObject _referenceFeature = this.getReferenceFeature(signature, "returnType__OperationSignature");
    TypeReference _createTypeReference = null;
    if (_referenceFeature!=null) {
      _createTypeReference=this.createTypeReference(_referenceFeature);
    }
    method.setReturnType(_createTypeReference);
    Object _feature_1 = this.getFeature(signature, "parameters__OperationSignature");
    final Collection<EObject> parameters = ((Collection<EObject>) _feature_1);
    final Consumer<EObject> _function = new Consumer<EObject>() {
      public void accept(final EObject parameter) {
        EList<Parameter> _parameters = method.getParameters();
        Parameter _createParameter = ForeignModelResource.this.createParameter(parameter);
        _parameters.add(_createParameter);
      }
    };
    parameters.forEach(_function);
    return method;
  }
  
  /**
   * Create an application model parameter.
   * 
   * @param object the parameter declaration in PCM which is used to create the application
   * model parameter.
   * 
   * @return the application model parameter
   */
  private Parameter createParameter(final EObject object) {
    final Parameter parameter = this.structureFactory.createParameter();
    Object _feature = this.getFeature(object, "parameterName");
    parameter.setName(((String) _feature));
    parameter.setPredecessor(object);
    Object _feature_1 = this.getFeature(object, "modifier__Parameter");
    ParameterModifier _createParameterModifier = this.createParameterModifier(_feature_1);
    parameter.setModifier(_createParameterModifier);
    EObject _referenceFeature = this.getReferenceFeature(object, "dataType__Parameter");
    TypeReference _createTypeReference = null;
    if (_referenceFeature!=null) {
      _createTypeReference=this.createTypeReference(_referenceFeature);
    }
    parameter.setType(_createTypeReference);
    return parameter;
  }
  
  /**
   * Create a reference to a type declaration.
   * 
   * @param the PCM type reference to be mapped to an application model reference.
   * 
   * @return returns the application model type reference.
   */
  private TypeReference createTypeReference(final EObject object) {
    final TypeReference typeReference = this.structureFactory.createTypeReference();
    typeReference.setPredecessor(object);
    EClass _eClass = object.eClass();
    boolean _notEquals = (!Objects.equal(_eClass, null));
    if (_notEquals) {
      EClass _eClass_1 = object.eClass();
      String _name = _eClass_1.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      if (_notEquals_1) {
        EClass _eClass_2 = object.eClass();
        String _name_1 = _eClass_2.getName();
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_name_1, "CompositeDataType")) {
            _matched=true;
            Object _feature = this.getFeature(object, "entityName");
            Type _findCompositeType = this.findCompositeType(((String) _feature));
            typeReference.setType(_findCompositeType);
          }
        }
        if (!_matched) {
          if (Objects.equal(_name_1, "PrimitiveDataType")) {
            _matched=true;
            Object _feature_1 = this.getFeature(object, "type");
            Type _findPrimitiveType = this.findPrimitiveType(_feature_1);
            typeReference.setType(_findPrimitiveType);
          }
        }
      } else {
        Type _emptyType = this.emptyType();
        typeReference.setType(_emptyType);
      }
    } else {
      Type _emptyType_1 = this.emptyType();
      typeReference.setType(_emptyType_1);
    }
    return typeReference;
  }
  
  /**
   * Emergency routine if the type is not found.
   * 
   * @return returns the empty type.
   */
  private Type emptyType() {
    EList<Type> _types = this.resultModel.getTypes();
    final Function1<Type, Boolean> _function = new Function1<Type, Boolean>() {
      public Boolean apply(final Type it) {
        String _name = it.getName();
        return Boolean.valueOf(_name.equals("EMPTY"));
      }
    };
    Type type = IterableExtensions.<Type>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      Type _createType = this.structureFactory.createType();
      type = _createType;
      type.setName("EMPTY");
      EList<Type> _types_1 = this.resultModel.getTypes();
      _types_1.add(type);
    }
    return type;
  }
  
  /**
   * Determine an primitive type. If the primitive type is missing, it is created.
   * 
   * @param type name as object
   * 
   * @return return a primitive type conforming to the PCM type.
   */
  private Type findPrimitiveType(final Object object) {
    final String typeName = object.toString();
    EList<Type> _types = this.resultModel.getTypes();
    final Function1<Type, Boolean> _function = new Function1<Type, Boolean>() {
      public Boolean apply(final Type it) {
        String _name = it.getName();
        return Boolean.valueOf(_name.equals(typeName));
      }
    };
    Type type = IterableExtensions.<Type>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      Type _createType = this.structureFactory.createType();
      type = _createType;
      type.setName(typeName);
      EList<Type> _types_1 = this.resultModel.getTypes();
      _types_1.add(type);
    }
    return type;
  }
  
  /**
   * Method has side effect. TODO fix this. No side effects please.
   * 
   * @param name of the complex type.
   */
  private Type findCompositeType(final String typeName) {
    EList<Type> _types = this.resultModel.getTypes();
    final Function1<Type, Boolean> _function = new Function1<Type, Boolean>() {
      public Boolean apply(final Type it) {
        String _name = it.getName();
        return Boolean.valueOf(_name.equals(typeName));
      }
    };
    Type type = IterableExtensions.<Type>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      Type _createType = this.structureFactory.createType();
      type = _createType;
      type.setName(typeName);
      EList<Type> _types_1 = this.resultModel.getTypes();
      _types_1.add(type);
    }
    return type;
  }
  
  private ParameterModifier createParameterModifier(final Object object) {
    final ParameterModifier modifier = this.structureFactory.createParameterModifier();
    return modifier;
  }
  
  /**
   * Determine which methods are defined in an interface.
   */
  private Collection<EObject> determineMethods(final EObject interfazeDeclaration) {
    Object _feature = this.getFeature(interfazeDeclaration, "signatures__OperationInterface");
    return ((Collection<EObject>) _feature);
  }
  
  /**
   * Find dynamically a feature of an object.
   */
  private Object getFeature(final EObject object, final String featureName) {
    EClass _eClass = object.eClass();
    final EStructuralFeature feature = _eClass.getEStructuralFeature(featureName);
    return object.eGet(feature);
  }
  
  /**
   * Find dynamically an reference feature of an object.
   */
  private EObject getReferenceFeature(final EObject object, final String featureName) {
    EClass _eClass = object.eClass();
    final EStructuralFeature feature = _eClass.getEStructuralFeature(featureName);
    if ((feature instanceof EReference)) {
      Object _eGet = object.eGet(feature);
      return ((EObject) _eGet);
    } else {
      return null;
    }
  }
  
  /**
   * Insert component type in the container hierarchy. If necessary establish that hierarchy.
   */
  private void insertContainerInHierarchy(final Containment parent, final Container entity, final QualifiedName fullQualifiedName) {
    int _segmentCount = fullQualifiedName.getSegmentCount();
    boolean _equals = (_segmentCount == 1);
    if (_equals) {
      this.addEntityToParentContainer(parent, entity);
    } else {
      EList<Container> _contents = parent.getContents();
      final Function1<Container, Boolean> _function = new Function1<Container, Boolean>() {
        public Boolean apply(final Container it) {
          String _name = it.getName();
          String _firstSegment = fullQualifiedName.getFirstSegment();
          return Boolean.valueOf(_name.equals(_firstSegment));
        }
      };
      final Container container = IterableExtensions.<Container>findFirst(_contents, _function);
      boolean _notEquals = (!Objects.equal(container, null));
      if (_notEquals) {
        QualifiedName _skipFirst = fullQualifiedName.skipFirst(1);
        this.insertContainerInHierarchy(container, entity, _skipFirst);
      } else {
        Containment runningParent = parent;
        QualifiedName _skipLast = fullQualifiedName.skipLast(1);
        List<String> _segments = _skipLast.getSegments();
        for (final String name : _segments) {
          {
            final Container newContainer = this.structureFactory.createContainer();
            newContainer.setName(name);
            EList<Container> _contents_1 = runningParent.getContents();
            _contents_1.add(newContainer);
            runningParent = newContainer;
          }
        }
        EList<Container> _contents_1 = runningParent.getContents();
        _contents_1.add(entity);
      }
    }
  }
  
  /**
   * What does this routine do?
   */
  private Boolean addEntityToParentContainer(final Containment parent, final Container entity) {
    boolean _xifexpression = false;
    EList<Container> _contents = parent.getContents();
    final Function1<Container, Boolean> _function = new Function1<Container, Boolean>() {
      public Boolean apply(final Container it) {
        String _name = it.getName();
        String _name_1 = entity.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      }
    };
    boolean _exists = IterableExtensions.<Container>exists(_contents, _function);
    boolean _not = (!_exists);
    if (_not) {
      EList<Container> _contents_1 = parent.getContents();
      _xifexpression = _contents_1.add(entity);
    } else {
      System.out.println("Double container declaration");
    }
    return Boolean.valueOf(_xifexpression);
  }
  
  /**
   * Determine all interfaces in the given source.
   * 
   * @param source
   *            the resource containing the PCM model
   */
  private void determineInterfaces(final Resource source) {
    final Iterator<EObject> iterator = source.getAllContents();
    while (iterator.hasNext()) {
      {
        final EObject object = iterator.next();
        EClass _eClass = object.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Repository");
        if (_equals) {
          EClass _eClass_1 = object.eClass();
          EStructuralFeature _eStructuralFeature = _eClass_1.getEStructuralFeature("interfaces__Repository");
          final EReference reference = ((EReference) _eStructuralFeature);
          Object _eGet = object.eGet(reference);
          final EList<EObject> interfaces = ((EList<EObject>) _eGet);
          for (final EObject interfaze : interfaces) {
            {
              EClass _eClass_2 = interfaze.eClass();
              EStructuralFeature _eStructuralFeature_1 = _eClass_2.getEStructuralFeature("entityName");
              Object _eGet_1 = interfaze.eGet(_eStructuralFeature_1);
              final String fullQualifiedName = ((String) _eGet_1);
              this.interfaceMap.put(fullQualifiedName, interfaze);
            }
          }
        }
      }
    }
  }
}
