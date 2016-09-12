/**
 */
package kieker.develop.al.handler.pcm.rac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.MappingModel#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.handler.pcm.rac.PCMMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#getMappingModel_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMMapping> getMappings();

} // MappingModel
