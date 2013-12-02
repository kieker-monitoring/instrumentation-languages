/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getParamQuery()
 * @model
 * @generated
 */
public interface ParamQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getParamQuery_Queries()
   * @model containment="true"
   * @generated
   */
  EList<ParamCompare> getQueries();

} // ParamQuery
