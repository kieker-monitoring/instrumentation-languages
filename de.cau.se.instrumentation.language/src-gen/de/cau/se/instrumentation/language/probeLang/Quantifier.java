/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getItem <em>Item</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuantifier()
 * @model
 * @generated
 */
public interface Quantifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(Item)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuantifier_Item()
   * @model containment="true"
   * @generated
   */
  Item getItem();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(Item value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.se.instrumentation.language.probeLang.QuantifierType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.se.instrumentation.language.probeLang.QuantifierType
   * @see #setType(QuantifierType)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuantifier_Type()
   * @model
   * @generated
   */
  QuantifierType getType();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Quantifier#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.se.instrumentation.language.probeLang.QuantifierType
   * @see #getType()
   * @generated
   */
  void setType(QuantifierType value);

} // Quantifier
