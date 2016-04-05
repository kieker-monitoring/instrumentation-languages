/**
 */
package kieker.tools.al.aspectLang.impl;

import kieker.tools.al.aspectLang.AspectLangPackage;
import kieker.tools.al.aspectLang.Collector;
import kieker.tools.al.aspectLang.Event;
import kieker.tools.al.aspectLang.InsertionPoint;

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
 *   <li>{@link kieker.tools.al.aspectLang.impl.CollectorImpl#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.CollectorImpl#getEvents <em>Events</em>}</li>
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
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

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
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, AspectLangPackage.COLLECTOR__EVENTS);
    }
    return events;
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
      case AspectLangPackage.COLLECTOR__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.COLLECTOR__EVENTS:
        return getEvents();
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
      case AspectLangPackage.COLLECTOR__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
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
      case AspectLangPackage.COLLECTOR__EVENTS:
        getEvents().clear();
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
      case AspectLangPackage.COLLECTOR__EVENTS:
        return events != null && !events.isEmpty();
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
