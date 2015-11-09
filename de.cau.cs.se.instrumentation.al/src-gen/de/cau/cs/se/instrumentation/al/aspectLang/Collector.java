/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCollector()
 * @model
 * @generated
 */
public interface Collector extends EObject
{
  /**
   * Returns the value of the '<em><b>Insertion Point</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertion Point</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertion Point</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
   * @see #setInsertionPoint(InsertionPoint)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCollector_InsertionPoint()
   * @model
   * @generated
   */
  InsertionPoint getInsertionPoint();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Collector#getInsertionPoint <em>Insertion Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertion Point</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
   * @see #getInsertionPoint()
   * @generated
   */
  void setInsertionPoint(InsertionPoint value);

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCollector_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // Collector
