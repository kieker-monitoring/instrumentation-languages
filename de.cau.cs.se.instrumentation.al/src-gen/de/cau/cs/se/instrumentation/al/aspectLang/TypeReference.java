/**
 */
package kieker.tools.al.aspectLang;

import kieker.tools.al.mapping.NamedType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.TypeReference#getContext <em>Context</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.TypeReference#getReference <em>Reference</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.TypeReference#isCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(ApplicationModel)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getTypeReference_Context()
   * @model
   * @generated
   */
  ApplicationModel getContext();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.TypeReference#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(ApplicationModel value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(NamedType)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getTypeReference_Reference()
   * @model
   * @generated
   */
  NamedType getReference();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.TypeReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(NamedType value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(boolean)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getTypeReference_Collection()
   * @model
   * @generated
   */
  boolean isCollection();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.TypeReference#isCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #isCollection()
   * @generated
   */
  void setCollection(boolean value);

} // TypeReference
