/**
 */
package kieker.develop.al.handler.pcm.rac.impl;

import kieker.develop.al.handler.pcm.rac.RacPackage;
import kieker.develop.al.handler.pcm.rac.SourceNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl#getChildNode <em>Child Node</em>}</li>
 *   <li>{@link kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceNodeImpl extends MinimalEObjectImpl.Container implements SourceNode {
	/**
	 * The cached value of the '{@link #getChildNode() <em>Child Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNode()
	 * @generated
	 * @ordered
	 */
	protected SourceNode childNode;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected NamedElement reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RacPackage.Literals.SOURCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getReference() {
		if (reference != null && ((EObject)reference).eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (NamedElement)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RacPackage.SOURCE_NODE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(NamedElement newReference) {
		NamedElement oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RacPackage.SOURCE_NODE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNode getChildNode() {
		return childNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildNode(SourceNode newChildNode, NotificationChain msgs) {
		SourceNode oldChildNode = childNode;
		childNode = newChildNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RacPackage.SOURCE_NODE__CHILD_NODE, oldChildNode, newChildNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildNode(SourceNode newChildNode) {
		if (newChildNode != childNode) {
			NotificationChain msgs = null;
			if (childNode != null)
				msgs = ((InternalEObject)childNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RacPackage.SOURCE_NODE__CHILD_NODE, null, msgs);
			if (newChildNode != null)
				msgs = ((InternalEObject)newChildNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RacPackage.SOURCE_NODE__CHILD_NODE, null, msgs);
			msgs = basicSetChildNode(newChildNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RacPackage.SOURCE_NODE__CHILD_NODE, newChildNode, newChildNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RacPackage.SOURCE_NODE__CHILD_NODE:
				return basicSetChildNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RacPackage.SOURCE_NODE__CHILD_NODE:
				return getChildNode();
			case RacPackage.SOURCE_NODE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
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
			case RacPackage.SOURCE_NODE__CHILD_NODE:
				setChildNode((SourceNode)newValue);
				return;
			case RacPackage.SOURCE_NODE__REFERENCE:
				setReference((NamedElement)newValue);
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
			case RacPackage.SOURCE_NODE__CHILD_NODE:
				setChildNode((SourceNode)null);
				return;
			case RacPackage.SOURCE_NODE__REFERENCE:
				setReference((NamedElement)null);
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
			case RacPackage.SOURCE_NODE__CHILD_NODE:
				return childNode != null;
			case RacPackage.SOURCE_NODE__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceNodeImpl
