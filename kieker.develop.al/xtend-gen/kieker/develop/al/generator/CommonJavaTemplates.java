package kieker.develop.al.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.AdviceParameter;
import kieker.develop.al.aspectLang.AdviceParameterDeclaration;
import kieker.develop.al.aspectLang.AspectModel;
import kieker.develop.al.aspectLang.Collector;
import kieker.develop.al.aspectLang.Event;
import kieker.develop.al.aspectLang.FloatLiteral;
import kieker.develop.al.aspectLang.InsertionPoint;
import kieker.develop.al.aspectLang.IntLiteral;
import kieker.develop.al.aspectLang.InternalFunction;
import kieker.develop.al.aspectLang.InternalFunctionProperty;
import kieker.develop.al.aspectLang.Literal;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.ReferenceValue;
import kieker.develop.al.aspectLang.ReflectionFunction;
import kieker.develop.al.aspectLang.ReflectionProperty;
import kieker.develop.al.aspectLang.RuntimeProperty;
import kieker.develop.al.aspectLang.StringLiteral;
import kieker.develop.al.aspectLang.TypeReference;
import kieker.develop.al.aspectLang.Value;
import kieker.develop.al.mapping.NamedType;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * TODO Class name should be improved.
 */
@SuppressWarnings("all")
public class CommonJavaTemplates {
  /**
   * Return the package name for a given advice.
   */
  public static String getPackageName(final Advice advice) {
    EObject _eContainer = advice.eContainer();
    return ((AspectModel) _eContainer).getName();
  }
  
  /**
   * Create a code fragment containing all necessary record inputs.
   */
  public static String createRecordInputs(final EList<Collector> collectors) {
    final ArrayList<RecordType> recordList = new ArrayList<RecordType>();
    final Consumer<Collector> _function = (Collector collector) -> {
      EList<Event> _events = collector.getEvents();
      final Consumer<Event> _function_1 = (Event it) -> {
        RecordType _type = it.getType();
        CommonJavaTemplates.addUnique(recordList, _type);
      };
      _events.forEach(_function_1);
    };
    collectors.forEach(_function);
    final Function1<RecordType, String> _function_1 = (RecordType it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import ");
      EObject _eContainer = it.eContainer();
      String _name = ((Model) _eContainer).getName();
      _builder.append(_name, "");
      _builder.append(".");
      String _name_1 = it.getName();
      _builder.append(_name_1, "");
      _builder.append(";");
      return _builder.toString();
    };
    List<String> _map = ListExtensions.<RecordType, String>map(recordList, _function_1);
    return IterableExtensions.join(_map, "\n");
  }
  
  private static void addUnique(final List<RecordType> list, final RecordType type) {
    boolean _contains = list.contains(type);
    boolean _not = (!_contains);
    if (_not) {
      list.add(type);
    }
  }
  
  /**
   * Check if trace API is used.
   */
  public static boolean isTraceAPIUsed(final Advice advice) {
    EList<Collector> _collectors = advice.getCollectors();
    final Function1<Collector, Boolean> _function = (Collector it) -> {
      EList<Event> _events = it.getEvents();
      final Function1<Event, Boolean> _function_1 = (Event it_1) -> {
        EList<Value> _initializations = it_1.getInitializations();
        final Function1<Value, Boolean> _function_2 = (Value it_2) -> {
          return Boolean.valueOf(CommonJavaTemplates.isTraceAPIUsed(it_2));
        };
        return Boolean.valueOf(IterableExtensions.<Value>exists(_initializations, _function_2));
      };
      return Boolean.valueOf(IterableExtensions.<Event>exists(_events, _function_1));
    };
    return IterableExtensions.<Collector>exists(_collectors, _function);
  }
  
