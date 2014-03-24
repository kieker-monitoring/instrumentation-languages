/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang.impl;

import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.applicationLang.Aspect;
import de.cau.cs.se.instrumentation.al.applicationLang.MetaModel;
import de.cau.cs.se.instrumentation.al.applicationLang.Model;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ModelImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodels()
   * @generated
   * @ordered
   */
  protected EList<MetaModel> metamodels;

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
  protected ModelImpl()
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
    return ApplicationLangPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationLangPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetaModel> getMetamodels()
  {
    if (metamodels == null)
    {
      metamodels = new EObjectContainmentEList<MetaModel>(MetaModel.class, this, ApplicationLangPackage.MODEL__METAMODELS);
    }
    return metamodels;
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
      sources = new EObjectContainmentEList<ApplicationModel>(ApplicationModel.class, this, ApplicationLangPackage.MODEL__SOURCES);
    }
    return sources;
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
      aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, ApplicationLangPackage.MODEL__ASPECTS);
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
      case ApplicationLangPackage.MODEL__METAMODELS:
        return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
      case ApplicationLangPackage.MODEL__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
      case ApplicationLangPackage.MODEL__ASPECTS:
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
      case ApplicationLangPackage.MODEL__NAME:
        return getName();
      case ApplicationLangPackage.MODEL__METAMODELS:
        return getMetamodels();
      case ApplicationLangPackage.MODEL__SOURCES:
        return getSources();
      case ApplicationLangPackage.MODEL__ASPECTS:
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
      case ApplicationLangPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case ApplicationLangPackage.MODEL__METAMODELS:
        getMetamodels().clear();
        getMetamodels().addAll((Collection<? extends MetaModel>)newValue);
        return;
      case ApplicationLangPackage.MODEL__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends ApplicationModel>)newValue);
        return;
      case ApplicationLangPackage.MODEL__ASPECTS:
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
      case ApplicationLangPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApplicationLangPackage.MODEL__METAMODELS:
        getMetamodels().clear();
        return;
      case ApplicationLangPackage.MODEL__SOURCES:
        getSources().clear();
        return;
      case ApplicationLangPackage.MODEL__ASPECTS:
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
      case ApplicationLangPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApplicationLangPackage.MODEL__METAMODELS:
        return metamodels != null && !metamodels.isEmpty();
      case ApplicationLangPackage.MODEL__SOURCES:
        return sources != null && !sources.isEmpty();
      case ApplicationLangPackage.MODEL__ASPECTS:
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

} //ModelImpl
