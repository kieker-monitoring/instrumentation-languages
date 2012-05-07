/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.util;

import de.cau.se.instrumentation.language.probeLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage
 * @generated
 */
public class ProbeLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProbeLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProbeLangPackage.eINSTANCE;
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
  protected ProbeLangSwitch<Adapter> modelSwitch =
    new ProbeLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseCodeElement(CodeElement object)
      {
        return createCodeElementAdapter();
      }
      @Override
      public Adapter caseParameterRef(ParameterRef object)
      {
        return createParameterRefAdapter();
      }
      @Override
      public Adapter caseQuotedElement(QuotedElement object)
      {
        return createQuotedElementAdapter();
      }
      @Override
      public Adapter caseProbe(Probe object)
      {
        return createProbeAdapter();
      }
      @Override
      public Adapter caseReplacement(Replacement object)
      {
        return createReplacementAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseQuantifier(Quantifier object)
      {
        return createQuantifierAdapter();
      }
      @Override
      public Adapter caseItem(Item object)
      {
        return createItemAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter casePatternCall(PatternCall object)
      {
        return createPatternCallAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseValueElement(ValueElement object)
      {
        return createValueElementAdapter();
      }
      @Override
      public Adapter caseToUpper(ToUpper object)
      {
        return createToUpperAdapter();
      }
      @Override
      public Adapter caseScopeRefElement(ScopeRefElement object)
      {
        return createScopeRefElementAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.CodeElement <em>Code Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.CodeElement
   * @generated
   */
  public Adapter createCodeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.ParameterRef
   * @generated
   */
  public Adapter createParameterRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.QuotedElement <em>Quoted Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.QuotedElement
   * @generated
   */
  public Adapter createQuotedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Probe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Probe
   * @generated
   */
  public Adapter createProbeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Replacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Replacement
   * @generated
   */
  public Adapter createReplacementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Quantifier
   * @generated
   */
  public Adapter createQuantifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Item
   * @generated
   */
  public Adapter createItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.PatternCall <em>Pattern Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.PatternCall
   * @generated
   */
  public Adapter createPatternCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.ValueElement <em>Value Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.ValueElement
   * @generated
   */
  public Adapter createValueElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.ToUpper <em>To Upper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.ToUpper
   * @generated
   */
  public Adapter createToUpperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.ScopeRefElement <em>Scope Ref Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.ScopeRefElement
   * @generated
   */
  public Adapter createScopeRefElementAdapter()
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

} //ProbeLangAdapterFactory
