/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration;
import de.cau.cs.se.instrumentation.al.aspectLang.Probe;

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
 * An implementation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ProbeImpl#getCollectors <em>Collectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbeImpl extends MinimalEObjectImpl.Container implements Probe
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
   * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ParameterDeclaration> parameterDeclarations;

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
  protected ProbeImpl()
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
    return AspectLangPackage.Literals.PROBE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROBE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDeclaration> getParameterDeclarations()
  {
    if (parameterDeclarations == null)
    {
      parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, AspectLangPackage.PROBE__PARAMETER_DECLARATIONS);
    }
    return parameterDeclarations;
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
      collectors = new EObjectContainmentEList<Collector>(Collector.class, this, AspectLangPackage.PROBE__COLLECTORS);
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
      case AspectLangPackage.PROBE__PARAMETER_DECLARATIONS:
        return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
      case AspectLangPackage.PROBE__COLLECTORS:
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
      case AspectLangPackage.PROBE__NAME:
        return getName();
      case AspectLangPackage.PROBE__PARAMETER_DECLARATIONS:
        return getParameterDeclarations();
      case AspectLangPackage.PROBE__COLLECTORS:
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
      case AspectLangPackage.PROBE__NAME:
        setName((String)newValue);
        return;
      case AspectLangPackage.PROBE__PARAMETER_DECLARATIONS:
        getParameterDeclarations().clear();
        getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
        return;
      case AspectLangPackage.PROBE__COLLECTORS:
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
      case AspectLangPackage.PROBE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AspectLangPackage.PROBE__PARAMETER_DECLARATIONS:
        getParameterDeclarations().clear();
        return;
      case AspectLangPackage.PROBE__COLLECTORS:
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
      case AspectLangPackage.PROBE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AspectLangPackage.PROBE__PARAMETER_DECLARATIONS:
        return parameterDeclarations != null && !parameterDeclarations.isEmpty();
      case AspectLangPackage.PROBE__COLLECTORS:
        return collectors != null && !collectors.isEmpty();
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

} //ProbeImpl
