/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Array#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Literal
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getArray_Literals()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLiterals();

} // Array
