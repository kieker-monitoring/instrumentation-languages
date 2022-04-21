/**
 */
package kieker.develop.al.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.mapping.TypeReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.mapping.MappingPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends Traceability {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see kieker.develop.al.mapping.MappingPackage#getTypeReference_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link kieker.develop.al.mapping.TypeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypeReference
