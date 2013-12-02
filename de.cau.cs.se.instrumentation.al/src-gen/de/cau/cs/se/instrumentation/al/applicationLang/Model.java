/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

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
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<de.cau.cs.se.instrumentation.al.applicationLang.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspects</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getModel_Aspects()
   * @model containment="true"
   * @generated
   */
  EList<Aspect> getAspects();

} // Model
