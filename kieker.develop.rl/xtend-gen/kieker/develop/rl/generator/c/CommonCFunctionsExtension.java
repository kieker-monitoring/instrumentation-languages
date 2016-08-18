package kieker.develop.rl.generator.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kieker.develop.rl.generator.InternalErrorException;

/**
 * @author Reiner Jung
 * 
 * @since 1.0
 */
@SuppressWarnings("all")
public class CommonCFunctionsExtension {
  /**
   * Converts Java style identifiers to C style identifiers.
   */
  public static String cstyleName(final String string) {
    Pattern _compile = Pattern.compile("([A-Z])");
    Matcher _matcher = _compile.matcher(string);
    String _replaceAll = _matcher.replaceAll("_$1");
    String _lowerCase = _replaceAll.toLowerCase();
    return _lowerCase.substring(1);
  }
  
  /**
   * Compute the package name used as prefix for all functions.
   */
  public static CharSequence packageName(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved");
  }
  
  /**
   * Determine the right C string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a C type name
   */
  public static String createTypeName(final /* Classifier */Object classifier) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(Object) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field BOOLEAN is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\ntype cannot be resolved");
  }
}
