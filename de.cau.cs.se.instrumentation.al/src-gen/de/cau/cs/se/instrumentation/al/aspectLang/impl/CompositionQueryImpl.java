/**
 */
package kieker.tools.al.aspectLang.impl;

import kieker.tools.al.aspectLang.AspectLangPackage;
import kieker.tools.al.aspectLang.CompositionQuery;
import kieker.tools.al.aspectLang.LocationQuery;
import kieker.tools.al.aspectLang.QueryModifier;

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
 * An implementation of the model object '<em><b>Composition Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.impl.CompositionQueryImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.CompositionQueryImpl#getSubQueries <em>Sub Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionQueryImpl extends MinimalEObjectImpl.Container implements CompositionQuery
{
  /**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected static final QueryModifier MODIFIER_EDEFAULT = QueryModifier.INCLUDE;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected QueryModifier modifier = MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubQueries() <em>Sub Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubQueries()
   * @generated
   * @ordered
   */
  protected EList<LocationQuery> subQueries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositionQueryImpl()
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
    return AspectLangPackage.Literals.COMPOSITION_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryModifier getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(QueryModifier newModifier)
  {
    QueryModifier oldModifier = modifier;
    modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.COMPOSITION_QUERY__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocationQuery> getSubQueries()
  {
    if (subQueries == null)
    {
      subQueries = new EObjectContainmentEList<LocationQuery>(LocationQuery.class, this, AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES);
    }
    return subQueries;
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
      case AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES:
        return ((InternalEList<?>)getSubQueries()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.COMPOSITION_QUERY__MODIFIER:
        return getModifier();
      case AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES:
        return getSubQueries();
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
      case AspectLangPackage.COMPOSITION_QUERY__MODIFIER:
        setModifier((QueryModifier)newValue);
        return;
      case AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES:
        getSubQueries().clear();
        getSubQueries().addAll((Collection<? extends LocationQuery>)newValue);
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
      case AspectLangPackage.COMPOSITION_QUERY__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES:
        getSubQueries().clear();
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
      case AspectLangPackage.COMPOSITION_QUERY__MODIFIER:
        return modifier != MODIFIER_EDEFAULT;
      case AspectLangPackage.COMPOSITION_QUERY__SUB_QUERIES:
        return subQueries != null && !subQueries.isEmpty();
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
    result.append(" (modifier: ");
    result.append(modifier);
    result.append(')');
    return result.toString();
  }

} //CompositionQueryImpl
