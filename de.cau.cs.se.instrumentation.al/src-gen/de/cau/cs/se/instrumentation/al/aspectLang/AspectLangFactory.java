/**
 */
package kieker.tools.al.aspectLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kieker.tools.al.aspectLang.AspectLangPackage
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
  AspectLangFactory eINSTANCE = kieker.tools.al.aspectLang.impl.AspectLangFactoryImpl.init();

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
   * Returns a new object of class '<em>Advice Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advice Parameter Declaration</em>'.
   * @generated
   */
  AdviceParameterDeclaration createAdviceParameterDeclaration();

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
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Reference Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Value</em>'.
   * @generated
   */
  ReferenceValue createReferenceValue();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Internal Function Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Function Property</em>'.
   * @generated
   */
  InternalFunctionProperty createInternalFunctionProperty();

  /**
   * Returns a new object of class '<em>Reflection Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflection Property</em>'.
   * @generated
   */
  ReflectionProperty createReflectionProperty();

  /**
   * Returns a new object of class '<em>Runtime Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runtime Property</em>'.
   * @generated
   */
  RuntimeProperty createRuntimeProperty();

  /**
   * Returns a new object of class '<em>Advice Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advice Parameter</em>'.
   * @generated
   */
  AdviceParameter createAdviceParameter();

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
   * Returns a new object of class '<em>Operation Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Query</em>'.
   * @generated
   */
  OperationQuery createOperationQuery();

  /**
   * Returns a new object of class '<em>Parameter Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Query</em>'.
   * @generated
   */
  ParameterQuery createParameterQuery();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

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
   * Returns a new object of class '<em>Property Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Constraint</em>'.
   * @generated
   */
  PropertyConstraint createPropertyConstraint();

  /**
   * Returns a new object of class '<em>Property Constraint Compare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Constraint Compare</em>'.
   * @generated
   */
  PropertyConstraintCompare createPropertyConstraintCompare();

  /**
   * Returns a new object of class '<em>Constraint Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Element</em>'.
   * @generated
   */
  ConstraintElement createConstraintElement();

  /**
   * Returns a new object of class '<em>Local Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Query</em>'.
   * @generated
   */
  LocalQuery createLocalQuery();

  /**
   * Returns a new object of class '<em>Model Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Property</em>'.
   * @generated
   */
  ModelProperty createModelProperty();

  /**
   * Returns a new object of class '<em>Typeof</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typeof</em>'.
   * @generated
   */
  Typeof createTypeof();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AspectLangPackage getAspectLangPackage();

} //AspectLangFactory
