/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflection Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getReflectionProperty()
 * @model
 * @generated
 */
public interface ReflectionProperty extends Parameter
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction
   * @see #setFunction(ReflectionFunction)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getReflectionProperty_Function()
   * @model
   * @generated
   */
  ReflectionFunction getFunction();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ReflectionFunction
   * @see #getFunction()
   * @generated
   */
  void setFunction(ReflectionFunction value);

} // ReflectionProperty
