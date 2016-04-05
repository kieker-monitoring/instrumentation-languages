/**
 */
package kieker.develop.al.mapping.impl;

import kieker.develop.al.mapping.Attribute;
import kieker.develop.al.mapping.ContainerModifier;
import kieker.develop.al.mapping.Feature;
import kieker.develop.al.mapping.MappingPackage;
import kieker.develop.al.mapping.NamedElement;
import kieker.develop.al.mapping.NamedType;
import kieker.develop.al.mapping.Operation;
import kieker.develop.al.mapping.Reference;
import kieker.develop.al.mapping.Traceability;
import kieker.develop.al.mapping.Type;

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
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kieker.develop.al.mapping.impl.ContainerImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements kieker.develop.al.mapping.Container {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<kieker.develop.al.mapping.Container> contents;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Reference references;

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
		return MappingPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kieker.develop.al.mapping.Container> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<kieker.develop.al.mapping.Container>(kieker.develop.al.mapping.Container.class, this, MappingPackage.CONTAINER__CONTENTS);
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
			types = new EObjectContainmentEList<NamedType>(NamedType.class, this, MappingPackage.CONTAINER__TYPES);
		}
		return types;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CONTAINER__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CONTAINER__PREDECESSOR, oldPredecessor, predecessor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CONTAINER__PREDECESSOR, oldPredecessor, predecessor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CONTAINER__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CONTAINER__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, MappingPackage.CONTAINER__OPERATIONS);
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
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, MappingPackage.CONTAINER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Reference)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CONTAINER__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Reference newReferences) {
		Reference oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CONTAINER__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.CONTAINER__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case MappingPackage.CONTAINER__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case MappingPackage.CONTAINER__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case MappingPackage.CONTAINER__ATTRIBUTES:
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
			case MappingPackage.CONTAINER__CONTENTS:
				return getContents();
			case MappingPackage.CONTAINER__TYPES:
				return getTypes();
			case MappingPackage.CONTAINER__NAME:
				return getName();
			case MappingPackage.CONTAINER__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case MappingPackage.CONTAINER__MODIFIER:
				if (resolve) return getModifier();
				return basicGetModifier();
			case MappingPackage.CONTAINER__OPERATIONS:
				return getOperations();
			case MappingPackage.CONTAINER__ATTRIBUTES:
				return getAttributes();
			case MappingPackage.CONTAINER__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
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
			case MappingPackage.CONTAINER__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends kieker.develop.al.mapping.Container>)newValue);
				return;
			case MappingPackage.CONTAINER__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends NamedType>)newValue);
				return;
			case MappingPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case MappingPackage.CONTAINER__PREDECESSOR:
				setPredecessor((EObject)newValue);
				return;
			case MappingPackage.CONTAINER__MODIFIER:
				setModifier((ContainerModifier)newValue);
				return;
			case MappingPackage.CONTAINER__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case MappingPackage.CONTAINER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MappingPackage.CONTAINER__REFERENCES:
				setReferences((Reference)newValue);
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
			case MappingPackage.CONTAINER__CONTENTS:
				getContents().clear();
				return;
			case MappingPackage.CONTAINER__TYPES:
				getTypes().clear();
				return;
			case MappingPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MappingPackage.CONTAINER__PREDECESSOR:
				setPredecessor((EObject)null);
				return;
			case MappingPackage.CONTAINER__MODIFIER:
				setModifier((ContainerModifier)null);
				return;
			case MappingPackage.CONTAINER__OPERATIONS:
				getOperations().clear();
				return;
			case MappingPackage.CONTAINER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MappingPackage.CONTAINER__REFERENCES:
				setReferences((Reference)null);
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
			case MappingPackage.CONTAINER__CONTENTS:
				return contents != null && !contents.isEmpty();
			case MappingPackage.CONTAINER__TYPES:
				return types != null && !types.isEmpty();
			case MappingPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MappingPackage.CONTAINER__PREDECESSOR:
				return predecessor != null;
			case MappingPackage.CONTAINER__MODIFIER:
				return modifier != null;
			case MappingPackage.CONTAINER__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case MappingPackage.CONTAINER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case MappingPackage.CONTAINER__REFERENCES:
				return references != null;
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
				case MappingPackage.CONTAINER__NAME: return MappingPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
				case MappingPackage.CONTAINER__PREDECESSOR: return MappingPackage.TRACEABILITY__PREDECESSOR;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
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
				case MappingPackage.NAMED_ELEMENT__NAME: return MappingPackage.CONTAINER__NAME;
				default: return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
				case MappingPackage.TRACEABILITY__PREDECESSOR: return MappingPackage.CONTAINER__PREDECESSOR;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
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
