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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Model#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Model#getProbes <em>Probes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getModel_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Pattern> getPatterns();

  /**
   * Returns the value of the '<em><b>Probes</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.Probe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probes</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getModel_Probes()
   * @model containment="true"
   * @generated
   */
  EList<Probe> getProbes();

} // Model
