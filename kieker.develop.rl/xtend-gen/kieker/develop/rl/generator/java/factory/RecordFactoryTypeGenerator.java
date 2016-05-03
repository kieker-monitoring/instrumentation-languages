package kieker.develop.rl.generator.java.factory;

import com.google.common.base.Objects;
import java.io.File;
import java.util.Calendar;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java.factory");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Java factory");
    return _builder.toString();
  }
  
  /**
   * No factory for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java-factory");
    return _builder.toString();
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
   * Compute file name.
   */
  @Override
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("Factory.java");
    return _builder.toString();
  }
  
  /**
   * Primary code generation template.
   * 
   * @param type
   * 		one record type to be used to create the corresponding monitoring record factory
   * @param author
   * 		generic author name for the record
   * @param version
   * 		generic kieker version for the record
   */
  @Override
  public CharSequence createContent(final RecordType type, final String author, final String version, final String headerComment) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      String _author = type.getAuthor();
      boolean _equals = Objects.equal(_author, null);
      if (_equals) {
        _xifexpression = author;
      } else {
        _xifexpression = type.getAuthor();
      }
      final String definedAuthor = _xifexpression;
      String _xifexpression_1 = null;
      String _since = type.getSince();
      boolean _equals_1 = Objects.equal(_since, null);
      if (_equals_1) {
        _xifexpression_1 = version;
      } else {
        _xifexpression_1 = type.getSince();
      }
      final String definedVersion = _xifexpression_1;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _equals_2 = headerComment.equals("");
        boolean _not = (!_equals_2);
        if (_not) {
          Calendar _instance = Calendar.getInstance();
          int _get = _instance.get(Calendar.YEAR);
          String _string = Integer.valueOf(_get).toString();
          String _replace = headerComment.replace("THIS-YEAR", _string);
          _builder.append(_replace, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("package ");
      EObject _eContainer = type.eContainer();
      String _name = ((Model) _eContainer).getName();
      _builder.append(_name, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.nio.ByteBuffer;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import kieker.common.record.factory.IRecordFactory;");
      _builder.newLine();
      _builder.append("import kieker.common.util.registry.IRegistry;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @author ");
      _builder.append(definedAuthor, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @since ");
      _builder.append(definedVersion, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public final class ");
      String _name_1 = type.getName();
      _builder.append(_name_1, "");
      _builder.append("Factory implements IRecordFactory<");
      String _name_2 = type.getName();
      _builder.append(_name_2, "");
      _builder.append("> {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _name_3 = type.getName();
      _builder.append(_name_3, "\t");
      _builder.append(" create(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return new ");
      String _name_4 = type.getName();
      _builder.append(_name_4, "\t\t");
      _builder.append("(buffer, stringRegistry);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _name_5 = type.getName();
      _builder.append(_name_5, "\t");
      _builder.append(" create(final Object[] values) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return new ");
      String _name_6 = type.getName();
      _builder.append(_name_6, "\t\t");
      _builder.append("(values);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public int getRecordSizeInBytes() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return ");
      String _name_7 = type.getName();
      _builder.append(_name_7, "\t\t");
      _builder.append(".SIZE;");
      _builder.newLineIfNotEmpty();
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
