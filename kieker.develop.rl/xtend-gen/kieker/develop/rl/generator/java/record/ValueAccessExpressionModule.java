package kieker.develop.rl.generator.java.record;

import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.ArraySize;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.validation.PropertyEvaluation;
import org.eclipse.emf.common.util.EList;
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
  public static CharSequence createArrayAccessLoops(final EList<ArraySize> sizes, final int depth, final String propertyName, final CharSequence simpleTypeAction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for (int i");
    _builder.append(depth, "");
    _builder.append("=0;i");
    _builder.append(depth, "");
    _builder.append("<");
    Object _xifexpression = null;
    ArraySize _get = sizes.get(depth);
    int _size = _get.getSize();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      ArraySize _get_1 = sizes.get(depth);
      _xifexpression = Integer.valueOf(_get_1.getSize());
    } else {
      _xifexpression = ((("_" + propertyName) + "_size") + Integer.valueOf(depth));
    }
    _builder.append(_xifexpression, "");
    _builder.append(";i");
    _builder.append(depth, "");
    _builder.append("++)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _xifexpression_1 = null;
    int _size_1 = sizes.size();
    int _minus = (_size_1 - 1);
    boolean _greaterThan_1 = (_minus > depth);
    if (_greaterThan_1) {
      _xifexpression_1 = ValueAccessExpressionModule.createArrayAccessLoops(sizes, (depth + 1), propertyName, simpleTypeAction);
    } else {
      _xifexpression_1 = simpleTypeAction;
    }
    _builder.append(_xifexpression_1, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Creates an getter for a property including all array indices necessary to access
   * a single value of the array.
   * 
   * @return get/is + "capitalized property name" + "()" + "array access code"
   */
  public static CharSequence createGetterValueExpression(final Property property) {
    CharSequence _xblockexpression = null;
    {
      Classifier _type = property.getType();
      final EList<ArraySize> sizes = _type.getSizes();
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _createGetterName = NameResolver.createGetterName(property);
      _builder.append(_createGetterName, "");
      _builder.append("()");
      CharSequence _createArrayValueAccessIndizies = ValueAccessExpressionModule.createArrayValueAccessIndizies(sizes);
      _builder.append(_createArrayValueAccessIndizies, "");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Create property access expression ncluding all array indices necessary to access
   * a single value of the array.
   * 
   * @param property the property to be used in the expression
   */
  public static CharSequence createPropertyValueExpression(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = property.getName();
    _builder.append(_name, "");
    Classifier _findType = PropertyEvaluation.findType(property);
    EList<ArraySize> _sizes = _findType.getSizes();
    CharSequence _createArrayValueAccessIndizies = ValueAccessExpressionModule.createArrayValueAccessIndizies(_sizes);
    _builder.append(_createArrayValueAccessIndizies, "");
    return _builder;
  }
  
  /**
   * Used to compose a sequence of [iX] for every dimension of an array containing
   * the counter variable. If the variable is primitive the function returns an
   * empty string.
   * 
   * @param sizes list of array size values representing the array dimensions.
   */
  private static CharSequence createArrayValueAccessIndizies(final EList<ArraySize> sizes) {
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
