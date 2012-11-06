/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation.impl;

import de.cau.cs.se.instrumentation.language.instrumentation.Classifier;
import de.cau.cs.se.instrumentation.language.instrumentation.CodeElement;
import de.cau.cs.se.instrumentation.language.instrumentation.Import;
import de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationFactory;
import de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage;
import de.cau.cs.se.instrumentation.language.instrumentation.Model;
import de.cau.cs.se.instrumentation.language.instrumentation.Parameter;
import de.cau.cs.se.instrumentation.language.instrumentation.ParameterRef;
import de.cau.cs.se.instrumentation.language.instrumentation.Pattern;
import de.cau.cs.se.instrumentation.language.instrumentation.Probe;
import de.cau.cs.se.instrumentation.language.instrumentation.Property;
import de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty;
import de.cau.cs.se.instrumentation.language.instrumentation.SimpleCodeElement;
import de.cau.cs.se.instrumentation.language.instrumentation.XStringLiteral;

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
public class InstrumentationFactoryImpl extends EFactoryImpl implements InstrumentationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstrumentationFactory init()
  {
    try
    {
      InstrumentationFactory theInstrumentationFactory = (InstrumentationFactory)EPackage.Registry.INSTANCE.getEFactory("http://se.cs.cau.de/languages/InstrumentationLanguage"); 
      if (theInstrumentationFactory != null)
      {
        return theInstrumentationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InstrumentationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstrumentationFactoryImpl()
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
      case InstrumentationPackage.MODEL: return createModel();
      case InstrumentationPackage.IMPORT: return createImport();
      case InstrumentationPackage.PACKAGE: return createPackage();
      case InstrumentationPackage.PATTERN: return createPattern();
      case InstrumentationPackage.PARAMETER: return createParameter();
      case InstrumentationPackage.CODE_ELEMENT: return createCodeElement();
      case InstrumentationPackage.SIMPLE_CODE_ELEMENT: return createSimpleCodeElement();
      case InstrumentationPackage.PARAMETER_REF: return createParameterRef();
      case InstrumentationPackage.XSTRING_LITERAL: return createXStringLiteral();
      case InstrumentationPackage.PROBE: return createProbe();
      case InstrumentationPackage.CLASSIFIER: return createClassifier();
      case InstrumentationPackage.PROPERTY: return createProperty();
      case InstrumentationPackage.REFERENCE_PROPERTY: return createReferenceProperty();
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
  public de.cau.cs.se.instrumentation.language.instrumentation.Package createPackage()
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
  public InstrumentationPackage getInstrumentationPackage()
  {
    return (InstrumentationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InstrumentationPackage getPackage()
  {
    return InstrumentationPackage.eINSTANCE;
  }

} //InstrumentationFactoryImpl
