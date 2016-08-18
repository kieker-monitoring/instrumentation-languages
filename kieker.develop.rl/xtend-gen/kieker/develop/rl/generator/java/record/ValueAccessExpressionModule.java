package kieker.develop.rl.generator.java.record;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class ValueAccessExpressionModule {
  /**
   * Create nested loops for array access.
   * 
   * @param sizes the different sizes of arrays, a size of 0 indicates a dynamic array range
   * @param depth indicates which dimension is addressed
   * @param propertyName the property of the associated array property
   * @param simpleTypeAction the action to be performed on non array level
   */
  public static CharSequence createArrayAccessLoops(final /* EList<ArraySize> */Object sizes, final int depth, final String propertyName, final CharSequence simpleTypeAction) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createArrayAccessLoops(EList<ArraySize>, int, String, CharSequence) from the type ValueAccessExpressionModule refers to the missing type ArraySize"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  /**
   * Creates an getter for a property including all array indices necessary to access
   * a single value of the array.
   * 
   * @return get/is + "capitalized property name" + "()" + "array access code"
   */
  public static CharSequence createGetterValueExpression(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\nsizes cannot be resolved"
      + "\ncreateArrayValueAccessIndizies cannot be resolved");
  }
  
  /**
   * Create property access expression ncluding all array indices necessary to access
   * a single value of the array.
   * 
   * @param property the property to be used in the expression
   */
  public static CharSequence createPropertyValueExpression(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nsizes cannot be resolved"
      + "\ncreateArrayValueAccessIndizies cannot be resolved");
  }
  
  /**
   * Used to compose a sequence of [iX] for every dimension of an array containing
   * the counter variable. If the variable is primitive the function returns an
   * empty string.
   * 
   * @param sizes list of array size values representing the array dimensions.
   */
  private static CharSequence createArrayValueAccessIndizies(final /* EList<ArraySize> */Object sizes) {
    String result = "";
    int _size = sizes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(result, "");
      _builder.append("[i");
      _builder.append(i, "");
      _builder.append("]");
      result = _builder.toString();
    }
    return result;
  }
  
  /**
   * This produces a sequence of [0] assuming that arrays follow a matrix layout.
   */
  public static String createCodeToDetermineArraySize(final int count) {
    String result = "";
    int i = 0;
    while ((i < count)) {
      {
        result = (result + "[0]");
        i = (i + 1);
      }
    }
    return result;
  }
}
