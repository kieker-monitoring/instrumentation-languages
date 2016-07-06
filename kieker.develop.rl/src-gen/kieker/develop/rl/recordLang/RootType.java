/**
 */
package kieker.develop.rl.recordLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.RootType#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see kieker.develop.rl.recordLang.RecordLangPackage#getRootType()
 * @model
 * @generated
 */
public interface RootType extends EObject
{
  /**
   * Returns the value of the '<em><b>Record</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' reference.
   * @see #setRecord(RecordType)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getRootType_Record()
   * @model
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.RootType#getRecord <em>Record</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

} // RootType
