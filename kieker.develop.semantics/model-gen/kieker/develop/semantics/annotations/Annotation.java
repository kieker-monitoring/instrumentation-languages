/**
 */
package kieker.develop.semantics.annotations;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.semantics.annotations.Annotation#getImplementations <em>Implementations</em>}</li>
 * </ul>
 *
 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.semantics.annotations.Implementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementations</em>' containment reference list.
	 * @see kieker.develop.semantics.annotations.AnnotationsPackage#getAnnotation_Implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Implementation> getImplementations();

} // Annotation
