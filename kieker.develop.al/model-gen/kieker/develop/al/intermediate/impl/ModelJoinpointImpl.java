/**
 */
package kieker.develop.al.intermediate.impl;

import kieker.develop.al.intermediate.IntermediatePackage;
import kieker.develop.al.intermediate.ModelJoinpoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.impl.ModelJoinpointImpl#getReferencedInstance <em>Referenced Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelJoinpointImpl extends AbstractJoinpointImpl implements ModelJoinpoint {
	/**
	 * The cached value of the '{@link #getReferencedInstance() <em>Referenced Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject referencedInstance;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelJoinpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.MODEL_JOINPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedInstance() {
		if (referencedInstance != null && referencedInstance.eIsProxy()) {
			InternalEObject oldReferencedInstance = (InternalEObject)referencedInstance;
			referencedInstance = eResolveProxy(oldReferencedInstance);
			if (referencedInstance != oldReferencedInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE, oldReferencedInstance, referencedInstance));
			}
		}
		return referencedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReferencedInstance() {
		return referencedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedInstance(EObject newReferencedInstance) {
		EObject oldReferencedInstance = referencedInstance;
		referencedInstance = newReferencedInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE, oldReferencedInstance, referencedInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE:
				if (resolve) return getReferencedInstance();
				return basicGetReferencedInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE:
				setReferencedInstance((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE:
				setReferencedInstance((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediatePackage.MODEL_JOINPOINT__REFERENCED_INSTANCE:
				return referencedInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelJoinpointImpl
