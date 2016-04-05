package kieker.tools.rl.generator.java;

import kieker.tools.rl.generator.InternalErrorException;
import kieker.tools.rl.recordLang.BaseType;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class IRL2JavaTypeMappingExtensions {
  private IRL2JavaTypeMappingExtensions() {
  }
  
  /**
   * @param classifier
   * 		A type name of the record language
   * @return
   * 		the Java type name of the given <code>classifier</code>
   */
  public static String createPrimitiveTypeName(final BaseType classifier) {
    try {
      String _switchResult = null;
      String _name = classifier.getName();
      switch (_name) {
        case "int":
          _switchResult = "int";
          break;
        case "long":
          _switchResult = "long";
          break;
        case "short":
          _switchResult = "short";
          break;
        case "double":
          _switchResult = "double";
          break;
        case "float":
          _switchResult = "float";
          break;
        case "char":
          _switchResult = "char";
          break;
        case "byte":
          _switchResult = "byte";
          break;
        case "string":
          _switchResult = "String";
          break;
        case "boolean":
          _switchResult = "boolean";
          break;
        default:
          String _name_1 = classifier.getName();
          String _plus = ("Base type " + _name_1);
          String _plus_1 = (_plus + " is not a defined mapping type.");
          throw new InternalErrorException(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final BaseType classifier) {
    try {
      String _switchResult = null;
      String _name = classifier.getName();
      switch (_name) {
        case "int":
          _switchResult = "Integer";
          break;
        case "long":
          _switchResult = "Long";
          break;
        case "short":
          _switchResult = "Short";
          break;
        case "double":
          _switchResult = "Double";
          break;
        case "float":
          _switchResult = "Float";
          break;
        case "char":
          _switchResult = "Character";
          break;
        case "byte":
          _switchResult = "Byte";
          break;
        case "string":
          _switchResult = "String";
          break;
        case "boolean":
          _switchResult = "Boolean";
          break;
        default:
          String _name_1 = classifier.getName();
          String _plus = ("Base type " + _name_1);
          String _plus_1 = (_plus + " is not a defined mapping type.");
          throw new InternalErrorException(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
