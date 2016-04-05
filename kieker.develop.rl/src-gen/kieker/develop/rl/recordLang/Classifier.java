/**
 */
package kieker.develop.rl.recordLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.Classifier#getType <em>Type</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Classifier#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @see kieker.develop.rl.recordLang.RecordLangPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends EObject
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
   * @see #setType(BaseType)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getClassifier_Type()
   * @model
   * @generated
   */
  BaseType getType();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Classifier#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(BaseType value);

  /**
   * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
   * The list contents are of type {@link kieker.develop.rl.recordLang.ArraySize}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sizes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sizes</em>' containment reference list.
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getClassifier_Sizes()
   * @model containment="true"
   * @generated
   */
  EList<ArraySize> getSizes();

} // Classifier
