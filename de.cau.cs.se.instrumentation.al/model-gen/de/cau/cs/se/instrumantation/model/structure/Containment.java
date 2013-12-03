/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Containment#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getContainment()
 * @model
 * @generated
 */
public interface Containment extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumantation.model.structure.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getContainment_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContents();

} // Containment
