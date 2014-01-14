package de.cau.cs.se.instrumentation.rl.generator.java;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Constant;
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Literal;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   * @params author
   * 		generic author name for the record
   * @params version
   * 		generic kieker version for the record
   */
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    CharSequence _xblockexpression = null;
    {
      final String serialUID = "123456789L";
      final Collection<Property> allDataProperties = PropertyEvaluation.collectAllDataProperties(type);
      final Iterable<Property> allDeclarationProperties = this.collectAllDeclarationProperties(type);
      final Iterable<Property> allGetterDeclarationProperties = this.collectAllGetterDeclarationProperties(type);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/***************************************************************************");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright 2013 Kieker Project (http://kieker-monitoring.net)");
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
      _builder.append(_name, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        boolean _isAbstract = type.isAbstract();
        boolean _not = (!_isAbstract);
        if (_not) {
          _builder.append("import java.nio.BufferOverflowException;");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("import java.nio.BufferUnderflowException;");
      _builder.newLineIfNotEmpty();
      _builder.append("import java.nio.ByteBuffer;");
      _builder.newLine();
      _builder.newLine();
      {
        RecordType _parent = type.getParent();
        boolean _equals = Objects.equal(_parent, null);
        if (_equals) {
          _builder.append("import kieker.common.record.AbstractMonitoringRecord;");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("import kieker.common.record.IMonitoringRecord;");
      _builder.newLineIfNotEmpty();
      _builder.append("import kieker.common.util.registry.IRegistry;");
      _builder.newLine();
      _builder.newLine();
      CharSequence _xifexpression = null;
      RecordType _parent_1 = type.getParent();
      boolean _notEquals = (!Objects.equal(_parent_1, null));
      if (_notEquals) {
        CharSequence _createParentImport = this.createParentImport(type);
        _xifexpression = _createParentImport;
      }
      _builder.append(_xifexpression, "");
      _builder.newLineIfNotEmpty();
      String _xifexpression_1 = null;
      boolean _and = false;
      EList<PartialRecordType> _parents = type.getParents();
      boolean _notEquals_1 = (!Objects.equal(_parents, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        EList<PartialRecordType> _parents_1 = type.getParents();
        int _size = _parents_1.size();
        boolean _greaterThan = (_size > 0);
        _and = (_notEquals_1 && _greaterThan);
      }
      if (_and) {
        EList<PartialRecordType> _parents_2 = type.getParents();
        final Function1<PartialRecordType,CharSequence> _function = new Function1<PartialRecordType,CharSequence>() {
          public CharSequence apply(final PartialRecordType i) {
            CharSequence _createInterfaceImport = RecordTypeGenerator.this.createInterfaceImport(i);
            return _createInterfaceImport;
          }
        };
        List<CharSequence> _map = ListExtensions.<PartialRecordType, CharSequence>map(_parents_2, _function);
        String _join = IterableExtensions.join(_map);
        _xifexpression_1 = _join;
      }
      _builder.append(_xifexpression_1, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("/**");
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
      _builder.append("public ");
      String _xifexpression_2 = null;
      boolean _isAbstract_1 = type.isAbstract();
      if (_isAbstract_1) {
        _xifexpression_2 = "abstract ";
      }
      _builder.append(_xifexpression_2, "");
      _builder.append("class ");
      String _name_1 = type.getName();
      _builder.append(_name_1, "");
      _builder.append(" extends ");
      String _xifexpression_3 = null;
      RecordType _parent_2 = type.getParent();
      boolean _notEquals_2 = (!Objects.equal(_parent_2, null));
      if (_notEquals_2) {
        RecordType _parent_3 = type.getParent();
        String _name_2 = _parent_3.getName();
        _xifexpression_3 = _name_2;
      } else {
        _xifexpression_3 = "AbstractMonitoringRecord";
      }
      _builder.append(_xifexpression_3, "");
      _builder.append(" implements ");
      CharSequence _createImplements = this.createImplements(type);
      _builder.append(_createImplements, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        boolean _isAbstract_2 = type.isAbstract();
        boolean _not_1 = (!_isAbstract_2);
        if (_not_1) {
          _builder.append("public static final int SIZE = ");
          int _calculateSize = this.calculateSize(allDataProperties);
          _builder.append(_calculateSize, "\t");
          _builder.append("; // serialization size (without variable part of strings)");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("private static final long serialVersionUID = ");
      _builder.append(serialUID, "\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      {
        boolean _isAbstract_3 = type.isAbstract();
        boolean _not_2 = (!_isAbstract_3);
        if (_not_2) {
          _builder.append("private static final Class<?>[] TYPES = {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          final Function1<Property,CharSequence> _function_1 = new Function1<Property,CharSequence>() {
            public CharSequence apply(final Property property) {
              CharSequence _createPropertyType = RecordTypeGenerator.this.createPropertyType(property, type);
              return _createPropertyType;
            }
          };
          Iterable<CharSequence> _map_1 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_1);
          String _join_1 = IterableExtensions.join(_map_1);
          _builder.append(_join_1, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("};");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      EList<Constant> _constants = type.getConstants();
      final Function1<Constant,CharSequence> _function_2 = new Function1<Constant,CharSequence>() {
        public CharSequence apply(final Constant const_) {
          CharSequence _createDefaultConstant = RecordTypeGenerator.this.createDefaultConstant(const_);
          return _createDefaultConstant;
        }
      };
      List<CharSequence> _map_2 = ListExtensions.<Constant, CharSequence>map(_constants, _function_2);
      String _join_2 = IterableExtensions.join(_map_2);
      _builder.append(_join_2, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      final Function1<Property,CharSequence> _function_3 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyDeclaration = RecordTypeGenerator.this.createPropertyDeclaration(property);
          return _createPropertyDeclaration;
        }
      };
      Iterable<CharSequence> _map_3 = IterableExtensions.<Property, CharSequence>map(allDeclarationProperties, _function_3);
      String _join_3 = IterableExtensions.join(_map_3);
      _builder.append(_join_3, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Creates a new instance of this class using the given parameters.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      final Function1<Property,CharSequence> _function_4 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyComment = RecordTypeGenerator.this.createPropertyComment(property);
          return _createPropertyComment;
        }
      };
      Iterable<CharSequence> _map_4 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_4);
      String _join_4 = IterableExtensions.join(_map_4);
      _builder.append(_join_4, "\t ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _name_3 = type.getName();
      _builder.append(_name_3, "\t");
      _builder.append("(");
      final Function1<Property,CharSequence> _function_5 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyParameter = RecordTypeGenerator.this.createPropertyParameter(property);
          return _createPropertyParameter;
        }
      };
      Iterable<CharSequence> _map_5 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_5);
      String _join_5 = IterableExtensions.join(_map_5, ", ");
      _builder.append(_join_5, "\t");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _xifexpression_4 = null;
      RecordType _parent_4 = type.getParent();
      boolean _notEquals_3 = (!Objects.equal(_parent_4, null));
      if (_notEquals_3) {
        RecordType _parent_5 = type.getParent();
        Collection<Property> _collectAllDataProperties = PropertyEvaluation.collectAllDataProperties(_parent_5);
        final Function1<Property,String> _function_6 = new Function1<Property,String>() {
          public String apply(final Property it) {
            String _name = it.getName();
            return _name;
          }
        };
        Iterable<String> _map_6 = IterableExtensions.<Property, String>map(_collectAllDataProperties, _function_6);
        String _join_6 = IterableExtensions.join(_map_6, ", ");
        String _plus = ("super(" + _join_6);
        String _plus_1 = (_plus + ");");
        _xifexpression_4 = _plus_1;
      }
      _builder.append(_xifexpression_4, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      final Function1<Property,CharSequence> _function_7 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyAssignment = RecordTypeGenerator.this.createPropertyAssignment(property);
          return _createPropertyAssignment;
        }
      };
      Iterable<CharSequence> _map_7 = IterableExtensions.<Property, CharSequence>map(allDeclarationProperties, _function_7);
      String _join_7 = IterableExtensions.join(_map_7);
      _builder.append(_join_7, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        boolean _isAbstract_4 = type.isAbstract();
        boolean _not_3 = (!_isAbstract_4);
        if (_not_3) {
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("* This constructor converts the given array into a record. It is recommended to use the array which is the result of a call to {@link #toArray()}.");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("* ");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("* @param values");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("*            The values for the record.");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          String _name_4 = type.getName();
          _builder.append(_name_4, "\t");
          _builder.append("(final Object[] values) { // NOPMD (direct store of values)");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            RecordType _parent_6 = type.getParent();
            boolean _equals_1 = Objects.equal(_parent_6, null);
            if (_equals_1) {
              _builder.append("AbstractMonitoringRecord.checkArray(values, TYPES);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
            } else {
              _builder.append("super(values, TYPES);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
            }
          }
          int _xifexpression_5 = (int) 0;
          RecordType _parent_7 = type.getParent();
          boolean _notEquals_4 = (!Objects.equal(_parent_7, null));
          if (_notEquals_4) {
            RecordType _parent_8 = type.getParent();
            Collection<Property> _collectAllDataProperties_1 = PropertyEvaluation.collectAllDataProperties(_parent_8);
            int _size_1 = _collectAllDataProperties_1.size();
            _xifexpression_5 = _size_1;
          } else {
            _xifexpression_5 = 0;
          }
          String _createPropertyGenericAssignments = this.createPropertyGenericAssignments(allDeclarationProperties, _xifexpression_5);
          _builder.append(_createPropertyGenericAssignments, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This constructor uses the given array to initialize the fields of this record.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @param values");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*            The values for the record.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @param valueTypes");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*            The types of the elements in the first array.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected ");
      String _name_5 = type.getName();
      _builder.append(_name_5, "\t");
      _builder.append("(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      {
        RecordType _parent_9 = type.getParent();
        boolean _equals_2 = Objects.equal(_parent_9, null);
        if (_equals_2) {
          _builder.append("AbstractMonitoringRecord.checkArray(values, valueTypes);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        } else {
          _builder.append("super(values, valueTypes);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        }
      }
      int _xifexpression_6 = (int) 0;
      RecordType _parent_10 = type.getParent();
      boolean _notEquals_5 = (!Objects.equal(_parent_10, null));
      if (_notEquals_5) {
        RecordType _parent_11 = type.getParent();
        Collection<Property> _collectAllDataProperties_2 = PropertyEvaluation.collectAllDataProperties(_parent_11);
        int _size_2 = _collectAllDataProperties_2.size();
        _xifexpression_6 = _size_2;
      } else {
        _xifexpression_6 = 0;
      }
      String _createPropertyGenericAssignments_1 = this.createPropertyGenericAssignments(allDeclarationProperties, _xifexpression_6);
      _builder.append(_createPropertyGenericAssignments_1, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This constructor converts the given array into a record.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @param buffer");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*            The bytes for the record.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @throws BufferUnderflowException");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*             if buffer not sufficient");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _name_6 = type.getName();
      _builder.append(_name_6, "\t");
      _builder.append("(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      {
        RecordType _parent_12 = type.getParent();
        boolean _notEquals_6 = (!Objects.equal(_parent_12, null));
        if (_notEquals_6) {
          _builder.append("super(buffer, stringRegistry);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        }
      }
      final Function1<Property,CharSequence> _function_8 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyValueFromBuffer = RecordTypeGenerator.this.createPropertyValueFromBuffer(property);
          return _createPropertyValueFromBuffer;
        }
      };
      Iterable<CharSequence> _map_8 = IterableExtensions.<Property, CharSequence>map(allDeclarationProperties, _function_8);
      String _join_8 = IterableExtensions.join(_map_8, "\n");
      _builder.append(_join_8, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        boolean _isAbstract_5 = type.isAbstract();
        boolean _not_4 = (!_isAbstract_5);
        if (_not_4) {
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public Object[] toArray() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return new Object[] {");
          _builder.newLine();
          _builder.append("\t\t\t");
          final Function1<Property,CharSequence> _function_9 = new Function1<Property,CharSequence>() {
            public CharSequence apply(final Property property) {
              CharSequence _createPropertyArrayEntry = RecordTypeGenerator.this.createPropertyArrayEntry(property);
              return _createPropertyArrayEntry;
            }
          };
          Iterable<CharSequence> _map_9 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_9);
          String _join_9 = IterableExtensions.join(_map_9, ",\n");
          _builder.append(_join_9, "\t\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("};");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {");
          _builder.newLine();
          _builder.append("\t\t");
          final Function1<Property,CharSequence> _function_10 = new Function1<Property,CharSequence>() {
            public CharSequence apply(final Property property) {
              CharSequence _createPropertyBinarySerialization = RecordTypeGenerator.this.createPropertyBinarySerialization(property);
              return _createPropertyBinarySerialization;
            }
          };
          Iterable<CharSequence> _map_10 = IterableExtensions.<Property, CharSequence>map(allDataProperties, _function_10);
          String _join_10 = IterableExtensions.join(_map_10, "\n");
          _builder.append(_join_10, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public Class<?>[] getValueTypes() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return TYPES; // NOPMD");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public int getSize() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return SIZE;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* {@inheritDoc}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Deprecated");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void initFromArray(final Object[] values) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new UnsupportedOperationException();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* {@inheritDoc}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Deprecated");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new UnsupportedOperationException();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      final Function1<Property,CharSequence> _function_11 = new Function1<Property,CharSequence>() {
        public CharSequence apply(final Property property) {
          CharSequence _createPropertyGetter = RecordTypeGenerator.this.createPropertyGetter(property);
          return _createPropertyGetter;
        }
      };
      Iterable<CharSequence> _map_11 = IterableExtensions.<Property, CharSequence>map(allGetterDeclarationProperties, _function_11);
      String _join_11 = IterableExtensions.join(_map_11);
      _builder.append(_join_11, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * Create the sequence of implements of the class
   */
  public CharSequence createImplements(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory");
    String _xifexpression = null;
    boolean _and = false;
    EList<PartialRecordType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<PartialRecordType> _parents_1 = type.getParents();
      int _size = _parents_1.size();
      boolean _greaterThan = (_size > 0);
      _and = (_notEquals && _greaterThan);
    }
    if (_and) {
      EList<PartialRecordType> _parents_2 = type.getParents();
      final Function1<PartialRecordType,CharSequence> _function = new Function1<PartialRecordType,CharSequence>() {
        public CharSequence apply(final PartialRecordType i) {
          CharSequence _createImplement = RecordTypeGenerator.this.createImplement(i);
          return _createImplement;
        }
      };
      List<CharSequence> _map = ListExtensions.<PartialRecordType, CharSequence>map(_parents_2, _function);
      String _join = IterableExtensions.join(_map, ", ");
      String _plus = (", " + _join);
      _xifexpression = _plus;
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  public CharSequence createImplement(final PartialRecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = type.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  /**
   * Create a list of imports for the given type.
   */
  public CharSequence createInterfaceImport(final PartialRecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = type.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create import for the parent structure.
   */
  public CharSequence createParentImport(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    RecordType _parent = type.getParent();
    EObject _eContainer = _parent.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(".");
    RecordType _parent_1 = type.getParent();
    String _name_1 = _parent_1.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Determine the correct deserialization code for a property by type.
   * 
   * @param property
   * 		the property to deserialize
   * 
   * @returns
   * 		code to deserialize the given property
   */
  public CharSequence createPropertyValueFromBuffer(final Property property) {
    CharSequence _xifexpression = null;
    Classifier _findType = this.findType(property);
    EList<ArraySize> _sizes = _findType.getSizes();
    int _size = _sizes.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      CharSequence _xblockexpression = null;
      {
        Classifier _findType_1 = this.findType(property);
        final EList<ArraySize> sizes = _findType_1.getSizes();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("int __sizes[] = new int[");
        int _size_1 = sizes.size();
        _builder.append(_size_1, "\t");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("for (int i=0;i<");
        int _size_2 = sizes.size();
        _builder.append(_size_2, "\t");
        _builder.append(";i++)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("__sizes[i] = buffer.getInt();");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _makeLoop = this.makeLoop(sizes, 0, property);
        _builder.append(_makeLoop, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _xblockexpression = (_builder);
      }
      _xifexpression = _xblockexpression;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("this.");
      String _name = property.getName();
      _builder.append(_name, "");
      _builder.append(" = ");
      Classifier _findType_1 = this.findType(property);
      EClassifier _class_ = _findType_1.getClass_();
      CharSequence _createPropertyPrimitiveTypeDeserialization = this.createPropertyPrimitiveTypeDeserialization(_class_);
      _builder.append(_createPropertyPrimitiveTypeDeserialization, "");
      _builder.append(";");
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence makeLoop(final EList<ArraySize> sizes, final int depth, final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for (int i");
    _builder.append(depth, "");
    _builder.append("=0;i");
    _builder.append(depth, "");
    _builder.append("<__sizes[");
    _builder.append(depth, "");
    _builder.append("];i");
    _builder.append(depth, "");
    _builder.append("++)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _xifexpression = null;
    int _size = sizes.size();
    int _minus = (_size - 1);
    boolean _greaterThan = (_minus > depth);
    if (_greaterThan) {
      CharSequence _makeLoop = this.makeLoop(sizes, (depth + 1), property);
      _xifexpression = _makeLoop;
    } else {
      String _makeAssignment = this.makeAssignment(sizes, property);
      _xifexpression = _makeAssignment;
    }
    _builder.append(_xifexpression, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String makeAssignment(final EList<ArraySize> sizes, final Property property) {
    String arrays = "";
    int _size = sizes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(arrays, "");
      _builder.append("[i");
      _builder.append(i, "");
      _builder.append("]");
      arrays = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("this.");
    String _name = property.getName();
    _builder_1.append(_name, "");
    _builder_1.append(arrays, "");
    _builder_1.append(" = ");
    Classifier _findType = this.findType(property);
    EClassifier _class_ = _findType.getClass_();
    CharSequence _createPropertyPrimitiveTypeDeserialization = this.createPropertyPrimitiveTypeDeserialization(_class_);
    _builder_1.append(_createPropertyPrimitiveTypeDeserialization, "");
    _builder_1.append(";");
    return _builder_1.toString();
  }
  
  public CharSequence createPropertyPrimitiveTypeDeserialization(final EClassifier classifier) {
    CharSequence _switchResult = null;
    String _name = classifier.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("stringRegistry.get(buffer.getInt())");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("buffer.get()");
        _switchResult = _builder_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("buffer.getshort()");
        _switchResult = _builder_2;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("buffer.getInt()");
        _switchResult = _builder_3;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("buffer.getLong()");
        _switchResult = _builder_4;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("buffer.getFloat()");
        _switchResult = _builder_5;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("buffer.getDouble()");
        _switchResult = _builder_6;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("buffer.getChar()");
        _switchResult = _builder_7;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("buffer.get()==1?true:false");
        _switchResult = _builder_8;
      }
    }
    return _switchResult;
  }
  
  /**
   * Determine the correct serialization for a property by type.
   * 
   * @param property
   * 		the property to serialize
   * 
   * @returns
   * 		code to serialize the given property
   */
  public CharSequence createPropertyBinarySerialization(final Property property) {
    CharSequence _switchResult = null;
    Classifier _findType = this.findType(property);
    EClassifier _class_ = _findType.getClass_();
    String _name = _class_.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("buffer.putInt(stringRegistry.get(this.get");
        String _name_1 = property.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "");
        _builder.append("()));");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("buffer.put((byte)this.get");
        String _name_2 = property.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder_1.append(_firstUpper_1, "");
        _builder_1.append("());");
        _switchResult = _builder_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("buffer.putShort(this.get");
        String _name_3 = property.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
        _builder_2.append(_firstUpper_2, "");
        _builder_2.append("());");
        _switchResult = _builder_2;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("buffer.putInt(this.get");
        String _name_4 = property.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
        _builder_3.append(_firstUpper_3, "");
        _builder_3.append("());");
        _switchResult = _builder_3;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("buffer.putLong(this.get");
        String _name_5 = property.getName();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
        _builder_4.append(_firstUpper_4, "");
        _builder_4.append("());");
        _switchResult = _builder_4;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("buffer.putFloat(this.get");
        String _name_6 = property.getName();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
        _builder_5.append(_firstUpper_5, "");
        _builder_5.append("());");
        _switchResult = _builder_5;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("buffer.putDouble(this.get");
        String _name_7 = property.getName();
        String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
        _builder_6.append(_firstUpper_6, "");
        _builder_6.append("());");
        _switchResult = _builder_6;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("buffer.putChar(this.get");
        String _name_8 = property.getName();
        String _firstUpper_7 = StringExtensions.toFirstUpper(_name_8);
        _builder_7.append(_firstUpper_7, "");
        _builder_7.append("());");
        _switchResult = _builder_7;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("buffer.put((byte)(this.is");
        String _name_9 = property.getName();
        String _firstUpper_8 = StringExtensions.toFirstUpper(_name_9);
        _builder_8.append(_firstUpper_8, "");
        _builder_8.append("()?1:0));");
        _switchResult = _builder_8;
      }
    }
    return _switchResult;
  }
  
  /**
   * Creates a getter for a given property.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns the resulting getter as a CharSequence
   */
  public CharSequence createPropertyGetter(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public final ");
    Classifier _findType = this.findType(property);
    CharSequence _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    CharSequence _createGetterName = this.createGetterName(property);
    _builder.append(_createGetterName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    CharSequence _resolveName = this.resolveName(property);
    _builder.append(_resolveName, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Returns the name of a property for the object array composition
   * 
   * @param property
   * 		 a property of the record type
   * 
   * @returns the resulting array entry
   */
  public CharSequence createPropertyArrayEntry(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    CharSequence _createGetterName = this.createGetterName(property);
    _builder.append(_createGetterName, "");
    _builder.append("()");
    return _builder;
  }
  
  /**
   * Returns the correct name for a getter following Java conventions.
   * 
   * @param property
   * 		a property of a record type
   * 
   * @returns the name of the getter of the property
   */
  public CharSequence createGetterName(final Property property) {
    CharSequence _xifexpression = null;
    Classifier _findType = this.findType(property);
    EClassifier _class_ = _findType.getClass_();
    String _name = _class_.getName();
    boolean _equals = _name.equals("boolean");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("is");
      String _name_1 = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      _builder.append(_firstUpper, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("get");
      String _name_2 = property.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      _builder_1.append(_firstUpper_1, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Determine the implementation property name of a property by following the alias graph.
   * 
   * @param property
   * 		The property to resolve
   * 
   * @returns the implementation name of the property
   */
  public CharSequence resolveName(final Property property) {
    Property _referTo = property.getReferTo();
    boolean _notEquals = (!Objects.equal(_referTo, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      Property _referTo_1 = property.getReferTo();
      CharSequence _createGetterName = this.createGetterName(_referTo_1);
      _builder.append(_createGetterName, "");
      _builder.append("()");
      return _builder;
    } else {
      return property.getName();
    }
  }
  
  /**
   * Create all assignments for the generic constructor based on property name and an array.
   * 
   * @param property
   * 		a property of the record type
   * @param offset
   * 		the array offset
   * 
   * @returns all assignments for the given property list
   */
  public String createPropertyGenericAssignments(final Iterable<Property> list, final int offset) {
    BasicEList<CharSequence> _basicEList = new BasicEList<CharSequence>();
    final EList<CharSequence> r = _basicEList;
    final Procedure2<Property,Integer> _function = new Procedure2<Property,Integer>() {
      public void apply(final Property property, final Integer index) {
        String _createPropertyGenericAssignment = RecordTypeGenerator.this.createPropertyGenericAssignment(property, ((index).intValue() + offset));
        r.add(_createPropertyGenericAssignment);
      }
    };
    IterableExtensions.<Property>forEach(list, _function);
    return IterableExtensions.join(r);
  }
  
  /**
   * Create an assignment with a property as assignment target and an array value as source.
   * Used in the generic constructor.
   * 
   * @param property
   * 		a property of the record type
   * @param index
   * 		the array index
   * 
   * @returns one assignment
   */
  public String createPropertyGenericAssignment(final Property property, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(" = (");
    Classifier _findType = this.findType(property);
    CharSequence _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(") values[");
    _builder.append(index, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  /**
   * Create an assignment with a property as assignment target and an array value as source.
   * 
   * @param property
   * 		a property of the record type
   * @param index
   * 		the array index
   * 
   * @returns one assignment
   */
  public CharSequence createPropertyAssignment(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create one entry for the constructor parameter sequence.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one parameter for the given property
   */
  public CharSequence createPropertyParameter(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final ");
    Classifier _findType = this.findType(property);
    CharSequence _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = property.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  /**
   * Create an arbitrary comment for a property of a monitoring record.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one comment
   */
  public CharSequence createPropertyComment(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* @param ");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*            ");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create a property declaration for a monitoring record.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns  one property declaration
   */
  public CharSequence createPropertyDeclaration(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final ");
    Classifier _findType = this.findType(property);
    CharSequence _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create one entry of the property type array.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one type entry
   */
  public CharSequence createPropertyType(final Property property, final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _findType = this.findType(property);
    CharSequence _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(".class, // ");
    CharSequence _computeFullQualifiedPropertyName = this.computeFullQualifiedPropertyName(property, type);
    _builder.append(_computeFullQualifiedPropertyName, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Compute the full qualified name of a property.
   * 
   * @param property
   * 		the property itself
   * @param type
   * 		the present RecordType
   * 
   * @returns
   * 		the FQ property name
   */
  public CharSequence computeFullQualifiedPropertyName(final Property property, final RecordType type) {
    EList<Property> _properties = type.getProperties();
    boolean _contains = _properties.contains(property);
    if (_contains) {
      String _name = type.getName();
      String _plus = (_name + ".");
      String _name_1 = property.getName();
      return (_plus + _name_1);
    } else {
      RecordType _parent = type.getParent();
      boolean _notEquals = (!Objects.equal(_parent, null));
      if (_notEquals) {
        RecordType _parent_1 = type.getParent();
        final CharSequence result = this.computeFullQualifiedPropertyName(property, _parent_1);
        boolean _notEquals_1 = (!Objects.equal(result, null));
        if (_notEquals_1) {
          return result;
        }
      }
      EList<PartialRecordType> _parents = type.getParents();
      boolean _notEquals_2 = (!Objects.equal(_parents, null));
      if (_notEquals_2) {
        EList<PartialRecordType> _parents_1 = type.getParents();
        for (final Type t : _parents_1) {
          {
            final CharSequence result_1 = this.computeFullQualifiedPropertyName(property, t);
            boolean _notEquals_3 = (!Objects.equal(result_1, null));
            if (_notEquals_3) {
              return result_1;
            }
          }
        }
      }
      return null;
    }
  }
  
  /**
   * Compute the full qualified name of a property.
   * 
   * @param property
   * 		the property itself
   * @param type
   * 		the present RecordType
   * 
   * @returns
   * 		the FQ property name
   */
  public CharSequence computeFullQualifiedPropertyName(final Property property, final Type type) {
    EList<Property> _properties = type.getProperties();
    boolean _contains = _properties.contains(property);
    if (_contains) {
      String _name = type.getName();
      String _plus = (_name + ".");
      String _name_1 = property.getName();
      return (_plus + _name_1);
    } else {
      EList<PartialRecordType> _parents = type.getParents();
      boolean _notEquals = (!Objects.equal(_parents, null));
      if (_notEquals) {
        EList<PartialRecordType> _parents_1 = type.getParents();
        for (final Type t : _parents_1) {
          {
            final CharSequence result2 = this.computeFullQualifiedPropertyName(property, t);
            boolean _notEquals_1 = (!Objects.equal(result2, null));
            if (_notEquals_1) {
              return result2;
            }
          }
        }
      }
    }
    return null;
  }
  
  /**
   * create a constant name from a standard name camel case name.
   */
  public String createConstName(final String name) {
    return name.replaceAll("", "");
  }
  
  /**
   * Create a property constant based on the language default expression.
   * 
   * @param constant
   * 		a default constant object
   * 
   * @returns a constant declaration
   */
  public CharSequence createDefaultConstant(final Constant constant) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final ");
    Classifier _type = constant.getType();
    CharSequence _createTypeName = this.createTypeName(_type);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = constant.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Literal _value = constant.getValue();
    CharSequence _createValue = this.createValue(_value);
    _builder.append(_createValue, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
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
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      String _name_1 = classifier.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  /**
   * Compute the directory name for a record type.
   */
  public CharSequence directoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
    _builder.append(File.separator, "");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  public String fileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.directoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".java");
    return _builder.toString();
  }
  
  /**
   * Collect recursively a list of all properties which are defined in an template and
   * not inherited from predecessors.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties which require getters
   */
  public Iterable<Property> collectAllGetterDeclarationProperties(final RecordType type) {
    Iterable<Property> result = PropertyEvaluation.collectAllProperties(type);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      return this.removeAlreadyImplementedProperties(result, _parent_1);
    } else {
      return result;
    }
  }
  
  /**
   * Collect all properties which must be declared for this type. In total that are:
   * - properties declared by the type, which are not an alias.
   * - properties declared by any imported interface, which are not implemented in a parent type
   *   and which are not an alias.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties which require declaration
   */
  public Iterable<Property> collectAllDeclarationProperties(final RecordType type) {
    ArrayList<Property> _arrayList = new ArrayList<Property>();
    Collection<Property> properties = _arrayList;
    EList<Property> _properties = type.getProperties();
    properties.addAll(_properties);
    Collection<Property> _collectAllTemplateProperties = PropertyEvaluation.collectAllTemplateProperties(type);
    properties.addAll(_collectAllTemplateProperties);
    final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
      public Boolean apply(final Property property) {
        Property _referTo = property.getReferTo();
        boolean _equals = Objects.equal(_referTo, null);
        return Boolean.valueOf(_equals);
      }
    };
    Iterable<Property> declarationProperties = IterableExtensions.<Property>filter(properties, _function);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      return this.removeAlreadyImplementedProperties(declarationProperties, _parent_1);
    } else {
      return declarationProperties;
    }
  }
  
  /**
   * Find properties implemented in a type and remove them from the list of properties.
   * 
   * @param type
   * 		the parent type of the type where the property list belongs to
   * 
   * @returns
   * 		the remaining list of properties
   */
  public Iterable<Property> removeAlreadyImplementedProperties(final Iterable<Property> list, final RecordType parentType) {
    final Collection<Property> interfaceProperties = PropertyEvaluation.collectAllProperties(parentType);
    Iterable<Property> result = list;
    for (final Property interfaceProperty : interfaceProperties) {
      final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
        public Boolean apply(final Property item) {
          String _name = item.getName();
          String _name_1 = interfaceProperty.getName();
          boolean _equals = _name.equals(_name_1);
          boolean _not = (!_equals);
          return Boolean.valueOf(_not);
        }
      };
      Iterable<Property> _filter = IterableExtensions.<Property>filter(result, _function);
      result = _filter;
    }
    return result;
  }
  
  /**
   * Dispatch for literals
   */
  protected CharSequence _createValue(final StringLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = literal.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _createValue(final IntLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = literal.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _createValue(final FloatLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    Float _value = literal.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _createValue(final BooleanLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    Boolean _value = literal.getValue();
    if ((_value).booleanValue()) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected CharSequence _createValue(final ConstantLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    Constant _value = literal.getValue();
    Literal _value_1 = _value.getValue();
    CharSequence _createValue = this.createValue(_value_1);
    _builder.append(_createValue, "");
    return _builder;
  }
  
  protected CharSequence _createValue(final Literal literal) {
    Class<? extends Literal> _class = literal.getClass();
    String _name = _class.getName();
    String _plus = ("ERROR " + _name);
    return _plus;
  }
  
  public CharSequence createValue(final Literal literal) {
    if (literal instanceof BooleanLiteral) {
      return _createValue((BooleanLiteral)literal);
    } else if (literal instanceof ConstantLiteral) {
      return _createValue((ConstantLiteral)literal);
    } else if (literal instanceof FloatLiteral) {
      return _createValue((FloatLiteral)literal);
    } else if (literal instanceof IntLiteral) {
      return _createValue((IntLiteral)literal);
    } else if (literal instanceof StringLiteral) {
      return _createValue((StringLiteral)literal);
    } else if (literal != null) {
      return _createValue(literal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(literal).toString());
    }
  }
}
