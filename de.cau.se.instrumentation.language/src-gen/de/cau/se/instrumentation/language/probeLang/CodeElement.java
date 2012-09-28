/**
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.CodeElement#isToUpper <em>To Upper</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.CodeElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getCodeElement()
 * @model
 * @generated
 */
public interface CodeElement extends EObject
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
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getCodeElement_ToUpper()
   * @model
   * @generated
   */
  boolean isToUpper();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.CodeElement#isToUpper <em>To Upper</em>}' attribute.
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
   * @see #setValue(SimpleCodeElement)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getCodeElement_Value()
   * @model containment="true"
   * @generated
   */
  SimpleCodeElement getValue();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.CodeElement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SimpleCodeElement value);

} // CodeElement
