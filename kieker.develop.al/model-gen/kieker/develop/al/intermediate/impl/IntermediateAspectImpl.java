/**
 */
package kieker.develop.al.intermediate.impl;

import java.util.Collection;

import kieker.develop.al.aspectLang.Advice;

import kieker.develop.al.intermediate.AbstractJoinpoint;
import kieker.develop.al.intermediate.IntermediateAspect;
import kieker.develop.al.intermediate.IntermediatePackage;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.impl.IntermediateAspectImpl#getJoinpoints <em>Joinpoints</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.impl.IntermediateAspectImpl#getAdvices <em>Advices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateAspectImpl extends MinimalEObjectImpl.Container implements IntermediateAspect {
	/**
	 * The cached value of the '{@link #getJoinpoints() <em>Joinpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractJoinpoint> joinpoints;

	/**
	 * The cached value of the '{@link #getAdvices() <em>Advices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvices()
	 * @generated
	 * @ordered
	 */
	protected EList<Advice> advices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.INTERMEDIATE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractJoinpoint> getJoinpoints() {
		if (joinpoints == null) {
			joinpoints = new EObjectContainmentEList<AbstractJoinpoint>(AbstractJoinpoint.class, this, IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS);
		}
		return joinpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advice> getAdvices() {
		if (advices == null) {
			advices = new EObjectResolvingEList<Advice>(Advice.class, this, IntermediatePackage.INTERMEDIATE_ASPECT__ADVICES);
		}
		return advices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS:
				return ((InternalEList<?>)getJoinpoints()).basicRemove(otherEnd, msgs);
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
			case IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS:
				return getJoinpoints();
			case IntermediatePackage.INTERMEDIATE_ASPECT__ADVICES:
				return getAdvices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS:
				getJoinpoints().clear();
				getJoinpoints().addAll((Collection<? extends AbstractJoinpoint>)newValue);
				return;
			case IntermediatePackage.INTERMEDIATE_ASPECT__ADVICES:
				getAdvices().clear();
				getAdvices().addAll((Collection<? extends Advice>)newValue);
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
			case IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS:
				getJoinpoints().clear();
				return;
			case IntermediatePackage.INTERMEDIATE_ASPECT__ADVICES:
				getAdvices().clear();
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
			case IntermediatePackage.INTERMEDIATE_ASPECT__JOINPOINTS:
				return joinpoints != null && !joinpoints.isEmpty();
			case IntermediatePackage.INTERMEDIATE_ASPECT__ADVICES:
				return advices != null && !advices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntermediateAspectImpl
