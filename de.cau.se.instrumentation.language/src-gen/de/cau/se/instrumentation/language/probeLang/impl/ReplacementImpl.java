/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang.impl;

import de.cau.se.instrumentation.language.probeLang.PatternCall;
import de.cau.se.instrumentation.language.probeLang.ProbeLangPackage;
import de.cau.se.instrumentation.language.probeLang.Replacement;
import de.cau.se.instrumentation.language.probeLang.Scope;

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
 * An implementation of the model object '<em><b>Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.cau.se.instrumentation.language.probeLang.impl.ReplacementImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplacementImpl extends MinimalEObjectImpl.Container implements Replacement
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
   * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected Scope scope;

  /**
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected EList<PatternCall> patterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReplacementImpl()
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
    return ProbeLangPackage.Literals.REPLACEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.REPLACEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs)
  {
    Scope oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbeLangPackage.REPLACEMENT__SCOPE, oldScope, newScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(Scope newScope)
  {
    if (newScope != scope)
    {
      NotificationChain msgs = null;
      if (scope != null)
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.REPLACEMENT__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbeLangPackage.REPLACEMENT__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProbeLangPackage.REPLACEMENT__SCOPE, newScope, newScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternCall> getPatterns()
  {
    if (patterns == null)
    {
      patterns = new EObjectContainmentEList<PatternCall>(PatternCall.class, this, ProbeLangPackage.REPLACEMENT__PATTERNS);
    }
    return patterns;
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
      case ProbeLangPackage.REPLACEMENT__SCOPE:
        return basicSetScope(null, msgs);
      case ProbeLangPackage.REPLACEMENT__PATTERNS:
        return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
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
      case ProbeLangPackage.REPLACEMENT__NAME:
        return getName();
      case ProbeLangPackage.REPLACEMENT__SCOPE:
        return getScope();
      case ProbeLangPackage.REPLACEMENT__PATTERNS:
        return getPatterns();
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
      case ProbeLangPackage.REPLACEMENT__NAME:
        setName((String)newValue);
        return;
      case ProbeLangPackage.REPLACEMENT__SCOPE:
        setScope((Scope)newValue);
        return;
      case ProbeLangPackage.REPLACEMENT__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends PatternCall>)newValue);
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
      case ProbeLangPackage.REPLACEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProbeLangPackage.REPLACEMENT__SCOPE:
        setScope((Scope)null);
        return;
      case ProbeLangPackage.REPLACEMENT__PATTERNS:
        getPatterns().clear();
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
      case ProbeLangPackage.REPLACEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProbeLangPackage.REPLACEMENT__SCOPE:
        return scope != null;
      case ProbeLangPackage.REPLACEMENT__PATTERNS:
        return patterns != null && !patterns.isEmpty();
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

} //ReplacementImpl
