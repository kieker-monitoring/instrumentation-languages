/**
 */
package kieker.develop.al.intermediate;

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
 *   <li>{@link kieker.develop.al.intermediate.AbstractJoinpoint#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getAbstractJoinpoint()
 * @model
 * @generated
 */
public interface AbstractJoinpoint extends EObject {

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getAbstractJoinpoint_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link kieker.develop.al.intermediate.AbstractJoinpoint#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);
} // AbstractJoinpoint
