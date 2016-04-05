package kieker.tools.al.generator.javaee;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import kieker.tools.al.aspectLang.Advice;
import kieker.tools.al.aspectLang.Collector;
import kieker.tools.al.aspectLang.InsertionPoint;
import kieker.tools.al.generator.CommonJavaTemplates;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaEEAdviceGenerator implements IGenerator<Advice, CharSequence> {
  @Override
  public CharSequence generate(final Advice input) {
    CharSequence _xblockexpression = null;
    {
      final boolean traceAPI = CommonJavaTemplates.isTraceAPIUsed(input);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _packageName = CommonJavaTemplates.getPackageName(input);
      _builder.append(_packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import javax.interceptor.AroundInvoke;");
      _builder.newLine();
      _builder.append("import javax.interceptor.Interceptor;");
      _builder.newLine();
      _builder.append("import javax.interceptor.InvocationContext;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import kieker.monitoring.core.controller.IMonitoringController;");
      _builder.newLine();
      _builder.append("import kieker.monitoring.core.controller.MonitoringController;");
      _builder.newLine();
      _builder.append("import kieker.monitoring.core.registry.TraceRegistry;");
      _builder.newLine();
      _builder.append("import kieker.monitoring.timer.ITimeSource;");
      _builder.newLine();
      _builder.newLine();
      EList<Collector> _collectors = input.getCollectors();
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
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@Interceptor");
      _builder.newLine();
      _builder.append("public class ");
      String _name = input.getName();
      _builder.append(_name, "");
      _builder.append("Interceptor {\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("/** Kieker monitoring controller. */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static final IMonitoringController CTRLINST = MonitoringController.getInstance();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** Kieker time source. */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static final ITimeSource TIMESOURCE =  CTRLINST.getTimeSource();");
      _builder.newLine();
      _builder.append("\t");
      {
        if (traceAPI) {
          _builder.append("/** Kieker trace registry. */");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Initialize trace interceptor.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _name_1 = input.getName();
      _builder.append(_name_1, "\t");
      _builder.append("Interceptor() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("// nothing to be done here");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Around advice configuration.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @param context");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*            the invocation context of a bean call.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @return the return value of the next method in the chain");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @throws Throwable");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@AroundInvoke");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public Object interceptMethodCall(final InvocationContext context) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (CTRLINST.isMonitoringEnabled()) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("final String signature = context.getMethod().toString();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (CTRLINST.isProbeActivated(signature)) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("// common fields");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _xifexpression = null;
      if (traceAPI) {
        _xifexpression = CommonJavaTemplates.createTraceId();
      }
      _builder.append(_xifexpression, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("// before ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _createEventRecording = CommonJavaTemplates.createEventRecording(input, InsertionPoint.BEFORE);
      _builder.append(_createEventRecording, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("final Object retval = context.proceed();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      CharSequence _createEventRecording_1 = CommonJavaTemplates.createEventRecording(input, InsertionPoint.AFTER);
      _builder.append(_createEventRecording_1, "\t\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("} catch (final Throwable th) { // NOPMD NOCS (catch throw might ok here)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      CharSequence _createEventRecording_2 = CommonJavaTemplates.createEventRecording(input, InsertionPoint.AFTER_EXCEPTION);
      _builder.append(_createEventRecording_2, "\t\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("throw th;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("} finally {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      {
        if (traceAPI) {
          _builder.append("if (newTrace) { // close the trace");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          _builder.append("\t");
          _builder.append("TRACEREGISTRY.unregisterTrace();");
          _builder.newLine();
          _builder.append("\t\t\t\t\t");
          _builder.append("}");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
