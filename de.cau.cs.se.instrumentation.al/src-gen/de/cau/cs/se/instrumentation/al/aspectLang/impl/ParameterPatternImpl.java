/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.ParameterModifier;
import de.cau.cs.se.instrumantation.model.structure.Type;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ParameterPatternImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterPatternImpl extends MinimalEObjectImpl.Container implements ParameterPattern
{
  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected ParameterModifier modifier;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterPatternImpl()
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
    return AspectLangPackage.Literals.PARAMETER_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterModifier getModifier()
  {
    if (modifier != null && modifier.eIsProxy())
    {
      InternalEObject oldModifier = (InternalEObject)modifier;
      modifier = (ParameterModifier)eResolveProxy(oldModifier);
      if (modifier != oldModifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.PARAMETER_PATTERN__MODIFIER, oldModifier, modifier));
      }
    }
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterModifier basicGetModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(ParameterModifier newModifier)
  {
    ParameterModifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PARAMETER_PATTERN__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.PARAMETER_PATTERN__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PARAMETER_PATTERN__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (Parameter)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.PARAMETER_PATTERN__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.PARAMETER_PATTERN__PARAMETER, oldParameter, parameter));
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
      case AspectLangPackage.PARAMETER_PATTERN__MODIFIER:
        if (resolve) return getModifier();
        return basicGetModifier();
      case AspectLangPackage.PARAMETER_PATTERN__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case AspectLangPackage.PARAMETER_PATTERN__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
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
      case AspectLangPackage.PARAMETER_PATTERN__MODIFIER:
        setModifier((ParameterModifier)newValue);
        return;
      case AspectLangPackage.PARAMETER_PATTERN__TYPE:
        setType((Type)newValue);
        return;
      case AspectLangPackage.PARAMETER_PATTERN__PARAMETER:
        setParameter((Parameter)newValue);
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
      case AspectLangPackage.PARAMETER_PATTERN__MODIFIER:
        setModifier((ParameterModifier)null);
        return;
      case AspectLangPackage.PARAMETER_PATTERN__TYPE:
        setType((Type)null);
        return;
      case AspectLangPackage.PARAMETER_PATTERN__PARAMETER:
        setParameter((Parameter)null);
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
      case AspectLangPackage.PARAMETER_PATTERN__MODIFIER:
        return modifier != null;
      case AspectLangPackage.PARAMETER_PATTERN__TYPE:
        return type != null;
      case AspectLangPackage.PARAMETER_PATTERN__PARAMETER:
        return parameter != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterPatternImpl
