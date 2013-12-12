/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Model#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Containment {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumantation.model.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // Model
