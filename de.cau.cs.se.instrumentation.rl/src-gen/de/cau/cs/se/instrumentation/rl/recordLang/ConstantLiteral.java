/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstantLiteral()
 * @model
 * @generated
 */
public interface ConstantLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Constant)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getConstantLiteral_Value()
   * @model
   * @generated
   */
  Constant getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Constant value);

} // ConstantLiteral
