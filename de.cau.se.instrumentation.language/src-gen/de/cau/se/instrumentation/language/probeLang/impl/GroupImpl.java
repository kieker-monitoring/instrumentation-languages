/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.Alternative;
import de.cau.se.instrumentation.language.probeLang.Group;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.GroupImpl#getSubTarget <em>Sub Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends XExpressionImpl implements Group
{
  /**
   * The cached value of the '{@link #getSubTarget() <em>Sub Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubTarget()
   * @generated
   * @ordered
   */
  protected Alternative subTarget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupImpl()
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
    return ProbeLangPackage.Literals.GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative getSubTarget()
  {
    return subTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubTarget(Alternative newSubTarget, NotificationChain msgs)
  {
    Alternative oldSubTarget = subTarget;
    subTarget = newSubTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbeLangPackage.GROUP__SUB_TARGET, oldSubTarget, newSubTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubTarget(Alternative newSubTarget)
  {
    if (newSubTarget != subTarget)
    {
      NotificationChain msgs = null;
      if (subTarget != null)
        msgs = ((InternalEObject)subTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.GROUP__SUB_TARGET, null, msgs);
      if (newSubTarget != null)
        msgs = ((InternalEObject)newSubTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.GROUP__SUB_TARGET, null, msgs);
      msgs = basicSetSubTarget(newSubTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.GROUP__SUB_TARGET, newSubTarget, newSubTarget));
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
      case ProbeLangPackage.GROUP__SUB_TARGET:
        return basicSetSubTarget(null, msgs);
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
      case ProbeLangPackage.GROUP__SUB_TARGET:
        return getSubTarget();
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
      case ProbeLangPackage.GROUP__SUB_TARGET:
        setSubTarget((Alternative)newValue);
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
      case ProbeLangPackage.GROUP__SUB_TARGET:
        setSubTarget((Alternative)null);
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
      case ProbeLangPackage.GROUP__SUB_TARGET:
        return subTarget != null;
    }
    return super.eIsSet(featureID);
  }

} //GroupImpl
