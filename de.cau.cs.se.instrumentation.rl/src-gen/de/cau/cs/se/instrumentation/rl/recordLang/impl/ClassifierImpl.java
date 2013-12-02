/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.impl.ClassifierImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.impl.ClassifierImpl#getSizes <em>Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends MinimalEObjectImpl.Container implements Classifier
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected de.cau.cs.se.instrumentation.rl.recordLang.Package package_;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EClassifier class_;

  /**
   * The cached value of the '{@link #getSizes() <em>Sizes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizes()
   * @generated
   * @ordered
   */
  protected EList<ArraySize> sizes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierImpl()
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
    return RecordLangPackage.Literals.CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumentation.rl.recordLang.Package getPackage()
  {
    if (package_ != null && package_.eIsProxy())
    {
      InternalEObject oldPackage = (InternalEObject)package_;
      package_ = (de.cau.cs.se.instrumentation.rl.recordLang.Package)eResolveProxy(oldPackage);
      if (package_ != oldPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
      }
    }
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumentation.rl.recordLang.Package basicGetPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(de.cau.cs.se.instrumentation.rl.recordLang.Package newPackage)
  {
    de.cau.cs.se.instrumentation.rl.recordLang.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (EClassifier)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordLangPackage.CLASSIFIER__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(EClassifier newClass)
  {
    EClassifier oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.CLASSIFIER__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySize> getSizes()
  {
    if (sizes == null)
    {
      sizes = new EObjectContainmentEList<ArraySize>(ArraySize.class, this, RecordLangPackage.CLASSIFIER__SIZES);
    }
    return sizes;
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
      case RecordLangPackage.CLASSIFIER__SIZES:
        return ((InternalEList<?>)getSizes()).basicRemove(otherEnd, msgs);
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
      case RecordLangPackage.CLASSIFIER__PACKAGE:
        if (resolve) return getPackage();
        return basicGetPackage();
      case RecordLangPackage.CLASSIFIER__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case RecordLangPackage.CLASSIFIER__SIZES:
        return getSizes();
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
      case RecordLangPackage.CLASSIFIER__PACKAGE:
        setPackage((de.cau.cs.se.instrumentation.rl.recordLang.Package)newValue);
        return;
      case RecordLangPackage.CLASSIFIER__CLASS:
        setClass((EClassifier)newValue);
        return;
      case RecordLangPackage.CLASSIFIER__SIZES:
        getSizes().clear();
        getSizes().addAll((Collection<? extends ArraySize>)newValue);
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
      case RecordLangPackage.CLASSIFIER__PACKAGE:
        setPackage((de.cau.cs.se.instrumentation.rl.recordLang.Package)null);
        return;
      case RecordLangPackage.CLASSIFIER__CLASS:
        setClass((EClassifier)null);
        return;
      case RecordLangPackage.CLASSIFIER__SIZES:
        getSizes().clear();
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
      case RecordLangPackage.CLASSIFIER__PACKAGE:
        return package_ != null;
      case RecordLangPackage.CLASSIFIER__CLASS:
        return class_ != null;
      case RecordLangPackage.CLASSIFIER__SIZES:
        return sizes != null && !sizes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassifierImpl
