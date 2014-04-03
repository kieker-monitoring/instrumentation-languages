/**
 */
package de.cau.cs.se.instrumantation.model.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Parameter#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(ParameterModifier)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getParameter_Modifier()
	 * @model required="true"
	 * @generated
	 */
	ParameterModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Parameter#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ParameterModifier value);

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
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // Parameter
