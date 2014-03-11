/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.RecordType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.RecordType#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends Type
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getRecordType_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.RecordType#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(RecordType)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getRecordType_Parent()
   * @model
   * @generated
   */
  RecordType getParent();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.RecordType#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(RecordType value);

} // RecordType