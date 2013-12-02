/**
 */
package de.cau.cs.se.instrumentation.rl.recordLang;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Classifier#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Classifier#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.cau.cs.se.instrumentation.rl.recordLang.Classifier#getSizes <em>Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getClassifier()
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
   * @see #setPackage(de.cau.cs.se.instrumentation.rl.recordLang.Package)
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getClassifier_Package()
   * @model
   * @generated
   */
  de.cau.cs.se.instrumentation.rl.recordLang.Package getPackage();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Classifier#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(de.cau.cs.se.instrumentation.rl.recordLang.Package value);

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
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getClassifier_Class()
   * @model
   * @generated
   */
  EClassifier getClass_();

  /**
   * Sets the value of the '{@link de.cau.cs.se.instrumentation.rl.recordLang.Classifier#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(EClassifier value);

  /**
   * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.ArraySize}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sizes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sizes</em>' containment reference list.
   * @see de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage#getClassifier_Sizes()
   * @model containment="true"
   * @generated
   */
  EList<ArraySize> getSizes();

} // Classifier
