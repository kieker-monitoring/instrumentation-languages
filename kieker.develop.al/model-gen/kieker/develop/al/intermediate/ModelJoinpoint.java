/**
 */
package kieker.develop.al.intermediate;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.ModelJoinpoint#getReferencedInstance <em>Referenced Instance</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getModelJoinpoint()
 * @model
 * @generated
 */
public interface ModelJoinpoint extends AbstractJoinpoint {

	/**
	 * Returns the value of the '<em><b>Referenced Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Instance</em>' reference.
	 * @see #setReferencedInstance(EObject)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getModelJoinpoint_ReferencedInstance()
	 * @model
	 * @generated
	 */
	EObject getReferencedInstance();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.ModelJoinpoint#getReferencedInstance <em>Referenced Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Instance</em>' reference.
	 * @see #getReferencedInstance()
	 * @generated
	 */
	void setReferencedInstance(EObject value);
} // ModelJoinpoint
