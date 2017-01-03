/**
 */
package kieker.develop.al.intermediate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.CodeJoinpoint#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.CodeJoinpoint#getOperationSiganture <em>Operation Siganture</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getCodeJoinpoint()
 * @model
 * @generated
 */
public interface CodeJoinpoint extends AbstractJoinpoint {

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getCodeJoinpoint_ArtifactName()
	 * @model required="true"
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.CodeJoinpoint#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Siganture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Siganture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Siganture</em>' attribute.
	 * @see #setOperationSiganture(String)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getCodeJoinpoint_OperationSiganture()
	 * @model
	 * @generated
	 */
	String getOperationSiganture();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.CodeJoinpoint#getOperationSiganture <em>Operation Siganture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Siganture</em>' attribute.
	 * @see #getOperationSiganture()
	 * @generated
	 */
	void setOperationSiganture(String value);
} // CodeJoinpoint
