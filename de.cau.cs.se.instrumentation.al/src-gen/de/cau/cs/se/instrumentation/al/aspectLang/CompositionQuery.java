/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getSubQueries <em>Sub Queries</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCompositionQuery()
 * @model
 * @generated
 */
public interface CompositionQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
   * @see #setModifier(QueryModifier)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCompositionQuery_Modifier()
   * @model
   * @generated
   */
  QueryModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.QueryModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(QueryModifier value);

  /**
   * Returns the value of the '<em><b>Sub Queries</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Queries</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getCompositionQuery_SubQueries()
   * @model containment="true"
   * @generated
   */
  EList<LocationQuery> getSubQueries();

} // CompositionQuery
