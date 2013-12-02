package de.cau.cs.se.instrumentation.rl.generator;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class AbstractTypeGenerator {
  /**
   * Compute the directory name for a given type based on the package it belongs to.
   * 
   * @param type
   * 		the type model
   */
  public abstract CharSequence directoryName(final Type type);
  
  /**
   * Return the complete filename of the file type this generator produces in correct
   * language format for the given record.
   */
  public abstract String fileName(final Type type);
  
  /**
   * Collect recursively a list of all properties of interfaces and add those of
   * the type.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  public EList<Property> collectAllImplementationProperties(final RecordType type) {
    final EList<Property> result = PropertyEvaluation.collectAllInterfaceProperties(type);
    EList<Property> _properties = type.getProperties();
    result.addAll(_properties);
    return result;
  }
  
  /**
   * Determine the size of the resulting binary serialization.
   * 
   * @param allProperties
   * 		all properties of a record type
   * 
   * @returns
   * 		the computed value
   */
  public int calculateSize(final EList<Property> list) {
    final Function2<Integer,Property,Integer> _function = new Function2<Integer,Property,Integer>() {
      public Integer apply(final Integer result, final Property property) {
        int _size = AbstractTypeGenerator.this.getSize(property);
        int _plus = ((result).intValue() + _size);
        return Integer.valueOf(_plus);
      }
    };
    Integer _fold = IterableExtensions.<Property, Integer>fold(list, Integer.valueOf(0), _function);
    return (_fold).intValue();
  }
  
  /**
   * Determine the size of one type.
   * 
   * @param property
   * 		property which serialization size is determined.
   * 
   * @returns
   * 		the serialization size of the property
   */
  private int getSize(final Property property) {
    Integer _switchResult = null;
    Classifier _type = property.getType();
    EClassifier _class_ = _type.getClass_();
    String _name = _class_.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"key")) {
        _matched=true;
        _switchResult = Integer.valueOf(4);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"string")) {
        _matched=true;
        _switchResult = Integer.valueOf(4);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        _switchResult = Integer.valueOf(1);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"short")) {
        _matched=true;
        _switchResult = Integer.valueOf(2);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        _switchResult = Integer.valueOf(4);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        _switchResult = Integer.valueOf(8);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        _switchResult = Integer.valueOf(4);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        _switchResult = Integer.valueOf(8);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        _switchResult = Integer.valueOf(2);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        _switchResult = Integer.valueOf(1);
      }
    }
    return (_switchResult).intValue();
  }
}
