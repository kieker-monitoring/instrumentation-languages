/**
 */
package kieker.develop.al.intermediate.impl;

import kieker.develop.al.intermediate.*;

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
public class IntermediateFactoryImpl extends EFactoryImpl implements IntermediateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateFactory init() {
		try {
			IntermediateFactory theIntermediateFactory = (IntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediatePackage.eNS_URI);
			if (theIntermediateFactory != null) {
				return theIntermediateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactoryImpl() {
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
			case IntermediatePackage.INTERMEDIATE_ASPECT: return createIntermediateAspect();
			case IntermediatePackage.ABSTRACT_JOINPOINT: return createAbstractJoinpoint();
			case IntermediatePackage.CODE_JOINPOINT: return createCodeJoinpoint();
			case IntermediatePackage.MODEL_JOINPOINT: return createModelJoinpoint();
			case IntermediatePackage.INTERMEDIATE_MODEL: return createIntermediateModel();
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
	public IntermediateAspect createIntermediateAspect() {
		IntermediateAspectImpl intermediateAspect = new IntermediateAspectImpl();
		return intermediateAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractJoinpoint createAbstractJoinpoint() {
		AbstractJoinpointImpl abstractJoinpoint = new AbstractJoinpointImpl();
		return abstractJoinpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeJoinpoint createCodeJoinpoint() {
		CodeJoinpointImpl codeJoinpoint = new CodeJoinpointImpl();
		return codeJoinpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelJoinpoint createModelJoinpoint() {
		ModelJoinpointImpl modelJoinpoint = new ModelJoinpointImpl();
		return modelJoinpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateModel createIntermediateModel() {
		IntermediateModelImpl intermediateModel = new IntermediateModelImpl();
		return intermediateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediatePackage getIntermediatePackage() {
		return (IntermediatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediatePackage getPackage() {
		return IntermediatePackage.eINSTANCE;
	}

} //IntermediateFactoryImpl
