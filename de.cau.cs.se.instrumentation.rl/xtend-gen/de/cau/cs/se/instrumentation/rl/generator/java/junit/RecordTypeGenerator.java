package kieker.tools.rl.generator.java.junit;

import com.google.common.base.Objects;
import kieker.tools.rl.generator.AbstractRecordTypeGenerator;
import kieker.tools.rl.generator.java.IRL2JavaTypeMappingExtensions;
import kieker.tools.rl.recordLang.BaseType;
import kieker.tools.rl.recordLang.Classifier;
import kieker.tools.rl.recordLang.Constant;
import kieker.tools.rl.recordLang.ConstantLiteral;
import kieker.tools.rl.recordLang.FloatLiteral;
import kieker.tools.rl.recordLang.IntLiteral;
import kieker.tools.rl.recordLang.Literal;
import kieker.tools.rl.recordLang.Model;
import kieker.tools.rl.recordLang.Property;
import kieker.tools.rl.recordLang.RecordType;
import kieker.tools.rl.recordLang.StringLiteral;
import kieker.tools.rl.recordLang.Type;
import kieker.tools.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
  public CharSequence getDirectoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _createTestPackageName = this.createTestPackageName(_name);
    String _replace = _createTestPackageName.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  @Override
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    _builder.append("TestGenerated");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".java");
    return _builder.toString();
  }
  
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("junit");
    return _builder.toString();
  }
  
  @Override
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    CharSequence _xblockexpression = null;
    {
      boolean _isAbstract = type.isAbstract();
      if (_isAbstract) {
        return null;
      }
      final List<Property> allDataProperties = PropertyEvaluation.collectAllDataProperties(type);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/***************************************************************************");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright ");
      Calendar _instance = Calendar.getInstance();
      int _get = _instance.get(Calendar.YEAR);
      _builder.append(_get, " ");
      _builder.append(" Kieker Project (http://kieker-monitoring.net)");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Licensed under the Apache License, Version 2.0 (the \"License\");");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* you may not use this file except in compliance with the License.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* You may obtain a copy of the License at");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*     http://www.apache.org/licenses/LICENSE-2.0");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Unless required by applicable law or agreed to in writing, software");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* distributed under the License is distributed on an \"AS IS\" BASIS,");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* See the License for the specific language governing permissions and");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* limitations under the License.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("***************************************************************************/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("package ");
      EObject _eContainer = type.eContainer();
      String _name = ((Model) _eContainer).getName();
      String _createTestPackageName = this.createTestPackageName(_name);
      _builder.append(_createTestPackageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.nio.ByteBuffer;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.junit.Assert;");
      _builder.newLine();
      _builder.append("import org.junit.Test;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import ");
      EObject _eContainer_1 = type.eContainer();
      String _name_1 = ((Model) _eContainer_1).getName();
      _builder.append(_name_1, "");
      _builder.append(".");
      String _name_2 = type.getName();
      _builder.append(_name_2, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("import kieker.common.util.registry.IRegistry;");
      _builder.newLine();
      _builder.append("import kieker.common.util.registry.Registry;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import kieker.test.common.junit.AbstractGeneratedKiekerTest;");
      _builder.newLine();
      _builder.append("import kieker.test.common.util.record.BookstoreOperationExecutionRecordFactory;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Creates {@link OperationExecutionRecord}s via the available constructors and");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* checks the values passed values via getters.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @author ");
      _builder.append(author, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @since ");
      _builder.append(version, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public class TestGenerated");
      String _name_3 = type.getName();
      _builder.append(_name_3, "");
      _builder.append(" extends AbstractGeneratedKiekerTest {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public TestGenerated");
      String _name_4 = type.getName();
      _builder.append(_name_4, "\t");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("// empty default constructor");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Tests {@link ");
      String _name_5 = type.getName();
      _builder.append(_name_5, "\t ");
      _builder.append("#Test");
      String _name_6 = type.getName();
      _builder.append(_name_6, "\t ");
      _builder.append("(String, String, long, long, long, String, int, int)}.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testToArray() { // NOPMD (assert missing)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for (int i=0;i<ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_7 = type.getName();
      _builder.append(_name_7, "\t\t\t");
      _builder.append(" record = new ");
      String _name_8 = type.getName();
      _builder.append(_name_8, "\t\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(allDataProperties, _function);
      String _join = IterableExtensions.join(_map, ", ");
      _builder.append(_join, "\t\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Object[] values = record.toArray();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Assert.assertNotNull(\"Record array serialization failed. No values array returned.\", values);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Assert.assertEquals(\"Record array size does not match expected number of properties ");
      int _size = allDataProperties.size();
      _builder.append(_size, "\t\t\t");
      _builder.append(".\", ");
      int _size_1 = allDataProperties.size();
      _builder.append(_size_1, "\t\t\t");
      _builder.append(", values.length);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all object values exist");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllValueExistAssertions = this.createAllValueExistAssertions(allDataProperties);
      _builder.append(_createAllValueExistAssertions, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all types");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllTypeAssertions = this.createAllTypeAssertions(allDataProperties);
      _builder.append(_createAllTypeAssertions, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all object values ");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllValueAssertions = this.createAllValueAssertions(allDataProperties);
      _builder.append(_createAllValueAssertions, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
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
      _builder.append("* Tests {@link ");
      String _name_9 = type.getName();
      _builder.append(_name_9, "\t ");
      _builder.append("#Test");
      String _name_10 = type.getName();
      _builder.append(_name_10, "\t ");
      _builder.append("(String, String, long, long, long, String, int, int)}.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testBuffer() { // NOPMD (assert missing)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for (int i=0;i<ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_11 = type.getName();
      _builder.append(_name_11, "\t\t\t");
      _builder.append(" record = new ");
      String _name_12 = type.getName();
      _builder.append(_name_12, "\t\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_1 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_1 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_1);
      String _join_1 = IterableExtensions.join(_map_1, ", ");
      _builder.append(_join_1, "\t\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions_1 = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
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
      _builder.append("* Tests {@link ");
      String _name_13 = type.getName();
      _builder.append(_name_13, "\t ");
      _builder.append("#Test");
      String _name_14 = type.getName();
      _builder.append(_name_14, "\t ");
      _builder.append("(String, String, long, long, long, String, int, int)}.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testParameterConstruction() { // NOPMD (assert missing)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for (int i=0;i<ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_15 = type.getName();
      _builder.append(_name_15, "\t\t\t");
      _builder.append(" record = new ");
      String _name_16 = type.getName();
      _builder.append(_name_16, "\t\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_2 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_2 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_2);
      String _join_2 = IterableExtensions.join(_map_2, ", ");
      _builder.append(_join_2, "\t\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions_2 = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions_2, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testEquality() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int i = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      String _name_17 = type.getName();
      _builder.append(_name_17, "\t\t");
      _builder.append(" oneRecord = new ");
      String _name_18 = type.getName();
      _builder.append(_name_18, "\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_3 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_3 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_3);
      String _join_3 = IterableExtensions.join(_map_3, ", ");
      _builder.append(_join_3, "\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("i = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      String _name_19 = type.getName();
      _builder.append(_name_19, "\t\t");
      _builder.append(" copiedRecord = new ");
      String _name_20 = type.getName();
      _builder.append(_name_20, "\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_4 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_4 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_4);
      String _join_4 = IterableExtensions.join(_map_4, ", ");
      _builder.append(_join_4, "\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Assert.assertEquals(oneRecord, copiedRecord);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testUnequality() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int i = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      String _name_21 = type.getName();
      _builder.append(_name_21, "\t\t");
      _builder.append(" oneRecord = new ");
      String _name_22 = type.getName();
      _builder.append(_name_22, "\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_5 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_5 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_5);
      String _join_5 = IterableExtensions.join(_map_5, ", ");
      _builder.append(_join_5, "\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("i = 1;");
      _builder.newLine();
      _builder.append("\t\t");
      String _name_23 = type.getName();
      _builder.append(_name_23, "\t\t");
      _builder.append(" anotherRecord = new ");
      String _name_24 = type.getName();
      _builder.append(_name_24, "\t\t");
      _builder.append("(");
      final Function1<Property, CharSequence> _function_6 = (Property property) -> {
        return this.createPropertyValueSet(property);
      };
      List<CharSequence> _map_6 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_6);
      String _join_6 = IterableExtensions.join(_map_6, ", ");
      _builder.append(_join_6, "\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Assert.assertNotEquals(oneRecord, anotherRecord);");
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Assert.assertNotNull(\"Array value [");
    _builder.append(index, "");
    _builder.append("] of type ");
    Classifier _type = property.getType();
    BaseType _type_1 = _type.getType();
    String _createPrimitiveWrapperTypeName = IRL2JavaTypeMappingExtensions.createPrimitiveWrapperTypeName(_type_1);
    _builder.append(_createPrimitiveWrapperTypeName, "");
    _builder.append(" must be not null.\", values[");
    _builder.append(index, "");
    _builder.append("]); ");
    _builder.newLineIfNotEmpty();
    return _builder;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Assert.assertEquals(\"Array value [");
    _builder.append(index, "");
    _builder.append("] \" + values[");
    _builder.append(index, "");
    _builder.append("] + \" does not match the desired value \" + ");
    CharSequence _createPropertyValueSet = this.createPropertyValueSet(property);
    _builder.append(_createPropertyValueSet, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      boolean _or = false;
      Classifier _type = property.getType();
      BaseType _type_1 = _type.getType();
      String _name = _type_1.getName();
      boolean _equals = Objects.equal(_name, "float");
      if (_equals) {
        _or = true;
      } else {
        Classifier _type_2 = property.getType();
        BaseType _type_3 = _type_2.getType();
        String _name_1 = _type_3.getName();
        boolean _equals_1 = Objects.equal(_name_1, "double");
        _or = _equals_1;
      }
      if (_or) {
        _builder.append("\t");
        String _castToPrimitiveType = this.getCastToPrimitiveType(property);
        _builder.append(_castToPrimitiveType, "\t");
        _builder.append(" ");
        CharSequence _createPropertyValueSet_1 = this.createPropertyValueSet(property);
        _builder.append(_createPropertyValueSet_1, "\t");
        _builder.append(", ");
        String _castToPrimitiveType_1 = this.getCastToPrimitiveType(property);
        _builder.append(_castToPrimitiveType_1, "\t");
        _builder.append(" (");
        Classifier _type_4 = property.getType();
        BaseType _type_5 = _type_4.getType();
        String _createPrimitiveWrapperTypeName = IRL2JavaTypeMappingExtensions.createPrimitiveWrapperTypeName(_type_5);
        _builder.append(_createPrimitiveWrapperTypeName, "\t");
        _builder.append(")values[");
        _builder.append(index, "\t");
        _builder.append("], 0.0000001");
        _builder.newLineIfNotEmpty();
      } else {
        Classifier _type_6 = property.getType();
        BaseType _type_7 = _type_6.getType();
        String _name_2 = _type_7.getName();
        boolean _equals_2 = Objects.equal(_name_2, "string");
        if (_equals_2) {
          _builder.append("\t");
          CharSequence _createPropertyValueSet_2 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_2, "\t");
          _builder.append(" == null?\"");
          String _createConstantValue = this.createConstantValue(property);
          _builder.append(_createConstantValue, "\t");
          _builder.append("\":");
          CharSequence _createPropertyValueSet_3 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_3, "\t");
          _builder.append(", values[");
          _builder.append(index, "\t");
          _builder.append("]");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          CharSequence _createPropertyValueSet_4 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_4, "\t");
          _builder.append(", values[");
          _builder.append(index, "\t");
          _builder.append("]");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create constant value for string.
   */
  private String createConstantValue(final Property property) {
    Literal _value = property.getValue();
    boolean _notEquals = (!Objects.equal(_value, null));
    if (_notEquals) {
      Literal _value_1 = property.getValue();
      return this.createConstantValue(_value_1);
    } else {
      return "";
    }
  }
  
  private String createConstantValue(final Literal value) {
    boolean _matched = false;
    if (!_matched) {
      if (value instanceof StringLiteral) {
        _matched=true;
        return ((StringLiteral) value).getValue();
      }
    }
    if (!_matched) {
      if (value instanceof FloatLiteral) {
        _matched=true;
        Float _value = ((FloatLiteral) value).getValue();
        return _value.toString();
      }
    }
    if (!_matched) {
      if (value instanceof IntLiteral) {
        _matched=true;
        int _value = ((IntLiteral) value).getValue();
        return Integer.valueOf(_value).toString();
      }
    }
    if (!_matched) {
      if (value instanceof ConstantLiteral) {
        _matched=true;
        Constant _value = ((ConstantLiteral) value).getValue();
        Literal _value_1 = _value.getValue();
        return this.createConstantValue(_value_1);
      }
    }
    return "";
  }
  
  /**
   * Returns a string representing a type case in Java iff
   * the type is not of type string.
   */
  private String getCastToPrimitiveType(final Property property) {
    Classifier _type = property.getType();
    BaseType _type_1 = _type.getType();
    String _name = _type_1.getName();
    boolean _equals = "string".equals(_name);
    if (_equals) {
      return "";
    } else {
      Classifier _type_2 = property.getType();
      BaseType _type_3 = _type_2.getType();
      String _name_1 = _type_3.getName();
      String _plus = ("(" + _name_1);
      return (_plus + ")");
    }
  }
  
  /**
   * Create assertions to test each return value from a getter of a record.
   * 
   * @param properties list of all data properties of a type
   * @param type the RecordType itself
   */
  private CharSequence createAllGetterValueAssertions(final Collection<Property> properties, final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Property property : properties) {
        _builder.append("Assert.assertEquals(\"");
        String _name = type.getName();
        _builder.append(_name, "");
        _builder.append(".");
        String _name_1 = property.getName();
        _builder.append(_name_1, "");
        _builder.append(" values are not equal.\", ");
        {
          boolean _or = false;
          Classifier _type = property.getType();
          BaseType _type_1 = _type.getType();
          String _name_2 = _type_1.getName();
          boolean _equals = Objects.equal(_name_2, "float");
          if (_equals) {
            _or = true;
          } else {
            Classifier _type_2 = property.getType();
            BaseType _type_3 = _type_2.getType();
            String _name_3 = _type_3.getName();
            boolean _equals_1 = Objects.equal(_name_3, "double");
            _or = _equals_1;
          }
          if (_or) {
            _builder.newLineIfNotEmpty();
            String _castToPrimitiveType = this.getCastToPrimitiveType(property);
            _builder.append(_castToPrimitiveType, "");
            _builder.append(" ");
            CharSequence _createPropertyValueSet = this.createPropertyValueSet(property);
            _builder.append(_createPropertyValueSet, "");
            _builder.append(", record.get");
            String _name_4 = property.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_4);
            _builder.append(_firstUpper, "");
            _builder.append("(), 0.0000001);");
            _builder.newLineIfNotEmpty();
          } else {
            Classifier _type_4 = property.getType();
            BaseType _type_5 = _type_4.getType();
            String _name_5 = _type_5.getName();
            boolean _equals_2 = Objects.equal(_name_5, "boolean");
            if (_equals_2) {
              CharSequence _createPropertyValueSet_1 = this.createPropertyValueSet(property);
              _builder.append(_createPropertyValueSet_1, "");
              _builder.append(", Boolean.valueOf(record.is");
              String _name_6 = property.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_6);
              _builder.append(_firstUpper_1, "");
              _builder.append("()));");
              _builder.newLineIfNotEmpty();
            } else {
              Classifier _type_6 = property.getType();
              BaseType _type_7 = _type_6.getType();
              String _name_7 = _type_7.getName();
              boolean _equals_3 = Objects.equal(_name_7, "string");
              if (_equals_3) {
                CharSequence _createPropertyValueSet_2 = this.createPropertyValueSet(property);
                _builder.append(_createPropertyValueSet_2, "");
                _builder.append(" == null?\"");
                String _createConstantValue = this.createConstantValue(property);
                _builder.append(_createConstantValue, "");
                _builder.append("\":");
                CharSequence _createPropertyValueSet_3 = this.createPropertyValueSet(property);
                _builder.append(_createPropertyValueSet_3, "");
                _builder.append(", record.get");
                String _name_8 = property.getName();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
                _builder.append(_firstUpper_2, "");
                _builder.append("());");
                _builder.newLineIfNotEmpty();
              } else {
                String _castToPrimitiveType_1 = this.getCastToPrimitiveType(property);
                _builder.append(_castToPrimitiveType_1, "");
                _builder.append(" ");
                CharSequence _createPropertyValueSet_4 = this.createPropertyValueSet(property);
                _builder.append(_createPropertyValueSet_4, "");
                _builder.append(", record.get");
                String _name_9 = property.getName();
                String _firstUpper_3 = StringExtensions.toFirstUpper(_name_9);
                _builder.append(_firstUpper_3, "");
                _builder.append("());");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Assert.assertTrue(\"Type of array value [");
    _builder.append(index, "");
    _builder.append("] \" + values[");
    _builder.append(index, "");
    _builder.append("].getClass().getCanonicalName() + \" does not match the desired type ");
    Classifier _type = property.getType();
    BaseType _type_1 = _type.getType();
    String _createPrimitiveWrapperTypeName = IRL2JavaTypeMappingExtensions.createPrimitiveWrapperTypeName(_type_1);
    _builder.append(_createPrimitiveWrapperTypeName, "");
    _builder.append("\", values[");
    _builder.append(index, "");
    _builder.append("] instanceof ");
    Classifier _type_2 = property.getType();
    BaseType _type_3 = _type_2.getType();
    String _createPrimitiveWrapperTypeName_1 = IRL2JavaTypeMappingExtensions.createPrimitiveWrapperTypeName(_type_3);
    _builder.append(_createPrimitiveWrapperTypeName_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Produce a type conform value for input. This only works for primitive types.
   */
  private CharSequence createPropertyValueSet(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _type = property.getType();
    BaseType _type_1 = _type.getType();
    String _name = _type_1.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_VALUES.get(i % ");
    Classifier _type_2 = property.getType();
    BaseType _type_3 = _type_2.getType();
    String _name_1 = _type_3.getName();
    String _upperCase_1 = _name_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_VALUES.size())");
    return _builder;
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
