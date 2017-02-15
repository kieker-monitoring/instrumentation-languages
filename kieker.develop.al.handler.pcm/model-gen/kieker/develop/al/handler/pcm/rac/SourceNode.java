/**
 */
package kieker.develop.al.handler.pcm.rac;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.SourceNode#getChildNode <em>Child Node</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.SourceNode#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getSourceNode()
 * @model
 * @generated
 */
public interface SourceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(NamedElement)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getSourceNode_Reference()
	 * @model
	 * @generated
	 */
	NamedElement getReference();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.SourceNode#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Node</em>' containment reference.
	 * @see #setChildNode(SourceNode)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getSourceNode_ChildNode()
	 * @model containment="true"
	 * @generated
	 */
	SourceNode getChildNode();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.SourceNode#getChildNode <em>Child Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Node</em>' containment reference.
	 * @see #getChildNode()
	 * @generated
	 */
	void setChildNode(SourceNode value);

} // SourceNode
