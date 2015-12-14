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
   * Returns a new object of class '<em>Aspect Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect Model</em>'.
   * @generated
   */
  AspectModel createAspectModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

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
   * Returns a new object of class '<em>Utilize Advice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Utilize Advice</em>'.
   * @generated
   */
  UtilizeAdvice createUtilizeAdvice();

  /**
   * Returns a new object of class '<em>Advice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advice</em>'.
   * @generated
   */
  Advice createAdvice();

  /**
   * Returns a new object of class '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Declaration</em>'.
   * @generated
   */
  ParameterDeclaration createParameterDeclaration();

  /**
   * Returns a new object of class '<em>Pointcut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointcut</em>'.
   * @generated
   */
  Pointcut createPointcut();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Method Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Query</em>'.
   * @generated
   */
  MethodQuery createMethodQuery();

  /**
   * Returns a new object of class '<em>Parameter Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Query</em>'.
   * @generated
   */
  ParameterQuery createParameterQuery();

  /**
   * Returns a new object of class '<em>Location Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Query</em>'.
   * @generated
   */
  LocationQuery createLocationQuery();

  /**
   * Returns a new object of class '<em>Composition Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Query</em>'.
   * @generated
   */
  CompositionQuery createCompositionQuery();

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
   * Returns a new object of class '<em>Param Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Expression</em>'.
   * @generated
   */
  ParamExpression createParamExpression();

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
   * Returns a new object of class '<em>Internal Function Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Function Property</em>'.
   * @generated
   */
  InternalFunctionProperty createInternalFunctionProperty();

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
   * Returns a new object of class '<em>Parent Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Node</em>'.
   * @generated
   */
  ParentNode createParentNode();

  /**
   * Returns a new object of class '<em>Collector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collector</em>'.
   * @generated
   */
  Collector createCollector();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AspectLangPackage getAspectLangPackage();

} //AspectLangFactory
