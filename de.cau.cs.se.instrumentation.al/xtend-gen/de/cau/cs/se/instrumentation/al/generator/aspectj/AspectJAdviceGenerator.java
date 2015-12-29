package de.cau.cs.se.instrumentation.al.generator.aspectj;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameter;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.Event;
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunction;
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.Literal;
import de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue;
import de.cau.cs.se.instrumentation.al.aspectLang.Value;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AspectJAdviceGenerator implements IGenerator<Advice, CharSequence> {
  @Override
  public CharSequence generate(final Advice input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package kieker.monitoring.probe.aspectj.flow.operationCall;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.aspectj.lang.JoinPoint.EnclosingStaticPart;");
    _builder.newLine();
    _builder.append("import org.aspectj.lang.ProceedingJoinPoint;");
    _builder.newLine();
    _builder.append("import org.aspectj.lang.Signature;");
    _builder.newLine();
    _builder.append("import org.aspectj.lang.annotation.Around;");
    _builder.newLine();
    _builder.append("import org.aspectj.lang.annotation.Aspect;");
    _builder.newLine();
    _builder.append("import org.aspectj.lang.annotation.Pointcut;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import kieker.monitoring.core.controller.IMonitoringController;");
    _builder.newLine();
    _builder.append("import kieker.monitoring.core.controller.MonitoringController;");
    _builder.newLine();
    _builder.append("import kieker.monitoring.core.registry.TraceRegistry;");
    _builder.newLine();
    _builder.append("import kieker.monitoring.probe.aspectj.AbstractAspectJProbe;");
    _builder.newLine();
    _builder.append("import kieker.monitoring.timer.ITimeSource;");
    _builder.newLine();
    _builder.newLine();
    EList<Collector> _collectors = input.getCollectors();
    String _createRecordInputs = this.createRecordInputs(_collectors);
    _builder.append(_createRecordInputs, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Aspect");
    _builder.newLine();
    _builder.append("public abstract class ");
    String _name = input.getName();
    _builder.append(_name, "");
    _builder.append(" extends AbstractAspectJProbe {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static final IMonitoringController CTRLINST = MonitoringController.getInstance();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final ITimeSource TIME = CTRLINST.getTimeSource();");
    _builder.newLine();
    _builder.append("\t");
    {
      boolean _isTraceAPIUsed = this.isTraceAPIUsed(input);
      if (_isTraceAPIUsed) {
        _builder.append(" private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createAdviceMethods = this.createAdviceMethods(input);
    _builder.append(_createAdviceMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private boolean isTraceAPIUsed(final Advice advice) {
    EList<Collector> _collectors = advice.getCollectors();
    final Function1<Collector, Boolean> _function = (Collector it) -> {
      EList<Event> _events = it.getEvents();
      final Function1<Event, Boolean> _function_1 = (Event it_1) -> {
        EList<Value> _initializations = it_1.getInitializations();
        final Function1<Value, Boolean> _function_2 = (Value it_2) -> {
          return Boolean.valueOf(this.isTraceAPIUsed(it_2));
        };
        return Boolean.valueOf(IterableExtensions.<Value>exists(_initializations, _function_2));
      };
      return Boolean.valueOf(IterableExtensions.<Event>exists(_events, _function_1));
    };
    return IterableExtensions.<Collector>exists(_collectors, _function);
  }
  
  private boolean isTraceAPIUsed(final Value initialization) {
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
  
  private String createRecordInputs(final EList<Collector> collectors) {
    final ArrayList<RecordType> recordList = new ArrayList<RecordType>();
    final Consumer<Collector> _function = (Collector collector) -> {
      EList<Event> _events = collector.getEvents();
      final Consumer<Event> _function_1 = (Event it) -> {
        RecordType _type = it.getType();
        this.addUnique(recordList, _type);
      };
      _events.forEach(_function_1);
    };
    collectors.forEach(_function);
    final Function1<RecordType, String> _function_1 = (RecordType it) -> {
      EObject _eContainer = it.eContainer();
      String _name = ((Model) _eContainer).getName();
      String _plus = (_name + ".");
      String _name_1 = it.getName();
      return (_plus + _name_1);
    };
    List<String> _map = ListExtensions.<RecordType, String>map(recordList, _function_1);
    return IterableExtensions.join(_map, ";\n");
  }
  
  private void addUnique(final List<RecordType> list, final RecordType type) {
    boolean _contains = list.contains(type);
    boolean _not = (!_contains);
    if (_not) {
      list.add(type);
    }
  }
  
  private CharSequence createAdviceMethods(final Advice advice) {
    return this.createAdviceMethod("REPPLACE-ME", "thisJoinPoint");
  }
  
  private CharSequence createAdviceMethod(final String methodName, final String joinPointParameterName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void ");
    _builder.append(methodName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    CharSequence _createMonitoringActive = this.createMonitoringActive();
    _builder.append(_createMonitoringActive, "");
    _builder.newLineIfNotEmpty();
    CharSequence _createMonitoringProbeActive = this.createMonitoringProbeActive(joinPointParameterName);
    _builder.append(_createMonitoringProbeActive, "");
    _builder.newLineIfNotEmpty();
    _builder.append("// common fields");
    _builder.newLine();
    CharSequence _createTraceId = this.createTraceId();
    _builder.append(_createTraceId, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createTraceId() {
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
   * It is unclear if this is necessary in this form for advices which are not around.
   * Central question how can we remember the information for the entry to terminate the trace.
   */
  private CharSequence createEndAdvice() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final Object retval;");
    _builder.newLine();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("retval = thisJoinPoint.proceed();");
    _builder.newLine();
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (newTrace) { // close the trace");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("TRACEREGISTRY.unregisterTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("return retval;");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createMonitoringActive() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (!CTRLINST.isMonitoringEnabled()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return thisJoinPoint.proceed();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create a test to check if the probe is active.
   * 
   * @param source the source of the signature, something like thisJoinPoint
   */
  private CharSequence createMonitoringProbeActive(final String source) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final String signature = this.signatureToLongString(");
    _builder.append(source, "");
    _builder.append(".getSignature());");
    _builder.newLineIfNotEmpty();
    _builder.append("if (!CTRLINST.isProbeActivated(signature)) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(source, "\t");
    _builder.append(".proceed();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
