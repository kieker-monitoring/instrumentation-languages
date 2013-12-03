/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Container#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Container#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement, Containment {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(ContainerModifier)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getContainer_Modifier()
	 * @model required="true"
	 * @generated
	 */
	ContainerModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Container#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ContainerModifier value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumantation.model.structure.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getContainer_Methods()
	 * @model
	 * @generated
	 */
	EList<Method> getMethods();

} // Container
