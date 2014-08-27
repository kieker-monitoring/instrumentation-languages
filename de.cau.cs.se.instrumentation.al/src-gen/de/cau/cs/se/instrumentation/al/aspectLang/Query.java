/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getLocation <em>Location</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(LocationQuery)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getQuery_Location()
   * @model containment="true"
   * @generated
   */
  LocationQuery getLocation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(LocationQuery value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(MethodQuery)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getQuery_Method()
   * @model containment="true"
   * @generated
   */
  MethodQuery getMethod();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Query#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(MethodQuery value);

} // Query
