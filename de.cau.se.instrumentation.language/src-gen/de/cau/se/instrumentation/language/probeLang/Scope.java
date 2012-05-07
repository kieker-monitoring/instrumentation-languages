/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Scope#getModelRef <em>Model Ref</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertBefore <em>Insert Before</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Scope#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertAfter <em>Insert After</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Ref</em>' attribute.
   * @see #setModelRef(String)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getScope_ModelRef()
   * @model
   * @generated
   */
  String getModelRef();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Scope#getModelRef <em>Model Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Ref</em>' attribute.
   * @see #getModelRef()
   * @generated
   */
  void setModelRef(String value);

  /**
   * Returns the value of the '<em><b>Insert Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert Before</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert Before</em>' attribute.
   * @see #setInsertBefore(boolean)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getScope_InsertBefore()
   * @model
   * @generated
   */
  boolean isInsertBefore();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertBefore <em>Insert Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insert Before</em>' attribute.
   * @see #isInsertBefore()
   * @generated
   */
  void setInsertBefore(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Alternative)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getScope_Target()
   * @model containment="true"
   * @generated
   */
  Alternative getTarget();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Scope#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Alternative value);

  /**
   * Returns the value of the '<em><b>Insert After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert After</em>' attribute.
   * @see #setInsertAfter(boolean)
   * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getScope_InsertAfter()
   * @model
   * @generated
   */
  boolean isInsertAfter();

  /**
   * Sets the value of the '{@link de.cau.se.instrumentation.language.probeLang.Scope#isInsertAfter <em>Insert After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insert After</em>' attribute.
   * @see #isInsertAfter()
   * @generated
   */
  void setInsertAfter(boolean value);

} // Scope
