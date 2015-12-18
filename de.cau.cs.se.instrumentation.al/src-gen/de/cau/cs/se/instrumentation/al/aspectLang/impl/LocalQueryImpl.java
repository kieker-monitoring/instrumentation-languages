/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.LocalQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ModelProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.Typeof;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocalQueryImpl#getLocationQuery <em>Location Query</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocalQueryImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocalQueryImpl#getTypeof <em>Typeof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalQueryImpl extends ConstraintElementImpl implements LocalQuery
{
  /**
   * The cached value of the '{@link #getLocationQuery() <em>Location Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationQuery()
   * @generated
   * @ordered
   */
  protected LocationQuery locationQuery;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected ModelProperty property;

  /**
   * The cached value of the '{@link #getTypeof() <em>Typeof</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeof()
   * @generated
   * @ordered
   */
  protected Typeof typeof;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalQueryImpl()
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
    return AspectLangPackage.Literals.LOCAL_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationQuery getLocationQuery()
  {
    return locationQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocationQuery(LocationQuery newLocationQuery, NotificationChain msgs)
  {
    LocationQuery oldLocationQuery = locationQuery;
    locationQuery = newLocationQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY, oldLocationQuery, newLocationQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocationQuery(LocationQuery newLocationQuery)
  {
    if (newLocationQuery != locationQuery)
    {
      NotificationChain msgs = null;
      if (locationQuery != null)
        msgs = ((InternalEObject)locationQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY, null, msgs);
      if (newLocationQuery != null)
        msgs = ((InternalEObject)newLocationQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY, null, msgs);
      msgs = basicSetLocationQuery(newLocationQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY, newLocationQuery, newLocationQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelProperty getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(ModelProperty newProperty, NotificationChain msgs)
  {
    ModelProperty oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(ModelProperty newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typeof getTypeof()
  {
    return typeof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeof(Typeof newTypeof, NotificationChain msgs)
  {
    Typeof oldTypeof = typeof;
    typeof = newTypeof;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__TYPEOF, oldTypeof, newTypeof);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeof(Typeof newTypeof)
  {
    if (newTypeof != typeof)
    {
      NotificationChain msgs = null;
      if (typeof != null)
        msgs = ((InternalEObject)typeof).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__TYPEOF, null, msgs);
      if (newTypeof != null)
        msgs = ((InternalEObject)newTypeof).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCAL_QUERY__TYPEOF, null, msgs);
      msgs = basicSetTypeof(newTypeof, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCAL_QUERY__TYPEOF, newTypeof, newTypeof));
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
      case AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY:
        return basicSetLocationQuery(null, msgs);
      case AspectLangPackage.LOCAL_QUERY__PROPERTY:
        return basicSetProperty(null, msgs);
      case AspectLangPackage.LOCAL_QUERY__TYPEOF:
        return basicSetTypeof(null, msgs);
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
      case AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY:
        return getLocationQuery();
      case AspectLangPackage.LOCAL_QUERY__PROPERTY:
        return getProperty();
      case AspectLangPackage.LOCAL_QUERY__TYPEOF:
        return getTypeof();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY:
        setLocationQuery((LocationQuery)newValue);
        return;
      case AspectLangPackage.LOCAL_QUERY__PROPERTY:
        setProperty((ModelProperty)newValue);
        return;
      case AspectLangPackage.LOCAL_QUERY__TYPEOF:
        setTypeof((Typeof)newValue);
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
      case AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY:
        setLocationQuery((LocationQuery)null);
        return;
      case AspectLangPackage.LOCAL_QUERY__PROPERTY:
        setProperty((ModelProperty)null);
        return;
      case AspectLangPackage.LOCAL_QUERY__TYPEOF:
        setTypeof((Typeof)null);
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
      case AspectLangPackage.LOCAL_QUERY__LOCATION_QUERY:
        return locationQuery != null;
      case AspectLangPackage.LOCAL_QUERY__PROPERTY:
        return property != null;
      case AspectLangPackage.LOCAL_QUERY__TYPEOF:
        return typeof != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalQueryImpl
