package kieker.tools.al.handler.pcm;

import com.google.common.base.Objects;
import kieker.tools.al.aspectLang.ApplicationModel;
import kieker.tools.al.aspectLang.Technology;
import kieker.tools.al.mapping.Container;
import kieker.tools.al.mapping.Containment;
import kieker.tools.al.mapping.MappingFactory;
import kieker.tools.al.mapping.MappingModel;
import kieker.tools.al.mapping.NamedType;
import kieker.tools.al.mapping.Operation;
import kieker.tools.al.mapping.OperationModifier;
import kieker.tools.al.mapping.Parameter;
import kieker.tools.al.mapping.ParameterModifier;
import kieker.tools.al.mapping.TypeReference;
import kieker.tools.al.modelhandling.IModelMapper;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PCMModelMapper implements IModelMapper {
  /**
   * hierarchy mapping model factory.
   */
  private final MappingFactory mappingFactory = MappingFactory.eINSTANCE;
  
  private MappingModel result;
  
  private Map<String, EObject> interfaceMap = new HashMap<String, EObject>();
  
  @Override
  public MappingModel loadModel(final ApplicationModel input, final ResourceSet resourceSet) {
    String _model = input.getModel();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_model, true);
    final Resource source = resourceSet.getResource(_createPlatformResourceURI, true);
    MappingModel _createMappingModel = this.mappingFactory.createMappingModel();
    this.result = _createMappingModel;
    this.determineInterfaces(source);
    this.determineContainerHierarchy(source);
    return this.result;
  }
  
  @Override
  public String name() {
    return "pcm";
  }
  
  @Override
  public Collection<Technology> targetTechnologies() {
    return Collections.<Technology>unmodifiableSet(CollectionLiterals.<Technology>newHashSet(Technology.ASPECT_J, Technology.SERVLET, Technology.JAVA_EE));
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
              final Container container = this.mappingFactory.createContainer();
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
              this.insertContainerInHierarchy(this.result, container, name);
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
        final Container interfaze = this.mappingFactory.createContainer();
        final EObject interfazeDeclaration = this.interfaceMap.get(name);
        interfaze.setName(name);
        interfaze.setPredecessor(providedInterface);
        EList<Operation> _operations = interfaze.getOperations();
        Collection<EObject> _determineMethods = this.determineMethods(interfazeDeclaration);
        this.createMethods(_operations, _determineMethods);
        EList<Container> _contents = container.getContents();
        _contents.add(interfaze);
      }
    }
  }
  
  /**
   * Create methods for an interface in the intermediate model.
   */
  private void createMethods(final EList<Operation> list, final Collection<EObject> objects) {
    final Consumer<EObject> _function = (EObject signature) -> {
      Operation _createOperation = this.createOperation(signature);
      list.add(_createOperation);
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
  private Operation createOperation(final EObject signature) {
    final Operation method = this.mappingFactory.createOperation();
    Object _feature = this.getFeature(signature, "entityName");
    method.setName(((String) _feature));
    method.setPredecessor(signature);
    final OperationModifier modifier = this.mappingFactory.createOperationModifier();
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
    final Consumer<EObject> _function = (EObject parameter) -> {
      EList<Parameter> _parameters = method.getParameters();
      Parameter _createParameter = this.createParameter(parameter);
      _parameters.add(_createParameter);
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
    final Parameter parameter = this.mappingFactory.createParameter();
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
    final TypeReference typeReference = this.mappingFactory.createTypeReference();
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
        switch (_name_1) {
          case "CompositeDataType":
            Object _feature = this.getFeature(object, "entityName");
            NamedType _findCompositeType = this.findCompositeType(((String) _feature));
            typeReference.setType(_findCompositeType);
            break;
          case "PrimitiveDataType":
            Object _feature_1 = this.getFeature(object, "type");
            NamedType _findPrimitiveType = this.findPrimitiveType(_feature_1);
            typeReference.setType(_findPrimitiveType);
            break;
        }
      } else {
        NamedType _emptyType = this.emptyType();
        typeReference.setType(_emptyType);
      }
    } else {
      NamedType _emptyType_1 = this.emptyType();
      typeReference.setType(_emptyType_1);
    }
    return typeReference;
  }
  
  /**
   * Emergency routine if the type is not found.
   * 
   * @return returns the empty type.
   */
  private NamedType emptyType() {
    EList<NamedType> _types = this.result.getTypes();
    final Function1<NamedType, Boolean> _function = (NamedType it) -> {
      String _name = it.getName();
      return Boolean.valueOf(_name.equals("EMPTY"));
    };
    NamedType type = IterableExtensions.<NamedType>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      NamedType _createNamedType = this.mappingFactory.createNamedType();
      type = _createNamedType;
      type.setName("EMPTY");
      EList<NamedType> _types_1 = this.result.getTypes();
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
  private NamedType findPrimitiveType(final Object object) {
    final String typeName = object.toString();
    EList<NamedType> _types = this.result.getTypes();
    final Function1<NamedType, Boolean> _function = (NamedType it) -> {
      String _name = it.getName();
      return Boolean.valueOf(_name.equals(typeName));
    };
    NamedType type = IterableExtensions.<NamedType>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      NamedType _createNamedType = this.mappingFactory.createNamedType();
      type = _createNamedType;
      type.setName(typeName);
      EList<NamedType> _types_1 = this.result.getTypes();
      _types_1.add(type);
    }
    return type;
  }
  
  /**
   * Method has side effect. TODO fix this. No side effects please.
   * 
   * @param name of the complex type.
   */
  private NamedType findCompositeType(final String typeName) {
    EList<NamedType> _types = this.result.getTypes();
    final Function1<NamedType, Boolean> _function = (NamedType it) -> {
      String _name = it.getName();
      return Boolean.valueOf(_name.equals(typeName));
    };
    NamedType type = IterableExtensions.<NamedType>findFirst(_types, _function);
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      NamedType _createNamedType = this.mappingFactory.createNamedType();
      type = _createNamedType;
      type.setName(typeName);
      EList<NamedType> _types_1 = this.result.getTypes();
      _types_1.add(type);
    }
    return type;
  }
  
  private ParameterModifier createParameterModifier(final Object object) {
    final ParameterModifier modifier = this.mappingFactory.createParameterModifier();
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
      final Function1<Container, Boolean> _function = (Container it) -> {
        String _name = it.getName();
        String _firstSegment = fullQualifiedName.getFirstSegment();
        return Boolean.valueOf(_name.equals(_firstSegment));
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
            final Container newContainer = this.mappingFactory.createContainer();
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
    final Function1<Container, Boolean> _function = (Container it) -> {
      String _name = it.getName();
      String _name_1 = entity.getName();
      return Boolean.valueOf(_name.equals(_name_1));
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
}
