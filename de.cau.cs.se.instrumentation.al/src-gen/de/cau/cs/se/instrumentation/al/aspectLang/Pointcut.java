/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getLocation <em>Location</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut()
 * @model
 * @generated
 */
public interface Pointcut extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

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
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(ApplicationModel)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut_Model()
   * @model
   * @generated
   */
  ApplicationModel getModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(ApplicationModel value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(LocationQuery)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut_Location()
   * @model containment="true"
   * @generated
   */
  LocationQuery getLocation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(LocationQuery value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(OperationQuery)
   * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getPointcut_Operation()
   * @model containment="true"
   * @generated
   */
  OperationQuery getOperation();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.al.aspectLang.Pointcut#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(OperationQuery value);

} // Pointcut
