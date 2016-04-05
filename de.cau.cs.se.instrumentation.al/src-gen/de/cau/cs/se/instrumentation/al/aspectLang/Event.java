/**
 */
package kieker.tools.al.aspectLang;

import kieker.tools.rl.recordLang.RecordType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.Event#getType <em>Type</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.Event#getInitializations <em>Initializations</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(RecordType)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getEvent_Type()
   * @model
   * @generated
   */
  RecordType getType();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.Event#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(RecordType value);

  /**
   * Returns the value of the '<em><b>Initializations</b></em>' containment reference list.
   * The list contents are of type {@link kieker.tools.al.aspectLang.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializations</em>' containment reference list.
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getEvent_Initializations()
   * @model containment="true"
   * @generated
   */
  EList<Value> getInitializations();

} // Event
