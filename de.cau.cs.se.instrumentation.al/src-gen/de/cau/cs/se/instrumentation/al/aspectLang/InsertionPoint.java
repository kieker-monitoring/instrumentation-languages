/**
 */
package de.cau.cs.se.instrumentation.al.aspectLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Insertion Point</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage#getInsertionPoint()
 * @model
 * @generated
 */
public enum InsertionPoint implements Enumerator
{
  /**
   * The '<em><b>BEFORE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_VALUE
   * @generated
   * @ordered
   */
  BEFORE(0, "BEFORE", "before"),

  /**
   * The '<em><b>AFTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTER_VALUE
   * @generated
   * @ordered
   */
  AFTER(1, "AFTER", "after");

  /**
   * The '<em><b>BEFORE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BEFORE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFORE
   * @model literal="before"
   * @generated
   * @ordered
   */
  public static final int BEFORE_VALUE = 0;

  /**
   * The '<em><b>AFTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AFTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AFTER
   * @model literal="after"
   * @generated
   * @ordered
   */
  public static final int AFTER_VALUE = 1;

  /**
   * An array of all the '<em><b>Insertion Point</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final InsertionPoint[] VALUES_ARRAY =
    new InsertionPoint[]
    {
      BEFORE,
      AFTER,
    };

  /**
   * A public read-only list of all the '<em><b>Insertion Point</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<InsertionPoint> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Insertion Point</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InsertionPoint get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InsertionPoint result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Insertion Point</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InsertionPoint getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InsertionPoint result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Insertion Point</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InsertionPoint get(int value)
  {
    switch (value)
    {
      case BEFORE_VALUE: return BEFORE;
      case AFTER_VALUE: return AFTER;
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
  private InsertionPoint(int value, String name, String literal)
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
  
} //InsertionPoint
