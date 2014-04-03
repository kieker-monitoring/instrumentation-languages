/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.ParameterModifier;
import de.cau.cs.se.instrumantation.model.structure.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParameterPattern()
 * @model
 * @generated
 */
public interface ParameterPattern extends EObject
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
   * @see #setModifier(ParameterModifier)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParameterPattern_Modifier()
   * @model
   * @generated
   */
  ParameterModifier getModifier();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getModifier <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(ParameterModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParameterPattern_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getParameterPattern_Parameter()
   * @model
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // ParameterPattern
