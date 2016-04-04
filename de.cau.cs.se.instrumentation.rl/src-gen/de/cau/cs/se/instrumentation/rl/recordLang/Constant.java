/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EObject
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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstant_Type()
   * @model containment="true"
   * @generated
   */
  Classifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getType <em>Type</em>}' containment reference.
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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstant_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Constant#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

} // Constant
