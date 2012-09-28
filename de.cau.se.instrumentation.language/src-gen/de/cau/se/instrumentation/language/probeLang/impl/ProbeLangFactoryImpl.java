/**
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.Classifier;
import de.cau.se.instrumentation.language.probeLang.CodeElement;
import de.cau.se.instrumentation.language.probeLang.Import;
import de.cau.se.instrumentation.language.probeLang.Model;
import de.cau.se.instrumentation.language.probeLang.Parameter;
import de.cau.se.instrumentation.language.probeLang.ParameterRef;
import de.cau.se.instrumentation.language.probeLang.Pattern;
import de.cau.se.instrumentation.language.probeLang.Probe;
import de.cau.se.instrumentation.language.probeLang.ProbeLangFactory;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.Property;
import de.cau.se.instrumentation.language.probeLang.ReferenceProperty;
import de.cau.se.instrumentation.language.probeLang.SimpleCodeElement;
import de.cau.se.instrumentation.language.probeLang.XStringLiteral;

import org.eclipse.emf.ecore.EClass;
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
      case ProbeLangPackage.IMPORT: return createImport();
      case ProbeLangPackage.PACKAGE: return createPackage();
      case ProbeLangPackage.PATTERN: return createPattern();
      case ProbeLangPackage.PARAMETER: return createParameter();
      case ProbeLangPackage.CODE_ELEMENT: return createCodeElement();
      case ProbeLangPackage.SIMPLE_CODE_ELEMENT: return createSimpleCodeElement();
      case ProbeLangPackage.PARAMETER_REF: return createParameterRef();
      case ProbeLangPackage.XSTRING_LITERAL: return createXStringLiteral();
      case ProbeLangPackage.PROBE: return createProbe();
      case ProbeLangPackage.CLASSIFIER: return createClassifier();
      case ProbeLangPackage.PROPERTY: return createProperty();
      case ProbeLangPackage.REFERENCE_PROPERTY: return createReferenceProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.se.instrumentation.language.probeLang.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
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
  public SimpleCodeElement createSimpleCodeElement()
  {
    SimpleCodeElementImpl simpleCodeElement = new SimpleCodeElementImpl();
    return simpleCodeElement;
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
  public XStringLiteral createXStringLiteral()
  {
    XStringLiteralImpl xStringLiteral = new XStringLiteralImpl();
    return xStringLiteral;
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
  public Classifier createClassifier()
  {
    ClassifierImpl classifier = new ClassifierImpl();
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceProperty createReferenceProperty()
  {
    ReferencePropertyImpl referenceProperty = new ReferencePropertyImpl();
    return referenceProperty;
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
