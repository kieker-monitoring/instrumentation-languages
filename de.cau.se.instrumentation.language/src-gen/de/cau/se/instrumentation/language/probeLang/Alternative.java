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
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Alternative#getOrExpr <em>Or Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject
{
  /**
   * Returns the value of the '<em><b>Or Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.se.instrumentation.language.probeLang.Sequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or Expr</em>' containment reference list.
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getAlternative_OrExpr()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getOrExpr();

} // Alternative
