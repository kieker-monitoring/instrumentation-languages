package kieker.develop.rl.generator.java;

import java.util.List;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.ArraySize;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.typing.BaseTypes;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class IRL2JavaTypeMappingExtensions {
  private IRL2JavaTypeMappingExtensions() {
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
        _xifexpression = IRL2JavaTypeMappingExtensions.createArrayTypeName(classifier);
      } else {
        BaseType _type = classifier.getType();
        _xifexpression = IRL2JavaTypeMappingExtensions.createPrimitiveTypeName(_type);
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
        _xifexpression = IRL2JavaTypeMappingExtensions.createArrayTypeName(classifier);
      } else {
        BaseType _type = classifier.getType();
        _xifexpression = IRL2JavaTypeMappingExtensions.createPrimitiveWrapperTypeName(_type);
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
        final String primitiveTypeName = IRL2JavaTypeMappingExtensions.createPrimitiveTypeName(_type);
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
}
