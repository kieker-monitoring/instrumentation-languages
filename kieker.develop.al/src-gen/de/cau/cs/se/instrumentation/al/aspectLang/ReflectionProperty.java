/**
 */
package kieker.develop.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflection Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.ReflectionProperty#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getReflectionProperty()
 * @model
 * @generated
 */
public interface ReflectionProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link kieker.develop.al.aspectLang.ReflectionFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see kieker.develop.al.aspectLang.ReflectionFunction
   * @see #setFunction(ReflectionFunction)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getReflectionProperty_Function()
   * @model
   * @generated
   */
  ReflectionFunction getFunction();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.ReflectionProperty#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see kieker.develop.al.aspectLang.ReflectionFunction
   * @see #getFunction()
   * @generated
   */
  void setFunction(ReflectionFunction value);

} // ReflectionProperty
