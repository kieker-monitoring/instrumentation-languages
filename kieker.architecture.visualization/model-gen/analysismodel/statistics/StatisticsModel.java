/**
 */
package analysismodel.statistics;

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
 *   <li>{@link analysismodel.statistics.StatisticsModel#getStatistics <em>Statistics</em>}</li>
 * </ul>
 *
 * @see analysismodel.statistics.StatisticsPackage#getStatisticsModel()
 * @model
 * @generated
 */
public interface StatisticsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link analysismodel.statistics.Statistics},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' map.
	 * @see analysismodel.statistics.StatisticsPackage#getStatisticsModel_Statistics()
	 * @model mapType="analysismodel.statistics.EObjectToStatisticsMapEntry&lt;org.eclipse.emf.ecore.EObject, analysismodel.statistics.Statistics&gt;"
	 * @generated
	 */
	EMap<EObject, Statistics> getStatistics();

} // StatisticsModel
