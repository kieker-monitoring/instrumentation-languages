/**
 */
package analysismodel.execution;

import analysismodel.deployment.DeployedOperation;
import analysismodel.deployment.DeployedStorage;

import org.eclipse.emf.common.util.EMap;

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
 *   <li>{@link analysismodel.execution.ExecutionModel#getAggregatedInvocations <em>Aggregated Invocations</em>}</li>
 *   <li>{@link analysismodel.execution.ExecutionModel#getAggregatedStorageAccesses <em>Aggregated Storage Accesses</em>}</li>
 * </ul>
 *
 * @see analysismodel.execution.ExecutionPackage#getExecutionModel()
 * @model
 * @generated
 */
public interface ExecutionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregated Invocations</b></em>' map.
	 * The key is of type {@link analysismodel.execution.Tuple<analysismodel.deployment.DeployedOperation, analysismodel.deployment.DeployedOperation>},
	 * and the value is of type {@link analysismodel.execution.AggregatedInvocation},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Invocations</em>' map.
	 * @see analysismodel.execution.ExecutionPackage#getExecutionModel_AggregatedInvocations()
	 * @model mapType="analysismodel.execution.DeployedOperationsPairToAggregatedInvocationMapEntry&lt;analysismodel.execution.Tuple&lt;analysismodel.deployment.DeployedOperation, analysismodel.deployment.DeployedOperation&gt;, analysismodel.execution.AggregatedInvocation&gt;" ordered="false"
	 * @generated
	 */
	EMap<Tuple<DeployedOperation, DeployedOperation>, AggregatedInvocation> getAggregatedInvocations();

	/**
	 * Returns the value of the '<em><b>Aggregated Storage Accesses</b></em>' map.
	 * The key is of type {@link analysismodel.execution.Tuple<analysismodel.deployment.DeployedOperation, analysismodel.deployment.DeployedStorage>},
	 * and the value is of type {@link analysismodel.execution.AggregatedStorageAccess},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Storage Accesses</em>' map.
	 * @see analysismodel.execution.ExecutionPackage#getExecutionModel_AggregatedStorageAccesses()
	 * @model mapType="analysismodel.execution.DeployedOperationsPairToAggregatedStorageAccessMapEntry&lt;analysismodel.execution.Tuple&lt;analysismodel.deployment.DeployedOperation, analysismodel.deployment.DeployedStorage&gt;, analysismodel.execution.AggregatedStorageAccess&gt;" ordered="false"
	 * @generated
	 */
	EMap<Tuple<DeployedOperation, DeployedStorage>, AggregatedStorageAccess> getAggregatedStorageAccesses();

} // ExecutionModel
