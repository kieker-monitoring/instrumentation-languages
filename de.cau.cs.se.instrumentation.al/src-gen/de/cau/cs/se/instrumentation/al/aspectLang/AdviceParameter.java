/**
 */
package kieker.tools.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.AdviceParameter#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.AdviceParameter#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getAdviceParameter()
 * @model
 * @generated
 */
public interface AdviceParameter extends Value
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' reference.
   * @see #setDeclaration(AdviceParameterDeclaration)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getAdviceParameter_Declaration()
   * @model
   * @generated
   */
  AdviceParameterDeclaration getDeclaration();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.AdviceParameter#getDeclaration <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(AdviceParameterDeclaration value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference.
   * @see #setCollection(Value)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getAdviceParameter_Collection()
   * @model containment="true"
   * @generated
   */
  Value getCollection();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.AdviceParameter#getCollection <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' containment reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(Value value);

} // AdviceParameter
