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
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getQuery <em>Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
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
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getReferenceValue_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // ReferenceValue
