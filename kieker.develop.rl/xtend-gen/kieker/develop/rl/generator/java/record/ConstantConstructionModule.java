package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.util.List;
import kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.ArrayLiteral;
import kieker.develop.rl.recordLang.ArraySize;
import kieker.develop.rl.recordLang.BaseType;
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
import kieker.develop.rl.validation.PropertyEvaluation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
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
      boolean _or = false;
      Literal _value = it.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _or = true;
      } else {
        boolean _and = false;
        Classifier _findType = PropertyEvaluation.findType(it);
        BaseType _type = _findType.getType();
        String _name = _type.getName();
        String _name_1 = BaseTypes.STRING.name();
        boolean _equals = _name.equals(_name_1);
        if (!_equals) {
          _and = false;
        } else {
          Classifier _findType_1 = PropertyEvaluation.findType(it);
          EList<ArraySize> _sizes = _findType_1.getSizes();
          int _size = _sizes.size();
          boolean _equals_1 = (_size == 0);
          _and = _equals_1;
        }
        _or = _and;
      }
      return Boolean.valueOf(_or);
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final ");
    Classifier _type = constant.getType();
    String _createTypeName = IRL2JavaTypeMappingExtensions.createTypeName(_type);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = constant.getName();
    String _protectKeywords = NameResolver.protectKeywords(_name);
    _builder.append(_protectKeywords, "");
    _builder.append(" = ");
    Literal _value = constant.getValue();
    CharSequence _createLiteral = ConstantConstructionModule.createLiteral(_value);
    _builder.append(_createLiteral, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final ");
    Classifier _type = property.getType();
    String _createTypeName = IRL2JavaTypeMappingExtensions.createTypeName(_type);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = property.getName();
    String _createConstantName = NameResolver.createConstantName(_name);
    String _protectKeywords = NameResolver.protectKeywords(_createConstantName);
    _builder.append(_protectKeywords, "");
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
  }
  
  /**
   * Literal mapping
   */
  private static CharSequence createLiteral(final Literal literal) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (literal instanceof IntLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = ((IntLiteral)literal).getValue();
        _builder.append(_value, "");
        String _xifexpression = null;
        BaseType _requiredType = ConstantConstructionModule.getRequiredType(literal);
        String _name = _requiredType.getName();
        boolean _equals = _name.equals("long");
        if (_equals) {
          _xifexpression = "L";
        }
        _builder.append(_xifexpression, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (literal instanceof FloatLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Float _value = ((FloatLiteral)literal).getValue();
        _builder.append(_value, "");
        String _xifexpression = null;
        BaseType _requiredType = ConstantConstructionModule.getRequiredType(literal);
        String _name = _requiredType.getName();
        boolean _equals = _name.equals("float");
        if (_equals) {
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
        BaseType _requiredType = ConstantConstructionModule.getRequiredType(literal);
        String _name = _requiredType.getName();
        boolean _equals = _name.equals("string");
        if (_equals) {
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
        BaseType _requiredType = ConstantConstructionModule.getRequiredType(literal);
        String _name = _requiredType.getName();
        boolean _equals = _name.equals("char");
        if (_equals) {
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
          return ConstantConstructionModule.createLiteral(element);
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
      _switchResult = ("ERROR " + _name);
    }
    return _switchResult;
  }
  
  /**
   * Resolve the primitive type for the given literal.
   */
  private static BaseType getRequiredType(final Literal literal) {
    BaseType _switchResult = null;
    EObject _eContainer = literal.eContainer();
    boolean _matched = false;
    if (!_matched) {
      if (_eContainer instanceof Constant) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        Classifier _type = ((Constant) _eContainer_1).getType();
        _switchResult = _type.getType();
      }
    }
    if (!_matched) {
      if (_eContainer instanceof Property) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        Classifier _type = ((Property) _eContainer_1).getType();
        _switchResult = _type.getType();
      }
    }
    if (!_matched) {
      if (_eContainer instanceof Literal) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        _switchResult = ConstantConstructionModule.getRequiredType(((Literal) _eContainer_1));
      }
    }
    return _switchResult;
  }
}
