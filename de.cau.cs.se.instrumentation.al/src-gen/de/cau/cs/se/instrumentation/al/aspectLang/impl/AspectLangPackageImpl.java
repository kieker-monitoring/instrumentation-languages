/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameterDeclaration;
import de.cau.cs.se.instrumentation.al.aspectLang.Annotation;
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangFactory;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.CompareOperator;
import de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ConstraintElement;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.aspectLang.Event;
import de.cau.cs.se.instrumentation.al.aspectLang.FloatLiteral;
import de.cau.cs.se.instrumentation.al.aspectLang.Import;
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.aspectLang.IntLiteral;
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction;
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.Literal;
import de.cau.cs.se.instrumentation.al.aspectLang.LocalQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator;
import de.cau.cs.se.instrumentation.al.aspectLang.ModelProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.Node;
import de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ParentNode;
import de.cau.cs.se.instrumentation.al.aspectLang.Pointcut;
import de.cau.cs.se.instrumentation.al.aspectLang.Property;
import de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression;
import de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier;
import de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue;
import de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction;
import de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.StringLiteral;
import de.cau.cs.se.instrumentation.al.aspectLang.SubPathNode;
import de.cau.cs.se.instrumentation.al.aspectLang.Typeof;
import de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice;
import de.cau.cs.se.instrumentation.al.aspectLang.Value;
import de.cau.cs.se.instrumentation.al.aspectLang.WildcardNode;

