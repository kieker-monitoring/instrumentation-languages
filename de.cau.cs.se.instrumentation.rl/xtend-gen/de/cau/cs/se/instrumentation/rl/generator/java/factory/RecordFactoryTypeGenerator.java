package de.cau.cs.se.instrumentation.rl.generator.java.factory;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.io.File;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {
  public String getLanguageType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
    return _builder.toString();
  }
  
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import x.y.z.ByteBuffer;");
    _builder.newLine();
    _builder.append("import x.y.z.IRegistry;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IRecordFactory<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("T create(ByteBuffer buffer, IRegistry<String> stringRegistry);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("T create(Object[] values, IRegistry<String> stringRegistry);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("Factory implements IRecordFactory<");
    String _name_1 = type.getName();
    _builder.append(_name_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public T create(ByteBuffer buffer, IRegistry<String> stringRegistry) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_2 = type.getName();
    _builder.append(_name_2, "		");
    _builder.append("(buffer, stringRegistry);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public T create(Object[] values, IRegistry<String> stringRegistry) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_3 = type.getName();
    _builder.append(_name_3, "		");
    _builder.append("(values, stringRegistry);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence directoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  public String fileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.directoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("Factory.java");
    return _builder.toString();
  }
  
  public CharSequence createTypeName(final Classifier classifier) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      EList<ArraySize> _sizes = classifier.getSizes();
      int _size = _sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EClassifier _class_ = classifier.getClass_();
        String _createPrimitiveTypeName = this.createPrimitiveTypeName(_class_);
        EList<ArraySize> _sizes_1 = classifier.getSizes();
        final Function1<ArraySize,String> _function = new Function1<ArraySize,String>() {
          public String apply(final ArraySize size) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("[]");
            return _builder.toString();
          }
        };
        List<String> _map = ListExtensions.<ArraySize, String>map(_sizes_1, _function);
        String _join = IterableExtensions.join(_map);
        String _plus = (_createPrimitiveTypeName + _join);
        _xifexpression = _plus;
      } else {
        EClassifier _class__1 = classifier.getClass_();
        String _createPrimitiveTypeName_1 = this.createPrimitiveTypeName(_class__1);
        _xifexpression = _createPrimitiveTypeName_1;
      }
      final String typeName = _xifexpression;
      String _plus_1 = (typeName + "Factory");
      _xblockexpression = (_plus_1);
    }
    return _xblockexpression;
  }
  
  /**
   * Determine the right Java string for a given system type.
   */
  public String createPrimitiveTypeName(final EClassifier classifier) {
    String _switchResult = null;
    String _name = classifier.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        _switchResult = "short";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        _switchResult = "byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      String _name_1 = classifier.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
}
