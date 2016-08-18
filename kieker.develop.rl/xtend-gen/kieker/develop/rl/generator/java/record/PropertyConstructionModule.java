package kieker.develop.rl.generator.java.record;

import java.util.List;
import org.eclipse.xtend.lib.Property;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ncreateTypeName cannot be resolved");
  }
  
  public static Object createPropertyGetters(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to Property"
      + "\ncollectAllGetterDeclarationProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method or field referTo is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ncreateTypeName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncreateGetterName cannot be resolved");
  }
}
