/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.Query;

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
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectImpl#getCollectors <em>Collectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends MinimalEObjectImpl.Container implements Aspect
{
  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected Query query;

  /**
   * The cached value of the '{@link #getCollectors() <em>Collectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectors()
   * @generated
   * @ordered
   */
  protected EList<Collector> collectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectImpl()
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
    return AspectLangPackage.Literals.ASPECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs)
  {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.ASPECT__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(Query newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.ASPECT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.ASPECT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.ASPECT__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Collector> getCollectors()
  {
    if (collectors == null)
    {
      collectors = new EObjectContainmentEList<Collector>(Collector.class, this, AspectLangPackage.ASPECT__COLLECTORS);
    }
    return collectors;
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
      case AspectLangPackage.ASPECT__QUERY:
        return basicSetQuery(null, msgs);
      case AspectLangPackage.ASPECT__COLLECTORS:
        return ((InternalEList<?>)getCollectors()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.ASPECT__QUERY:
        return getQuery();
      case AspectLangPackage.ASPECT__COLLECTORS:
        return getCollectors();
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
      case AspectLangPackage.ASPECT__QUERY:
        setQuery((Query)newValue);
        return;
      case AspectLangPackage.ASPECT__COLLECTORS:
        getCollectors().clear();
        getCollectors().addAll((Collection<? extends Collector>)newValue);
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
      case AspectLangPackage.ASPECT__QUERY:
        setQuery((Query)null);
        return;
      case AspectLangPackage.ASPECT__COLLECTORS:
        getCollectors().clear();
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
      case AspectLangPackage.ASPECT__QUERY:
        return query != null;
      case AspectLangPackage.ASPECT__COLLECTORS:
        return collectors != null && !collectors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AspectImpl
