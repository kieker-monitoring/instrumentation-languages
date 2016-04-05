/**
 */
package kieker.develop.rl.recordLang.impl;

import java.util.Collection;

import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.recordLang.Constant;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordLangPackage;
import kieker.develop.rl.recordLang.TemplateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl#getSince <em>Since</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends TypeImpl implements ComplexType
{
  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected static final String SINCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected String since = SINCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<TemplateType> parents;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<Constant> constants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexTypeImpl()
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
    return RecordLangPackage.Literals.COMPLEX_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.COMPLEX_TYPE__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSince()
  {
    return since;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSince(String newSince)
  {
    String oldSince = since;
    since = newSince;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.COMPLEX_TYPE__SINCE, oldSince, since));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateType> getParents()
  {
    if (parents == null)
    {
      parents = new EObjectResolvingEList<TemplateType>(TemplateType.class, this, RecordLangPackage.COMPLEX_TYPE__PARENTS);
    }
    return parents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, RecordLangPackage.COMPLEX_TYPE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constant> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<Constant>(Constant.class, this, RecordLangPackage.COMPLEX_TYPE__CONSTANTS);
    }
    return constants;
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
      case RecordLangPackage.COMPLEX_TYPE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RecordLangPackage.COMPLEX_TYPE__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
      case RecordLangPackage.COMPLEX_TYPE__AUTHOR:
        return getAuthor();
      case RecordLangPackage.COMPLEX_TYPE__SINCE:
        return getSince();
      case RecordLangPackage.COMPLEX_TYPE__PARENTS:
        return getParents();
      case RecordLangPackage.COMPLEX_TYPE__PROPERTIES:
        return getProperties();
      case RecordLangPackage.COMPLEX_TYPE__CONSTANTS:
        return getConstants();
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
      case RecordLangPackage.COMPLEX_TYPE__AUTHOR:
        setAuthor((String)newValue);
        return;
      case RecordLangPackage.COMPLEX_TYPE__SINCE:
        setSince((String)newValue);
        return;
      case RecordLangPackage.COMPLEX_TYPE__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends TemplateType>)newValue);
        return;
      case RecordLangPackage.COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case RecordLangPackage.COMPLEX_TYPE__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends Constant>)newValue);
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
      case RecordLangPackage.COMPLEX_TYPE__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case RecordLangPackage.COMPLEX_TYPE__SINCE:
        setSince(SINCE_EDEFAULT);
        return;
      case RecordLangPackage.COMPLEX_TYPE__PARENTS:
        getParents().clear();
        return;
      case RecordLangPackage.COMPLEX_TYPE__PROPERTIES:
        getProperties().clear();
        return;
      case RecordLangPackage.COMPLEX_TYPE__CONSTANTS:
        getConstants().clear();
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
      case RecordLangPackage.COMPLEX_TYPE__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case RecordLangPackage.COMPLEX_TYPE__SINCE:
        return SINCE_EDEFAULT == null ? since != null : !SINCE_EDEFAULT.equals(since);
      case RecordLangPackage.COMPLEX_TYPE__PARENTS:
        return parents != null && !parents.isEmpty();
      case RecordLangPackage.COMPLEX_TYPE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RecordLangPackage.COMPLEX_TYPE__CONSTANTS:
        return constants != null && !constants.isEmpty();
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
    result.append(" (author: ");
    result.append(author);
    result.append(", since: ");
    result.append(since);
    result.append(')');
    return result.toString();
  }

} //ComplexTypeImpl
