/**
 */
package kieker.develop.al.handler.pcm.rac.impl;

import kieker.develop.al.handler.pcm.rac.CodeTargetNode;
import kieker.develop.al.handler.pcm.rac.RacPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Target Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeTargetNodeImpl extends MinimalEObjectImpl.Container implements CodeTargetNode {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedClassName = FULLY_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected String operationSignature = OPERATION_SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeTargetNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RacPackage.Literals.CODE_TARGET_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RacPackage.CODE_TARGET_NODE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedClassName() {
		return fullyQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedClassName(String newFullyQualifiedClassName) {
		String oldFullyQualifiedClassName = fullyQualifiedClassName;
		fullyQualifiedClassName = newFullyQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RacPackage.CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME, oldFullyQualifiedClassName, fullyQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationSignature() {
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSignature(String newOperationSignature) {
		String oldOperationSignature = operationSignature;
		operationSignature = newOperationSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RacPackage.CODE_TARGET_NODE__OPERATION_SIGNATURE, oldOperationSignature, operationSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RacPackage.CODE_TARGET_NODE__PATH:
				return getPath();
			case RacPackage.CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME:
				return getFullyQualifiedClassName();
			case RacPackage.CODE_TARGET_NODE__OPERATION_SIGNATURE:
				return getOperationSignature();
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
			case RacPackage.CODE_TARGET_NODE__PATH:
				setPath((String)newValue);
				return;
			case RacPackage.CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME:
				setFullyQualifiedClassName((String)newValue);
				return;
			case RacPackage.CODE_TARGET_NODE__OPERATION_SIGNATURE:
				setOperationSignature((String)newValue);
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
			case RacPackage.CODE_TARGET_NODE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case RacPackage.CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME:
				setFullyQualifiedClassName(FULLY_QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case RacPackage.CODE_TARGET_NODE__OPERATION_SIGNATURE:
				setOperationSignature(OPERATION_SIGNATURE_EDEFAULT);
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
			case RacPackage.CODE_TARGET_NODE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case RacPackage.CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME:
				return FULLY_QUALIFIED_CLASS_NAME_EDEFAULT == null ? fullyQualifiedClassName != null : !FULLY_QUALIFIED_CLASS_NAME_EDEFAULT.equals(fullyQualifiedClassName);
			case RacPackage.CODE_TARGET_NODE__OPERATION_SIGNATURE:
				return OPERATION_SIGNATURE_EDEFAULT == null ? operationSignature != null : !OPERATION_SIGNATURE_EDEFAULT.equals(operationSignature);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(", fullyQualifiedClassName: ");
		result.append(fullyQualifiedClassName);
		result.append(", operationSignature: ");
		result.append(operationSignature);
		result.append(')');
		return result.toString();
	}

} //CodeTargetNodeImpl
