/**
 */
package kieker.tools.al.aspectLang.impl;

import kieker.tools.al.aspectLang.AspectLangPackage;
import kieker.tools.al.aspectLang.OperationQuery;
import kieker.tools.al.aspectLang.ParameterQuery;
import kieker.tools.al.aspectLang.TypeReference;

import kieker.tools.al.mapping.Operation;
import kieker.tools.al.mapping.OperationModifier;

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
 * An implementation of the model object '<em><b>Operation Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.impl.OperationQueryImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.OperationQueryImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.OperationQueryImpl#getOperationReference <em>Operation Reference</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.impl.OperationQueryImpl#getParameterQueries <em>Parameter Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationQueryImpl extends MinimalEObjectImpl.Container implements OperationQuery
{
  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected OperationModifier modifier;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected TypeReference returnType;

  /**
   * The cached value of the '{@link #getOperationReference() <em>Operation Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationReference()
   * @generated
   * @ordered
   */
  protected Operation operationReference;

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
  protected OperationQueryImpl()
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
    return AspectLangPackage.Literals.OPERATION_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationModifier getModifier()
  {
    if (modifier != null && modifier.eIsProxy())
    {
      InternalEObject oldModifier = (InternalEObject)modifier;
      modifier = (OperationModifier)eResolveProxy(oldModifier);
      if (modifier != oldModifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.OPERATION_QUERY__MODIFIER, oldModifier, modifier));
      }
    }
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationModifier basicGetModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(OperationModifier newModifier)
  {
    OperationModifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.OPERATION_QUERY__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs)
  {
    TypeReference oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectLangPackage.OPERATION_QUERY__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(TypeReference newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.OPERATION_QUERY__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectLangPackage.OPERATION_QUERY__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.OPERATION_QUERY__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getOperationReference()
  {
    if (operationReference != null && operationReference.eIsProxy())
    {
      InternalEObject oldOperationReference = (InternalEObject)operationReference;
      operationReference = (Operation)eResolveProxy(oldOperationReference);
      if (operationReference != oldOperationReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE, oldOperationReference, operationReference));
      }
    }
    return operationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetOperationReference()
  {
    return operationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationReference(Operation newOperationReference)
  {
    Operation oldOperationReference = operationReference;
    operationReference = newOperationReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE, oldOperationReference, operationReference));
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
      parameterQueries = new EObjectContainmentEList<ParameterQuery>(ParameterQuery.class, this, AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES);
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
      case AspectLangPackage.OPERATION_QUERY__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES:
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
      case AspectLangPackage.OPERATION_QUERY__MODIFIER:
        if (resolve) return getModifier();
        return basicGetModifier();
      case AspectLangPackage.OPERATION_QUERY__RETURN_TYPE:
        return getReturnType();
      case AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE:
        if (resolve) return getOperationReference();
        return basicGetOperationReference();
      case AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES:
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
      case AspectLangPackage.OPERATION_QUERY__MODIFIER:
        setModifier((OperationModifier)newValue);
        return;
      case AspectLangPackage.OPERATION_QUERY__RETURN_TYPE:
        setReturnType((TypeReference)newValue);
        return;
      case AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE:
        setOperationReference((Operation)newValue);
        return;
      case AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES:
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
      case AspectLangPackage.OPERATION_QUERY__MODIFIER:
        setModifier((OperationModifier)null);
        return;
      case AspectLangPackage.OPERATION_QUERY__RETURN_TYPE:
        setReturnType((TypeReference)null);
        return;
      case AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE:
        setOperationReference((Operation)null);
        return;
      case AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES:
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
      case AspectLangPackage.OPERATION_QUERY__MODIFIER:
        return modifier != null;
      case AspectLangPackage.OPERATION_QUERY__RETURN_TYPE:
        return returnType != null;
      case AspectLangPackage.OPERATION_QUERY__OPERATION_REFERENCE:
        return operationReference != null;
      case AspectLangPackage.OPERATION_QUERY__PARAMETER_QUERIES:
        return parameterQueries != null && !parameterQueries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperationQueryImpl
