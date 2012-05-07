/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Group#getSubTarget <em>Sub Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Item
{
  /**
   * Returns the value of the '<em><b>Sub Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Target</em>' containment reference.
   * @see #setSubTarget(Alternative)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getGroup_SubTarget()
   * @model containment="true"
   * @generated
   */
  Alternative getSubTarget();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Group#getSubTarget <em>Sub Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Target</em>' containment reference.
   * @see #getSubTarget()
   * @generated
   */
  void setSubTarget(Alternative value);

} // Group
