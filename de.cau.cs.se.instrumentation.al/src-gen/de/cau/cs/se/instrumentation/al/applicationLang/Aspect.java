/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

import de.cau.cs.kieler.core.annotations.Annotation;

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
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getQuery <em>Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getCollectors <em>Collectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getAspect_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

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
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getAspect_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Collectors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.Collector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectors</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getAspect_Collectors()
   * @model containment="true"
   * @generated
   */
  EList<Collector> getCollectors();

} // Aspect
