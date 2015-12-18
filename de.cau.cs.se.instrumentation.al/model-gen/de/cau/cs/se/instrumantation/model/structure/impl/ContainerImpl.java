/**
 */
package de.cau.cs.se.instrumantation.model.structure.impl;

import de.cau.cs.se.instrumantation.model.structure.Attribute;
import de.cau.cs.se.instrumantation.model.structure.ContainerModifier;
import de.cau.cs.se.instrumantation.model.structure.Feature;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.Operation;
import de.cau.cs.se.instrumantation.model.structure.StructurePackage;
import de.cau.cs.se.instrumantation.model.structure.Traceability;
import de.cau.cs.se.instrumantation.model.structure.TypeReference;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.impl.ContainerImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements de.cau.cs.se.instrumantation.model.structure.Container {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cau.cs.se.instrumantation.model.structure.Container> contents;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EObject predecessor;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected ContainerModifier modifier;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cau.cs.se.instrumantation.model.structure.Container> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<de.cau.cs.se.instrumantation.model.structure.Container>(de.cau.cs.se.instrumantation.model.structure.Container.class, this, StructurePackage.CONTAINER__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONTAINER__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(EObject newPredecessor) {
		EObject oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerModifier getModifier() {
		if (modifier != null && modifier.eIsProxy()) {
			InternalEObject oldModifier = (InternalEObject)modifier;
			modifier = (ContainerModifier)eResolveProxy(oldModifier);
			if (modifier != oldModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONTAINER__MODIFIER, oldModifier, modifier));
			}
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerModifier basicGetModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(ContainerModifier newModifier) {
		ContainerModifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, StructurePackage.CONTAINER__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructurePackage.CONTAINER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeReference)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONTAINER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		TypeReference oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.CONTAINER__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONTAINER__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONTAINER__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.CONTAINER__CONTENTS:
				return getContents();
			case StructurePackage.CONTAINER__NAME:
				return getName();
			case StructurePackage.CONTAINER__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case StructurePackage.CONTAINER__MODIFIER:
				if (resolve) return getModifier();
				return basicGetModifier();
			case StructurePackage.CONTAINER__OPERATIONS:
				return getOperations();
			case StructurePackage.CONTAINER__ATTRIBUTES:
				return getAttributes();
			case StructurePackage.CONTAINER__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case StructurePackage.CONTAINER__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends de.cau.cs.se.instrumantation.model.structure.Container>)newValue);
				return;
			case StructurePackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.CONTAINER__PREDECESSOR:
				setPredecessor((EObject)newValue);
				return;
			case StructurePackage.CONTAINER__MODIFIER:
				setModifier((ContainerModifier)newValue);
				return;
			case StructurePackage.CONTAINER__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructurePackage.CONTAINER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructurePackage.CONTAINER__TYPE:
				setType((TypeReference)newValue);
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
			case StructurePackage.CONTAINER__CONTENTS:
				getContents().clear();
				return;
			case StructurePackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.CONTAINER__PREDECESSOR:
				setPredecessor((EObject)null);
				return;
			case StructurePackage.CONTAINER__MODIFIER:
				setModifier((ContainerModifier)null);
				return;
			case StructurePackage.CONTAINER__OPERATIONS:
				getOperations().clear();
				return;
			case StructurePackage.CONTAINER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StructurePackage.CONTAINER__TYPE:
				setType((TypeReference)null);
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
			case StructurePackage.CONTAINER__CONTENTS:
				return contents != null && !contents.isEmpty();
			case StructurePackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.CONTAINER__PREDECESSOR:
				return predecessor != null;
			case StructurePackage.CONTAINER__MODIFIER:
				return modifier != null;
			case StructurePackage.CONTAINER__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case StructurePackage.CONTAINER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StructurePackage.CONTAINER__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.CONTAINER__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
				case StructurePackage.CONTAINER__PREDECESSOR: return StructurePackage.TRACEABILITY__PREDECESSOR;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.CONTAINER__NAME;
				default: return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
				case StructurePackage.TRACEABILITY__PREDECESSOR: return StructurePackage.CONTAINER__PREDECESSOR;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
