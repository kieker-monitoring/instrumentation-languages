/**
 */
package kieker.model.analysismodel.execution;

import kieker.model.analysismodel.deployment.DeployedOperation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Dataflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.model.analysismodel.execution.OperationDataflow#getSource <em>Source</em>}</li>
 *   <li>{@link kieker.model.analysismodel.execution.OperationDataflow#getTarget <em>Target</em>}</li>
 *   <li>{@link kieker.model.analysismodel.execution.OperationDataflow#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see kieker.model.analysismodel.execution.ExecutionPackage#getOperationDataflow()
 * @model
 * @generated
 */
public interface OperationDataflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DeployedOperation)
	 * @see kieker.model.analysismodel.execution.ExecutionPackage#getOperationDataflow_Source()
	 * @model
	 * @generated
	 */
	DeployedOperation getSource();

	/**
	 * Sets the value of the '{@link kieker.model.analysismodel.execution.OperationDataflow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DeployedOperation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DeployedOperation)
	 * @see kieker.model.analysismodel.execution.ExecutionPackage#getOperationDataflow_Target()
	 * @model
	 * @generated
	 */
	DeployedOperation getTarget();

	/**
	 * Sets the value of the '{@link kieker.model.analysismodel.execution.OperationDataflow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DeployedOperation value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link kieker.model.analysismodel.execution.EDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see kieker.model.analysismodel.execution.EDirection
	 * @see #setDirection(EDirection)
	 * @see kieker.model.analysismodel.execution.ExecutionPackage#getOperationDataflow_Direction()
	 * @model
	 * @generated
	 */
	EDirection getDirection();

	/**
	 * Sets the value of the '{@link kieker.model.analysismodel.execution.OperationDataflow#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see kieker.model.analysismodel.execution.EDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EDirection value);

} // OperationDataflow
