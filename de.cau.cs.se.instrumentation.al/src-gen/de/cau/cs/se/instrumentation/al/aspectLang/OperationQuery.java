/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import de.cau.cs.se.instrumentation.al.mapping.Operation;
import de.cau.cs.se.instrumentation.al.mapping.OperationModifier;
import de.cau.cs.se.instrumentation.al.mapping.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getOperationReference <em>Operation Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getParameterQueries <em>Parameter Queries</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getOperationQuery()
 * @model
 * @generated
 */
public interface OperationQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' reference.
   * @see #setModifier(OperationModifier)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getOperationQuery_Modifier()
   * @model
   * @generated
   */
  OperationModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getModifier <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(OperationModifier value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(Type)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getOperationQuery_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Operation Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Reference</em>' reference.
   * @see #setOperationReference(Operation)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getOperationQuery_OperationReference()
   * @model
   * @generated
   */
  Operation getOperationReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.OperationQuery#getOperationReference <em>Operation Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Reference</em>' reference.
   * @see #getOperationReference()
   * @generated
   */
  void setOperationReference(Operation value);

  /**
   * Returns the value of the '<em><b>Parameter Queries</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Queries</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getOperationQuery_ParameterQueries()
   * @model containment="true"
   * @generated
   */
  EList<ParameterQuery> getParameterQueries();

} // OperationQuery
