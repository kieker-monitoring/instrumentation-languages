/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Function Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getInternalFunctionProperty()
 * @model
 * @generated
 */
public interface InternalFunctionProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
   * @see #setFunction(InternalFunction)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getInternalFunctionProperty_Function()
   * @model
   * @generated
   */
  InternalFunction getFunction();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction
   * @see #getFunction()
   * @generated
   */
  void setFunction(InternalFunction value);

} // InternalFunctionProperty
