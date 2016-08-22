package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.util.List;
import kieker.develop.rl.generator.java.JavaTypeMapping;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.typing.PropertyResolution;
import kieker.develop.rl.typing.TypeResolution;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PropertyConstructionModule {
  public static String createProperties(final List<Property> properties) {
    final Function1<Property, CharSequence> _function = (Property property) -> {
      return PropertyConstructionModule.createPropertyDeclaration(property);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(properties, _function);
    return IterableExtensions.join(_map);
  }
  
  /**
   * Create a property declaration for a monitoring record.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns  one property declaration
   */
  private static CharSequence createPropertyDeclaration(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final ");
    Classifier _findType = TypeResolution.findType(property);
    String _createTypeName = JavaTypeMapping.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _createName = NameResolver.createName(property);
    _builder.append(_createName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static String createPropertyGetters(final RecordType type) {
    List<Property> _collectAllGetterDeclarationProperties = PropertyResolution.collectAllGetterDeclarationProperties(type);
    final Function1<Property, CharSequence> _function = (Property it) -> {
      return PropertyConstructionModule.createPropertyGetter(it);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(_collectAllGetterDeclarationProperties, _function);
    return IterableExtensions.join(_map, "\n");
  }
  
  /**
   * Creates a getter for a given property.
   * 
   * @param property(
   * 		a property of the record type
   * 
   * @returns the resulting getter as a CharSequence
   */
  private static CharSequence createPropertyGetter(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public final ");
    Classifier _findType = TypeResolution.findType(property);
    String _createTypeName = JavaTypeMapping.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    CharSequence _createGetterName = NameResolver.createGetterName(property);
    _builder.append(_createGetterName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    CharSequence _xifexpression = null;
    Property _referTo = property.getReferTo();
    boolean _notEquals = (!Objects.equal(_referTo, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      Property _referTo_1 = property.getReferTo();
      CharSequence _createGetterName_1 = NameResolver.createGetterName(_referTo_1);
      _builder_1.append(_createGetterName_1, "");
      _builder_1.append("()");
      _xifexpression = _builder_1;
    } else {
      _xifexpression = NameResolver.createName(property);
    }
    _builder.append(_xifexpression, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
}
