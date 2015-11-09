/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamExpression()
 * @model
 * @generated
 */
public interface ParamExpression extends EObject
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
   * @see #setLeft(ParamExpression)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamExpression_Left()
   * @model containment="true"
   * @generated
   */
  ParamExpression getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ParamExpression value);

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
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamExpression_Logic()
   * @model
   * @generated
   */
  LogicOperator getLogic();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getLogic <em>Logic</em>}' attribute.
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
   * @see #setRight(ParamExpression)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamExpression_Right()
   * @model containment="true"
   * @generated
   */
  ParamExpression getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ParamExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @see #setOperator(LogicOperator)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamExpression_Operator()
   * @model
   * @generated
   */
  LogicOperator getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(LogicOperator value);

} // ParamExpression
