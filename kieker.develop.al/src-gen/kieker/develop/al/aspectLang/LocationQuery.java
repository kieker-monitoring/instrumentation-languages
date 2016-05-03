/**
 */
package kieker.develop.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.LocationQuery#getModifier <em>Modifier</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.LocationQuery#getNode <em>Node</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getLocationQuery()
 * @model
 * @generated
 */
public interface LocationQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link kieker.develop.al.aspectLang.QueryModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see kieker.develop.al.aspectLang.QueryModifier
   * @see #setModifier(QueryModifier)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getLocationQuery_Modifier()
   * @model
   * @generated
   */
  QueryModifier getModifier();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.LocationQuery#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see kieker.develop.al.aspectLang.QueryModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(QueryModifier value);

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
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getLocationQuery_Node()
   * @model containment="true"
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.LocationQuery#getNode <em>Node</em>}' containment reference.
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
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getLocationQuery_Specialization()
   * @model containment="true"
   * @generated
   */
  LocationQuery getSpecialization();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.LocationQuery#getSpecialization <em>Specialization</em>}' containment reference.
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
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getLocationQuery_Composition()
   * @model containment="true"
   * @generated
   */
  CompositionQuery getComposition();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.LocationQuery#getComposition <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' containment reference.
   * @see #getComposition()
   * @generated
   */
  void setComposition(CompositionQuery value);

} // LocationQuery
