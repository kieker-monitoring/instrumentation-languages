/**
 */
package kieker.develop.al.aspectLang;

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
 * @see kieker.develop.al.aspectLang.AspectLangFactory
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
  AspectLangPackage eINSTANCE = kieker.develop.al.aspectLang.impl.AspectLangPackageImpl.init();

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AspectModelImpl <em>Aspect Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AspectModelImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAspectModel()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ImportImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getImport()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ApplicationModelImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getApplicationModel()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AspectImpl <em>Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AspectImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAspect()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.UtilizeAdviceImpl <em>Utilize Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.UtilizeAdviceImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getUtilizeAdvice()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AdviceImpl <em>Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AdviceImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdvice()
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AdviceParameterDeclarationImpl <em>Advice Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AdviceParameterDeclarationImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdviceParameterDeclaration()
   * @generated
   */
  int ADVICE_PARAMETER_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Advice Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.CollectorImpl <em>Collector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.CollectorImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCollector()
   * @generated
   */
  int COLLECTOR = 7;

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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.EventImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 8;

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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ValueImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 9;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ReferenceValueImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReferenceValue()
   * @generated
   */
  int REFERENCE_VALUE = 10;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__QUERY = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__PROPERTY = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.PropertyImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.InternalFunctionPropertyImpl <em>Internal Function Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.InternalFunctionPropertyImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunctionProperty()
   * @generated
   */
  int INTERNAL_FUNCTION_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FUNCTION_PROPERTY__FUNCTION = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Internal Function Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FUNCTION_PROPERTY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ReflectionPropertyImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReflectionProperty()
   * @generated
   */
  int REFLECTION_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTION_PROPERTY__FUNCTION = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reflection Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.RuntimePropertyImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getRuntimeProperty()
   * @generated
   */
  int RUNTIME_PROPERTY = 14;

  /**
   * The number of structural features of the '<em>Runtime Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AdviceParameterImpl <em>Advice Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AdviceParameterImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdviceParameter()
   * @generated
   */
  int ADVICE_PARAMETER = 15;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER__DECLARATION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER__COLLECTION = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Advice Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_PARAMETER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.PointcutImpl <em>Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.PointcutImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPointcut()
   * @generated
   */
  int POINTCUT = 16;

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
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__MODEL = 2;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__LOCATION = 3;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__OPERATION = 4;

  /**
   * The number of structural features of the '<em>Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.AnnotationImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Technologies</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TECHNOLOGIES = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.QueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 18;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.LocationQueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLocationQuery()
   * @generated
   */
  int LOCATION_QUERY = 19;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__MODIFIER = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__NODE = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__SPECIALIZATION = QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY__COMPOSITION = QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Location Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.CompositionQueryImpl <em>Composition Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.CompositionQueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCompositionQuery()
   * @generated
   */
  int COMPOSITION_QUERY = 20;

  /**
   * The feature id for the '<em><b>Sub Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_QUERY__SUB_QUERIES = QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composition Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.OperationQueryImpl <em>Operation Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.OperationQueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getOperationQuery()
   * @generated
   */
  int OPERATION_QUERY = 21;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_QUERY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_QUERY__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Operation Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_QUERY__OPERATION_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Parameter Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_QUERY__PARAMETER_QUERIES = 3;

  /**
   * The number of structural features of the '<em>Operation Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ParameterQueryImpl <em>Parameter Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ParameterQueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getParameterQuery()
   * @generated
   */
  int PARAMETER_QUERY = 22;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_QUERY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.NodeImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getNode()
   * @generated
   */
  int NODE = 23;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ContainerNodeImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getContainerNode()
   * @generated
   */
  int CONTAINER_NODE = 24;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_NODE__CONSTRAINT = NODE__CONSTRAINT;

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
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.WildcardNodeImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getWildcardNode()
   * @generated
   */
  int WILDCARD_NODE = 25;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_NODE__CONSTRAINT = NODE__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Wildcard Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.SubPathNodeImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getSubPathNode()
   * @generated
   */
  int SUB_PATH_NODE = 26;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PATH_NODE__CONSTRAINT = NODE__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Sub Path Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PATH_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ParentNodeImpl <em>Parent Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ParentNodeImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getParentNode()
   * @generated
   */
  int PARENT_NODE = 27;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_NODE__CONSTRAINT = NODE__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Parent Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.PropertyConstraintImpl <em>Property Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.PropertyConstraintImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPropertyConstraint()
   * @generated
   */
  int PROPERTY_CONSTRAINT = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__LEFT = 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__LOGIC = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Property Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.PropertyConstraintCompareImpl <em>Property Constraint Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.PropertyConstraintCompareImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPropertyConstraintCompare()
   * @generated
   */
  int PROPERTY_CONSTRAINT_COMPARE = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_COMPARE__LEFT = PROPERTY_CONSTRAINT__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_COMPARE__LOGIC = PROPERTY_CONSTRAINT__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_COMPARE__RIGHT = PROPERTY_CONSTRAINT__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_COMPARE__COMPARE = PROPERTY_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Constraint Compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_COMPARE_FEATURE_COUNT = PROPERTY_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ConstraintElementImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getConstraintElement()
   * @generated
   */
  int CONSTRAINT_ELEMENT = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ELEMENT__LEFT = PROPERTY_CONSTRAINT_COMPARE__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ELEMENT__LOGIC = PROPERTY_CONSTRAINT_COMPARE__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ELEMENT__RIGHT = PROPERTY_CONSTRAINT_COMPARE__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ELEMENT__COMPARE = PROPERTY_CONSTRAINT_COMPARE__COMPARE;

  /**
   * The number of structural features of the '<em>Constraint Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ELEMENT_FEATURE_COUNT = PROPERTY_CONSTRAINT_COMPARE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.LocalQueryImpl <em>Local Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.LocalQueryImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLocalQuery()
   * @generated
   */
  int LOCAL_QUERY = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__LEFT = CONSTRAINT_ELEMENT__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__LOGIC = CONSTRAINT_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__RIGHT = CONSTRAINT_ELEMENT__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__COMPARE = CONSTRAINT_ELEMENT__COMPARE;

  /**
   * The feature id for the '<em><b>Location Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__LOCATION_QUERY = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__PROPERTY = CONSTRAINT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Typeof</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY__TYPEOF = CONSTRAINT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Local Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_QUERY_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.ModelPropertyImpl <em>Model Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.ModelPropertyImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getModelProperty()
   * @generated
   */
  int MODEL_PROPERTY = 32;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROPERTY__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Model Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.TypeofImpl <em>Typeof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.TypeofImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTypeof()
   * @generated
   */
  int TYPEOF = 33;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEOF__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Typeof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEOF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.LiteralImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEFT = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LOGIC = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__RIGHT = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__COMPARE = VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.FloatLiteralImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LOGIC = LITERAL__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__COMPARE = LITERAL__COMPARE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.IntLiteralImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__LOGIC = LITERAL__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__COMPARE = LITERAL__COMPARE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.StringLiteralImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LOGIC = LITERAL__LOGIC;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__COMPARE = LITERAL__COMPARE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.impl.TypeReferenceImpl
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 38;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__COLLECTION = 2;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.InsertionPoint <em>Insertion Point</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.InsertionPoint
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInsertionPoint()
   * @generated
   */
  int INSERTION_POINT = 39;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.InternalFunction <em>Internal Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.InternalFunction
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunction()
   * @generated
   */
  int INTERNAL_FUNCTION = 40;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.ReflectionFunction
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReflectionFunction()
   * @generated
   */
  int REFLECTION_FUNCTION = 41;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.Technology <em>Technology</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.Technology
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTechnology()
   * @generated
   */
  int TECHNOLOGY = 42;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.QueryModifier
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
   * @generated
   */
  int QUERY_MODIFIER = 43;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.LogicOperator <em>Logic Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.LogicOperator
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLogicOperator()
   * @generated
   */
  int LOGIC_OPERATOR = 44;

  /**
   * The meta object id for the '{@link kieker.develop.al.aspectLang.CompareOperator <em>Compare Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.al.aspectLang.CompareOperator
   * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCompareOperator()
   * @generated
   */
  int COMPARE_OPERATOR = 45;


  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.AspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Model</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel
   * @generated
   */
  EClass getAspectModel();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.AspectModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getName()
   * @see #getAspectModel()
   * @generated
   */
  EAttribute getAspectModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.AspectModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getImports()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.AspectModel#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getSources()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Sources();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.AspectModel#getAdvices <em>Advices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Advices</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getAdvices()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Advices();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.AspectModel#getPointcuts <em>Pointcuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getPointcuts()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Pointcuts();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.AspectModel#getAspects <em>Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspects</em>'.
   * @see kieker.develop.al.aspectLang.AspectModel#getAspects()
   * @see #getAspectModel()
   * @generated
   */
  EReference getAspectModel_Aspects();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see kieker.develop.al.aspectLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see kieker.develop.al.aspectLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ApplicationModel <em>Application Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Model</em>'.
   * @see kieker.develop.al.aspectLang.ApplicationModel
   * @generated
   */
  EClass getApplicationModel();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.ApplicationModel#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handler</em>'.
   * @see kieker.develop.al.aspectLang.ApplicationModel#getHandler()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Handler();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.ApplicationModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.ApplicationModel#getName()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Name();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.ApplicationModel#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see kieker.develop.al.aspectLang.ApplicationModel#getModel()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Model();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect</em>'.
   * @see kieker.develop.al.aspectLang.Aspect
   * @generated
   */
  EClass getAspect();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.Aspect#getPointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pointcut</em>'.
   * @see kieker.develop.al.aspectLang.Aspect#getPointcut()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Pointcut();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.Aspect#getAdvices <em>Advices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Advices</em>'.
   * @see kieker.develop.al.aspectLang.Aspect#getAdvices()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Advices();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.UtilizeAdvice <em>Utilize Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Utilize Advice</em>'.
   * @see kieker.develop.al.aspectLang.UtilizeAdvice
   * @generated
   */
  EClass getUtilizeAdvice();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.UtilizeAdvice#getAdvice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Advice</em>'.
   * @see kieker.develop.al.aspectLang.UtilizeAdvice#getAdvice()
   * @see #getUtilizeAdvice()
   * @generated
   */
  EReference getUtilizeAdvice_Advice();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.UtilizeAdvice#getParameterAssignments <em>Parameter Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Assignments</em>'.
   * @see kieker.develop.al.aspectLang.UtilizeAdvice#getParameterAssignments()
   * @see #getUtilizeAdvice()
   * @generated
   */
  EReference getUtilizeAdvice_ParameterAssignments();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice</em>'.
   * @see kieker.develop.al.aspectLang.Advice
   * @generated
   */
  EClass getAdvice();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.Advice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.Advice#getName()
   * @see #getAdvice()
   * @generated
   */
  EAttribute getAdvice_Name();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.Advice#getParameterDeclarations <em>Parameter Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
   * @see kieker.develop.al.aspectLang.Advice#getParameterDeclarations()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_ParameterDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.Advice#getCollectors <em>Collectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collectors</em>'.
   * @see kieker.develop.al.aspectLang.Advice#getCollectors()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Collectors();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration <em>Advice Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice Parameter Declaration</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameterDeclaration
   * @generated
   */
  EClass getAdviceParameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameterDeclaration#getType()
   * @see #getAdviceParameterDeclaration()
   * @generated
   */
  EReference getAdviceParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameterDeclaration#getName()
   * @see #getAdviceParameterDeclaration()
   * @generated
   */
  EAttribute getAdviceParameterDeclaration_Name();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Collector <em>Collector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collector</em>'.
   * @see kieker.develop.al.aspectLang.Collector
   * @generated
   */
  EClass getCollector();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.Collector#getInsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insertion Point</em>'.
   * @see kieker.develop.al.aspectLang.Collector#getInsertionPoint()
   * @see #getCollector()
   * @generated
   */
  EAttribute getCollector_InsertionPoint();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.Collector#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see kieker.develop.al.aspectLang.Collector#getEvents()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Events();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see kieker.develop.al.aspectLang.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.Event#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see kieker.develop.al.aspectLang.Event#getType()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Type();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.Event#getInitializations <em>Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initializations</em>'.
   * @see kieker.develop.al.aspectLang.Event#getInitializations()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Initializations();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see kieker.develop.al.aspectLang.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ReferenceValue <em>Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Value</em>'.
   * @see kieker.develop.al.aspectLang.ReferenceValue
   * @generated
   */
  EClass getReferenceValue();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.ReferenceValue#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see kieker.develop.al.aspectLang.ReferenceValue#getQuery()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Query();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.ReferenceValue#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see kieker.develop.al.aspectLang.ReferenceValue#getProperty()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Property();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see kieker.develop.al.aspectLang.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.InternalFunctionProperty <em>Internal Function Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Function Property</em>'.
   * @see kieker.develop.al.aspectLang.InternalFunctionProperty
   * @generated
   */
  EClass getInternalFunctionProperty();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see kieker.develop.al.aspectLang.InternalFunctionProperty#getFunction()
   * @see #getInternalFunctionProperty()
   * @generated
   */
  EAttribute getInternalFunctionProperty_Function();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ReflectionProperty <em>Reflection Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflection Property</em>'.
   * @see kieker.develop.al.aspectLang.ReflectionProperty
   * @generated
   */
  EClass getReflectionProperty();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.ReflectionProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see kieker.develop.al.aspectLang.ReflectionProperty#getFunction()
   * @see #getReflectionProperty()
   * @generated
   */
  EAttribute getReflectionProperty_Function();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.RuntimeProperty <em>Runtime Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runtime Property</em>'.
   * @see kieker.develop.al.aspectLang.RuntimeProperty
   * @generated
   */
  EClass getRuntimeProperty();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.AdviceParameter <em>Advice Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice Parameter</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameter
   * @generated
   */
  EClass getAdviceParameter();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.AdviceParameter#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameter#getDeclaration()
   * @see #getAdviceParameter()
   * @generated
   */
  EReference getAdviceParameter_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.AdviceParameter#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see kieker.develop.al.aspectLang.AdviceParameter#getCollection()
   * @see #getAdviceParameter()
   * @generated
   */
  EReference getAdviceParameter_Collection();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Pointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut
   * @generated
   */
  EClass getPointcut();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.Pointcut#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut#getAnnotation()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Annotation();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.Pointcut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut#getName()
   * @see #getPointcut()
   * @generated
   */
  EAttribute getPointcut_Name();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.Pointcut#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut#getModel()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Model();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.Pointcut#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut#getLocation()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Location();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.Pointcut#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see kieker.develop.al.aspectLang.Pointcut#getOperation()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Operation();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see kieker.develop.al.aspectLang.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.al.aspectLang.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the attribute list '{@link kieker.develop.al.aspectLang.Annotation#getTechnologies <em>Technologies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Technologies</em>'.
   * @see kieker.develop.al.aspectLang.Annotation#getTechnologies()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Technologies();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see kieker.develop.al.aspectLang.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.LocationQuery <em>Location Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Query</em>'.
   * @see kieker.develop.al.aspectLang.LocationQuery
   * @generated
   */
  EClass getLocationQuery();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.LocationQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see kieker.develop.al.aspectLang.LocationQuery#getModifier()
   * @see #getLocationQuery()
   * @generated
   */
  EAttribute getLocationQuery_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocationQuery#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see kieker.develop.al.aspectLang.LocationQuery#getNode()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Node();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization</em>'.
   * @see kieker.develop.al.aspectLang.LocationQuery#getSpecialization()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Specialization();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see kieker.develop.al.aspectLang.LocationQuery#getComposition()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Composition();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.CompositionQuery <em>Composition Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Query</em>'.
   * @see kieker.develop.al.aspectLang.CompositionQuery
   * @generated
   */
  EClass getCompositionQuery();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.CompositionQuery#getSubQueries <em>Sub Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Queries</em>'.
   * @see kieker.develop.al.aspectLang.CompositionQuery#getSubQueries()
   * @see #getCompositionQuery()
   * @generated
   */
  EReference getCompositionQuery_SubQueries();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.OperationQuery <em>Operation Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Query</em>'.
   * @see kieker.develop.al.aspectLang.OperationQuery
   * @generated
   */
  EClass getOperationQuery();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.OperationQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see kieker.develop.al.aspectLang.OperationQuery#getModifier()
   * @see #getOperationQuery()
   * @generated
   */
  EReference getOperationQuery_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.OperationQuery#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see kieker.develop.al.aspectLang.OperationQuery#getReturnType()
   * @see #getOperationQuery()
   * @generated
   */
  EReference getOperationQuery_ReturnType();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.OperationQuery#getOperationReference <em>Operation Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operation Reference</em>'.
   * @see kieker.develop.al.aspectLang.OperationQuery#getOperationReference()
   * @see #getOperationQuery()
   * @generated
   */
  EReference getOperationQuery_OperationReference();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.al.aspectLang.OperationQuery#getParameterQueries <em>Parameter Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Queries</em>'.
   * @see kieker.develop.al.aspectLang.OperationQuery#getParameterQueries()
   * @see #getOperationQuery()
   * @generated
   */
  EReference getOperationQuery_ParameterQueries();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ParameterQuery <em>Parameter Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Query</em>'.
   * @see kieker.develop.al.aspectLang.ParameterQuery
   * @generated
   */
  EClass getParameterQuery();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.ParameterQuery#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see kieker.develop.al.aspectLang.ParameterQuery#getModifier()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.ParameterQuery#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see kieker.develop.al.aspectLang.ParameterQuery#getType()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Type();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.ParameterQuery#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see kieker.develop.al.aspectLang.ParameterQuery#getParameter()
   * @see #getParameterQuery()
   * @generated
   */
  EReference getParameterQuery_Parameter();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see kieker.develop.al.aspectLang.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.Node#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see kieker.develop.al.aspectLang.Node#getConstraint()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Constraint();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ContainerNode <em>Container Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Node</em>'.
   * @see kieker.develop.al.aspectLang.ContainerNode
   * @generated
   */
  EClass getContainerNode();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.ContainerNode#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container</em>'.
   * @see kieker.develop.al.aspectLang.ContainerNode#getContainer()
   * @see #getContainerNode()
   * @generated
   */
  EReference getContainerNode_Container();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.WildcardNode <em>Wildcard Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Node</em>'.
   * @see kieker.develop.al.aspectLang.WildcardNode
   * @generated
   */
  EClass getWildcardNode();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.SubPathNode <em>Sub Path Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Path Node</em>'.
   * @see kieker.develop.al.aspectLang.SubPathNode
   * @generated
   */
  EClass getSubPathNode();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ParentNode <em>Parent Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Node</em>'.
   * @see kieker.develop.al.aspectLang.ParentNode
   * @generated
   */
  EClass getParentNode();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.PropertyConstraint <em>Property Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Constraint</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraint
   * @generated
   */
  EClass getPropertyConstraint();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.PropertyConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraint#getLeft()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Left();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.PropertyConstraint#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraint#getLogic()
   * @see #getPropertyConstraint()
   * @generated
   */
  EAttribute getPropertyConstraint_Logic();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.PropertyConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraint#getRight()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Right();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.PropertyConstraintCompare <em>Property Constraint Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Constraint Compare</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraintCompare
   * @generated
   */
  EClass getPropertyConstraintCompare();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.PropertyConstraintCompare#getCompare <em>Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compare</em>'.
   * @see kieker.develop.al.aspectLang.PropertyConstraintCompare#getCompare()
   * @see #getPropertyConstraintCompare()
   * @generated
   */
  EAttribute getPropertyConstraintCompare_Compare();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ConstraintElement <em>Constraint Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Element</em>'.
   * @see kieker.develop.al.aspectLang.ConstraintElement
   * @generated
   */
  EClass getConstraintElement();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.LocalQuery <em>Local Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Query</em>'.
   * @see kieker.develop.al.aspectLang.LocalQuery
   * @generated
   */
  EClass getLocalQuery();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocalQuery#getLocationQuery <em>Location Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location Query</em>'.
   * @see kieker.develop.al.aspectLang.LocalQuery#getLocationQuery()
   * @see #getLocalQuery()
   * @generated
   */
  EReference getLocalQuery_LocationQuery();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocalQuery#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see kieker.develop.al.aspectLang.LocalQuery#getProperty()
   * @see #getLocalQuery()
   * @generated
   */
  EReference getLocalQuery_Property();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.LocalQuery#getTypeof <em>Typeof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeof</em>'.
   * @see kieker.develop.al.aspectLang.LocalQuery#getTypeof()
   * @see #getLocalQuery()
   * @generated
   */
  EReference getLocalQuery_Typeof();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.ModelProperty <em>Model Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Property</em>'.
   * @see kieker.develop.al.aspectLang.ModelProperty
   * @generated
   */
  EClass getModelProperty();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.ModelProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see kieker.develop.al.aspectLang.ModelProperty#getReference()
   * @see #getModelProperty()
   * @generated
   */
  EReference getModelProperty_Reference();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Typeof <em>Typeof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typeof</em>'.
   * @see kieker.develop.al.aspectLang.Typeof
   * @generated
   */
  EClass getTypeof();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.al.aspectLang.Typeof#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see kieker.develop.al.aspectLang.Typeof#getReference()
   * @see #getTypeof()
   * @generated
   */
  EReference getTypeof_Reference();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see kieker.develop.al.aspectLang.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see kieker.develop.al.aspectLang.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.al.aspectLang.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see kieker.develop.al.aspectLang.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.al.aspectLang.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see kieker.develop.al.aspectLang.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.al.aspectLang.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.al.aspectLang.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see kieker.develop.al.aspectLang.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.TypeReference#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Context</em>'.
   * @see kieker.develop.al.aspectLang.TypeReference#getContext()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Context();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.al.aspectLang.TypeReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see kieker.develop.al.aspectLang.TypeReference#getReference()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Reference();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.al.aspectLang.TypeReference#isCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see kieker.develop.al.aspectLang.TypeReference#isCollection()
   * @see #getTypeReference()
   * @generated
   */
  EAttribute getTypeReference_Collection();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.InsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Insertion Point</em>'.
   * @see kieker.develop.al.aspectLang.InsertionPoint
   * @generated
   */
  EEnum getInsertionPoint();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.InternalFunction <em>Internal Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Internal Function</em>'.
   * @see kieker.develop.al.aspectLang.InternalFunction
   * @generated
   */
  EEnum getInternalFunction();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reflection Function</em>'.
   * @see kieker.develop.al.aspectLang.ReflectionFunction
   * @generated
   */
  EEnum getReflectionFunction();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.Technology <em>Technology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Technology</em>'.
   * @see kieker.develop.al.aspectLang.Technology
   * @generated
   */
  EEnum getTechnology();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.QueryModifier <em>Query Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Query Modifier</em>'.
   * @see kieker.develop.al.aspectLang.QueryModifier
   * @generated
   */
  EEnum getQueryModifier();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.LogicOperator <em>Logic Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Operator</em>'.
   * @see kieker.develop.al.aspectLang.LogicOperator
   * @generated
   */
  EEnum getLogicOperator();

  /**
   * Returns the meta object for enum '{@link kieker.develop.al.aspectLang.CompareOperator <em>Compare Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compare Operator</em>'.
   * @see kieker.develop.al.aspectLang.CompareOperator
   * @generated
   */
  EEnum getCompareOperator();

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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AspectModelImpl <em>Aspect Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AspectModelImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAspectModel()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ImportImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getImport()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ApplicationModelImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getApplicationModel()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AspectImpl <em>Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AspectImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAspect()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.UtilizeAdviceImpl <em>Utilize Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.UtilizeAdviceImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getUtilizeAdvice()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AdviceImpl <em>Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AdviceImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdvice()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AdviceParameterDeclarationImpl <em>Advice Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AdviceParameterDeclarationImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdviceParameterDeclaration()
     * @generated
     */
    EClass ADVICE_PARAMETER_DECLARATION = eINSTANCE.getAdviceParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE_PARAMETER_DECLARATION__TYPE = eINSTANCE.getAdviceParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADVICE_PARAMETER_DECLARATION__NAME = eINSTANCE.getAdviceParameterDeclaration_Name();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.CollectorImpl <em>Collector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.CollectorImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCollector()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.EventImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getEvent()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ValueImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ReferenceValueImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReferenceValue()
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
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE__PROPERTY = eINSTANCE.getReferenceValue_Property();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.PropertyImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.InternalFunctionPropertyImpl <em>Internal Function Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.InternalFunctionPropertyImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunctionProperty()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ReflectionPropertyImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReflectionProperty()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.RuntimePropertyImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getRuntimeProperty()
     * @generated
     */
    EClass RUNTIME_PROPERTY = eINSTANCE.getRuntimeProperty();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AdviceParameterImpl <em>Advice Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AdviceParameterImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAdviceParameter()
     * @generated
     */
    EClass ADVICE_PARAMETER = eINSTANCE.getAdviceParameter();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE_PARAMETER__DECLARATION = eINSTANCE.getAdviceParameter_Declaration();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE_PARAMETER__COLLECTION = eINSTANCE.getAdviceParameter_Collection();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.PointcutImpl <em>Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.PointcutImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPointcut()
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
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__MODEL = eINSTANCE.getPointcut_Model();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__LOCATION = eINSTANCE.getPointcut_Location();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__OPERATION = eINSTANCE.getPointcut_Operation();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.AnnotationImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getAnnotation()
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
     * The meta object literal for the '<em><b>Technologies</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__TECHNOLOGIES = eINSTANCE.getAnnotation_Technologies();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.QueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.LocationQueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLocationQuery()
     * @generated
     */
    EClass LOCATION_QUERY = eINSTANCE.getLocationQuery();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_QUERY__MODIFIER = eINSTANCE.getLocationQuery_Modifier();

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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.CompositionQueryImpl <em>Composition Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.CompositionQueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCompositionQuery()
     * @generated
     */
    EClass COMPOSITION_QUERY = eINSTANCE.getCompositionQuery();

    /**
     * The meta object literal for the '<em><b>Sub Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION_QUERY__SUB_QUERIES = eINSTANCE.getCompositionQuery_SubQueries();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.OperationQueryImpl <em>Operation Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.OperationQueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getOperationQuery()
     * @generated
     */
    EClass OPERATION_QUERY = eINSTANCE.getOperationQuery();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_QUERY__MODIFIER = eINSTANCE.getOperationQuery_Modifier();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_QUERY__RETURN_TYPE = eINSTANCE.getOperationQuery_ReturnType();

    /**
     * The meta object literal for the '<em><b>Operation Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_QUERY__OPERATION_REFERENCE = eINSTANCE.getOperationQuery_OperationReference();

    /**
     * The meta object literal for the '<em><b>Parameter Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_QUERY__PARAMETER_QUERIES = eINSTANCE.getOperationQuery_ParameterQueries();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ParameterQueryImpl <em>Parameter Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ParameterQueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getParameterQuery()
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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.NodeImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__CONSTRAINT = eINSTANCE.getNode_Constraint();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ContainerNodeImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getContainerNode()
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
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.WildcardNodeImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getWildcardNode()
     * @generated
     */
    EClass WILDCARD_NODE = eINSTANCE.getWildcardNode();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.SubPathNodeImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getSubPathNode()
     * @generated
     */
    EClass SUB_PATH_NODE = eINSTANCE.getSubPathNode();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ParentNodeImpl <em>Parent Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ParentNodeImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getParentNode()
     * @generated
     */
    EClass PARENT_NODE = eINSTANCE.getParentNode();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.PropertyConstraintImpl <em>Property Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.PropertyConstraintImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPropertyConstraint()
     * @generated
     */
    EClass PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__LEFT = eINSTANCE.getPropertyConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONSTRAINT__LOGIC = eINSTANCE.getPropertyConstraint_Logic();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__RIGHT = eINSTANCE.getPropertyConstraint_Right();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.PropertyConstraintCompareImpl <em>Property Constraint Compare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.PropertyConstraintCompareImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getPropertyConstraintCompare()
     * @generated
     */
    EClass PROPERTY_CONSTRAINT_COMPARE = eINSTANCE.getPropertyConstraintCompare();

    /**
     * The meta object literal for the '<em><b>Compare</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONSTRAINT_COMPARE__COMPARE = eINSTANCE.getPropertyConstraintCompare_Compare();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ConstraintElementImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getConstraintElement()
     * @generated
     */
    EClass CONSTRAINT_ELEMENT = eINSTANCE.getConstraintElement();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.LocalQueryImpl <em>Local Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.LocalQueryImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLocalQuery()
     * @generated
     */
    EClass LOCAL_QUERY = eINSTANCE.getLocalQuery();

    /**
     * The meta object literal for the '<em><b>Location Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_QUERY__LOCATION_QUERY = eINSTANCE.getLocalQuery_LocationQuery();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_QUERY__PROPERTY = eINSTANCE.getLocalQuery_Property();

    /**
     * The meta object literal for the '<em><b>Typeof</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_QUERY__TYPEOF = eINSTANCE.getLocalQuery_Typeof();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.ModelPropertyImpl <em>Model Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.ModelPropertyImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getModelProperty()
     * @generated
     */
    EClass MODEL_PROPERTY = eINSTANCE.getModelProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_PROPERTY__REFERENCE = eINSTANCE.getModelProperty_Reference();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.TypeofImpl <em>Typeof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.TypeofImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTypeof()
     * @generated
     */
    EClass TYPEOF = eINSTANCE.getTypeof();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEOF__REFERENCE = eINSTANCE.getTypeof_Reference();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.LiteralImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.FloatLiteralImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.IntLiteralImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.StringLiteralImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.impl.TypeReferenceImpl
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__CONTEXT = eINSTANCE.getTypeReference_Context();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__REFERENCE = eINSTANCE.getTypeReference_Reference();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REFERENCE__COLLECTION = eINSTANCE.getTypeReference_Collection();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.InsertionPoint <em>Insertion Point</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.InsertionPoint
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInsertionPoint()
     * @generated
     */
    EEnum INSERTION_POINT = eINSTANCE.getInsertionPoint();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.InternalFunction <em>Internal Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.InternalFunction
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunction()
     * @generated
     */
    EEnum INTERNAL_FUNCTION = eINSTANCE.getInternalFunction();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.ReflectionFunction
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getReflectionFunction()
     * @generated
     */
    EEnum REFLECTION_FUNCTION = eINSTANCE.getReflectionFunction();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.Technology <em>Technology</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.Technology
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getTechnology()
     * @generated
     */
    EEnum TECHNOLOGY = eINSTANCE.getTechnology();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.QueryModifier
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
     * @generated
     */
    EEnum QUERY_MODIFIER = eINSTANCE.getQueryModifier();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.LogicOperator <em>Logic Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.LogicOperator
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getLogicOperator()
     * @generated
     */
    EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

    /**
     * The meta object literal for the '{@link kieker.develop.al.aspectLang.CompareOperator <em>Compare Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.al.aspectLang.CompareOperator
     * @see kieker.develop.al.aspectLang.impl.AspectLangPackageImpl#getCompareOperator()
     * @generated
     */
    EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

  }

} //AspectLangPackage
