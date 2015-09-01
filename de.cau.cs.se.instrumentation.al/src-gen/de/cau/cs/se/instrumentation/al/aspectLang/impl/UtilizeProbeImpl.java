/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.UtilizeProbe;
import de.cau.cs.se.instrumentation.al.aspectLang.Value;

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
 * An implementation of the model object '<em><b>Utilize Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeProbeImpl#getProbe <em>Probe</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.UtilizeProbeImpl#getParameterAssignments <em>Parameter Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilizeProbeImpl extends MinimalEObjectImpl.Container implements UtilizeProbe
{
  /**
   * The cached value of the '{@link #getProbe() <em>Probe</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbe()
   * @generated
   * @ordered
   */
  protected Advice probe;

  /**
   * The cached value of the '{@link #getParameterAssignments() <em>Parameter Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterAssignments()
   * @generated
   * @ordered
   */
  protected EList<Value> parameterAssignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtilizeProbeImpl()
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
    return AspectLangPackage.Literals.UTILIZE_PROBE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Advice getProbe()
  {
    if (probe != null && probe.eIsProxy())
    {
      InternalEObject oldProbe = (InternalEObject)probe;
      probe = (Advice)eResolveProxy(oldProbe);
      if (probe != oldProbe)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.UTILIZE_PROBE__PROBE, oldProbe, probe));
      }
    }
    return probe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Advice basicGetProbe()
  {
    return probe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProbe(Advice newProbe)
  {
    Advice oldProbe = probe;
    probe = newProbe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.UTILIZE_PROBE__PROBE, oldProbe, probe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getParameterAssignments()
  {
    if (parameterAssignments == null)
    {
      parameterAssignments = new EObjectContainmentEList<Value>(Value.class, this, AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS);
    }
    return parameterAssignments;
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
      case AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS:
        return ((InternalEList<?>)getParameterAssignments()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.UTILIZE_PROBE__PROBE:
        if (resolve) return getProbe();
        return basicGetProbe();
      case AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS:
        return getParameterAssignments();
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
      case AspectLangPackage.UTILIZE_PROBE__PROBE:
        setProbe((Advice)newValue);
        return;
      case AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS:
        getParameterAssignments().clear();
        getParameterAssignments().addAll((Collection<? extends Value>)newValue);
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
      case AspectLangPackage.UTILIZE_PROBE__PROBE:
        setProbe((Advice)null);
        return;
      case AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS:
        getParameterAssignments().clear();
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
      case AspectLangPackage.UTILIZE_PROBE__PROBE:
        return probe != null;
      case AspectLangPackage.UTILIZE_PROBE__PARAMETER_ASSIGNMENTS:
        return parameterAssignments != null && !parameterAssignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UtilizeProbeImpl
