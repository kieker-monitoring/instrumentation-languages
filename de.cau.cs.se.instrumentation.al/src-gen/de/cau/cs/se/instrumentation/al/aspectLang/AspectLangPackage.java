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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ModelImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getModel()
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
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODELS = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SOURCES = 3;

  /**
   * The feature id for the '<em><b>Probes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROBES = 4;

  /**
   * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASPECTS = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.RegisteredPackageImpl <em>Registered Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.RegisteredPackageImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getRegisteredPackage()
   * @generated
   */
  int REGISTERED_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE__EPACKAGE = 1;

  /**
   * The number of structural features of the '<em>Registered Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTERED_PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl <em>Application Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ApplicationModelImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getApplicationModel()
   * @generated
   */
  int APPLICATION_MODEL = 3;

  /**
   * The feature id for the '<em><b>Use Packages</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__USE_PACKAGES = 0;

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
  int ASPECT = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Probe</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__PROBE = 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__QUERY = 2;

  /**
   * The number of structural features of the '<em>Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl <em>Probe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getProbe()
   * @generated
   */
  int PROBE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__PARAMETER_DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Collectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__COLLECTORS = 2;

  /**
   * The number of structural features of the '<em>Probe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE_FEATURE_COUNT = 3;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.QueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 7;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__LOCATION = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__METHOD = 1;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl <em>Method Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getMethodQuery()
   * @generated
   */
  int METHOD_QUERY = 8;

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
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY__PARAMETER = 3;

  /**
   * The number of structural features of the '<em>Method Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl <em>Parameter Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterPattern()
   * @generated
   */
  int PARAMETER_PATTERN = 9;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl <em>Location Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getLocationQuery()
   * @generated
   */
  int LOCATION_QUERY = 10;

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
  int COMPOSITION_QUERY = 11;

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
  int NODE = 12;

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
  int PARAM_QUERY = 13;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamCompareImpl <em>Param Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamCompareImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamCompare()
   * @generated
   */
  int PARAM_COMPARE = 14;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 15;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.IntValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 17;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.StringValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 18;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ReferenceValueImpl
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReferenceValue()
   * @generated
   */
  int REFERENCE_VALUE = 19;

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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
   * @generated
   */
  int QUERY_MODIFIER = 29;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction <em>Internal Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInternalFunction()
   * @generated
   */
  int INTERNAL_FUNCTION = 30;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction <em>Reflection Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ReflectionFunction
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getReflectionFunction()
   * @generated
   */
  int REFLECTION_FUNCTION = 31;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 32;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint <em>Insertion Point</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
   * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getInsertionPoint()
   * @generated
   */
  int INSERTION_POINT = 33;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getMetamodels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Metamodels();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getSources()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sources();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getProbes <em>Probes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Probes</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getProbes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Probes();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Model#getAspects <em>Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspects</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Model#getAspects()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Aspects();

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
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage <em>Registered Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Registered Package</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage
   * @generated
   */
  EClass getRegisteredPackage();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage#getName()
   * @see #getRegisteredPackage()
   * @generated
   */
  EAttribute getRegisteredPackage_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage#getEPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage#getEPackage()
   * @see #getRegisteredPackage()
   * @generated
   */
  EReference getRegisteredPackage_EPackage();

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
   * Returns the meta object for the reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getUsePackages <em>Use Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Packages</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel#getUsePackages()
   * @see #getApplicationModel()
   * @generated
   */
  EReference getApplicationModel_UsePackages();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getAnnotation()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Annotation();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getProbe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Probe</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getProbe()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Probe();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getQuery()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Query();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Probe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Probe</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Probe
   * @generated
   */
  EClass getProbe();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.Probe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Probe#getName()
   * @see #getProbe()
   * @generated
   */
  EAttribute getProbe_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Probe#getParameterDeclarations <em>Parameter Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Probe#getParameterDeclarations()
   * @see #getProbe()
   * @generated
   */
  EReference getProbe_ParameterDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Probe#getCollectors <em>Collectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collectors</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Probe#getCollectors()
   * @see #getProbe()
   * @generated
   */
  EReference getProbe_Collectors();

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
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Query#getLocation()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Location();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Query#getMethod()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Method();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getParameter()
   * @see #getMethodQuery()
   * @generated
   */
  EReference getMethodQuery_Parameter();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern <em>Parameter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Pattern</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern
   * @generated
   */
  EClass getParameterPattern();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifier</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getModifier()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Modifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getType()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getParameter()
   * @see #getParameterPattern()
   * @generated
   */
  EReference getParameterPattern_Parameter();

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
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare <em>Param Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Compare</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare
   * @generated
   */
  EClass getParamCompare();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getLeft()
   * @see #getParamCompare()
   * @generated
   */
  EReference getParamCompare_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getOperator()
   * @see #getParamCompare()
   * @generated
   */
  EAttribute getParamCompare_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getRight()
   * @see #getParamCompare()
   * @generated
   */
  EReference getParamCompare_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.al.aspectLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Value
   * @generated
   */
  EClass getValue();

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
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Collector#getType()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInitializations <em>Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initializations</em>'.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInitializations()
   * @see #getCollector()
   * @generated
   */
  EReference getCollector_Initializations();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ModelImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODELS = eINSTANCE.getModel_Metamodels();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SOURCES = eINSTANCE.getModel_Sources();

    /**
     * The meta object literal for the '<em><b>Probes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROBES = eINSTANCE.getModel_Probes();

    /**
     * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASPECTS = eINSTANCE.getModel_Aspects();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.RegisteredPackageImpl <em>Registered Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.RegisteredPackageImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getRegisteredPackage()
     * @generated
     */
    EClass REGISTERED_PACKAGE = eINSTANCE.getRegisteredPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTERED_PACKAGE__NAME = eINSTANCE.getRegisteredPackage_Name();

    /**
     * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTERED_PACKAGE__EPACKAGE = eINSTANCE.getRegisteredPackage_EPackage();

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
     * The meta object literal for the '<em><b>Use Packages</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MODEL__USE_PACKAGES = eINSTANCE.getApplicationModel_UsePackages();

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
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__ANNOTATION = eINSTANCE.getAspect_Annotation();

    /**
     * The meta object literal for the '<em><b>Probe</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__PROBE = eINSTANCE.getAspect_Probe();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__QUERY = eINSTANCE.getAspect_Query();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl <em>Probe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getProbe()
     * @generated
     */
    EClass PROBE = eINSTANCE.getProbe();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBE__NAME = eINSTANCE.getProbe_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBE__PARAMETER_DECLARATIONS = eINSTANCE.getProbe_ParameterDeclarations();

    /**
     * The meta object literal for the '<em><b>Collectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBE__COLLECTORS = eINSTANCE.getProbe_Collectors();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.QueryImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQuery()
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
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__METHOD = eINSTANCE.getQuery_Method();

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
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_QUERY__PARAMETER = eINSTANCE.getMethodQuery_Parameter();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl <em>Parameter Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParameterPattern()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamCompareImpl <em>Param Compare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ParamCompareImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getParamCompare()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.ValueImpl
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier <em>Query Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
     * @see de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangPackageImpl#getQueryModifier()
     * @generated
     */
    EEnum QUERY_MODIFIER = eINSTANCE.getQueryModifier();

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
