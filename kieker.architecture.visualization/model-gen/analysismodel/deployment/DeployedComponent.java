/**
 */
package analysismodel.deployment;

import analysismodel.assembly.AssemblyComponent;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getAssemblyComponent <em>Assembly Component</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getOperations <em>Operations</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getStorages <em>Storages</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getContainedComponents <em>Contained Components</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link analysismodel.deployment.DeployedComponent#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent()
 * @model
 * @generated
 */
public interface DeployedComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Component</em>' reference.
	 * @see #setAssemblyComponent(AssemblyComponent)
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_AssemblyComponent()
	 * @model
	 * @generated
	 */
	AssemblyComponent getAssemblyComponent();

	/**
	 * Sets the value of the '{@link analysismodel.deployment.DeployedComponent#getAssemblyComponent <em>Assembly Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Component</em>' reference.
	 * @see #getAssemblyComponent()
	 * @generated
	 */
	void setAssemblyComponent(AssemblyComponent value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link analysismodel.deployment.DeployedOperation},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' map.
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_Operations()
	 * @model mapType="analysismodel.deployment.EStringToDeployedOperationMapEntry&lt;org.eclipse.emf.ecore.EString, analysismodel.deployment.DeployedOperation&gt;" ordered="false"
	 * @generated
	 */
	EMap<String, DeployedOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Storages</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link analysismodel.deployment.DeployedStorage},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storages</em>' map.
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_Storages()
	 * @model mapType="analysismodel.deployment.EStringToDeployedStorageMapEntry&lt;org.eclipse.emf.ecore.EString, analysismodel.deployment.DeployedStorage&gt;" ordered="false"
	 * @generated
	 */
	EMap<String, DeployedStorage> getStorages();

	/**
	 * Returns the value of the '<em><b>Contained Components</b></em>' reference list.
	 * The list contents are of type {@link analysismodel.deployment.DeployedComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Components</em>' reference list.
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_ContainedComponents()
	 * @model
	 * @generated
	 */
	EList<DeployedComponent> getContainedComponents();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link analysismodel.deployment.DeployedProvidedInterface},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' map.
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_ProvidedInterfaces()
	 * @model mapType="analysismodel.deployment.EStringToDeployedProvidedInterfaceMapEntry&lt;org.eclipse.emf.ecore.EString, analysismodel.deployment.DeployedProvidedInterface&gt;"
	 * @generated
	 */
	EMap<String, DeployedProvidedInterface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link analysismodel.deployment.DeployedRequiredInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' containment reference list.
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_RequiredInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedRequiredInterface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see analysismodel.deployment.DeploymentPackage#getDeployedComponent_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link analysismodel.deployment.DeployedComponent#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DeploymentContext getDeploymentContext();

} // DeployedComponent
