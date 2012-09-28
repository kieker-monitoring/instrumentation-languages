/**
 */
package de.cau.se.instrumentation.language.probeLang.util;

import de.cau.se.instrumentation.language.probeLang.Classifier;
import de.cau.se.instrumentation.language.probeLang.CodeElement;
import de.cau.se.instrumentation.language.probeLang.Import;
import de.cau.se.instrumentation.language.probeLang.Model;
import de.cau.se.instrumentation.language.probeLang.Parameter;
import de.cau.se.instrumentation.language.probeLang.ParameterRef;
import de.cau.se.instrumentation.language.probeLang.Pattern;
import de.cau.se.instrumentation.language.probeLang.Probe;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.Property;
import de.cau.se.instrumentation.language.probeLang.ReferenceProperty;
import de.cau.se.instrumentation.language.probeLang.SimpleCodeElement;
import de.cau.se.instrumentation.language.probeLang.XStringLiteral;

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
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackage(de.cau.se.instrumentation.language.probeLang.Package object)
      {
        return createPackageAdapter();
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
      public Adapter caseSimpleCodeElement(SimpleCodeElement object)
      {
        return createSimpleCodeElementAdapter();
      }
      @Override
      public Adapter caseParameterRef(ParameterRef object)
      {
        return createParameterRefAdapter();
      }
      @Override
      public Adapter caseXStringLiteral(XStringLiteral object)
      {
        return createXStringLiteralAdapter();
      }
      @Override
      public Adapter caseProbe(Probe object)
      {
        return createProbeAdapter();
      }
      @Override
      public Adapter caseClassifier(Classifier object)
      {
        return createClassifierAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseReferenceProperty(ReferenceProperty object)
      {
        return createReferencePropertyAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Package
   * @generated
   */
  public Adapter createPackageAdapter()
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
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.SimpleCodeElement <em>Simple Code Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.SimpleCodeElement
   * @generated
   */
  public Adapter createSimpleCodeElementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.XStringLiteral
   * @generated
   */
  public Adapter createXStringLiteralAdapter()
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
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Classifier
   * @generated
   */
  public Adapter createClassifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.se.instrumentation.language.probeLang.ReferenceProperty <em>Reference Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.se.instrumentation.language.probeLang.ReferenceProperty
   * @generated
   */
  public Adapter createReferencePropertyAdapter()
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
