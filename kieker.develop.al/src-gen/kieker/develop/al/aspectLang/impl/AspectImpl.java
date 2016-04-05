/**
 */
package kieker.develop.al.aspectLang.impl;

import java.util.Collection;

import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.AspectLangPackage;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.UtilizeAdvice;

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
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.impl.AspectImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.AspectImpl#getAdvices <em>Advices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectImpl extends MinimalEObjectImpl.Container implements Aspect
{
  /**
   * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcut()
   * @generated
   * @ordered
   */
  protected Pointcut pointcut;

  /**
   * The cached value of the '{@link #getAdvices() <em>Advices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvices()
   * @generated
   * @ordered
   */
  protected EList<UtilizeAdvice> advices;

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
  public Pointcut getPointcut()
  {
    if (pointcut != null && pointcut.eIsProxy())
    {
      InternalEObject oldPointcut = (InternalEObject)pointcut;
      pointcut = (Pointcut)eResolveProxy(oldPointcut);
      if (pointcut != oldPointcut)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.ASPECT__POINTCUT, oldPointcut, pointcut));
      }
    }
    return pointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pointcut basicGetPointcut()
  {
    return pointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointcut(Pointcut newPointcut)
  {
    Pointcut oldPointcut = pointcut;
    pointcut = newPointcut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.ASPECT__POINTCUT, oldPointcut, pointcut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UtilizeAdvice> getAdvices()
  {
    if (advices == null)
    {
      advices = new EObjectContainmentEList<UtilizeAdvice>(UtilizeAdvice.class, this, AspectLangPackage.ASPECT__ADVICES);
    }
    return advices;
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
      case AspectLangPackage.ASPECT__ADVICES:
        return ((InternalEList<?>)getAdvices()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.ASPECT__POINTCUT:
        if (resolve) return getPointcut();
        return basicGetPointcut();
      case AspectLangPackage.ASPECT__ADVICES:
        return getAdvices();
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
      case AspectLangPackage.ASPECT__POINTCUT:
        setPointcut((Pointcut)newValue);
        return;
      case AspectLangPackage.ASPECT__ADVICES:
        getAdvices().clear();
        getAdvices().addAll((Collection<? extends UtilizeAdvice>)newValue);
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
      case AspectLangPackage.ASPECT__POINTCUT:
        setPointcut((Pointcut)null);
        return;
      case AspectLangPackage.ASPECT__ADVICES:
        getAdvices().clear();
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
      case AspectLangPackage.ASPECT__POINTCUT:
        return pointcut != null;
      case AspectLangPackage.ASPECT__ADVICES:
        return advices != null && !advices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AspectImpl
