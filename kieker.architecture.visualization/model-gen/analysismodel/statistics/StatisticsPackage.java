/**
 */
package analysismodel.statistics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see analysismodel.statistics.StatisticsFactory
 * @model kind="package"
 * @generated
 */
public interface StatisticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statistics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Kieker/model/analysismodel.ecore/statistics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statistics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatisticsPackage eINSTANCE = analysismodel.statistics.impl.StatisticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.StatisticsImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 0;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__STATISTICS = 0;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.UnitsToStatisticsMapEntryImpl <em>Units To Statistics Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.UnitsToStatisticsMapEntryImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getUnitsToStatisticsMapEntry()
	 * @generated
	 */
	int UNITS_TO_STATISTICS_MAP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_TO_STATISTICS_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_TO_STATISTICS_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Units To Statistics Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_TO_STATISTICS_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Units To Statistics Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_TO_STATISTICS_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.StatisticRecordImpl <em>Statistic Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.StatisticRecordImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatisticRecord()
	 * @generated
	 */
	int STATISTIC_RECORD = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_RECORD__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Statistic Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_RECORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statistic Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.EPropertyTypeToValueImpl <em>EProperty Type To Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.EPropertyTypeToValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPropertyTypeToValue()
	 * @generated
	 */
	int EPROPERTY_TYPE_TO_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROPERTY_TYPE_TO_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROPERTY_TYPE_TO_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EProperty Type To Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROPERTY_TYPE_TO_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EProperty Type To Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROPERTY_TYPE_TO_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.TimeSeriesImpl <em>Time Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.TimeSeriesImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getTimeSeries()
	 * @generated
	 */
	int TIME_SERIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.ValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.IntValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__MEASUREMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.LongValueImpl <em>Long Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.LongValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getLongValue()
	 * @generated
	 */
	int LONG_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__MEASUREMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.FloatValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__MEASUREMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.DoubleValueImpl <em>Double Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.DoubleValueImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getDoubleValue()
	 * @generated
	 */
	int DOUBLE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__MEASUREMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.Unit <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.Unit
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.StatisticsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.StatisticsModelImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatisticsModel()
	 * @generated
	 */
	int STATISTICS_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_MODEL__STATISTICS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.EObjectToStatisticsMapEntryImpl <em>EObject To Statistics Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.EObjectToStatisticsMapEntryImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEObjectToStatisticsMapEntry()
	 * @generated
	 */
	int EOBJECT_TO_STATISTICS_MAP_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_STATISTICS_MAP_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_STATISTICS_MAP_ENTRY__KEY = 1;

	/**
	 * The number of structural features of the '<em>EObject To Statistics Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_STATISTICS_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EObject To Statistics Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_STATISTICS_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.impl.TimeSeriesStatisticsImpl <em>Time Series Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.impl.TimeSeriesStatisticsImpl
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getTimeSeriesStatistics()
	 * @generated
	 */
	int TIME_SERIES_STATISTICS = 13;

	/**
	 * The feature id for the '<em><b>Time Series</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_STATISTICS__TIME_SERIES = 0;

	/**
	 * The number of structural features of the '<em>Time Series Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_STATISTICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Series Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.EPredefinedUnits <em>EPredefined Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.EPredefinedUnits
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPredefinedUnits()
	 * @generated
	 */
	int EPREDEFINED_UNITS = 14;

	/**
	 * The meta object id for the '{@link analysismodel.statistics.EPropertyType <em>EProperty Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismodel.statistics.EPropertyType
	 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPropertyType()
	 * @generated
	 */
	int EPROPERTY_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see analysismodel.statistics.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for the map '{@link analysismodel.statistics.Statistics#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Statistics</em>'.
	 * @see analysismodel.statistics.Statistics#getStatistics()
	 * @see #getStatistics()
	 * @generated
	 */
	EReference getStatistics_Statistics();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Units To Statistics Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Units To Statistics Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="analysismodel.statistics.EPredefinedUnits"
	 *        valueType="analysismodel.statistics.StatisticRecord" valueContainment="true"
	 * @generated
	 */
	EClass getUnitsToStatisticsMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getUnitsToStatisticsMapEntry()
	 * @generated
	 */
	EAttribute getUnitsToStatisticsMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getUnitsToStatisticsMapEntry()
	 * @generated
	 */
	EReference getUnitsToStatisticsMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.StatisticRecord <em>Statistic Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Record</em>'.
	 * @see analysismodel.statistics.StatisticRecord
	 * @generated
	 */
	EClass getStatisticRecord();

	/**
	 * Returns the meta object for the map '{@link analysismodel.statistics.StatisticRecord#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see analysismodel.statistics.StatisticRecord#getProperties()
	 * @see #getStatisticRecord()
	 * @generated
	 */
	EReference getStatisticRecord_Properties();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EProperty Type To Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProperty Type To Value</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="analysismodel.statistics.EPropertyType"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	EClass getEPropertyTypeToValue();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEPropertyTypeToValue()
	 * @generated
	 */
	EAttribute getEPropertyTypeToValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEPropertyTypeToValue()
	 * @generated
	 */
	EAttribute getEPropertyTypeToValue_Value();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series</em>'.
	 * @see analysismodel.statistics.TimeSeries
	 * @generated
	 */
	EClass getTimeSeries();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.TimeSeries#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismodel.statistics.TimeSeries#getName()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_Name();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.TimeSeries#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see analysismodel.statistics.TimeSeries#getUnit()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_Unit();

	/**
	 * Returns the meta object for the reference list '{@link analysismodel.statistics.TimeSeries#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see analysismodel.statistics.TimeSeries#getValues()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_Values();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see analysismodel.statistics.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.Value#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see analysismodel.statistics.Value#getTimestamp()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Timestamp();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see analysismodel.statistics.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.IntValue#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see analysismodel.statistics.IntValue#getMeasurement()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Measurement();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.LongValue <em>Long Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Value</em>'.
	 * @see analysismodel.statistics.LongValue
	 * @generated
	 */
	EClass getLongValue();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.LongValue#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see analysismodel.statistics.LongValue#getMeasurement()
	 * @see #getLongValue()
	 * @generated
	 */
	EAttribute getLongValue_Measurement();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see analysismodel.statistics.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.FloatValue#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see analysismodel.statistics.FloatValue#getMeasurement()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Measurement();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Value</em>'.
	 * @see analysismodel.statistics.DoubleValue
	 * @generated
	 */
	EClass getDoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link analysismodel.statistics.DoubleValue#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see analysismodel.statistics.DoubleValue#getMeasurement()
	 * @see #getDoubleValue()
	 * @generated
	 */
	EAttribute getDoubleValue_Measurement();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see analysismodel.statistics.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.StatisticsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see analysismodel.statistics.StatisticsModel
	 * @generated
	 */
	EClass getStatisticsModel();

	/**
	 * Returns the meta object for the map '{@link analysismodel.statistics.StatisticsModel#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Statistics</em>'.
	 * @see analysismodel.statistics.StatisticsModel#getStatistics()
	 * @see #getStatisticsModel()
	 * @generated
	 */
	EReference getStatisticsModel_Statistics();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EObject To Statistics Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject To Statistics Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="analysismodel.statistics.Statistics" valueContainment="true"
	 *        keyType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getEObjectToStatisticsMapEntry();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToStatisticsMapEntry()
	 * @generated
	 */
	EReference getEObjectToStatisticsMapEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToStatisticsMapEntry()
	 * @generated
	 */
	EReference getEObjectToStatisticsMapEntry_Key();

	/**
	 * Returns the meta object for class '{@link analysismodel.statistics.TimeSeriesStatistics <em>Time Series Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series Statistics</em>'.
	 * @see analysismodel.statistics.TimeSeriesStatistics
	 * @generated
	 */
	EClass getTimeSeriesStatistics();

	/**
	 * Returns the meta object for the reference list '{@link analysismodel.statistics.TimeSeriesStatistics#getTimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Series</em>'.
	 * @see analysismodel.statistics.TimeSeriesStatistics#getTimeSeries()
	 * @see #getTimeSeriesStatistics()
	 * @generated
	 */
	EReference getTimeSeriesStatistics_TimeSeries();

	/**
	 * Returns the meta object for enum '{@link analysismodel.statistics.EPredefinedUnits <em>EPredefined Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPredefined Units</em>'.
	 * @see analysismodel.statistics.EPredefinedUnits
	 * @generated
	 */
	EEnum getEPredefinedUnits();

	/**
	 * Returns the meta object for enum '{@link analysismodel.statistics.EPropertyType <em>EProperty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EProperty Type</em>'.
	 * @see analysismodel.statistics.EPropertyType
	 * @generated
	 */
	EEnum getEPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatisticsFactory getStatisticsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.StatisticsImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS__STATISTICS = eINSTANCE.getStatistics_Statistics();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.UnitsToStatisticsMapEntryImpl <em>Units To Statistics Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.UnitsToStatisticsMapEntryImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getUnitsToStatisticsMapEntry()
		 * @generated
		 */
		EClass UNITS_TO_STATISTICS_MAP_ENTRY = eINSTANCE.getUnitsToStatisticsMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITS_TO_STATISTICS_MAP_ENTRY__KEY = eINSTANCE.getUnitsToStatisticsMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITS_TO_STATISTICS_MAP_ENTRY__VALUE = eINSTANCE.getUnitsToStatisticsMapEntry_Value();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.StatisticRecordImpl <em>Statistic Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.StatisticRecordImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatisticRecord()
		 * @generated
		 */
		EClass STATISTIC_RECORD = eINSTANCE.getStatisticRecord();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC_RECORD__PROPERTIES = eINSTANCE.getStatisticRecord_Properties();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.EPropertyTypeToValueImpl <em>EProperty Type To Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.EPropertyTypeToValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPropertyTypeToValue()
		 * @generated
		 */
		EClass EPROPERTY_TYPE_TO_VALUE = eINSTANCE.getEPropertyTypeToValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROPERTY_TYPE_TO_VALUE__KEY = eINSTANCE.getEPropertyTypeToValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROPERTY_TYPE_TO_VALUE__VALUE = eINSTANCE.getEPropertyTypeToValue_Value();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.TimeSeriesImpl <em>Time Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.TimeSeriesImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getTimeSeries()
		 * @generated
		 */
		EClass TIME_SERIES = eINSTANCE.getTimeSeries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__NAME = eINSTANCE.getTimeSeries_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__UNIT = eINSTANCE.getTimeSeries_Unit();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__VALUES = eINSTANCE.getTimeSeries_Values();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.ValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TIMESTAMP = eINSTANCE.getValue_Timestamp();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.IntValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VALUE__MEASUREMENT = eINSTANCE.getIntValue_Measurement();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.LongValueImpl <em>Long Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.LongValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getLongValue()
		 * @generated
		 */
		EClass LONG_VALUE = eINSTANCE.getLongValue();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE__MEASUREMENT = eINSTANCE.getLongValue_Measurement();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.FloatValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getFloatValue()
		 * @generated
		 */
		EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_VALUE__MEASUREMENT = eINSTANCE.getFloatValue_Measurement();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.DoubleValueImpl <em>Double Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.DoubleValueImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getDoubleValue()
		 * @generated
		 */
		EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE__MEASUREMENT = eINSTANCE.getDoubleValue_Measurement();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.Unit <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.Unit
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.StatisticsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.StatisticsModelImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getStatisticsModel()
		 * @generated
		 */
		EClass STATISTICS_MODEL = eINSTANCE.getStatisticsModel();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS_MODEL__STATISTICS = eINSTANCE.getStatisticsModel_Statistics();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.EObjectToStatisticsMapEntryImpl <em>EObject To Statistics Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.EObjectToStatisticsMapEntryImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEObjectToStatisticsMapEntry()
		 * @generated
		 */
		EClass EOBJECT_TO_STATISTICS_MAP_ENTRY = eINSTANCE.getEObjectToStatisticsMapEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TO_STATISTICS_MAP_ENTRY__VALUE = eINSTANCE.getEObjectToStatisticsMapEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TO_STATISTICS_MAP_ENTRY__KEY = eINSTANCE.getEObjectToStatisticsMapEntry_Key();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.impl.TimeSeriesStatisticsImpl <em>Time Series Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.impl.TimeSeriesStatisticsImpl
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getTimeSeriesStatistics()
		 * @generated
		 */
		EClass TIME_SERIES_STATISTICS = eINSTANCE.getTimeSeriesStatistics();

		/**
		 * The meta object literal for the '<em><b>Time Series</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES_STATISTICS__TIME_SERIES = eINSTANCE.getTimeSeriesStatistics_TimeSeries();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.EPredefinedUnits <em>EPredefined Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.EPredefinedUnits
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPredefinedUnits()
		 * @generated
		 */
		EEnum EPREDEFINED_UNITS = eINSTANCE.getEPredefinedUnits();

		/**
		 * The meta object literal for the '{@link analysismodel.statistics.EPropertyType <em>EProperty Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismodel.statistics.EPropertyType
		 * @see analysismodel.statistics.impl.StatisticsPackageImpl#getEPropertyType()
		 * @generated
		 */
		EEnum EPROPERTY_TYPE = eINSTANCE.getEPropertyType();

	}

} //StatisticsPackage
