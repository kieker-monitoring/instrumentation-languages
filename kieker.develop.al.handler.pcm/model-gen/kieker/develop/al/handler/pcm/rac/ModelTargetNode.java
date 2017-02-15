/**
 */
package kieker.develop.al.handler.pcm.rac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Target Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.ModelTargetNode#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getModelTargetNode()
 * @model
 * @generated
 */
public interface ModelTargetNode extends AbstractTargetNode {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EObject)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getModelTargetNode_Reference()
	 * @model required="true"
	 * @generated
	 */
	EObject getReference();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.ModelTargetNode#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EObject value);

} // ModelTargetNode
