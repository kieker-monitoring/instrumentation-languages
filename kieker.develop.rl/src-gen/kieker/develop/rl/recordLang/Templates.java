/**
 */
package kieker.develop.rl.recordLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.Templates#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @see kieker.develop.rl.recordLang.RecordLangPackage#getTemplates()
 * @model
 * @generated
 */
public interface Templates extends EObject
{
  /**
   * Returns the value of the '<em><b>Templates</b></em>' reference list.
   * The list contents are of type {@link kieker.develop.rl.recordLang.TemplateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' reference list.
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getTemplates_Templates()
   * @model
   * @generated
   */
  EList<TemplateType> getTemplates();

} // Templates
