/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.MethodModifier;
import de.cau.cs.se.instrumantation.model.structure.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getLocation <em>Location</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getMethod <em>Method</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(LocationQuery)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery_Location()
   * @model containment="true"
   * @generated
   */
  LocationQuery getLocation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(LocationQuery value);

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
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery_Modifier()
   * @model
   * @generated
   */
  MethodModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getModifier <em>Modifier</em>}' reference.
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
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(Method)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery_Method()
   * @model
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Query#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getQuery_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<ParameterPattern> getParameter();

} // Query
