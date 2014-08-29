package de.cau.cs.se.instrumentation.rl.generator.c;

import com.google.common.base.Objects;
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
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"key")) {
        _matched=true;
        _switchResult = "const char*";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "const char*";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        _switchResult = "short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        _switchResult = "long long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      EClassifier _class__1 = classifier.getClass_();
      String _name_1 = _class__1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
}
