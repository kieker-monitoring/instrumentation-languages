/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.Probe#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.Probe#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.Probe#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getProbe()
 * @model
 * @generated
 */
public interface Probe extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getProbe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.language.instrumentation.Probe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Classifier)
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getProbe_Type()
   * @model containment="true"
   * @generated
   */
  Classifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.language.instrumentation.Probe#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Classifier value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.language.instrumentation.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getProbe_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Probe
