/**
 */
package kieker.develop.al.intermediate.impl;

import kieker.develop.al.aspectLang.AspectLangPackage;

import kieker.develop.al.intermediate.AbstractJoinpoint;
import kieker.develop.al.intermediate.CodeJoinpoint;
import kieker.develop.al.intermediate.IntermediateAspect;
import kieker.develop.al.intermediate.IntermediateFactory;
import kieker.develop.al.intermediate.IntermediateModel;
import kieker.develop.al.intermediate.IntermediatePackage;
import kieker.develop.al.intermediate.ModelJoinpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediatePackageImpl extends EPackageImpl implements IntermediatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractJoinpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeJoinpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelJoinpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateModelEClass = null;

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
	 * @see kieker.develop.al.intermediate.IntermediatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediatePackageImpl() {
		super(eNS_URI, IntermediateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediatePackage init() {
		if (isInited) return (IntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(IntermediatePackage.eNS_URI);

		// Obtain or create and register package
		IntermediatePackageImpl theIntermediatePackage = (IntermediatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AspectLangPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntermediatePackage.createPackageContents();

		// Initialize created meta-data
		theIntermediatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediatePackage.eNS_URI, theIntermediatePackage);
		return theIntermediatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateAspect() {
		return intermediateAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateAspect_Joinpoints() {
		return (EReference)intermediateAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateAspect_Advices() {
		return (EReference)intermediateAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractJoinpoint() {
		return abstractJoinpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractJoinpoint_Technology() {
		return (EAttribute)abstractJoinpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeJoinpoint() {
		return codeJoinpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeJoinpoint_ArtifactName() {
		return (EAttribute)codeJoinpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeJoinpoint_OperationSiganture() {
		return (EAttribute)codeJoinpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelJoinpoint() {
		return modelJoinpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelJoinpoint_ReferencedObject() {
		return (EReference)modelJoinpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateModel() {
		return intermediateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateModel_Name() {
		return (EAttribute)intermediateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateModel_Aspects() {
		return (EReference)intermediateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactory getIntermediateFactory() {
		return (IntermediateFactory)getEFactoryInstance();
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
		intermediateAspectEClass = createEClass(INTERMEDIATE_ASPECT);
		createEReference(intermediateAspectEClass, INTERMEDIATE_ASPECT__JOINPOINTS);
		createEReference(intermediateAspectEClass, INTERMEDIATE_ASPECT__ADVICES);

		abstractJoinpointEClass = createEClass(ABSTRACT_JOINPOINT);
		createEAttribute(abstractJoinpointEClass, ABSTRACT_JOINPOINT__TECHNOLOGY);

		codeJoinpointEClass = createEClass(CODE_JOINPOINT);
		createEAttribute(codeJoinpointEClass, CODE_JOINPOINT__ARTIFACT_NAME);
		createEAttribute(codeJoinpointEClass, CODE_JOINPOINT__OPERATION_SIGANTURE);

		modelJoinpointEClass = createEClass(MODEL_JOINPOINT);
		createEReference(modelJoinpointEClass, MODEL_JOINPOINT__REFERENCED_OBJECT);

		intermediateModelEClass = createEClass(INTERMEDIATE_MODEL);
		createEAttribute(intermediateModelEClass, INTERMEDIATE_MODEL__NAME);
		createEReference(intermediateModelEClass, INTERMEDIATE_MODEL__ASPECTS);
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
		AspectLangPackage theAspectLangPackage = (AspectLangPackage)EPackage.Registry.INSTANCE.getEPackage(AspectLangPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeJoinpointEClass.getESuperTypes().add(this.getAbstractJoinpoint());
		modelJoinpointEClass.getESuperTypes().add(this.getAbstractJoinpoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(intermediateAspectEClass, IntermediateAspect.class, "IntermediateAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateAspect_Joinpoints(), this.getAbstractJoinpoint(), null, "joinpoints", null, 0, -1, IntermediateAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateAspect_Advices(), theAspectLangPackage.getAdvice(), null, "advices", null, 0, -1, IntermediateAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractJoinpointEClass, AbstractJoinpoint.class, "AbstractJoinpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractJoinpoint_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, AbstractJoinpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeJoinpointEClass, CodeJoinpoint.class, "CodeJoinpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeJoinpoint_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 1, 1, CodeJoinpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeJoinpoint_OperationSiganture(), ecorePackage.getEString(), "operationSiganture", null, 0, 1, CodeJoinpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelJoinpointEClass, ModelJoinpoint.class, "ModelJoinpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelJoinpoint_ReferencedObject(), theEcorePackage.getEObject(), null, "referencedObject", null, 0, 1, ModelJoinpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateModelEClass, IntermediateModel.class, "IntermediateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, IntermediateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateModel_Aspects(), this.getIntermediateAspect(), null, "aspects", null, 0, -1, IntermediateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntermediatePackageImpl
