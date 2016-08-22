package kieker.develop.rl.generator.java;

import kieker.develop.rl.generator.InternalErrorException;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JavaTypeMapping {
  private JavaTypeMapping() {
  }
  
  /**
   * @param classifier
   * 		A type name of the record language
   * @return
   * 		the Java type name of the given <code>classifier</code>
   */
  public static String createPrimitiveTypeName(final /* BaseType */Object type) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(BaseType) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field BOOLEAN is undefined");
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final /* BaseType */Object type) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(BaseType) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field BOOLEAN is undefined");
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static Object createTypeName(final /* Classifier */Object classifier) {
    throw new Error("Unresolved compilation problems:"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\ncreateArrayTypeName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved");
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static Object createObjectTypeName(final /* Classifier */Object classifier) {
    throw new Error("Unresolved compilation problems:"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\ncreateArrayTypeName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveWrapperTypeName cannot be resolved");
  }
  
  /**
   * Determine the right Java string for a given system array type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public static Object createArrayTypeName(final /* Classifier */Object classifier) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  /**
   * Determine the size of the resulting binary serialization.
   * 
   * @param allProperties
   * 		all properties of a record type
   * 
   * @returns
   * 		the computed value
   */
  public static int calculateSize(final Iterable<Property> list) {
    final Function2<Integer, Property, Integer> _function = (Integer result, Property property) -> {
      try {
        int _size = JavaTypeMapping.getSize(property);
        return Integer.valueOf(((result).intValue() + _size));
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    return (int) IterableExtensions.<Property, Integer>fold(list, Integer.valueOf(0), _function);
  }
  
  /**
   * Determine the size of one type.
   * 
   * @param property
   * 		property which serialization size is determined.
   * 
   * @returns
   * 		the serialization size of the property
   */
  private static int getSize(final Property property) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(Object) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field BOOLEAN is undefined"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ntype cannot be resolved");
  }
}
