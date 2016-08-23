package kieker.develop.rl.generator.c.main;

import com.google.common.base.Objects;
import java.io.File;
import java.util.List;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.generator.c.CommonCFunctionsExtension;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.Type;
import kieker.develop.rl.typing.PropertyResolution;
import kieker.develop.rl.typing.TypeResolution;
import kieker.develop.rl.typing.base.BaseTypes;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c.main");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C code generator");
    return _builder.toString();
  }
  
  /**
   * No serialization for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * Compute the directory name for a record type.
   */
  @Override
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
  @Override
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
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c");
    return _builder.toString();
  }
  
  /**
   * Primary code generation template.
   * 
   * @param type
   * 		one record type to be used to create monitoring record
   * @param author
   * 		generic author name for the record
   * @param version
   * 		generic kieker version for the record
   * @param headerComment
   *      comment placed as header of the file
   */
  @Override
  public CharSequence generate(final RecordType type) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      String _author = type.getAuthor();
      boolean _equals = Objects.equal(_author, null);
      if (_equals) {
        _xifexpression = this.getAuthor();
      } else {
        _xifexpression = type.getAuthor();
      }
      final String definedAuthor = _xifexpression;
      String _xifexpression_1 = null;
      String _since = type.getSince();
      boolean _equals_1 = Objects.equal(_since, null);
      if (_equals_1) {
        _xifexpression_1 = this.getVersion();
      } else {
        _xifexpression_1 = type.getSince();
      }
      final String definedVersion = _xifexpression_1;
      StringConcatenation _builder = new StringConcatenation();
      String _header = this.getHeader();
      _builder.append(_header, "");
      _builder.append("#include <stdlib.h>");
      _builder.newLineIfNotEmpty();
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
      _builder.append(definedAuthor, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* Version: ");
      _builder.append(definedVersion, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      CharSequence _createSerializer = this.createSerializer(type);
      _builder.append(_createSerializer, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
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
    List<Property> _collectAllDataProperties = PropertyResolution.collectAllDataProperties(type);
    final Function1<Property, CharSequence> _function = (Property it) -> {
      return this.createValueSerializer(it);
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
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("length += kieker_serialize_");
      Classifier _findType = TypeResolution.findType(property);
      String _serializerSuffix = this.serializerSuffix(_findType);
      _builder.append(_serializerSuffix, "");
      _builder.append("(buffer,offset,");
      String _name = property.getName();
      _builder.append(_name, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String serializerSuffix(final Classifier classifier) throws InternalErrorException {
    String _switchResult = null;
    BaseType _type = classifier.getType();
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          _switchResult = "string";
          break;
        case BYTE:
          _switchResult = "int8";
          break;
        case SHORT:
          _switchResult = "int16";
          break;
        case INT:
          _switchResult = "int32";
          break;
        case LONG:
          _switchResult = "int64";
          break;
        case FLOAT:
          _switchResult = "float";
          break;
        case DOUBLE:
          _switchResult = "double";
          break;
        case CHAR:
          _switchResult = "int16";
          break;
        case BOOLEAN:
          _switchResult = "boolean";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
