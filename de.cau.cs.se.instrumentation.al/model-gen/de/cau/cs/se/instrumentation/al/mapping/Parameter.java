/**
 */
package de.cau.cs.se.instrumentation.al.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.Parameter#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement, Traceability {
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
	 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getParameter_Modifier()
	 * @model required="true"
	 * @generated
	 */
	ParameterModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.mapping.Parameter#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ParameterModifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.mapping.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // Parameter
