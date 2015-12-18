/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getQuery <em>Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getReferenceValue()
 * @model
 * @generated
 */
public interface ReferenceValue extends Value
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(LocationQuery)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getReferenceValue_Query()
   * @model containment="true"
   * @generated
   */
  LocationQuery getQuery();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(LocationQuery value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getReferenceValue_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // ReferenceValue
