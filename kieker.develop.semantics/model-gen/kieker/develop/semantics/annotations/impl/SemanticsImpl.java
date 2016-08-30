/**
 */
package kieker.develop.semantics.annotations.impl;

import java.util.Collection;

import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.AnnotationsPackage;
import kieker.develop.semantics.annotations.Semantics;
import kieker.develop.semantics.annotations.TargetLanguage;
import kieker.develop.semantics.annotations.Technology;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.semantics.annotations.impl.SemanticsImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.impl.SemanticsImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.impl.SemanticsImpl#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticsImpl extends MinimalEObjectImpl.Container implements Semantics {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetLanguage> languages;

	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> technologies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.SEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, AnnotationsPackage.SEMANTICS__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentEList<TargetLanguage>(TargetLanguage.class, this, AnnotationsPackage.SEMANTICS__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Technology> getTechnologies() {
		if (technologies == null) {
			technologies = new EObjectContainmentEList<Technology>(Technology.class, this, AnnotationsPackage.SEMANTICS__TECHNOLOGIES);
		}
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.SEMANTICS__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.SEMANTICS__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.SEMANTICS__TECHNOLOGIES:
				return ((InternalEList<?>)getTechnologies()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.SEMANTICS__ANNOTATIONS:
				return getAnnotations();
			case AnnotationsPackage.SEMANTICS__LANGUAGES:
				return getLanguages();
			case AnnotationsPackage.SEMANTICS__TECHNOLOGIES:
				return getTechnologies();
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
			case AnnotationsPackage.SEMANTICS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AnnotationsPackage.SEMANTICS__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends TargetLanguage>)newValue);
				return;
			case AnnotationsPackage.SEMANTICS__TECHNOLOGIES:
				getTechnologies().clear();
				getTechnologies().addAll((Collection<? extends Technology>)newValue);
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
			case AnnotationsPackage.SEMANTICS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case AnnotationsPackage.SEMANTICS__LANGUAGES:
				getLanguages().clear();
				return;
			case AnnotationsPackage.SEMANTICS__TECHNOLOGIES:
				getTechnologies().clear();
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
			case AnnotationsPackage.SEMANTICS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case AnnotationsPackage.SEMANTICS__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case AnnotationsPackage.SEMANTICS__TECHNOLOGIES:
				return technologies != null && !technologies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticsImpl
