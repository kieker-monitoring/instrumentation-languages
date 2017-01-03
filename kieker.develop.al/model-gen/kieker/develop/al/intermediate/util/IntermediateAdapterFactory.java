/**
 */
package kieker.develop.al.intermediate.util;

import kieker.develop.al.intermediate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kieker.develop.al.intermediate.IntermediatePackage
 * @generated
 */
public class IntermediateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediatePackage.eINSTANCE;
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
	protected IntermediateSwitch<Adapter> modelSwitch =
		new IntermediateSwitch<Adapter>() {
			@Override
			public Adapter caseIntermediateAspect(IntermediateAspect object) {
				return createIntermediateAspectAdapter();
			}
			@Override
			public Adapter caseAbstractJoinpoint(AbstractJoinpoint object) {
				return createAbstractJoinpointAdapter();
			}
			@Override
			public Adapter caseCodeJoinpoint(CodeJoinpoint object) {
				return createCodeJoinpointAdapter();
			}
			@Override
			public Adapter caseModelJoinpoint(ModelJoinpoint object) {
				return createModelJoinpointAdapter();
			}
			@Override
			public Adapter caseIntermediateModel(IntermediateModel object) {
				return createIntermediateModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.intermediate.IntermediateAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.intermediate.IntermediateAspect
	 * @generated
	 */
	public Adapter createIntermediateAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.intermediate.AbstractJoinpoint <em>Abstract Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.intermediate.AbstractJoinpoint
	 * @generated
	 */
	public Adapter createAbstractJoinpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.intermediate.CodeJoinpoint <em>Code Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.intermediate.CodeJoinpoint
	 * @generated
	 */
	public Adapter createCodeJoinpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.intermediate.ModelJoinpoint <em>Model Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.intermediate.ModelJoinpoint
	 * @generated
	 */
	public Adapter createModelJoinpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kieker.develop.al.intermediate.IntermediateModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kieker.develop.al.intermediate.IntermediateModel
	 * @generated
	 */
	public Adapter createIntermediateModelAdapter() {
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

} //IntermediateAdapterFactory
