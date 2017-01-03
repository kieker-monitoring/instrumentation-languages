/**
 */
package kieker.develop.al.intermediate;

import kieker.develop.al.aspectLang.Advice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.al.intermediate.IntermediateAspect#getJoinpoints <em>Joinpoints</em>}</li>
 *   <li>{@link kieker.develop.al.intermediate.IntermediateAspect#getAdvices <em>Advices</em>}</li>
 * </ul>
 *
 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateAspect()
 * @model
 * @generated
 */
public interface IntermediateAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Joinpoints</b></em>' containment reference list.
	 * The list contents are of type {@link kieker.develop.al.intermediate.AbstractJoinpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joinpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joinpoints</em>' containment reference list.
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateAspect_Joinpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractJoinpoint> getJoinpoints();

	/**
	 * Returns the value of the '<em><b>Advices</b></em>' reference list.
	 * The list contents are of type {@link kieker.develop.al.aspectLang.Advice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advices</em>' reference list.
	 * @see kieker.develop.al.intermediate.IntermediatePackage#getIntermediateAspect_Advices()
	 * @model
	 * @generated
	 */
	EList<Advice> getAdvices();

} // IntermediateAspect
