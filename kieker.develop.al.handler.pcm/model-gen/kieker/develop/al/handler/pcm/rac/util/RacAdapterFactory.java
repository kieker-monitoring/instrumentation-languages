/**
 */
package kieker.develop.al.handler.pcm.rac.util;

import kieker.develop.al.handler.pcm.rac.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kieker.develop.al.handler.pcm.rac.RacPackage
 * @generated
 */
public class RacAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RacPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RacAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RacPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RacSwitch<Adapter> modelSwitch =
		new RacSwitch<Adapter>() {
			@Override
			public Adapter caseMappingModel(MappingModel object) {
				return createMappingModelAdapter();
			}
			@Override
			public Adapter casePCMMapping(PCMMapping object) {
				return createPCMMappingAdapter();
			}
			@Override
			public Adapter caseSourceNode(SourceNode object) {
				return createSourceNodeAdapter();
			}
			@Override
			public Adapter caseAbstractTargetNode(AbstractTargetNode object) {
				return createAbstractTargetNodeAdapter();
			}
			@Override
			public Adapter caseModelTargetNode(ModelTargetNode object) {
				return createModelTargetNodeAdapter();
			}
			@Override
			public Adapter caseCodeTargetNode(CodeTargetNode object) {
				return createCodeTargetNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.MappingModel
	 * @generated
	 */
	public Adapter createMappingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.PCMMapping <em>PCM Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping
	 * @generated
	 */
	public Adapter createPCMMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.SourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.SourceNode
	 * @generated
	 */
	public Adapter createSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.AbstractTargetNode <em>Abstract Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.AbstractTargetNode
	 * @generated
	 */
	public Adapter createAbstractTargetNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.ModelTargetNode <em>Model Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.ModelTargetNode
	 * @generated
	 */
	public Adapter createModelTargetNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode <em>Code Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.handler.pcm.rac.CodeTargetNode
	 * @generated
	 */
	public Adapter createCodeTargetNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RacAdapterFactory
