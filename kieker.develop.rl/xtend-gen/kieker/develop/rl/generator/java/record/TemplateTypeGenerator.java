package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.io.File;
import java.util.List;
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import kieker.develop.rl.generator.java.JavaTypeMapping;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.recordLang.Type;
import kieker.develop.rl.typing.TypeResolution;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TemplateTypeGenerator extends AbstractTemplateTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
    return _builder.toString();
  }
  
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
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
    _builder.append(".java");
    return _builder.toString();
  }
  
  @Override
  public CharSequence generate(final TemplateType type) {
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
      _builder.append("package ");
      EObject _eContainer = type.eContainer();
      String _name = ((Model) _eContainer).getName();
      _builder.append(_name, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<TemplateType> _parents = type.getParents();
      CharSequence _createImports = this.createImports(_parents, type);
      _builder.append(_createImports, "");
      _builder.newLineIfNotEmpty();
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
      _builder.append("public interface ");
      String _name_1 = type.getName();
      _builder.append(_name_1, "");
      _builder.append(" extends ");
      EList<TemplateType> _parents_1 = type.getParents();
      CharSequence _createExtends = this.createExtends(_parents_1);
      _builder.append(_createExtends, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      EList<Property> _properties = type.getProperties();
      final Function1<Property, CharSequence> _function = (Property property) -> {
        return this.createPropertyGetter(property);
      };
      List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(_properties, _function);
      String _join = IterableExtensions.join(_map);
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private boolean isInSamePackage(final TemplateType left, final TemplateType right) {
    EObject _eContainer = left.eContainer();
    String _name = ((Model) _eContainer).getName();
    EObject _eContainer_1 = right.eContainer();
    String _name_1 = ((Model) _eContainer_1).getName();
    return (!Objects.equal(_name, _name_1));
  }
  
  private CharSequence createImports(final EList<TemplateType> parents, final TemplateType type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(parents, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = parents.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final Function1<TemplateType, Boolean> _function = (TemplateType t) -> {
        return Boolean.valueOf(this.isInSamePackage(type, t));
      };
      Iterable<TemplateType> _filter = IterableExtensions.<TemplateType>filter(parents, _function);
      final Function1<TemplateType, CharSequence> _function_1 = (TemplateType it) -> {
        return this.createImport(it);
      };
      Iterable<CharSequence> _map = IterableExtensions.<TemplateType, CharSequence>map(_filter, _function_1);
      _xifexpression = IterableExtensions.join(_map);
    } else {
      _xifexpression = this.createDefaultImport();
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  private CharSequence createDefaultImport() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import kieker.common.record.IMonitoringRecord;");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createImport(final TemplateType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(".");
    _builder.append(type, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createExtends(final EList<TemplateType> parents) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(parents, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = parents.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final Function1<TemplateType, String> _function = (TemplateType t) -> {
        return t.getName();
      };
      List<String> _map = ListExtensions.<TemplateType, String>map(parents, _function);
      _xifexpression = IterableExtensions.join(_map, ", ");
    } else {
      _xifexpression = "IMonitoringRecord";
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  /**
   * Creates a getter for a given property.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns the resulting getter as a CharSequence
   */
  private CharSequence createPropertyGetter(final Property property) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      Classifier _findType = TypeResolution.findType(property);
      BaseType _type = _findType.getType();
      String _createPrimitiveTypeName = JavaTypeMapping.createPrimitiveTypeName(_type);
      _builder.append(_createPrimitiveTypeName, "");
      _builder.append(" ");
      CharSequence _createGetterName = NameResolver.createGetterName(property);
      _builder.append(_createGetterName, "");
      _builder.append("() ;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
