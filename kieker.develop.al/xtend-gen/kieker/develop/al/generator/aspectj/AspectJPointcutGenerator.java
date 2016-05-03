package kieker.develop.al.generator.aspectj;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.ApplicationModel;
import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.ContainerNode;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.Node;
import kieker.develop.al.aspectLang.OperationQuery;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import kieker.develop.al.generator.aspectj.NameResolver;
import kieker.develop.al.mapping.CollectionType;
import kieker.develop.al.mapping.Container;
import kieker.develop.al.mapping.Feature;
import kieker.develop.al.mapping.NamedType;
import kieker.develop.al.mapping.Operation;
import kieker.develop.al.mapping.OperationModifier;
import kieker.develop.al.mapping.Parameter;
import kieker.develop.al.mapping.Type;
import kieker.develop.al.mapping.TypeReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@SuppressWarnings("all")
public class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>, Document> {
  private final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
  
  private final DocumentBuilder docBuilder = new Function0<DocumentBuilder>() {
    public DocumentBuilder apply() {
      try {
        DocumentBuilder _newDocumentBuilder = AspectJPointcutGenerator.this.docFactory.newDocumentBuilder();
        return _newDocumentBuilder;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final Document doc = this.docBuilder.newDocument();
  
  @Override
  public Document generate(final Collection<Aspect> input) {
    final Element aspectjElement = this.doc.createElement("aspectj");
    this.doc.appendChild(aspectjElement);
    final Element weaverElement = this.doc.createElement("weaver");
    weaverElement.setAttribute("options", "");
    aspectjElement.appendChild(weaverElement);
    for (final Aspect aspect : input) {
      {
        final Element includeElement = this.doc.createElement("include");
        weaverElement.appendChild(includeElement);
      }
    }
    final Element aspectsElement = this.doc.createElement("aspects");
    aspectjElement.appendChild(aspectsElement);
    for (final Aspect aspect_1 : input) {
      EList<UtilizeAdvice> _advices = aspect_1.getAdvices();
      final Procedure2<UtilizeAdvice, Integer> _function = (UtilizeAdvice advice, Integer i) -> {
        Advice _advice = advice.getAdvice();
        Element _createAspect = this.createAspect(aspectsElement, _advice, (i).intValue());
        aspectsElement.appendChild(_createAspect);
      };
      IterableExtensions.<UtilizeAdvice>forEach(_advices, _function);
    }
    for (final Aspect aspect_2 : input) {
      EList<UtilizeAdvice> _advices_1 = aspect_2.getAdvices();
      final Procedure2<UtilizeAdvice, Integer> _function_1 = (UtilizeAdvice advice, Integer i) -> {
        Advice _advice = advice.getAdvice();
        final Element concreteAspect = this.createConcreteAspect(aspectsElement, _advice, (i).intValue());
        Pointcut _pointcut = aspect_2.getPointcut();
        Element _createPointcut = this.createPointcut(_pointcut);
        concreteAspect.appendChild(_createPointcut);
        aspectsElement.appendChild(concreteAspect);
      };
      IterableExtensions.<UtilizeAdvice>forEach(_advices_1, _function_1);
    }
    return this.doc;
  }
  
  private Element createPointcut(final Pointcut pointcut) {
    final Element pNode = this.doc.createElement("pointcut");
    String _name = pointcut.getName();
    pNode.setAttribute("name", _name);
    String _createExpression = this.createExpression(pointcut);
    pNode.setAttribute("expression", _createExpression);
    return pNode;
  }
  
  private String createExpression(final Pointcut pointcut) {
    StringConcatenation _builder = new StringConcatenation();
    ApplicationModel _model = pointcut.getModel();
    _builder.append(_model, "");
    final String result = _builder.toString();
    return result;
  }
  
  private Element createAspect(final Element parent, final Advice advice, final int i) {
    final Element aspect = this.doc.createElement("aspect");
    CharSequence _adviceClassName = NameResolver.getAdviceClassName(advice, i);
    String _string = _adviceClassName.toString();
    aspect.setAttribute("name", _string);
    return aspect;
  }
  
  private Element createConcreteAspect(final Element parent, final Advice advice, final int i) {
    final Element aspect = this.doc.createElement("concrete-aspect");
    CharSequence _concreteAdviceClassName = NameResolver.getConcreteAdviceClassName(advice, i);
    String _string = _concreteAdviceClassName.toString();
    aspect.setAttribute("name", _string);
    CharSequence _adviceClassName = NameResolver.getAdviceClassName(advice, i);
    String _string_1 = _adviceClassName.toString();
    aspect.setAttribute("extends", _string_1);
    return aspect;
  }
  
  /**
   * Compute the query for model nodes.
   */
  private String computeAspectJQuery(final Pointcut pointcut) {
    StringConcatenation _builder = new StringConcatenation();
    LocationQuery _location = pointcut.getLocation();
    CharSequence _computeLocation = this.computeLocation(_location);
    _builder.append(_computeLocation, "");
    _builder.append(" ");
    OperationQuery _operation = pointcut.getOperation();
    OperationModifier _modifier = _operation.getModifier();
    CharSequence _computeModifier = this.computeModifier(_modifier);
    _builder.append(_computeModifier, "");
    _builder.append(" ");
    CharSequence _xifexpression = null;
    OperationQuery _operation_1 = pointcut.getOperation();
    boolean _notEquals = (!Objects.equal(_operation_1, null));
    if (_notEquals) {
      OperationQuery _operation_2 = pointcut.getOperation();
      Operation _operationReference = _operation_2.getOperationReference();
      _xifexpression = this.computeMethod(_operationReference);
    } else {
      _xifexpression = "*";
    }
    _builder.append(_xifexpression, "");
    return _builder.toString();
  }
  
  private CharSequence computeLocation(final LocationQuery query) {
    StringConcatenation _builder = new StringConcatenation();
    Node _node = query.getNode();
    CharSequence _computeNode = this.computeNode(_node);
    _builder.append(_computeNode, "");
    String _xifexpression = null;
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      LocationQuery _specialization_1 = query.getSpecialization();
      CharSequence _computeLocation = this.computeLocation(_specialization_1);
      _xifexpression = ("." + _computeLocation);
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  private CharSequence _computeNode(final ContainerNode node) {
    StringConcatenation _builder = new StringConcatenation();
    Feature _container = node.getContainer();
    String _name = _container.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  private CharSequence _computeNode(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    return _builder;
  }
  
  private CharSequence computeModifier(final OperationModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(modifier, null));
    if (_notEquals) {
      _xifexpression = modifier.getName();
    } else {
      _xifexpression = "*";
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  private CharSequence computeMethod(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    EList<Parameter> _parameters = operation.getParameters();
    final Function1<Parameter, CharSequence> _function = (Parameter it) -> {
      return this.computeParameter(it);
    };
    List<CharSequence> _map = ListExtensions.<Parameter, CharSequence>map(_parameters, _function);
    String _join = IterableExtensions.join(_map, ", ");
    _builder.append(_join, "");
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence computeParameter(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    TypeReference _type = parameter.getType();
    CharSequence _computeType = this.computeType(_type);
    _builder.append(_computeType, "");
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  private CharSequence computeType(final TypeReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = reference.getType();
    CharSequence _computeTypeName = this.computeTypeName(_type);
    _builder.append(_computeTypeName, "");
    return _builder;
  }
  
  private CharSequence computeTypeName(final Type type) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof NamedType) {
        _matched=true;
        _switchResult = ((NamedType)type).getName();
      }
    }
    if (!_matched) {
      if (type instanceof Container) {
        _matched=true;
        _switchResult = ((Container)type).getName();
      }
    }
    if (!_matched) {
      if (type instanceof CollectionType) {
        _matched=true;
        Type _elementType = ((CollectionType)type).getElementType();
        CharSequence _computeTypeName = this.computeTypeName(_elementType);
        _switchResult = (_computeTypeName + "[]");
      }
    }
    return _switchResult;
  }
  
  private CharSequence computeNode(final Node node) {
    if (node instanceof ContainerNode) {
      return _computeNode((ContainerNode)node);
    } else if (node != null) {
      return _computeNode(node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node).toString());
    }
  }
}
