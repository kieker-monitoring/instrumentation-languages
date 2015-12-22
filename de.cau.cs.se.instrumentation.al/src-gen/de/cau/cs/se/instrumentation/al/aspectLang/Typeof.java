/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typeof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Typeof#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getTypeof()
 * @model
 * @generated
 */
public interface Typeof extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(TypeReference)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getTypeof_Reference()
   * @model containment="true"
   * @generated
   */
  TypeReference getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Typeof#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(TypeReference value);

} // Typeof
