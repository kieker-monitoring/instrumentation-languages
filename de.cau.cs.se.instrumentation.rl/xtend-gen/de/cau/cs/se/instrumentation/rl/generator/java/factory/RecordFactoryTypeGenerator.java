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
   * Return the unique id.
   */
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java.factory");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Java factory");
    return _builder.toString();
  }
  
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java-factory");
    return _builder.toString();
  }
  
  /**
   * Compute the directory name for a record type.
   */
  public CharSequence getDirectoryName(final Type type) {
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
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
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
    _builder.append("/***************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright 2013 Kieker Project (http://kieker-monitoring.net)");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Licensed under the Apache License, Version 2.0 (the \"License\");");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* you may not use this file except in compliance with the License.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You may obtain a copy of the License at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*     http://www.apache.org/licenses/LICENSE-2.0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Unless required by applicable law or agreed to in writing, software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* distributed under the License is distributed on an \"AS IS\" BASIS,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See the License for the specific language governing permissions and");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* limitations under the License.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("***************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.nio.ByteBuffer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import kieker.common.record.factory.IRecordFactory;");
    _builder.newLine();
    _builder.append("import kieker.common.util.registry.IRegistry;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = type.getName();
    _builder.append(_name_1, "");
    _builder.append("Factory implements IRecordFactory<");
    String _name_2 = type.getName();
    _builder.append(_name_2, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = type.getName();
    _builder.append(_name_3, "	");
    _builder.append(" create(final ByteBuffer buffer, final IRegistry<String> stringRegistry) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_4 = type.getName();
    _builder.append(_name_4, "		");
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
    _builder.append("public ");
    String _name_5 = type.getName();
    _builder.append(_name_5, "	");
    _builder.append(" create(final Object[] values) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_6 = type.getName();
    _builder.append(_name_6, "		");
    _builder.append("(values);");
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
        String _createPrimitiveTypeName_1 = RlType2JavaTypeExtensions.createPrimitiveTypeName(_class__1);
        _xifexpression = _createPrimitiveTypeName_1;
      }
      final String typeName = _xifexpression;
      String _plus_1 = (typeName + "Factory");
      _xblockexpression = (_plus_1);
    }
    return _xblockexpression;
  }
}
