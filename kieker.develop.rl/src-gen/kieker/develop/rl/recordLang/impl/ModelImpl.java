/**
 */
package kieker.develop.rl.recordLang.impl;

import java.util.Collection;

import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.recordLang.Import;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.RecordLangPackage;
import kieker.develop.rl.recordLang.Schema;

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
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ModelImpl#getSchemes <em>Schemes</em>}</li>
 * </ul>
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<ComplexType> types;

  /**
   * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemes()
   * @generated
   * @ordered
   */
  protected EList<Schema> schemes;

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
    return RecordLangPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.MODEL__NAME, oldName, name));
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, RecordLangPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, RecordLangPackage.MODEL__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Schema> getSchemes()
  {
    if (schemes == null)
    {
      schemes = new EObjectContainmentEList<Schema>(Schema.class, this, RecordLangPackage.MODEL__SCHEMES);
    }
    return schemes;
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
      case RecordLangPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RecordLangPackage.MODEL__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case RecordLangPackage.MODEL__SCHEMES:
        return ((InternalEList<?>)getSchemes()).basicRemove(otherEnd, msgs);
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
      case RecordLangPackage.MODEL__NAME:
        return getName();
      case RecordLangPackage.MODEL__IMPORTS:
        return getImports();
      case RecordLangPackage.MODEL__TYPES:
        return getTypes();
      case RecordLangPackage.MODEL__SCHEMES:
        return getSchemes();
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
      case RecordLangPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case RecordLangPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case RecordLangPackage.MODEL__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends ComplexType>)newValue);
        return;
      case RecordLangPackage.MODEL__SCHEMES:
        getSchemes().clear();
        getSchemes().addAll((Collection<? extends Schema>)newValue);
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
      case RecordLangPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RecordLangPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case RecordLangPackage.MODEL__TYPES:
        getTypes().clear();
        return;
      case RecordLangPackage.MODEL__SCHEMES:
        getSchemes().clear();
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
      case RecordLangPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RecordLangPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RecordLangPackage.MODEL__TYPES:
        return types != null && !types.isEmpty();
      case RecordLangPackage.MODEL__SCHEMES:
        return schemes != null && !schemes.isEmpty();
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
