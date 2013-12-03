/**
 */
package de.cau.cs.se.instrumentation.al.applicationLang.impl;

import de.cau.cs.se.instrumantation.model.structure.Containment;

import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage;
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.applicationLang.impl.ContainerNodeImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerNodeImpl extends NodeImpl implements ContainerNode
{
  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected Containment container;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerNodeImpl()
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
    return ApplicationLangPackage.Literals.CONTAINER_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Containment getContainer()
  {
    if (container != null && container.eIsProxy())
    {
      InternalEObject oldContainer = (InternalEObject)container;
      container = (Containment)eResolveProxy(oldContainer);
      if (container != oldContainer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationLangPackage.CONTAINER_NODE__CONTAINER, oldContainer, container));
      }
    }
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Containment basicGetContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(Containment newContainer)
  {
    Containment oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationLangPackage.CONTAINER_NODE__CONTAINER, oldContainer, container));
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
      case ApplicationLangPackage.CONTAINER_NODE__CONTAINER:
        if (resolve) return getContainer();
        return basicGetContainer();
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
      case ApplicationLangPackage.CONTAINER_NODE__CONTAINER:
        setContainer((Containment)newValue);
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
      case ApplicationLangPackage.CONTAINER_NODE__CONTAINER:
        setContainer((Containment)null);
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
      case ApplicationLangPackage.CONTAINER_NODE__CONTAINER:
        return container != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainerNodeImpl
