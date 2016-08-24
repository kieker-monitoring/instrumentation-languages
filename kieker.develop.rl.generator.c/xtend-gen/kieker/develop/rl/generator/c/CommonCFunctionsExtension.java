package kieker.develop.rl.generator.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.typing.base.BaseTypes;
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
  public static String createTypeName(final Classifier classifier) throws InternalErrorException {
    String _switchResult = null;
    BaseType _type = classifier.getType();
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          _switchResult = "const char*";
          break;
        case CHAR:
          _switchResult = "char";
          break;
        case SHORT:
          _switchResult = "short";
          break;
        case INT:
          _switchResult = "long";
          break;
        case LONG:
          _switchResult = "long long";
          break;
        case FLOAT:
          _switchResult = "float";
          break;
        case DOUBLE:
          _switchResult = "double";
          break;
        case BOOLEAN:
          _switchResult = "char";
          break;
        case BYTE:
          _switchResult = "unsigned char";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
