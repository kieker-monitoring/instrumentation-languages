/**
 */
package kieker.tools.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.LocationQuery#getNode <em>Node</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocationQuery()
 * @model
 * @generated
 */
public interface LocationQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(Node)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocationQuery_Node()
   * @model containment="true"
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocationQuery#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

  /**
   * Returns the value of the '<em><b>Specialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specialization</em>' containment reference.
   * @see #setSpecialization(LocationQuery)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocationQuery_Specialization()
   * @model containment="true"
   * @generated
   */
  LocationQuery getSpecialization();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specialization</em>' containment reference.
   * @see #getSpecialization()
   * @generated
   */
  void setSpecialization(LocationQuery value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' containment reference.
   * @see #setComposition(CompositionQuery)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocationQuery_Composition()
   * @model containment="true"
   * @generated
   */
  CompositionQuery getComposition();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' containment reference.
   * @see #getComposition()
   * @generated
   */
  void setComposition(CompositionQuery value);

} // LocationQuery
