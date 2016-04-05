/**
 */
package kieker.tools.al.aspectLang.impl;

import kieker.tools.al.aspectLang.AdviceParameter;
import kieker.tools.al.aspectLang.AdviceParameterDeclaration;
import kieker.tools.al.aspectLang.AspectLangPackage;
import kieker.tools.al.aspectLang.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.impl.AdviceParameterImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.AdviceParameterImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviceParameterImpl extends ValueImpl implements AdviceParameter
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected AdviceParameterDeclaration declaration;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected Value collection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdviceParameterImpl()
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
    return AspectLangPackage.Literals.ADVICE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceParameterDeclaration getDeclaration()
  {
    if (declaration != null && declaration.eIsProxy())
    {
      InternalEObject oldDeclaration = (InternalEObject)declaration;
      declaration = (AdviceParameterDeclaration)eResolveProxy(oldDeclaration);
      if (declaration != oldDeclaration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.ADVICE_PARAMETER__DECLARATION, oldDeclaration, declaration));
      }
    }
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceParameterDeclaration basicGetDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(AdviceParameterDeclaration newDeclaration)
  {
    AdviceParameterDeclaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.ADVICE_PARAMETER__DECLARATION, oldDeclaration, declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollection(Value newCollection, NotificationChain msgs)
  {
    Value oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.ADVICE_PARAMETER__COLLECTION, oldCollection, newCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(Value newCollection)
  {
    if (newCollection != collection)
    {
      NotificationChain msgs = null;
      if (collection != null)
        msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.ADVICE_PARAMETER__COLLECTION, null, msgs);
      if (newCollection != null)
        msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.ADVICE_PARAMETER__COLLECTION, null, msgs);
      msgs = basicSetCollection(newCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.ADVICE_PARAMETER__COLLECTION, newCollection, newCollection));
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
      case AspectLangPackage.ADVICE_PARAMETER__COLLECTION:
        return basicSetCollection(null, msgs);
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
      case AspectLangPackage.ADVICE_PARAMETER__DECLARATION:
        if (resolve) return getDeclaration();
        return basicGetDeclaration();
      case AspectLangPackage.ADVICE_PARAMETER__COLLECTION:
        return getCollection();
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
      case AspectLangPackage.ADVICE_PARAMETER__DECLARATION:
        setDeclaration((AdviceParameterDeclaration)newValue);
        return;
      case AspectLangPackage.ADVICE_PARAMETER__COLLECTION:
        setCollection((Value)newValue);
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
      case AspectLangPackage.ADVICE_PARAMETER__DECLARATION:
        setDeclaration((AdviceParameterDeclaration)null);
        return;
      case AspectLangPackage.ADVICE_PARAMETER__COLLECTION:
        setCollection((Value)null);
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
      case AspectLangPackage.ADVICE_PARAMETER__DECLARATION:
        return declaration != null;
      case AspectLangPackage.ADVICE_PARAMETER__COLLECTION:
        return collection != null;
    }
    return super.eIsSet(featureID);
  }

} //AdviceParameterImpl
