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
 * A representation of the literals of the enumeration '<em><b>Quantifier Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.se.instrumentation.language.probeLang.ProbeLangPackage#getQuantifierType()
 * @model
 * @generated
 */
public enum QuantifierType implements Enumerator
{
  /**
   * The '<em><b>NONE OR MANY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_OR_MANY_VALUE
   * @generated
   * @ordered
   */
  NONE_OR_MANY(0, "NONE_OR_MANY", "*"),

  /**
   * The '<em><b>OPTIONAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPTIONAL_VALUE
   * @generated
   * @ordered
   */
  OPTIONAL(1, "OPTIONAL", "?"),

  /**
   * The '<em><b>ONE OR MANY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_OR_MANY_VALUE
   * @generated
   * @ordered
   */
  ONE_OR_MANY(2, "ONE_OR_MANY", "+");

  /**
   * The '<em><b>NONE OR MANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE OR MANY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE_OR_MANY
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int NONE_OR_MANY_VALUE = 0;

  /**
   * The '<em><b>OPTIONAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPTIONAL
   * @model literal="?"
   * @generated
   * @ordered
   */
  public static final int OPTIONAL_VALUE = 1;

  /**
   * The '<em><b>ONE OR MANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE OR MANY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_OR_MANY
   * @model literal="+"
   * @generated
   * @ordered
   */
  public static final int ONE_OR_MANY_VALUE = 2;

  /**
   * An array of all the '<em><b>Quantifier Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final QuantifierType[] VALUES_ARRAY =
    new QuantifierType[]
    {
      NONE_OR_MANY,
      OPTIONAL,
      ONE_OR_MANY,
    };

  /**
   * A public read-only list of all the '<em><b>Quantifier Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<QuantifierType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Quantifier Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuantifierType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      QuantifierType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Quantifier Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuantifierType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      QuantifierType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Quantifier Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuantifierType get(int value)
  {
    switch (value)
    {
      case NONE_OR_MANY_VALUE: return NONE_OR_MANY;
      case OPTIONAL_VALUE: return OPTIONAL;
      case ONE_OR_MANY_VALUE: return ONE_OR_MANY;
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
  private QuantifierType(int value, String name, String literal)
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
  
} //QuantifierType
