/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.MappingModel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends Containment {
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
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getMappingModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // MappingModel
