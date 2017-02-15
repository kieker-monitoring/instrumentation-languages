/**
 */
package kieker.develop.al.handler.pcm.rac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Target Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getPath <em>Path</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getCodeTargetNode()
 * @model
 * @generated
 */
public interface CodeTargetNode extends AbstractTargetNode {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getCodeTargetNode_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fully Qualified Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #setFullyQualifiedClassName(String)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getCodeTargetNode_FullyQualifiedClassName()
	 * @model
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature</em>' attribute.
	 * @see #setOperationSignature(String)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getCodeTargetNode_OperationSignature()
	 * @model required="true"
	 * @generated
	 */
	String getOperationSignature();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getOperationSignature <em>Operation Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature</em>' attribute.
	 * @see #getOperationSignature()
	 * @generated
	 */
	void setOperationSignature(String value);

} // CodeTargetNode
