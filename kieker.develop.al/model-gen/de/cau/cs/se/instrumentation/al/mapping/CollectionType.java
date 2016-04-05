/**
 */
package kieker.develop.al.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.mapping.CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.mapping.MappingPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends Type {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Type)
	 * @see kieker.develop.al.mapping.MappingPackage#getCollectionType_ElementType()
	 * @model required="true"
	 * @generated
	 */
	Type getElementType();

	/**
	 * Sets the value of the '{@link kieker.develop.al.mapping.CollectionType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Type value);

} // CollectionType
