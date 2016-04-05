/**
 */
package kieker.tools.rl.recordLang.impl;

import kieker.tools.rl.recordLang.ArraySize;
import kieker.tools.rl.recordLang.BaseType;
import kieker.tools.rl.recordLang.Classifier;
import kieker.tools.rl.recordLang.RecordLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.rl.recordLang.impl.ClassifierImpl#getType <em>Type</em>}</li>
 *   <li>{@link kieker.tools.rl.recordLang.impl.ClassifierImpl#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierImpl extends MinimalEObjectImpl.Container implements Classifier
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BaseType type;

  /**
   * The cached value of the '{@link #getSizes() <em>Sizes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizes()
   * @generated
   * @ordered
   */
  protected EList<ArraySize> sizes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierImpl()
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
    return RecordLangPackage.Literals.CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (BaseType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.CLASSIFIER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BaseType newType)
  {
    BaseType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.CLASSIFIER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySize> getSizes()
  {
    if (sizes == null)
    {
      sizes = new EObjectContainmentEList<ArraySize>(ArraySize.class, this, RecordLangPackage.CLASSIFIER__SIZES);
    }
    return sizes;
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
      case RecordLangPackage.CLASSIFIER__SIZES:
        return ((InternalEList<?>)getSizes()).basicRemove(otherEnd, msgs);
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
      case RecordLangPackage.CLASSIFIER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case RecordLangPackage.CLASSIFIER__SIZES:
        return getSizes();
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
      case RecordLangPackage.CLASSIFIER__TYPE:
        setType((BaseType)newValue);
        return;
      case RecordLangPackage.CLASSIFIER__SIZES:
        getSizes().clear();
        getSizes().addAll((Collection<? extends ArraySize>)newValue);
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
      case RecordLangPackage.CLASSIFIER__TYPE:
        setType((BaseType)null);
        return;
      case RecordLangPackage.CLASSIFIER__SIZES:
        getSizes().clear();
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
      case RecordLangPackage.CLASSIFIER__TYPE:
        return type != null;
      case RecordLangPackage.CLASSIFIER__SIZES:
        return sizes != null && !sizes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassifierImpl
