/**
 * MAMBA - Measurement Architecture for Model-Based Analysis
 * 
 * http://http://se.informatik.uni-kiel.de/research/projects/mamba
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.language.generator;

import com.google.common.collect.Iterables;
import de.cau.cs.se.instrumentation.language.instrumentation.Classifier;
import de.cau.cs.se.instrumentation.language.instrumentation.Model;
import de.cau.cs.se.instrumentation.language.instrumentation.Property;
import de.cau.cs.se.instrumentation.language.instrumentation.Record;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class InstrumentationLanguageGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Record> _filter = Iterables.<Record>filter(_iterable, Record.class);
    for (final Record e : _filter) {
      EObject _eContainer = e.eContainer();
      String _name = ((Model) _eContainer).getName();
      String _replace = _name.replace(".", "/");
      String _plus = (_replace + "/");
      String _name_1 = e.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      String _plus_1 = (_plus + _firstUpper);
      String _plus_2 = (_plus_1 + "Record.java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_2, _compile);
    }
  }
  
  public CharSequence compile(final Record record) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    EObject _eContainer = record.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import kieker.common.record.AbstractMonitoringRecord;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = record.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("Record extends AbstractMonitoringRecord ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("implements IMonitoringRecord.Factory {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final Class<?>[] TYPES = {");
    _builder.newLine();
    _builder.append("\t    ");
    {
      EList<Property> _properties = record.getProperties();
      boolean _hasElements = false;
      for(final Property property : _properties) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "	    ");
        }
        CharSequence _propertyType = this.propertyType(property);
        _builder.append(_propertyType, "	    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<Property> _properties_1 = record.getProperties();
      for(final Property property_1 : _properties_1) {
        CharSequence _propertyDeclaration = this.propertyDeclaration(property_1);
        _builder.append(_propertyDeclaration, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Property> _properties_2 = record.getProperties();
      for(final Property property_2 : _properties_2) {
        CharSequence _propertyGetter = this.propertyGetter(property_2);
        _builder.append(_propertyGetter, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = record.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "	");
    _builder.append("Record (");
    {
      EList<Property> _properties_3 = record.getProperties();
      boolean _hasElements_1 = false;
      for(final Property property_3 : _properties_3) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        CharSequence _constructorParameterDeclaration = this.constructorParameterDeclaration(property_3);
        _builder.append(_constructorParameterDeclaration, "	");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<Property> _properties_4 = record.getProperties();
      for(final Property property_4 : _properties_4) {
        CharSequence _propertyInitialization = this.propertyInitialization(property_4);
        _builder.append(_propertyInitialization, "		");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = record.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "	");
    _builder.append("Record (final Object[] values) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("AbstractMonitoringRecord.checkArray(values, ");
    String _name_4 = record.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "	    ");
    _builder.append("Record.TYPES);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    {
      EList<Property> _properties_5 = record.getProperties();
      for(final Property property_5 : _properties_5) {
        EList<Property> _properties_6 = record.getProperties();
        int _indexOf = _properties_6.indexOf(property_5);
        CharSequence _propertyInitializationFromArray = this.propertyInitializationFromArray(property_5, _indexOf);
        _builder.append(_propertyInitializationFromArray, "	    ");
      }
    }
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
    _builder.append("public Object[] toArray() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new Object[] {");
    _builder.newLine();
    _builder.append("\t\t    ");
    {
      EList<Property> _properties_7 = record.getProperties();
      boolean _hasElements_2 = false;
      for(final Property property_6 : _properties_7) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "		    ");
        }
        _builder.append("this.");
        String _name_5 = property_6.getName();
        _builder.append(_name_5, "		    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void initFromArray(Object[] values) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new UnsupportedOperationException();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Class<?>[] getValueTypes() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _name_6 = record.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_4, "		");
    _builder.append("Record.TYPES.clone();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * For the decprecated TYPES array
   */
  public CharSequence propertyType(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append(".class");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Assignments in the record constructor
   */
  public CharSequence propertyInitialization(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Assignments in the record constructor, values based initialization
   */
  public CharSequence propertyInitializationFromArray(final Property property, final int number) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(" = (");
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name_1 = _class_.getName();
    _builder.append(_name_1, "");
    _builder.append(") values[");
    _builder.append(number, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Declarations for constructor parameters
   */
  public CharSequence constructorParameterDeclaration(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  /**
   * Generating a getter for a property
   */
  public CharSequence propertyGetter(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append(" get");
    String _name_1 = property.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_2 = property.getName();
    _builder.append(_name_2, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Property declaration in the record class
   */
  public CharSequence propertyDeclaration(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final ");
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = property.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
