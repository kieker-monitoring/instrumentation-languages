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
	String eNS_URI = "http://www.iobserve-devops.net/pcm/rac";

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
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MAPPING__TARGETS = 1;

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
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl <em>Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getSourceNode()
	 * @generated
	 */
	int SOURCE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__CHILD_NODE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.AbstractTargetNode <em>Abstract Target Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.AbstractTargetNode
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getAbstractTargetNode()
	 * @generated
	 */
	int ABSTRACT_TARGET_NODE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TARGET_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TARGET_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.impl.ModelTargetNodeImpl <em>Model Target Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.impl.ModelTargetNodeImpl
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getModelTargetNode()
	 * @generated
	 */
	int MODEL_TARGET_NODE = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TARGET_NODE__REFERENCE = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TARGET_NODE_FEATURE_COUNT = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TARGET_NODE_OPERATION_COUNT = ABSTRACT_TARGET_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl <em>Code Target Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl
	 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getCodeTargetNode()
	 * @generated
	 */
	int CODE_TARGET_NODE = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TARGET_NODE__PATH = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TARGET_NODE__OPERATION_SIGNATURE = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TARGET_NODE_FEATURE_COUNT = ABSTRACT_TARGET_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Code Target Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TARGET_NODE_OPERATION_COUNT = ABSTRACT_TARGET_NODE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping#getSource()
	 * @see #getPCMMapping()
	 * @generated
	 */
	EReference getPCMMapping_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.al.handler.pcm.rac.PCMMapping#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.PCMMapping#getTargets()
	 * @see #getPCMMapping()
	 * @generated
	 */
	EReference getPCMMapping_Targets();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.SourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Node</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.SourceNode
	 * @generated
	 */
	EClass getSourceNode();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.al.handler.pcm.rac.SourceNode#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.SourceNode#getReference()
	 * @see #getSourceNode()
	 * @generated
	 */
	EReference getSourceNode_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link kieker.develop.al.handler.pcm.rac.SourceNode#getChildNode <em>Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Node</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.SourceNode#getChildNode()
	 * @see #getSourceNode()
	 * @generated
	 */
	EReference getSourceNode_ChildNode();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.AbstractTargetNode <em>Abstract Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Target Node</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.AbstractTargetNode
	 * @generated
	 */
	EClass getAbstractTargetNode();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.ModelTargetNode <em>Model Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Target Node</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.ModelTargetNode
	 * @generated
	 */
	EClass getModelTargetNode();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.al.handler.pcm.rac.ModelTargetNode#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.ModelTargetNode#getReference()
	 * @see #getModelTargetNode()
	 * @generated
	 */
	EReference getModelTargetNode_Reference();

	/**
	 * Returns the meta object for class '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode <em>Code Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Target Node</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.CodeTargetNode
	 * @generated
	 */
	EClass getCodeTargetNode();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.CodeTargetNode#getPath()
	 * @see #getCodeTargetNode()
	 * @generated
	 */
	EAttribute getCodeTargetNode_Path();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.CodeTargetNode#getFullyQualifiedClassName()
	 * @see #getCodeTargetNode()
	 * @generated
	 */
	EAttribute getCodeTargetNode_FullyQualifiedClassName();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.al.handler.pcm.rac.CodeTargetNode#getOperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Signature</em>'.
	 * @see kieker.develop.al.handler.pcm.rac.CodeTargetNode#getOperationSignature()
	 * @see #getCodeTargetNode()
	 * @generated
	 */
	EAttribute getCodeTargetNode_OperationSignature();

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
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MAPPING__SOURCE = eINSTANCE.getPCMMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MAPPING__TARGETS = eINSTANCE.getPCMMapping_Targets();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl <em>Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.impl.SourceNodeImpl
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getSourceNode()
		 * @generated
		 */
		EClass SOURCE_NODE = eINSTANCE.getSourceNode();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_NODE__REFERENCE = eINSTANCE.getSourceNode_Reference();

		/**
		 * The meta object literal for the '<em><b>Child Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_NODE__CHILD_NODE = eINSTANCE.getSourceNode_ChildNode();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.AbstractTargetNode <em>Abstract Target Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.AbstractTargetNode
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getAbstractTargetNode()
		 * @generated
		 */
		EClass ABSTRACT_TARGET_NODE = eINSTANCE.getAbstractTargetNode();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.impl.ModelTargetNodeImpl <em>Model Target Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.impl.ModelTargetNodeImpl
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getModelTargetNode()
		 * @generated
		 */
		EClass MODEL_TARGET_NODE = eINSTANCE.getModelTargetNode();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TARGET_NODE__REFERENCE = eINSTANCE.getModelTargetNode_Reference();

		/**
		 * The meta object literal for the '{@link kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl <em>Code Target Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.al.handler.pcm.rac.impl.CodeTargetNodeImpl
		 * @see kieker.develop.al.handler.pcm.rac.impl.RacPackageImpl#getCodeTargetNode()
		 * @generated
		 */
		EClass CODE_TARGET_NODE = eINSTANCE.getCodeTargetNode();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TARGET_NODE__PATH = eINSTANCE.getCodeTargetNode_Path();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getCodeTargetNode_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '<em><b>Operation Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TARGET_NODE__OPERATION_SIGNATURE = eINSTANCE.getCodeTargetNode_OperationSignature();

	}

} //RacPackage
