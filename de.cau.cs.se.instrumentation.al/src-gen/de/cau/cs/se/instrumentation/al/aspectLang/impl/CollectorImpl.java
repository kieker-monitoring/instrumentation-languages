/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.aspectLang.Value;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

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
 * An implementation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.CollectorImpl#getInitializations <em>Initializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectorImpl extends MinimalEObjectImpl.Container implements Collector
{
  /**
   * The default value of the '{@link #getInsertionPoint() <em>Insertion Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertionPoint()
   * @generated
   * @ordered
   */
  protected static final InsertionPoint INSERTION_POINT_EDEFAULT = InsertionPoint.BEFORE;

  /**
   * The cached value of the '{@link #getInsertionPoint() <em>Insertion Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertionPoint()
   * @generated
   * @ordered
   */
  protected InsertionPoint insertionPoint = INSERTION_POINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RecordType type;

  /**
   * The cached value of the '{@link #getInitializations() <em>Initializations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializations()
   * @generated
   * @ordered
   */
  protected EList<Value> initializations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectorImpl()
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
    return AspectLangPackage.Literals.COLLECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertionPoint getInsertionPoint()
  {
    return insertionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertionPoint(InsertionPoint newInsertionPoint)
  {
    InsertionPoint oldInsertionPoint = insertionPoint;
    insertionPoint = newInsertionPoint == null ? INSERTION_POINT_EDEFAULT : newInsertionPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.COLLECTOR__INSERTION_POINT, oldInsertionPoint, insertionPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (RecordType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.COLLECTOR__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RecordType newType)
  {
    RecordType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.COLLECTOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getInitializations()
  {
    if (initializations == null)
    {
      initializations = new EObjectContainmentEList<Value>(Value.class, this, AspectLangPackage.COLLECTOR__INITIALIZATIONS);
    }
    return initializations;
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
      case AspectLangPackage.COLLECTOR__INITIALIZATIONS:
        return ((InternalEList<?>)getInitializations()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.COLLECTOR__INSERTION_POINT:
        return getInsertionPoint();
      case AspectLangPackage.COLLECTOR__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case AspectLangPackage.COLLECTOR__INITIALIZATIONS:
        return getInitializations();
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
      case AspectLangPackage.COLLECTOR__INSERTION_POINT:
        setInsertionPoint((InsertionPoint)newValue);
        return;
      case AspectLangPackage.COLLECTOR__TYPE:
        setType((RecordType)newValue);
        return;
      case AspectLangPackage.COLLECTOR__INITIALIZATIONS:
        getInitializations().clear();
        getInitializations().addAll((Collection<? extends Value>)newValue);
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
      case AspectLangPackage.COLLECTOR__INSERTION_POINT:
        setInsertionPoint(INSERTION_POINT_EDEFAULT);
        return;
      case AspectLangPackage.COLLECTOR__TYPE:
        setType((RecordType)null);
        return;
      case AspectLangPackage.COLLECTOR__INITIALIZATIONS:
        getInitializations().clear();
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
      case AspectLangPackage.COLLECTOR__INSERTION_POINT:
        return insertionPoint != INSERTION_POINT_EDEFAULT;
      case AspectLangPackage.COLLECTOR__TYPE:
        return type != null;
      case AspectLangPackage.COLLECTOR__INITIALIZATIONS:
        return initializations != null && !initializations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (insertionPoint: ");
    result.append(insertionPoint);
    result.append(')');
    return result.toString();
  }

} //CollectorImpl
