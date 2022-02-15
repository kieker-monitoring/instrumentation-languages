/**
 */
package analysismodel.statistics;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.statistics.Statistics#getStatistics <em>Statistics</em>}</li>
 * </ul>
 *
 * @see analysismodel.statistics.StatisticsPackage#getStatistics()
 * @model
 * @generated
 */
public interface Statistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' map.
	 * The key is of type {@link analysismodel.statistics.EPredefinedUnits},
	 * and the value is of type {@link analysismodel.statistics.StatisticRecord},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' map.
	 * @see analysismodel.statistics.StatisticsPackage#getStatistics_Statistics()
	 * @model mapType="analysismodel.statistics.UnitsToStatisticsMapEntry&lt;analysismodel.statistics.EPredefinedUnits, analysismodel.statistics.StatisticRecord&gt;"
	 * @generated
	 */
	EMap<EPredefinedUnits, StatisticRecord> getStatistics();

} // Statistics
