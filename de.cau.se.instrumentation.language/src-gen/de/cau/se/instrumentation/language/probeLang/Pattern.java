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
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Pattern#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Pattern#getCodeSequcene <em>Code Sequcene</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
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
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Pattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getPattern_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Code Sequcene</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.CodeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Sequcene</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Sequcene</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getPattern_CodeSequcene()
   * @model containment="true"
   * @generated
   */
  EList<CodeElement> getCodeSequcene();

} // Pattern
