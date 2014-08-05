package de.cau.cs.se.instrumentation.rl.generator;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.generator.InternalErrorException;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
   * Convert a classifier into a primitive type for a
   * target language.
   * 
   * @param classifier
   * 		a classifier specifying a primitive type
   */
  public abstract CharSequence createTypeName(final Classifier classifier);
  
  /**
   * Returns the language type the generator supports.
   */
  public abstract String getLanguageType();
  
  /**
   * Determine the size of the resulting binary serialization.
   * 
   * @param allProperties
   * 		all properties of a record type
   * 
   * @returns
   * 		the computed value
   */
  public int calculateSize(final Iterable<Property> list) {
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
    try {
      int _switchResult = (int) 0;
      Classifier _findType = PropertyEvaluation.findType(property);
      EClassifier _class_ = _findType.getClass_();
      String _name = _class_.getName();
      final String _switchValue = _name;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"string")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"byte")) {
          _matched=true;
          _switchResult = 1;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"short")) {
          _matched=true;
          _switchResult = 2;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"int")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"long")) {
          _matched=true;
          _switchResult = 8;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"float")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"double")) {
          _matched=true;
          _switchResult = 8;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"char")) {
          _matched=true;
          _switchResult = 2;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"boolean")) {
          _matched=true;
          _switchResult = 1;
        }
      }
      if (!_matched) {
        Classifier _findType_1 = PropertyEvaluation.findType(property);
        EClassifier _class__1 = _findType_1.getClass_();
        String _name_1 = _class__1.getName();
        String _plus = (_name_1 + "is not a valid type name");
        InternalErrorException _internalErrorException = new InternalErrorException(_plus);
        throw _internalErrorException;
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
