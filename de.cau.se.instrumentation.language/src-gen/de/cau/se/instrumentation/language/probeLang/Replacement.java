/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Replacement#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Replacement#getScope <em>Scope</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Replacement#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getReplacement()
 * @model
 * @generated
 */
public interface Replacement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getReplacement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Replacement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getReplacement_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Replacement#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.PatternCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getReplacement_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<PatternCall> getPatterns();

} // Replacement
