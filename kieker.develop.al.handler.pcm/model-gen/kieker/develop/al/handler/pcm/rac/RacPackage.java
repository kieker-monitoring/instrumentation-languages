/**
 */
package kieker.develop.al.handler.pcm.rac;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see kieker.develop.al.handler.pcm.rac.RacFactory
 * @model kind="package"
 * @generated
 */
public interface RacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kieker-monitoring.net/pcm/rac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RacPackage eINSTANCE = kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl.init();

	/**
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.impl.MappingModelImpl
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.impl.PCMMappingImpl <em>PCM Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.impl.PCMMappingImpl
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getPCMMapping()
	 * @generated
	 */
	int PCM_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>PCM Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PCM Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.al.handler.pcm.rac.MappingModel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.MappingModel#getMappings()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Mappings();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.PCMMapping <em>PCM Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Mapping</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping
	 * @generated
	 */
	EClass getPCMMapping();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping#getTarget()
	 * @see #getPCMMapping()
	 * @generated
	 */
	EAttribute getPCMMapping_Target();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping#getSource()
	 * @see #getPCMMapping()
	 * @generated
	 */
	EReference getPCMMapping_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RacFactory getRacFactory();

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
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.impl.MappingModelImpl
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__MAPPINGS = eINSTANCE.getMappingModel_Mappings();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.impl.PCMMappingImpl <em>PCM Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.impl.PCMMappingImpl
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getPCMMapping()
		 * @generated
		 */
		EClass PCM_MAPPING = eINSTANCE.getPCMMapping();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_MAPPING__TARGET = eINSTANCE.getPCMMapping_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MAPPING__SOURCE = eINSTANCE.getPCMMapping_Source();

	}

} //RacPackage
