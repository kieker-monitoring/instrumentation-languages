package kieker.develop.al.generator.aspectj;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.AdviceParameterDeclaration;
import kieker.develop.al.aspectLang.Collector;
import kieker.develop.al.aspectLang.InsertionPoint;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import kieker.develop.al.aspectLang.Value;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class AspectJAdviceGenerator implements IGenerator<UtilizeAdvice, CharSequence> {
  private int index;
  
  @Override
  public CharSequence generate(final UtilizeAdvice input) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isTraceAPIUsed is undefined for the type Advice"
      + "\nThe method or field packageName is undefined for the type Advice"
      + "\nThe method getAdviceClassName(int) is undefined for the type Advice"
      + "\nThe method createRecordInputs(EList<Object>) from the type CommonJavaTemplates refers to the missing type Object");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field createEvent is undefined for the type Event"
      + "\nThe method createDataCollection(Iterable<Object>, Map<Object, Object>) from the type CommonJavaTemplates refers to the missing type Object");
  }
}
