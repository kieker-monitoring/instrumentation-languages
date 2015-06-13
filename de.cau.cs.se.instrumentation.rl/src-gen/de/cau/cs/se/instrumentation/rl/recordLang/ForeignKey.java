/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Type</em>' reference.
   * @see #setRecordType(RecordType)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getForeignKey_RecordType()
   * @model
   * @generated
   */
  RecordType getRecordType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey#getRecordType <em>Record Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Type</em>' reference.
   * @see #getRecordType()
   * @generated
   */
  void setRecordType(RecordType value);

  /**
   * Returns the value of the '<em><b>Property Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Ref</em>' reference.
   * @see #setPropertyRef(Property)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getForeignKey_PropertyRef()
   * @model
   * @generated
   */
  Property getPropertyRef();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey#getPropertyRef <em>Property Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Ref</em>' reference.
   * @see #getPropertyRef()
   * @generated
   */
  void setPropertyRef(Property value);

} // ForeignKey
