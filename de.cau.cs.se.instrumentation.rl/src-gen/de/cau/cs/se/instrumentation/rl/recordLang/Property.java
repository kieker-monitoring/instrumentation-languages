/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

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
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getReferTo <em>Refer To</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty()
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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  Classifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Classifier value);

  /**
   * Returns the value of the '<em><b>Refer To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To</em>' reference.
   * @see #setReferTo(Property)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty_ReferTo()
   * @model
   * @generated
   */
  Property getReferTo();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getReferTo <em>Refer To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refer To</em>' reference.
   * @see #getReferTo()
   * @generated
   */
  void setReferTo(Property value);

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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.ReferenceProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Literal)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Property#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

} // Property