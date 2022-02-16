/**
 */
package analysismodel.assembly;

import analysismodel.type.OperationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.assembly.AssemblyOperation#getOperationType <em>Operation Type</em>}</li>
 * </ul>
 *
 * @see analysismodel.assembly.AssemblyPackage#getAssemblyOperation()
 * @model
 * @generated
 */
public interface AssemblyOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' reference.
	 * @see #setOperationType(OperationType)
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyOperation_OperationType()
	 * @model
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link analysismodel.assembly.AssemblyOperation#getOperationType <em>Operation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' reference.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AssemblyComponent getAssemblyComponent();

} // AssemblyOperation