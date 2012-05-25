/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.StringElement#isToUpper <em>To Upper</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.StringElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getStringElement()
 * @model
 * @generated
 */
public interface StringElement extends EObject
{
  /**
   * Returns the value of the '<em><b>To Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Upper</em>' attribute.
   * @see #setToUpper(boolean)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getStringElement_ToUpper()
   * @model
   * @generated
   */
  boolean isToUpper();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.StringElement#isToUpper <em>To Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Upper</em>' attribute.
   * @see #isToUpper()
   * @generated
   */
  void setToUpper(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getStringElement_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.StringElement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

} // StringElement
