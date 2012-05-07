/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.se.instrumentation.language.probeLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getOperatorType()
 * @model
 * @generated
 */
public enum OperatorType implements Enumerator
{
  /**
   * The '<em><b>ANY CHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANY_CHAR_VALUE
   * @generated
   * @ordered
   */
  ANY_CHAR(0, "ANY_CHAR", "."),

  /**
   * The '<em><b>WHITE SPACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHITE_SPACE_VALUE
   * @generated
   * @ordered
   */
  WHITE_SPACE(1, "WHITE_SPACE", "\\s"),

  /**
   * The '<em><b>NON WHITE SPACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NON_WHITE_SPACE_VALUE
   * @generated
   * @ordered
   */
  NON_WHITE_SPACE(2, "NON_WHITE_SPACE", "\\S"),

  /**
   * The '<em><b>WORD CHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORD_CHAR_VALUE
   * @generated
   * @ordered
   */
  WORD_CHAR(3, "WORD_CHAR", "\\w"),

  /**
   * The '<em><b>NON WORD CHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NON_WORD_CHAR_VALUE
   * @generated
   * @ordered
   */
  NON_WORD_CHAR(4, "NON_WORD_CHAR", "\\W"),

  /**
   * The '<em><b>DIGIT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIGIT_VALUE
   * @generated
   * @ordered
   */
  DIGIT(5, "DIGIT", "\\d"),

  /**
   * The '<em><b>NON DIGIT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NON_DIGIT_VALUE
   * @generated
   * @ordered
   */
  NON_DIGIT(6, "NON_DIGIT", "\\D");

  /**
   * The '<em><b>ANY CHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANY CHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANY_CHAR
   * @model literal="."
   * @generated
   * @ordered
   */
  public static final int ANY_CHAR_VALUE = 0;

  /**
   * The '<em><b>WHITE SPACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WHITE SPACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHITE_SPACE
   * @model literal="\\s"
   * @generated
   * @ordered
   */
  public static final int WHITE_SPACE_VALUE = 1;

  /**
   * The '<em><b>NON WHITE SPACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NON WHITE SPACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NON_WHITE_SPACE
   * @model literal="\\S"
   * @generated
   * @ordered
   */
  public static final int NON_WHITE_SPACE_VALUE = 2;

  /**
   * The '<em><b>WORD CHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WORD CHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORD_CHAR
   * @model literal="\\w"
   * @generated
   * @ordered
   */
  public static final int WORD_CHAR_VALUE = 3;

  /**
   * The '<em><b>NON WORD CHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NON WORD CHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NON_WORD_CHAR
   * @model literal="\\W"
   * @generated
   * @ordered
   */
  public static final int NON_WORD_CHAR_VALUE = 4;

  /**
   * The '<em><b>DIGIT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIGIT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIGIT
   * @model literal="\\d"
   * @generated
   * @ordered
   */
  public static final int DIGIT_VALUE = 5;

  /**
   * The '<em><b>NON DIGIT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NON DIGIT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NON_DIGIT
   * @model literal="\\D"
   * @generated
   * @ordered
   */
  public static final int NON_DIGIT_VALUE = 6;

  /**
   * An array of all the '<em><b>Operator Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OperatorType[] VALUES_ARRAY =
    new OperatorType[]
    {
      ANY_CHAR,
      WHITE_SPACE,
      NON_WHITE_SPACE,
      WORD_CHAR,
      NON_WORD_CHAR,
      DIGIT,
      NON_DIGIT,
    };

  /**
   * A public read-only list of all the '<em><b>Operator Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Operator Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperatorType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperatorType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operator Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperatorType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperatorType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operator Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperatorType get(int value)
  {
    switch (value)
    {
      case ANY_CHAR_VALUE: return ANY_CHAR;
      case WHITE_SPACE_VALUE: return WHITE_SPACE;
      case NON_WHITE_SPACE_VALUE: return NON_WHITE_SPACE;
      case WORD_CHAR_VALUE: return WORD_CHAR;
      case NON_WORD_CHAR_VALUE: return NON_WORD_CHAR;
      case DIGIT_VALUE: return DIGIT;
      case NON_DIGIT_VALUE: return NON_DIGIT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OperatorType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OperatorType
