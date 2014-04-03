/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectLangFactoryImpl extends EFactoryImpl implements AspectLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AspectLangFactory init()
  {
    try
    {
      AspectLangFactory theAspectLangFactory = (AspectLangFactory)EPackage.Registry.INSTANCE.getEFactory(AspectLangPackage.eNS_URI);
      if (theAspectLangFactory != null)
      {
        return theAspectLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AspectLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AspectLangPackage.MODEL: return createModel();
      case AspectLangPackage.IMPORT: return createImport();
      case AspectLangPackage.REGISTERED_PACKAGE: return createRegisteredPackage();
      case AspectLangPackage.APPLICATION_MODEL: return createApplicationModel();
      case AspectLangPackage.ASPECT: return createAspect();
      case AspectLangPackage.QUERY: return createQuery();
      case AspectLangPackage.PARAMETER_PATTERN: return createParameterPattern();
      case AspectLangPackage.LOCATION_QUERY: return createLocationQuery();
      case AspectLangPackage.NODE: return createNode();
      case AspectLangPackage.PARAM_QUERY: return createParamQuery();
      case AspectLangPackage.PARAM_COMPARE: return createParamCompare();
      case AspectLangPackage.VALUE: return createValue();
      case AspectLangPackage.FLOAT_VALUE: return createFloatValue();
      case AspectLangPackage.INT_VALUE: return createIntValue();
      case AspectLangPackage.STRING_VALUE: return createStringValue();
      case AspectLangPackage.REFERENCE_VALUE: return createReferenceValue();
      case AspectLangPackage.PARAMETER: return createParameter();
      case AspectLangPackage.RUNTIME_PROPERTY: return createRuntimeProperty();
      case AspectLangPackage.REFLECTION_PROPERTY: return createReflectionProperty();
      case AspectLangPackage.CONTAINER_NODE: return createContainerNode();
      case AspectLangPackage.WILDCARD_NODE: return createWildcardNode();
      case AspectLangPackage.SUB_PATH_NODE: return createSubPathNode();
      case AspectLangPackage.COLLECTOR: return createCollector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AspectLangPackage.REFLECTION_FUNCTION:
        return createReflectionFunctionFromString(eDataType, initialValue);
      case AspectLangPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      case AspectLangPackage.INSERTION_POINT:
        return createInsertionPointFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AspectLangPackage.REFLECTION_FUNCTION:
        return convertReflectionFunctionToString(eDataType, instanceValue);
      case AspectLangPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      case AspectLangPackage.INSERTION_POINT:
        return convertInsertionPointToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegisteredPackage createRegisteredPackage()
  {
    RegisteredPackageImpl registeredPackage = new RegisteredPackageImpl();
    return registeredPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationModel createApplicationModel()
  {
    ApplicationModelImpl applicationModel = new ApplicationModelImpl();
    return applicationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aspect createAspect()
  {
    AspectImpl aspect = new AspectImpl();
    return aspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterPattern createParameterPattern()
  {
    ParameterPatternImpl parameterPattern = new ParameterPatternImpl();
    return parameterPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationQuery createLocationQuery()
  {
    LocationQueryImpl locationQuery = new LocationQueryImpl();
    return locationQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamQuery createParamQuery()
  {
    ParamQueryImpl paramQuery = new ParamQueryImpl();
    return paramQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamCompare createParamCompare()
  {
    ParamCompareImpl paramCompare = new ParamCompareImpl();
    return paramCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatValue createFloatValue()
  {
    FloatValueImpl floatValue = new FloatValueImpl();
    return floatValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceValue createReferenceValue()
  {
    ReferenceValueImpl referenceValue = new ReferenceValueImpl();
    return referenceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuntimeProperty createRuntimeProperty()
  {
    RuntimePropertyImpl runtimeProperty = new RuntimePropertyImpl();
    return runtimeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflectionProperty createReflectionProperty()
  {
    ReflectionPropertyImpl reflectionProperty = new ReflectionPropertyImpl();
    return reflectionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerNode createContainerNode()
  {
    ContainerNodeImpl containerNode = new ContainerNodeImpl();
    return containerNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WildcardNode createWildcardNode()
  {
    WildcardNodeImpl wildcardNode = new WildcardNodeImpl();
    return wildcardNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubPathNode createSubPathNode()
  {
    SubPathNodeImpl subPathNode = new SubPathNodeImpl();
    return subPathNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collector createCollector()
  {
    CollectorImpl collector = new CollectorImpl();
    return collector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflectionFunction createReflectionFunctionFromString(EDataType eDataType, String initialValue)
  {
    ReflectionFunction result = ReflectionFunction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReflectionFunctionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertionPoint createInsertionPointFromString(EDataType eDataType, String initialValue)
  {
    InsertionPoint result = InsertionPoint.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInsertionPointToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectLangPackage getAspectLangPackage()
  {
    return (AspectLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AspectLangPackage getPackage()
  {
    return AspectLangPackage.eINSTANCE;
  }

} //AspectLangFactoryImpl
