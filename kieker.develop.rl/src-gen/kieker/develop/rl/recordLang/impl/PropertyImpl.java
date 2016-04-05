/**
 */
package kieker.develop.rl.recordLang.impl;

import java.util.Collection;

import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.ForeignKey;
import kieker.develop.rl.recordLang.Literal;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.PropertyModifier;
import kieker.develop.rl.recordLang.RecordLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getReferTo <em>Refer To</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.PropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<PropertyModifier> modifiers;

  /**
   * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKey()
   * @generated
   * @ordered
   */
  protected ForeignKey foreignKey;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Classifier type;

  /**
   * The cached value of the '{@link #getReferTo() <em>Refer To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferTo()
   * @generated
   * @ordered
   */
  protected Property referTo;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Literal value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return RecordLangPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyModifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EDataTypeEList<PropertyModifier>(PropertyModifier.class, this, RecordLangPackage.PROPERTY__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey getForeignKey()
  {
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeignKey(ForeignKey newForeignKey, NotificationChain msgs)
  {
    ForeignKey oldForeignKey = foreignKey;
    foreignKey = newForeignKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__FOREIGN_KEY, oldForeignKey, newForeignKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignKey(ForeignKey newForeignKey)
  {
    if (newForeignKey != foreignKey)
    {
      NotificationChain msgs = null;
      if (foreignKey != null)
        msgs = ((InternalEObject)foreignKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__FOREIGN_KEY, null, msgs);
      if (newForeignKey != null)
        msgs = ((InternalEObject)newForeignKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__FOREIGN_KEY, null, msgs);
      msgs = basicSetForeignKey(newForeignKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__FOREIGN_KEY, newForeignKey, newForeignKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Classifier newType, NotificationChain msgs)
  {
    Classifier oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Classifier newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getReferTo()
  {
    if (referTo != null && referTo.eIsProxy())
    {
      InternalEObject oldReferTo = (InternalEObject)referTo;
      referTo = (Property)eResolveProxy(oldReferTo);
      if (referTo != oldReferTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.PROPERTY__REFER_TO, oldReferTo, referTo));
      }
    }
    return referTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetReferTo()
  {
    return referTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferTo(Property newReferTo)
  {
    Property oldReferTo = referTo;
    referTo = newReferTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__REFER_TO, oldReferTo, referTo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Literal newValue, NotificationChain msgs)
  {
    Literal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Literal newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.PROPERTY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.PROPERTY__VALUE, newValue, newValue));
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
      case RecordLangPackage.PROPERTY__FOREIGN_KEY:
        return basicSetForeignKey(null, msgs);
      case RecordLangPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
      case RecordLangPackage.PROPERTY__VALUE:
        return basicSetValue(null, msgs);
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
      case RecordLangPackage.PROPERTY__MODIFIERS:
        return getModifiers();
      case RecordLangPackage.PROPERTY__FOREIGN_KEY:
        return getForeignKey();
      case RecordLangPackage.PROPERTY__TYPE:
        return getType();
      case RecordLangPackage.PROPERTY__REFER_TO:
        if (resolve) return getReferTo();
        return basicGetReferTo();
      case RecordLangPackage.PROPERTY__NAME:
        return getName();
      case RecordLangPackage.PROPERTY__VALUE:
        return getValue();
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
      case RecordLangPackage.PROPERTY__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends PropertyModifier>)newValue);
        return;
      case RecordLangPackage.PROPERTY__FOREIGN_KEY:
        setForeignKey((ForeignKey)newValue);
        return;
      case RecordLangPackage.PROPERTY__TYPE:
        setType((Classifier)newValue);
        return;
      case RecordLangPackage.PROPERTY__REFER_TO:
        setReferTo((Property)newValue);
        return;
      case RecordLangPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case RecordLangPackage.PROPERTY__VALUE:
        setValue((Literal)newValue);
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
      case RecordLangPackage.PROPERTY__MODIFIERS:
        getModifiers().clear();
        return;
      case RecordLangPackage.PROPERTY__FOREIGN_KEY:
        setForeignKey((ForeignKey)null);
        return;
      case RecordLangPackage.PROPERTY__TYPE:
        setType((Classifier)null);
        return;
      case RecordLangPackage.PROPERTY__REFER_TO:
        setReferTo((Property)null);
        return;
      case RecordLangPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RecordLangPackage.PROPERTY__VALUE:
        setValue((Literal)null);
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
      case RecordLangPackage.PROPERTY__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case RecordLangPackage.PROPERTY__FOREIGN_KEY:
        return foreignKey != null;
      case RecordLangPackage.PROPERTY__TYPE:
        return type != null;
      case RecordLangPackage.PROPERTY__REFER_TO:
        return referTo != null;
      case RecordLangPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RecordLangPackage.PROPERTY__VALUE:
        return value != null;
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
    result.append(" (modifiers: ");
    result.append(modifiers);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
