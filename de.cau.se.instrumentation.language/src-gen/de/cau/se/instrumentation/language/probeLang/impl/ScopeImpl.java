/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.Alternative;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.Scope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl#getModelRef <em>Model Ref</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl#isInsertBefore <em>Insert Before</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ScopeImpl#isInsertAfter <em>Insert After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope
{
  /**
   * The default value of the '{@link #getModelRef() <em>Model Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelRef()
   * @generated
   * @ordered
   */
  protected static final String MODEL_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelRef() <em>Model Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelRef()
   * @generated
   * @ordered
   */
  protected String modelRef = MODEL_REF_EDEFAULT;

  /**
   * The default value of the '{@link #isInsertBefore() <em>Insert Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsertBefore()
   * @generated
   * @ordered
   */
  protected static final boolean INSERT_BEFORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInsertBefore() <em>Insert Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsertBefore()
   * @generated
   * @ordered
   */
  protected boolean insertBefore = INSERT_BEFORE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Alternative target;

  /**
   * The default value of the '{@link #isInsertAfter() <em>Insert After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsertAfter()
   * @generated
   * @ordered
   */
  protected static final boolean INSERT_AFTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInsertAfter() <em>Insert After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsertAfter()
   * @generated
   * @ordered
   */
  protected boolean insertAfter = INSERT_AFTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeImpl()
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
    return ProbeLangPackage.Literals.SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelRef()
  {
    return modelRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelRef(String newModelRef)
  {
    String oldModelRef = modelRef;
    modelRef = newModelRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.SCOPE__MODEL_REF, oldModelRef, modelRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInsertBefore()
  {
    return insertBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertBefore(boolean newInsertBefore)
  {
    boolean oldInsertBefore = insertBefore;
    insertBefore = newInsertBefore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.SCOPE__INSERT_BEFORE, oldInsertBefore, insertBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Alternative newTarget, NotificationChain msgs)
  {
    Alternative oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbeLangPackage.SCOPE__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Alternative newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.SCOPE__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.SCOPE__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.SCOPE__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInsertAfter()
  {
    return insertAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertAfter(boolean newInsertAfter)
  {
    boolean oldInsertAfter = insertAfter;
    insertAfter = newInsertAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.SCOPE__INSERT_AFTER, oldInsertAfter, insertAfter));
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
      case ProbeLangPackage.SCOPE__TARGET:
        return basicSetTarget(null, msgs);
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
      case ProbeLangPackage.SCOPE__MODEL_REF:
        return getModelRef();
      case ProbeLangPackage.SCOPE__INSERT_BEFORE:
        return isInsertBefore();
      case ProbeLangPackage.SCOPE__TARGET:
        return getTarget();
      case ProbeLangPackage.SCOPE__INSERT_AFTER:
        return isInsertAfter();
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
      case ProbeLangPackage.SCOPE__MODEL_REF:
        setModelRef((String)newValue);
        return;
      case ProbeLangPackage.SCOPE__INSERT_BEFORE:
        setInsertBefore((Boolean)newValue);
        return;
      case ProbeLangPackage.SCOPE__TARGET:
        setTarget((Alternative)newValue);
        return;
      case ProbeLangPackage.SCOPE__INSERT_AFTER:
        setInsertAfter((Boolean)newValue);
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
      case ProbeLangPackage.SCOPE__MODEL_REF:
        setModelRef(MODEL_REF_EDEFAULT);
        return;
      case ProbeLangPackage.SCOPE__INSERT_BEFORE:
        setInsertBefore(INSERT_BEFORE_EDEFAULT);
        return;
      case ProbeLangPackage.SCOPE__TARGET:
        setTarget((Alternative)null);
        return;
      case ProbeLangPackage.SCOPE__INSERT_AFTER:
        setInsertAfter(INSERT_AFTER_EDEFAULT);
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
      case ProbeLangPackage.SCOPE__MODEL_REF:
        return MODEL_REF_EDEFAULT == null ? modelRef != null : !MODEL_REF_EDEFAULT.equals(modelRef);
      case ProbeLangPackage.SCOPE__INSERT_BEFORE:
        return insertBefore != INSERT_BEFORE_EDEFAULT;
      case ProbeLangPackage.SCOPE__TARGET:
        return target != null;
      case ProbeLangPackage.SCOPE__INSERT_AFTER:
        return insertAfter != INSERT_AFTER_EDEFAULT;
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
    result.append(" (modelRef: ");
    result.append(modelRef);
    result.append(", insertBefore: ");
    result.append(insertBefore);
    result.append(", insertAfter: ");
    result.append(insertAfter);
    result.append(')');
    return result.toString();
  }

} //ScopeImpl
