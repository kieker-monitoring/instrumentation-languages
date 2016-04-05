/**
 */
package kieker.develop.al.aspectLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reflection Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kieker.develop.al.aspectLang.AspectLangPackage#getReflectionFunction()
 * @model
 * @generated
 */
public enum ReflectionFunction implements Enumerator
{
  /**
   * The '<em><b>NAME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NAME_VALUE
   * @generated
   * @ordered
   */
  NAME(0, "NAME", "name"),

  /**
   * The '<em><b>SIGNATURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNATURE_VALUE
   * @generated
   * @ordered
   */
  SIGNATURE(1, "SIGNATURE", "signature"),

  /**
   * The '<em><b>CLASS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLASS_VALUE
   * @generated
   * @ordered
   */
  CLASS(2, "CLASS", "classname"),

  /**
   * The '<em><b>RETURN TYPE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RETURN_TYPE_VALUE
   * @generated
   * @ordered
   */
  RETURN_TYPE(3, "RETURN_TYPE", "return-type");

  /**
   * The '<em><b>NAME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NAME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NAME
   * @model literal="name"
   * @generated
   * @ordered
   */
  public static final int NAME_VALUE = 0;

  /**
   * The '<em><b>SIGNATURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIGNATURE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNATURE
   * @model literal="signature"
   * @generated
   * @ordered
   */
  public static final int SIGNATURE_VALUE = 1;

  /**
   * The '<em><b>CLASS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLASS
   * @model literal="classname"
   * @generated
   * @ordered
   */
  public static final int CLASS_VALUE = 2;

  /**
   * The '<em><b>RETURN TYPE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RETURN TYPE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RETURN_TYPE
   * @model literal="return-type"
   * @generated
   * @ordered
   */
  public static final int RETURN_TYPE_VALUE = 3;

  /**
   * An array of all the '<em><b>Reflection Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ReflectionFunction[] VALUES_ARRAY =
    new ReflectionFunction[]
    {
      NAME,
      SIGNATURE,
      CLASS,
      RETURN_TYPE,
    };

  /**
   * A public read-only list of all the '<em><b>Reflection Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ReflectionFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Reflection Function</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReflectionFunction get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ReflectionFunction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reflection Function</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReflectionFunction getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ReflectionFunction result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reflection Function</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReflectionFunction get(int value)
  {
    switch (value)
    {
      case NAME_VALUE: return NAME;
      case SIGNATURE_VALUE: return SIGNATURE;
      case CLASS_VALUE: return CLASS;
      case RETURN_TYPE_VALUE: return RETURN_TYPE;
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
  private ReflectionFunction(int value, String name, String literal)
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
  
} //ReflectionFunction