import de.cau.cs.se.instrumentation.al.mapping.MappingPackage;

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
public class AspectLangPackageImpl extends EPackageImpl implements AspectLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aspectModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
  private EClass utilizeAdviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adviceParameterDeclarationEClass = null;

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
  private EClass eventEClass = null;

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
  private EClass referenceValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalFunctionPropertyEClass = null;

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
  private EClass pointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

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
  private EClass compositionQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterQueryEClass = null;

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
  private EClass parentNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyConstraintExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeofEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum insertionPointEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum internalFunctionEEnum = null;

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
  private EEnum queryModifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compareOperatorEEnum = null;

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
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AspectLangPackageImpl()
  {
    super(eNS_URI, AspectLangFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AspectLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AspectLangPackage init()
  {
    if (isInited) return (AspectLangPackage)EPackage.Registry.INSTANCE.getEPackage(AspectLangPackage.eNS_URI);

    // Obtain or create and register package
    AspectLangPackageImpl theAspectLangPackage = (AspectLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AspectLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AspectLangPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RecordLangPackage.eINSTANCE.eClass();
    MappingPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAspectLangPackage.createPackageContents();

    // Initialize created meta-data
    theAspectLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAspectLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AspectLangPackage.eNS_URI, theAspectLangPackage);
    return theAspectLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAspectModel()
  {
    return aspectModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAspectModel_Name()
  {
    return (EAttribute)aspectModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectModel_Imports()
  {
    return (EReference)aspectModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectModel_Sources()
  {
    return (EReference)aspectModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectModel_Advices()
  {
    return (EReference)aspectModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectModel_Pointcuts()
  {
    return (EReference)aspectModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectModel_Aspects()
  {
    return (EReference)aspectModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getApplicationModel_Handler()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(0);
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
  public EReference getAspect_Pointcut()
  {
    return (EReference)aspectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspect_Advices()
  {
    return (EReference)aspectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUtilizeAdvice()
  {
    return utilizeAdviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtilizeAdvice_Advice()
  {
    return (EReference)utilizeAdviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtilizeAdvice_ParameterAssignments()
  {
    return (EReference)utilizeAdviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdvice()
  {
    return adviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdvice_Name()
  {
    return (EAttribute)adviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvice_ParameterDeclarations()
  {
    return (EReference)adviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvice_Collectors()
  {
    return (EReference)adviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdviceParameterDeclaration()
  {
    return adviceParameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdviceParameterDeclaration_Type()
  {
    return (EAttribute)adviceParameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdviceParameterDeclaration_Name()
  {
    return (EAttribute)adviceParameterDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EReference getCollector_Events()
  {
    return (EReference)collectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Type()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Initializations()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
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
  public EReference getReferenceValue_Property()
  {
    return (EReference)referenceValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalFunctionProperty()
  {
    return internalFunctionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInternalFunctionProperty_Function()
  {
    return (EAttribute)internalFunctionPropertyEClass.getEStructuralFeatures().get(0);
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
  public EClass getPointcut()
  {
    return pointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcut_Annotation()
  {
    return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointcut_Name()
  {
    return (EAttribute)pointcutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcut_Location()
  {
    return (EReference)pointcutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcut_Operation()
  {
    return (EReference)pointcutEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Name()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Value()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
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
  public EReference getLocationQuery_Composition()
  {
    return (EReference)locationQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionQuery()
  {
    return compositionQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompositionQuery_Modifier()
  {
    return (EAttribute)compositionQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositionQuery_SubQueries()
  {
    return (EReference)compositionQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationQuery()
  {
    return operationQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationQuery_Modifier()
  {
    return (EReference)operationQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationQuery_ReturnType()
  {
    return (EReference)operationQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationQuery_OperationReference()
  {
    return (EReference)operationQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationQuery_ParameterQueries()
  {
    return (EReference)operationQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterQuery()
  {
    return parameterQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterQuery_Modifier()
  {
    return (EReference)parameterQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterQuery_Type()
  {
    return (EReference)parameterQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterQuery_Parameter()
  {
    return (EReference)parameterQueryEClass.getEStructuralFeatures().get(2);
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
  public EReference getNode_Constraint()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
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
  public EClass getParentNode()
  {
    return parentNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyConstraintExpression()
  {
    return propertyConstraintExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyConstraintExpression_Left()
  {
    return (EReference)propertyConstraintExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyConstraintExpression_Logic()
  {
    return (EAttribute)propertyConstraintExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyConstraintExpression_Right()
  {
    return (EReference)propertyConstraintExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyConstraintExpression_Compare()
  {
    return (EAttribute)propertyConstraintExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintElement()
  {
    return constraintElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalQuery()
  {
    return localQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalQuery_LocationQuery()
  {
    return (EReference)localQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalQuery_Property()
  {
    return (EReference)localQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalQuery_Typeof()
  {
    return (EReference)localQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelProperty()
  {
    return modelPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelProperty_Reference()
  {
    return (EReference)modelPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeof()
  {
    return typeofEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeof_Reference()
  {
    return (EReference)typeofEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatLiteral()
  {
    return floatLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatLiteral_Value()
  {
    return (EAttribute)floatLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteral()
  {
    return intLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteral_Value()
  {
    return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
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
  public EEnum getInternalFunction()
  {
    return internalFunctionEEnum;
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
  public EEnum getQueryModifier()
  {
    return queryModifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicOperator()
  {
    return logicOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCompareOperator()
  {
    return compareOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectLangFactory getAspectLangFactory()
  {
    return (AspectLangFactory)getEFactoryInstance();
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
    aspectModelEClass = createEClass(ASPECT_MODEL);
    createEAttribute(aspectModelEClass, ASPECT_MODEL__NAME);
    createEReference(aspectModelEClass, ASPECT_MODEL__IMPORTS);
    createEReference(aspectModelEClass, ASPECT_MODEL__SOURCES);
    createEReference(aspectModelEClass, ASPECT_MODEL__ADVICES);
    createEReference(aspectModelEClass, ASPECT_MODEL__POINTCUTS);
    createEReference(aspectModelEClass, ASPECT_MODEL__ASPECTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    applicationModelEClass = createEClass(APPLICATION_MODEL);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__HANDLER);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__NAME);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__MODEL);

    aspectEClass = createEClass(ASPECT);
    createEReference(aspectEClass, ASPECT__POINTCUT);
    createEReference(aspectEClass, ASPECT__ADVICES);

    utilizeAdviceEClass = createEClass(UTILIZE_ADVICE);
    createEReference(utilizeAdviceEClass, UTILIZE_ADVICE__ADVICE);
    createEReference(utilizeAdviceEClass, UTILIZE_ADVICE__PARAMETER_ASSIGNMENTS);

    adviceEClass = createEClass(ADVICE);
    createEAttribute(adviceEClass, ADVICE__NAME);
    createEReference(adviceEClass, ADVICE__PARAMETER_DECLARATIONS);
    createEReference(adviceEClass, ADVICE__COLLECTORS);

    adviceParameterDeclarationEClass = createEClass(ADVICE_PARAMETER_DECLARATION);
    createEAttribute(adviceParameterDeclarationEClass, ADVICE_PARAMETER_DECLARATION__TYPE);
    createEAttribute(adviceParameterDeclarationEClass, ADVICE_PARAMETER_DECLARATION__NAME);

    collectorEClass = createEClass(COLLECTOR);
    createEAttribute(collectorEClass, COLLECTOR__INSERTION_POINT);
    createEReference(collectorEClass, COLLECTOR__EVENTS);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__TYPE);
    createEReference(eventEClass, EVENT__INITIALIZATIONS);

    valueEClass = createEClass(VALUE);

    referenceValueEClass = createEClass(REFERENCE_VALUE);
    createEReference(referenceValueEClass, REFERENCE_VALUE__QUERY);
    createEReference(referenceValueEClass, REFERENCE_VALUE__PROPERTY);

    propertyEClass = createEClass(PROPERTY);

    internalFunctionPropertyEClass = createEClass(INTERNAL_FUNCTION_PROPERTY);
    createEAttribute(internalFunctionPropertyEClass, INTERNAL_FUNCTION_PROPERTY__FUNCTION);

    reflectionPropertyEClass = createEClass(REFLECTION_PROPERTY);
    createEAttribute(reflectionPropertyEClass, REFLECTION_PROPERTY__FUNCTION);

    pointcutEClass = createEClass(POINTCUT);
    createEReference(pointcutEClass, POINTCUT__ANNOTATION);
    createEAttribute(pointcutEClass, POINTCUT__NAME);
    createEReference(pointcutEClass, POINTCUT__LOCATION);
    createEReference(pointcutEClass, POINTCUT__OPERATION);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__NAME);
    createEAttribute(annotationEClass, ANNOTATION__VALUE);

    locationQueryEClass = createEClass(LOCATION_QUERY);
    createEReference(locationQueryEClass, LOCATION_QUERY__NODE);
    createEReference(locationQueryEClass, LOCATION_QUERY__SPECIALIZATION);
    createEReference(locationQueryEClass, LOCATION_QUERY__COMPOSITION);

    compositionQueryEClass = createEClass(COMPOSITION_QUERY);
    createEAttribute(compositionQueryEClass, COMPOSITION_QUERY__MODIFIER);
    createEReference(compositionQueryEClass, COMPOSITION_QUERY__SUB_QUERIES);

    operationQueryEClass = createEClass(OPERATION_QUERY);
    createEReference(operationQueryEClass, OPERATION_QUERY__MODIFIER);
    createEReference(operationQueryEClass, OPERATION_QUERY__RETURN_TYPE);
    createEReference(operationQueryEClass, OPERATION_QUERY__OPERATION_REFERENCE);
    createEReference(operationQueryEClass, OPERATION_QUERY__PARAMETER_QUERIES);

    parameterQueryEClass = createEClass(PARAMETER_QUERY);
    createEReference(parameterQueryEClass, PARAMETER_QUERY__MODIFIER);
    createEReference(parameterQueryEClass, PARAMETER_QUERY__TYPE);
    createEReference(parameterQueryEClass, PARAMETER_QUERY__PARAMETER);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__CONSTRAINT);

    containerNodeEClass = createEClass(CONTAINER_NODE);
    createEReference(containerNodeEClass, CONTAINER_NODE__CONTAINER);

    wildcardNodeEClass = createEClass(WILDCARD_NODE);

    subPathNodeEClass = createEClass(SUB_PATH_NODE);

    parentNodeEClass = createEClass(PARENT_NODE);

    propertyConstraintExpressionEClass = createEClass(PROPERTY_CONSTRAINT_EXPRESSION);
    createEReference(propertyConstraintExpressionEClass, PROPERTY_CONSTRAINT_EXPRESSION__LEFT);
    createEAttribute(propertyConstraintExpressionEClass, PROPERTY_CONSTRAINT_EXPRESSION__LOGIC);
    createEReference(propertyConstraintExpressionEClass, PROPERTY_CONSTRAINT_EXPRESSION__RIGHT);
    createEAttribute(propertyConstraintExpressionEClass, PROPERTY_CONSTRAINT_EXPRESSION__COMPARE);

    constraintElementEClass = createEClass(CONSTRAINT_ELEMENT);

    localQueryEClass = createEClass(LOCAL_QUERY);
    createEReference(localQueryEClass, LOCAL_QUERY__LOCATION_QUERY);
    createEReference(localQueryEClass, LOCAL_QUERY__PROPERTY);
    createEReference(localQueryEClass, LOCAL_QUERY__TYPEOF);

    modelPropertyEClass = createEClass(MODEL_PROPERTY);
    createEReference(modelPropertyEClass, MODEL_PROPERTY__REFERENCE);

    typeofEClass = createEClass(TYPEOF);
    createEReference(typeofEClass, TYPEOF__REFERENCE);

    literalEClass = createEClass(LITERAL);

    floatLiteralEClass = createEClass(FLOAT_LITERAL);
    createEAttribute(floatLiteralEClass, FLOAT_LITERAL__VALUE);

    intLiteralEClass = createEClass(INT_LITERAL);
    createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    // Create enums
    insertionPointEEnum = createEEnum(INSERTION_POINT);
    internalFunctionEEnum = createEEnum(INTERNAL_FUNCTION);
    reflectionFunctionEEnum = createEEnum(REFLECTION_FUNCTION);
    queryModifierEEnum = createEEnum(QUERY_MODIFIER);
    logicOperatorEEnum = createEEnum(LOGIC_OPERATOR);
    compareOperatorEEnum = createEEnum(COMPARE_OPERATOR);
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
    RecordLangPackage theRecordLangPackage = (RecordLangPackage)EPackage.Registry.INSTANCE.getEPackage(RecordLangPackage.eNS_URI);
    MappingPackage theMappingPackage = (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    referenceValueEClass.getESuperTypes().add(this.getValue());
    internalFunctionPropertyEClass.getESuperTypes().add(this.getProperty());
    reflectionPropertyEClass.getESuperTypes().add(this.getProperty());
    containerNodeEClass.getESuperTypes().add(this.getNode());
    wildcardNodeEClass.getESuperTypes().add(this.getNode());
    subPathNodeEClass.getESuperTypes().add(this.getNode());
    parentNodeEClass.getESuperTypes().add(this.getNode());
    constraintElementEClass.getESuperTypes().add(this.getPropertyConstraintExpression());
    localQueryEClass.getESuperTypes().add(this.getConstraintElement());
    literalEClass.getESuperTypes().add(this.getValue());
    literalEClass.getESuperTypes().add(this.getConstraintElement());
    floatLiteralEClass.getESuperTypes().add(this.getLiteral());
    intLiteralEClass.getESuperTypes().add(this.getLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(aspectModelEClass, AspectModel.class, "AspectModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAspectModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectModel_Imports(), this.getImport(), null, "imports", null, 0, -1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectModel_Sources(), this.getApplicationModel(), null, "sources", null, 0, -1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectModel_Advices(), this.getAdvice(), null, "advices", null, 0, -1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectModel_Pointcuts(), this.getPointcut(), null, "pointcuts", null, 0, -1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectModel_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, AspectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationModel_Handler(), theEcorePackage.getEString(), "handler", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_Model(), theEcorePackage.getEString(), "model", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAspect_Pointcut(), this.getPointcut(), null, "pointcut", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspect_Advices(), this.getUtilizeAdvice(), null, "advices", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(utilizeAdviceEClass, UtilizeAdvice.class, "UtilizeAdvice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUtilizeAdvice_Advice(), this.getAdvice(), null, "advice", null, 0, 1, UtilizeAdvice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtilizeAdvice_ParameterAssignments(), this.getValue(), null, "parameterAssignments", null, 0, -1, UtilizeAdvice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdvice_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdvice_ParameterDeclarations(), this.getAdviceParameterDeclaration(), null, "parameterDeclarations", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdvice_Collectors(), this.getCollector(), null, "collectors", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adviceParameterDeclarationEClass, AdviceParameterDeclaration.class, "AdviceParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdviceParameterDeclaration_Type(), theEcorePackage.getEString(), "type", null, 0, 1, AdviceParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdviceParameterDeclaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AdviceParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectorEClass, Collector.class, "Collector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollector_InsertionPoint(), this.getInsertionPoint(), "insertionPoint", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollector_Events(), this.getEvent(), null, "events", null, 0, -1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_Type(), theRecordLangPackage.getRecordType(), null, "type", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Initializations(), this.getValue(), null, "initializations", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceValueEClass, ReferenceValue.class, "ReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceValue_Query(), this.getLocationQuery(), null, "query", null, 0, 1, ReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceValue_Property(), this.getProperty(), null, "property", null, 0, 1, ReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(internalFunctionPropertyEClass, InternalFunctionProperty.class, "InternalFunctionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInternalFunctionProperty_Function(), this.getInternalFunction(), "function", null, 0, 1, InternalFunctionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reflectionPropertyEClass, ReflectionProperty.class, "ReflectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReflectionProperty_Function(), this.getReflectionFunction(), "function", null, 0, 1, ReflectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointcut_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPointcut_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPointcut_Location(), this.getLocationQuery(), null, "location", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPointcut_Operation(), this.getOperationQuery(), null, "operation", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnnotation_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationQueryEClass, LocationQuery.class, "LocationQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocationQuery_Node(), this.getNode(), null, "node", null, 0, 1, LocationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationQuery_Specialization(), this.getLocationQuery(), null, "specialization", null, 0, 1, LocationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationQuery_Composition(), this.getCompositionQuery(), null, "composition", null, 0, 1, LocationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionQueryEClass, CompositionQuery.class, "CompositionQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompositionQuery_Modifier(), this.getQueryModifier(), "modifier", null, 0, 1, CompositionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositionQuery_SubQueries(), this.getLocationQuery(), null, "subQueries", null, 0, -1, CompositionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationQueryEClass, OperationQuery.class, "OperationQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationQuery_Modifier(), theMappingPackage.getOperationModifier(), null, "modifier", null, 0, 1, OperationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationQuery_ReturnType(), theMappingPackage.getType(), null, "returnType", null, 0, 1, OperationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationQuery_OperationReference(), theMappingPackage.getOperation(), null, "operationReference", null, 0, 1, OperationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationQuery_ParameterQueries(), this.getParameterQuery(), null, "parameterQueries", null, 0, -1, OperationQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterQueryEClass, ParameterQuery.class, "ParameterQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterQuery_Modifier(), theMappingPackage.getParameterModifier(), null, "modifier", null, 0, 1, ParameterQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterQuery_Type(), theMappingPackage.getType(), null, "type", null, 0, 1, ParameterQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterQuery_Parameter(), theMappingPackage.getParameter(), null, "parameter", null, 0, 1, ParameterQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_Constraint(), this.getPropertyConstraintExpression(), null, "constraint", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerNodeEClass, ContainerNode.class, "ContainerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerNode_Container(), theMappingPackage.getContainer(), null, "container", null, 0, 1, ContainerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardNodeEClass, WildcardNode.class, "WildcardNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subPathNodeEClass, SubPathNode.class, "SubPathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parentNodeEClass, ParentNode.class, "ParentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyConstraintExpressionEClass, PropertyConstraintExpression.class, "PropertyConstraintExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyConstraintExpression_Left(), this.getPropertyConstraintExpression(), null, "left", null, 0, 1, PropertyConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyConstraintExpression_Logic(), this.getLogicOperator(), "logic", null, 0, 1, PropertyConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyConstraintExpression_Right(), this.getPropertyConstraintExpression(), null, "right", null, 0, 1, PropertyConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyConstraintExpression_Compare(), this.getCompareOperator(), "compare", null, 0, 1, PropertyConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintElementEClass, ConstraintElement.class, "ConstraintElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localQueryEClass, LocalQuery.class, "LocalQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalQuery_LocationQuery(), this.getLocationQuery(), null, "locationQuery", null, 0, 1, LocalQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalQuery_Property(), this.getModelProperty(), null, "property", null, 0, 1, LocalQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalQuery_Typeof(), this.getTypeof(), null, "typeof", null, 0, 1, LocalQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelPropertyEClass, ModelProperty.class, "ModelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelProperty_Reference(), theMappingPackage.getFeature(), null, "reference", null, 0, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeofEClass, Typeof.class, "Typeof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeof_Reference(), theMappingPackage.getNamedType(), null, "reference", null, 0, 1, Typeof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatLiteralEClass, FloatLiteral.class, "FloatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatLiteral_Value(), theEcorePackage.getEFloatObject(), "value", null, 0, 1, FloatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteral_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(insertionPointEEnum, InsertionPoint.class, "InsertionPoint");
    addEEnumLiteral(insertionPointEEnum, InsertionPoint.BEFORE);
    addEEnumLiteral(insertionPointEEnum, InsertionPoint.AFTER);

    initEEnum(internalFunctionEEnum, InternalFunction.class, "InternalFunction");
    addEEnumLiteral(internalFunctionEEnum, InternalFunction.TIME);
    addEEnumLiteral(internalFunctionEEnum, InternalFunction.TRACE_ID);
    addEEnumLiteral(internalFunctionEEnum, InternalFunction.ORDER_INDEX);

    initEEnum(reflectionFunctionEEnum, ReflectionFunction.class, "ReflectionFunction");
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.NAME);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.SIGNATURE);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.CLASS);
    addEEnumLiteral(reflectionFunctionEEnum, ReflectionFunction.RETURN_TYPE);

    initEEnum(queryModifierEEnum, QueryModifier.class, "QueryModifier");
    addEEnumLiteral(queryModifierEEnum, QueryModifier.INCLUDE);
    addEEnumLiteral(queryModifierEEnum, QueryModifier.EXCLUDE);

    initEEnum(logicOperatorEEnum, LogicOperator.class, "LogicOperator");
    addEEnumLiteral(logicOperatorEEnum, LogicOperator.AND);
    addEEnumLiteral(logicOperatorEEnum, LogicOperator.OR);

    initEEnum(compareOperatorEEnum, CompareOperator.class, "CompareOperator");
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.EQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.LIKE);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.NE);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.GR);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.LW);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.GE);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.LE);

    // Create resource
    createResource(eNS_URI);
  }

} //AspectLangPackageImpl
