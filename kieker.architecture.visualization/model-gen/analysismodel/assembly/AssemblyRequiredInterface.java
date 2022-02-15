/**
 */
package analysismodel.assembly;

import analysismodel.type.RequiredInterfaceType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.assembly.AssemblyRequiredInterface#getRequires <em>Requires</em>}</li>
 *   <li>{@link analysismodel.assembly.AssemblyRequiredInterface#getRequiredInterfaceType <em>Required Interface Type</em>}</li>
 * </ul>
 *
 * @see analysismodel.assembly.AssemblyPackage#getAssemblyRequiredInterface()
 * @model
 * @generated
 */
public interface AssemblyRequiredInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference.
	 * @see #setRequires(AssemblyProvidedInterface)
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyRequiredInterface_Requires()
	 * @model
	 * @generated
	 */
	AssemblyProvidedInterface getRequires();

	/**
	 * Sets the value of the '{@link analysismodel.assembly.AssemblyRequiredInterface#getRequires <em>Requires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' reference.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(AssemblyProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Required Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface Type</em>' reference.
	 * @see #setRequiredInterfaceType(RequiredInterfaceType)
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyRequiredInterface_RequiredInterfaceType()
	 * @model
	 * @generated
	 */
	RequiredInterfaceType getRequiredInterfaceType();

	/**
	 * Sets the value of the '{@link analysismodel.assembly.AssemblyRequiredInterface#getRequiredInterfaceType <em>Required Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface Type</em>' reference.
	 * @see #getRequiredInterfaceType()
	 * @generated
	 */
	void setRequiredInterfaceType(RequiredInterfaceType value);

} // AssemblyRequiredInterface
