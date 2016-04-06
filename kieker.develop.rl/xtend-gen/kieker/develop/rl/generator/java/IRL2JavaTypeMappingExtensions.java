package kieker.develop.rl.generator.java;

import com.google.common.base.Objects;
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
  public static String createPrimitiveTypeName(final BaseType classifier) {
    try {
      String _switchResult = null;
      String _name = classifier.getName();
      boolean _matched = false;
      if (!_matched) {
        String _typeName = BaseTypes.INT.getTypeName();
        if (Objects.equal(_name, _typeName)) {
          _matched=true;
          _switchResult = "int";
        }
      }
      if (!_matched) {
        String _typeName_1 = BaseTypes.LONG.getTypeName();
        if (Objects.equal(_name, _typeName_1)) {
          _matched=true;
          _switchResult = "long";
        }
      }
      if (!_matched) {
        String _typeName_2 = BaseTypes.SHORT.getTypeName();
        if (Objects.equal(_name, _typeName_2)) {
          _matched=true;
          _switchResult = "short";
        }
      }
      if (!_matched) {
        String _typeName_3 = BaseTypes.DOUBLE.getTypeName();
        if (Objects.equal(_name, _typeName_3)) {
          _matched=true;
          _switchResult = "double";
        }
      }
      if (!_matched) {
        String _typeName_4 = BaseTypes.FLOAT.getTypeName();
        if (Objects.equal(_name, _typeName_4)) {
          _matched=true;
          _switchResult = "float";
        }
      }
      if (!_matched) {
        String _typeName_5 = BaseTypes.CHAR.getTypeName();
        if (Objects.equal(_name, _typeName_5)) {
          _matched=true;
          _switchResult = "char";
        }
      }
      if (!_matched) {
        String _typeName_6 = BaseTypes.BYTE.getTypeName();
        if (Objects.equal(_name, _typeName_6)) {
          _matched=true;
          _switchResult = "byte";
        }
      }
      if (!_matched) {
        String _typeName_7 = BaseTypes.STRING.getTypeName();
        if (Objects.equal(_name, _typeName_7)) {
          _matched=true;
          _switchResult = "String";
        }
      }
      if (!_matched) {
        String _typeName_8 = BaseTypes.BOOLEAN.getTypeName();
        if (Objects.equal(_name, _typeName_8)) {
          _matched=true;
          _switchResult = "boolean";
        }
      }
      if (!_matched) {
        String _name_1 = classifier.getName();
        String _plus = ("Base type " + _name_1);
        String _plus_1 = (_plus + " is not a defined mapping type.");
        throw new InternalErrorException(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final BaseType classifier) {
    try {
      String _switchResult = null;
      String _name = classifier.getName();
      boolean _matched = false;
      if (!_matched) {
        String _typeName = BaseTypes.INT.getTypeName();
        if (Objects.equal(_name, _typeName)) {
          _matched=true;
          _switchResult = "Integer";
        }
      }
      if (!_matched) {
        String _typeName_1 = BaseTypes.LONG.getTypeName();
        if (Objects.equal(_name, _typeName_1)) {
          _matched=true;
          _switchResult = "Long";
        }
      }
      if (!_matched) {
        String _typeName_2 = BaseTypes.SHORT.getTypeName();
        if (Objects.equal(_name, _typeName_2)) {
          _matched=true;
          _switchResult = "Short";
        }
      }
      if (!_matched) {
        String _typeName_3 = BaseTypes.DOUBLE.getTypeName();
        if (Objects.equal(_name, _typeName_3)) {
          _matched=true;
          _switchResult = "Double";
        }
      }
      if (!_matched) {
        String _typeName_4 = BaseTypes.FLOAT.getTypeName();
        if (Objects.equal(_name, _typeName_4)) {
          _matched=true;
          _switchResult = "Float";
        }
      }
      if (!_matched) {
        String _typeName_5 = BaseTypes.CHAR.getTypeName();
        if (Objects.equal(_name, _typeName_5)) {
          _matched=true;
          _switchResult = "Character";
        }
      }
      if (!_matched) {
        String _typeName_6 = BaseTypes.BYTE.getTypeName();
        if (Objects.equal(_name, _typeName_6)) {
          _matched=true;
          _switchResult = "Byte";
        }
      }
      if (!_matched) {
        String _typeName_7 = BaseTypes.STRING.getTypeName();
        if (Objects.equal(_name, _typeName_7)) {
          _matched=true;
          _switchResult = "String";
        }
      }
      if (!_matched) {
        String _typeName_8 = BaseTypes.BOOLEAN.getTypeName();
        if (Objects.equal(_name, _typeName_8)) {
          _matched=true;
          _switchResult = "Boolean";
        }
      }
      if (!_matched) {
        String _name_1 = classifier.getName();
        String _plus = ("Base type " + _name_1);
        String _plus_1 = (_plus + " is not a defined mapping type.");
        throw new InternalErrorException(_plus_1);
      }
      return _switchResult;
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
  public static String createTypeName(final Classifier classifier) {
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
  }
}
