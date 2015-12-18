/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.CompareOperator;
import de.cau.cs.se.instrumentation.al.aspectLang.LogicOperator;
import de.cau.cs.se.instrumentation.al.aspectLang.PropertyConstraintExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintExpressionImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.PropertyConstraintExpressionImpl#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstraintExpressionImpl extends MinimalEObjectImpl.Container implements PropertyConstraintExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PropertyConstraintExpression left;

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
  protected PropertyConstraintExpression right;

  /**
   * The default value of the '{@link #getCompare() <em>Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompare()
   * @generated
   * @ordered
   */
  protected static final CompareOperator COMPARE_EDEFAULT = CompareOperator.EQ;

  /**
   * The cached value of the '{@link #getCompare() <em>Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompare()
   * @generated
   * @ordered
   */
  protected CompareOperator compare = COMPARE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyConstraintExpressionImpl()
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
    return AspectLangPackage.Literals.PROPERTY_CONSTRAINT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraintExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PropertyConstraintExpression newLeft, NotificationChain msgs)
  {
    PropertyConstraintExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(PropertyConstraintExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LOGIC, oldLogic, logic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraintExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(PropertyConstraintExpression newRight, NotificationChain msgs)
  {
    PropertyConstraintExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(PropertyConstraintExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator getCompare()
  {
    return compare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompare(CompareOperator newCompare)
  {
    CompareOperator oldCompare = compare;
    compare = newCompare == null ? COMPARE_EDEFAULT : newCompare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__COMPARE, oldCompare, compare));
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT:
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT:
        return getLeft();
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LOGIC:
        return getLogic();
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT:
        return getRight();
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__COMPARE:
        return getCompare();
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT:
        setLeft((PropertyConstraintExpression)newValue);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LOGIC:
        setLogic((LogicOperator)newValue);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT:
        setRight((PropertyConstraintExpression)newValue);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__COMPARE:
        setCompare((CompareOperator)newValue);
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT:
        setLeft((PropertyConstraintExpression)null);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LOGIC:
        setLogic(LOGIC_EDEFAULT);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT:
        setRight((PropertyConstraintExpression)null);
        return;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__COMPARE:
        setCompare(COMPARE_EDEFAULT);
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LEFT:
        return left != null;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__LOGIC:
        return logic != LOGIC_EDEFAULT;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__RIGHT:
        return right != null;
      case AspectLangPackage.PROPERTY_CONSTRAINT_EXPRESSION__COMPARE:
        return compare != COMPARE_EDEFAULT;
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
    result.append(", compare: ");
    result.append(compare);
    result.append(')');
    return result.toString();
  }

} //PropertyConstraintExpressionImpl
