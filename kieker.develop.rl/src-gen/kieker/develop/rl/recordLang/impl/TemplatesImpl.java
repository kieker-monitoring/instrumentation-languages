/**
 */
package kieker.develop.rl.recordLang.impl;

import java.util.Collection;

import kieker.develop.rl.recordLang.RecordLangPackage;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.recordLang.Templates;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.impl.TemplatesImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplatesImpl extends MinimalEObjectImpl.Container implements Templates
{
  /**
   * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplates()
   * @generated
   * @ordered
   */
  protected EList<TemplateType> templates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplatesImpl()
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
    return RecordLangPackage.Literals.TEMPLATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateType> getTemplates()
  {
    if (templates == null)
    {
      templates = new EObjectResolvingEList<TemplateType>(TemplateType.class, this, RecordLangPackage.TEMPLATES__TEMPLATES);
    }
    return templates;
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
      case RecordLangPackage.TEMPLATES__TEMPLATES:
        return getTemplates();
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
      case RecordLangPackage.TEMPLATES__TEMPLATES:
        getTemplates().clear();
        getTemplates().addAll((Collection<? extends TemplateType>)newValue);
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
      case RecordLangPackage.TEMPLATES__TEMPLATES:
        getTemplates().clear();
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
      case RecordLangPackage.TEMPLATES__TEMPLATES:
        return templates != null && !templates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplatesImpl
