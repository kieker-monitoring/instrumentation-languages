/**
 */
package kieker.tools.al.aspectLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.PropertyConstraintCompare#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getPropertyConstraintCompare()
 * @model
 * @generated
 */
public interface PropertyConstraintCompare extends PropertyConstraint
{
  /**
   * Returns the value of the '<em><b>Compare</b></em>' attribute.
   * The literals are from the enumeration {@link kieker.tools.al.aspectLang.CompareOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare</em>' attribute.
   * @see kieker.tools.al.aspectLang.CompareOperator
   * @see #setCompare(CompareOperator)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getPropertyConstraintCompare_Compare()
   * @model
   * @generated
   */
  CompareOperator getCompare();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.PropertyConstraintCompare#getCompare <em>Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare</em>' attribute.
   * @see kieker.tools.al.aspectLang.CompareOperator
   * @see #getCompare()
   * @generated
   */
  void setCompare(CompareOperator value);

} // PropertyConstraintCompare
