/**
 */
package de.cau.cs.se.instrumentation.al.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.mapping.Traceability#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getTraceability()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Traceability extends EObject {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(EObject)
	 * @see de.cau.cs.se.instrumentation.al.mapping.MappingPackage#getTraceability_Predecessor()
	 * @model required="true"
	 * @generated
	 */
	EObject getPredecessor();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.mapping.Traceability#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(EObject value);

} // Traceability
