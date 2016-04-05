/**
 */
package kieker.tools.al.aspectLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kieker.tools.al.aspectLang.AspectLangPackage#getTechnology()
 * @model
 * @generated
 */
public enum Technology implements Enumerator
{
  /**
   * The '<em><b>JAVA EE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JAVA_EE_VALUE
   * @generated
   * @ordered
   */
  JAVA_EE(0, "JAVA_EE", "javaee"),

  /**
   * The '<em><b>SERVLET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERVLET_VALUE
   * @generated
   * @ordered
   */
  SERVLET(1, "SERVLET", "servlet"),

  /**
   * The '<em><b>SPRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPRING_VALUE
   * @generated
   * @ordered
   */
  SPRING(2, "SPRING", "spring"),

  /**
   * The '<em><b>ASPECT J</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASPECT_J_VALUE
   * @generated
   * @ordered
   */
  ASPECT_J(3, "ASPECT_J", "aspectj");

  /**
   * The '<em><b>JAVA EE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JAVA EE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JAVA_EE
   * @model literal="javaee"
   * @generated
   * @ordered
   */
  public static final int JAVA_EE_VALUE = 0;

  /**
   * The '<em><b>SERVLET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SERVLET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SERVLET
   * @model literal="servlet"
   * @generated
   * @ordered
   */
  public static final int SERVLET_VALUE = 1;

  /**
   * The '<em><b>SPRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SPRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPRING
   * @model literal="spring"
   * @generated
   * @ordered
   */
  public static final int SPRING_VALUE = 2;

  /**
   * The '<em><b>ASPECT J</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASPECT J</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASPECT_J
   * @model literal="aspectj"
   * @generated
   * @ordered
   */
  public static final int ASPECT_J_VALUE = 3;

  /**
   * An array of all the '<em><b>Technology</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Technology[] VALUES_ARRAY =
    new Technology[]
    {
      JAVA_EE,
      SERVLET,
      SPRING,
      ASPECT_J,
    };

  /**
   * A public read-only list of all the '<em><b>Technology</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Technology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Technology</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Technology get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Technology result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Technology</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Technology getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Technology result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Technology</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Technology get(int value)
  {
    switch (value)
    {
      case JAVA_EE_VALUE: return JAVA_EE;
      case SERVLET_VALUE: return SERVLET;
      case SPRING_VALUE: return SPRING;
      case ASPECT_J_VALUE: return ASPECT_J;
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
  private Technology(int value, String name, String literal)
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
  
} //Technology
