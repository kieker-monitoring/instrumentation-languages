/**
 */
package kieker.develop.rl.recordLang;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kieker.develop.rl.recordLang.RecordLangFactory
 * @model kind="package"
 * @generated
 */
public interface RecordLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "recordLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/se/instrumentation/rl/RecordLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "recordLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RecordLangPackage eINSTANCE = kieker.develop.rl.recordLang.impl.RecordLangPackageImpl.init();

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ModelImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ImportImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.TypeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.BaseTypeImpl <em>Base Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.BaseTypeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBaseType()
   * @generated
   */
  int BASE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Base Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ComplexTypeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__AUTHOR = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__SINCE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__PARENTS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__PROPERTIES = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__CONSTANTS = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.TemplateTypeImpl <em>Template Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.TemplateTypeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getTemplateType()
   * @generated
   */
  int TEMPLATE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__AUTHOR = COMPLEX_TYPE__AUTHOR;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__SINCE = COMPLEX_TYPE__SINCE;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__PARENTS = COMPLEX_TYPE__PARENTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__PROPERTIES = COMPLEX_TYPE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__CONSTANTS = COMPLEX_TYPE__CONSTANTS;

  /**
   * The number of structural features of the '<em>Template Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.RecordTypeImpl <em>Record Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.RecordTypeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getRecordType()
   * @generated
   */
  int RECORD_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__AUTHOR = COMPLEX_TYPE__AUTHOR;

  /**
   * The feature id for the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__SINCE = COMPLEX_TYPE__SINCE;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__PARENTS = COMPLEX_TYPE__PARENTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__PROPERTIES = COMPLEX_TYPE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__CONSTANTS = COMPLEX_TYPE__CONSTANTS;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__ABSTRACT = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__PARENT = COMPLEX_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ConstantImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.PropertyImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__FOREIGN_KEY = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Refer To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__REFER_TO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 5;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ForeignKeyImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 9;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__RECORD_TYPE = 0;

  /**
   * The feature id for the '<em><b>Property Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__PROPERTY_REF = 1;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ClassifierImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__SIZES = 1;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ArraySizeImpl <em>Array Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ArraySizeImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getArraySize()
   * @generated
   */
  int ARRAY_SIZE = 11;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SIZE__SIZE = 0;

  /**
   * The number of structural features of the '<em>Array Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SIZE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.LiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 12;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ArrayLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getArrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LITERALS = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.StringLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.IntLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.FloatLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.BooleanLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.ConstantLiteralImpl <em>Constant Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.ConstantLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getConstantLiteral()
   * @generated
   */
  int CONSTANT_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.impl.BuiltInValueLiteralImpl <em>Built In Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.impl.BuiltInValueLiteralImpl
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBuiltInValueLiteral()
   * @generated
   */
  int BUILT_IN_VALUE_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_VALUE_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Built In Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_VALUE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kieker.develop.rl.recordLang.PropertyModifier <em>Property Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kieker.develop.rl.recordLang.PropertyModifier
   * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getPropertyModifier()
   * @generated
   */
  int PROPERTY_MODIFIER = 20;


  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see kieker.develop.rl.recordLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.rl.recordLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see kieker.develop.rl.recordLang.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see kieker.develop.rl.recordLang.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see kieker.develop.rl.recordLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see kieker.develop.rl.recordLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see kieker.develop.rl.recordLang.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.rl.recordLang.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.BaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Type</em>'.
   * @see kieker.develop.rl.recordLang.BaseType
   * @generated
   */
  EClass getBaseType();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.ComplexType#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType#getAuthor()
   * @see #getComplexType()
   * @generated
   */
  EAttribute getComplexType_Author();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.ComplexType#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType#getSince()
   * @see #getComplexType()
   * @generated
   */
  EAttribute getComplexType_Since();

  /**
   * Returns the meta object for the reference list '{@link kieker.develop.rl.recordLang.ComplexType#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parents</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType#getParents()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Parents();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.ComplexType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType#getProperties()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.ComplexType#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see kieker.develop.rl.recordLang.ComplexType#getConstants()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Constants();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.TemplateType <em>Template Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Type</em>'.
   * @see kieker.develop.rl.recordLang.TemplateType
   * @generated
   */
  EClass getTemplateType();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type</em>'.
   * @see kieker.develop.rl.recordLang.RecordType
   * @generated
   */
  EClass getRecordType();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.RecordType#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see kieker.develop.rl.recordLang.RecordType#isAbstract()
   * @see #getRecordType()
   * @generated
   */
  EAttribute getRecordType_Abstract();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.RecordType#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see kieker.develop.rl.recordLang.RecordType#getParent()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Parent();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see kieker.develop.rl.recordLang.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.rl.recordLang.Constant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see kieker.develop.rl.recordLang.Constant#getType()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Type();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.rl.recordLang.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.rl.recordLang.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see kieker.develop.rl.recordLang.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute list '{@link kieker.develop.rl.recordLang.Property#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see kieker.develop.rl.recordLang.Property#getModifiers()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.rl.recordLang.Property#getForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreign Key</em>'.
   * @see kieker.develop.rl.recordLang.Property#getForeignKey()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ForeignKey();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.rl.recordLang.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see kieker.develop.rl.recordLang.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.Property#getReferTo <em>Refer To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refer To</em>'.
   * @see kieker.develop.rl.recordLang.Property#getReferTo()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ReferTo();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kieker.develop.rl.recordLang.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link kieker.develop.rl.recordLang.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see kieker.develop.rl.recordLang.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.ForeignKey#getRecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Type</em>'.
   * @see kieker.develop.rl.recordLang.ForeignKey#getRecordType()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_RecordType();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.ForeignKey#getPropertyRef <em>Property Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property Ref</em>'.
   * @see kieker.develop.rl.recordLang.ForeignKey#getPropertyRef()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_PropertyRef();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see kieker.develop.rl.recordLang.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.Classifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see kieker.develop.rl.recordLang.Classifier#getType()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Type();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.Classifier#getSizes <em>Sizes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sizes</em>'.
   * @see kieker.develop.rl.recordLang.Classifier#getSizes()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Sizes();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.ArraySize <em>Array Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Size</em>'.
   * @see kieker.develop.rl.recordLang.ArraySize
   * @generated
   */
  EClass getArraySize();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.ArraySize#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see kieker.develop.rl.recordLang.ArraySize#getSize()
   * @see #getArraySize()
   * @generated
   */
  EAttribute getArraySize_Size();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see kieker.develop.rl.recordLang.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Literal</em>'.
   * @see kieker.develop.rl.recordLang.ArrayLiteral
   * @generated
   */
  EClass getArrayLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link kieker.develop.rl.recordLang.ArrayLiteral#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see kieker.develop.rl.recordLang.ArrayLiteral#getLiterals()
   * @see #getArrayLiteral()
   * @generated
   */
  EReference getArrayLiteral_Literals();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see kieker.develop.rl.recordLang.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see kieker.develop.rl.recordLang.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see kieker.develop.rl.recordLang.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see kieker.develop.rl.recordLang.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.ConstantLiteral <em>Constant Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Literal</em>'.
   * @see kieker.develop.rl.recordLang.ConstantLiteral
   * @generated
   */
  EClass getConstantLiteral();

  /**
   * Returns the meta object for the reference '{@link kieker.develop.rl.recordLang.ConstantLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.ConstantLiteral#getValue()
   * @see #getConstantLiteral()
   * @generated
   */
  EReference getConstantLiteral_Value();

  /**
   * Returns the meta object for class '{@link kieker.develop.rl.recordLang.BuiltInValueLiteral <em>Built In Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Value Literal</em>'.
   * @see kieker.develop.rl.recordLang.BuiltInValueLiteral
   * @generated
   */
  EClass getBuiltInValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link kieker.develop.rl.recordLang.BuiltInValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see kieker.develop.rl.recordLang.BuiltInValueLiteral#getValue()
   * @see #getBuiltInValueLiteral()
   * @generated
   */
  EAttribute getBuiltInValueLiteral_Value();

  /**
   * Returns the meta object for enum '{@link kieker.develop.rl.recordLang.PropertyModifier <em>Property Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Property Modifier</em>'.
   * @see kieker.develop.rl.recordLang.PropertyModifier
   * @generated
   */
  EEnum getPropertyModifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RecordLangFactory getRecordLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ModelImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ImportImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.TypeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.BaseTypeImpl <em>Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.BaseTypeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBaseType()
     * @generated
     */
    EClass BASE_TYPE = eINSTANCE.getBaseType();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ComplexTypeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_TYPE__AUTHOR = eINSTANCE.getComplexType_Author();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_TYPE__SINCE = eINSTANCE.getComplexType_Since();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__PARENTS = eINSTANCE.getComplexType_Parents();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__PROPERTIES = eINSTANCE.getComplexType_Properties();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__CONSTANTS = eINSTANCE.getComplexType_Constants();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.TemplateTypeImpl <em>Template Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.TemplateTypeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getTemplateType()
     * @generated
     */
    EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.RecordTypeImpl <em>Record Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.RecordTypeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getRecordType()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getRecordType();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE__ABSTRACT = eINSTANCE.getRecordType_Abstract();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__PARENT = eINSTANCE.getRecordType_Parent();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ConstantImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.PropertyImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__MODIFIERS = eINSTANCE.getProperty_Modifiers();

    /**
     * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__FOREIGN_KEY = eINSTANCE.getProperty_ForeignKey();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Refer To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__REFER_TO = eINSTANCE.getProperty_ReferTo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ForeignKeyImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Record Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__RECORD_TYPE = eINSTANCE.getForeignKey_RecordType();

    /**
     * The meta object literal for the '<em><b>Property Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__PROPERTY_REF = eINSTANCE.getForeignKey_PropertyRef();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ClassifierImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__TYPE = eINSTANCE.getClassifier_Type();

    /**
     * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__SIZES = eINSTANCE.getClassifier_Sizes();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ArraySizeImpl <em>Array Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ArraySizeImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getArraySize()
     * @generated
     */
    EClass ARRAY_SIZE = eINSTANCE.getArraySize();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_SIZE__SIZE = eINSTANCE.getArraySize_Size();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.LiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ArrayLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getArrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__LITERALS = eINSTANCE.getArrayLiteral_Literals();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.StringLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.IntLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.FloatLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.BooleanLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.ConstantLiteralImpl <em>Constant Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.ConstantLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getConstantLiteral()
     * @generated
     */
    EClass CONSTANT_LITERAL = eINSTANCE.getConstantLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_LITERAL__VALUE = eINSTANCE.getConstantLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.impl.BuiltInValueLiteralImpl <em>Built In Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.impl.BuiltInValueLiteralImpl
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getBuiltInValueLiteral()
     * @generated
     */
    EClass BUILT_IN_VALUE_LITERAL = eINSTANCE.getBuiltInValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_VALUE_LITERAL__VALUE = eINSTANCE.getBuiltInValueLiteral_Value();

    /**
     * The meta object literal for the '{@link kieker.develop.rl.recordLang.PropertyModifier <em>Property Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kieker.develop.rl.recordLang.PropertyModifier
     * @see kieker.develop.rl.recordLang.impl.RecordLangPackageImpl#getPropertyModifier()
     * @generated
     */
    EEnum PROPERTY_MODIFIER = eINSTANCE.getPropertyModifier();

  }

} //RecordLangPackage
