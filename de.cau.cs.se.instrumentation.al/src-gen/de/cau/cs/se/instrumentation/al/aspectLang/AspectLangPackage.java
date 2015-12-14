/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangFactory
 * @model kind="package"
 * @generated
 */
public interface AspectLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aspectLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/se/instrumentation/al/AspectLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aspectLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AspectLangPackage eINSTANCE = de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl <em>Aspect Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAspectModel()
   * @generated
   */
  int ASPECT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__SOURCES = 2;

  /**
   * The feature id for the '<em><b>Advices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__ADVICES = 3;

  /**
   * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__POINTCUTS = 4;

  /**
   * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL__ASPECTS = 5;

  /**
   * The number of structural features of the '<em>Aspect Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ImportImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getApplicationModel()
   * @generated
   */
  int APPLICATION_MODEL = 2;

  /**
   * The feature id for the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__HANDLER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__NAME = 1;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__MODEL = 2;

  /**
   * The number of structural features of the '<em>Application Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl <em>Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAspect()
   * @generated
   */
  int ASPECT = 3;

  /**
   * The feature id for the '<em><b>Pointcut</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__POINTCUT = 0;

  /**
   * The feature id for the '<em><b>Advices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__ADVICES = 1;

  /**
   * The number of structural features of the '<em>Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeAdviceImpl <em>Utilize Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeAdviceImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getUtilizeAdvice()
   * @generated
   */
  int UTILIZE_ADVICE = 4;

  /**
   * The feature id for the '<em><b>Advice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTILIZE_ADVICE__ADVICE = 0;

  /**
   * The feature id for the '<em><b>Parameter Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTILIZE_ADVICE__PARAMETER_ASSIGNMENTS = 1;

  /**
   * The number of structural features of the '<em>Utilize Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTILIZE_ADVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AdviceImpl <em>Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AdviceImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAdvice()
   * @generated
   */
  int ADVICE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__PARAMETER_DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Collectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__COLLECTORS = 2;

  /**
   * The number of structural features of the '<em>Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterDeclarationImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PointcutImpl <em>Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.PointcutImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getPointcut()
   * @generated
   */
  int POINTCUT = 7;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__NAME = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__LOCATION = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__METHOD = 3;

  /**
   * The number of structural features of the '<em>Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AnnotationImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl <em>Method Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getMethodQuery()
   * @generated
   */
  int METHOD_QUERY = 9;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Method Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY__METHOD_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Parameter Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY__PARAMETER_QUERIES = 3;

  /**
   * The number of structural features of the '<em>Method Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterQueryImpl <em>Parameter Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterQuery()
   * @generated
   */
  int PARAMETER_QUERY = 10;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUERY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUERY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUERY__PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Parameter Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUERY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getLocationQuery()
   * @generated
   */
  int LOCATION_QUERY = 11;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__NODE = 0;

  /**
   * The feature id for the '<em><b>Specialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__SPECIALIZATION = 1;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__COMPOSITION = 2;

  /**
   * The number of structural features of the '<em>Location Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CompositionQueryImpl <em>Composition Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.CompositionQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getCompositionQuery()
   * @generated
   */
  int COMPOSITION_QUERY = 12;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_QUERY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Sub Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_QUERY__SUB_QUERIES = 1;

  /**
   * The number of structural features of the '<em>Composition Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_QUERY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.NodeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getNode()
   * @generated
   */
  int NODE = 13;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamQueryImpl <em>Param Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamQuery()
   * @generated
   */
  int PARAM_QUERY = 14;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_QUERY__QUERIES = 0;

  /**
   * The number of structural features of the '<em>Param Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamExpressionImpl <em>Param Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamExpressionImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamExpression()
   * @generated
   */
  int PARAM_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EXPRESSION__LOGIC = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EXPRESSION__OPERATOR = 3;

  /**
   * The number of structural features of the '<em>Param Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.FloatValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__LEFT = PARAM_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__LOGIC = PARAM_EXPRESSION__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__RIGHT = PARAM_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__OPERATOR = PARAM_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = PARAM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = PARAM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__LEFT = PARAM_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__LOGIC = PARAM_EXPRESSION__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__RIGHT = PARAM_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__OPERATOR = PARAM_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = PARAM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = PARAM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__LEFT = PARAM_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__LOGIC = PARAM_EXPRESSION__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__RIGHT = PARAM_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__OPERATOR = PARAM_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = PARAM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = PARAM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReferenceValue()
   * @generated
   */
  int REFERENCE_VALUE = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__LEFT = PARAM_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__LOGIC = PARAM_EXPRESSION__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__RIGHT = PARAM_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__OPERATOR = PARAM_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__QUERY = PARAM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__PARAMETER = PARAM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_FEATURE_COUNT = PARAM_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 20;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.InternalFunctionPropertyImpl <em>Internal Function Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.InternalFunctionPropertyImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunctionProperty()
   * @generated
   */
  int INTERNAL_FUNCTION_PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FUNCTION_PROPERTY__FUNCTION = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Internal Function Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FUNCTION_PROPERTY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.RuntimePropertyImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getRuntimeProperty()
   * @generated
   */
  int RUNTIME_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_PROPERTY__REFERENCE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Runtime Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_PROPERTY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ReflectionPropertyImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReflectionProperty()
   * @generated
   */
  int REFLECTION_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTION_PROPERTY__FUNCTION = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reflection Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTION_PROPERTY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ContainerNodeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getContainerNode()
   * @generated
   */
  int CONTAINER_NODE = 24;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_NODE__PARAMETER = NODE__PARAMETER;

  /**
   * The feature id for the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_NODE__CONTAINER = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Container Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.WildcardNodeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getWildcardNode()
   * @generated
   */
  int WILDCARD_NODE = 25;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_NODE__PARAMETER = NODE__PARAMETER;

  /**
   * The number of structural features of the '<em>Wildcard Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.SubPathNodeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getSubPathNode()
   * @generated
   */
  int SUB_PATH_NODE = 26;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PATH_NODE__PARAMETER = NODE__PARAMETER;

  /**
   * The number of structural features of the '<em>Sub Path Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PATH_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParentNodeImpl <em>Parent Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParentNodeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParentNode()
   * @generated
   */
  int PARENT_NODE = 27;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_NODE__PARAMETER = NODE__PARAMETER;

  /**
   * The number of structural features of the '<em>Parent Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl <em>Collector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getCollector()
   * @generated
   */
  int COLLECTOR = 28;

  /**
   * The feature id for the '<em><b>Insertion Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR__INSERTION_POINT = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR__EVENTS = 1;

  /**
   * The number of structural features of the '<em>Collector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.EventImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initializations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__INITIALIZATIONS = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
   * @generated
   */
  int QUERY_MODIFIER = 30;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator <em>Logic Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getLogicOperator()
   * @generated
   */
  int LOGIC_OPERATOR = 31;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction <em>Internal Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunction()
   * @generated
   */
  int INTERNAL_FUNCTION = 32;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReflectionFunction()
   * @generated
   */
  int REFLECTION_FUNCTION = 33;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 34;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint <em>Insertion Point</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInsertionPoint()
   * @generated
   */
  int INSERTION_POINT = 35;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel
   * @generated
   */
  EClass getAspectModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getName()
   * @see #getAspectModel()
   * @generated
   */
  EAttribute getAspectModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getImports()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getSources()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Sources();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getAdvices <em>Advices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Advices</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getAdvices()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Advices();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getPointcuts <em>Pointcuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getPointcuts()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Pointcuts();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getAspects <em>Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspects</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectModel#getAspects()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Aspects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel <em>Application Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel
   * @generated
   */
  EClass getApplicationModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handler</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getHandler()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Handler();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getName()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getModel()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Model();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect
   * @generated
   */
  EClass getAspect();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getPointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pointcut</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getPointcut()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Pointcut();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getAdvices <em>Advices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Advices</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getAdvices()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Advices();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice <em>Utilize Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Utilize Advice</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice
   * @generated
   */
  EClass getUtilizeAdvice();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getAdvice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Advice</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getAdvice()
   * @see #getUtilizeAdvice()
   * @generated
   */
  EReference getUtilizeAdvice_Advice();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getParameterAssignments <em>Parameter Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Assignments</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getParameterAssignments()
   * @see #getUtilizeAdvice()
   * @generated
   */
  EReference getUtilizeAdvice_ParameterAssignments();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Advice
   * @generated
   */
  EClass getAdvice();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Advice#getName()
   * @see #getAdvice()
   * @generated
   */
  EAttribute getAdvice_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getParameterDeclarations <em>Parameter Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Advice#getParameterDeclarations()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_ParameterDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getCollectors <em>Collectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collectors</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Advice#getCollectors()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Collectors();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration#getType()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration#getName()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Pointcut
   * @generated
   */
  EClass getPointcut();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getAnnotation()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Annotation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getName()
   * @see #getPointcut()
   * @generated
   */
  EAttribute getPointcut_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getLocation()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Location();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getMethod()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Method();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery <em>Method Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery
   * @generated
   */
  EClass getMethodQuery();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getModifier()
   * @see #getMethodQuery()
   * @generated
   */
  EReference getMethodQuery_Modifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getReturnType()
   * @see #getMethodQuery()
   * @generated
   */
  EReference getMethodQuery_ReturnType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getMethodReference <em>Method Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method Reference</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getMethodReference()
   * @see #getMethodQuery()
   * @generated
   */
  EReference getMethodQuery_MethodReference();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getParameterQueries <em>Parameter Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Queries</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getParameterQueries()
   * @see #getMethodQuery()
   * @generated
   */
  EReference getMethodQuery_ParameterQueries();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery <em>Parameter Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery
   * @generated
   */
  EClass getParameterQuery();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getModifier()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Modifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getType()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery#getParameter()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery <em>Location Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery
   * @generated
   */
  EClass getLocationQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getNode()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Node();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getSpecialization()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Specialization();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery#getComposition()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Composition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery <em>Composition Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery
   * @generated
   */
  EClass getCompositionQuery();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getModifier()
   * @see #getCompositionQuery()
   * @generated
   */
  EAttribute getCompositionQuery_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getSubQueries <em>Sub Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Queries</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getSubQueries()
   * @see #getCompositionQuery()
   * @generated
   */
  EReference getCompositionQuery_SubQueries();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Node#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Node#getParameter()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamQuery <em>Param Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamQuery
   * @generated
   */
  EClass getParamQuery();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamQuery#getQueries()
   * @see #getParamQuery()
   * @generated
   */
  EReference getParamQuery_Queries();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression <em>Param Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Expression</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression
   * @generated
   */
  EClass getParamExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLeft()
   * @see #getParamExpression()
   * @generated
   */
  EReference getParamExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLogic()
   * @see #getParamExpression()
   * @generated
   */
  EAttribute getParamExpression_Logic();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getRight()
   * @see #getParamExpression()
   * @generated
   */
  EReference getParamExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getOperator()
   * @see #getParamExpression()
   * @generated
   */
  EAttribute getParamExpression_Operator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue <em>Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue
   * @generated
   */
  EClass getReferenceValue();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getQuery()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Query();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getParameter()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty <em>Internal Function Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Function Property</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty
   * @generated
   */
  EClass getInternalFunctionProperty();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty#getFunction()
   * @see #getInternalFunctionProperty()
   * @generated
   */
  EAttribute getInternalFunctionProperty_Function();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty <em>Runtime Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runtime Property</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty
   * @generated
   */
  EClass getRuntimeProperty();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty#getReference()
   * @see #getRuntimeProperty()
   * @generated
   */
  EAttribute getRuntimeProperty_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty <em>Reflection Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflection Property</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty
   * @generated
   */
  EClass getReflectionProperty();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty#getFunction()
   * @see #getReflectionProperty()
   * @generated
   */
  EAttribute getReflectionProperty_Function();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode <em>Container Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode
   * @generated
   */
  EClass getContainerNode();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode#getContainer()
   * @see #getContainerNode()
   * @generated
   */
  EReference getContainerNode_Container();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.WildcardNode <em>Wildcard Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.WildcardNode
   * @generated
   */
  EClass getWildcardNode();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.SubPathNode <em>Sub Path Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Path Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.SubPathNode
   * @generated
   */
  EClass getSubPathNode();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParentNode <em>Parent Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParentNode
   * @generated
   */
  EClass getParentNode();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector <em>Collector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collector</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Collector
   * @generated
   */
  EClass getCollector();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insertion Point</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInsertionPoint()
   * @see #getCollector()
   * @generated
   */
  EAttribute getCollector_InsertionPoint();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Collector#getEvents()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Events();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Event#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Event#getType()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Event#getInitializations <em>Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initializations</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Event#getInitializations()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Initializations();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier <em>Query Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Query Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
   * @generated
   */
  EEnum getQueryModifier();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator <em>Logic Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @generated
   */
  EEnum getLogicOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction <em>Internal Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Internal Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
   * @generated
   */
  EEnum getInternalFunction();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reflection Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction
   * @generated
   */
  EEnum getReflectionFunction();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Insertion Point</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
   * @generated
   */
  EEnum getInsertionPoint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AspectLangFactory getAspectLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl <em>Aspect Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAspectModel()
     * @generated
     */
    EClass ASPECT_MODEL = eINSTANCE.getAspectModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASPECT_MODEL__NAME = eINSTANCE.getAspectModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_MODEL__IMPORTS = eINSTANCE.getAspectModel_Imports();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_MODEL__SOURCES = eINSTANCE.getAspectModel_Sources();

    /**
     * The meta object literal for the '<em><b>Advices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_MODEL__ADVICES = eINSTANCE.getAspectModel_Advices();

    /**
     * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_MODEL__POINTCUTS = eINSTANCE.getAspectModel_Pointcuts();

    /**
     * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_MODEL__ASPECTS = eINSTANCE.getAspectModel_Aspects();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ImportImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getApplicationModel()
     * @generated
     */
    EClass APPLICATION_MODEL = eINSTANCE.getApplicationModel();

    /**
     * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__HANDLER = eINSTANCE.getApplicationModel_Handler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__NAME = eINSTANCE.getApplicationModel_Name();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__MODEL = eINSTANCE.getApplicationModel_Model();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl <em>Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAspect()
     * @generated
     */
    EClass ASPECT = eINSTANCE.getAspect();

    /**
     * The meta object literal for the '<em><b>Pointcut</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__POINTCUT = eINSTANCE.getAspect_Pointcut();

    /**
     * The meta object literal for the '<em><b>Advices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__ADVICES = eINSTANCE.getAspect_Advices();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeAdviceImpl <em>Utilize Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeAdviceImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getUtilizeAdvice()
     * @generated
     */
    EClass UTILIZE_ADVICE = eINSTANCE.getUtilizeAdvice();

    /**
     * The meta object literal for the '<em><b>Advice</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTILIZE_ADVICE__ADVICE = eINSTANCE.getUtilizeAdvice_Advice();

    /**
     * The meta object literal for the '<em><b>Parameter Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTILIZE_ADVICE__PARAMETER_ASSIGNMENTS = eINSTANCE.getUtilizeAdvice_ParameterAssignments();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AdviceImpl <em>Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AdviceImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAdvice()
     * @generated
     */
    EClass ADVICE = eINSTANCE.getAdvice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADVICE__NAME = eINSTANCE.getAdvice_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__PARAMETER_DECLARATIONS = eINSTANCE.getAdvice_ParameterDeclarations();

    /**
     * The meta object literal for the '<em><b>Collectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__COLLECTORS = eINSTANCE.getAdvice_Collectors();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterDeclarationImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__TYPE = eINSTANCE.getParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__NAME = eINSTANCE.getParameterDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PointcutImpl <em>Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.PointcutImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getPointcut()
     * @generated
     */
    EClass POINTCUT = eINSTANCE.getPointcut();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__ANNOTATION = eINSTANCE.getPointcut_Annotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTCUT__NAME = eINSTANCE.getPointcut_Name();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__LOCATION = eINSTANCE.getPointcut_Location();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__METHOD = eINSTANCE.getPointcut_Method();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AnnotationImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl <em>Method Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getMethodQuery()
     * @generated
     */
    EClass METHOD_QUERY = eINSTANCE.getMethodQuery();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_QUERY__MODIFIER = eINSTANCE.getMethodQuery_Modifier();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_QUERY__RETURN_TYPE = eINSTANCE.getMethodQuery_ReturnType();

    /**
     * The meta object literal for the '<em><b>Method Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_QUERY__METHOD_REFERENCE = eINSTANCE.getMethodQuery_MethodReference();

    /**
     * The meta object literal for the '<em><b>Parameter Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_QUERY__PARAMETER_QUERIES = eINSTANCE.getMethodQuery_ParameterQueries();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterQueryImpl <em>Parameter Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterQueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterQuery()
     * @generated
     */
    EClass PARAMETER_QUERY = eINSTANCE.getParameterQuery();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_QUERY__MODIFIER = eINSTANCE.getParameterQuery_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_QUERY__TYPE = eINSTANCE.getParameterQuery_Type();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_QUERY__PARAMETER = eINSTANCE.getParameterQuery_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getLocationQuery()
     * @generated
     */
    EClass LOCATION_QUERY = eINSTANCE.getLocationQuery();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_QUERY__NODE = eINSTANCE.getLocationQuery_Node();

    /**
     * The meta object literal for the '<em><b>Specialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_QUERY__SPECIALIZATION = eINSTANCE.getLocationQuery_Specialization();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_QUERY__COMPOSITION = eINSTANCE.getLocationQuery_Composition();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CompositionQueryImpl <em>Composition Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.CompositionQueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getCompositionQuery()
     * @generated
     */
    EClass COMPOSITION_QUERY = eINSTANCE.getCompositionQuery();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITION_QUERY__MODIFIER = eINSTANCE.getCompositionQuery_Modifier();

    /**
     * The meta object literal for the '<em><b>Sub Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION_QUERY__SUB_QUERIES = eINSTANCE.getCompositionQuery_SubQueries();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.NodeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PARAMETER = eINSTANCE.getNode_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamQueryImpl <em>Param Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamQueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamQuery()
     * @generated
     */
    EClass PARAM_QUERY = eINSTANCE.getParamQuery();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_QUERY__QUERIES = eINSTANCE.getParamQuery_Queries();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamExpressionImpl <em>Param Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamExpressionImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamExpression()
     * @generated
     */
    EClass PARAM_EXPRESSION = eINSTANCE.getParamExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_EXPRESSION__LEFT = eINSTANCE.getParamExpression_Left();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_EXPRESSION__LOGIC = eINSTANCE.getParamExpression_Logic();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_EXPRESSION__RIGHT = eINSTANCE.getParamExpression_Right();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_EXPRESSION__OPERATOR = eINSTANCE.getParamExpression_Operator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.FloatValueImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReferenceValue()
     * @generated
     */
    EClass REFERENCE_VALUE = eINSTANCE.getReferenceValue();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE__QUERY = eINSTANCE.getReferenceValue_Query();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE__PARAMETER = eINSTANCE.getReferenceValue_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.InternalFunctionPropertyImpl <em>Internal Function Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.InternalFunctionPropertyImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunctionProperty()
     * @generated
     */
    EClass INTERNAL_FUNCTION_PROPERTY = eINSTANCE.getInternalFunctionProperty();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERNAL_FUNCTION_PROPERTY__FUNCTION = eINSTANCE.getInternalFunctionProperty_Function();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.RuntimePropertyImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getRuntimeProperty()
     * @generated
     */
    EClass RUNTIME_PROPERTY = eINSTANCE.getRuntimeProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUNTIME_PROPERTY__REFERENCE = eINSTANCE.getRuntimeProperty_Reference();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ReflectionPropertyImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReflectionProperty()
     * @generated
     */
    EClass REFLECTION_PROPERTY = eINSTANCE.getReflectionProperty();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFLECTION_PROPERTY__FUNCTION = eINSTANCE.getReflectionProperty_Function();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ContainerNodeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getContainerNode()
     * @generated
     */
    EClass CONTAINER_NODE = eINSTANCE.getContainerNode();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_NODE__CONTAINER = eINSTANCE.getContainerNode_Container();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.WildcardNodeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getWildcardNode()
     * @generated
     */
    EClass WILDCARD_NODE = eINSTANCE.getWildcardNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.SubPathNodeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getSubPathNode()
     * @generated
     */
    EClass SUB_PATH_NODE = eINSTANCE.getSubPathNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParentNodeImpl <em>Parent Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParentNodeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParentNode()
     * @generated
     */
    EClass PARENT_NODE = eINSTANCE.getParentNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl <em>Collector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getCollector()
     * @generated
     */
    EClass COLLECTOR = eINSTANCE.getCollector();

    /**
     * The meta object literal for the '<em><b>Insertion Point</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTOR__INSERTION_POINT = eINSTANCE.getCollector_InsertionPoint();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTOR__EVENTS = eINSTANCE.getCollector_Events();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.EventImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__TYPE = eINSTANCE.getEvent_Type();

    /**
     * The meta object literal for the '<em><b>Initializations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__INITIALIZATIONS = eINSTANCE.getEvent_Initializations();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
     * @generated
     */
    EEnum QUERY_MODIFIER = eINSTANCE.getQueryModifier();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator <em>Logic Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getLogicOperator()
     * @generated
     */
    EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction <em>Internal Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunction()
     * @generated
     */
    EEnum INTERNAL_FUNCTION = eINSTANCE.getInternalFunction();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReflectionFunction()
     * @generated
     */
    EEnum REFLECTION_FUNCTION = eINSTANCE.getReflectionFunction();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint <em>Insertion Point</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInsertionPoint()
     * @generated
     */
    EEnum INSERTION_POINT = eINSTANCE.getInsertionPoint();

  }

} //AspectLangPackage
