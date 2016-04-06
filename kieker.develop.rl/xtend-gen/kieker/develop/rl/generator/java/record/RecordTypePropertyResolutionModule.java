package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.validation.PropertyEvaluation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RecordTypePropertyResolutionModule {
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
  public static List<Property> collectAllGetterDeclarationProperties(final RecordType type) {
    List<Property> result = PropertyEvaluation.collectAllProperties(type);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      return RecordTypePropertyResolutionModule.removeAlreadyImplementedProperties(result, _parent_1);
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
  public static List<Property> collectAllDeclarationProperties(final RecordType type) {
    List<Property> properties = new ArrayList<Property>();
    List<Property> _collectAllTemplateProperties = PropertyEvaluation.collectAllTemplateProperties(type);
    properties.addAll(_collectAllTemplateProperties);
    EList<Property> _properties = type.getProperties();
    properties.addAll(_properties);
    final List<Property> declarationProperties = new ArrayList<Property>();
    final Consumer<Property> _function = (Property property) -> {
      Property _referTo = property.getReferTo();
      boolean _equals = Objects.equal(_referTo, null);
      if (_equals) {
        declarationProperties.add(property);
      }
    };
    properties.forEach(_function);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      return RecordTypePropertyResolutionModule.removeAlreadyImplementedProperties(declarationProperties, _parent_1);
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
  private static List<Property> removeAlreadyImplementedProperties(final List<Property> list, final RecordType parentType) {
    final List<Property> allParentProperties = PropertyEvaluation.collectAllProperties(parentType);
    List<Property> result = list;
    for (final Property parentProperty : allParentProperties) {
      {
        final Function1<Property, Boolean> _function = (Property it) -> {
          String _name = it.getName();
          String _name_1 = parentProperty.getName();
          return Boolean.valueOf(_name.equals(_name_1));
        };
        final Property property = IterableExtensions.<Property>findFirst(result, _function);
        result.remove(property);
      }
    }
    return result;
  }
}
