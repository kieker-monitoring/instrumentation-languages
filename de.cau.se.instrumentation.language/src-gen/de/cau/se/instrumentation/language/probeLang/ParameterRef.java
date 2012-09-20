/**
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.ParameterRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getParameterRef()
 * @model
 * @generated
 */
public interface ParameterRef extends XExpression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Parameter)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getParameterRef_Ref()
   * @model
   * @generated
   */
  Parameter getRef();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.ParameterRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Parameter value);

} // ParameterRef
