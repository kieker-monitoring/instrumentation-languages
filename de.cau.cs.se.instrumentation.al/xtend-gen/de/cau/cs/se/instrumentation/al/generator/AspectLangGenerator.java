/**
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.cau.cs.se.instrumentation.al.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.MethodModifier;
import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumantation.model.structure.TypeReference;
import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.Node;
import de.cau.cs.se.instrumentation.al.aspectLang.Pointcut;
import de.cau.cs.se.instrumentation.al.aspectLang.UtilizeProbe;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class AspectLangGenerator implements IGenerator {
  private final Map<String, Collection<Aspect>> aspectMap = new HashMap<String, Collection<Aspect>>();
  
  /**
   * Central generation function.
   */
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Aspect> _filter = Iterators.<Aspect>filter(_allContents, Aspect.class);
    final Procedure1<Aspect> _function = new Procedure1<Aspect>() {
      public void apply(final Aspect it) {
        AspectLangGenerator.this.addAspect(AspectLangGenerator.this.aspectMap, it);
      }
    };
    IteratorExtensions.<Aspect>forEach(_filter, _function);
    final BiConsumer<String, Collection<Aspect>> _function_1 = new BiConsumer<String, Collection<Aspect>>() {
      public void accept(final String key, final Collection<Aspect> value) {
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(key, "AspectJ")) {
            _matched=true;
            AspectLangGenerator.this.createAspectJConfiguration(value, fsa);
          }
        }
        if (!_matched) {
          if (Objects.equal(key, "J2EE")) {
            _matched=true;
            AspectLangGenerator.this.createJ2EEConfiguration(value, fsa);
          }
        }
        if (!_matched) {
          if (Objects.equal(key, "Spring")) {
            _matched=true;
            AspectLangGenerator.this.createSpringConfiguration(value, fsa);
          }
        }
      }
    };
    this.aspectMap.forEach(_function_1);
  }
  
  /**
   * Helper function to create a map of aspects and the aspect technology annotation.
   * 
   * @param map the map of all aspect technologies and its corresponding aspects.
   * @param aspect a new aspect to be added to the map.
   */
  public void addAspect(final Map<String, Collection<Aspect>> map, final Aspect aspect) {
  }
  
  /**
   * Create AspectJ configuration (aop.xml) for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  public void createAspectJConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    try {
      final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
      final Document doc = docBuilder.newDocument();
      final Element aspectjElement = doc.createElement("aspectj");
      doc.appendChild(aspectjElement);
      final Element weaverElement = doc.createElement("weaver");
      weaverElement.setAttribute("options", "");
      aspectjElement.appendChild(weaverElement);
      for (final Aspect aspect : aspects) {
        {
          final Element includeElement = doc.createElement("include");
          Pointcut _query = aspect.getQuery();
          String _computeAspectJQuery = this.computeAspectJQuery(_query);
          includeElement.setAttribute("within", _computeAspectJQuery);
          weaverElement.appendChild(includeElement);
        }
      }
      final Element aspectsElement = doc.createElement("aspects");
      aspectjElement.appendChild(aspectsElement);
      for (final Aspect aspect_1 : aspects) {
        {
          EList<UtilizeProbe> _applyProbes = aspect_1.getApplyProbes();
          final Consumer<UtilizeProbe> _function = new Consumer<UtilizeProbe>() {
            public void accept(final UtilizeProbe it) {
              Advice _probe = it.getProbe();
              EList<Collector> _collectors = _probe.getCollectors();
              final Function1<Collector, Boolean> _function = new Function1<Collector, Boolean>() {
                public Boolean apply(final Collector it) {
                  InsertionPoint _insertionPoint = it.getInsertionPoint();
                  return Boolean.valueOf(Objects.equal(_insertionPoint, InsertionPoint.BEFORE));
                }
              };
              Iterable<Collector> _filter = IterableExtensions.<Collector>filter(_collectors, _function);
              AspectLangGenerator.this.createDataCollectorAspect(_filter, doc, aspectsElement);
            }
          };
          _applyProbes.forEach(_function);
          EList<UtilizeProbe> _applyProbes_1 = aspect_1.getApplyProbes();
          final Consumer<UtilizeProbe> _function_1 = new Consumer<UtilizeProbe>() {
            public void accept(final UtilizeProbe it) {
              Advice _probe = it.getProbe();
              EList<Collector> _collectors = _probe.getCollectors();
              final Function1<Collector, Boolean> _function = new Function1<Collector, Boolean>() {
                public Boolean apply(final Collector it) {
                  InsertionPoint _insertionPoint = it.getInsertionPoint();
                  return Boolean.valueOf(Objects.equal(_insertionPoint, InsertionPoint.AFTER));
                }
              };
              Iterable<Collector> _filter = IterableExtensions.<Collector>filter(_collectors, _function);
              AspectLangGenerator.this.createDataCollectorAspect(_filter, doc, aspectsElement);
            }
          };
          _applyProbes_1.forEach(_function_1);
        }
      }
      final TransformerFactory transformerFactory = TransformerFactory.newInstance();
      final Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
      final StringWriter writer = new StringWriter();
      DOMSource _dOMSource = new DOMSource(doc);
      StreamResult _streamResult = new StreamResult(writer);
      transformer.transform(_dOMSource, _streamResult);
      String _string = writer.toString();
      access.generateFile("aop.xml", _string);
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
  public void createDataCollectorAspect(final Iterable<Collector> list, final Document doc, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method type is undefined for the type AspectLangGenerator"
      + "\nname cannot be resolved");
  }
  
  /**
   * Compute the query for model nodes.
   */
  public String computeAspectJQuery(final Pointcut pointcut) {
    StringConcatenation _builder = new StringConcatenation();
    LocationQuery _location = pointcut.getLocation();
    CharSequence _computeLocation = this.computeLocation(_location);
    _builder.append(_computeLocation, "");
    _builder.append(" ");
    MethodQuery _method = pointcut.getMethod();
    MethodModifier _modifier = _method.getModifier();
    CharSequence _computeModifier = this.computeModifier(_modifier);
    _builder.append(_computeModifier, "");
    _builder.append(" ");
    CharSequence _xifexpression = null;
    MethodQuery _method_1 = pointcut.getMethod();
    boolean _notEquals = (!Objects.equal(_method_1, null));
    if (_notEquals) {
      MethodQuery _method_2 = pointcut.getMethod();
      Method _methodReference = _method_2.getMethodReference();
      _xifexpression = this.computeMethod(_methodReference);
    } else {
      _xifexpression = "*";
    }
    _builder.append(_xifexpression, "");
    return _builder.toString();
  }
  
  public CharSequence computeLocation(final LocationQuery query) {
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
  
  protected CharSequence _computeNode(final ContainerNode node) {
    StringConcatenation _builder = new StringConcatenation();
    Container _container = node.getContainer();
    String _name = _container.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _computeNode(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    return _builder;
  }
  
  public CharSequence computeModifier(final MethodModifier modifier) {
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
  
  public CharSequence computeMethod(final Method method) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = method.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    EList<Parameter> _parameters = method.getParameters();
    final Function1<Parameter, CharSequence> _function = new Function1<Parameter, CharSequence>() {
      public CharSequence apply(final Parameter it) {
        return AspectLangGenerator.this.computeParameter(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Parameter, CharSequence>map(_parameters, _function);
    String _join = IterableExtensions.join(_map, ", ");
    _builder.append(_join, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence computeParameter(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    TypeReference _type = parameter.getType();
    CharSequence _computeType = this.computeType(_type);
    _builder.append(_computeType, "");
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence computeType(final TypeReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = reference.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  /**
   * Create Spring configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  public String createSpringConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    return "TODO: auto-generated method stub";
  }
  
  /**
   * Create J2EE configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  public String createJ2EEConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    return "TODO: auto-generated method stub";
  }
  
  public CharSequence computeNode(final Node node) {
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
