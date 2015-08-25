package de.cau.cs.se.instrumentation.rl.generator.c;

import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

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
  public static CharSequence packageName(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", "_");
    _builder.append(_replace, "");
    return _builder;
  }
  
  /**
   * Determine the right C string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a C type name
   */
  public static String createTypeName(final Classifier classifier) {
    String _switchResult = null;
    EClassifier _class_ = classifier.getClass_();
    String _name = _class_.getName();
    switch (_name) {
      case "key":
        _switchResult = "const char*";
        break;
      case "string":
        _switchResult = "const char*";
        break;
      case "byte":
        _switchResult = "char";
        break;
      case "short":
        _switchResult = "short";
        break;
      case "int":
        _switchResult = "long";
        break;
      case "long":
        _switchResult = "long long";
        break;
      case "float":
        _switchResult = "float";
        break;
      case "double":
        _switchResult = "double";
        break;
      case "boolean":
        _switchResult = "char";
        break;
      default:
        EClassifier _class__1 = classifier.getClass_();
        _switchResult = _class__1.getName();
        break;
    }
    return _switchResult;
  }
}
