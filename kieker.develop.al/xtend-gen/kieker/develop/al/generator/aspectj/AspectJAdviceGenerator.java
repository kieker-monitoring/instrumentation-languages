package kieker.develop.al.generator.aspectj;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.AdviceParameterDeclaration;
import kieker.develop.al.aspectLang.Collector;
import kieker.develop.al.aspectLang.Event;
import kieker.develop.al.aspectLang.InsertionPoint;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import kieker.develop.al.aspectLang.Value;
import kieker.develop.al.generator.CommonJavaTemplates;
import kieker.develop.al.generator.aspectj.NameResolver;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class AspectJAdviceGenerator /* implements IGenerator<UtilizeAdvice, CharSequence>  */{
  private int index;
  
  @Override
  public CharSequence generate(final UtilizeAdvice input) {
    CharSequence _xblockexpression = null;
    {
      Advice _advice = input.getAdvice();
      final boolean traceAPI = CommonJavaTemplates.isTraceAPIUsed(_advice);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      Advice _advice_1 = input.getAdvice();
      String _packageName = CommonJavaTemplates.getPackageName(_advice_1);
      _builder.append(_packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import org.aspectj.lang.JoinPoint.EnclosingStaticPart;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.ProceedingJoinPoint;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.Signature;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.annotation.After;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.annotation.Aspect;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.annotation.Before;");
      _builder.newLine();
      _builder.append("import org.aspectj.lang.annotation.Pointcut;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import kieker.monitoring.core.controller.IMonitoringController;");
      _builder.newLine();
      _builder.append("import kieker.monitoring.core.controller.MonitoringController;");
      _builder.newLine();
      {
        if (traceAPI) {
          _builder.append("import kieker.monitoring.core.registry.TraceRegistry;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("import kieker.monitoring.probe.aspectj.AbstractAspectJProbe;");
      _builder.newLine();
      _builder.append("import kieker.monitoring.timer.ITimeSource;");
      _builder.newLine();
      _builder.newLine();
      Advice _advice_2 = input.getAdvice();
      EList<Collector> _collectors = _advice_2.getCollectors();
      String _createRecordInputs = CommonJavaTemplates.createRecordInputs(_collectors);
      _builder.append(_createRecordInputs, "");
      _builder.newLineIfNotEmpty();
      {
        if (traceAPI) {
          _builder.append("import kieker.common.record.flow.trace.TraceMetadata;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("@Aspect");
      _builder.newLine();
      _builder.append("public abstract class ");
      Advice _advice_3 = input.getAdvice();
      CharSequence _adviceClassName = NameResolver.getAdviceClassName(_advice_3, this.index);
      _builder.append(_adviceClassName, "");
      _builder.append(" extends AbstractAspectJProbe {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("private static final IMonitoringController CTRLINST = MonitoringController.getInstance();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static final ITimeSource TIMESOURCE = CTRLINST.getTimeSource();");
      _builder.newLine();
      _builder.append("\t");
      {
        if (traceAPI) {
          _builder.append("private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Pointcut");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public abstract void operation();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      String _createAdviceMethods = this.createAdviceMethods(input, traceAPI);
      _builder.append(_createAdviceMethods, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public int setIndex(final int index) {
    return this.index = index;
  }
  
  private String createAdviceMethods(final UtilizeAdvice advice, final boolean traceAPI) {
    InsertionPoint[] _values = InsertionPoint.values();
    final Function1<InsertionPoint, CharSequence> _function = (InsertionPoint insertionPoint) -> {
      CharSequence _xblockexpression = null;
      {
        Advice _advice = advice.getAdvice();
        EList<Collector> _collectors = _advice.getCollectors();
        final Function1<Collector, Boolean> _function_1 = (Collector it) -> {
          InsertionPoint _insertionPoint = it.getInsertionPoint();
          return Boolean.valueOf(Objects.equal(_insertionPoint, insertionPoint));
        };
        final Iterable<Collector> collectors = IterableExtensions.<Collector>filter(_collectors, _function_1);
        _xblockexpression = this.createAdviceMethods(advice, collectors, traceAPI, insertionPoint);
      }
      return _xblockexpression;
    };
    List<CharSequence> _map = ListExtensions.<InsertionPoint, CharSequence>map(((List<InsertionPoint>)Conversions.doWrapArray(_values)), _function);
    return IterableExtensions.join(_map);
  }
  
  private String getAnnotationName(final InsertionPoint insertion) {
    String _switchResult = null;
    if (insertion != null) {
      switch (insertion) {
        case AFTER:
          _switchResult = "After";
          break;
        case AFTER_EXCEPTION:
          _switchResult = "AfterThrowing";
          break;
        case BEFORE:
          _switchResult = "Before";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  private String getStaticMethodName(final InsertionPoint insertion) {
    String _switchResult = null;
    if (insertion != null) {
      switch (insertion) {
        case AFTER:
          _switchResult = "afterStaticOperation";
          break;
        case AFTER_EXCEPTION:
          _switchResult = "afterExceptionStaticOperation";
          break;
        case BEFORE:
          _switchResult = "beforeStaticOperation";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  private String getDynamicMethodName(final InsertionPoint insertion) {
    String _switchResult = null;
    if (insertion != null) {
      switch (insertion) {
        case AFTER:
          _switchResult = "afterOperation";
          break;
        case AFTER_EXCEPTION:
          _switchResult = "afterExceptionOperation";
          break;
        case BEFORE:
          _switchResult = "beforeOperation";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  private CharSequence createAdviceMethods(final UtilizeAdvice advice, final Iterable<Collector> collectors, final boolean traceAPI, final InsertionPoint insertion) {
    CharSequence _xblockexpression = null;
    {
      final HashMap<AdviceParameterDeclaration, Value> parameterAssignments = new HashMap<AdviceParameterDeclaration, Value>();
      Advice _advice = advice.getAdvice();
      EList<AdviceParameterDeclaration> _parameterDeclarations = _advice.getParameterDeclarations();
      final Procedure2<AdviceParameterDeclaration, Integer> _function = (AdviceParameterDeclaration declaration, Integer index) -> {
        EList<Value> _parameterAssignments = advice.getParameterAssignments();
        Value _get = _parameterAssignments.get((index).intValue());
        parameterAssignments.put(declaration, _get);
      };
      IterableExtensions.<AdviceParameterDeclaration>forEach(_parameterDeclarations, _function);
      StringConcatenation _builder = new StringConcatenation();
      String _dynamicMethodName = this.getDynamicMethodName(insertion);
      String _annotationName = this.getAnnotationName(insertion);
      CharSequence _createAdviceMethod = this.createAdviceMethod(collectors, traceAPI, _dynamicMethodName, 
        "Object thisObject, ProceedingJoinPoint thisJoinPoint", parameterAssignments, 
        "thisJoinPoint", _annotationName, 
        "this(thisObject)");
      _builder.append(_createAdviceMethod, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      String _staticMethodName = this.getStaticMethodName(insertion);
      String _annotationName_1 = this.getAnnotationName(insertion);
      CharSequence _createAdviceMethod_1 = this.createAdviceMethod(collectors, traceAPI, _staticMethodName, 
        "ProceedingJoinPoint thisJoinPoint", parameterAssignments, 
        "thisJoinPoint", _annotationName_1, 
        "!this(java.lang.Object)");
      _builder.append(_createAdviceMethod_1, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence createAdviceMethod(final Iterable<Collector> collectors, final boolean traceAPI, final String methodName, final String parameters, final Map<AdviceParameterDeclaration, Value> parameterAssignments, final String joinPointParameterName, final String annotation, final String pointcut) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(collectors);
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@");
      _builder_1.append(annotation, "");
      _builder_1.append("(\"operation() && ");
      _builder_1.append(pointcut, "");
      _builder_1.append("\") ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("public void ");
      _builder_1.append(methodName, "");
      _builder_1.append("(");
      _builder_1.append(parameters, "");
      _builder_1.append(") {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("if (CTRLINST.isMonitoringEnabled()) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("final Signature signature = ");
      _builder_1.append(joinPointParameterName, "\t\t");
      _builder_1.append(".getSignature();");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("final String signatureString = this.signatureToLongString(signature);");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("if (CTRLINST.isProbeActivated(signatureString)) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("// common fields");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      CharSequence _xifexpression_1 = null;
      if (traceAPI) {
        _xifexpression_1 = CommonJavaTemplates.createTraceId();
      }
      _builder_1.append(_xifexpression_1, "\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      CharSequence _createDataCollection = CommonJavaTemplates.createDataCollection(collectors, parameterAssignments);
      _builder_1.append(_createDataCollection, "\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("// recording");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      final Function1<Collector, String> _function = (Collector it) -> {
        EList<Event> _events = it.getEvents();
        final Function1<Event, CharSequence> _function_1 = (Event it_1) -> {
          return CommonJavaTemplates.createEvent(it_1);
        };
        List<CharSequence> _map = ListExtensions.<Event, CharSequence>map(_events, _function_1);
        return IterableExtensions.join(_map, "\n");
      };
      Iterable<String> _map = IterableExtensions.<Collector, String>map(collectors, _function);
      String _join = IterableExtensions.join(_map);
      _builder_1.append(_join, "\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
