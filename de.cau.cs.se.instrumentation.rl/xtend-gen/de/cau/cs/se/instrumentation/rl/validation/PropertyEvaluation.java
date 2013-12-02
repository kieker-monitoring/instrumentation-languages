package de.cau.cs.se.instrumentation.rl.validation;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialType;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.util.Arrays;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class PropertyEvaluation {
  /**
   * Collect recursively a list of all properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static EList<Property> _collectAllProperties(final RecordType type) {
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      final EList<Property> result = PropertyEvaluation.collectAllProperties(_parent_1);
      EList<PartialType> _parents = type.getParents();
      boolean _notEquals_1 = (!Objects.equal(_parents, null));
      if (_notEquals_1) {
        EList<PartialType> _parents_1 = type.getParents();
        final Procedure1<PartialType> _function = new Procedure1<PartialType>() {
          public void apply(final PartialType it) {
            EList<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(it);
            result.addAll(_collectAllProperties);
          }
        };
        IterableExtensions.<PartialType>forEach(_parents_1, _function);
      }
      EList<Property> _properties = type.getProperties();
      PropertyEvaluation.addAllUnique(result, _properties);
      return result;
    } else {
      BasicEList<Property> _basicEList = new BasicEList<Property>();
      final EList<Property> result_1 = _basicEList;
      EList<PartialType> _parents_2 = type.getParents();
      boolean _notEquals_2 = (!Objects.equal(_parents_2, null));
      if (_notEquals_2) {
        EList<PartialType> _parents_3 = type.getParents();
        final Procedure1<PartialType> _function_1 = new Procedure1<PartialType>() {
          public void apply(final PartialType it) {
            EList<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(it);
            result_1.addAll(_collectAllProperties);
          }
        };
        IterableExtensions.<PartialType>forEach(_parents_3, _function_1);
      }
      EList<Property> _properties_1 = type.getProperties();
      PropertyEvaluation.addAllUnique(result_1, _properties_1);
      return result_1;
    }
  }
  
  /**
   * Collect recursively a list of all properties.
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static EList<Property> _collectAllProperties(final PartialRecordType type) {
    BasicEList<Property> _basicEList = new BasicEList<Property>();
    final EList<Property> result = _basicEList;
    EList<PartialType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<PartialType> _parents_1 = type.getParents();
      final Procedure1<PartialType> _function = new Procedure1<PartialType>() {
        public void apply(final PartialType it) {
          EList<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(it);
          result.addAll(_collectAllProperties);
        }
      };
      IterableExtensions.<PartialType>forEach(_parents_1, _function);
    }
    EList<Property> _properties = type.getProperties();
    PropertyEvaluation.addAllUnique(result, _properties);
    return result;
  }
  
  /**
   * Collect recursively a list of all properties of interfaces
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static EList<Property> _collectAllInterfaceProperties(final RecordType type) {
    EList<PartialType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      BasicEList<Property> _basicEList = new BasicEList<Property>();
      final EList<Property> result = _basicEList;
      EList<PartialType> _parents_1 = type.getParents();
      final Procedure1<PartialType> _function = new Procedure1<PartialType>() {
        public void apply(final PartialType it) {
          EList<Property> _collectAllInterfaceProperties = PropertyEvaluation.collectAllInterfaceProperties(it);
          result.addAll(_collectAllInterfaceProperties);
        }
      };
      IterableExtensions.<PartialType>forEach(_parents_1, _function);
      return result;
    } else {
      BasicEList<Property> _basicEList_1 = new BasicEList<Property>();
      return _basicEList_1;
    }
  }
  
  /**
   * Collect recursively a list of all properties of interfaces
   * 
   * @param type
   * 		a recordType
   * 
   * @returns
   * 		a complete list of all properties in a record
   */
  protected static EList<Property> _collectAllInterfaceProperties(final PartialRecordType type) {
    BasicEList<Property> _basicEList = new BasicEList<Property>();
    final EList<Property> result = _basicEList;
    EList<PartialType> _parents = type.getParents();
    boolean _notEquals = (!Objects.equal(_parents, null));
    if (_notEquals) {
      EList<PartialType> _parents_1 = type.getParents();
      final Procedure1<PartialType> _function = new Procedure1<PartialType>() {
        public void apply(final PartialType it) {
          EList<Property> _collectAllInterfaceProperties = PropertyEvaluation.collectAllInterfaceProperties(it);
          result.addAll(_collectAllInterfaceProperties);
        }
      };
      IterableExtensions.<PartialType>forEach(_parents_1, _function);
    }
    EList<Property> _properties = type.getProperties();
    PropertyEvaluation.addAllUnique(result, _properties);
    return result;
  }
  
  /**
   * Add elements of the second list to the first list if it is not already in there.
   */
  public static EList<Property> addAllUnique(final EList<Property> list, final EList<Property> addList) {
    final Procedure1<Property> _function = new Procedure1<Property>() {
      public void apply(final Property item) {
        boolean _contains = list.contains(item);
        boolean _not = (!_contains);
        if (_not) {
          list.add(item);
        }
      }
    };
    IterableExtensions.<Property>forEach(addList, _function);
    return list;
  }
  
  public static EList<Property> collectAllProperties(final Type type) {
    if (type instanceof PartialRecordType) {
      return _collectAllProperties((PartialRecordType)type);
    } else if (type instanceof RecordType) {
      return _collectAllProperties((RecordType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public static EList<Property> collectAllInterfaceProperties(final Type type) {
    if (type instanceof PartialRecordType) {
      return _collectAllInterfaceProperties((PartialRecordType)type);
    } else if (type instanceof RecordType) {
      return _collectAllInterfaceProperties((RecordType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
