package kieker.develop.rl.typing;

import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.Property;

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
  public static List<Property> collectAllDataProperties(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method collectAllProperties(RecordType) from the type PropertyResolution refers to the missing type RecordType"
      + "\n== cannot be resolved");
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
  public static List<Property> collectAllDataProperties(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method collectAllProperties(RecordType) from the type PropertyResolution refers to the missing type RecordType"
      + "\n== cannot be resolved");
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
  public static List<Property> collectAllProperties(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllProperties is undefined for the type Object"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\ncollectAllProperties cannot be resolved"
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nproperties cannot be resolved");
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
  public static List<Property> collectAllProperties(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllProperties is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nproperties cannot be resolved");
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
  public static List<Property> collectAllTemplateProperties(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllTemplateProperties is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved");
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
  public static List<Property> collectAllTemplateProperties(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field collectAllTemplateProperties is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nproperties cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nequals cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved");
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
  public static List<Property> collectAllGetterDeclarationProperties(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method removeAlreadyImplementedProperties(List<Property>, RecordType) from the type PropertyResolution refers to the missing type RecordType"
      + "\ncollectAllProperties cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved");
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
  public static List<Property> collectAllDeclarationProperties(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method removeAlreadyImplementedProperties(List<Property>, RecordType) from the type PropertyResolution refers to the missing type RecordType"
      + "\ncollectAllTemplateProperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved");
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
  private static List<Property> removeAlreadyImplementedProperties(final List<Property> list, final /* RecordType */Object parentType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\ncollectAllProperties cannot be resolved"
      + "\nequals cannot be resolved");
  }
}
