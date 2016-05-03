package kieker.develop.rl.generator.c.header;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import kieker.develop.rl.generator.c.CommonCFunctionsExtension;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.Type;
import kieker.develop.rl.validation.PropertyEvaluation;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends kieker.develop.rl.generator.c.main.RecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c.header");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C header file generator");
    return _builder.toString();
  }
  
  /**
   * No header for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * File name for c-header files.
   */
  @Override
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    String _cstyleName = CommonCFunctionsExtension.cstyleName(_name);
    _builder.append(_cstyleName, "");
    _builder.append(".h");
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
  @Override
  public CharSequence createContent(final RecordType type, final String author, final String version, final String headerComment) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = headerComment.equals("");
      boolean _not = (!_equals);
      if (_not) {
        Calendar _instance = Calendar.getInstance();
        int _get = _instance.get(Calendar.YEAR);
        String _string = Integer.valueOf(_get).toString();
        String _replace = headerComment.replace("THIS-YEAR", _string);
        _builder.append(_replace, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("#include <stdlib.h>");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <kieker.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*");
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
    CharSequence _createStructure = this.createStructure(type);
    _builder.append(_createStructure, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createSerializerDeclaration = this.createSerializerDeclaration(type);
    _builder.append(_createSerializerDeclaration, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createStructure(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef struct {");
    _builder.newLine();
    _builder.append("\t");
    List<Property> _collectAllDataProperties = PropertyEvaluation.collectAllDataProperties(type);
    final Function1<Property, CharSequence> _function = (Property it) -> {
      return this.createPropertyDeclaration(it);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(_collectAllDataProperties, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("} ");
    CharSequence _packageName = CommonCFunctionsExtension.packageName(type);
    _builder.append(_packageName, "");
    _builder.append("_");
    String _name = type.getName();
    String _cstyleName = CommonCFunctionsExtension.cstyleName(_name);
    _builder.append(_cstyleName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createPropertyDeclaration(final Property property) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      Classifier _findType = PropertyEvaluation.findType(property);
      String _createTypeName = CommonCFunctionsExtension.createTypeName(_findType);
      _builder.append(_createTypeName, "");
      _builder.append(" ");
      String _name = property.getName();
      _builder.append(_name, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Generate the serializer for the given record type.
   */
  private CharSequence createSerializerDeclaration(final RecordType type) {
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
    _builder.append(" value);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
