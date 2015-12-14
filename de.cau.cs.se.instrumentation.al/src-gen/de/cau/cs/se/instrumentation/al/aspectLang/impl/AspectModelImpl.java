/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Import;
import de.cau.cs.se.instrumentation.al.aspectLang.Pointcut;

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
 * An implementation of the model object '<em><b>Aspect Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getAdvices <em>Advices</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.AspectModelImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectModelImpl extends MinimalEObjectImpl.Container implements AspectModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<ApplicationModel> sources;

  /**
   * The cached value of the '{@link #getAdvices() <em>Advices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvices()
   * @generated
   * @ordered
   */
  protected EList<Advice> advices;

  /**
   * The cached value of the '{@link #getPointcuts() <em>Pointcuts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcuts()
   * @generated
   * @ordered
   */
  protected EList<Pointcut> pointcuts;

  /**
   * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspects()
   * @generated
   * @ordered
   */
  protected EList<Aspect> aspects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectModelImpl()
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
    return AspectLangPackage.Literals.ASPECT_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.ASPECT_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AspectLangPackage.ASPECT_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApplicationModel> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectContainmentEList<ApplicationModel>(ApplicationModel.class, this, AspectLangPackage.ASPECT_MODEL__SOURCES);
    }
    return sources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Advice> getAdvices()
  {
    if (advices == null)
    {
      advices = new EObjectContainmentEList<Advice>(Advice.class, this, AspectLangPackage.ASPECT_MODEL__ADVICES);
    }
    return advices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pointcut> getPointcuts()
  {
    if (pointcuts == null)
    {
      pointcuts = new EObjectContainmentEList<Pointcut>(Pointcut.class, this, AspectLangPackage.ASPECT_MODEL__POINTCUTS);
    }
    return pointcuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aspect> getAspects()
  {
    if (aspects == null)
    {
      aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, AspectLangPackage.ASPECT_MODEL__ASPECTS);
    }
    return aspects;
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
      case AspectLangPackage.ASPECT_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AspectLangPackage.ASPECT_MODEL__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
      case AspectLangPackage.ASPECT_MODEL__ADVICES:
        return ((InternalEList<?>)getAdvices()).basicRemove(otherEnd, msgs);
      case AspectLangPackage.ASPECT_MODEL__POINTCUTS:
        return ((InternalEList<?>)getPointcuts()).basicRemove(otherEnd, msgs);
      case AspectLangPackage.ASPECT_MODEL__ASPECTS:
        return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.ASPECT_MODEL__NAME:
        return getName();
      case AspectLangPackage.ASPECT_MODEL__IMPORTS:
        return getImports();
      case AspectLangPackage.ASPECT_MODEL__SOURCES:
        return getSources();
      case AspectLangPackage.ASPECT_MODEL__ADVICES:
        return getAdvices();
      case AspectLangPackage.ASPECT_MODEL__POINTCUTS:
        return getPointcuts();
      case AspectLangPackage.ASPECT_MODEL__ASPECTS:
        return getAspects();
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
      case AspectLangPackage.ASPECT_MODEL__NAME:
        setName((String)newValue);
        return;
      case AspectLangPackage.ASPECT_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AspectLangPackage.ASPECT_MODEL__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends ApplicationModel>)newValue);
        return;
      case AspectLangPackage.ASPECT_MODEL__ADVICES:
        getAdvices().clear();
        getAdvices().addAll((Collection<? extends Advice>)newValue);
        return;
      case AspectLangPackage.ASPECT_MODEL__POINTCUTS:
        getPointcuts().clear();
        getPointcuts().addAll((Collection<? extends Pointcut>)newValue);
        return;
      case AspectLangPackage.ASPECT_MODEL__ASPECTS:
        getAspects().clear();
        getAspects().addAll((Collection<? extends Aspect>)newValue);
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
      case AspectLangPackage.ASPECT_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AspectLangPackage.ASPECT_MODEL__IMPORTS:
        getImports().clear();
        return;
      case AspectLangPackage.ASPECT_MODEL__SOURCES:
        getSources().clear();
        return;
      case AspectLangPackage.ASPECT_MODEL__ADVICES:
        getAdvices().clear();
        return;
      case AspectLangPackage.ASPECT_MODEL__POINTCUTS:
        getPointcuts().clear();
        return;
      case AspectLangPackage.ASPECT_MODEL__ASPECTS:
        getAspects().clear();
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
      case AspectLangPackage.ASPECT_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AspectLangPackage.ASPECT_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AspectLangPackage.ASPECT_MODEL__SOURCES:
        return sources != null && !sources.isEmpty();
      case AspectLangPackage.ASPECT_MODEL__ADVICES:
        return advices != null && !advices.isEmpty();
      case AspectLangPackage.ASPECT_MODEL__POINTCUTS:
        return pointcuts != null && !pointcuts.isEmpty();
      case AspectLangPackage.ASPECT_MODEL__ASPECTS:
        return aspects != null && !aspects.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AspectModelImpl
