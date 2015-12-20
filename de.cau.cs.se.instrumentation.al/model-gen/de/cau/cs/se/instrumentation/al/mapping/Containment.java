/**
 */
package de.cau.cs.se.instrumentation.al.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.Containment#getContents <em>Contents</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.Containment#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getContainment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Containment extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumentation.al.mapping.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getContainment_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContents();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumentation.al.mapping.NamedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getContainment_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedType> getTypes();

} // Containment
