/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilize Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeProbe#getProbe <em>Probe</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeProbe#getParameterAssignments <em>Parameter Assignments</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeProbe()
 * @model
 * @generated
 */
public interface UtilizeProbe extends EObject
{
  /**
   * Returns the value of the '<em><b>Probe</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probe</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probe</em>' reference.
   * @see #setProbe(Advice)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeProbe_Probe()
   * @model
   * @generated
   */
  Advice getProbe();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.UtilizeProbe#getProbe <em>Probe</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probe</em>' reference.
   * @see #getProbe()
   * @generated
   */
  void setProbe(Advice value);

  /**
   * Returns the value of the '<em><b>Parameter Assignments</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Assignments</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getUtilizeProbe_ParameterAssignments()
   * @model containment="true"
   * @generated
   */
  EList<Value> getParameterAssignments();

} // UtilizeProbe
