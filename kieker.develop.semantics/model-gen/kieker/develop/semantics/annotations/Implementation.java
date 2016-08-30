/**
 */
package kieker.develop.semantics.annotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.semantics.annotations.Implementation#getCode <em>Code</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.Implementation#getTechnology <em>Technology</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.Implementation#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getImplementation_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link kieker.develop.semantics.annotations.Implementation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' reference.
	 * @see #setTechnology(Technology)
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getImplementation_Technology()
	 * @model required="true"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link kieker.develop.semantics.annotations.Implementation#getTechnology <em>Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(TargetLanguage)
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getImplementation_Language()
	 * @model required="true"
	 * @generated
	 */
	TargetLanguage getLanguage();

	/**
	 * Sets the value of the '{@link kieker.develop.semantics.annotations.Implementation#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(TargetLanguage value);

} // Implementation
