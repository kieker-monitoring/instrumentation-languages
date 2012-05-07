/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quoted Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.QuotedElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuotedElement()
 * @model
 * @generated
 */
public interface QuotedElement extends CodeElement, Item, ValueElement
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuotedElement_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.QuotedElement#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // QuotedElement
