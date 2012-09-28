/**
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.ReferenceProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ReferencePropertyImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencePropertyImpl extends MinimalEObjectImpl.Container implements ReferenceProperty
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EStructuralFeature ref;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ReferenceProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencePropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProbeLangPackage.Literals.REFERENCE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (EStructuralFeature)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProbeLangPackage.REFERENCE_PROPERTY__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(EStructuralFeature newRef)
  {
    EStructuralFeature oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.REFERENCE_PROPERTY__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ReferenceProperty>(ReferenceProperty.class, this, ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProbeLangPackage.REFERENCE_PROPERTY__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES:
        return getProperties();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProbeLangPackage.REFERENCE_PROPERTY__REF:
        setRef((EStructuralFeature)newValue);
        return;
      case ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ReferenceProperty>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProbeLangPackage.REFERENCE_PROPERTY__REF:
        setRef((EStructuralFeature)null);
        return;
      case ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES:
        getProperties().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProbeLangPackage.REFERENCE_PROPERTY__REF:
        return ref != null;
      case ProbeLangPackage.REFERENCE_PROPERTY__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReferencePropertyImpl
