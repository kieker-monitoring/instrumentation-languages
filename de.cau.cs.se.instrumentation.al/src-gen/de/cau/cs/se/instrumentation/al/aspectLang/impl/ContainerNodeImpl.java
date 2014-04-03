/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang.impl;

import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;

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
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.impl.ContainerNodeImpl#getContainer <em>Container</em>}</li>
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
  protected de.cau.cs.se.instrumantation.model.structure.Container container;

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
    return AspectLangPackage.Literals.CONTAINER_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumantation.model.structure.Container getContainer()
  {
    if (container != null && container.eIsProxy())
    {
      InternalEObject oldContainer = (InternalEObject)container;
      container = (de.cau.cs.se.instrumantation.model.structure.Container)eResolveProxy(oldContainer);
      if (container != oldContainer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectLangPackage.CONTAINER_NODE__CONTAINER, oldContainer, container));
      }
    }
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.se.instrumantation.model.structure.Container basicGetContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(de.cau.cs.se.instrumantation.model.structure.Container newContainer)
  {
    de.cau.cs.se.instrumantation.model.structure.Container oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AspectLangPackage.CONTAINER_NODE__CONTAINER, oldContainer, container));
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
      case AspectLangPackage.CONTAINER_NODE__CONTAINER:
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
      case AspectLangPackage.CONTAINER_NODE__CONTAINER:
        setContainer((de.cau.cs.se.instrumantation.model.structure.Container)newValue);
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
      case AspectLangPackage.CONTAINER_NODE__CONTAINER:
        setContainer((de.cau.cs.se.instrumantation.model.structure.Container)null);
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
      case AspectLangPackage.CONTAINER_NODE__CONTAINER:
        return container != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainerNodeImpl
