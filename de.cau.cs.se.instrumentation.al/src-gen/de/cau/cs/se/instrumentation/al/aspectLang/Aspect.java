/**
 */
package kieker.tools.al.aspectLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.Aspect#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link kieker.tools.al.aspectLang.Aspect#getAdvices <em>Advices</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject
{
  /**
   * Returns the value of the '<em><b>Pointcut</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcut</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointcut</em>' reference.
   * @see #setPointcut(Pointcut)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getAspect_Pointcut()
   * @model
   * @generated
   */
  Pointcut getPointcut();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.Aspect#getPointcut <em>Pointcut</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointcut</em>' reference.
   * @see #getPointcut()
   * @generated
   */
  void setPointcut(Pointcut value);

  /**
   * Returns the value of the '<em><b>Advices</b></em>' containment reference list.
   * The list contents are of type {@link kieker.tools.al.aspectLang.UtilizeAdvice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advices</em>' containment reference list.
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getAspect_Advices()
   * @model containment="true"
   * @generated
   */
  EList<UtilizeAdvice> getAdvices();

} // Aspect
