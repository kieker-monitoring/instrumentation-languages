/**
 */
package kieker.model.analysismodel.deployment.impl;

import java.util.Map;

import kieker.model.analysismodel.deployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentFactoryImpl extends EFactoryImpl implements DeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentFactory init() {
		try {
			DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
			if (theDeploymentFactory != null) {
				return theDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentPackage.DEPLOYMENT_MODEL: return createDeploymentModel();
			case DeploymentPackage.ESTRING_TO_DEPLOYMENT_CONTEXT_MAP_ENTRY: return (EObject)createEStringToDeploymentContextMapEntry();
			case DeploymentPackage.DEPLOYMENT_CONTEXT: return createDeploymentContext();
			case DeploymentPackage.ESTRING_TO_DEPLOYED_COMPONENT_MAP_ENTRY: return (EObject)createEStringToDeployedComponentMapEntry();
			case DeploymentPackage.DEPLOYED_COMPONENT: return createDeployedComponent();
			case DeploymentPackage.ESTRING_TO_DEPLOYED_OPERATION_MAP_ENTRY: return (EObject)createEStringToDeployedOperationMapEntry();
			case DeploymentPackage.DEPLOYED_OPERATION: return createDeployedOperation();
			case DeploymentPackage.ESTRING_TO_DEPLOYED_STORAGE_MAP_ENTRY: return (EObject)createEStringToDeployedStorageMapEntry();
			case DeploymentPackage.DEPLOYED_STORAGE: return createDeployedStorage();
			case DeploymentPackage.DEPLOYED_PROVIDED_INTERFACE: return createDeployedProvidedInterface();
			case DeploymentPackage.ESTRING_TO_DEPLOYED_PROVIDED_INTERFACE_MAP_ENTRY: return (EObject)createEStringToDeployedProvidedInterfaceMapEntry();
			case DeploymentPackage.DEPLOYED_REQUIRED_INTERFACE: return createDeployedRequiredInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentModel createDeploymentModel() {
		DeploymentModelImpl deploymentModel = new DeploymentModelImpl();
		return deploymentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DeploymentContext> createEStringToDeploymentContextMapEntry() {
		EStringToDeploymentContextMapEntryImpl eStringToDeploymentContextMapEntry = new EStringToDeploymentContextMapEntryImpl();
		return eStringToDeploymentContextMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentContext createDeploymentContext() {
		DeploymentContextImpl deploymentContext = new DeploymentContextImpl();
		return deploymentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DeployedComponent> createEStringToDeployedComponentMapEntry() {
		EStringToDeployedComponentMapEntryImpl eStringToDeployedComponentMapEntry = new EStringToDeployedComponentMapEntryImpl();
		return eStringToDeployedComponentMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedComponent createDeployedComponent() {
		DeployedComponentImpl deployedComponent = new DeployedComponentImpl();
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DeployedOperation> createEStringToDeployedOperationMapEntry() {
		EStringToDeployedOperationMapEntryImpl eStringToDeployedOperationMapEntry = new EStringToDeployedOperationMapEntryImpl();
		return eStringToDeployedOperationMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedOperation createDeployedOperation() {
		DeployedOperationImpl deployedOperation = new DeployedOperationImpl();
		return deployedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DeployedStorage> createEStringToDeployedStorageMapEntry() {
		EStringToDeployedStorageMapEntryImpl eStringToDeployedStorageMapEntry = new EStringToDeployedStorageMapEntryImpl();
		return eStringToDeployedStorageMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedStorage createDeployedStorage() {
		DeployedStorageImpl deployedStorage = new DeployedStorageImpl();
		return deployedStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedProvidedInterface createDeployedProvidedInterface() {
		DeployedProvidedInterfaceImpl deployedProvidedInterface = new DeployedProvidedInterfaceImpl();
		return deployedProvidedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DeployedProvidedInterface> createEStringToDeployedProvidedInterfaceMapEntry() {
		EStringToDeployedProvidedInterfaceMapEntryImpl eStringToDeployedProvidedInterfaceMapEntry = new EStringToDeployedProvidedInterfaceMapEntryImpl();
		return eStringToDeployedProvidedInterfaceMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedRequiredInterface createDeployedRequiredInterface() {
		DeployedRequiredInterfaceImpl deployedRequiredInterface = new DeployedRequiredInterfaceImpl();
		return deployedRequiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentPackage getDeploymentPackage() {
		return (DeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentPackage getPackage() {
		return DeploymentPackage.eINSTANCE;
	}

} //DeploymentFactoryImpl
