package de.cau.cs.se.instrumentation.rl.generator.java;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClassifier;

@SuppressWarnings("all")
public class RlType2JavaTypeExtensions {
  private RlType2JavaTypeExtensions() {
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
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_name, "int")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "long")) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "short")) {
        _matched=true;
        _switchResult = "short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "double")) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "float")) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "char")) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "byte")) {
        _matched=true;
        _switchResult = "byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "boolean")) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      _switchResult = classifier.getName();
    }
    return _switchResult;
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public static String createPrimitiveWrapperTypeName(final EClassifier classifier) {
    String _switchResult = null;
    String _name = classifier.getName();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_name, "int")) {
        _matched=true;
        _switchResult = "Integer";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "long")) {
        _matched=true;
        _switchResult = "Long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "short")) {
        _matched=true;
        _switchResult = "Short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "double")) {
        _matched=true;
        _switchResult = "Double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "float")) {
        _matched=true;
        _switchResult = "Float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "char")) {
        _matched=true;
        _switchResult = "Character";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "byte")) {
        _matched=true;
        _switchResult = "Byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "boolean")) {
        _matched=true;
        _switchResult = "Boolean";
      }
    }
    if (!_matched) {
      _switchResult = classifier.getName();
    }
    return _switchResult;
  }
}
