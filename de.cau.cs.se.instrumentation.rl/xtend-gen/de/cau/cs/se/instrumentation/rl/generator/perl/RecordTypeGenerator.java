package de.cau.cs.se.instrumentation.rl.generator.perl;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import java.io.File;
import java.util.Collection;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  public String getLanguageType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("perl");
    return _builder.toString();
  }
  
  /**
   * Create a perl based record for kieker
   */
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("use strict;");
    _builder.newLine();
    _builder.append("use warnings;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    CharSequence _recordName = this.recordName(type);
    _builder.append(_recordName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("=head1 NAME");
    _builder.newLine();
    _builder.newLine();
    CharSequence _recordName_1 = this.recordName(type);
    _builder.append(_recordName_1, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("=head1 SYNOPSIS");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("my $record = ");
    CharSequence _recordName_2 = this.recordName(type);
    _builder.append(_recordName_2, " ");
    _builder.append("->new(");
    Collection<Property> _collectAllDataProperties = PropertyEvaluation.collectAllDataProperties(type);
    String _createParameterCall = this.createParameterCall(_collectAllDataProperties);
    _builder.append(_createParameterCall, " ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("$writer->write($record->genoutput());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("=head1 DESCRIPTION");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Auto-generated structures. See the IRL code.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("=head1 METHODS");
    _builder.newLine();
    _builder.newLine();
    _builder.append("=head2 $record = ");
    CharSequence _recordName_3 = this.recordName(type);
    _builder.append(_recordName_3, "");
    _builder.append("->new(");
    Collection<Property> _collectAllDataProperties_1 = PropertyEvaluation.collectAllDataProperties(type);
    String _createParameterCall_1 = this.createParameterCall(_collectAllDataProperties_1);
    _builder.append(_createParameterCall_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Creates a new record with the given parameters.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("=cut");
    _builder.newLine();
    _builder.newLine();
    _builder.append("sub new {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("my (");
    Collection<Property> _collectAllDataProperties_2 = PropertyEvaluation.collectAllDataProperties(type);
    String _createParameterCall_2 = this.createParameterCall(_collectAllDataProperties_2);
    _builder.append(_createParameterCall_2, "  ");
    _builder.append(") = @_;");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("my $this = {");
    _builder.newLine();
    _builder.append("    ");
    Collection<Property> _collectAllDataProperties_3 = PropertyEvaluation.collectAllDataProperties(type);
    final Function1<Property,CharSequence> _function = new Function1<Property,CharSequence>() {
      public CharSequence apply(final Property it) {
        CharSequence _createProperty = RecordTypeGenerator.this.createProperty(it);
        return _createProperty;
      }
    };
    Iterable<CharSequence> _map = IterableExtensions.<Property, CharSequence>map(_collectAllDataProperties_3, _function);
    String _join = IterableExtensions.join(_map, ",\n");
    _builder.append(_join, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return bless($this,$type);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("=head2 $string = $record->genoutput();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Serializes the record for output. Returns the serialized form of the record.");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("=head1 COPYRIGHT and LICENCE");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Copyright 2013 Kieker Project (http://kieker-monitoring.net)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Licensed under the Apache License, Version 2.0 (the \"License\"); ");
    _builder.newLine();
    _builder.append("you may not use this file except in compliance with the License.");
    _builder.newLine();
    _builder.append("You may obtain a copy of the License at");
    _builder.newLine();
    _builder.newLine();
    _builder.append("http://www.apache.org/licenses/LICENSE-2.0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Unless required by applicable law or agreed to in writing, software");
    _builder.newLine();
    _builder.append("distributed under the License is distributed on an \"AS IS\" BASIS,");
    _builder.newLine();
    _builder.append("WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    _builder.newLine();
    _builder.append("See the License for the specific language governing permissions and");
    _builder.newLine();
    _builder.append("limitations under the License.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("=cut");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create perl type names.
   * Most likely this routine is never used, as perl sucks in typing.
   */
  public CharSequence createTypeName(final Classifier classifier) {
    String _switchResult = null;
    EClassifier _class_ = classifier.getClass_();
    String _name = _class_.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      EClassifier _class__1 = classifier.getClass_();
      String _name_1 = _class__1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  /**
   * Create one property for the type declaration.
   */
  public CharSequence createProperty(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(" => $");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  /**
   * Compute the absolute Perl package name, which is a FQN name of the record.
   */
  public CharSequence recordName(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", "::");
    _builder.append(_replace, "");
    _builder.append("::");
    String _name_1 = type.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  public String createParameterCall(final Collection<Property> list) {
    final Function1<Property,String> _function = new Function1<Property,String>() {
      public String apply(final Property it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$");
        String _name = it.getName();
        _builder.append(_name, "");
        return _builder.toString();
      }
    };
    Iterable<String> _map = IterableExtensions.<Property, String>map(list, _function);
    String _join = IterableExtensions.join(_map, ", ");
    return _join;
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
   * Return the extension used for the file type generated by this generator.
   */
  public String fileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.directoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".pm");
    return _builder.toString();
  }
}
