/**
 */
package kieker.develop.semantics.annotations.impl;

import kieker.develop.semantics.annotations.AnnotationsPackage;
import kieker.develop.semantics.annotations.Implementation;
import kieker.develop.semantics.annotations.TargetLanguage;
import kieker.develop.semantics.annotations.Technology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.semantics.annotations.impl.ImplementationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.impl.ImplementationImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.impl.ImplementationImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends MinimalEObjectImpl.Container implements Implementation {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected TargetLanguage language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IMPLEMENTATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology getTechnology() {
		if (technology != null && technology.eIsProxy()) {
			InternalEObject oldTechnology = (InternalEObject)technology;
			technology = (Technology)eResolveProxy(oldTechnology);
			if (technology != oldTechnology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY, oldTechnology, technology));
			}
		}
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology basicGetTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(Technology newTechnology) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLanguage getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (TargetLanguage)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.IMPLEMENTATION__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLanguage basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(TargetLanguage newLanguage) {
		TargetLanguage oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IMPLEMENTATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.IMPLEMENTATION__CODE:
				return getCode();
			case AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY:
				if (resolve) return getTechnology();
				return basicGetTechnology();
			case AnnotationsPackage.IMPLEMENTATION__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
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
			case AnnotationsPackage.IMPLEMENTATION__CODE:
				setCode((String)newValue);
				return;
			case AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY:
				setTechnology((Technology)newValue);
				return;
			case AnnotationsPackage.IMPLEMENTATION__LANGUAGE:
				setLanguage((TargetLanguage)newValue);
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
			case AnnotationsPackage.IMPLEMENTATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY:
				setTechnology((Technology)null);
				return;
			case AnnotationsPackage.IMPLEMENTATION__LANGUAGE:
				setLanguage((TargetLanguage)null);
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
			case AnnotationsPackage.IMPLEMENTATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case AnnotationsPackage.IMPLEMENTATION__TECHNOLOGY:
				return technology != null;
			case AnnotationsPackage.IMPLEMENTATION__LANGUAGE:
				return language != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
