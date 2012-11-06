/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation.impl;

import de.cau.cs.se.instrumentation.language.instrumentation.Classifier;
import de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.impl.ClassifierImpl#getClass_ <em>Class</em>}</li>
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
  protected de.cau.cs.se.instrumentation.language.instrumentation.Package package_;

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
    return InstrumentationPackage.Literals.CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumentation.language.instrumentation.Package getPackage()
  {
    if (package_ != null && package_.eIsProxy())
    {
      InternalEObject oldPackage = (InternalEObject)package_;
      package_ = (de.cau.cs.se.instrumentation.language.instrumentation.Package)eResolveProxy(oldPackage);
      if (package_ != oldPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrumentationPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
      }
    }
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumentation.language.instrumentation.Package basicGetPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(de.cau.cs.se.instrumentation.language.instrumentation.Package newPackage)
  {
    de.cau.cs.se.instrumentation.language.instrumentation.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstrumentationPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrumentationPackage.CLASSIFIER__CLASS, oldClass, class_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, InstrumentationPackage.CLASSIFIER__CLASS, oldClass, class_));
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
      case InstrumentationPackage.CLASSIFIER__PACKAGE:
        if (resolve) return getPackage();
        return basicGetPackage();
      case InstrumentationPackage.CLASSIFIER__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
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
      case InstrumentationPackage.CLASSIFIER__PACKAGE:
        setPackage((de.cau.cs.se.instrumentation.language.instrumentation.Package)newValue);
        return;
      case InstrumentationPackage.CLASSIFIER__CLASS:
        setClass((EClassifier)newValue);
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
      case InstrumentationPackage.CLASSIFIER__PACKAGE:
        setPackage((de.cau.cs.se.instrumentation.language.instrumentation.Package)null);
        return;
      case InstrumentationPackage.CLASSIFIER__CLASS:
        setClass((EClassifier)null);
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
      case InstrumentationPackage.CLASSIFIER__PACKAGE:
        return package_ != null;
      case InstrumentationPackage.CLASSIFIER__CLASS:
        return class_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassifierImpl
