/**
 */
package kieker.develop.al.mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.mapping.Container#getModifier <em>Modifier</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.Container#getOperations <em>Operations</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.Container#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.Container#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.mapping.MappingPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Containment, Feature, Type {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(ContainerModifier)
	 * @see kieker.develop.al.mapping.MappingPackage#getContainer_Modifier()
	 * @model required="true"
	 * @generated
	 */
	ContainerModifier getModifier();

	/**
	 * Sets the value of the '{@link kieker.develop.al.mapping.Container#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ContainerModifier value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.mapping.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see kieker.develop.al.mapping.MappingPackage#getContainer_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.mapping.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see kieker.develop.al.mapping.MappingPackage#getContainer_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Reference)
	 * @see kieker.develop.al.mapping.MappingPackage#getContainer_References()
	 * @model
	 * @generated
	 */
	Reference getReferences();

	/**
	 * Sets the value of the '{@link kieker.develop.al.mapping.Container#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Reference value);

} // Container
