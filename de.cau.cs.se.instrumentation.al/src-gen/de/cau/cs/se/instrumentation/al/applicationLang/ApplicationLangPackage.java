/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

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
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "applicationLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/se/instrumentation/al/ApplicationLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "applicationLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationLangPackage eINSTANCE = de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SOURCES = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASPECTS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ImportImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getImport()
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationModelImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getApplicationModel()
   * @generated
   */
  int APPLICATION_MODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__MODEL = 1;

  /**
   * The number of structural features of the '<em>Application Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.AspectImpl <em>Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.AspectImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getAspect()
   * @generated
   */
  int ASPECT = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__QUERY = 1;

  /**
   * The feature id for the '<em><b>Collectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__COLLECTORS = 2;

  /**
   * The number of structural features of the '<em>Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.QueryImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 4;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__LOCATION = 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__MODIFIER = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__RETURN_TYPE = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__METHOD = 3;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PARAMETER = 4;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterPatternImpl <em>Parameter Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterPatternImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParameterPattern()
   * @generated
   */
  int PARAMETER_PATTERN = 5;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PATTERN__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PATTERN__TYPE = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PATTERN__PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Parameter Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PATTERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.LocationQueryImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getLocationQuery()
   * @generated
   */
  int LOCATION_QUERY = 6;

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
   * The number of structural features of the '<em>Location Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_QUERY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.NodeImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getNode()
   * @generated
   */
  int NODE = 7;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamQueryImpl <em>Param Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamQueryImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParamQuery()
   * @generated
   */
  int PARAM_QUERY = 8;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamCompareImpl <em>Param Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamCompareImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParamCompare()
   * @generated
   */
  int PARAM_COMPARE = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_COMPARE__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_COMPARE__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_COMPARE__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Param Compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_COMPARE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ValueImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 10;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.FloatValueImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.IntValueImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.StringValueImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ReferenceValueImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReferenceValue()
   * @generated
   */
  int REFERENCE_VALUE = 14;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__QUERY = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE__PARAMETER = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 15;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.RuntimePropertyImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getRuntimeProperty()
   * @generated
   */
  int RUNTIME_PROPERTY = 16;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ReflectionPropertyImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReflectionProperty()
   * @generated
   */
  int REFLECTION_PROPERTY = 17;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ContainerNodeImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getContainerNode()
   * @generated
   */
  int CONTAINER_NODE = 18;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.WildcardNodeImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getWildcardNode()
   * @generated
   */
  int WILDCARD_NODE = 19;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.SubPathNodeImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getSubPathNode()
   * @generated
   */
  int SUB_PATH_NODE = 20;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.CollectorImpl <em>Collector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.CollectorImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getCollector()
   * @generated
   */
  int COLLECTOR = 21;

  /**
   * The feature id for the '<em><b>Insertion Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR__INSERTION_POINT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR__TYPE = 1;

  /**
   * The feature id for the '<em><b>Initializations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR__INITIALIZATIONS = 2;

  /**
   * The number of structural features of the '<em>Collector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.WoldcardNodeImpl <em>Woldcard Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.WoldcardNodeImpl
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getWoldcardNode()
   * @generated
   */
  int WOLDCARD_NODE = 22;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOLDCARD_NODE__PARAMETER = WILDCARD_NODE__PARAMETER;

  /**
   * The number of structural features of the '<em>Woldcard Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOLDCARD_NODE_FEATURE_COUNT = WILDCARD_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction <em>Reflection Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReflectionFunction()
   * @generated
   */
  int REFLECTION_FUNCTION = 23;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Operator
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 24;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint <em>Insertion Point</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint
   * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getInsertionPoint()
   * @generated
   */
  int INSERTION_POINT = 25;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Model#getSources()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sources();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getAspects <em>Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspects</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Model#getAspects()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Aspects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel <em>Application Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel
   * @generated
   */
  EClass getApplicationModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getName()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getModel()
   * @see #getApplicationModel()
   * @generated
   */
  EReference getApplicationModel_Model();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Aspect
   * @generated
   */
  EClass getAspect();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getAnnotation()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getQuery()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Query();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getCollectors <em>Collectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collectors</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getCollectors()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Collectors();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query#getLocation()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Location();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query#getModifier()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Modifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query#getReturnType()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_ReturnType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query#getMethod()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Method();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Query#getParameter()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern <em>Parameter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Pattern</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern
   * @generated
   */
  EClass getParameterPattern();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getModifier()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Modifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getType()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern#getParameter()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery <em>Location Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery
   * @generated
   */
  EClass getLocationQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery#getNode()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Node();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery#getSpecialization <em>Specialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery#getSpecialization()
   * @see #getLocationQuery()
   * @generated
   */
  EReference getLocationQuery_Specialization();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Node#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Node#getParameter()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery <em>Param Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery
   * @generated
   */
  EClass getParamQuery();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery#getQueries()
   * @see #getParamQuery()
   * @generated
   */
  EReference getParamQuery_Queries();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare <em>Param Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Compare</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare
   * @generated
   */
  EClass getParamCompare();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getLeft()
   * @see #getParamCompare()
   * @generated
   */
  EReference getParamCompare_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getOperator()
   * @see #getParamCompare()
   * @generated
   */
  EAttribute getParamCompare_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare#getRight()
   * @see #getParamCompare()
   * @generated
   */
  EReference getParamCompare_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue <em>Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue
   * @generated
   */
  EClass getReferenceValue();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue#getQuery()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Query();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue#getParameter()
   * @see #getReferenceValue()
   * @generated
   */
  EReference getReferenceValue_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty <em>Runtime Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runtime Property</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty
   * @generated
   */
  EClass getRuntimeProperty();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty#getReference()
   * @see #getRuntimeProperty()
   * @generated
   */
  EAttribute getRuntimeProperty_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty <em>Reflection Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflection Property</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty
   * @generated
   */
  EClass getReflectionProperty();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty#getFunction()
   * @see #getReflectionProperty()
   * @generated
   */
  EAttribute getReflectionProperty_Function();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode <em>Container Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode
   * @generated
   */
  EClass getContainerNode();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode#getContainer()
   * @see #getContainerNode()
   * @generated
   */
  EReference getContainerNode_Container();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.WildcardNode <em>Wildcard Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.WildcardNode
   * @generated
   */
  EClass getWildcardNode();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.SubPathNode <em>Sub Path Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Path Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.SubPathNode
   * @generated
   */
  EClass getSubPathNode();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.Collector <em>Collector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collector</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Collector
   * @generated
   */
  EClass getCollector();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.applicationLang.Collector#getInsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insertion Point</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Collector#getInsertionPoint()
   * @see #getCollector()
   * @generated
   */
  EAttribute getCollector_InsertionPoint();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.applicationLang.Collector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Collector#getType()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.applicationLang.Collector#getInitializations <em>Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initializations</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Collector#getInitializations()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Initializations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.applicationLang.WoldcardNode <em>Woldcard Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Woldcard Node</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.WoldcardNode
   * @generated
   */
  EClass getWoldcardNode();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction <em>Reflection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reflection Function</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction
   * @generated
   */
  EEnum getReflectionFunction();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.applicationLang.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint <em>Insertion Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Insertion Point</em>'.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint
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
  ApplicationLangFactory getApplicationLangFactory();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SOURCES = eINSTANCE.getModel_Sources();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASPECTS = eINSTANCE.getModel_Aspects();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ImportImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getImport()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationModelImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getApplicationModel()
     * @generated
     */
    EClass APPLICATION_MODEL = eINSTANCE.getApplicationModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__NAME = eINSTANCE.getApplicationModel_Name();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MODEL__MODEL = eINSTANCE.getApplicationModel_Model();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.AspectImpl <em>Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.AspectImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getAspect()
     * @generated
     */
    EClass ASPECT = eINSTANCE.getAspect();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__ANNOTATION = eINSTANCE.getAspect_Annotation();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__QUERY = eINSTANCE.getAspect_Query();

    /**
     * The meta object literal for the '<em><b>Collectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__COLLECTORS = eINSTANCE.getAspect_Collectors();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.QueryImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__LOCATION = eINSTANCE.getQuery_Location();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__MODIFIER = eINSTANCE.getQuery_Modifier();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__RETURN_TYPE = eINSTANCE.getQuery_ReturnType();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__METHOD = eINSTANCE.getQuery_Method();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__PARAMETER = eINSTANCE.getQuery_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterPatternImpl <em>Parameter Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterPatternImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParameterPattern()
     * @generated
     */
    EClass PARAMETER_PATTERN = eINSTANCE.getParameterPattern();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_PATTERN__MODIFIER = eINSTANCE.getParameterPattern_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_PATTERN__TYPE = eINSTANCE.getParameterPattern_Type();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_PATTERN__PARAMETER = eINSTANCE.getParameterPattern_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.LocationQueryImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getLocationQuery()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.NodeImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getNode()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamQueryImpl <em>Param Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamQueryImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParamQuery()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamCompareImpl <em>Param Compare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParamCompareImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParamCompare()
     * @generated
     */
    EClass PARAM_COMPARE = eINSTANCE.getParamCompare();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_COMPARE__LEFT = eINSTANCE.getParamCompare_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_COMPARE__OPERATOR = eINSTANCE.getParamCompare_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_COMPARE__RIGHT = eINSTANCE.getParamCompare_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ValueImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.FloatValueImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getFloatValue()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.IntValueImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getIntValue()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.StringValueImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getStringValue()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ReferenceValueImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReferenceValue()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ParameterImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.RuntimePropertyImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getRuntimeProperty()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ReflectionPropertyImpl <em>Reflection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ReflectionPropertyImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReflectionProperty()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ContainerNodeImpl <em>Container Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ContainerNodeImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getContainerNode()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.WildcardNodeImpl <em>Wildcard Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.WildcardNodeImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getWildcardNode()
     * @generated
     */
    EClass WILDCARD_NODE = eINSTANCE.getWildcardNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.SubPathNodeImpl <em>Sub Path Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.SubPathNodeImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getSubPathNode()
     * @generated
     */
    EClass SUB_PATH_NODE = eINSTANCE.getSubPathNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.CollectorImpl <em>Collector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.CollectorImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getCollector()
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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTOR__TYPE = eINSTANCE.getCollector_Type();

    /**
     * The meta object literal for the '<em><b>Initializations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTOR__INITIALIZATIONS = eINSTANCE.getCollector_Initializations();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.WoldcardNodeImpl <em>Woldcard Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.WoldcardNodeImpl
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getWoldcardNode()
     * @generated
     */
    EClass WOLDCARD_NODE = eINSTANCE.getWoldcardNode();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction <em>Reflection Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getReflectionFunction()
     * @generated
     */
    EEnum REFLECTION_FUNCTION = eINSTANCE.getReflectionFunction();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.Operator
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint <em>Insertion Point</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint
     * @see de.cau.cs.se.instrumentation.al.applicationLang.impl.ApplicationLangPackageImpl#getInsertionPoint()
     * @generated
     */
    EEnum INSERTION_POINT = eINSTANCE.getInsertionPoint();

  }

} //ApplicationLangPackage
