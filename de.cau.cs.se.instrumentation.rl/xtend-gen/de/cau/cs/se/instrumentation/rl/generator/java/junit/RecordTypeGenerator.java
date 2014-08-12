package de.cau.cs.se.instrumentation.rl.generator.java.junit;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Literal;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    CharSequence _xblockexpression = null;
    {
      boolean _isAbstract = type.isAbstract();
      if (_isAbstract) {
        return null;
      }
      final Collection<Property> allDataProperties = PropertyEvaluation.collectAllDataProperties(type);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/***************************************************************************");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright 2014 Kieker Project (http://kieker-monitoring.net)");
      _builder.newLine();
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
      _builder.append("import kieker.test.common.junit.AbstractKiekerTest;");
      _builder.newLine();
      _builder.append("import kieker.test.common.junit.TestValueRangeConstants;");
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
      _builder.append(" extends AbstractKiekerTest {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public TestGenerated");
      String _name_4 = type.getName();
      _builder.append(_name_4, "	");
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
      _builder.append(_name_5, "	 ");
      _builder.append("#Test");
      String _name_6 = type.getName();
      _builder.append(_name_6, "	 ");
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
      _builder.append("for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_7 = type.getName();
      _builder.append(_name_7, "			");
      _builder.append(" record = new ");
      String _name_8 = type.getName();
      _builder.append(_name_8, "			");
      _builder.append("(");
      final Function1<Property,CharSequence> _function = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyValueSet = RecordTypeGenerator.this.createPropertyValueSet(property);
          return _createPropertyValueSet;
        }
      };
      Iterable<CharSequence> _map = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function);
      String _join = IterableExtensions.join(_map, ", ");
      _builder.append(_join, "			");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions, "			");
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
      _builder.append(_size, "			");
      _builder.append(".\", ");
      int _size_1 = allDataProperties.size();
      _builder.append(_size_1, "			");
      _builder.append(", values.length);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all object values exist");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllValueExistAssertions = this.createAllValueExistAssertions(allDataProperties);
      _builder.append(_createAllValueExistAssertions, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all types");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllTypeAssertions = this.createAllTypeAssertions(allDataProperties);
      _builder.append(_createAllTypeAssertions, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check all object values ");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _createAllValueAssertions = this.createAllValueAssertions(allDataProperties);
      _builder.append(_createAllValueAssertions, "			");
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
      _builder.append(_name_9, "	 ");
      _builder.append("#Test");
      String _name_10 = type.getName();
      _builder.append(_name_10, "	 ");
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
      _builder.append("for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_11 = type.getName();
      _builder.append(_name_11, "			");
      _builder.append(" record = new ");
      String _name_12 = type.getName();
      _builder.append(_name_12, "			");
      _builder.append("(");
      final Function1<Property,CharSequence> _function_1 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyValueSet = RecordTypeGenerator.this.createPropertyValueSet(property);
          return _createPropertyValueSet;
        }
      };
      Iterable<CharSequence> _map_1 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_1);
      String _join_1 = IterableExtensions.join(_map_1, ", ");
      _builder.append(_join_1, "			");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions_1 = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions_1, "			");
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
      _builder.append(_name_13, "	 ");
      _builder.append("#Test");
      String _name_14 = type.getName();
      _builder.append(_name_14, "	 ");
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
      _builder.append("for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// initialize");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _name_15 = type.getName();
      _builder.append(_name_15, "			");
      _builder.append(" record = new ");
      String _name_16 = type.getName();
      _builder.append(_name_16, "			");
      _builder.append("(");
      final Function1<Property,CharSequence> _function_2 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyValueSet = RecordTypeGenerator.this.createPropertyValueSet(property);
          return _createPropertyValueSet;
        }
      };
      Iterable<CharSequence> _map_2 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_2);
      String _join_2 = IterableExtensions.join(_map_2, ", ");
      _builder.append(_join_2, "			");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// check values");
      _builder.newLine();
      _builder.append("\t\t\t");
      CharSequence _createAllGetterValueAssertions_2 = this.createAllGetterValueAssertions(allDataProperties, type);
      _builder.append(_createAllGetterValueAssertions_2, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String createAllValueExistAssertions(final Collection<Property> properties) {
    ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
    final List<CharSequence> result = _arrayList;
    final Procedure2<Property,Integer> _function = new Procedure2<Property,Integer>() {
      public void apply(final Property property, final Integer index) {
        CharSequence _createValueExistAssertion = RecordTypeGenerator.this.createValueExistAssertion(property, index);
        result.add(_createValueExistAssertion);
      }
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  public CharSequence createValueExistAssertion(final Property property, final Integer index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Assert.assertNotNull(\"Array value [");
    _builder.append(index, "");
    _builder.append("] of type ");
    String _getObjectType = this.getGetObjectType(property);
    _builder.append(_getObjectType, "");
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
  public String createAllValueAssertions(final Collection<Property> properties) {
    ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
    final List<CharSequence> result = _arrayList;
    final Procedure2<Property,Integer> _function = new Procedure2<Property,Integer>() {
      public void apply(final Property property, final Integer index) {
        CharSequence _createValueAssertion = RecordTypeGenerator.this.createValueAssertion(property, index);
        result.add(_createValueAssertion);
      }
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  public CharSequence createValueAssertion(final Property property, final Integer index) {
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
      EClassifier _class_ = _type.getClass_();
      String _name = _class_.getName();
      boolean _equals = Objects.equal(_name, "float");
      if (_equals) {
        _or = true;
      } else {
        Classifier _type_1 = property.getType();
        EClassifier _class__1 = _type_1.getClass_();
        String _name_1 = _class__1.getName();
        boolean _equals_1 = Objects.equal(_name_1, "double");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        _builder.append("\t");
        CharSequence _createPropertyValueSet_1 = this.createPropertyValueSet(property);
        _builder.append(_createPropertyValueSet_1, "	");
        _builder.append(", ");
        String _primitiveType = this.getPrimitiveType(property);
        _builder.append(_primitiveType, "	");
        _builder.append(" (");
        String _getObjectType = this.getGetObjectType(property);
        _builder.append(_getObjectType, "	");
        _builder.append(")values[");
        _builder.append(index, "	");
        _builder.append("], 0.0000001");
        _builder.newLineIfNotEmpty();
      } else {
        Classifier _type_2 = property.getType();
        EClassifier _class__2 = _type_2.getClass_();
        String _name_2 = _class__2.getName();
        boolean _equals_2 = Objects.equal(_name_2, "string");
        if (_equals_2) {
          _builder.append("\t");
          CharSequence _createPropertyValueSet_2 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_2, "	");
          _builder.append(" == null?\"");
          String _createConstantValue = this.createConstantValue(property);
          _builder.append(_createConstantValue, "	");
          _builder.append("\":");
          CharSequence _createPropertyValueSet_3 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_3, "	");
          _builder.append(", values[");
          _builder.append(index, "	");
          _builder.append("]");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          CharSequence _createPropertyValueSet_4 = this.createPropertyValueSet(property);
          _builder.append(_createPropertyValueSet_4, "	");
          _builder.append(", ");
          String _primitiveType_1 = this.getPrimitiveType(property);
          _builder.append(_primitiveType_1, "	");
          _builder.append(" (");
          String _getObjectType_1 = this.getGetObjectType(property);
          _builder.append(_getObjectType_1, "	");
          _builder.append(")values[");
          _builder.append(index, "	");
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
  public String createConstantValue(final Property property) {
    Literal _value = property.getValue();
    boolean _notEquals = (!Objects.equal(_value, null));
    if (_notEquals) {
      Literal _value_1 = property.getValue();
      return ((StringLiteral) _value_1).getValue();
    } else {
      return "";
    }
  }
  
  public String getPrimitiveType(final Property property) {
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    boolean _equals = "string".equals(_name);
    if (_equals) {
      return "";
    } else {
      Classifier _type_1 = property.getType();
      EClassifier _class__1 = _type_1.getClass_();
      String _name_1 = _class__1.getName();
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
  public CharSequence createAllGetterValueAssertions(final Collection<Property> properties, final RecordType type) {
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
          EClassifier _class_ = _type.getClass_();
          String _name_2 = _class_.getName();
          boolean _equals = Objects.equal(_name_2, "float");
          if (_equals) {
            _or = true;
          } else {
            Classifier _type_1 = property.getType();
            EClassifier _class__1 = _type_1.getClass_();
            String _name_3 = _class__1.getName();
            boolean _equals_1 = Objects.equal(_name_3, "double");
            _or = (_equals || _equals_1);
          }
          if (_or) {
            _builder.newLineIfNotEmpty();
            CharSequence _createPropertyValueSet = this.createPropertyValueSet(property);
            _builder.append(_createPropertyValueSet, "");
            _builder.append(", record.get");
            String _name_4 = property.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_4);
            _builder.append(_firstUpper, "");
            _builder.append("(), 0.0000001);");
            _builder.newLineIfNotEmpty();
          } else {
            Classifier _type_2 = property.getType();
            EClassifier _class__2 = _type_2.getClass_();
            String _name_5 = _class__2.getName();
            boolean _equals_2 = Objects.equal(_name_5, "boolean");
            if (_equals_2) {
              CharSequence _createPropertyValueSet_1 = this.createPropertyValueSet(property);
              _builder.append(_createPropertyValueSet_1, "");
              _builder.append(", record.is");
              String _name_6 = property.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_6);
              _builder.append(_firstUpper_1, "");
              _builder.append("());");
              _builder.newLineIfNotEmpty();
            } else {
              Classifier _type_3 = property.getType();
              EClassifier _class__3 = _type_3.getClass_();
              String _name_7 = _class__3.getName();
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
  public String createAllTypeAssertions(final Collection<Property> properties) {
    ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
    final List<CharSequence> result = _arrayList;
    final Procedure2<Property,Integer> _function = new Procedure2<Property,Integer>() {
      public void apply(final Property property, final Integer index) {
        CharSequence _createTypeAssertion = RecordTypeGenerator.this.createTypeAssertion(property, index);
        result.add(_createTypeAssertion);
      }
    };
    IterableExtensions.<Property>forEach(properties, _function);
    return IterableExtensions.join(result);
  }
  
  public CharSequence createTypeAssertion(final Property property, final Integer index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Assert.assertTrue(\"Type of array value [");
    _builder.append(index, "");
    _builder.append("] \" + values[");
    _builder.append(index, "");
    _builder.append("].getClass().getCanonicalName() + \" does not match the desired type ");
    String _getObjectType = this.getGetObjectType(property);
    _builder.append(_getObjectType, "");
    _builder.append("\", values[");
    _builder.append(index, "");
    _builder.append("] instanceof ");
    String _getObjectType_1 = this.getGetObjectType(property);
    _builder.append(_getObjectType_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getGetObjectType(final Property property) {
    String _switchResult = null;
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        _switchResult = "Integer";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        _switchResult = "Long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        _switchResult = "Short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        _switchResult = "Double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        _switchResult = "Float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        _switchResult = "Character";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        _switchResult = "Byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        _switchResult = "Boolean";
      }
    }
    if (!_matched) {
      Classifier _type_1 = property.getType();
      EClassifier _class__1 = _type_1.getClass_();
      String _name_1 = _class__1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  /**
   * Produce a type conform value for input. This only works for primitive types.
   */
  public CharSequence createPropertyValueSet(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TestValueRangeConstants.");
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_VALUES[i%TestValueRangeConstants.");
    Classifier _type_1 = property.getType();
    EClassifier _class__1 = _type_1.getClass_();
    String _name_1 = _class__1.getName();
    String _upperCase_1 = _name_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_VALUES.length]");
    return _builder;
  }
  
  /**
   * Reconstruct the package name out of the record package name.
   * kieker.common.record -> kieker.test.common.junit.record
   * All other structures are converted by adding .junit to the package hierarchy
   */
  public String createTestPackageName(final String name) {
    boolean _contains = name.contains("kieker.common.record");
    if (_contains) {
      return name.replaceAll("kieker\\.common\\.record", "kieker.test.common.junit.record");
    } else {
      return (name + ".junit");
    }
  }
  
  public CharSequence directoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _createTestPackageName = this.createTestPackageName(_name);
    String _replace = _createTestPackageName.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  public String fileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.directoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    _builder.append("TestGenerated");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".java");
    return _builder.toString();
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public CharSequence createTypeName(final Classifier classifier) {
    String _xifexpression = null;
    EList<ArraySize> _sizes = classifier.getSizes();
    int _size = _sizes.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EClassifier _class_ = classifier.getClass_();
      String _createPrimitiveTypeName = this.createPrimitiveTypeName(_class_);
      EList<ArraySize> _sizes_1 = classifier.getSizes();
      final Function1<ArraySize,String> _function = new Function1<ArraySize,String>() {
        public String apply(final ArraySize size) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("[]");
          return _builder.toString();
        }
      };
      List<String> _map = ListExtensions.<ArraySize, String>map(_sizes_1, _function);
      String _join = IterableExtensions.join(_map);
      String _plus = (_createPrimitiveTypeName + _join);
      _xifexpression = _plus;
    } else {
      EClassifier _class__1 = classifier.getClass_();
      String _createPrimitiveTypeName_1 = this.createPrimitiveTypeName(_class__1);
      _xifexpression = _createPrimitiveTypeName_1;
    }
    return _xifexpression;
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public String createPrimitiveTypeName(final EClassifier classifier) {
    String _switchResult = null;
    String _name = classifier.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        _switchResult = "short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        _switchResult = "byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      String _name_1 = classifier.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  public String getLanguageType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("junit");
    return _builder.toString();
  }
}