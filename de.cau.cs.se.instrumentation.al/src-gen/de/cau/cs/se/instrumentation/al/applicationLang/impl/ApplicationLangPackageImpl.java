/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang.impl;

import de.cau.cs.se.instrumantation.model.structure.StructurePackage;

import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangFactory;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.applicationLang.Aspect;
import de.cau.cs.se.instrumentation.al.applicationLang.Collector;
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.applicationLang.FloatValue;
import de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.applicationLang.IntValue;
import de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.applicationLang.MetaModel;
import de.cau.cs.se.instrumentation.al.applicationLang.Model;
import de.cau.cs.se.instrumentation.al.applicationLang.Node;
import de.cau.cs.se.instrumentation.al.applicationLang.Operator;
import de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare;
import de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery;
import de.cau.cs.se.instrumentation.al.applicationLang.Parameter;
import de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern;
import de.cau.cs.se.instrumentation.al.applicationLang.Query;
import de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue;
import de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction;
import de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty;
import de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty;
import de.cau.cs.se.instrumentation.al.applicationLang.StringValue;
import de.cau.cs.se.instrumentation.al.applicationLang.SubPathNode;
import de.cau.cs.se.instrumentation.al.applicationLang.Value;
import de.cau.cs.se.instrumentation.al.applicationLang.WildcardNode;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationLangPackageImpl extends EPackageImpl implements ApplicationLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aspectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramCompareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runtimePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reflectionPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subPathNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum reflectionFunctionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum insertionPointEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ApplicationLangPackageImpl()
  {
    super(eNS_URI, ApplicationLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ApplicationLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ApplicationLangPackage init()
  {
    if (isInited) return (ApplicationLangPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationLangPackage.eNS_URI);

    // Obtain or create and register package
    ApplicationLangPackageImpl theApplicationLangPackage = (ApplicationLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationLangPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StructurePackage.eINSTANCE.eClass();
    RecordLangPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theApplicationLangPackage.createPackageContents();

    // Initialize created meta-data
    theApplicationLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theApplicationLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ApplicationLangPackage.eNS_URI, theApplicationLangPackage);
    return theApplicationLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Metamodels()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Sources()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Aspects()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaModel()
  {
    return metaModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaModel_Name()
  {
    return (EAttribute)metaModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaModel_Package()
  {
    return (EReference)metaModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationModel()
  {
    return applicationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationModel_Metamodel()
  {
    return (EReference)applicationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_Name()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_Model()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAspect()
  {
    return aspectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspect_Query()
  {
    return (EReference)aspectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspect_Collectors()
  {
    return (EReference)aspectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Location()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Modifier()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_ReturnType()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Method()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Parameter()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterPattern()
  {
    return parameterPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterPattern_Modifier()
  {
    return (EReference)parameterPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterPattern_Type()
  {
    return (EReference)parameterPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterPattern_Parameter()
  {
    return (EReference)parameterPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationQuery()
  {
    return locationQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationQuery_Node()
  {
    return (EReference)locationQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationQuery_Specialization()
  {
    return (EReference)locationQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Parameter()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamQuery()
  {
    return paramQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamQuery_Queries()
  {
    return (EReference)paramQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamCompare()
  {
    return paramCompareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamCompare_Left()
  {
    return (EReference)paramCompareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamCompare_Operator()
  {
    return (EAttribute)paramCompareEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamCompare_Right()
  {
    return (EReference)paramCompareEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatValue()
  {
    return floatValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatValue_Value()
  {
    return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceValue()
  {
    return referenceValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceValue_Query()
  {
    return (EReference)referenceValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceValue_Parameter()
  {
    return (EReference)referenceValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuntimeProperty()
  {
    return runtimePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuntimeProperty_Reference()
  {
    return (EAttribute)runtimePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReflectionProperty()
  {
    return reflectionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReflectionProperty_Function()
  {
    return (EAttribute)reflectionPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerNode()
  {
    return containerNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerNode_Container()
  {
    return (EReference)containerNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardNode()
  {
    return wildcardNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubPathNode()
  {
    return subPathNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollector()
  {
    return collectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollector_InsertionPoint()
  {
    return (EAttribute)collectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollector_Type()
  {
    return (EReference)collectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollector_Initializations()
  {
    return (EReference)collectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getReflectionFunction()
  {
    return reflectionFunctionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperator()
  {
    return operatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInsertionPoint()
  {
    return insertionPointEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationLangFactory getApplicationLangFactory()
  {
    return (ApplicationLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);
    createEReference(modelEClass, MODEL__METAMODELS);
    createEReference(modelEClass, MODEL__SOURCES);
    createEReference(modelEClass, MODEL__ASPECTS);

    metaModelEClass = createEClass(META_MODEL);
    createEAttribute(metaModelEClass, META_MODEL__NAME);
    createEReference(metaModelEClass, META_MODEL__PACKAGE);

    applicationModelEClass = createEClass(APPLICATION_MODEL);
    createEReference(applicationModelEClass, APPLICATION_MODEL__METAMODEL);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__NAME);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__MODEL);

    aspectEClass = createEClass(ASPECT);
    createEReference(aspectEClass, ASPECT__QUERY);
    createEReference(aspectEClass, ASPECT__COLLECTORS);

    queryEClass = createEClass(QUERY);
    createEReference(queryEClass, QUERY__LOCATION);
    createEReference(queryEClass, QUERY__MODIFIER);
    createEReference(queryEClass, QUERY__RETURN_TYPE);
    createEReference(queryEClass, QUERY__METHOD);
    createEReference(queryEClass, QUERY__PARAMETER);

    parameterPatternEClass = createEClass(PARAMETER_PATTERN);
    createEReference(parameterPatternEClass, PARAMETER_PATTERN__MODIFIER);
    createEReference(parameterPatternEClass, PARAMETER_PATTERN__TYPE);
    createEReference(parameterPatternEClass, PARAMETER_PATTERN__PARAMETER);

    locationQueryEClass = createEClass(LOCATION_QUERY);
    createEReference(locationQueryEClass, LOCATION_QUERY__NODE);
    createEReference(locationQueryEClass, LOCATION_QUERY__SPECIALIZATION);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__PARAMETER);

    paramQueryEClass = createEClass(PARAM_QUERY);
    createEReference(paramQueryEClass, PARAM_QUERY__QUERIES);

    paramCompareEClass = createEClass(PARAM_COMPARE);
    createEReference(paramCompareEClass, PARAM_COMPARE__LEFT);
    createEAttribute(paramCompareEClass, PARAM_COMPARE__OPERATOR);
    createEReference(paramCompareEClass, PARAM_COMPARE__RIGHT);

    valueEClass = createEClass(VALUE);

    floatValueEClass = createEClass(FLOAT_VALUE);
    createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    referenceValueEClass = createEClass(REFERENCE_VALUE);
    createEReference(referenceValueEClass, REFERENCE_VALUE__QUERY);
    createEReference(referenceValueEClass, REFERENCE_VALUE__PARAMETER);

    parameterEClass = createEClass(PARAMETER);

    runtimePropertyEClass = createEClass(RUNTIME_PROPERTY);
    createEAttribute(runtimePropertyEClass, RUNTIME_PROPERTY__REFERENCE);

    reflectionPropertyEClass = createEClass(REFLECTION_PROPERTY);
    createEAttribute(reflectionPropertyEClass, REFLECTION_PROPERTY__FUNCTION);

    containerNodeEClass = createEClass(CONTAINER_NODE);
    createEReference(containerNodeEClass, CONTAINER_NODE__CONTAINER);

    wildcardNodeEClass = createEClass(WILDCARD_NODE);

    subPathNodeEClass = createEClass(SUB_PATH_NODE);

    collectorEClass = createEClass(COLLECTOR);
    createEAttribute(collectorEClass, COLLECTOR__INSERTION_POINT);
    createEReference(collectorEClass, COLLECTOR__TYPE);
    createEReference(collectorEClass, COLLECTOR__INITIALIZATIONS);

    // Create enums
    reflectionFunctionEEnum = createEEnum(REFLECTION_FUNCTION);
    operatorEEnum = createEEnum(OPERATOR);
    insertionPointEEnum = createEEnum(INSERTION_POINT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
    RecordLangPackage theRecordLangPackage = (RecordLangPackage)EPackage.Registry.INSTANCE.getEPackage(RecordLangPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    floatValueEClass.getESuperTypes().add(this.getValue());
    intValueEClass.getESuperTypes().add(this.getValue());
    stringValueEClass.getESuperTypes().add(this.getValue());
    referenceValueEClass.getESuperTypes().add(this.getValue());
    runtimePropertyEClass.getESuperTypes().add(this.getParameter());
    reflectionPropertyEClass.getESuperTypes().add(this.getParameter());
    containerNodeEClass.getESuperTypes().add(this.getNode());
    wildcardNodeEClass.getESuperTypes().add(this.getNode());
    subPathNodeEClass.getESuperTypes().add(this.getNode());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Metamodels(), this.getMetaModel(), null, "metamodels", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Sources(), this.getApplicationModel(), null, "sources", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaModel_Package(), theEcorePackage.getEPackage(), null, "package", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplicationModel_Metamodel(), this.getMetaModel(), null, "metamodel", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_Model(), theEcorePackage.getEString(), "model", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAspect_Query(), this.getQuery(), null, "query", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspect_Collectors(), this.getCollector(), null, "collectors", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuery_Location(), this.getLocationQuery(), null, "location", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_Modifier(), theStructurePackage.getMethodModifier(), null, "modifier", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_ReturnType(), theStructurePackage.getType(), null, "returnType", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_Method(), theStructurePackage.getMethod(), null, "method", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_Parameter(), this.getParameterPattern(), null, "parameter", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterPatternEClass, ParameterPattern.class, "ParameterPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterPattern_Modifier(), theStructurePackage.getParameterModifier(), null, "modifier", null, 0, 1, ParameterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterPattern_Type(), theStructurePackage.getType(), null, "type", null, 0, 1, ParameterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterPattern_Parameter(), theStructurePackage.getParameter(), null, "parameter", null, 0, 1, ParameterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationQueryEClass, LocationQuery.class, "LocationQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocationQuery_Node(), this.getNode(), null, "node", null, 0, 1, LocationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationQuery_Specialization(), this.getLocationQuery(), null, "specialization", null, 0, 1, LocationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_Parameter(), this.getParamQuery(), null, "parameter", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramQueryEClass, ParamQuery.class, "ParamQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamQuery_Queries(), this.getParamCompare(), null, "queries", null, 0, -1, ParamQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramCompareEClass, ParamCompare.class, "ParamCompare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamCompare_Left(), this.getValue(), null, "left", null, 0, 1, ParamCompare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamCompare_Operator(), this.getOperator(), "operator", null, 0, 1, ParamCompare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParamCompare_Right(), this.getValue(), null, "right", null, 0, 1, ParamCompare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatValue_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceValueEClass, ReferenceValue.class, "ReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceValue_Query(), this.getLocationQuery(), null, "query", null, 0, 1, ReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceValue_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, ReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(runtimePropertyEClass, RuntimeProperty.class, "RuntimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuntimeProperty_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, RuntimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reflectionPropertyEClass, ReflectionProperty.class, "ReflectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReflectionProperty_Function(), this.getReflectionFunction(), "function", null, 0, 1, ReflectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerNodeEClass, ContainerNode.class, "ContainerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerNode_Container(), theStructurePackage.getContainer(), null, "container", null, 0, 1, ContainerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardNodeEClass, WildcardNode.class, "WildcardNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subPathNodeEClass, SubPathNode.class, "SubPathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectorEClass, Collector.class, "Collector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollector_InsertionPoint(), this.getInsertionPoint(), "insertionPoint", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollector_Type(), theRecordLangPackage.getRecordType(), null, "type", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollector_Initializations(), this.getValue(), null, "initializations", null, 0, -1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(reflectionFunctionEEnum, ReflectionFunction.class, "ReflectionFunction");
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.NAME);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.SIGNATURE);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.CLASS);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.RETURN_TYPE);

    initEEnum(operatorEEnum, Operator.class, "Operator");
    addEEnumLiteral(operatorEEnum, Operator.EQ);
    addEEnumLiteral(operatorEEnum, Operator.LIKE);
    addEEnumLiteral(operatorEEnum, Operator.NE);
    addEEnumLiteral(operatorEEnum, Operator.GR);
    addEEnumLiteral(operatorEEnum, Operator.LW);
    addEEnumLiteral(operatorEEnum, Operator.GE);
    addEEnumLiteral(operatorEEnum, Operator.LE);

    initEEnum(insertionPointEEnum, InsertionPoint.class, "InsertionPoint");
    addEEnumLiteral(insertionPointEEnum, InsertionPoint.BEFORE);
    addEEnumLiteral(insertionPointEEnum, InsertionPoint.AFTER);

    // Create resource
    createResource(eNS_URI);
  }

} //ApplicationLangPackageImpl
