package de.cau.cs.se.instrumentation.rl.generator.java;

import org.eclipse.emf.ecore.EClassifier;

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
  public static String createPrimitiveTypeName(final EClassifier classifier) {
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
        _switchResult = classifier.getName();
        break;
    }
    return _switchResult;
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final EClassifier classifier) {
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
        _switchResult = classifier.getName();
        break;
    }
    return _switchResult;
  }
}