  private static boolean isTraceAPIUsed(final Value initialization) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (initialization instanceof Literal) {
        _matched=true;
        _switchResult = false;
      }
    }
    if (!_matched) {
      if (initialization instanceof ReferenceValue) {
        _matched=true;
        _switchResult = false;
      }
    }
    if (!_matched) {
      if (initialization instanceof InternalFunctionProperty) {
        _matched=true;
        boolean _switchResult_1 = false;
        InternalFunction _function = ((InternalFunctionProperty)initialization).getFunction();
        if (_function != null) {
          switch (_function) {
            case TRACE_ID:
              _switchResult_1 = true;
              break;
            case ORDER_INDEX:
              _switchResult_1 = true;
              break;
            default:
              _switchResult_1 = false;
              break;
          }
        } else {
          _switchResult_1 = false;
        }
        _switchResult = _switchResult_1;
      }
    }
    if (!_matched) {
      if (initialization instanceof AdviceParameter) {
        _matched=true;
        _switchResult = false;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  /**
   * create code for trace information.
   */
  public static CharSequence createTraceId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TraceMetadata trace = TRACEREGISTRY.getTrace();");
    _builder.newLine();
    _builder.append("final boolean newTrace = trace == null;");
    _builder.newLine();
    _builder.append("if (newTrace) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("trace = TRACEREGISTRY.registerTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CTRLINST.newMonitoringRecord(trace);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("final long traceId = trace.getTraceId();");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create data collection code based on event parameter assignments.
   */
  public static CharSequence createDataCollection(final Iterable<Collector> collectors, final Map<AdviceParameterDeclaration, Value> parameterAssignments) {
    final Map<CharSequence, CharSequence> data = new HashMap<CharSequence, CharSequence>();
    final Consumer<Collector> _function = (Collector it) -> {
      EList<Event> _events = it.getEvents();
      final Consumer<Event> _function_1 = (Event it_1) -> {
        CommonJavaTemplates.createData(it_1, data, parameterAssignments);
      };
      _events.forEach(_function_1);
    };
    collectors.forEach(_function);
    Collection<CharSequence> _values = data.values();
    return IterableExtensions.join(_values, "\n");
  }
  
  /**
   * Create data initialization for data collection.
   */
  public static Map<CharSequence, CharSequence> createData(final Event event, final Map<CharSequence, CharSequence> data, final Map<AdviceParameterDeclaration, Value> parameterAssignments) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllDataProperties is undefined for the type RecordType"
      + "\nThe method or field type is undefined for the type Object"
      + "\nType mismatch: cannot convert from Object to Property"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nforEach cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved");
  }
  
  public static CharSequence createEvent(final Event event) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllDataProperties is undefined for the type RecordType"
      + "\nType mismatch: cannot convert from Object to Property"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  private static CharSequence createValueName(final Property property) {
    String _name = property.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("collect" + _firstUpper);
  }
  
  private static CharSequence createValue(final Value value, final Map<AdviceParameterDeclaration, Value> parameterAssignments) {
    try {
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (value instanceof StringLiteral) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"");
          String _value = ((StringLiteral)value).getValue();
          _builder.append(_value, "");
          _builder.append("\"");
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (value instanceof IntLiteral) {
          _matched=true;
          int _value = ((IntLiteral)value).getValue();
          _switchResult = Integer.valueOf(_value).toString();
        }
      }
      if (!_matched) {
        if (value instanceof FloatLiteral) {
          _matched=true;
          Float _value = ((FloatLiteral)value).getValue();
          _switchResult = _value.toString();
        }
      }
      if (!_matched) {
        if (value instanceof ReferenceValue) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          CharSequence _xifexpression = null;
          LocationQuery _query = ((ReferenceValue)value).getQuery();
          boolean _equals = Objects.equal(_query, null);
          if (_equals) {
            kieker.develop.al.aspectLang.Property _property = ((ReferenceValue)value).getProperty();
            _xifexpression = CommonJavaTemplates.createLocalProperty(_property);
          } else {
            _xifexpression = "MISSING";
          }
          _builder.append(_xifexpression, "");
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (value instanceof InternalFunctionProperty) {
          _matched=true;
          CharSequence _switchResult_1 = null;
          InternalFunction _function = ((InternalFunctionProperty)value).getFunction();
          if (_function != null) {
            switch (_function) {
              case TIME:
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("TIMESOURCE.getTime()");
                _switchResult_1 = _builder;
                break;
              case TRACE_ID:
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("trace.getTraceId()");
                _switchResult_1 = _builder_1;
                break;
              case ORDER_INDEX:
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("trace.getNextOrderId()");
                _switchResult_1 = _builder_2;
                break;
              default:
                break;
            }
          }
          _switchResult = _switchResult_1;
        }
      }
      if (!_matched) {
        if (value instanceof AdviceParameter) {
          _matched=true;
          AdviceParameterDeclaration _declaration = ((AdviceParameter)value).getDeclaration();
          Value _get = parameterAssignments.get(_declaration);
          _switchResult = CommonJavaTemplates.createValue(_get, parameterAssignments);
        }
      }
      if (!_matched) {
        Class<? extends Value> _class = value.getClass();
        String _name = _class.getName();
        String _plus = ("Illegal value type " + _name);
        throw new InternalErrorException(_plus);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static CharSequence createLocalProperty(final kieker.develop.al.aspectLang.Property property) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (property instanceof ReflectionProperty) {
        _matched=true;
        _switchResult = CommonJavaTemplates.createLocalReflectionProperty(((ReflectionProperty)property));
      }
    }
    if (!_matched) {
      if (property instanceof RuntimeProperty) {
        _matched=true;
        _switchResult = CommonJavaTemplates.createLocalRuntimeProperty(((RuntimeProperty)property));
      }
    }
    return _switchResult;
  }
  
  private static CharSequence createLocalReflectionProperty(final ReflectionProperty property) {
    CharSequence _switchResult = null;
    ReflectionFunction _function = property.getFunction();
    if (_function != null) {
      switch (_function) {
        case CLASS:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("signature.getDeclaringTypeName()");
          _switchResult = _builder;
          break;
        case NAME:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("signature.getName()");
          _switchResult = _builder_1;
          break;
        case RETURN_TYPE:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("signature.getReturnType().");
          _switchResult = _builder_2;
          break;
        case SIGNATURE:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("signatureString");
          _switchResult = _builder_3;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  private static CharSequence createLocalRuntimeProperty(final RuntimeProperty property) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence createEventRecording(final Advice advice, final InsertionPoint point) {
    EList<Collector> _collectors = advice.getCollectors();
    final Function1<Collector, Boolean> _function = (Collector it) -> {
      InsertionPoint _insertionPoint = it.getInsertionPoint();
      return Boolean.valueOf(Objects.equal(_insertionPoint, InsertionPoint.BEFORE));
    };
    Iterable<Collector> _filter = IterableExtensions.<Collector>filter(_collectors, _function);
    final Function1<Collector, String> _function_1 = (Collector it) -> {
      EList<Event> _events = it.getEvents();
      final Function1<Event, CharSequence> _function_2 = (Event it_1) -> {
        return CommonJavaTemplates.createEvent(it_1);
      };
      List<CharSequence> _map = ListExtensions.<Event, CharSequence>map(_events, _function_2);
      return IterableExtensions.join(_map, "\n");
    };
    Iterable<String> _map = IterableExtensions.<Collector, String>map(_filter, _function_1);
    return IterableExtensions.join(_map);
  }
  
  /**
   * Generate the correct type name. TODO is this sufficient?
   */
  public static String createTypeReference(final TypeReference reference) {
    boolean _isCollection = reference.isCollection();
    if (_isCollection) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Collection<");
      NamedType _reference = reference.getReference();
      String _name = _reference.getName();
      _builder.append(_name, "");
      _builder.append(">");
      return _builder.toString();
    } else {
      NamedType _reference_1 = reference.getReference();
      return _reference_1.getName();
    }
  }
}
