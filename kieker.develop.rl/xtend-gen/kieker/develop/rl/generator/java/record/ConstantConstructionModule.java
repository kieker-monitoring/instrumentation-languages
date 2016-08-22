package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.util.List;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.generator.java.JavaTypeMapping;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.ArrayLiteral;
import kieker.develop.rl.recordLang.BooleanLiteral;
import kieker.develop.rl.recordLang.BuiltInValueLiteral;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Constant;
import kieker.develop.rl.recordLang.ConstantLiteral;
import kieker.develop.rl.recordLang.FloatLiteral;
import kieker.develop.rl.recordLang.IntLiteral;
import kieker.develop.rl.recordLang.Literal;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.StringLiteral;
import kieker.develop.rl.typing.BaseTypes;
import kieker.develop.rl.typing.TypeResolution;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ConstantConstructionModule {
  /**
   * Create default constants for a set of given properties.
   * 
   * @param properties list of properties of a type
   */
  public static String createDefaultConstants(final List<Property> properties) {
    final Function1<Property, Boolean> _function = (Property it) -> {
      boolean _xblockexpression = false;
      {
        final Classifier type = TypeResolution.findType(it);
        _xblockexpression = ((!Objects.equal(it.getValue(), null)) || (Objects.equal(BaseTypes.STRING, BaseTypes.getTypeEnum(type.getType())) && (type.getSizes().size() == 0)));
      }
      return Boolean.valueOf(_xblockexpression);
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(properties, _function);
    final Function1<Property, CharSequence> _function_1 = (Property property) -> {
      return ConstantConstructionModule.createDefaultConstant(property);
    };
    Iterable<CharSequence> _map = IterableExtensions.<Property, CharSequence>map(_filter, _function_1);
    return IterableExtensions.join(_map);
  }
  
  /**
   * Create user specified constants.
   */
  public static String createUserConstants(final RecordType type) {
    EList<Constant> _constants = type.getConstants();
    final Function1<Constant, CharSequence> _function = (Constant const_) -> {
      return ConstantConstructionModule.createDefaultConstant(const_);
    };
    List<CharSequence> _map = ListExtensions.<Constant, CharSequence>map(_constants, _function);
    return IterableExtensions.join(_map);
  }
  
  /**
   * Create a property constant based on the language constant expression.
   * 
   * @param constant
   * 		a default constant object
   * 
   * @returns a constant declaration
   */
  private static CharSequence createDefaultConstant(final Constant constant) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static final ");
      Classifier _type = constant.getType();
      String _createTypeName = JavaTypeMapping.createTypeName(_type);
      _builder.append(_createTypeName, "");
      _builder.append(" ");
      String _createConstantName = NameResolver.createConstantName(constant);
      _builder.append(_createConstantName, "");
      _builder.append(" = ");
      Literal _value = constant.getValue();
      CharSequence _createLiteral = ConstantConstructionModule.createLiteral(_value);
      _builder.append(_createLiteral, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create a property constant based on the language property expression.
   * 
   * @param property
   * 		a default constant object
   * 
   * @returns a constant declaration
   */
  private static CharSequence createDefaultConstant(final Property property) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static final ");
      Classifier _type = property.getType();
      String _createTypeName = JavaTypeMapping.createTypeName(_type);
      _builder.append(_createTypeName, "");
      _builder.append(" ");
      String _createConstantName = NameResolver.createConstantName(property);
      _builder.append(_createConstantName, "");
      _builder.append(" = ");
      CharSequence _xifexpression = null;
      Literal _value = property.getValue();
      boolean _equals = Objects.equal(_value, null);
      if (_equals) {
        _xifexpression = "\"\"";
      } else {
        Literal _value_1 = property.getValue();
        _xifexpression = ConstantConstructionModule.createLiteral(_value_1);
      }
      _builder.append(_xifexpression, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Literal mapping
   */
  private static CharSequence createLiteral(final Literal literal) throws InternalErrorException {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (literal instanceof IntLiteral) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      int _value = ((IntLiteral)literal).getValue();
      _builder.append(_value, "");
      String _xifexpression = null;
      boolean _isType = TypeResolution.isType(literal, BaseTypes.LONG);
      if (_isType) {
        _xifexpression = "L";
      }
      _builder.append(_xifexpression, "");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (literal instanceof FloatLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Float _value = ((FloatLiteral)literal).getValue();
        _builder.append(_value, "");
        String _xifexpression = null;
        boolean _isType = TypeResolution.isType(literal, BaseTypes.FLOAT);
        if (_isType) {
          _xifexpression = "f";
        }
        _builder.append(_xifexpression, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (literal instanceof BooleanLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _xifexpression = null;
        Boolean _value = ((BooleanLiteral)literal).getValue();
        if ((_value).booleanValue()) {
          _xifexpression = "true";
        } else {
          _xifexpression = "false";
        }
        _builder.append(_xifexpression, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (literal instanceof ConstantLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Constant _value = ((ConstantLiteral)literal).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (literal instanceof BuiltInValueLiteral) {
        String _value = ((BuiltInValueLiteral)literal).getValue();
        boolean _equals = "KIEKER_VERSION".equals(_value);
        if (_equals) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("kieker.common.util.Version.getVERSION()");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (literal instanceof StringLiteral) {
        boolean _isType = TypeResolution.isType(literal, BaseTypes.STRING);
        if (_isType) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"");
          String _value = ((StringLiteral)literal).getValue();
          _builder.append(_value, "");
          _builder.append("\"");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (literal instanceof StringLiteral) {
        boolean _isType = TypeResolution.isType(literal, BaseTypes.CHAR);
        if (_isType) {
          _matched=true;
          String _value = ((StringLiteral)literal).getValue();
          String _plus = ("\'" + _value);
          _switchResult = (_plus + "\'");
        }
      }
    }
    if (!_matched) {
      if (literal instanceof ArrayLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{ ");
        EList<Literal> _literals = ((ArrayLiteral)literal).getLiterals();
        final Function1<Literal, CharSequence> _function = (Literal element) -> {
          try {
            return ConstantConstructionModule.createLiteral(element);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        List<CharSequence> _map = ListExtensions.<Literal, CharSequence>map(_literals, _function);
        String _xifexpression = null;
        EList<Literal> _literals_1 = ((ArrayLiteral)literal).getLiterals();
        Literal _get = _literals_1.get(0);
        if ((_get instanceof ArrayLiteral)) {
          _xifexpression = ",\n";
        } else {
          _xifexpression = ", ";
        }
        String _join = IterableExtensions.join(_map, _xifexpression);
        _builder.append(_join, "");
        _builder.append(" }");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      Class<? extends Literal> _class = literal.getClass();
      String _name = _class.getName();
      String _plus = ("Unknown literal type " + _name);
      throw new InternalErrorException(_plus);
    }
    return _switchResult;
  }
}
