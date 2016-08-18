package kieker.develop.al.generator;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * TODO Class name should be improved.
 */
@SuppressWarnings("all")
public class CommonJavaTemplates {
  /**
   * Return the package name for a given advice.
   */
  public static Object getPackageName(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\nAspectModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create a code fragment containing all necessary record inputs.
   */
  public static String createRecordInputs(final /* EList<Collector> */Object collectors) {
    throw new Error("Unresolved compilation problems:"
      + "\nRecordType cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nThe method or field events is undefined for the type Object"
      + "\nThe method or field type is undefined for the type Object"
      + "\nThe method addUnique(List<RecordType>, RecordType) from the type CommonJavaTemplates refers to the missing type RecordType"
      + "\nforEach cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private static void addUnique(final /* List<RecordType> */Object list, final /* RecordType */Object type) {
    boolean _contains = list.contains(type);
    boolean _not = (!_contains);
    if (_not) {
      list.add(type);
    }
  }
  
  /**
   * Check if trace API is used.
   */
  public static boolean isTraceAPIUsed(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field events is undefined for the type Object"
      + "\nThe method or field initializations is undefined for the type Object"
      + "\nInvalid number of arguments. The method isTraceAPIUsed(Advice) is not applicable without arguments"
      + "\nThe method isTraceAPIUsed(Advice) from the type CommonJavaTemplates refers to the missing type Advice"
      + "\ncollectors cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nexists cannot be resolved");
  }
  
  private static boolean isTraceAPIUsed(final /* Value */Object initialization) {
    throw new Error("Unresolved compilation problems:"
      + "\nLiteral cannot be resolved to a type."
      + "\nReferenceValue cannot be resolved to a type."
      + "\nInternalFunctionProperty cannot be resolved to a type."
      + "\nAdviceParameter cannot be resolved to a type."
      + "\nThe method or field TRACE_ID is undefined"
      + "\nThe method or field ORDER_INDEX is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nfunction cannot be resolved");
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
  public static CharSequence createDataCollection(final /* Iterable<Collector> */Object collectors, final /* Map<AdviceParameterDeclaration, Value> */Object parameterAssignments) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field events is undefined for the type Object"
      + "\nThe method createData(Map<CharSequence, CharSequence>, Map<AdviceParameterDeclaration, Value>) is undefined for the type Object"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Create data initialization for data collection.
   */
  public static Map<CharSequence, CharSequence> createData(final /* Event */Object event, final Map<CharSequence, CharSequence> data, final /* Map<AdviceParameterDeclaration, Value> */Object parameterAssignments) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Object"
      + "\nThe method or field createValueName is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ntype cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ninitializations cannot be resolved"
      + "\nget cannot be resolved"
      + "\ncreateValue cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved");
  }
  
  public static CharSequence createEvent(final /* Event */Object event) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field createValueName is undefined for the type Object"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  private static CharSequence createValueName(final /* kieker.develop.rl.recordLang.Property */Object property) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  private static CharSequence createValue(final /* Value */Object value, final /* Map<AdviceParameterDeclaration, Value> */Object parameterAssignments) {
    throw new Error("Unresolved compilation problems:"
      + "\nStringLiteral cannot be resolved to a type."
      + "\nIntLiteral cannot be resolved to a type."
      + "\nFloatLiteral cannot be resolved to a type."
      + "\nReferenceValue cannot be resolved to a type."
      + "\nInternalFunctionProperty cannot be resolved to a type."
      + "\nAdviceParameter cannot be resolved to a type."
      + "\nThe method or field TIME is undefined"
      + "\nThe method or field TRACE_ID is undefined"
      + "\nThe method or field ORDER_INDEX is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nquery cannot be resolved"
      + "\n== cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\ncreateLocalProperty cannot be resolved"
      + "\nfunction cannot be resolved"
      + "\ndeclaration cannot be resolved"
      + "\ncreateValue cannot be resolved"
      + "\nclass cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private static CharSequence createLocalProperty(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nReflectionProperty cannot be resolved to a type."
      + "\nRuntimeProperty cannot be resolved to a type."
      + "\nThe method or field createLocalReflectionProperty is undefined for the type Property"
      + "\nThe method or field createLocalRuntimeProperty is undefined for the type Property"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
  
  private static CharSequence createLocalReflectionProperty(final /* ReflectionProperty */Object property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field CLASS is undefined"
      + "\nThe method or field NAME is undefined"
      + "\nThe method or field RETURN_TYPE is undefined"
      + "\nThe method or field SIGNATURE is undefined"
      + "\nfunction cannot be resolved");
  }
  
  private static CharSequence createLocalRuntimeProperty(final /* RuntimeProperty */Object property) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence createEventRecording(final /* Advice */Object advice, final /* InsertionPoint */Object point) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field insertionPoint is undefined for the type Object"
      + "\nThe method or field InsertionPoint is undefined"
      + "\nThe method or field events is undefined for the type Object"
      + "\nThe method or field createEvent is undefined for the type Object"
      + "\ncollectors cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n== cannot be resolved"
      + "\nBEFORE cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * Generate the correct type name. TODO is this sufficient?
   */
  public static String createTypeReference(final /* TypeReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\ncollection cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved");
  }
}
