/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getCollectors <em>Collectors</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject
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
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAdvice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Advice#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAdvice_ParameterDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<AdviceParameterDeclaration> getParameterDeclarations();

  /**
   * Returns the value of the '<em><b>Collectors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.aspectLang.Collector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectors</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getAdvice_Collectors()
   * @model containment="true"
   * @generated
   */
  EList<Collector> getCollectors();

} // Advice
