/**
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

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
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangFactory
 * @model kind="package"
 * @generated
 */
public interface ProbeLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "probeLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/se/instrumentation/language/ProbeLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "probeLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProbeLangPackage eINSTANCE = de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ModelImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getModel()
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
   * The feature id for the '<em><b>Meta Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__META_MODELS = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PATTERNS = 3;

  /**
   * The feature id for the '<em><b>Probes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROBES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ImportImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getImport()
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
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.LoadMetaModelImpl <em>Load Meta Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.LoadMetaModelImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getLoadMetaModel()
   * @generated
   */
  int LOAD_META_MODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_META_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_META_MODEL__EPACKAGE = 1;

  /**
   * The number of structural features of the '<em>Load Meta Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_META_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.PatternImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Code Sequcene</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__CODE_SEQUCENE = 2;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ParameterImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.CodeElementImpl <em>Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.CodeElementImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getCodeElement()
   * @generated
   */
  int CODE_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>To Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__TO_UPPER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getParameterRef()
   * @generated
   */
  int PARAMETER_REF = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__REF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl <em>Probe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getProbe()
   * @generated
   */
  int PROBE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Probe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.PropertyImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getReferenceProperty()
   * @generated
   */
  int REFERENCE_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_PROPERTY__REF = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_PROPERTY__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Reference Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_PROPERTY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Model#getMetaModels <em>Meta Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Models</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model#getMetaModels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MetaModels();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Model#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model#getPatterns()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Patterns();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Model#getProbes <em>Probes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Probes</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Model#getProbes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Probes();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.LoadMetaModel <em>Load Meta Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Meta Model</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.LoadMetaModel
   * @generated
   */
  EClass getLoadMetaModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.LoadMetaModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.LoadMetaModel#getName()
   * @see #getLoadMetaModel()
   * @generated
   */
  EAttribute getLoadMetaModel_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.LoadMetaModel#getEPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.LoadMetaModel#getEPackage()
   * @see #getLoadMetaModel()
   * @generated
   */
  EReference getLoadMetaModel_EPackage();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Pattern#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Pattern#getParameters()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Pattern#getCodeSequcene <em>Code Sequcene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code Sequcene</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Pattern#getCodeSequcene()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_CodeSequcene();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.CodeElement <em>Code Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Element</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.CodeElement
   * @generated
   */
  EClass getCodeElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.CodeElement#isToUpper <em>To Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Upper</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.CodeElement#isToUpper()
   * @see #getCodeElement()
   * @generated
   */
  EAttribute getCodeElement_ToUpper();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.CodeElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.CodeElement#getValue()
   * @see #getCodeElement()
   * @generated
   */
  EReference getCodeElement_Value();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ParameterRef
   * @generated
   */
  EClass getParameterRef();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.ParameterRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ParameterRef#getRef()
   * @see #getParameterRef()
   * @generated
   */
  EReference getParameterRef_Ref();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Probe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Probe</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Probe
   * @generated
   */
  EClass getProbe();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Probe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Probe#getName()
   * @see #getProbe()
   * @generated
   */
  EAttribute getProbe_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.Probe#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Probe#getType()
   * @see #getProbe()
   * @generated
   */
  EReference getProbe_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Probe#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Probe#getProperties()
   * @see #getProbe()
   * @generated
   */
  EReference getProbe_Properties();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Property#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Property#getProperties()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Properties();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.ReferenceProperty <em>Reference Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Property</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ReferenceProperty
   * @generated
   */
  EClass getReferenceProperty();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.ReferenceProperty#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ReferenceProperty#getRef()
   * @see #getReferenceProperty()
   * @generated
   */
  EReference getReferenceProperty_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.ReferenceProperty#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ReferenceProperty#getProperties()
   * @see #getReferenceProperty()
   * @generated
   */
  EReference getReferenceProperty_Properties();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProbeLangFactory getProbeLangFactory();

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
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ModelImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Meta Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__META_MODELS = eINSTANCE.getModel_MetaModels();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PATTERNS = eINSTANCE.getModel_Patterns();

    /**
     * The meta object literal for the '<em><b>Probes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROBES = eINSTANCE.getModel_Probes();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ImportImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getImport()
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
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.LoadMetaModelImpl <em>Load Meta Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.LoadMetaModelImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getLoadMetaModel()
     * @generated
     */
    EClass LOAD_META_MODEL = eINSTANCE.getLoadMetaModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_META_MODEL__NAME = eINSTANCE.getLoadMetaModel_Name();

    /**
     * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_META_MODEL__EPACKAGE = eINSTANCE.getLoadMetaModel_EPackage();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.PatternImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PARAMETERS = eINSTANCE.getPattern_Parameters();

    /**
     * The meta object literal for the '<em><b>Code Sequcene</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__CODE_SEQUCENE = eINSTANCE.getPattern_CodeSequcene();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ParameterImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.CodeElementImpl <em>Code Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.CodeElementImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getCodeElement()
     * @generated
     */
    EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

    /**
     * The meta object literal for the '<em><b>To Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_ELEMENT__TO_UPPER = eINSTANCE.getCodeElement_ToUpper();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_ELEMENT__VALUE = eINSTANCE.getCodeElement_Value();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getParameterRef()
     * @generated
     */
    EClass PARAMETER_REF = eINSTANCE.getParameterRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_REF__REF = eINSTANCE.getParameterRef_Ref();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl <em>Probe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getProbe()
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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBE__TYPE = eINSTANCE.getProbe_Type();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBE__PROPERTIES = eINSTANCE.getProbe_Properties();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.PropertyImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__PROPERTIES = eINSTANCE.getProperty_Properties();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getReferenceProperty()
     * @generated
     */
    EClass REFERENCE_PROPERTY = eINSTANCE.getReferenceProperty();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_PROPERTY__REF = eINSTANCE.getReferenceProperty_Ref();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_PROPERTY__PROPERTIES = eINSTANCE.getReferenceProperty_Properties();

  }

} //ProbeLangPackage
