/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getUsePackages <em>Use Packages</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Use Packages</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Packages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Packages</em>' reference list.
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getApplicationModel_UsePackages()
   * @model
   * @generated
   */
  EList<RegisteredPackage> getUsePackages();

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
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getApplicationModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' attribute.
   * @see #setModel(String)
   * @see de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage#getApplicationModel_Model()
   * @model
   * @generated
   */
  String getModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel#getModel <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' attribute.
   * @see #getModel()
   * @generated
   */
  void setModel(String value);

} // ApplicationModel
