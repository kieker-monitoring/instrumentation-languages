/**
 */
package de.cau.cs.se.instrumantation.model.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumantation.model.structure.Operation#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends NamedElement, Traceability {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(TypeReference)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.instrumantation.model.structure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(OperationModifier)
	 * @see de.cau.cs.se.instrumantation.model.structure.StructurePackage#getOperation_Modifier()
	 * @model required="true"
	 * @generated
	 */
	OperationModifier getModifier();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumantation.model.structure.Operation#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(OperationModifier value);

} // Operation
