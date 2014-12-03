package de.cau.cs.se.instrumentation.rl.generator.c.main;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.c.CommonCFunctionsExtension;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c.main");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C code generator");
    return _builder.toString();
  }
  
  /**
   * No serialization for abstract record types.
   */
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * Compute the directory name for a record type.
   */
  public CharSequence getDirectoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  /**
   * compute the filename of a c file.
   */
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    String _cstyleName = CommonCFunctionsExtension.cstyleName(_name);
    _builder.append(_cstyleName, "");
    _builder.append(".c");
    return _builder.toString();
  }
  
  /**
   * Return the language type name.
   */
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c");
    return _builder.toString();
  }
  
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
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("#include <kieker.h>");
    _builder.newLine();
    _builder.append("#include \"");
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append("/");
    CharSequence _packageName = CommonCFunctionsExtension.packageName(type);
    _builder.append(_packageName, "");
    _builder.append("_");
    String _name = type.getName();
    String _cstyleName = CommonCFunctionsExtension.cstyleName(_name);
    _builder.append(_cstyleName, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Author: ");
    _builder.append(author, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* Version: ");
    _builder.append(version, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    CharSequence _createSerializer = this.createSerializer(type);
    _builder.append(_createSerializer, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generate the serializer for the given record type.
   */
  private CharSequence createSerializer(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Serialize an ");
    String _name = type.getName();
    _builder.append(_name, " ");
    _builder.append(" and return the size of the written structure.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* buffer = the buffer to send the data");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* id = id to identify the record type");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* offset = store data to buffer at offset");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* value = the value to be stored");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* returns size of written structure");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("int ");
    CharSequence _packageName = CommonCFunctionsExtension.packageName(type);
    _builder.append(_packageName, "");
    _builder.append("_");
    String _name_1 = type.getName();
    String _cstyleName = CommonCFunctionsExtension.cstyleName(_name_1);
    _builder.append(_cstyleName, "");
    _builder.append("_serialize(char *buffer, const int id, const int offset, const ");
    CharSequence _packageName_1 = CommonCFunctionsExtension.packageName(type);
    _builder.append(_packageName_1, "");
    _builder.append("_");
    String _name_2 = type.getName();
    String _cstyleName_1 = CommonCFunctionsExtension.cstyleName(_name_2);
    _builder.append(_cstyleName_1, "");
    _builder.append(" value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("int length = 0;");
    _builder.newLine();
    _builder.append("\t");
    List<Property> _collectAllDataProperties = PropertyEvaluation.collectAllDataProperties(type);
    final Function1<Property, CharSequence> _function = new Function1<Property, CharSequence>() {
      public CharSequence apply(final Property it) {
        return RecordTypeGenerator.this.createValueSerializer(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(_collectAllDataProperties, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return length;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createValueSerializer(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("length += kieker_serialize_");
    Classifier _findType = PropertyEvaluation.findType(property);
    String _serializerSuffix = this.serializerSuffix(_findType);
    _builder.append(_serializerSuffix, "");
    _builder.append("(buffer,offset,");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String serializerSuffix(final Classifier classifier) {
    String _switchResult = null;
    EClassifier _class_ = classifier.getClass_();
    String _name = _class_.getName();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_name, "string")) {
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "byte")) {
        _matched=true;
        _switchResult = "int8";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "short")) {
        _matched=true;
        _switchResult = "int16";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "int")) {
        _matched=true;
        _switchResult = "int32";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "long")) {
        _matched=true;
        _switchResult = "int64";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "float")) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "double")) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "char")) {
        _matched=true;
        _switchResult = "int16";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "boolean")) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      EClassifier _class__1 = classifier.getClass_();
      _switchResult = _class__1.getName();
    }
    return _switchResult;
  }
}
