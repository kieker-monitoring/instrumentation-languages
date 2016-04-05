/**
 */
package kieker.tools.al.aspectLang.impl;

import kieker.tools.al.aspectLang.AspectLangPackage;
import kieker.tools.al.aspectLang.CompareOperator;
import kieker.tools.al.aspectLang.PropertyConstraintCompare;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constraint Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.impl.PropertyConstraintCompareImpl#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstraintCompareImpl extends PropertyConstraintImpl implements PropertyConstraintCompare
{
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
  protected PropertyConstraintCompareImpl()
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
    return AspectLangPackage.Literals.PROPERTY_CONSTRAINT_COMPARE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE, oldCompare, compare));
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE:
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE:
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE:
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
      case AspectLangPackage.PROPERTY_CONSTRAINT_COMPARE__COMPARE:
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
    result.append(" (compare: ");
    result.append(compare);
    result.append(')');
    return result.toString();
  }

} //PropertyConstraintCompareImpl
