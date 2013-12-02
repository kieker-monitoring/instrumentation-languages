/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationFactory
 * @model kind="package"
 * @generated
 */
public interface InstrumentationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "instrumentation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://se.cs.cau.de/languages/InstrumentationLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "instrumentation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InstrumentationPackage eINSTANCE = de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ModelImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getModel()
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
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 1;

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
   * The feature id for the '<em><b>Records</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RECORDS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ImportImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getImport()
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PackageImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PACKAGE = 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PatternImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getPattern()
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getParameter()
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl <em>Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getCodeElement()
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.SimpleCodeElementImpl <em>Simple Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.SimpleCodeElementImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getSimpleCodeElement()
   * @generated
   */
  int SIMPLE_CODE_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Simple Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CODE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterRefImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getParameterRef()
   * @generated
   */
  int PARAMETER_REF = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__REF = SIMPLE_CODE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF_FEATURE_COUNT = SIMPLE_CODE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.XStringLiteralImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getXStringLiteral()
   * @generated
   */
  int XSTRING_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL__VALUE = SIMPLE_CODE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XString Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL_FEATURE_COUNT = SIMPLE_CODE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.RecordImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getRecord()
   * @generated
   */
  int RECORD = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 10;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__CLASS = 1;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PropertyImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
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
   * The meta object id for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ReferencePropertyImpl
   * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getReferenceProperty()
   * @generated
   */
  int REFERENCE_PROPERTY = 12;

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
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model#getPatterns()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Patterns();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Model#getRecords <em>Records</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Records</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Model#getRecords()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Records();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.Package#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Package#getPackage()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Package();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getParameters()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getCodeSequcene <em>Code Sequcene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code Sequcene</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Pattern#getCodeSequcene()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_CodeSequcene();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.CodeElement <em>Code Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Element</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.CodeElement
   * @generated
   */
  EClass getCodeElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.CodeElement#isToUpper <em>To Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Upper</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.CodeElement#isToUpper()
   * @see #getCodeElement()
   * @generated
   */
  EAttribute getCodeElement_ToUpper();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.CodeElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.CodeElement#getValue()
   * @see #getCodeElement()
   * @generated
   */
  EReference getCodeElement_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.SimpleCodeElement <em>Simple Code Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Code Element</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.SimpleCodeElement
   * @generated
   */
  EClass getSimpleCodeElement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Ref</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.ParameterRef
   * @generated
   */
  EClass getParameterRef();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.ParameterRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.ParameterRef#getRef()
   * @see #getParameterRef()
   * @generated
   */
  EReference getParameterRef_Ref();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XString Literal</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.XStringLiteral
   * @generated
   */
  EClass getXStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.XStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.XStringLiteral#getValue()
   * @see #getXStringLiteral()
   * @generated
   */
  EAttribute getXStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Record
   * @generated
   */
  EClass getRecord();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Record#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Record#getName()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Record#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Record#getProperties()
   * @see #getRecord()
   * @generated
   */
  EReference getRecord_Properties();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getPackage()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Package();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getClass_()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Class();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.instrumentation.language.instrumentation.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.Property#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.Property#getProperties()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Properties();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty <em>Reference Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Property</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty
   * @generated
   */
  EClass getReferenceProperty();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getRef()
   * @see #getReferenceProperty()
   * @generated
   */
  EReference getReferenceProperty_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getProperties()
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
  InstrumentationFactory getInstrumentationFactory();

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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ModelImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

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
     * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RECORDS = eINSTANCE.getModel_Records();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ImportImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getImport()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PackageImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PACKAGE = eINSTANCE.getPackage_Package();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PatternImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getPattern()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getParameter()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl <em>Code Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.CodeElementImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getCodeElement()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.SimpleCodeElementImpl <em>Simple Code Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.SimpleCodeElementImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getSimpleCodeElement()
     * @generated
     */
    EClass SIMPLE_CODE_ELEMENT = eINSTANCE.getSimpleCodeElement();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ParameterRefImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getParameterRef()
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.XStringLiteralImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getXStringLiteral()
     * @generated
     */
    EClass XSTRING_LITERAL = eINSTANCE.getXStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSTRING_LITERAL__VALUE = eINSTANCE.getXStringLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.RecordImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getRecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getRecord();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD__PROPERTIES = eINSTANCE.getRecord_Properties();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__PACKAGE = eINSTANCE.getClassifier_Package();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__CLASS = eINSTANCE.getClassifier_Class();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.PropertyImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.ReferencePropertyImpl
     * @see de.cau.cs.se.instrumentation.language.instrumentation.impl.InstrumentationPackageImpl#getReferenceProperty()
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

} //InstrumentationPackage
