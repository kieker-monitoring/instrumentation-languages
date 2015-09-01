/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl#getNode <em>Node</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.LocationQueryImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationQueryImpl extends MinimalEObjectImpl.Container implements LocationQuery
{
  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected Node node;

  /**
   * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecialization()
   * @generated
   * @ordered
   */
  protected LocationQuery specialization;

  /**
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected CompositionQuery composition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationQueryImpl()
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
    return AspectLangPackage.Literals.LOCATION_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(Node newNode, NotificationChain msgs)
  {
    Node oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__NODE, oldNode, newNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(Node newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationQuery getSpecialization()
  {
    return specialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecialization(LocationQuery newSpecialization, NotificationChain msgs)
  {
    LocationQuery oldSpecialization = specialization;
    specialization = newSpecialization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__SPECIALIZATION, oldSpecialization, newSpecialization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecialization(LocationQuery newSpecialization)
  {
    if (newSpecialization != specialization)
    {
      NotificationChain msgs = null;
      if (specialization != null)
        msgs = ((InternalEObject)specialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__SPECIALIZATION, null, msgs);
      if (newSpecialization != null)
        msgs = ((InternalEObject)newSpecialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__SPECIALIZATION, null, msgs);
      msgs = basicSetSpecialization(newSpecialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__SPECIALIZATION, newSpecialization, newSpecialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionQuery getComposition()
  {
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposition(CompositionQuery newComposition, NotificationChain msgs)
  {
    CompositionQuery oldComposition = composition;
    composition = newComposition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__COMPOSITION, oldComposition, newComposition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposition(CompositionQuery newComposition)
  {
    if (newComposition != composition)
    {
      NotificationChain msgs = null;
      if (composition != null)
        msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__COMPOSITION, null, msgs);
      if (newComposition != null)
        msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LOCATION_QUERY__COMPOSITION, null, msgs);
      msgs = basicSetComposition(newComposition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LOCATION_QUERY__COMPOSITION, newComposition, newComposition));
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
      case AspectLangPackage.LOCATION_QUERY__NODE:
        return basicSetNode(null, msgs);
      case AspectLangPackage.LOCATION_QUERY__SPECIALIZATION:
        return basicSetSpecialization(null, msgs);
      case AspectLangPackage.LOCATION_QUERY__COMPOSITION:
        return basicSetComposition(null, msgs);
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
      case AspectLangPackage.LOCATION_QUERY__NODE:
        return getNode();
      case AspectLangPackage.LOCATION_QUERY__SPECIALIZATION:
        return getSpecialization();
      case AspectLangPackage.LOCATION_QUERY__COMPOSITION:
        return getComposition();
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
      case AspectLangPackage.LOCATION_QUERY__NODE:
        setNode((Node)newValue);
        return;
      case AspectLangPackage.LOCATION_QUERY__SPECIALIZATION:
        setSpecialization((LocationQuery)newValue);
        return;
      case AspectLangPackage.LOCATION_QUERY__COMPOSITION:
        setComposition((CompositionQuery)newValue);
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
      case AspectLangPackage.LOCATION_QUERY__NODE:
        setNode((Node)null);
        return;
      case AspectLangPackage.LOCATION_QUERY__SPECIALIZATION:
        setSpecialization((LocationQuery)null);
        return;
      case AspectLangPackage.LOCATION_QUERY__COMPOSITION:
        setComposition((CompositionQuery)null);
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
      case AspectLangPackage.LOCATION_QUERY__NODE:
        return node != null;
      case AspectLangPackage.LOCATION_QUERY__SPECIALIZATION:
        return specialization != null;
      case AspectLangPackage.LOCATION_QUERY__COMPOSITION:
        return composition != null;
    }
    return super.eIsSet(featureID);
  }

} //LocationQueryImpl
