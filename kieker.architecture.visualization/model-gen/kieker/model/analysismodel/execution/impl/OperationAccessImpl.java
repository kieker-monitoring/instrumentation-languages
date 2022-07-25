/**
 */
package kieker.model.analysismodel.execution.impl;

import kieker.model.analysismodel.deployment.DeployedOperation;

import kieker.model.analysismodel.execution.EDirection;
import kieker.model.analysismodel.execution.ExecutionPackage;
import kieker.model.analysismodel.execution.OperationAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.model.analysismodel.execution.impl.OperationAccessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kieker.model.analysismodel.execution.impl.OperationAccessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link kieker.model.analysismodel.execution.impl.OperationAccessImpl#getRWAccess <em>RW Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAccessImpl extends MinimalEObjectImpl.Container implements OperationAccess {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DeployedOperation source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DeployedOperation target;

	/**
	 * The default value of the '{@link #getRWAccess() <em>RW Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWAccess()
	 * @generated
	 * @ordered
	 */
	protected static final EDirection RW_ACCESS_EDEFAULT = EDirection.READ;

	/**
	 * The cached value of the '{@link #getRWAccess() <em>RW Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWAccess()
	 * @generated
	 * @ordered
	 */
	protected EDirection rwAccess = RW_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.OPERATION_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedOperation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (DeployedOperation)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.OPERATION_ACCESS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedOperation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DeployedOperation newSource) {
		DeployedOperation oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.OPERATION_ACCESS__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedOperation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DeployedOperation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.OPERATION_ACCESS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedOperation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(DeployedOperation newTarget) {
		DeployedOperation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.OPERATION_ACCESS__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDirection getRWAccess() {
		return rwAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRWAccess(EDirection newRWAccess) {
		EDirection oldRWAccess = rwAccess;
		rwAccess = newRWAccess == null ? RW_ACCESS_EDEFAULT : newRWAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.OPERATION_ACCESS__RW_ACCESS, oldRWAccess, rwAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.OPERATION_ACCESS__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ExecutionPackage.OPERATION_ACCESS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ExecutionPackage.OPERATION_ACCESS__RW_ACCESS:
				return getRWAccess();
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
			case ExecutionPackage.OPERATION_ACCESS__SOURCE:
				setSource((DeployedOperation)newValue);
				return;
			case ExecutionPackage.OPERATION_ACCESS__TARGET:
				setTarget((DeployedOperation)newValue);
				return;
			case ExecutionPackage.OPERATION_ACCESS__RW_ACCESS:
				setRWAccess((EDirection)newValue);
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
			case ExecutionPackage.OPERATION_ACCESS__SOURCE:
				setSource((DeployedOperation)null);
				return;
			case ExecutionPackage.OPERATION_ACCESS__TARGET:
				setTarget((DeployedOperation)null);
				return;
			case ExecutionPackage.OPERATION_ACCESS__RW_ACCESS:
				setRWAccess(RW_ACCESS_EDEFAULT);
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
			case ExecutionPackage.OPERATION_ACCESS__SOURCE:
				return source != null;
			case ExecutionPackage.OPERATION_ACCESS__TARGET:
				return target != null;
			case ExecutionPackage.OPERATION_ACCESS__RW_ACCESS:
				return rwAccess != RW_ACCESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RWAccess: ");
		result.append(rwAccess);
		result.append(')');
		return result.toString();
	}

} //OperationAccessImpl
