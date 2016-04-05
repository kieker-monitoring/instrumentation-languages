/**
 */
package kieker.develop.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.PropertyConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.PropertyConstraint#getLogic <em>Logic</em>}</li>
 *   <li>{@link kieker.develop.al.aspectLang.PropertyConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getPropertyConstraint()
 * @model
 * @generated
 */
public interface PropertyConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PropertyConstraintCompare)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getPropertyConstraint_Left()
   * @model containment="true"
   * @generated
   */
  PropertyConstraintCompare getLeft();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.PropertyConstraint#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PropertyConstraintCompare value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' attribute.
   * The literals are from the enumeration {@link kieker.develop.al.aspectLang.LogicOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' attribute.
   * @see kieker.develop.al.aspectLang.LogicOperator
   * @see #setLogic(LogicOperator)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getPropertyConstraint_Logic()
   * @model
   * @generated
   */
  LogicOperator getLogic();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.PropertyConstraint#getLogic <em>Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' attribute.
   * @see kieker.develop.al.aspectLang.LogicOperator
   * @see #getLogic()
   * @generated
   */
  void setLogic(LogicOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PropertyConstraintCompare)
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getPropertyConstraint_Right()
   * @model containment="true"
   * @generated
   */
  PropertyConstraintCompare getRight();

  /**
   * Sets the value of the '{@link kieker.develop.al.aspectLang.PropertyConstraint#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PropertyConstraintCompare value);

} // PropertyConstraint
