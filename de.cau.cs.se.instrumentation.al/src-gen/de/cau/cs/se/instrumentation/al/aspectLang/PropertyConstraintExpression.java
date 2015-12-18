/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPropertyConstraintExpression()
 * @model
 * @generated
 */
public interface PropertyConstraintExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PropertyConstraintExpression)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPropertyConstraintExpression_Left()
   * @model containment="true"
   * @generated
   */
  PropertyConstraintExpression getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PropertyConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @see #setLogic(LogicOperator)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPropertyConstraintExpression_Logic()
   * @model
   * @generated
   */
  LogicOperator getLogic();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getLogic <em>Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @see #getLogic()
   * @generated
   */
  void setLogic(LogicOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PropertyConstraintExpression)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPropertyConstraintExpression_Right()
   * @model containment="true"
   * @generated
   */
  PropertyConstraintExpression getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PropertyConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Compare</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.CompareOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.CompareOperator
   * @see #setCompare(CompareOperator)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPropertyConstraintExpression_Compare()
   * @model
   * @generated
   */
  CompareOperator getCompare();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression#getCompare <em>Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.CompareOperator
   * @see #getCompare()
   * @generated
   */
  void setCompare(CompareOperator value);

} // PropertyConstraintExpression
