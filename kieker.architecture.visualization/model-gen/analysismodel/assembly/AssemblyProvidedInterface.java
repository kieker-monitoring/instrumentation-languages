/**
 */
package analysismodel.assembly;

import analysismodel.type.ProvidedInterfaceType;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.assembly.AssemblyProvidedInterface#getProvidedOperations <em>Provided Operations</em>}</li>
 *   <li>{@link analysismodel.assembly.AssemblyProvidedInterface#getProvidedInterfaceType <em>Provided Interface Type</em>}</li>
 * </ul>
 *
 * @see analysismodel.assembly.AssemblyPackage#getAssemblyProvidedInterface()
 * @model
 * @generated
 */
public interface AssemblyProvidedInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Operations</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link analysismodel.assembly.AssemblyOperation},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Operations</em>' map.
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyProvidedInterface_ProvidedOperations()
	 * @model mapType="analysismodel.assembly.EStringToInterfaceAssemblyOperationMapEntry&lt;org.eclipse.emf.ecore.EString, analysismodel.assembly.AssemblyOperation&gt;"
	 * @generated
	 */
	EMap<String, AssemblyOperation> getProvidedOperations();

	/**
	 * Returns the value of the '<em><b>Provided Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface Type</em>' reference.
	 * @see #setProvidedInterfaceType(ProvidedInterfaceType)
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyProvidedInterface_ProvidedInterfaceType()
	 * @model
	 * @generated
	 */
	ProvidedInterfaceType getProvidedInterfaceType();

	/**
	 * Sets the value of the '{@link analysismodel.assembly.AssemblyProvidedInterface#getProvidedInterfaceType <em>Provided Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface Type</em>' reference.
	 * @see #getProvidedInterfaceType()
	 * @generated
	 */
	void setProvidedInterfaceType(ProvidedInterfaceType value);

} // AssemblyProvidedInterface