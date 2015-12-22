/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator;
import de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraint;
import de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintCompare;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstraintImpl extends MinimalEObjectImpl.Container implements PropertyConstraint
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PropertyConstraintCompare left;

  /**
   * The default value of the '{@link #getLogic() <em>Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogic()
   * @generated
   * @ordered
   */
  protected static final LogicOperator LOGIC_EDEFAULT = LogicOperator.AND;

  /**
   * The cached value of the '{@link #getLogic() <em>Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogic()
   * @generated
   * @ordered
   */
  protected LogicOperator logic = LOGIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected PropertyConstraintCompare right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyConstraintImpl()
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
    return AspectLangPackage.Literals.PROPERTY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraintCompare getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PropertyConstraintCompare newLeft, NotificationChain msgs)
  {
    PropertyConstraintCompare oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(PropertyConstraintCompare newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperator getLogic()
  {
    return logic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogic(LogicOperator newLogic)
  {
    LogicOperator oldLogic = logic;
    logic = newLogic == null ? LOGIC_EDEFAULT : newLogic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC, oldLogic, logic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraintCompare getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(PropertyConstraintCompare newRight, NotificationChain msgs)
  {
    PropertyConstraintCompare oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(PropertyConstraintCompare newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT, newRight, newRight));
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
      case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return basicSetLeft(null, msgs);
      case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return basicSetRight(null, msgs);
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
      case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return getLeft();
      case AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC:
        return getLogic();
      case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return getRight();
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
      case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT:
        setLeft((PropertyConstraintCompare)newValue);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC:
        setLogic((LogicOperator)newValue);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        setRight((PropertyConstraintCompare)newValue);
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
      case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT:
        setLeft((PropertyConstraintCompare)null);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC:
        setLogic(LOGIC_EDEFAULT);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        setRight((PropertyConstraintCompare)null);
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
      case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return left != null;
      case AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC:
        return logic != LOGIC_EDEFAULT;
      case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return right != null;
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
    result.append(" (logic: ");
    result.append(logic);
    result.append(')');
    return result.toString();
  }

} //PropertyConstraintImpl
