/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

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
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PATTERNS = 0;

  /**
   * The feature id for the '<em><b>Probes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROBES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.PatternImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 1;

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
  int PARAMETER = 2;

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
  int CODE_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ParameterRefImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getParameterRef()
   * @generated
   */
  int PARAMETER_REF = 4;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__REF = CODE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.QuotedElementImpl <em>Quoted Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.QuotedElementImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuotedElement()
   * @generated
   */
  int QUOTED_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_ELEMENT__VALUE = CODE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quoted Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_ELEMENT_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl <em>Probe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getProbe()
   * @generated
   */
  int PROBE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__NAME = 0;

  /**
   * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE__REPLACEMENTS = 1;

  /**
   * The number of structural features of the '<em>Probe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl <em>Replacement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getReplacement()
   * @generated
   */
  int REPLACEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__SCOPE = 1;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__PATTERNS = 2;

  /**
   * The number of structural features of the '<em>Replacement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 8;

  /**
   * The feature id for the '<em><b>Model Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__MODEL_REF = 0;

  /**
   * The feature id for the '<em><b>Insert Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__INSERT_BEFORE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__TARGET = 2;

  /**
   * The feature id for the '<em><b>Insert After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__INSERT_AFTER = 3;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.AlternativeImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 9;

  /**
   * The feature id for the '<em><b>Or Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__OR_EXPR = 0;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.SequenceImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 10;

  /**
   * The feature id for the '<em><b>And Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__AND_EXPR = 0;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.QuantifierImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 11;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__ITEM = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Quantifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ItemImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getItem()
   * @generated
   */
  int ITEM = 12;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.OperatorImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__TYPE = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.GroupImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 14;

  /**
   * The feature id for the '<em><b>Sub Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__SUB_TARGET = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ValueElementImpl <em>Value Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ValueElementImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getValueElement()
   * @generated
   */
  int VALUE_ELEMENT = 17;

  /**
   * The number of structural features of the '<em>Value Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PatternCallImpl <em>Pattern Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.PatternCallImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getPatternCall()
   * @generated
   */
  int PATTERN_CALL = 15;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CALL__REF = VALUE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CALL__VALUES = VALUE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pattern Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CALL_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ValueImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 16;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ToUpperImpl <em>To Upper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ToUpperImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getToUpper()
   * @generated
   */
  int TO_UPPER = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_UPPER__VALUE = CODE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>To Upper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_UPPER_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeRefElementImpl <em>Scope Ref Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.impl.ScopeRefElementImpl
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getScopeRefElement()
   * @generated
   */
  int SCOPE_REF_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_REF_ELEMENT__REF = VALUE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scope Ref Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_REF_ELEMENT_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.QuantifierType <em>Quantifier Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.QuantifierType
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuantifierType()
   * @generated
   */
  int QUANTIFIER_TYPE = 20;

  /**
   * The meta object id for the '{@link de.cau.se.instrumentation.language.probeLang.OperatorType <em>Operator Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.se.instrumentation.language.probeLang.OperatorType
   * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getOperatorType()
   * @generated
   */
  int OPERATOR_TYPE = 21;


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
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.QuotedElement <em>Quoted Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quoted Element</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.QuotedElement
   * @generated
   */
  EClass getQuotedElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.QuotedElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.QuotedElement#getValue()
   * @see #getQuotedElement()
   * @generated
   */
  EAttribute getQuotedElement_Value();

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
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Probe#getReplacements <em>Replacements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Replacements</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Probe#getReplacements()
   * @see #getProbe()
   * @generated
   */
  EReference getProbe_Replacements();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Replacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replacement</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Replacement
   * @generated
   */
  EClass getReplacement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Replacement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Replacement#getName()
   * @see #getReplacement()
   * @generated
   */
  EAttribute getReplacement_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.Replacement#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Replacement#getScope()
   * @see #getReplacement()
   * @generated
   */
  EReference getReplacement_Scope();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Replacement#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Replacement#getPatterns()
   * @see #getReplacement()
   * @generated
   */
  EReference getReplacement_Patterns();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Scope#getModelRef <em>Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Scope#getModelRef()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_ModelRef();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertBefore <em>Insert Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insert Before</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Scope#isInsertBefore()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_InsertBefore();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.Scope#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Scope#getTarget()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Target();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertAfter <em>Insert After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insert After</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Scope#isInsertAfter()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_InsertAfter();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Alternative#getOrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Or Expr</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Alternative#getOrExpr()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_OrExpr();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Sequence#getAndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And Expr</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Sequence#getAndExpr()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_AndExpr();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantifier</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Quantifier
   * @generated
   */
  EClass getQuantifier();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Quantifier#getItem()
   * @see #getQuantifier()
   * @generated
   */
  EReference getQuantifier_Item();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Quantifier#getType()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_Type();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.Operator#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Operator#getType()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Type();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.Group#getSubTarget <em>Sub Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Target</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Group#getSubTarget()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_SubTarget();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.PatternCall <em>Pattern Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Call</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.PatternCall
   * @generated
   */
  EClass getPatternCall();

  /**
   * Returns the meta object for the reference '{@link de.cau.se.instrumentation.language.probeLang.PatternCall#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.PatternCall#getRef()
   * @see #getPatternCall()
   * @generated
   */
  EReference getPatternCall_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.PatternCall#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.PatternCall#getValues()
   * @see #getPatternCall()
   * @generated
   */
  EReference getPatternCall_Values();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.se.instrumentation.language.probeLang.Value#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.Value#getElements()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Elements();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.ValueElement <em>Value Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Element</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ValueElement
   * @generated
   */
  EClass getValueElement();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.ToUpper <em>To Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Upper</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ToUpper
   * @generated
   */
  EClass getToUpper();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.se.instrumentation.language.probeLang.ToUpper#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ToUpper#getValue()
   * @see #getToUpper()
   * @generated
   */
  EReference getToUpper_Value();

  /**
   * Returns the meta object for class '{@link de.cau.se.instrumentation.language.probeLang.ScopeRefElement <em>Scope Ref Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Ref Element</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ScopeRefElement
   * @generated
   */
  EClass getScopeRefElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.se.instrumentation.language.probeLang.ScopeRefElement#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.ScopeRefElement#getRef()
   * @see #getScopeRefElement()
   * @generated
   */
  EAttribute getScopeRefElement_Ref();

  /**
   * Returns the meta object for enum '{@link de.cau.se.instrumentation.language.probeLang.QuantifierType <em>Quantifier Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Quantifier Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.QuantifierType
   * @generated
   */
  EEnum getQuantifierType();

  /**
   * Returns the meta object for enum '{@link de.cau.se.instrumentation.language.probeLang.OperatorType <em>Operator Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Type</em>'.
   * @see de.cau.se.instrumentation.language.probeLang.OperatorType
   * @generated
   */
  EEnum getOperatorType();

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
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.QuotedElementImpl <em>Quoted Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.QuotedElementImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuotedElement()
     * @generated
     */
    EClass QUOTED_ELEMENT = eINSTANCE.getQuotedElement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUOTED_ELEMENT__VALUE = eINSTANCE.getQuotedElement_Value();

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
     * The meta object literal for the '<em><b>Replacements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBE__REPLACEMENTS = eINSTANCE.getProbe_Replacements();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl <em>Replacement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getReplacement()
     * @generated
     */
    EClass REPLACEMENT = eINSTANCE.getReplacement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPLACEMENT__NAME = eINSTANCE.getReplacement_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEMENT__SCOPE = eINSTANCE.getReplacement_Scope();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEMENT__PATTERNS = eINSTANCE.getReplacement_Patterns();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Model Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__MODEL_REF = eINSTANCE.getScope_ModelRef();

    /**
     * The meta object literal for the '<em><b>Insert Before</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__INSERT_BEFORE = eINSTANCE.getScope_InsertBefore();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__TARGET = eINSTANCE.getScope_Target();

    /**
     * The meta object literal for the '<em><b>Insert After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__INSERT_AFTER = eINSTANCE.getScope_InsertAfter();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.AlternativeImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Or Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__OR_EXPR = eINSTANCE.getAlternative_OrExpr();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.SequenceImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>And Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__AND_EXPR = eINSTANCE.getSequence_AndExpr();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.QuantifierImpl <em>Quantifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.QuantifierImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuantifier()
     * @generated
     */
    EClass QUANTIFIER = eINSTANCE.getQuantifier();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIER__ITEM = eINSTANCE.getQuantifier_Item();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__TYPE = eINSTANCE.getQuantifier_Type();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ItemImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.OperatorImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__TYPE = eINSTANCE.getOperator_Type();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.GroupImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Sub Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__SUB_TARGET = eINSTANCE.getGroup_SubTarget();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.PatternCallImpl <em>Pattern Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.PatternCallImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getPatternCall()
     * @generated
     */
    EClass PATTERN_CALL = eINSTANCE.getPatternCall();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_CALL__REF = eINSTANCE.getPatternCall_Ref();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_CALL__VALUES = eINSTANCE.getPatternCall_Values();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ValueImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__ELEMENTS = eINSTANCE.getValue_Elements();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ValueElementImpl <em>Value Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ValueElementImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getValueElement()
     * @generated
     */
    EClass VALUE_ELEMENT = eINSTANCE.getValueElement();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ToUpperImpl <em>To Upper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ToUpperImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getToUpper()
     * @generated
     */
    EClass TO_UPPER = eINSTANCE.getToUpper();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO_UPPER__VALUE = eINSTANCE.getToUpper_Value();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeRefElementImpl <em>Scope Ref Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.impl.ScopeRefElementImpl
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getScopeRefElement()
     * @generated
     */
    EClass SCOPE_REF_ELEMENT = eINSTANCE.getScopeRefElement();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_REF_ELEMENT__REF = eINSTANCE.getScopeRefElement_Ref();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.QuantifierType <em>Quantifier Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.QuantifierType
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getQuantifierType()
     * @generated
     */
    EEnum QUANTIFIER_TYPE = eINSTANCE.getQuantifierType();

    /**
     * The meta object literal for the '{@link de.cau.se.instrumentation.language.probeLang.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.se.instrumentation.language.probeLang.OperatorType
     * @see de.cau.se.instrumentation.language.probeLang.impl.ProbeLangPackageImpl#getOperatorType()
     * @generated
     */
    EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

  }

} //ProbeLangPackage
