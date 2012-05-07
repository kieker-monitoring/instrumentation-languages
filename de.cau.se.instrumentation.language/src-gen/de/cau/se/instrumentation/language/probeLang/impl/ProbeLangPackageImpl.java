/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.Alternative;
import de.cau.se.instrumentation.language.probeLang.CodeElement;
import de.cau.se.instrumentation.language.probeLang.Group;
import de.cau.se.instrumentation.language.probeLang.Item;
import de.cau.se.instrumentation.language.probeLang.Model;
import de.cau.se.instrumentation.language.probeLang.Operator;
import de.cau.se.instrumentation.language.probeLang.OperatorType;
import de.cau.se.instrumentation.language.probeLang.Parameter;
import de.cau.se.instrumentation.language.probeLang.ParameterRef;
import de.cau.se.instrumentation.language.probeLang.Pattern;
import de.cau.se.instrumentation.language.probeLang.PatternCall;
import de.cau.se.instrumentation.language.probeLang.Probe;
import de.cau.se.instrumentation.language.probeLang.ProbeLangFactory;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.Quantifier;
import de.cau.se.instrumentation.language.probeLang.QuantifierType;
import de.cau.se.instrumentation.language.probeLang.QuotedElement;
import de.cau.se.instrumentation.language.probeLang.Replacement;
import de.cau.se.instrumentation.language.probeLang.Scope;
import de.cau.se.instrumentation.language.probeLang.ScopeRefElement;
import de.cau.se.instrumentation.language.probeLang.Sequence;
import de.cau.se.instrumentation.language.probeLang.ToUpper;
import de.cau.se.instrumentation.language.probeLang.Value;
import de.cau.se.instrumentation.language.probeLang.ValueElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbeLangPackageImpl extends EPackageImpl implements ProbeLangPackage
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
  private EClass patternEClass = null;

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
  private EClass codeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass probeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass replacementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternCallEClass = null;

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
  private EClass valueElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toUpperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeRefElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum quantifierTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorTypeEEnum = null;

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
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProbeLangPackageImpl()
  {
    super(eNS_URI, ProbeLangFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ProbeLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProbeLangPackage init()
  {
    if (isInited) return (ProbeLangPackage)EPackage.Registry.INSTANCE.getEPackage(ProbeLangPackage.eNS_URI);

    // Obtain or create and register package
    ProbeLangPackageImpl theProbeLangPackage = (ProbeLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProbeLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProbeLangPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProbeLangPackage.createPackageContents();

    // Initialize created meta-data
    theProbeLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProbeLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProbeLangPackage.eNS_URI, theProbeLangPackage);
    return theProbeLangPackage;
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
  public EReference getModel_Patterns()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Probes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Name()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Parameters()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_CodeSequcene()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeElement()
  {
    return codeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterRef()
  {
    return parameterRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterRef_Ref()
  {
    return (EReference)parameterRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotedElement()
  {
    return quotedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuotedElement_Value()
  {
    return (EAttribute)quotedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProbe()
  {
    return probeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbe_Name()
  {
    return (EAttribute)probeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbe_Replacements()
  {
    return (EReference)probeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReplacement()
  {
    return replacementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReplacement_Name()
  {
    return (EAttribute)replacementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplacement_Scope()
  {
    return (EReference)replacementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplacement_Patterns()
  {
    return (EReference)replacementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScope()
  {
    return scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_ModelRef()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_InsertBefore()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Target()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_InsertAfter()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternative()
  {
    return alternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_OrExpr()
  {
    return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_AndExpr()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifier()
  {
    return quantifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifier_Item()
  {
    return (EReference)quantifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifier_Type()
  {
    return (EAttribute)quantifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_Type()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_SubTarget()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternCall()
  {
    return patternCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternCall_Ref()
  {
    return (EReference)patternCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternCall_Values()
  {
    return (EReference)patternCallEClass.getEStructuralFeatures().get(1);
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
  public EReference getValue_Elements()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueElement()
  {
    return valueElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToUpper()
  {
    return toUpperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToUpper_Value()
  {
    return (EReference)toUpperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopeRefElement()
  {
    return scopeRefElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeRefElement_Ref()
  {
    return (EAttribute)scopeRefElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQuantifierType()
  {
    return quantifierTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperatorType()
  {
    return operatorTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeLangFactory getProbeLangFactory()
  {
    return (ProbeLangFactory)getEFactoryInstance();
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
    createEReference(modelEClass, MODEL__PATTERNS);
    createEReference(modelEClass, MODEL__PROBES);

    patternEClass = createEClass(PATTERN);
    createEAttribute(patternEClass, PATTERN__NAME);
    createEReference(patternEClass, PATTERN__PARAMETERS);
    createEReference(patternEClass, PATTERN__CODE_SEQUCENE);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    codeElementEClass = createEClass(CODE_ELEMENT);

    parameterRefEClass = createEClass(PARAMETER_REF);
    createEReference(parameterRefEClass, PARAMETER_REF__REF);

    quotedElementEClass = createEClass(QUOTED_ELEMENT);
    createEAttribute(quotedElementEClass, QUOTED_ELEMENT__VALUE);

    probeEClass = createEClass(PROBE);
    createEAttribute(probeEClass, PROBE__NAME);
    createEReference(probeEClass, PROBE__REPLACEMENTS);

    replacementEClass = createEClass(REPLACEMENT);
    createEAttribute(replacementEClass, REPLACEMENT__NAME);
    createEReference(replacementEClass, REPLACEMENT__SCOPE);
    createEReference(replacementEClass, REPLACEMENT__PATTERNS);

    scopeEClass = createEClass(SCOPE);
    createEAttribute(scopeEClass, SCOPE__MODEL_REF);
    createEAttribute(scopeEClass, SCOPE__INSERT_BEFORE);
    createEReference(scopeEClass, SCOPE__TARGET);
    createEAttribute(scopeEClass, SCOPE__INSERT_AFTER);

    alternativeEClass = createEClass(ALTERNATIVE);
    createEReference(alternativeEClass, ALTERNATIVE__OR_EXPR);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__AND_EXPR);

    quantifierEClass = createEClass(QUANTIFIER);
    createEReference(quantifierEClass, QUANTIFIER__ITEM);
    createEAttribute(quantifierEClass, QUANTIFIER__TYPE);

    itemEClass = createEClass(ITEM);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__TYPE);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__SUB_TARGET);

    patternCallEClass = createEClass(PATTERN_CALL);
    createEReference(patternCallEClass, PATTERN_CALL__REF);
    createEReference(patternCallEClass, PATTERN_CALL__VALUES);

    valueEClass = createEClass(VALUE);
    createEReference(valueEClass, VALUE__ELEMENTS);

    valueElementEClass = createEClass(VALUE_ELEMENT);

    toUpperEClass = createEClass(TO_UPPER);
    createEReference(toUpperEClass, TO_UPPER__VALUE);

    scopeRefElementEClass = createEClass(SCOPE_REF_ELEMENT);
    createEAttribute(scopeRefElementEClass, SCOPE_REF_ELEMENT__REF);

    // Create enums
    quantifierTypeEEnum = createEEnum(QUANTIFIER_TYPE);
    operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    parameterRefEClass.getESuperTypes().add(this.getCodeElement());
    quotedElementEClass.getESuperTypes().add(this.getCodeElement());
    quotedElementEClass.getESuperTypes().add(this.getItem());
    quotedElementEClass.getESuperTypes().add(this.getValueElement());
    operatorEClass.getESuperTypes().add(this.getItem());
    groupEClass.getESuperTypes().add(this.getItem());
    patternCallEClass.getESuperTypes().add(this.getValueElement());
    toUpperEClass.getESuperTypes().add(this.getCodeElement());
    scopeRefElementEClass.getESuperTypes().add(this.getValueElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Probes(), this.getProbe(), null, "probes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_CodeSequcene(), this.getCodeElement(), null, "codeSequcene", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterRef_Ref(), this.getParameter(), null, "ref", null, 0, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quotedElementEClass, QuotedElement.class, "QuotedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuotedElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, QuotedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(probeEClass, Probe.class, "Probe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProbe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbe_Replacements(), this.getReplacement(), null, "replacements", null, 0, -1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(replacementEClass, Replacement.class, "Replacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReplacement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReplacement_Scope(), this.getScope(), null, "scope", null, 0, 1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReplacement_Patterns(), this.getPatternCall(), null, "patterns", null, 0, -1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScope_ModelRef(), ecorePackage.getEString(), "modelRef", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_InsertBefore(), ecorePackage.getEBoolean(), "insertBefore", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScope_Target(), this.getAlternative(), null, "target", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_InsertAfter(), ecorePackage.getEBoolean(), "insertAfter", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlternative_OrExpr(), this.getSequence(), null, "orExpr", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_AndExpr(), this.getQuantifier(), null, "andExpr", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifierEClass, Quantifier.class, "Quantifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantifier_Item(), this.getItem(), null, "item", null, 0, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantifier_Type(), this.getQuantifierType(), "type", null, 0, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_Type(), this.getOperatorType(), "type", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroup_SubTarget(), this.getAlternative(), null, "subTarget", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternCallEClass, PatternCall.class, "PatternCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatternCall_Ref(), this.getPattern(), null, "ref", null, 0, 1, PatternCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatternCall_Values(), this.getValue(), null, "values", null, 0, -1, PatternCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValue_Elements(), this.getValueElement(), null, "elements", null, 0, -1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueElementEClass, ValueElement.class, "ValueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(toUpperEClass, ToUpper.class, "ToUpper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getToUpper_Value(), this.getValue(), null, "value", null, 0, 1, ToUpper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeRefElementEClass, ScopeRefElement.class, "ScopeRefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScopeRefElement_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ScopeRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(quantifierTypeEEnum, QuantifierType.class, "QuantifierType");
    addEEnumLiteral(quantifierTypeEEnum, QuantifierType.NONE_OR_MANY);
    addEEnumLiteral(quantifierTypeEEnum, QuantifierType.OPTIONAL);
    addEEnumLiteral(quantifierTypeEEnum, QuantifierType.ONE_OR_MANY);

    initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
    addEEnumLiteral(operatorTypeEEnum, OperatorType.ANY_CHAR);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.WHITE_SPACE);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.NON_WHITE_SPACE);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.WORD_CHAR);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.NON_WORD_CHAR);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.DIGIT);
    addEEnumLiteral(operatorTypeEEnum, OperatorType.NON_DIGIT);

    // Create resource
    createResource(eNS_URI);
  }

} //ProbeLangPackageImpl
