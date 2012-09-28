/**
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.Import;
import de.cau.se.instrumentation.language.probeLang.Model;
import de.cau.se.instrumentation.language.probeLang.Pattern;
import de.cau.se.instrumentation.language.probeLang.Probe;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;

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
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ModelImpl#getProbes <em>Probes</em>}</li>
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
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<de.cau.se.instrumentation.language.probeLang.Package> packages;

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
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected EList<Pattern> patterns;

  /**
   * The cached value of the '{@link #getProbes() <em>Probes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbes()
   * @generated
   * @ordered
   */
  protected EList<Probe> probes;

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
    return ProbeLangPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.cau.se.instrumentation.language.probeLang.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<de.cau.se.instrumentation.language.probeLang.Package>(de.cau.se.instrumentation.language.probeLang.Package.class, this, ProbeLangPackage.MODEL__PACKAGES);
    }
    return packages;
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, ProbeLangPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pattern> getPatterns()
  {
    if (patterns == null)
    {
      patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, ProbeLangPackage.MODEL__PATTERNS);
    }
    return patterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Probe> getProbes()
  {
    if (probes == null)
    {
      probes = new EObjectContainmentEList<Probe>(Probe.class, this, ProbeLangPackage.MODEL__PROBES);
    }
    return probes;
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
      case ProbeLangPackage.MODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case ProbeLangPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ProbeLangPackage.MODEL__PATTERNS:
        return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
      case ProbeLangPackage.MODEL__PROBES:
        return ((InternalEList<?>)getProbes()).basicRemove(otherEnd, msgs);
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
      case ProbeLangPackage.MODEL__NAME:
        return getName();
      case ProbeLangPackage.MODEL__PACKAGES:
        return getPackages();
      case ProbeLangPackage.MODEL__IMPORTS:
        return getImports();
      case ProbeLangPackage.MODEL__PATTERNS:
        return getPatterns();
      case ProbeLangPackage.MODEL__PROBES:
        return getProbes();
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
      case ProbeLangPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case ProbeLangPackage.MODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends de.cau.se.instrumentation.language.probeLang.Package>)newValue);
        return;
      case ProbeLangPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ProbeLangPackage.MODEL__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends Pattern>)newValue);
        return;
      case ProbeLangPackage.MODEL__PROBES:
        getProbes().clear();
        getProbes().addAll((Collection<? extends Probe>)newValue);
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
      case ProbeLangPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProbeLangPackage.MODEL__PACKAGES:
        getPackages().clear();
        return;
      case ProbeLangPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case ProbeLangPackage.MODEL__PATTERNS:
        getPatterns().clear();
        return;
      case ProbeLangPackage.MODEL__PROBES:
        getProbes().clear();
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
      case ProbeLangPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProbeLangPackage.MODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
      case ProbeLangPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ProbeLangPackage.MODEL__PATTERNS:
        return patterns != null && !patterns.isEmpty();
      case ProbeLangPackage.MODEL__PROBES:
        return probes != null && !probes.isEmpty();
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
