package kieker.develop.rl.generator.java;

import java.util.List;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.ArraySize;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.typing.TypeResolution;
import kieker.develop.rl.typing.base.BaseTypes;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class JavaTypeMapping {
  private JavaTypeMapping() {
  }
  
  /**
   * @param classifier
   * 		A type name of the record language
   * @return
   * 		the Java type name of the given <code>classifier</code>
   */
  public static String createPrimitiveTypeName(final BaseType type) throws InternalErrorException {
    String _switchResult = null;
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case INT:
          _switchResult = "int";
          break;
        case LONG:
          _switchResult = "long";
          break;
        case SHORT:
          _switchResult = "short";
          break;
        case DOUBLE:
          _switchResult = "double";
          break;
        case FLOAT:
          _switchResult = "float";
          break;
        case CHAR:
          _switchResult = "char";
          break;
        case BYTE:
          _switchResult = "byte";
          break;
        case STRING:
          _switchResult = "String";
          break;
        case BOOLEAN:
          _switchResult = "boolean";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final BaseType type) throws InternalErrorException {
    String _switchResult = null;
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case INT:
          _switchResult = "Integer";
          break;
        case LONG:
          _switchResult = "Long";
          break;
        case SHORT:
          _switchResult = "Short";
          break;
        case DOUBLE:
          _switchResult = "Double";
          break;
        case FLOAT:
          _switchResult = "Float";
          break;
        case CHAR:
          _switchResult = "Character";
          break;
        case BYTE:
          _switchResult = "Byte";
          break;
        case STRING:
          _switchResult = "String";
          break;
        case BOOLEAN:
          _switchResult = "Boolean";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static String createTypeName(final Classifier classifier) {
    try {
      String _xifexpression = null;
      EList<ArraySize> _sizes = classifier.getSizes();
      int _size = _sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _xifexpression = JavaTypeMapping.createArrayTypeName(classifier);
      } else {
        BaseType _type = classifier.getType();
        _xifexpression = JavaTypeMapping.createPrimitiveTypeName(_type);
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static String createObjectTypeName(final Classifier classifier) {
    try {
      String _xifexpression = null;
      EList<ArraySize> _sizes = classifier.getSizes();
      int _size = _sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _xifexpression = JavaTypeMapping.createArrayTypeName(classifier);
      } else {
        BaseType _type = classifier.getType();
        _xifexpression = JavaTypeMapping.createPrimitiveWrapperTypeName(_type);
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Determine the right Java string for a given system array type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static String createArrayTypeName(final Classifier classifier) {
    try {
      String _xblockexpression = null;
      {
        BaseType _type = classifier.getType();
        final String primitiveTypeName = JavaTypeMapping.createPrimitiveTypeName(_type);
        EList<ArraySize> _sizes = classifier.getSizes();
        final Function1<ArraySize, String> _function = (ArraySize size) -> {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("[]");
          return _builder.toString();
        };
        List<String> _map = ListExtensions.<ArraySize, String>map(_sizes, _function);
        final String arrayBrackets = IterableExtensions.join(_map);
        _xblockexpression = (primitiveTypeName + arrayBrackets);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Determine the size of the resulting binary serialization.
   * 
   * @param allProperties
   * 		all properties of a record type
   * 
   * @returns
   * 		the computed value
   */
  public static int calculateSize(final Iterable<Property> list) {
    final Function2<Integer, Property, Integer> _function = (Integer result, Property property) -> {
      try {
        int _size = JavaTypeMapping.getSize(property);
        return Integer.valueOf(((result).intValue() + _size));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    return (int) IterableExtensions.<Property, Integer>fold(list, Integer.valueOf(0), _function);
  }
  
  /**
   * Determine the size of one type.
   * 
   * @param property
   * 		property which serialization size is determined.
   * 
   * @returns
   * 		the serialization size of the property
   */
  private static int getSize(final Property property) throws InternalErrorException {
    int _switchResult = (int) 0;
    Classifier _findType = TypeResolution.findType(property);
    BaseType _type = _findType.getType();
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          _switchResult = 4;
          break;
        case BYTE:
          _switchResult = 1;
          break;
        case SHORT:
          _switchResult = 2;
          break;
        case INT:
          _switchResult = 4;
          break;
        case LONG:
          _switchResult = 8;
          break;
        case FLOAT:
          _switchResult = 4;
          break;
        case DOUBLE:
          _switchResult = 8;
          break;
        case CHAR:
          _switchResult = 2;
          break;
        case BOOLEAN:
          _switchResult = 1;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
