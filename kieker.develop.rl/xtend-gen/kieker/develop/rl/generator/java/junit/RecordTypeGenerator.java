package kieker.develop.rl.generator.java.junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java.junit");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JUnit tests for records");
    return _builder.toString();
  }
  
  /**
   * No junit test for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  @Override
  public CharSequence getDirectoryName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateTestPackageName cannot be resolved"
      + "\nreplace cannot be resolved");
  }
  
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("junit");
    return _builder.toString();
  }
  
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nabstract cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateTestPackageName cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreateAllGetterValueAssertions cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nsize cannot be resolved"
      + "\ncreateAllValueExistAssertions cannot be resolved"
      + "\ncreateAllTypeAssertions cannot be resolved"
      + "\ncreateAllValueAssertions cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreateAllGetterValueAssertions cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreateAllGetterValueAssertions cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  private String createAllValueExistAssertions(final Collection<Property> properties) {
    final List<CharSequence> result = new ArrayList<CharSequence>();
    final Procedure2<Property, Integer> _function = (Property property, Integer index) -> {
      CharSequence _createValueExistAssertion = this.createValueExistAssertion(property, index);
      result.add(_createValueExistAssertion);
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  private CharSequence createValueExistAssertion(final Property property, final Integer index) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveWrapperTypeName cannot be resolved");
  }
  
  /**
   * This routine is ugly.
   * Collect all value assertions
   */
  private String createAllValueAssertions(final Collection<Property> properties) {
    final List<CharSequence> result = new ArrayList<CharSequence>();
    final Procedure2<Property, Integer> _function = (Property property, Integer index) -> {
      CharSequence _createValueAssertion = this.createValueAssertion(property, index);
      result.add(_createValueAssertion);
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  private CharSequence createValueAssertion(final Property property, final Integer index) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveWrapperTypeName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  /**
   * Create constant value for string.
   */
  private String createConstantValue(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field value is undefined for the type Property"
      + "\nThe method or field value is undefined for the type Property"
      + "\n!= cannot be resolved");
  }
  
  private String createConstantValue(final /* Literal */Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\nStringLiteral cannot be resolved to a type."
      + "\nStringLiteral cannot be resolved to a type."
      + "\nFloatLiteral cannot be resolved to a type."
      + "\nFloatLiteral cannot be resolved to a type."
      + "\nIntLiteral cannot be resolved to a type."
      + "\nIntLiteral cannot be resolved to a type."
      + "\nConstantLiteral cannot be resolved to a type."
      + "\nConstantLiteral cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  /**
   * Returns a string representing a type case in Java iff
   * the type is not of type string.
   */
  private String getCastToPrimitiveType(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create assertions to test each return value from a getter of a record.
   * 
   * @param properties list of all data properties of a type
   * @param type the RecordType itself
   */
  private CharSequence createAllGetterValueAssertions(final Collection<Property> properties, final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  /**
   * This routine is ugly.
   * Collects all type assertions.
   */
  private String createAllTypeAssertions(final Collection<Property> properties) {
    final List<CharSequence> result = new ArrayList<CharSequence>();
    final Procedure2<Property, Integer> _function = (Property property, Integer index) -> {
      CharSequence _createTypeAssertion = this.createTypeAssertion(property, index);
      result.add(_createTypeAssertion);
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  private CharSequence createTypeAssertion(final Property property, final Integer index) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveWrapperTypeName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveWrapperTypeName cannot be resolved");
  }
  
  /**
   * Produce a type conform value for input. This only works for primitive types.
   */
  private CharSequence createPropertyValueSet(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoUpperCase cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoUpperCase cannot be resolved");
  }
  
  /**
   * Reconstruct the package name out of the record package name.
   * kieker.common.record -> kieker.test.common.junit.record
   * All other structures are converted by adding .junit to the package hierarchy
   */
  private String createTestPackageName(final String name) {
    boolean _contains = name.contains("kieker.common.record");
    if (_contains) {
      return name.replaceAll("kieker\\.common\\.record", "kieker.test.common.junit.record");
    } else {
      return (name + ".junit");
    }
  }
}
