package kieker.develop.al.generator.aspectj;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.Collector;
import kieker.develop.al.aspectLang.ContainerNode;
import kieker.develop.al.aspectLang.InsertionPoint;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.Node;
import kieker.develop.al.aspectLang.OperationQuery;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.UtilizeAdvice;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@SuppressWarnings("all")
public class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>, Document> {
  @Override
  public Document generate(final Collection<Aspect> input) {
    try {
      final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
      final Document doc = docBuilder.newDocument();
      final Element aspectjElement = doc.createElement("aspectj");
      doc.appendChild(aspectjElement);
      final Element weaverElement = doc.createElement("weaver");
      weaverElement.setAttribute("options", "");
      aspectjElement.appendChild(weaverElement);
      for (final Aspect aspect : input) {
        {
          final Element includeElement = doc.createElement("include");
          weaverElement.appendChild(includeElement);
        }
      }
      final Element aspectsElement = doc.createElement("aspects");
      aspectjElement.appendChild(aspectsElement);
      for (final Aspect aspect_1 : input) {
        {
          EList<UtilizeAdvice> _advices = aspect_1.getAdvices();
          final Consumer<UtilizeAdvice> _function = (UtilizeAdvice it) -> {
            Advice _advice = it.getAdvice();
            EList<Collector> _collectors = _advice.getCollectors();
            final Function1<Collector, Boolean> _function_1 = (Collector it_1) -> {
              InsertionPoint _insertionPoint = it_1.getInsertionPoint();
              return Boolean.valueOf(Objects.equal(_insertionPoint, InsertionPoint.BEFORE));
            };
            Iterable<Collector> _filter = IterableExtensions.<Collector>filter(_collectors, _function_1);
            this.createDataCollectorAspect(_filter, doc, aspectsElement);
          };
          _advices.forEach(_function);
          EList<UtilizeAdvice> _advices_1 = aspect_1.getAdvices();
          final Consumer<UtilizeAdvice> _function_1 = (UtilizeAdvice it) -> {
            Advice _advice = it.getAdvice();
            EList<Collector> _collectors = _advice.getCollectors();
            final Function1<Collector, Boolean> _function_2 = (Collector it_1) -> {
              InsertionPoint _insertionPoint = it_1.getInsertionPoint();
              return Boolean.valueOf(Objects.equal(_insertionPoint, InsertionPoint.AFTER));
            };
            Iterable<Collector> _filter = IterableExtensions.<Collector>filter(_collectors, _function_2);
            this.createDataCollectorAspect(_filter, doc, aspectsElement);
          };
          _advices_1.forEach(_function_1);
        }
      }
      return doc;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create an aop.xml aspect for a data collector probe.
   * 
   * @param list list of collectors
   * @param doc the document
   * @param parent the parent node of the aspect
   */
  private void createDataCollectorAspect(final Iterable<Collector> list, final Document doc, final Element parent) {
    final Element aspect = doc.createElement("aspect");
    parent.appendChild(aspect);
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
