/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.TypeReference;

import de.cau.cs.se.instrumentation.al.mapping.NamedType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.TypeReferenceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.TypeReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.TypeReferenceImpl#isCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected ApplicationModel context;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected NamedType reference;

  /**
   * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected static final boolean COLLECTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected boolean collection = COLLECTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeReferenceImpl()
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
    return AspectLangPackage.Literals.TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationModel getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (ApplicationModel)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.TYPE_REFERENCE__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationModel basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(ApplicationModel newContext)
  {
    ApplicationModel oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.TYPE_REFERENCE__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (NamedType)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.TYPE_REFERENCE__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(NamedType newReference)
  {
    NamedType oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.TYPE_REFERENCE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(boolean newCollection)
  {
    boolean oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.TYPE_REFERENCE__COLLECTION, oldCollection, collection));
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
      case AspectLangPackage.TYPE_REFERENCE__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case AspectLangPackage.TYPE_REFERENCE__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case AspectLangPackage.TYPE_REFERENCE__COLLECTION:
        return isCollection();
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
      case AspectLangPackage.TYPE_REFERENCE__CONTEXT:
        setContext((ApplicationModel)newValue);
        return;
      case AspectLangPackage.TYPE_REFERENCE__REFERENCE:
        setReference((NamedType)newValue);
        return;
      case AspectLangPackage.TYPE_REFERENCE__COLLECTION:
        setCollection((Boolean)newValue);
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
      case AspectLangPackage.TYPE_REFERENCE__CONTEXT:
        setContext((ApplicationModel)null);
        return;
      case AspectLangPackage.TYPE_REFERENCE__REFERENCE:
        setReference((NamedType)null);
        return;
      case AspectLangPackage.TYPE_REFERENCE__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
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
      case AspectLangPackage.TYPE_REFERENCE__CONTEXT:
        return context != null;
      case AspectLangPackage.TYPE_REFERENCE__REFERENCE:
        return reference != null;
      case AspectLangPackage.TYPE_REFERENCE__COLLECTION:
        return collection != COLLECTION_EDEFAULT;
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
    result.append(" (collection: ");
    result.append(collection);
    result.append(')');
    return result.toString();
  }

} //TypeReferenceImpl
