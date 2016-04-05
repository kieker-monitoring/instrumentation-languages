/**
 */
package kieker.develop.al.aspectLang.impl;

import kieker.develop.al.aspectLang.AspectLangPackage;
import kieker.develop.al.aspectLang.CompareOperator;
import kieker.develop.al.aspectLang.ConstraintElement;
import kieker.develop.al.aspectLang.Literal;
import kieker.develop.al.aspectLang.LogicOperator;
import kieker.develop.al.aspectLang.PropertyConstraint;
import kieker.develop.al.aspectLang.PropertyConstraintCompare;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.impl.LiteralImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.LiteralImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.LiteralImpl#getRight <em>Right</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.LiteralImpl#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralImpl extends ValueImpl implements Literal
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
  protected LiteralImpl()
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
    return AspectLangPackage.Literals.LITERAL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LITERAL__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LITERAL__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__LOGIC, oldLogic, logic));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LITERAL__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.LITERAL__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__RIGHT, newRight, newRight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.LITERAL__COMPARE, oldCompare, compare));
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
      case AspectLangPackage.LITERAL__LEFT:
        return basicSetLeft(null, msgs);
      case AspectLangPackage.LITERAL__RIGHT:
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
      case AspectLangPackage.LITERAL__LEFT:
        return getLeft();
      case AspectLangPackage.LITERAL__LOGIC:
        return getLogic();
      case AspectLangPackage.LITERAL__RIGHT:
        return getRight();
      case AspectLangPackage.LITERAL__COMPARE:
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
      case AspectLangPackage.LITERAL__LEFT:
        setLeft((PropertyConstraintCompare)newValue);
        return;
      case AspectLangPackage.LITERAL__LOGIC:
        setLogic((LogicOperator)newValue);
        return;
      case AspectLangPackage.LITERAL__RIGHT:
        setRight((PropertyConstraintCompare)newValue);
        return;
      case AspectLangPackage.LITERAL__COMPARE:
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
      case AspectLangPackage.LITERAL__LEFT:
        setLeft((PropertyConstraintCompare)null);
        return;
      case AspectLangPackage.LITERAL__LOGIC:
        setLogic(LOGIC_EDEFAULT);
        return;
      case AspectLangPackage.LITERAL__RIGHT:
        setRight((PropertyConstraintCompare)null);
        return;
      case AspectLangPackage.LITERAL__COMPARE:
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
      case AspectLangPackage.LITERAL__LEFT:
        return left != null;
      case AspectLangPackage.LITERAL__LOGIC:
        return logic != LOGIC_EDEFAULT;
      case AspectLangPackage.LITERAL__RIGHT:
        return right != null;
      case AspectLangPackage.LITERAL__COMPARE:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == PropertyConstraint.class)
    {
      switch (derivedFeatureID)
      {
        case AspectLangPackage.LITERAL__LEFT: return AspectLangPackage.PROPERTY_CONSTRAINT__LEFT;
        case AspectLangPackage.LITERAL__LOGIC: return AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC;
        case AspectLangPackage.LITERAL__RIGHT: return AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == PropertyConstraintCompare.class)
    {
      switch (derivedFeatureID)
      {
        case AspectLangPackage.LITERAL__COMPARE: return AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE;
        default: return -1;
      }
    }
    if (baseClass == ConstraintElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == PropertyConstraint.class)
    {
      switch (baseFeatureID)
      {
        case AspectLangPackage.PROPERTY_CONSTRAINT__LEFT: return AspectLangPackage.LITERAL__LEFT;
        case AspectLangPackage.PROPERTY_CONSTRAINT__LOGIC: return AspectLangPackage.LITERAL__LOGIC;
        case AspectLangPackage.PROPERTY_CONSTRAINT__RIGHT: return AspectLangPackage.LITERAL__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == PropertyConstraintCompare.class)
    {
      switch (baseFeatureID)
      {
        case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE: return AspectLangPackage.LITERAL__COMPARE;
        default: return -1;
      }
    }
    if (baseClass == ConstraintElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //LiteralImpl
