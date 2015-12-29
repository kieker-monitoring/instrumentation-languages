package de.cau.cs.se.instrumentation.al.generator.aspectj;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameterDeclaration;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.Event;
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.aspectLang.TypeReference;
import de.cau.cs.se.instrumentation.al.generator.CommonJavaTemplates;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AspectJAdviceGenerator implements IGenerator<Advice, CharSequence> {
  @Override
  public CharSequence generate(final Advice input) {
    CharSequence _xblockexpression = null;
    {
      final boolean traceAPI = CommonJavaTemplates.isTraceAPIUsed(input);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("package ");
      String _packageName = CommonJavaTemplates.getPackageName(input);
      _builder.append(_packageName, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.JoinPoint.EnclosingStaticPart;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.ProceedingJoinPoint;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.Signature;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.annotation.After;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.annotation.Aspect;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.annotation.Before;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import org.aspectj.lang.annotation.Pointcut;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import kieker.monitoring.core.controller.IMonitoringController;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import kieker.monitoring.core.controller.MonitoringController;");
      _builder.newLine();
      _builder.append("\t\t");
      {
        if (traceAPI) {
          _builder.append("import kieker.monitoring.core.registry.TraceRegistry;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("import kieker.monitoring.probe.aspectj.AbstractAspectJProbe;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("import kieker.monitoring.timer.ITimeSource;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      EList<Collector> _collectors = input.getCollectors();
      String _createRecordInputs = CommonJavaTemplates.createRecordInputs(_collectors);
      _builder.append(_createRecordInputs, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      {
        if (traceAPI) {
          _builder.append("import kieker.common.record.flow.trace.TraceMetadata;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Aspect");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public abstract class ");
      String _name = input.getName();
      _builder.append(_name, "\t\t");
      _builder.append("Advice extends AbstractAspectJProbe {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("private static final IMonitoringController CTRLINST = MonitoringController.getInstance();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private static final ITimeSource TIMESOURCE = CTRLINST.getTimeSource();");
      _builder.newLine();
      _builder.append("\t\t\t");
      {
        if (traceAPI) {
          _builder.append("private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("@Pointcut");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public abstract void operation();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAdviceMethods = this.createAdviceMethods(input, traceAPI);
      _builder.append(_createAdviceMethods, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private String createAdviceMethods(final Advice advice, final boolean traceAPI) {
    InsertionPoint[] _values = InsertionPoint.values();
    final Function1<InsertionPoint, CharSequence> _function = (InsertionPoint insertionPoint) -> {
      CharSequence _xblockexpression = null;
      {
        EList<Collector> _collectors = advice.getCollectors();
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
  
  private CharSequence createAdviceMethods(final Advice advice, final Iterable<Collector> collectors, final boolean traceAPI, final InsertionPoint insertion) {
    StringConcatenation _builder = new StringConcatenation();
    String _dynamicMethodName = this.getDynamicMethodName(insertion);
    EList<AdviceParameterDeclaration> _parameterDeclarations = advice.getParameterDeclarations();
    final Function1<AdviceParameterDeclaration, String> _function = (AdviceParameterDeclaration it) -> {
      TypeReference _type = it.getType();
      String _createTypeReference = CommonJavaTemplates.createTypeReference(_type);
      String _plus = (_createTypeReference + " ");
      String _name = it.getName();
      return (_plus + _name);
    };
    List<String> _map = ListExtensions.<AdviceParameterDeclaration, String>map(_parameterDeclarations, _function);
    String _join = IterableExtensions.join(_map, ", ");
    String _annotationName = this.getAnnotationName(insertion);
    CharSequence _createAdviceMethod = this.createAdviceMethod(collectors, traceAPI, _dynamicMethodName, 
      "Object thisObject, ProceedingJoinPoint thisJoinPoint", _join, 
      "thisJoinPoint", _annotationName, 
      "this(thisObject)");
    _builder.append(_createAdviceMethod, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _staticMethodName = this.getStaticMethodName(insertion);
    EList<AdviceParameterDeclaration> _parameterDeclarations_1 = advice.getParameterDeclarations();
    final Function1<AdviceParameterDeclaration, String> _function_1 = (AdviceParameterDeclaration it) -> {
      TypeReference _type = it.getType();
      String _createTypeReference = CommonJavaTemplates.createTypeReference(_type);
      String _plus = (_createTypeReference + " ");
      String _name = it.getName();
      return (_plus + _name);
    };
    List<String> _map_1 = ListExtensions.<AdviceParameterDeclaration, String>map(_parameterDeclarations_1, _function_1);
    String _join_1 = IterableExtensions.join(_map_1, ", ");
    String _annotationName_1 = this.getAnnotationName(insertion);
    CharSequence _createAdviceMethod_1 = this.createAdviceMethod(collectors, traceAPI, _staticMethodName, 
      "ProceedingJoinPoint thisJoinPoint", _join_1, 
      "thisJoinPoint", _annotationName_1, 
      "!this(java.lang.Object)");
    _builder.append(_createAdviceMethod_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createAdviceMethod(final Iterable<Collector> collectors, final boolean traceAPI, final String methodName, final String parameters, final String adviceParameters, final String joinPointParameterName, final String annotation, final String pointcut) {
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
      String _xifexpression_1 = null;
      boolean _isEmpty_1 = adviceParameters.isEmpty();
      boolean _not = (!_isEmpty_1);
      if (_not) {
        _xifexpression_1 = adviceParameters;
      }
      _builder_1.append(_xifexpression_1, "");
      _builder_1.append(") {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("if (CTRLINST.isMonitoringEnabled()) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("final String signatureString = this.signatureToLongString(");
      _builder_1.append(joinPointParameterName, "\t\t");
      _builder_1.append(".getSignature());");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("if (CTRLINST.isProbeActivated(signatureString)) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("// common fields");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      CharSequence _xifexpression_2 = null;
      if (traceAPI) {
        _xifexpression_2 = CommonJavaTemplates.createTraceId();
      }
      _builder_1.append(_xifexpression_2, "\t\t\t");
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
