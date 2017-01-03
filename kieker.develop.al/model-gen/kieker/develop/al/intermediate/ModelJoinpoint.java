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
 *   <li>{@link kieker.develop.al.intermediate.ModelJoinpoint#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getModelJoinpoint()
 * @model
 * @generated
 */
public interface ModelJoinpoint extends AbstractJoinpoint {

	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EObject)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getModelJoinpoint_ReferencedObject()
	 * @model
	 * @generated
	 */
	EObject getReferencedObject();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.ModelJoinpoint#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(EObject value);
} // ModelJoinpoint
