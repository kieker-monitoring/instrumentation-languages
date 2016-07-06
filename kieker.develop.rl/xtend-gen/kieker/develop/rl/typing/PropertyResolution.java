package kieker.develop.rl.typing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.typing.TypeResolution;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PropertyResolution {
  /**
   * Collect recursively a list of all data properties. Meaning aliases must be ignored.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllDataProperties(final RecordType type) {
    final ArrayList<Property> list = new ArrayList<Property>();
    List<Property> _collectAllProperties = PropertyResolution.collectAllProperties(type);
    final Function1<Property, Boolean> _function = (Property it) -> {
      Property _referTo = it.getReferTo();
      return Boolean.valueOf(Objects.equal(_referTo, null));
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_collectAllProperties, _function);
    Iterables.<Property>addAll(list, _filter);
    return list;
  }
  
  /**
   * Collect recursively a list of all data properties. Meaning aliases must be ignored.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllDataProperties(final TemplateType type) {
    final ArrayList<Property> list = new ArrayList<Property>();
    List<Property> _collectAllProperties = PropertyResolution.collectAllProperties(type);
    final Function1<Property, Boolean> _function = (Property it) -> {
      Property _referTo = it.getReferTo();
      return Boolean.valueOf(Objects.equal(_referTo, null));
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_collectAllProperties, _function);
    Iterables.<Property>addAll(list, _filter);
    return list;
  }
  
  /**
   * Collect recursively a list of all data and alias properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllProperties(final RecordType type) {
    List<Property> _xifexpression = null;
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      _xifexpression = PropertyResolution.collectAllProperties(_parent_1);
    } else {
      _xifexpression = new ArrayList<Property>();
    }
    final List<Property> result = _xifexpression;
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals_1 = (!Objects.equal(_parents, null));
    if (_notEquals_1) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = (TemplateType it) -> {
        List<Property> _collectAllProperties = PropertyResolution.collectAllProperties(it);
        PropertyResolution.addAllUnique(result, _collectAllProperties);
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyResolution.addAllUnique(result, _properties);
  }
  
  /**
   * Collect recursively a list of all data and alias properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllProperties(final TemplateType type) {
    final List<Property> result = new ArrayList<Property>();
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = (TemplateType iface) -> {
        List<Property> _collectAllProperties = PropertyResolution.collectAllProperties(iface);
        PropertyResolution.addAllUnique(result, _collectAllProperties);
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyResolution.addAllUnique(result, _properties);
  }
  
  /**
   * Collect recursively a list of all properties declared in templates referenced by the given type.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllTemplateProperties(final RecordType type) {
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      final List<Property> result = new ArrayList<Property>();
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = (TemplateType iface) -> {
        List<Property> _collectAllTemplateProperties = PropertyResolution.collectAllTemplateProperties(iface);
        PropertyResolution.addAllUnique(result, _collectAllTemplateProperties);
      };
      _parents_1.forEach(_function);
      return result;
    } else {
      return new ArrayList<Property>();
    }
  }
  
  /**
   * Collect recursively a list of all properties declared in templates referenced by the given type.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public static List<Property> collectAllTemplateProperties(final TemplateType type) {
    final List<Property> result = new ArrayList<Property>();
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = (TemplateType iface) -> {
        List<Property> _collectAllTemplateProperties = PropertyResolution.collectAllTemplateProperties(iface);
        PropertyResolution.addAllUnique(result, _collectAllTemplateProperties);
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyResolution.addAllUnique(result, _properties);
  }
  
  /**
   * Add elements of the second list to the first list if it is not already in there.
   */
  public static List<Property> addAllUnique(final List<Property> list, final List<Property> addList) {
    final Consumer<Property> _function = (Property item) -> {
      boolean _containsProperty = PropertyResolution.containsProperty(list, item);
      boolean _not = (!_containsProperty);
      if (_not) {
        list.add(item);
      }
    };
    addList.forEach(_function);
    return list;
  }
  
  /**
   * Check if a property of a given name and of the same type does already exist in the collected list of properties.
   * 
   * @param list property collection
   * @param item the property to check against the list
   * 
   * @returns
   * 		true if a property of the same name and type already exists, else false
   */
  public static boolean containsProperty(final List<Property> list, final Property item) {
    for (final Property p : list) {
      boolean _and = false;
      String _name = p.getName();
      String _name_1 = item.getName();
      boolean _equals = _name.equals(_name_1);
      if (!_equals) {
        _and = false;
      } else {
        Classifier _findType = TypeResolution.findType(p);
        BaseType _type = _findType.getType();
        String _name_2 = _type.getName();
        Classifier _findType_1 = TypeResolution.findType(item);
        BaseType _type_1 = _findType_1.getType();
        String _name_3 = _type_1.getName();
        boolean _equals_1 = _name_2.equals(_name_3);
        _and = _equals_1;
      }
      if (_and) {
        return true;
      }
    }
    return false;
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
  public static List<Property> collectAllGetterDeclarationProperties(final RecordType type) {
    List<Property> result = PropertyResolution.collectAllProperties(type);
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      return PropertyResolution.removeAlreadyImplementedProperties(result, _parent_1);
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
    List<Property> _collectAllTemplateProperties = PropertyResolution.collectAllTemplateProperties(type);
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
      return PropertyResolution.removeAlreadyImplementedProperties(declarationProperties, _parent_1);
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
    final List<Property> allParentProperties = PropertyResolution.collectAllProperties(parentType);
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
