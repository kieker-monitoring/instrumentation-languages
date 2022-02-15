/**
 */
package analysismodel.assembly;

import analysismodel.type.StorageType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.assembly.AssemblyStorage#getStorageType <em>Storage Type</em>}</li>
 * </ul>
 *
 * @see analysismodel.assembly.AssemblyPackage#getAssemblyStorage()
 * @model
 * @generated
 */
public interface AssemblyStorage extends EObject {
	/**
	 * Returns the value of the '<em><b>Storage Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type</em>' reference.
	 * @see #setStorageType(StorageType)
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyStorage_StorageType()
	 * @model
	 * @generated
	 */
	StorageType getStorageType();

	/**
	 * Sets the value of the '{@link analysismodel.assembly.AssemblyStorage#getStorageType <em>Storage Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type</em>' reference.
	 * @see #getStorageType()
	 * @generated
	 */
	void setStorageType(StorageType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AssemblyComponent getAssemblyComponent();

} // AssemblyStorage
