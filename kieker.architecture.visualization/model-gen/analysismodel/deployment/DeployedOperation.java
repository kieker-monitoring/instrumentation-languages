/**
 */
package analysismodel.deployment;

import analysismodel.assembly.AssemblyOperation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.deployment.DeployedOperation#getAssemblyOperation <em>Assembly Operation</em>}</li>
 * </ul>
 *
 * @see analysismodel.deployment.DeploymentPackage#getDeployedOperation()
 * @model
 * @generated
 */
public interface DeployedOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Operation</em>' reference.
	 * @see #setAssemblyOperation(AssemblyOperation)
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedOperation_AssemblyOperation()
	 * @model
	 * @generated
	 */
	AssemblyOperation getAssemblyOperation();

	/**
	 * Sets the value of the '{@link analysismodel.deployment.DeployedOperation#getAssemblyOperation <em>Assembly Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Operation</em>' reference.
	 * @see #getAssemblyOperation()
	 * @generated
	 */
	void setAssemblyOperation(AssemblyOperation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DeployedComponent getComponent();

} // DeployedOperation