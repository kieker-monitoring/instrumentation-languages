/**
 */
package de.cau.cs.se.instrumentation.al.mapping.impl;

import de.cau.cs.se.instrumentation.al.mapping.MappingModel;
import de.cau.cs.se.instrumentation.al.mapping.MappingPackage;
import de.cau.cs.se.instrumentation.al.mapping.NamedType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.impl.MappingModelImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.impl.MappingModelImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingModelImpl extends MinimalEObjectImpl.Container implements MappingModel {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cau.cs.se.instrumentation.al.mapping.Container> contents;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cau.cs.se.instrumentation.al.mapping.Container> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<de.cau.cs.se.instrumentation.al.mapping.Container>(de.cau.cs.se.instrumentation.al.mapping.Container.class, this, MappingPackage.MAPPING_MODEL__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<NamedType>(NamedType.class, this, MappingPackage.MAPPING_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_MODEL__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.MAPPING_MODEL__CONTENTS:
				return getContents();
			case MappingPackage.MAPPING_MODEL__TYPES:
				return getTypes();
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
			case MappingPackage.MAPPING_MODEL__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends de.cau.cs.se.instrumentation.al.mapping.Container>)newValue);
				return;
			case MappingPackage.MAPPING_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends NamedType>)newValue);
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
			case MappingPackage.MAPPING_MODEL__CONTENTS:
				getContents().clear();
				return;
			case MappingPackage.MAPPING_MODEL__TYPES:
				getTypes().clear();
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
			case MappingPackage.MAPPING_MODEL__CONTENTS:
				return contents != null && !contents.isEmpty();
			case MappingPackage.MAPPING_MODEL__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingModelImpl
