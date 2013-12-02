/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getRuntimeProperty()
 * @model
 * @generated
 */
public interface RuntimeProperty extends Parameter
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getRuntimeProperty_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

} // RuntimeProperty
