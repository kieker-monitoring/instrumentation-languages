/**
 */
package kieker.develop.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.Annotation#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
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
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.Annotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Technologies</b></em>' attribute list.
   * The list contents are of type {@link kieker.develop.al.aspectLang.Technology}.
   * The literals are from the enumeration {@link kieker.develop.al.aspectLang.Technology}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Technologies</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Technologies</em>' attribute list.
   * @see kieker.develop.al.aspectLang.Technology
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getAnnotation_Technologies()
   * @model unique="false"
   * @generated
   */
  EList<Technology> getTechnologies();

} // Annotation
