/**
 */
package kieker.develop.al.intermediate;

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
 * @see kieker.develop.al.intermediate.IntermediateFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intermediate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mappingmodel.tools.kieker/ial/intermediate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intermediate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediatePackage eINSTANCE = kieker.develop.al.intermediate.impl.IntermediatePackageImpl.init();

	/**
	 * The meta object id for the '{@link kieker.develop.al.intermediate.impl.IntermediateAspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.intermediate.impl.IntermediateAspectImpl
	 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getIntermediateAspect()
	 * @generated
	 */
	int INTERMEDIATE_ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Joinpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ASPECT__JOINPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Advices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ASPECT__ADVICES = 1;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ASPECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.intermediate.impl.AbstractJoinpointImpl <em>Abstract Joinpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.intermediate.impl.AbstractJoinpointImpl
	 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getAbstractJoinpoint()
	 * @generated
	 */
	int ABSTRACT_JOINPOINT = 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOINPOINT__TECHNOLOGY = 0;

	/**
	 * The number of structural features of the '<em>Abstract Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOINPOINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOINPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.intermediate.impl.CodeJoinpointImpl <em>Code Joinpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.intermediate.impl.CodeJoinpointImpl
	 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getCodeJoinpoint()
	 * @generated
	 */
	int CODE_JOINPOINT = 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_JOINPOINT__TECHNOLOGY = ABSTRACT_JOINPOINT__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_JOINPOINT__ARTIFACT_NAME = ABSTRACT_JOINPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Siganture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_JOINPOINT__OPERATION_SIGANTURE = ABSTRACT_JOINPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_JOINPOINT_FEATURE_COUNT = ABSTRACT_JOINPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_JOINPOINT_OPERATION_COUNT = ABSTRACT_JOINPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.intermediate.impl.ModelJoinpointImpl <em>Model Joinpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.intermediate.impl.ModelJoinpointImpl
	 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getModelJoinpoint()
	 * @generated
	 */
	int MODEL_JOINPOINT = 3;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_JOINPOINT__TECHNOLOGY = ABSTRACT_JOINPOINT__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_JOINPOINT__REFERENCED_OBJECT = ABSTRACT_JOINPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_JOINPOINT_FEATURE_COUNT = ABSTRACT_JOINPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_JOINPOINT_OPERATION_COUNT = ABSTRACT_JOINPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.intermediate.impl.IntermediateModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.intermediate.impl.IntermediateModelImpl
	 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getIntermediateModel()
	 * @generated
	 */
	int INTERMEDIATE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL__ASPECTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kieker.develop.al.intermediate.IntermediateAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateAspect
	 * @generated
	 */
	EClass getIntermediateAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.al.intermediate.IntermediateAspect#getJoinpoints <em>Joinpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joinpoints</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateAspect#getJoinpoints()
	 * @see #getIntermediateAspect()
	 * @generated
	 */
	EReference getIntermediateAspect_Joinpoints();

	/**
	 * Returns the meta object for the reference list '{@link kieker.develop.al.intermediate.IntermediateAspect#getAdvices <em>Advices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Advices</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateAspect#getAdvices()
	 * @see #getIntermediateAspect()
	 * @generated
	 */
	EReference getIntermediateAspect_Advices();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.intermediate.AbstractJoinpoint <em>Abstract Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Joinpoint</em>'.
	 * @see kieker.develop.al.intermediate.AbstractJoinpoint
	 * @generated
	 */
	EClass getAbstractJoinpoint();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.intermediate.AbstractJoinpoint#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see kieker.develop.al.intermediate.AbstractJoinpoint#getTechnology()
	 * @see #getAbstractJoinpoint()
	 * @generated
	 */
	EAttribute getAbstractJoinpoint_Technology();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.intermediate.CodeJoinpoint <em>Code Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Joinpoint</em>'.
	 * @see kieker.develop.al.intermediate.CodeJoinpoint
	 * @generated
	 */
	EClass getCodeJoinpoint();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.intermediate.CodeJoinpoint#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see kieker.develop.al.intermediate.CodeJoinpoint#getArtifactName()
	 * @see #getCodeJoinpoint()
	 * @generated
	 */
	EAttribute getCodeJoinpoint_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.intermediate.CodeJoinpoint#getOperationSiganture <em>Operation Siganture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Siganture</em>'.
	 * @see kieker.develop.al.intermediate.CodeJoinpoint#getOperationSiganture()
	 * @see #getCodeJoinpoint()
	 * @generated
	 */
	EAttribute getCodeJoinpoint_OperationSiganture();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.intermediate.ModelJoinpoint <em>Model Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Joinpoint</em>'.
	 * @see kieker.develop.al.intermediate.ModelJoinpoint
	 * @generated
	 */
	EClass getModelJoinpoint();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.al.intermediate.ModelJoinpoint#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see kieker.develop.al.intermediate.ModelJoinpoint#getReferencedObject()
	 * @see #getModelJoinpoint()
	 * @generated
	 */
	EReference getModelJoinpoint_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.intermediate.IntermediateModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateModel
	 * @generated
	 */
	EClass getIntermediateModel();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.intermediate.IntermediateModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateModel#getName()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EAttribute getIntermediateModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.al.intermediate.IntermediateModel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see kieker.develop.al.intermediate.IntermediateModel#getAspects()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EReference getIntermediateModel_Aspects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateFactory getIntermediateFactory();

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
		 * The meta object literal for the '{@link kieker.develop.al.intermediate.impl.IntermediateAspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.intermediate.impl.IntermediateAspectImpl
		 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getIntermediateAspect()
		 * @generated
		 */
		EClass INTERMEDIATE_ASPECT = eINSTANCE.getIntermediateAspect();

		/**
		 * The meta object literal for the '<em><b>Joinpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ASPECT__JOINPOINTS = eINSTANCE.getIntermediateAspect_Joinpoints();

		/**
		 * The meta object literal for the '<em><b>Advices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ASPECT__ADVICES = eINSTANCE.getIntermediateAspect_Advices();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.intermediate.impl.AbstractJoinpointImpl <em>Abstract Joinpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.intermediate.impl.AbstractJoinpointImpl
		 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getAbstractJoinpoint()
		 * @generated
		 */
		EClass ABSTRACT_JOINPOINT = eINSTANCE.getAbstractJoinpoint();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_JOINPOINT__TECHNOLOGY = eINSTANCE.getAbstractJoinpoint_Technology();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.intermediate.impl.CodeJoinpointImpl <em>Code Joinpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.intermediate.impl.CodeJoinpointImpl
		 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getCodeJoinpoint()
		 * @generated
		 */
		EClass CODE_JOINPOINT = eINSTANCE.getCodeJoinpoint();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_JOINPOINT__ARTIFACT_NAME = eINSTANCE.getCodeJoinpoint_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Operation Siganture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_JOINPOINT__OPERATION_SIGANTURE = eINSTANCE.getCodeJoinpoint_OperationSiganture();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.intermediate.impl.ModelJoinpointImpl <em>Model Joinpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.intermediate.impl.ModelJoinpointImpl
		 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getModelJoinpoint()
		 * @generated
		 */
		EClass MODEL_JOINPOINT = eINSTANCE.getModelJoinpoint();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_JOINPOINT__REFERENCED_OBJECT = eINSTANCE.getModelJoinpoint_ReferencedObject();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.intermediate.impl.IntermediateModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.intermediate.impl.IntermediateModelImpl
		 * @see kieker.develop.al.intermediate.impl.IntermediatePackageImpl#getIntermediateModel()
		 * @generated
		 */
		EClass INTERMEDIATE_MODEL = eINSTANCE.getIntermediateModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_MODEL__NAME = eINSTANCE.getIntermediateModel_Name();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_MODEL__ASPECTS = eINSTANCE.getIntermediateModel_Aspects();

	}

} //IntermediatePackage
