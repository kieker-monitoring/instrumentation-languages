/**
 */
package kieker.develop.al.handler.pcm.rac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getSource <em>Source</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getPCMMapping()
 * @model
 * @generated
 */
public interface PCMMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceNode)
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getPCMMapping_Source()
	 * @model containment="true"
	 * @generated
	 */
	SourceNode getSource();

	/**
	 * Sets the value of the '{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceNode value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.handler.pcm.rac.CodeTargetNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getPCMMapping_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeTargetNode> getTargets();

} // PCMMapping
