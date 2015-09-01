/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.MethodModifier;
import de.cau.cs.se.instrumantation.model.structure.Type;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterQuery;

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
 * An implementation of the model object '<em><b>Method Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl#getMethodReference <em>Method Reference</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.MethodQueryImpl#getParameterQueries <em>Parameter Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodQueryImpl extends MinimalEObjectImpl.Container implements MethodQuery
{
  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected MethodModifier modifier;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Type returnType;

  /**
   * The cached value of the '{@link #getMethodReference() <em>Method Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodReference()
   * @generated
   * @ordered
   */
  protected Method methodReference;

  /**
   * The cached value of the '{@link #getParameterQueries() <em>Parameter Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterQueries()
   * @generated
   * @ordered
   */
  protected EList<ParameterQuery> parameterQueries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodQueryImpl()
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
    return AspectLangPackage.Literals.METHOD_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodModifier getModifier()
  {
    if (modifier != null && modifier.eIsProxy())
    {
      InternalEObject oldModifier = (InternalEObject)modifier;
      modifier = (MethodModifier)eResolveProxy(oldModifier);
      if (modifier != oldModifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.METHOD_QUERY__MODIFIER, oldModifier, modifier));
      }
    }
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodModifier basicGetModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(MethodModifier newModifier)
  {
    MethodModifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.METHOD_QUERY__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturnType()
  {
    if (returnType != null && returnType.eIsProxy())
    {
      InternalEObject oldReturnType = (InternalEObject)returnType;
      returnType = (Type)eResolveProxy(oldReturnType);
      if (returnType != oldReturnType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.METHOD_QUERY__RETURN_TYPE, oldReturnType, returnType));
      }
    }
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Type newReturnType)
  {
    Type oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.METHOD_QUERY__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethodReference()
  {
    if (methodReference != null && methodReference.eIsProxy())
    {
      InternalEObject oldMethodReference = (InternalEObject)methodReference;
      methodReference = (Method)eResolveProxy(oldMethodReference);
      if (methodReference != oldMethodReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE, oldMethodReference, methodReference));
      }
    }
    return methodReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method basicGetMethodReference()
  {
    return methodReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodReference(Method newMethodReference)
  {
    Method oldMethodReference = methodReference;
    methodReference = newMethodReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE, oldMethodReference, methodReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterQuery> getParameterQueries()
  {
    if (parameterQueries == null)
    {
      parameterQueries = new EObjectContainmentEList<ParameterQuery>(ParameterQuery.class, this, AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES);
    }
    return parameterQueries;
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
      case AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES:
        return ((InternalEList<?>)getParameterQueries()).basicRemove(otherEnd, msgs);
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
      case AspectLangPackage.METHOD_QUERY__MODIFIER:
        if (resolve) return getModifier();
        return basicGetModifier();
      case AspectLangPackage.METHOD_QUERY__RETURN_TYPE:
        if (resolve) return getReturnType();
        return basicGetReturnType();
      case AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE:
        if (resolve) return getMethodReference();
        return basicGetMethodReference();
      case AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES:
        return getParameterQueries();
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
      case AspectLangPackage.METHOD_QUERY__MODIFIER:
        setModifier((MethodModifier)newValue);
        return;
      case AspectLangPackage.METHOD_QUERY__RETURN_TYPE:
        setReturnType((Type)newValue);
        return;
      case AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE:
        setMethodReference((Method)newValue);
        return;
      case AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES:
        getParameterQueries().clear();
        getParameterQueries().addAll((Collection<? extends ParameterQuery>)newValue);
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
      case AspectLangPackage.METHOD_QUERY__MODIFIER:
        setModifier((MethodModifier)null);
        return;
      case AspectLangPackage.METHOD_QUERY__RETURN_TYPE:
        setReturnType((Type)null);
        return;
      case AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE:
        setMethodReference((Method)null);
        return;
      case AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES:
        getParameterQueries().clear();
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
      case AspectLangPackage.METHOD_QUERY__MODIFIER:
        return modifier != null;
      case AspectLangPackage.METHOD_QUERY__RETURN_TYPE:
        return returnType != null;
      case AspectLangPackage.METHOD_QUERY__METHOD_REFERENCE:
        return methodReference != null;
      case AspectLangPackage.METHOD_QUERY__PARAMETER_QUERIES:
        return parameterQueries != null && !parameterQueries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodQueryImpl
