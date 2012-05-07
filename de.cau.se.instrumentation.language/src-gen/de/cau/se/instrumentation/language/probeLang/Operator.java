/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Operator#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends Item
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.se.instrumentation.language.probeLang.OperatorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.se.instrumentation.language.probeLang.OperatorType
   * @see #setType(OperatorType)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getOperator_Type()
   * @model
   * @generated
   */
  OperatorType getType();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Operator#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.se.instrumentation.language.probeLang.OperatorType
   * @see #getType()
   * @generated
   */
  void setType(OperatorType value);

} // Operator
