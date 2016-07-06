/**
 */
package kieker.develop.rl.recordLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getAuthor <em>Author</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getSince <em>Since</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getTemplates <em>Templates</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getRoot <em>Root</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getConstants <em>Constants</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.Schema#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Schema#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Since</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since</em>' attribute.
   * @see #setSince(String)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Since()
   * @model
   * @generated
   */
  String getSince();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Schema#getSince <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' attribute.
   * @see #getSince()
   * @generated
   */
  void setSince(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Templates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' containment reference.
   * @see #setTemplates(Templates)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Templates()
   * @model containment="true"
   * @generated
   */
  Templates getTemplates();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Schema#getTemplates <em>Templates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Templates</em>' containment reference.
   * @see #getTemplates()
   * @generated
   */
  void setTemplates(Templates value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(RootType)
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Root()
   * @model containment="true"
   * @generated
   */
  RootType getRoot();

  /**
   * Sets the value of the '{@link kieker.develop.rl.recordLang.Schema#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(RootType value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link kieker.develop.rl.recordLang.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link kieker.develop.rl.recordLang.Constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Constants()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getConstants();

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link kieker.develop.rl.recordLang.TemplateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parents</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see kieker.develop.rl.recordLang.RecordLangPackage#getSchema_Parents()
   * @model
   * @generated
   */
  EList<TemplateType> getParents();

} // Schema
