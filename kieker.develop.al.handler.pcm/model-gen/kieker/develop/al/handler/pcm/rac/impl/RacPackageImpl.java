/**
 */
package kieker.develop.al.handler.pcm.rac.impl;

import kieker.develop.al.handler.pcm.rac.AbstractTargetNode;
import kieker.develop.al.handler.pcm.rac.CodeTargetNode;
import kieker.develop.al.handler.pcm.rac.MappingModel;
import kieker.develop.al.handler.pcm.rac.ModelTargetNode;
import kieker.develop.al.handler.pcm.rac.PCMMapping;
import kieker.develop.al.handler.pcm.rac.RacFactory;
import kieker.develop.al.handler.pcm.rac.RacPackage;

import kieker.develop.al.handler.pcm.rac.SourceNode;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RacPackageImpl extends EPackageImpl implements RacPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTargetNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTargetNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTargetNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kieker.develop.al.handler.pcm.rac.RacPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RacPackageImpl() {
		super(eNS_URI, RacFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RacPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RacPackage init() {
		if (isInited) return (RacPackage)EPackage.Registry.INSTANCE.getEPackage(RacPackage.eNS_URI);

		// Obtain or create and register package
		RacPackageImpl theRacPackage = (RacPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RacPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RacPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRacPackage.createPackageContents();

		// Initialize created meta-data
		theRacPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRacPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RacPackage.eNS_URI, theRacPackage);
		return theRacPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_Mappings() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMMapping() {
		return pcmMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMMapping_Source() {
		return (EReference)pcmMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMMapping_Targets() {
		return (EReference)pcmMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceNode() {
		return sourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceNode_Reference() {
		return (EReference)sourceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceNode_ChildNode() {
		return (EReference)sourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTargetNode() {
		return abstractTargetNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTargetNode() {
		return modelTargetNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTargetNode_Reference() {
		return (EReference)modelTargetNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTargetNode() {
		return codeTargetNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTargetNode_Path() {
		return (EAttribute)codeTargetNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTargetNode_FullyQualifiedClassName() {
		return (EAttribute)codeTargetNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTargetNode_OperationSignature() {
		return (EAttribute)codeTargetNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RacFactory getRacFactory() {
		return (RacFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mappingModelEClass = createEClass(MAPPING_MODEL);
		createEReference(mappingModelEClass, MAPPING_MODEL__MAPPINGS);

		pcmMappingEClass = createEClass(PCM_MAPPING);
		createEReference(pcmMappingEClass, PCM_MAPPING__SOURCE);
		createEReference(pcmMappingEClass, PCM_MAPPING__TARGETS);

		sourceNodeEClass = createEClass(SOURCE_NODE);
		createEReference(sourceNodeEClass, SOURCE_NODE__CHILD_NODE);
		createEReference(sourceNodeEClass, SOURCE_NODE__REFERENCE);

		abstractTargetNodeEClass = createEClass(ABSTRACT_TARGET_NODE);

		modelTargetNodeEClass = createEClass(MODEL_TARGET_NODE);
		createEReference(modelTargetNodeEClass, MODEL_TARGET_NODE__REFERENCE);

		codeTargetNodeEClass = createEClass(CODE_TARGET_NODE);
		createEAttribute(codeTargetNodeEClass, CODE_TARGET_NODE__PATH);
		createEAttribute(codeTargetNodeEClass, CODE_TARGET_NODE__FULLY_QUALIFIED_CLASS_NAME);
		createEAttribute(codeTargetNodeEClass, CODE_TARGET_NODE__OPERATION_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelTargetNodeEClass.getESuperTypes().add(this.getAbstractTargetNode());
		codeTargetNodeEClass.getESuperTypes().add(this.getAbstractTargetNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingModel_Mappings(), this.getPCMMapping(), null, "mappings", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmMappingEClass, PCMMapping.class, "PCMMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMMapping_Source(), this.getSourceNode(), null, "source", null, 0, 1, PCMMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMMapping_Targets(), this.getCodeTargetNode(), null, "targets", null, 0, -1, PCMMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceNodeEClass, SourceNode.class, "SourceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceNode_ChildNode(), this.getSourceNode(), null, "childNode", null, 0, 1, SourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceNode_Reference(), theEntityPackage.getNamedElement(), null, "reference", null, 0, 1, SourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTargetNodeEClass, AbstractTargetNode.class, "AbstractTargetNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTargetNodeEClass, ModelTargetNode.class, "ModelTargetNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTargetNode_Reference(), ecorePackage.getEObject(), null, "reference", null, 1, 1, ModelTargetNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeTargetNodeEClass, CodeTargetNode.class, "CodeTargetNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeTargetNode_Path(), ecorePackage.getEString(), "path", null, 1, 1, CodeTargetNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeTargetNode_FullyQualifiedClassName(), ecorePackage.getEString(), "fullyQualifiedClassName", null, 0, 1, CodeTargetNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeTargetNode_OperationSignature(), ecorePackage.getEString(), "operationSignature", null, 1, 1, CodeTargetNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RacPackageImpl
