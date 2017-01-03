/**
 */
package kieker.develop.al.intermediate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.IntermediateModel#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.IntermediateModel#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateModel()
 * @model
 * @generated
 */
public interface IntermediateModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.IntermediateModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.intermediate.IntermediateAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateModel_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateAspect> getAspects();

} // IntermediateModel
