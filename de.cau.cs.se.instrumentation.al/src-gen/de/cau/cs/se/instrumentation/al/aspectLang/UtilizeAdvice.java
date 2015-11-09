/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilize Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getAdvice <em>Advice</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getParameterAssignments <em>Parameter Assignments</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeAdvice()
 * @model
 * @generated
 */
public interface UtilizeAdvice extends EObject
{
  /**
   * Returns the value of the '<em><b>Advice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advice</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advice</em>' reference.
   * @see #setAdvice(Advice)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeAdvice_Advice()
   * @model
   * @generated
   */
  Advice getAdvice();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice#getAdvice <em>Advice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Advice</em>' reference.
   * @see #getAdvice()
   * @generated
   */
  void setAdvice(Advice value);

  /**
   * Returns the value of the '<em><b>Parameter Assignments</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.ParamExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Assignments</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeAdvice_ParameterAssignments()
   * @model containment="true"
   * @generated
   */
  EList<ParamExpression> getParameterAssignments();

} // UtilizeAdvice
