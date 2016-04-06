package kieker.develop.rl.generator.java.record;

import java.util.List;
import kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.validation.PropertyEvaluation;
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
    Classifier _findType = PropertyEvaluation.findType(property);
    String _createTypeName = IRL2JavaTypeMappingExtensions.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _name = property.getName();
    String _protectKeywords = NameResolver.protectKeywords(_name);
    _builder.append(_protectKeywords, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
