/**
 */
package de.cau.cs.se.instrumentation.language.instrumentation;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' reference.
   * @see #setPackage(de.cau.cs.se.instrumentation.language.instrumentation.Package)
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getClassifier_Package()
   * @model
   * @generated
   */
  de.cau.cs.se.instrumentation.language.instrumentation.Package getPackage();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(de.cau.cs.se.instrumentation.language.instrumentation.Package value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(EClassifier)
   * @see de.cau.cs.se.instrumentation.language.instrumentation.InstrumentationPackage#getClassifier_Class()
   * @model
   * @generated
   */
  EClassifier getClass_();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.language.instrumentation.Classifier#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(EClassifier value);

} // Classifier
