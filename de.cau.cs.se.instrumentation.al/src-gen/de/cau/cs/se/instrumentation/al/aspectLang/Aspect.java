/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getQuery <em>Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getCollectors <em>Collectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject
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
   * @see #setQuery(Query)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAspect_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Aspect#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Collectors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.Collector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectors</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAspect_Collectors()
   * @model containment="true"
   * @generated
   */
  EList<Collector> getCollectors();

} // Aspect
