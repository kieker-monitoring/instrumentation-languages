package de.cau.cs.se.instrumentation.rl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.se.instrumentation.rl.generator.InternalErrorException;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PropertyEvaluation {
  /**
   * Collect recursively a list of all data properties. Meaning aliases must be ignored.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllDataProperties(final RecordType type) {
    final ArrayList<Property> list = new ArrayList<Property>();
    List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(type);
    final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
      public Boolean apply(final Property property) {
        Property _referTo = property.getReferTo();
        return Boolean.valueOf(Objects.equal(_referTo, null));
      }
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_collectAllProperties, _function);
    Iterables.<Property>addAll(list, _filter);
    return list;
  }
  
  /**
   * Collect recursively a list of all data properties. Meaning aliases must be ignored.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllDataProperties(final TemplateType type) {
    final ArrayList<Property> list = new ArrayList<Property>();
    List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(type);
    final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
      public Boolean apply(final Property property) {
        Property _referTo = property.getReferTo();
        return Boolean.valueOf(Objects.equal(_referTo, null));
      }
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_collectAllProperties, _function);
    Iterables.<Property>addAll(list, _filter);
    return list;
  }
  
  /**
   * Collect recursively a list of all data and alias properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllProperties(final RecordType type) {
    List<Property> _xifexpression = null;
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      _xifexpression = PropertyEvaluation.collectAllProperties(_parent_1);
    } else {
      _xifexpression = new ArrayList<Property>();
    }
    final List<Property> result = _xifexpression;
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals_1 = (!Objects.equal(_parents, null));
    if (_notEquals_1) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
        public void accept(final TemplateType it) {
          List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(it);
          PropertyEvaluation.addAllUnique(result, _collectAllProperties);
        }
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyEvaluation.addAllUnique(result, _properties);
  }
  
  /**
   * Collect recursively a list of all data and alias properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllProperties(final TemplateType type) {
    final List<Property> result = new ArrayList<Property>();
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
        public void accept(final TemplateType iface) {
          List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(iface);
          PropertyEvaluation.addAllUnique(result, _collectAllProperties);
        }
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyEvaluation.addAllUnique(result, _properties);
  }
  
  /**
   * Collect recursively a list of all properties declared in templates referenced by the given type.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllTemplateProperties(final RecordType type) {
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      final List<Property> result = new ArrayList<Property>();
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
        public void accept(final TemplateType iface) {
          List<Property> _collectAllTemplateProperties = PropertyEvaluation.collectAllTemplateProperties(iface);
          PropertyEvaluation.addAllUnique(result, _collectAllTemplateProperties);
        }
      };
      _parents_1.forEach(_function);
      return result;
    } else {
      return new ArrayList<Property>();
    }
  }
  
  /**
   * Collect recursively a list of all properties declared in templates referenced by the given type.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static List<Property> _collectAllTemplateProperties(final TemplateType type) {
    final List<Property> result = new ArrayList<Property>();
    EList<TemplateType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<TemplateType> _parents_1 = type.getParents();
      final Consumer<TemplateType> _function = new Consumer<TemplateType>() {
        public void accept(final TemplateType iface) {
          List<Property> _collectAllTemplateProperties = PropertyEvaluation.collectAllTemplateProperties(iface);
          PropertyEvaluation.addAllUnique(result, _collectAllTemplateProperties);
        }
      };
      _parents_1.forEach(_function);
    }
    EList<Property> _properties = type.getProperties();
    return PropertyEvaluation.addAllUnique(result, _properties);
  }
  
  /**
   * Add elements of the second list to the first list if it is not already in there.
   */
  public static List<Property> addAllUnique(final List<Property> list, final List<Property> addList) {
    final Consumer<Property> _function = new Consumer<Property>() {
      public void accept(final Property item) {
        boolean _containsProperty = PropertyEvaluation.containsProperty(list, item);
        boolean _not = (!_containsProperty);
        if (_not) {
          list.add(item);
        }
      }
    };
    addList.forEach(_function);
    return list;
  }
  
  /**
   * Check if a property of a given name and of the same type does already exist in the collected list of properties.
   * 
   * @param list property collection
   * @param item the property to check against the list
   * 
   * @returns
   * 		true if a property of the same name and type already exists, else false
   */
  public static boolean containsProperty(final List<Property> list, final Property item) {
    for (final Property p : list) {
      boolean _and = false;
      String _name = p.getName();
      String _name_1 = item.getName();
      boolean _equals = _name.equals(_name_1);
      if (!_equals) {
        _and = false;
      } else {
        Classifier _findType = PropertyEvaluation.findType(p);
        EClassifier _class_ = _findType.getClass_();
        String _name_2 = _class_.getName();
        Classifier _findType_1 = PropertyEvaluation.findType(item);
        EClassifier _class__1 = _findType_1.getClass_();
        String _name_3 = _class__1.getName();
        boolean _equals_1 = _name_2.equals(_name_3);
        _and = _equals_1;
      }
      if (_and) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Determine the type of a property. Even if it is an alias.
   * 
   * @param property the property
   * 
   * @param the type classifier
   */
  public static Classifier findType(final Property property) {
    Classifier _type = property.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      return property.getType();
    } else {
      Property _referTo = property.getReferTo();
      return PropertyEvaluation.findType(_referTo);
    }
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
  public static int calculateSize(final Iterable<Property> list) {
    final Function2<Integer, Property, Integer> _function = new Function2<Integer, Property, Integer>() {
      public Integer apply(final Integer result, final Property property) {
        int _size = PropertyEvaluation.getSize(property);
        return Integer.valueOf(((result).intValue() + _size));
      }
    };
    return (int) IterableExtensions.<Property, Integer>fold(list, Integer.valueOf(0), _function);
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
  private static int getSize(final Property property) {
    try {
      int _switchResult = (int) 0;
      Classifier _findType = PropertyEvaluation.findType(property);
      EClassifier _class_ = _findType.getClass_();
      String _name = _class_.getName();
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_name, "string")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "byte")) {
          _matched=true;
          _switchResult = 1;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "short")) {
          _matched=true;
          _switchResult = 2;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "int")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "long")) {
          _matched=true;
          _switchResult = 8;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "float")) {
          _matched=true;
          _switchResult = 4;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "double")) {
          _matched=true;
          _switchResult = 8;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "char")) {
          _matched=true;
          _switchResult = 2;
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "boolean")) {
          _matched=true;
          _switchResult = 1;
        }
      }
      if (!_matched) {
        Classifier _findType_1 = PropertyEvaluation.findType(property);
        EClassifier _class__1 = _findType_1.getClass_();
        String _name_1 = _class__1.getName();
        String _plus = (_name_1 + "is not a valid type name");
        throw new InternalErrorException(_plus);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static List<Property> collectAllDataProperties(final Type type) {
    if (type instanceof RecordType) {
      return _collectAllDataProperties((RecordType)type);
    } else if (type instanceof TemplateType) {
      return _collectAllDataProperties((TemplateType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public static List<Property> collectAllProperties(final Type type) {
    if (type instanceof RecordType) {
      return _collectAllProperties((RecordType)type);
    } else if (type instanceof TemplateType) {
      return _collectAllProperties((TemplateType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public static List<Property> collectAllTemplateProperties(final Type type) {
    if (type instanceof RecordType) {
      return _collectAllTemplateProperties((RecordType)type);
    } else if (type instanceof TemplateType) {
      return _collectAllTemplateProperties((TemplateType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
