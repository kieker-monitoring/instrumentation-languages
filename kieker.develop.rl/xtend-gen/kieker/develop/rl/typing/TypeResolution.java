package kieker.develop.rl.typing;

import com.google.common.base.Objects;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Constant;
import kieker.develop.rl.recordLang.Literal;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.typing.BaseTypes;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TypeResolution {
  /**
   * Resolve the primitive type for the given literal.
   */
  public static BaseType getRequiredType(final Literal literal) {
    BaseType _switchResult = null;
    EObject _eContainer = literal.eContainer();
    boolean _matched = false;
    if (!_matched) {
      if (_eContainer instanceof Constant) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        Classifier _type = ((Constant) _eContainer_1).getType();
        _switchResult = _type.getType();
      }
    }
    if (!_matched) {
      if (_eContainer instanceof Property) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        Classifier _type = ((Property) _eContainer_1).getType();
        _switchResult = _type.getType();
      }
    }
    if (!_matched) {
      if (_eContainer instanceof Literal) {
        _matched=true;
        EObject _eContainer_1 = literal.eContainer();
        _switchResult = TypeResolution.getRequiredType(((Literal) _eContainer_1));
      }
    }
    return _switchResult;
  }
  
  public static boolean isType(final Literal literal, final BaseTypes baseType) throws InternalErrorException {
    BaseType _requiredType = TypeResolution.getRequiredType(literal);
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_requiredType);
    return baseType.equals(_typeEnum);
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
      return TypeResolution.findType(_referTo);
    }
  }
}
