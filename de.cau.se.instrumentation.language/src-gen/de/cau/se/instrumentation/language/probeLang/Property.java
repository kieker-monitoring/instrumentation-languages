/**
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Property#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Property#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Property#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
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
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  Classifier getType();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Classifier value);

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
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.ReferenceProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceProperty> getProperties();

} // Property
