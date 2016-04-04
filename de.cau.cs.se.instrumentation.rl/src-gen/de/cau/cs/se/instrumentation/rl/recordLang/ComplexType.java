/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getSince <em>Since</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getParents <em>Parents</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends Type
{
  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since</em>' attribute.
   * @see #setSince(String)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType_Since()
   * @model
   * @generated
   */
  String getSince();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.ComplexType#getSince <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' attribute.
   * @see #getSince()
   * @generated
   */
  void setSince(String value);

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.TemplateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parents</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType_Parents()
   * @model
   * @generated
   */
  EList<TemplateType> getParents();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.Constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getComplexType_Constants()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getConstants();

} // ComplexType
