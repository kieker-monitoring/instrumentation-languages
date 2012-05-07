/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.util;

import de.cau.se.instrumentation.language.probeLang.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage
 * @generated
 */
public class ProbeLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProbeLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProbeLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProbeLangPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.CODE_ELEMENT:
      {
        CodeElement codeElement = (CodeElement)theEObject;
        T result = caseCodeElement(codeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.PARAMETER_REF:
      {
        ParameterRef parameterRef = (ParameterRef)theEObject;
        T result = caseParameterRef(parameterRef);
        if (result == null) result = caseCodeElement(parameterRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.QUOTED_ELEMENT:
      {
        QuotedElement quotedElement = (QuotedElement)theEObject;
        T result = caseQuotedElement(quotedElement);
        if (result == null) result = caseCodeElement(quotedElement);
        if (result == null) result = caseItem(quotedElement);
        if (result == null) result = caseValueElement(quotedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.PROBE:
      {
        Probe probe = (Probe)theEObject;
        T result = caseProbe(probe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.REPLACEMENT:
      {
        Replacement replacement = (Replacement)theEObject;
        T result = caseReplacement(replacement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.ALTERNATIVE:
      {
        Alternative alternative = (Alternative)theEObject;
        T result = caseAlternative(alternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.QUANTIFIER:
      {
        Quantifier quantifier = (Quantifier)theEObject;
        T result = caseQuantifier(quantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = caseItem(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseItem(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.PATTERN_CALL:
      {
        PatternCall patternCall = (PatternCall)theEObject;
        T result = casePatternCall(patternCall);
        if (result == null) result = caseValueElement(patternCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.VALUE_ELEMENT:
      {
        ValueElement valueElement = (ValueElement)theEObject;
        T result = caseValueElement(valueElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.TO_UPPER:
      {
        ToUpper toUpper = (ToUpper)theEObject;
        T result = caseToUpper(toUpper);
        if (result == null) result = caseCodeElement(toUpper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProbeLangPackage.SCOPE_REF_ELEMENT:
      {
        ScopeRefElement scopeRefElement = (ScopeRefElement)theEObject;
        T result = caseScopeRefElement(scopeRefElement);
        if (result == null) result = caseValueElement(scopeRefElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeElement(CodeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterRef(ParameterRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quoted Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quoted Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotedElement(QuotedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbe(Probe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replacement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replacement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplacement(Replacement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternative(Alternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifier(Quantifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternCall(PatternCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueElement(ValueElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>To Upper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>To Upper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToUpper(ToUpper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope Ref Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope Ref Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopeRefElement(ScopeRefElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProbeLangSwitch
