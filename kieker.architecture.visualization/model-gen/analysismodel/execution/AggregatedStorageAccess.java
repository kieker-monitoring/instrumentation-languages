/**
 */
package analysismodel.execution;

import analysismodel.deployment.DeployedOperation;
import analysismodel.deployment.DeployedStorage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Storage Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.execution.AggregatedStorageAccess#getStorage <em>Storage</em>}</li>
 *   <li>{@link analysismodel.execution.AggregatedStorageAccess#getCode <em>Code</em>}</li>
 *   <li>{@link analysismodel.execution.AggregatedStorageAccess#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see analysismodel.execution.ExecutionPackage#getAggregatedStorageAccess()
 * @model
 * @generated
 */
public interface AggregatedStorageAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' reference.
	 * @see #setStorage(DeployedStorage)
	 * @see analysismodel.execution.ExecutionPackage#getAggregatedStorageAccess_Storage()
	 * @model
	 * @generated
	 */
	DeployedStorage getStorage();

	/**
	 * Sets the value of the '{@link analysismodel.execution.AggregatedStorageAccess#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(DeployedStorage value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(DeployedOperation)
	 * @see analysismodel.execution.ExecutionPackage#getAggregatedStorageAccess_Code()
	 * @model
	 * @generated
	 */
	DeployedOperation getCode();

	/**
	 * Sets the value of the '{@link analysismodel.execution.AggregatedStorageAccess#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(DeployedOperation value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link analysismodel.execution.EDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see analysismodel.execution.EDirection
	 * @see #setDirection(EDirection)
	 * @see analysismodel.execution.ExecutionPackage#getAggregatedStorageAccess_Direction()
	 * @model
	 * @generated
	 */
	EDirection getDirection();

	/**
	 * Sets the value of the '{@link analysismodel.execution.AggregatedStorageAccess#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see analysismodel.execution.EDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EDirection value);

} // AggregatedStorageAccess
