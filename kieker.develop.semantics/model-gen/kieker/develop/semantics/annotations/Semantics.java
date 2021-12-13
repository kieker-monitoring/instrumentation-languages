/**
 */
package kieker.develop.semantics.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.semantics.annotations.Semantics#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.Semantics#getLanguages <em>Languages</em>}</li>
 *   <li>{@link kieker.develop.semantics.annotations.Semantics#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getSemantics()
 * @model
 * @generated
 */
public interface Semantics extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.semantics.annotations.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getSemantics_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.semantics.annotations.TargetLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getSemantics_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetLanguage> getLanguages();

	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.semantics.annotations.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologies</em>' containment reference list.
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getSemantics_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getTechnologies();

} // Semantics
