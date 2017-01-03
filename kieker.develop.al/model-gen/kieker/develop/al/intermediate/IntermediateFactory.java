/**
 */
package kieker.develop.al.intermediate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kieker.develop.al.intermediate.IntermediatePackage
 * @generated
 */
public interface IntermediateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateFactory eINSTANCE = kieker.develop.al.intermediate.impl.IntermediateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	IntermediateAspect createIntermediateAspect();

	/**
	 * Returns a new object of class '<em>Abstract Joinpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Joinpoint</em>'.
	 * @generated
	 */
	AbstractJoinpoint createAbstractJoinpoint();

	/**
	 * Returns a new object of class '<em>Code Joinpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Joinpoint</em>'.
	 * @generated
	 */
	CodeJoinpoint createCodeJoinpoint();

	/**
	 * Returns a new object of class '<em>Model Joinpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Joinpoint</em>'.
	 * @generated
	 */
	ModelJoinpoint createModelJoinpoint();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	IntermediateModel createIntermediateModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediatePackage getIntermediatePackage();

} //IntermediateFactory
