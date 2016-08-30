/**
 */
package kieker.develop.semantics.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kieker.develop.semantics.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = kieker.develop.semantics.annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation</em>'.
	 * @generated
	 */
	Implementation createImplementation();

	/**
	 * Returns a new object of class '<em>Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantics</em>'.
	 * @generated
	 */
	Semantics createSemantics();

	/**
	 * Returns a new object of class '<em>Target Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Language</em>'.
	 * @generated
	 */
	TargetLanguage createTargetLanguage();

	/**
	 * Returns a new object of class '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technology</em>'.
	 * @generated
	 */
	Technology createTechnology();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
