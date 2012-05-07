/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbeLangFactoryImpl extends EFactoryImpl implements ProbeLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProbeLangFactory init()
  {
    try
    {
      ProbeLangFactory theProbeLangFactory = (ProbeLangFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/se/instrumentation/language/ProbeLang"); 
      if (theProbeLangFactory != null)
      {
        return theProbeLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProbeLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProbeLangPackage.MODEL: return createModel();
      case ProbeLangPackage.PATTERN: return createPattern();
      case ProbeLangPackage.PARAMETER: return createParameter();
      case ProbeLangPackage.CODE_ELEMENT: return createCodeElement();
      case ProbeLangPackage.PARAMETER_REF: return createParameterRef();
      case ProbeLangPackage.QUOTED_ELEMENT: return createQuotedElement();
      case ProbeLangPackage.PROBE: return createProbe();
      case ProbeLangPackage.REPLACEMENT: return createReplacement();
      case ProbeLangPackage.SCOPE: return createScope();
      case ProbeLangPackage.ALTERNATIVE: return createAlternative();
      case ProbeLangPackage.SEQUENCE: return createSequence();
      case ProbeLangPackage.QUANTIFIER: return createQuantifier();
      case ProbeLangPackage.ITEM: return createItem();
      case ProbeLangPackage.OPERATOR: return createOperator();
      case ProbeLangPackage.GROUP: return createGroup();
      case ProbeLangPackage.PATTERN_CALL: return createPatternCall();
      case ProbeLangPackage.VALUE: return createValue();
      case ProbeLangPackage.VALUE_ELEMENT: return createValueElement();
      case ProbeLangPackage.TO_UPPER: return createToUpper();
      case ProbeLangPackage.SCOPE_REF_ELEMENT: return createScopeRefElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProbeLangPackage.QUANTIFIER_TYPE:
        return createQuantifierTypeFromString(eDataType, initialValue);
      case ProbeLangPackage.OPERATOR_TYPE:
        return createOperatorTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProbeLangPackage.QUANTIFIER_TYPE:
        return convertQuantifierTypeToString(eDataType, instanceValue);
      case ProbeLangPackage.OPERATOR_TYPE:
        return convertOperatorTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeElement createCodeElement()
  {
    CodeElementImpl codeElement = new CodeElementImpl();
    return codeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterRef createParameterRef()
  {
    ParameterRefImpl parameterRef = new ParameterRefImpl();
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotedElement createQuotedElement()
  {
    QuotedElementImpl quotedElement = new QuotedElementImpl();
    return quotedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Probe createProbe()
  {
    ProbeImpl probe = new ProbeImpl();
    return probe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Replacement createReplacement()
  {
    ReplacementImpl replacement = new ReplacementImpl();
    return replacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier createQuantifier()
  {
    QuantifierImpl quantifier = new QuantifierImpl();
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternCall createPatternCall()
  {
    PatternCallImpl patternCall = new PatternCallImpl();
    return patternCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueElement createValueElement()
  {
    ValueElementImpl valueElement = new ValueElementImpl();
    return valueElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToUpper createToUpper()
  {
    ToUpperImpl toUpper = new ToUpperImpl();
    return toUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeRefElement createScopeRefElement()
  {
    ScopeRefElementImpl scopeRefElement = new ScopeRefElementImpl();
    return scopeRefElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifierType createQuantifierTypeFromString(EDataType eDataType, String initialValue)
  {
    QuantifierType result = QuantifierType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuantifierTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue)
  {
    OperatorType result = OperatorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeLangPackage getProbeLangPackage()
  {
    return (ProbeLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProbeLangPackage getPackage()
  {
    return ProbeLangPackage.eINSTANCE;
  }

} //ProbeLangFactoryImpl
