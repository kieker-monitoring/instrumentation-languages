/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.impl.ForeignKeyImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.impl.ForeignKeyImpl#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey
{
  /**
   * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordType()
   * @generated
   * @ordered
   */
  protected RecordType recordType;

  /**
   * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyRef()
   * @generated
   * @ordered
   */
  protected Property propertyRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeignKeyImpl()
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
    return RecordLangPackage.Literals.FOREIGN_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecordType()
  {
    if (recordType != null && recordType.eIsProxy())
    {
      InternalEObject oldRecordType = (InternalEObject)recordType;
      recordType = (RecordType)eResolveProxy(oldRecordType);
      if (recordType != oldRecordType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.FOREIGN_KEY__RECORD_TYPE, oldRecordType, recordType));
      }
    }
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType basicGetRecordType()
  {
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordType(RecordType newRecordType)
  {
    RecordType oldRecordType = recordType;
    recordType = newRecordType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.FOREIGN_KEY__RECORD_TYPE, oldRecordType, recordType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getPropertyRef()
  {
    if (propertyRef != null && propertyRef.eIsProxy())
    {
      InternalEObject oldPropertyRef = (InternalEObject)propertyRef;
      propertyRef = (Property)eResolveProxy(oldPropertyRef);
      if (propertyRef != oldPropertyRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.FOREIGN_KEY__PROPERTY_REF, oldPropertyRef, propertyRef));
      }
    }
    return propertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetPropertyRef()
  {
    return propertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyRef(Property newPropertyRef)
  {
    Property oldPropertyRef = propertyRef;
    propertyRef = newPropertyRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.FOREIGN_KEY__PROPERTY_REF, oldPropertyRef, propertyRef));
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
      case RecordLangPackage.FOREIGN_KEY__RECORD_TYPE:
        if (resolve) return getRecordType();
        return basicGetRecordType();
      case RecordLangPackage.FOREIGN_KEY__PROPERTY_REF:
        if (resolve) return getPropertyRef();
        return basicGetPropertyRef();
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
      case RecordLangPackage.FOREIGN_KEY__RECORD_TYPE:
        setRecordType((RecordType)newValue);
        return;
      case RecordLangPackage.FOREIGN_KEY__PROPERTY_REF:
        setPropertyRef((Property)newValue);
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
      case RecordLangPackage.FOREIGN_KEY__RECORD_TYPE:
        setRecordType((RecordType)null);
        return;
      case RecordLangPackage.FOREIGN_KEY__PROPERTY_REF:
        setPropertyRef((Property)null);
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
      case RecordLangPackage.FOREIGN_KEY__RECORD_TYPE:
        return recordType != null;
      case RecordLangPackage.FOREIGN_KEY__PROPERTY_REF:
        return propertyRef != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeignKeyImpl
