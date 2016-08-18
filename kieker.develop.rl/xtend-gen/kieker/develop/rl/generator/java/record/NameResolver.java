package kieker.develop.rl.generator.java.record;

import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NameResolver {
  /**
   * Returns the correct name for a getter following Java conventions.
   * 
   * @param property
   * 		a property of a record type
   * 
   * @returns the name of the getter of the property
   */
  public static CharSequence createGetterName(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  public static Object createConstantLiteralName(final /* ConstantLiteral */Object literal) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved"
      + "\nname cannot be resolved"
      + "\nprotectKeywords cannot be resolved");
  }
  
  public static Object createConstantName(final /* Constant */Object constant) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nprotectKeywords cannot be resolved");
  }
  
  /**
   * create a constant name from a standard name camel case name.
   */
  public static Object createConstantName(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nreplaceAll cannot be resolved"
      + "\ntoUpperCase cannot be resolved"
      + "\nprotectKeywords cannot be resolved");
  }
  
  public static Object createName(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nprotectKeywords cannot be resolved");
  }
  
  /**
   * Check whether a given name is identical to a keyword of the target language and prepends an _.
   */
  private static String protectKeywords(final String name) {
    String _xblockexpression = null;
    {
      final List<String> keywords = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("interface", "class", "private", "protected", "public", "return", "final", "volatile", "if", "else", "for", "foreach"));
      String _xifexpression = null;
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(it.equals(name));
      };
      boolean _exists = IterableExtensions.<String>exists(keywords, _function);
      if (_exists) {
        _xifexpression = ("_" + name);
      } else {
        _xifexpression = name;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
