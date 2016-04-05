/**
 */
package kieker.develop.al.aspectLang;

import kieker.develop.al.mapping.Feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.ModelProperty#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getModelProperty()
 * @model
 * @generated
 */
public interface ModelProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Feature)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getModelProperty_Reference()
   * @model
   * @generated
   */
  Feature getReference();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.ModelProperty#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Feature value);

} // ModelProperty
