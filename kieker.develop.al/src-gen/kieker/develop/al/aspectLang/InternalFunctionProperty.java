/**
 */
package kieker.develop.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Function Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getInternalFunctionProperty()
 * @model
 * @generated
 */
public interface InternalFunctionProperty extends Value
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link kieker.develop.al.aspectLang.InternalFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see kieker.develop.al.aspectLang.InternalFunction
   * @see #setFunction(InternalFunction)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getInternalFunctionProperty_Function()
   * @model
   * @generated
   */
  InternalFunction getFunction();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see kieker.develop.al.aspectLang.InternalFunction
   * @see #getFunction()
   * @generated
   */
  void setFunction(InternalFunction value);

} // InternalFunctionProperty
