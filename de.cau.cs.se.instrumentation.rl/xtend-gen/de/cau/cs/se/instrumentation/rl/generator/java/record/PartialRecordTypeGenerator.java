package de.cau.cs.se.instrumentation.rl.generator.java.record;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractPartialRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PartialRecordTypeGenerator extends AbstractPartialRecordTypeGenerator {
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
    _builder.append(".java");
    return _builder.toString();
  }
  
  public CharSequence createContent(final PartialRecordType type, final String author, final String version) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      String _author = type.getAuthor();
      boolean _equals = Objects.equal(_author, null);
      if (_equals) {
        _xifexpression = author;
      } else {
        _xifexpression = type.getAuthor();
      }
      final String definedAuthor = _xifexpression;
      String _xifexpression_1 = null;
      String _since = type.getSince();
      boolean _equals_1 = Objects.equal(_since, null);
      if (_equals_1) {
        _xifexpression_1 = version;
      } else {
        _xifexpression_1 = type.getSince();
      }
      final String definedVersion = _xifexpression_1;
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
      EList<PartialRecordType> _parents = type.getParents();
      CharSequence _createImports = this.createImports(_parents, type);
      _builder.append(_createImports, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @author ");
      _builder.append(definedAuthor, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @since ");
      _builder.append(definedVersion, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public interface ");
      String _name_1 = type.getName();
      _builder.append(_name_1, "");
      _builder.append(" extends ");
      EList<PartialRecordType> _parents_1 = type.getParents();
      CharSequence _createExtends = this.createExtends(_parents_1);
      _builder.append(_createExtends, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      EList<Property> _properties = type.getProperties();
      final Function1<Property, CharSequence> _function = new Function1<Property, CharSequence>() {
        public CharSequence apply(final Property property) {
          return PartialRecordTypeGenerator.this.createPropertyGetter(property);
        }
      };
      List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(_properties, _function);
      String _join = IterableExtensions.join(_map);
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public boolean isInSamePackage(final PartialRecordType left, final PartialRecordType right) {
    EObject _eContainer = left.eContainer();
    String _name = ((Model) _eContainer).getName();
    EObject _eContainer_1 = right.eContainer();
    String _name_1 = ((Model) _eContainer_1).getName();
    return (!Objects.equal(_name, _name_1));
  }
  
  public CharSequence createImports(final EList<PartialRecordType> parents, final PartialRecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(parents, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = parents.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final Function1<PartialRecordType, Boolean> _function = new Function1<PartialRecordType, Boolean>() {
        public Boolean apply(final PartialRecordType t) {
          return Boolean.valueOf(PartialRecordTypeGenerator.this.isInSamePackage(type, t));
        }
      };
      Iterable<PartialRecordType> _filter = IterableExtensions.<PartialRecordType>filter(parents, _function);
      final Function1<PartialRecordType, CharSequence> _function_1 = new Function1<PartialRecordType, CharSequence>() {
        public CharSequence apply(final PartialRecordType it) {
          return PartialRecordTypeGenerator.this.createImport(it);
        }
      };
      Iterable<CharSequence> _map = IterableExtensions.<PartialRecordType, CharSequence>map(_filter, _function_1);
      _xifexpression = IterableExtensions.join(_map);
    } else {
      _xifexpression = this.createDefaultImport();
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  public CharSequence createDefaultImport() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import kieker.common.record.IMonitoringRecord;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createImport(final PartialRecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(".");
    _builder.append(type, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createExtends(final EList<PartialRecordType> parents) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(parents, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = parents.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      final Function1<PartialRecordType, String> _function = new Function1<PartialRecordType, String>() {
        public String apply(final PartialRecordType t) {
          return t.getName();
        }
      };
      List<String> _map = ListExtensions.<PartialRecordType, String>map(parents, _function);
      _xifexpression = IterableExtensions.join(_map, ", ");
    } else {
      _xifexpression = "IMonitoringRecord";
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  /**
   * Creates a getter for a given property.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns the resulting getter as a CharSequence
   */
  public CharSequence createPropertyGetter(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    Classifier _findType = PropertyEvaluation.findType(property);
    String _createTypeName = this.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    CharSequence _createGetterName = this.createGetterName(property);
    _builder.append(_createGetterName, "");
    _builder.append("() ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Returns the correct name for a getter following Java conventions.
   * 
   * @param property
   * 		a property of a record type
   * 
   * @returns the name of the getter of the property
   */
  public CharSequence createGetterName(final Property property) {
    CharSequence _xifexpression = null;
    Classifier _findType = PropertyEvaluation.findType(property);
    Class<? extends Classifier> _class = _findType.getClass();
    String _name = _class.getName();
    boolean _equals = _name.equals("boolean");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("is");
      String _name_1 = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      _builder.append(_firstUpper, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("get");
      String _name_2 = property.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      _builder_1.append(_firstUpper_1, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
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
    String _switchResult = null;
    EClassifier _class_ = classifier.getClass_();
    String _name = _class_.getName();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_name, "string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      EClassifier _class__1 = classifier.getClass_();
      _switchResult = _class__1.getName();
    }
    return _switchResult;
  }
}
