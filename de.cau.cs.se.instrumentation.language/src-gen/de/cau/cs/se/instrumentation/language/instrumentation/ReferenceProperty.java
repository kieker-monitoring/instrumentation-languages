/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getRef <em>Ref</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getReferenceProperty()
 * @model
 * @generated
 */
public interface ReferenceProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(EStructuralFeature)
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getReferenceProperty_Ref()
   * @model
   * @generated
   */
  EStructuralFeature getRef();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getReferenceProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceProperty> getProperties();

} // ReferenceProperty
