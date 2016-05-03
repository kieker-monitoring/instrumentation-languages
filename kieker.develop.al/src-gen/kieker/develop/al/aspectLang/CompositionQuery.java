/**
 */
package kieker.develop.al.aspectLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.aspectLang.CompositionQuery#getSubQueries <em>Sub Queries</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getCompositionQuery()
 * @model
 * @generated
 */
public interface CompositionQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Sub Queries</b></em>' containment reference list.
   * The list contents are of type {@link kieker.develop.al.aspectLang.LocationQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Queries</em>' containment reference list.
   * @see kieker.develop.al.aspectLang.AspectLangPackage#getCompositionQuery_SubQueries()
   * @model containment="true"
   * @generated
   */
  EList<LocationQuery> getSubQueries();

} // CompositionQuery
