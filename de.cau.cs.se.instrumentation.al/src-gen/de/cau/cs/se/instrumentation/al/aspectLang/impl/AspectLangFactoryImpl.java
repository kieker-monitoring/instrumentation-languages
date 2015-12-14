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
      case AspectLangPackage.ASPECT_MODEL: return createAspectModel();
      case AspectLangPackage.IMPORT: return createImport();
      case AspectLangPackage.APPLICATION_MODEL: return createApplicationModel();
      case AspectLangPackage.ASPECT: return createAspect();
      case AspectLangPackage.UTILIZE_ADVICE: return createUtilizeAdvice();
      case AspectLangPackage.ADVICE: return createAdvice();
      case AspectLangPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case AspectLangPackage.POINTCUT: return createPointcut();
      case AspectLangPackage.ANNOTATION: return createAnnotation();
      case AspectLangPackage.METHOD_QUERY: return createMethodQuery();
      case AspectLangPackage.PARAMETER_QUERY: return createParameterQuery();
      case AspectLangPackage.LOCATION_QUERY: return createLocationQuery();
      case AspectLangPackage.COMPOSITION_QUERY: return createCompositionQuery();
      case AspectLangPackage.NODE: return createNode();
      case AspectLangPackage.PARAM_QUERY: return createParamQuery();
      case AspectLangPackage.PARAM_EXPRESSION: return createParamExpression();
      case AspectLangPackage.FLOAT_VALUE: return createFloatValue();
      case AspectLangPackage.INT_VALUE: return createIntValue();
      case AspectLangPackage.STRING_VALUE: return createStringValue();
      case AspectLangPackage.REFERENCE_VALUE: return createReferenceValue();
      case AspectLangPackage.PARAMETER: return createParameter();
      case AspectLangPackage.INTERNAL_FUNCTION_PROPERTY: return createInternalFunctionProperty();
      case AspectLangPackage.RUNTIME_PROPERTY: return createRuntimeProperty();
      case AspectLangPackage.REFLECTION_PROPERTY: return createReflectionProperty();
      case AspectLangPackage.CONTAINER_NODE: return createContainerNode();
      case AspectLangPackage.WILDCARD_NODE: return createWildcardNode();
      case AspectLangPackage.SUB_PATH_NODE: return createSubPathNode();
      case AspectLangPackage.PARENT_NODE: return createParentNode();
      case AspectLangPackage.COLLECTOR: return createCollector();
      case AspectLangPackage.EVENT: return createEvent();
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
      case AspectLangPackage.QUERY_MODIFIER:
        return createQueryModifierFromString(eDataType, initialValue);
      case AspectLangPackage.LOGIC_OPERATOR:
        return createLogicOperatorFromString(eDataType, initialValue);
      case AspectLangPackage.INTERNAL_FUNCTION:
        return createInternalFunctionFromString(eDataType, initialValue);
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
      case AspectLangPackage.QUERY_MODIFIER:
        return convertQueryModifierToString(eDataType, instanceValue);
      case AspectLangPackage.LOGIC_OPERATOR:
        return convertLogicOperatorToString(eDataType, instanceValue);
      case AspectLangPackage.INTERNAL_FUNCTION:
        return convertInternalFunctionToString(eDataType, instanceValue);
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
  public AspectModel createAspectModel()
  {
    AspectModelImpl aspectModel = new AspectModelImpl();
    return aspectModel;
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
  public UtilizeAdvice createUtilizeAdvice()
  {
    UtilizeAdviceImpl utilizeAdvice = new UtilizeAdviceImpl();
    return utilizeAdvice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Advice createAdvice()
  {
    AdviceImpl advice = new AdviceImpl();
    return advice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pointcut createPointcut()
  {
    PointcutImpl pointcut = new PointcutImpl();
    return pointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodQuery createMethodQuery()
  {
    MethodQueryImpl methodQuery = new MethodQueryImpl();
    return methodQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQuery createParameterQuery()
  {
    ParameterQueryImpl parameterQuery = new ParameterQueryImpl();
    return parameterQuery;
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
  public CompositionQuery createCompositionQuery()
  {
    CompositionQueryImpl compositionQuery = new CompositionQueryImpl();
    return compositionQuery;
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
  public ParamExpression createParamExpression()
  {
    ParamExpressionImpl paramExpression = new ParamExpressionImpl();
    return paramExpression;
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
  public InternalFunctionProperty createInternalFunctionProperty()
  {
    InternalFunctionPropertyImpl internalFunctionProperty = new InternalFunctionPropertyImpl();
    return internalFunctionProperty;
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
  public ParentNode createParentNode()
  {
    ParentNodeImpl parentNode = new ParentNodeImpl();
    return parentNode;
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
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryModifier createQueryModifierFromString(EDataType eDataType, String initialValue)
  {
    QueryModifier result = QueryModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQueryModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperator createLogicOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicOperator result = LogicOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalFunction createInternalFunctionFromString(EDataType eDataType, String initialValue)
  {
    InternalFunction result = InternalFunction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInternalFunctionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
