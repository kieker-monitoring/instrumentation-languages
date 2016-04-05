/**
 */
package kieker.develop.al.aspectLang.impl;

import kieker.develop.al.aspectLang.ApplicationModel;
import kieker.develop.al.aspectLang.AspectLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.impl.ApplicationModelImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.ApplicationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.impl.ApplicationModelImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationModelImpl extends MinimalEObjectImpl.Container implements ApplicationModel
{
  /**
   * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected static final String HANDLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected String handler = HANDLER_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected static final String MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected String model = MODEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationModelImpl()
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
    return AspectLangPackage.Literals.APPLICATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(String newHandler)
  {
    String oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.APPLICATION_MODEL__HANDLER, oldHandler, handler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.APPLICATION_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(String newModel)
  {
    String oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.APPLICATION_MODEL__MODEL, oldModel, model));
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
      case AspectLangPackage.APPLICATION_MODEL__HANDLER:
        return getHandler();
      case AspectLangPackage.APPLICATION_MODEL__NAME:
        return getName();
      case AspectLangPackage.APPLICATION_MODEL__MODEL:
        return getModel();
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
      case AspectLangPackage.APPLICATION_MODEL__HANDLER:
        setHandler((String)newValue);
        return;
      case AspectLangPackage.APPLICATION_MODEL__NAME:
        setName((String)newValue);
        return;
      case AspectLangPackage.APPLICATION_MODEL__MODEL:
        setModel((String)newValue);
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
      case AspectLangPackage.APPLICATION_MODEL__HANDLER:
        setHandler(HANDLER_EDEFAULT);
        return;
      case AspectLangPackage.APPLICATION_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AspectLangPackage.APPLICATION_MODEL__MODEL:
        setModel(MODEL_EDEFAULT);
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
      case AspectLangPackage.APPLICATION_MODEL__HANDLER:
        return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
      case AspectLangPackage.APPLICATION_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AspectLangPackage.APPLICATION_MODEL__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
    result.append(" (handler: ");
    result.append(handler);
    result.append(", name: ");
    result.append(name);
    result.append(", model: ");
    result.append(model);
    result.append(')');
    return result.toString();
  }

} //ApplicationModelImpl
