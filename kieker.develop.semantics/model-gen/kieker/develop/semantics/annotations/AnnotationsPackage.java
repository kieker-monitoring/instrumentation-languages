/**
 */
package kieker.develop.semantics.annotations;

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
 * @see kieker.develop.semantics.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kieker-monitoring.net/kieker/develop/semantic-annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.NamedElement
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.impl.AnnotationImpl
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IMPLEMENTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.impl.ImplementationImpl
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.impl.SemanticsImpl <em>Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.impl.SemanticsImpl
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getSemantics()
	 * @generated
	 */
	int SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__LANGUAGES = 1;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__TECHNOLOGIES = 2;

	/**
	 * The number of structural features of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.impl.TargetLanguageImpl <em>Target Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.impl.TargetLanguageImpl
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getTargetLanguage()
	 * @generated
	 */
	int TARGET_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LANGUAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Target Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LANGUAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_LANGUAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kieker.develop.semantics.annotations.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kieker.develop.semantics.annotations.impl.TechnologyImpl
	 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see kieker.develop.semantics.annotations.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.semantics.annotations.Annotation#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementations</em>'.
	 * @see kieker.develop.semantics.annotations.Annotation#getImplementations()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Implementations();

	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see kieker.develop.semantics.annotations.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.semantics.annotations.Implementation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see kieker.develop.semantics.annotations.Implementation#getCode()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Code();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.semantics.annotations.Implementation#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Technology</em>'.
	 * @see kieker.develop.semantics.annotations.Implementation#getTechnology()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Technology();

	/**
	 * Returns the meta object for the reference '{@link kieker.develop.semantics.annotations.Implementation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see kieker.develop.semantics.annotations.Implementation#getLanguage()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Language();

	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantics</em>'.
	 * @see kieker.develop.semantics.annotations.Semantics
	 * @generated
	 */
	EClass getSemantics();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.semantics.annotations.Semantics#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see kieker.develop.semantics.annotations.Semantics#getAnnotations()
	 * @see #getSemantics()
	 * @generated
	 */
	EReference getSemantics_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.semantics.annotations.Semantics#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see kieker.develop.semantics.annotations.Semantics#getLanguages()
	 * @see #getSemantics()
	 * @generated
	 */
	EReference getSemantics_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link kieker.develop.semantics.annotations.Semantics#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see kieker.develop.semantics.annotations.Semantics#getTechnologies()
	 * @see #getSemantics()
	 * @generated
	 */
	EReference getSemantics_Technologies();

	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.TargetLanguage <em>Target Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Language</em>'.
	 * @see kieker.develop.semantics.annotations.TargetLanguage
	 * @generated
	 */
	EClass getTargetLanguage();

	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see kieker.develop.semantics.annotations.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for class '{@link kieker.develop.semantics.annotations.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see kieker.develop.semantics.annotations.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link kieker.develop.semantics.annotations.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kieker.develop.semantics.annotations.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

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
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.impl.AnnotationImpl
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__IMPLEMENTATIONS = eINSTANCE.getAnnotation_Implementations();

		/**
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.impl.ImplementationImpl
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__CODE = eINSTANCE.getImplementation_Code();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__TECHNOLOGY = eINSTANCE.getImplementation_Technology();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__LANGUAGE = eINSTANCE.getImplementation_Language();

		/**
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.impl.SemanticsImpl <em>Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.impl.SemanticsImpl
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getSemantics()
		 * @generated
		 */
		EClass SEMANTICS = eINSTANCE.getSemantics();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTICS__ANNOTATIONS = eINSTANCE.getSemantics_Annotations();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTICS__LANGUAGES = eINSTANCE.getSemantics_Languages();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTICS__TECHNOLOGIES = eINSTANCE.getSemantics_Technologies();

		/**
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.impl.TargetLanguageImpl <em>Target Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.impl.TargetLanguageImpl
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getTargetLanguage()
		 * @generated
		 */
		EClass TARGET_LANGUAGE = eINSTANCE.getTargetLanguage();

		/**
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.impl.TechnologyImpl
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '{@link kieker.develop.semantics.annotations.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kieker.develop.semantics.annotations.NamedElement
		 * @see kieker.develop.semantics.annotations.impl.AnnotationsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //AnnotationsPackage
