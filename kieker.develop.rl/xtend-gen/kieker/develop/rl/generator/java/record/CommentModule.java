package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.util.List;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.TemplateType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CommentModule {
  /**
   * Create sequence of property comments for the documentation.
   */
  public static String createPropertyComments(final List<Property> properties) {
    final Function1<Property, CharSequence> _function = (Property property) -> {
      return CommentModule.createPropertyComment(property);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(properties, _function);
    return IterableExtensions.join(_map);
  }
  
  /**
   * Create an arbitrary comment for a property of a monitoring record.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one comment
   */
  private static CharSequence createPropertyComment(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* @param ");
    String _name = property.getName();
    String _protectKeywords = NameResolver.protectKeywords(_name);
    _builder.append(_protectKeywords, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*            ");
    String _name_1 = property.getName();
    String _protectKeywords_1 = NameResolver.protectKeywords(_name_1);
    _builder.append(_protectKeywords_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Compute the fully qualified name of a property.
   * 
   * @param property
   * 		the property itself
   * @param type
   * 		the present RecordType
   * 
   * @returns
   * 		the FQ property name
   */
  public static CharSequence createPropertyFQN(final Property property, final TemplateType type) {
    EList<Property> _properties = type.getProperties();
    boolean _contains = _properties.contains(property);
    if (_contains) {
      String _name = type.getName();
      String _plus = (_name + ".");
      String _name_1 = property.getName();
      return (_plus + _name_1);
    } else {
      EList<TemplateType> _parents = type.getParents();
      boolean _notEquals = (!Objects.equal(_parents, null));
      if (_notEquals) {
        EList<TemplateType> _parents_1 = type.getParents();
        for (final TemplateType t : _parents_1) {
          {
            final CharSequence result2 = CommentModule.createPropertyFQN(property, t);
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
  public static CharSequence createPropertyFQN(final Property property, final RecordType type) {
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
        final CharSequence result = CommentModule.createPropertyFQN(property, _parent_1);
        boolean _notEquals_1 = (!Objects.equal(result, null));
        if (_notEquals_1) {
          return result;
        }
      }
      EList<TemplateType> _parents = type.getParents();
      boolean _notEquals_2 = (!Objects.equal(_parents, null));
      if (_notEquals_2) {
        EList<TemplateType> _parents_1 = type.getParents();
        for (final TemplateType t : _parents_1) {
          {
            final CharSequence result_1 = CommentModule.createPropertyFQN(property, t);
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
}
