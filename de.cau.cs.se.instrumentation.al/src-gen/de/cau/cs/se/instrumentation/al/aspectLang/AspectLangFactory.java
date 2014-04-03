/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage
 * @generated
 */
public interface AspectLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AspectLangFactory eINSTANCE = de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Registered Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Registered Package</em>'.
   * @generated
   */
  RegisteredPackage createRegisteredPackage();

  /**
   * Returns a new object of class '<em>Application Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Model</em>'.
   * @generated
   */
  ApplicationModel createApplicationModel();

  /**
   * Returns a new object of class '<em>Aspect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect</em>'.
   * @generated
   */
  Aspect createAspect();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Parameter Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Pattern</em>'.
   * @generated
   */
  ParameterPattern createParameterPattern();

  /**
   * Returns a new object of class '<em>Location Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Query</em>'.
   * @generated
   */
  LocationQuery createLocationQuery();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Param Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Query</em>'.
   * @generated
   */
  ParamQuery createParamQuery();

  /**
   * Returns a new object of class '<em>Param Compare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Compare</em>'.
   * @generated
   */
  ParamCompare createParamCompare();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Float Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Value</em>'.
   * @generated
   */
  FloatValue createFloatValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Reference Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Value</em>'.
   * @generated
   */
  ReferenceValue createReferenceValue();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Runtime Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runtime Property</em>'.
   * @generated
   */
  RuntimeProperty createRuntimeProperty();

  /**
   * Returns a new object of class '<em>Reflection Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflection Property</em>'.
   * @generated
   */
  ReflectionProperty createReflectionProperty();

  /**
   * Returns a new object of class '<em>Container Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Node</em>'.
   * @generated
   */
  ContainerNode createContainerNode();

  /**
   * Returns a new object of class '<em>Wildcard Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Node</em>'.
   * @generated
   */
  WildcardNode createWildcardNode();

  /**
   * Returns a new object of class '<em>Sub Path Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Path Node</em>'.
   * @generated
   */
  SubPathNode createSubPathNode();

  /**
   * Returns a new object of class '<em>Collector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collector</em>'.
   * @generated
   */
  Collector createCollector();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AspectLangPackage getAspectLangPackage();

} //AspectLangFactory
