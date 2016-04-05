/**
 */
package kieker.tools.al.aspectLang;

import kieker.tools.al.mapping.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.tools.al.aspectLang.ContainerNode#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getContainerNode()
 * @model
 * @generated
 */
public interface ContainerNode extends Node
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' reference.
   * @see #setContainer(Feature)
   * @see kieker.tools.al.aspectLang.AspectLangPackage#getContainerNode_Container()
   * @model
   * @generated
   */
  Feature getContainer();

  /**
   * Sets the value of the '{@link kieker.tools.al.aspectLang.ContainerNode#getContainer <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Feature value);

} // ContainerNode
