/**
 */
package kieker.develop.al.intermediate.impl;

import kieker.develop.al.intermediate.CodeJoinpoint;
import kieker.develop.al.intermediate.IntermediatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.impl.CodeJoinpointImpl#getReferencedJavaObject <em>Referenced Java Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeJoinpointImpl extends AbstractJoinpointImpl implements CodeJoinpoint {
	/**
	 * The default value of the '{@link #getReferencedJavaObject() <em>Referenced Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedJavaObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object REFERENCED_JAVA_OBJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReferencedJavaObject() <em>Referenced Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedJavaObject()
	 * @generated
	 * @ordered
	 */
	protected Object referencedJavaObject = REFERENCED_JAVA_OBJECT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeJoinpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.CODE_JOINPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getReferencedJavaObject() {
		return referencedJavaObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedJavaObject(Object newReferencedJavaObject) {
		Object oldReferencedJavaObject = referencedJavaObject;
		referencedJavaObject = newReferencedJavaObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.CODE_JOINPOINT__REFERENCED_JAVA_OBJECT, oldReferencedJavaObject, referencedJavaObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.CODE_JOINPOINT__REFERENCED_JAVA_OBJECT:
				return getReferencedJavaObject();
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
			case IntermediatePackage.CODE_JOINPOINT__REFERENCED_JAVA_OBJECT:
				setReferencedJavaObject(newValue);
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
			case IntermediatePackage.CODE_JOINPOINT__REFERENCED_JAVA_OBJECT:
				setReferencedJavaObject(REFERENCED_JAVA_OBJECT_EDEFAULT);
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
			case IntermediatePackage.CODE_JOINPOINT__REFERENCED_JAVA_OBJECT:
				return REFERENCED_JAVA_OBJECT_EDEFAULT == null ? referencedJavaObject != null : !REFERENCED_JAVA_OBJECT_EDEFAULT.equals(referencedJavaObject);
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
		result.append(" (referencedJavaObject: ");
		result.append(referencedJavaObject);
		result.append(')');
		return result.toString();
	}

} //CodeJoinpointImpl
