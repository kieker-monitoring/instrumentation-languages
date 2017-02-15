/**
 */
package kieker.develop.al.handler.pcm.rac.impl;

import kieker.develop.al.handler.pcm.rac.*;

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
public class RacFactoryImpl extends EFactoryImpl implements RacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RacFactory init() {
		try {
			RacFactory theRacFactory = (RacFactory)EPackage.Registry.INSTANCE.getEFactory(RacPackage.eNS_URI);
			if (theRacFactory != null) {
				return theRacFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RacFactoryImpl() {
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
			case RacPackage.MAPPING_MODEL: return createMappingModel();
			case RacPackage.PCM_MAPPING: return createPCMMapping();
			case RacPackage.SOURCE_NODE: return createSourceNode();
			case RacPackage.MODEL_TARGET_NODE: return createModelTargetNode();
			case RacPackage.CODE_TARGET_NODE: return createCodeTargetNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMMapping createPCMMapping() {
		PCMMappingImpl pcmMapping = new PCMMappingImpl();
		return pcmMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNode createSourceNode() {
		SourceNodeImpl sourceNode = new SourceNodeImpl();
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTargetNode createModelTargetNode() {
		ModelTargetNodeImpl modelTargetNode = new ModelTargetNodeImpl();
		return modelTargetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTargetNode createCodeTargetNode() {
		CodeTargetNodeImpl codeTargetNode = new CodeTargetNodeImpl();
		return codeTargetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RacPackage getRacPackage() {
		return (RacPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RacPackage getPackage() {
		return RacPackage.eINSTANCE;
	}

} //RacFactoryImpl
