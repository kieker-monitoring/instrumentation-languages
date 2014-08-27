/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.MethodModifier;
import de.cau.cs.se.instrumantation.model.structure.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getMethodReference <em>Method Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getMethodQuery()
 * @model
 * @generated
 */
public interface MethodQuery extends EObject
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
   * @see #setModifier(MethodModifier)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getMethodQuery_Modifier()
   * @model
   * @generated
   */
  MethodModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getModifier <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(MethodModifier value);

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
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getMethodQuery_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Method Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Reference</em>' reference.
   * @see #setMethodReference(Method)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getMethodQuery_MethodReference()
   * @model
   * @generated
   */
  Method getMethodReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery#getMethodReference <em>Method Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Reference</em>' reference.
   * @see #getMethodReference()
   * @generated
   */
  void setMethodReference(Method value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getMethodQuery_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<ParameterPattern> getParameter();

} // MethodQuery
