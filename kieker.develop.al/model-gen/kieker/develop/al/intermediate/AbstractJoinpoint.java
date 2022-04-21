/**
 */
package kieker.develop.al.intermediate;

import kieker.develop.semantics.annotations.Technology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.AbstractJoinpoint#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.AbstractJoinpoint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getAbstractJoinpoint()
 * @model
 * @generated
 */
public interface AbstractJoinpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' reference list.
	 * The list contents are of type {@link kieker.develop.semantics.annotations.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologies</em>' reference list.
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getAbstractJoinpoint_Technologies()
	 * @model
	 * @generated
	 */
	EList<Technology> getTechnologies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getAbstractJoinpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.AbstractJoinpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractJoinpoint
