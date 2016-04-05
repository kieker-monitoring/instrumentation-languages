/**
 */
package kieker.tools.al.aspectLang.util;

import kieker.tools.al.aspectLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kieker.tools.al.aspectLang.AspectLangPackage
 * @generated
 */
public class AspectLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AspectLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AspectLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectLangSwitch<Adapter> modelSwitch =
    new AspectLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseAspectModel(AspectModel object)
      {
        return createAspectModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseApplicationModel(ApplicationModel object)
      {
        return createApplicationModelAdapter();
      }
      @Override
      public Adapter caseAspect(Aspect object)
      {
        return createAspectAdapter();
      }
      @Override
      public Adapter caseUtilizeAdvice(UtilizeAdvice object)
      {
        return createUtilizeAdviceAdapter();
      }
      @Override
      public Adapter caseAdvice(Advice object)
      {
        return createAdviceAdapter();
      }
      @Override
      public Adapter caseAdviceParameterDeclaration(AdviceParameterDeclaration object)
      {
        return createAdviceParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseCollector(Collector object)
      {
        return createCollectorAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseReferenceValue(ReferenceValue object)
      {
        return createReferenceValueAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseInternalFunctionProperty(InternalFunctionProperty object)
      {
        return createInternalFunctionPropertyAdapter();
      }
      @Override
      public Adapter caseReflectionProperty(ReflectionProperty object)
      {
        return createReflectionPropertyAdapter();
      }
      @Override
      public Adapter caseRuntimeProperty(RuntimeProperty object)
      {
        return createRuntimePropertyAdapter();
      }
      @Override
      public Adapter caseAdviceParameter(AdviceParameter object)
      {
        return createAdviceParameterAdapter();
      }
      @Override
      public Adapter casePointcut(Pointcut object)
      {
        return createPointcutAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseLocationQuery(LocationQuery object)
      {
        return createLocationQueryAdapter();
      }
      @Override
      public Adapter caseCompositionQuery(CompositionQuery object)
      {
        return createCompositionQueryAdapter();
      }
      @Override
      public Adapter caseOperationQuery(OperationQuery object)
      {
        return createOperationQueryAdapter();
      }
      @Override
      public Adapter caseParameterQuery(ParameterQuery object)
      {
        return createParameterQueryAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseContainerNode(ContainerNode object)
      {
        return createContainerNodeAdapter();
      }
      @Override
      public Adapter caseWildcardNode(WildcardNode object)
      {
        return createWildcardNodeAdapter();
      }
      @Override
      public Adapter caseSubPathNode(SubPathNode object)
      {
        return createSubPathNodeAdapter();
      }
      @Override
      public Adapter caseParentNode(ParentNode object)
      {
        return createParentNodeAdapter();
      }
      @Override
      public Adapter casePropertyConstraint(PropertyConstraint object)
      {
        return createPropertyConstraintAdapter();
      }
      @Override
      public Adapter casePropertyConstraintCompare(PropertyConstraintCompare object)
      {
        return createPropertyConstraintCompareAdapter();
      }
      @Override
      public Adapter caseConstraintElement(ConstraintElement object)
      {
        return createConstraintElementAdapter();
      }
      @Override
      public Adapter caseLocalQuery(LocalQuery object)
      {
        return createLocalQueryAdapter();
      }
      @Override
      public Adapter caseModelProperty(ModelProperty object)
      {
        return createModelPropertyAdapter();
      }
      @Override
      public Adapter caseTypeof(Typeof object)
      {
        return createTypeofAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseFloatLiteral(FloatLiteral object)
      {
        return createFloatLiteralAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseTypeReference(TypeReference object)
      {
        return createTypeReferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.AspectModel <em>Aspect Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.AspectModel
   * @generated
   */
  public Adapter createAspectModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ApplicationModel <em>Application Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ApplicationModel
   * @generated
   */
  public Adapter createApplicationModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Aspect
   * @generated
   */
  public Adapter createAspectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.UtilizeAdvice <em>Utilize Advice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.UtilizeAdvice
   * @generated
   */
  public Adapter createUtilizeAdviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Advice
   * @generated
   */
  public Adapter createAdviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.AdviceParameterDeclaration <em>Advice Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.AdviceParameterDeclaration
   * @generated
   */
  public Adapter createAdviceParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Collector <em>Collector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Collector
   * @generated
   */
  public Adapter createCollectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ReferenceValue <em>Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ReferenceValue
   * @generated
   */
  public Adapter createReferenceValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.InternalFunctionProperty <em>Internal Function Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.InternalFunctionProperty
   * @generated
   */
  public Adapter createInternalFunctionPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ReflectionProperty <em>Reflection Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ReflectionProperty
   * @generated
   */
  public Adapter createReflectionPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.RuntimeProperty <em>Runtime Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.RuntimeProperty
   * @generated
   */
  public Adapter createRuntimePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.AdviceParameter <em>Advice Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.AdviceParameter
   * @generated
   */
  public Adapter createAdviceParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Pointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Pointcut
   * @generated
   */
  public Adapter createPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.LocationQuery <em>Location Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.LocationQuery
   * @generated
   */
  public Adapter createLocationQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.CompositionQuery <em>Composition Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.CompositionQuery
   * @generated
   */
  public Adapter createCompositionQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.OperationQuery <em>Operation Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.OperationQuery
   * @generated
   */
  public Adapter createOperationQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ParameterQuery <em>Parameter Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ParameterQuery
   * @generated
   */
  public Adapter createParameterQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ContainerNode <em>Container Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ContainerNode
   * @generated
   */
  public Adapter createContainerNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.WildcardNode <em>Wildcard Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.WildcardNode
   * @generated
   */
  public Adapter createWildcardNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.SubPathNode <em>Sub Path Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.SubPathNode
   * @generated
   */
  public Adapter createSubPathNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ParentNode <em>Parent Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ParentNode
   * @generated
   */
  public Adapter createParentNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.PropertyConstraint <em>Property Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.PropertyConstraint
   * @generated
   */
  public Adapter createPropertyConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.PropertyConstraintCompare <em>Property Constraint Compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.PropertyConstraintCompare
   * @generated
   */
  public Adapter createPropertyConstraintCompareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ConstraintElement <em>Constraint Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ConstraintElement
   * @generated
   */
  public Adapter createConstraintElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.LocalQuery <em>Local Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.LocalQuery
   * @generated
   */
  public Adapter createLocalQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.ModelProperty <em>Model Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.ModelProperty
   * @generated
   */
  public Adapter createModelPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Typeof <em>Typeof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Typeof
   * @generated
   */
  public Adapter createTypeofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.FloatLiteral
   * @generated
   */
  public Adapter createFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link kieker.tools.al.aspectLang.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see kieker.tools.al.aspectLang.TypeReference
   * @generated
   */
  public Adapter createTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AspectLangAdapterFactory
