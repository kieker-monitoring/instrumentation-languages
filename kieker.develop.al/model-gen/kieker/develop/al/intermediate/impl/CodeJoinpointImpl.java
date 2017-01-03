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
 *   <li>{@link kieker.develop.al.intermediate.impl.CodeJoinpointImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.impl.CodeJoinpointImpl#getOperationSiganture <em>Operation Siganture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeJoinpointImpl extends AbstractJoinpointImpl implements CodeJoinpoint {
	/**
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getOperationSiganture() <em>Operation Siganture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSiganture()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_SIGANTURE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOperationSiganture() <em>Operation Siganture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSiganture()
	 * @generated
	 * @ordered
	 */
	protected String operationSiganture = OPERATION_SIGANTURE_EDEFAULT;

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
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.CODE_JOINPOINT__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationSiganture() {
		return operationSiganture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSiganture(String newOperationSiganture) {
		String oldOperationSiganture = operationSiganture;
		operationSiganture = newOperationSiganture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.CODE_JOINPOINT__OPERATION_SIGANTURE, oldOperationSiganture, operationSiganture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.CODE_JOINPOINT__ARTIFACT_NAME:
				return getArtifactName();
			case IntermediatePackage.CODE_JOINPOINT__OPERATION_SIGANTURE:
				return getOperationSiganture();
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
			case IntermediatePackage.CODE_JOINPOINT__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case IntermediatePackage.CODE_JOINPOINT__OPERATION_SIGANTURE:
				setOperationSiganture((String)newValue);
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
			case IntermediatePackage.CODE_JOINPOINT__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case IntermediatePackage.CODE_JOINPOINT__OPERATION_SIGANTURE:
				setOperationSiganture(OPERATION_SIGANTURE_EDEFAULT);
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
			case IntermediatePackage.CODE_JOINPOINT__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case IntermediatePackage.CODE_JOINPOINT__OPERATION_SIGANTURE:
				return OPERATION_SIGANTURE_EDEFAULT == null ? operationSiganture != null : !OPERATION_SIGANTURE_EDEFAULT.equals(operationSiganture);
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
		result.append(" (artifactName: ");
		result.append(artifactName);
		result.append(", operationSiganture: ");
		result.append(operationSiganture);
		result.append(')');
		return result.toString();
	}

} //CodeJoinpointImpl
