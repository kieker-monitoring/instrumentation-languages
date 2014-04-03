/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamCompare()
 * @model
 * @generated
 */
public interface ParamCompare extends EObject
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
   * @see #setLeft(Value)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamCompare_Left()
   * @model containment="true"
   * @generated
   */
  Value getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Value value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
   * @see #setOperator(Operator)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamCompare_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Value)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParamCompare_Right()
   * @model containment="true"
   * @generated
   */
  Value getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Value value);

} // ParamCompare
