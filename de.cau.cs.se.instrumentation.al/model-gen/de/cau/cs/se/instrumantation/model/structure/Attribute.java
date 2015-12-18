/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeReference)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getAttribute_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Attribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // Attribute
