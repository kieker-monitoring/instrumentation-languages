/**
 */
package kieker.develop.al.aspectLang.util;

import kieker.develop.al.aspectLang.*;

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
 * @see kieker.develop.al.aspectLang.AspectLangPackage
 * @generated
 */
public class AspectLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AspectLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AspectLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
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
      case AspectLangPackage.ASPECT_MODEL:
      {
        AspectModel aspectModel = (AspectModel)theEObject;
        T result = caseAspectModel(aspectModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.APPLICATION_MODEL:
      {
        ApplicationModel applicationModel = (ApplicationModel)theEObject;
        T result = caseApplicationModel(applicationModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.ASPECT:
      {
        Aspect aspect = (Aspect)theEObject;
        T result = caseAspect(aspect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.UTILIZE_ADVICE:
      {
        UtilizeAdvice utilizeAdvice = (UtilizeAdvice)theEObject;
        T result = caseUtilizeAdvice(utilizeAdvice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.ADVICE:
      {
        Advice advice = (Advice)theEObject;
        T result = caseAdvice(advice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.ADVICE_PARAMETER_DECLARATION:
      {
        AdviceParameterDeclaration adviceParameterDeclaration = (AdviceParameterDeclaration)theEObject;
        T result = caseAdviceParameterDeclaration(adviceParameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.COLLECTOR:
      {
        Collector collector = (Collector)theEObject;
        T result = caseCollector(collector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.REFERENCE_VALUE:
      {
        ReferenceValue referenceValue = (ReferenceValue)theEObject;
        T result = caseReferenceValue(referenceValue);
        if (result == null) result = caseValue(referenceValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.INTERNAL_FUNCTION_PROPERTY:
      {
        InternalFunctionProperty internalFunctionProperty = (InternalFunctionProperty)theEObject;
        T result = caseInternalFunctionProperty(internalFunctionProperty);
        if (result == null) result = caseValue(internalFunctionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.REFLECTION_PROPERTY:
      {
        ReflectionProperty reflectionProperty = (ReflectionProperty)theEObject;
        T result = caseReflectionProperty(reflectionProperty);
        if (result == null) result = caseProperty(reflectionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.RUNTIME_PROPERTY:
      {
        RuntimeProperty runtimeProperty = (RuntimeProperty)theEObject;
        T result = caseRuntimeProperty(runtimeProperty);
        if (result == null) result = caseProperty(runtimeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.ADVICE_PARAMETER:
      {
        AdviceParameter adviceParameter = (AdviceParameter)theEObject;
        T result = caseAdviceParameter(adviceParameter);
        if (result == null) result = caseValue(adviceParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.POINTCUT:
      {
        Pointcut pointcut = (Pointcut)theEObject;
        T result = casePointcut(pointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.LOCATION_QUERY:
      {
        LocationQuery locationQuery = (LocationQuery)theEObject;
        T result = caseLocationQuery(locationQuery);
        if (result == null) result = caseQuery(locationQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.COMPOSITION_QUERY:
      {
        CompositionQuery compositionQuery = (CompositionQuery)theEObject;
        T result = caseCompositionQuery(compositionQuery);
        if (result == null) result = caseQuery(compositionQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.OPERATION_QUERY:
      {
        OperationQuery operationQuery = (OperationQuery)theEObject;
        T result = caseOperationQuery(operationQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.PARAMETER_QUERY:
      {
        ParameterQuery parameterQuery = (ParameterQuery)theEObject;
        T result = caseParameterQuery(parameterQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.CONTAINER_NODE:
      {
        ContainerNode containerNode = (ContainerNode)theEObject;
        T result = caseContainerNode(containerNode);
        if (result == null) result = caseNode(containerNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.WILDCARD_NODE:
      {
        WildcardNode wildcardNode = (WildcardNode)theEObject;
        T result = caseWildcardNode(wildcardNode);
        if (result == null) result = caseNode(wildcardNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.SUB_PATH_NODE:
      {
        SubPathNode subPathNode = (SubPathNode)theEObject;
        T result = caseSubPathNode(subPathNode);
        if (result == null) result = caseNode(subPathNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.PARENT_NODE:
      {
        ParentNode parentNode = (ParentNode)theEObject;
        T result = caseParentNode(parentNode);
        if (result == null) result = caseNode(parentNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.PROPERTY_CONSTRAINT:
      {
        PropertyConstraint propertyConstraint = (PropertyConstraint)theEObject;
        T result = casePropertyConstraint(propertyConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE:
      {
        PropertyConstraintCompare propertyConstraintCompare = (PropertyConstraintCompare)theEObject;
        T result = casePropertyConstraintCompare(propertyConstraintCompare);
        if (result == null) result = casePropertyConstraint(propertyConstraintCompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.CONSTRAINT_ELEMENT:
      {
        ConstraintElement constraintElement = (ConstraintElement)theEObject;
        T result = caseConstraintElement(constraintElement);
        if (result == null) result = casePropertyConstraintCompare(constraintElement);
        if (result == null) result = casePropertyConstraint(constraintElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.LOCAL_QUERY:
      {
        LocalQuery localQuery = (LocalQuery)theEObject;
        T result = caseLocalQuery(localQuery);
        if (result == null) result = caseConstraintElement(localQuery);
        if (result == null) result = casePropertyConstraintCompare(localQuery);
        if (result == null) result = casePropertyConstraint(localQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.MODEL_PROPERTY:
      {
        ModelProperty modelProperty = (ModelProperty)theEObject;
        T result = caseModelProperty(modelProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.TYPEOF:
      {
        Typeof typeof = (Typeof)theEObject;
        T result = caseTypeof(typeof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseValue(literal);
        if (result == null) result = caseConstraintElement(literal);
        if (result == null) result = casePropertyConstraintCompare(literal);
        if (result == null) result = casePropertyConstraint(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.FLOAT_LITERAL:
      {
        FloatLiteral floatLiteral = (FloatLiteral)theEObject;
        T result = caseFloatLiteral(floatLiteral);
        if (result == null) result = caseLiteral(floatLiteral);
        if (result == null) result = caseValue(floatLiteral);
        if (result == null) result = caseConstraintElement(floatLiteral);
        if (result == null) result = casePropertyConstraintCompare(floatLiteral);
        if (result == null) result = casePropertyConstraint(floatLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseLiteral(intLiteral);
        if (result == null) result = caseValue(intLiteral);
        if (result == null) result = caseConstraintElement(intLiteral);
        if (result == null) result = casePropertyConstraintCompare(intLiteral);
        if (result == null) result = casePropertyConstraint(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseValue(stringLiteral);
        if (result == null) result = caseConstraintElement(stringLiteral);
        if (result == null) result = casePropertyConstraintCompare(stringLiteral);
        if (result == null) result = casePropertyConstraint(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AspectLangPackage.TYPE_REFERENCE:
      {
        TypeReference typeReference = (TypeReference)theEObject;
        T result = caseTypeReference(typeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspectModel(AspectModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationModel(ApplicationModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspect(Aspect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Utilize Advice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Utilize Advice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUtilizeAdvice(UtilizeAdvice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdvice(Advice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Advice Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Advice Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdviceParameterDeclaration(AdviceParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollector(Collector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
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
   * Returns the result of interpreting the object as an instance of '<em>Reference Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceValue(ReferenceValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Function Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Function Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalFunctionProperty(InternalFunctionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reflection Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reflection Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReflectionProperty(ReflectionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Runtime Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Runtime Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuntimeProperty(RuntimeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Advice Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Advice Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdviceParameter(AdviceParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointcut(Pointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocationQuery(LocationQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionQuery(CompositionQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationQuery(OperationQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterQuery(ParameterQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerNode(ContainerNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardNode(WildcardNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Path Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Path Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubPathNode(SubPathNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentNode(ParentNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyConstraint(PropertyConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Constraint Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Constraint Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyConstraintCompare(PropertyConstraintCompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintElement(ConstraintElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalQuery(LocalQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelProperty(ModelProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typeof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typeof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeof(Typeof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatLiteral(FloatLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeReference(TypeReference object)
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

} //AspectLangSwitch
