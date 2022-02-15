/**
 */
package analysismodel.assembly;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.assembly.AssemblyModel#getAssemblyComponents <em>Assembly Components</em>}</li>
 * </ul>
 *
 * @see analysismodel.assembly.AssemblyPackage#getAssemblyModel()
 * @model
 * @generated
 */
public interface AssemblyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Components</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link analysismodel.assembly.AssemblyComponent},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Components</em>' map.
	 * @see analysismodel.assembly.AssemblyPackage#getAssemblyModel_AssemblyComponents()
	 * @model mapType="analysismodel.assembly.EStringToAssemblyComponentMapEntry&lt;org.eclipse.emf.ecore.EString, analysismodel.assembly.AssemblyComponent&gt;" ordered="false"
	 * @generated
	 */
	EMap<String, AssemblyComponent> getAssemblyComponents();

} // AssemblyModel
