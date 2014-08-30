package de.cau.cs.se.instrumentation.rl.generator.java.factory;

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.java.RlType2JavaTypeExtensions;
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
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  public String outletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
    return _builder.toString();
  }
  
  /**
   * Compute the directory name for a record type.
   */
  public CharSequence directoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  /**
   * Compute file name.
   */
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
  
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create the corresponding monitoring record factory
   * @params author
   * 		generic author name for the record
   * @params version
   * 		generic kieker version for the record
   */
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.nio.ByteBuffer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import kieker.common.util.registry.IRegistry;");
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
    _builder.append(_name_2, "\t\t");
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
    _builder.append(_name_3, "\t\t");
    _builder.append("(values, stringRegistry);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Determine the right Java string for a given system type.
   * 
   * @param classifier
   * 		a classifier representing a type
   * 
   * @returns a java type name
   */
  public String createTypeName(final Classifier classifier) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      EList<ArraySize> _sizes = classifier.getSizes();
      int _size = _sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EClassifier _class_ = classifier.getClass_();
        String _createPrimitiveTypeName = RlType2JavaTypeExtensions.createPrimitiveTypeName(_class_);
        EList<ArraySize> _sizes_1 = classifier.getSizes();
        final Function1<ArraySize, String> _function = new Function1<ArraySize, String>() {
          public String apply(final ArraySize size) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("[]");
            return _builder.toString();
          }
        };
        List<String> _map = ListExtensions.<ArraySize, String>map(_sizes_1, _function);
        String _join = IterableExtensions.join(_map);
        _xifexpression = (_createPrimitiveTypeName + _join);
      } else {
        EClassifier _class__1 = classifier.getClass_();
        _xifexpression = RlType2JavaTypeExtensions.createPrimitiveTypeName(_class__1);
      }
      final String typeName = _xifexpression;
      _xblockexpression = (typeName + "Factory");
    }
    return _xblockexpression;
  }
}
