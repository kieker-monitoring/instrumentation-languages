/**
 */
package kieker.tools.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.LocalQuery#getLocationQuery <em>Location Query</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.LocalQuery#getProperty <em>Property</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.LocalQuery#getTypeof <em>Typeof</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocalQuery()
 * @model
 * @generated
 */
public interface LocalQuery extends ConstraintElement
{
  /**
   * Returns the value of the '<em><b>Location Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location Query</em>' containment reference.
   * @see #setLocationQuery(LocationQuery)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocalQuery_LocationQuery()
   * @model containment="true"
   * @generated
   */
  LocationQuery getLocationQuery();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocalQuery#getLocationQuery <em>Location Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location Query</em>' containment reference.
   * @see #getLocationQuery()
   * @generated
   */
  void setLocationQuery(LocationQuery value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(ModelProperty)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocalQuery_Property()
   * @model containment="true"
   * @generated
   */
  ModelProperty getProperty();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocalQuery#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(ModelProperty value);

  /**
   * Returns the value of the '<em><b>Typeof</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeof</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeof</em>' containment reference.
   * @see #setTypeof(Typeof)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getLocalQuery_Typeof()
   * @model containment="true"
   * @generated
   */
  Typeof getTypeof();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.LocalQuery#getTypeof <em>Typeof</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeof</em>' containment reference.
   * @see #getTypeof()
   * @generated
   */
  void setTypeof(Typeof value);

} // LocalQuery
