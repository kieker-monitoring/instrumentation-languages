/**
 */
package kieker.develop.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getAdviceParameterDeclaration()
 * @model
 * @generated
 */
public interface AdviceParameterDeclaration extends EObject
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
   * @see #setType(TypeReference)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getAdviceParameterDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

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
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getAdviceParameterDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.AdviceParameterDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AdviceParameterDeclaration
