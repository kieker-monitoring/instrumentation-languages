/**
 */
package analysismodel.statistics;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.statistics.StatisticRecord#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see analysismodel.statistics.StatisticsPackage#getStatisticRecord()
 * @model
 * @generated
 */
public interface StatisticRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link analysismodel.statistics.EPropertyType},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see analysismodel.statistics.StatisticsPackage#getStatisticRecord_Properties()
	 * @model mapType="analysismodel.statistics.EPropertyTypeToValue&lt;analysismodel.statistics.EPropertyType, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	EMap<EPropertyType, Object> getProperties();

} // StatisticRecord
