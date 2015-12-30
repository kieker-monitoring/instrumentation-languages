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
import de.cau.cs.se.instrumentation.al.aspectLang.Advice;
import de.cau.cs.se.instrumentation.al.aspectLang.Annotation;
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Pointcut;
import de.cau.cs.se.instrumentation.al.aspectLang.Technology;
import de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice;
import de.cau.cs.se.instrumentation.al.generator.aspectj.AspectJAdviceGenerator;
import de.cau.cs.se.instrumentation.al.generator.aspectj.AspectJPointcutGenerator;
import de.cau.cs.se.instrumentation.al.generator.javaee.JavaEEAdviceGenerator;
import de.cau.cs.se.instrumentation.al.generator.servlet.ServletAdviceGenerator;
import de.cau.cs.se.instrumentation.al.generator.spring.SpringAdviceGenerator;
import de.cau.cs.se.instrumentation.al.modelhandling.IModelMapper;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.w3c.dom.Document;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class AspectLangGenerator implements IGenerator {
  private final static String MODEL_MAPPER = "de.cau.cs.se.instrumentation.al.modelMapping";
  
  private final Map<Technology, Collection<Aspect>> aspectTechnologyMap = new HashMap<Technology, Collection<Aspect>>();
  
  private final Collection<IModelMapper> mappers = new ArrayList<IModelMapper>();
  
  public AspectLangGenerator() {
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] config = registry.getConfigurationElementsFor(AspectLangGenerator.MODEL_MAPPER);
    try {
      final Consumer<IConfigurationElement> _function = (IConfigurationElement element) -> {
        try {
          final Object ext = element.createExecutableExtension("class");
          if ((ext instanceof IModelMapper)) {
            this.mappers.add(((IModelMapper) ext));
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      ((List<IConfigurationElement>)Conversions.doWrapArray(config)).forEach(_function);
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException ex = (CoreException)_t;
        String _message = ex.getMessage();
        System.out.println(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Central generation function.
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Aspect> _filter = Iterators.<Aspect>filter(_allContents, Aspect.class);
    final Procedure1<Aspect> _function = (Aspect it) -> {
      this.discoverAspectTechnology(this.aspectTechnologyMap, it);
    };
    IteratorExtensions.<Aspect>forEach(_filter, _function);
    final BiConsumer<Technology, Collection<Aspect>> _function_1 = (Technology key, Collection<Aspect> value) -> {
      if (key != null) {
        switch (key) {
          case ASPECT_J:
            this.createAspectJConfiguration(value, fsa);
            break;
          case JAVA_EE:
            this.createJ2EEConfiguration(value, fsa);
            break;
          case SPRING:
            this.createSpringConfiguration(value, fsa);
            break;
          case SERVLET:
            this.createServletConfiguration(value, fsa);
            break;
          default:
            break;
        }
      }
    };
    this.aspectTechnologyMap.forEach(_function_1);
  }
  
  /**
   * Create AspectJ configuration (aop.xml) for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createAspectJConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    final AspectJPointcutGenerator aspectGenerator = new AspectJPointcutGenerator();
    Document _generate = aspectGenerator.generate(aspects);
    this.storeXMLModel("aop.xml", access, _generate);
    final AspectJAdviceGenerator adviceGenerator = new AspectJAdviceGenerator();
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = this.createUtilizationMap(aspects);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      final Procedure2<UtilizeAdvice, Integer> _function_1 = (UtilizeAdvice utilizedAdviced, Integer i) -> {
        adviceGenerator.setIndex((i).intValue());
        String _aspectJAbstractAdviceName = this.aspectJAbstractAdviceName(utilizedAdviced, (i).intValue());
        CharSequence _generate_1 = adviceGenerator.generate(utilizedAdviced);
        access.generateFile(_aspectJAbstractAdviceName, _generate_1);
      };
      IterableExtensions.<UtilizeAdvice>forEach(utilizedAdvices, _function_1);
    };
    utilizationAdviceMap.forEach(_function);
  }
  
  private String aspectJAbstractAdviceName(final UtilizeAdvice advice, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("aspectj");
    _builder.append(File.separator, "");
    Advice _advice = advice.getAdvice();
    String _packagePathName = this.getPackagePathName(_advice);
    _builder.append(_packagePathName, "");
    _builder.append("Abstract");
    Advice _advice_1 = advice.getAdvice();
    String _name = _advice_1.getName();
    _builder.append(_name, "");
    _builder.append("Advice");
    _builder.append(i, "");
    _builder.append(".java");
    return _builder.toString();
  }
  
  /**
   * Create Spring configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createSpringConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    final SpringAdviceGenerator adviceGenerator = new SpringAdviceGenerator();
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = this.createUtilizationMap(aspects);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      String _aspectSpringAdviceName = this.aspectSpringAdviceName(advice);
      CharSequence _generate = adviceGenerator.generate(advice);
      access.generateFile(_aspectSpringAdviceName, _generate);
    };
    utilizationAdviceMap.forEach(_function);
  }
  
  private String aspectSpringAdviceName(final Advice advice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("spring");
    _builder.append(File.separator, "");
    String _packagePathName = this.getPackagePathName(advice);
    _builder.append(_packagePathName, "");
    String _name = advice.getName();
    _builder.append(_name, "");
    _builder.append("Interceptor.java");
    return _builder.toString();
  }
  
  /**
   * Create J2EE configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createJ2EEConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    final JavaEEAdviceGenerator adviceGenerator = new JavaEEAdviceGenerator();
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = this.createUtilizationMap(aspects);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      String _aspectJ2EEAdviceName = this.aspectJ2EEAdviceName(advice);
      CharSequence _generate = adviceGenerator.generate(advice);
      access.generateFile(_aspectJ2EEAdviceName, _generate);
    };
    utilizationAdviceMap.forEach(_function);
  }
  
  private String aspectJ2EEAdviceName(final Advice advice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("j2ee");
    _builder.append(File.separator, "");
    String _packagePathName = this.getPackagePathName(advice);
    _builder.append(_packagePathName, "");
    String _name = advice.getName();
    _builder.append(_name, "");
    _builder.append("Interceptor.java");
    return _builder.toString();
  }
  
  /**
   * Create Servlet configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createServletConfiguration(final Collection<Aspect> aspects, final IFileSystemAccess access) {
    final ServletAdviceGenerator adviceGenerator = new ServletAdviceGenerator();
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = this.createUtilizationMap(aspects);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      String _aspectServletAdviceName = this.aspectServletAdviceName(advice);
      CharSequence _generate = adviceGenerator.generate(advice);
      access.generateFile(_aspectServletAdviceName, _generate);
    };
    utilizationAdviceMap.forEach(_function);
  }
  
  private String aspectServletAdviceName(final Advice advice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("servlet");
    _builder.append(File.separator, "");
    String _packagePathName = this.getPackagePathName(advice);
    _builder.append(_packagePathName, "");
    String _name = advice.getName();
    _builder.append(_name, "");
    _builder.append("Filter.java");
    return _builder.toString();
  }
  
  /**
   * Serialize a given XML document model into a file vial the
   * Xtext file system access handler.
   * 
   * @param filename name of the XML file including extension and relative path
   * @param access the file system access handler of the Xtext framework
   * @param document the document model to be serialized.
   */
  private void storeXMLModel(final String filename, final IFileSystemAccess access, final Document document) {
    try {
      final TransformerFactory transformerFactory = TransformerFactory.newInstance();
      final Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
      final StringWriter writer = new StringWriter();
      DOMSource _dOMSource = new DOMSource(document);
      StreamResult _streamResult = new StreamResult(writer);
      transformer.transform(_dOMSource, _streamResult);
      String _string = writer.toString();
      access.generateFile(filename, _string);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Helper function to create a map of aspects and the aspect technology annotation.
   * This method first tries to find the technology information in the aspect model by
   * testing for annotations and then calls the mapper for help if this does not succeed.
   * 
   * @param map the map of all aspect technologies and its corresponding aspects.
   * @param aspect a new aspect to be added to the map.
   */
  private void discoverAspectTechnology(final Map<Technology, Collection<Aspect>> map, final Aspect aspect) {
    Pointcut _pointcut = aspect.getPointcut();
    Annotation _annotation = _pointcut.getAnnotation();
    boolean _notEquals = (!Objects.equal(_annotation, null));
    if (_notEquals) {
      Pointcut _pointcut_1 = aspect.getPointcut();
      Annotation _annotation_1 = _pointcut_1.getAnnotation();
      String _name = _annotation_1.getName();
      boolean _equals = _name.equals("technology");
      if (_equals) {
        Pointcut _pointcut_2 = aspect.getPointcut();
        Annotation _annotation_2 = _pointcut_2.getAnnotation();
        EList<Technology> _technologies = _annotation_2.getTechnologies();
        final Consumer<Technology> _function = (Technology it) -> {
          this.addAndRegisterAspectTechnology(map, it, aspect);
        };
        _technologies.forEach(_function);
      }
    } else {
      this.discoverAspectTechnologyByModelMapper(map, aspect);
    }
  }
  
  /**
   * Helper function to create a map of aspects and the aspect technology annotation.
   * This method defines the mapping based on a rudimentary information from the model handler.
   * 
   * @param map the map of all aspect technologies and its corresponding aspects.
   * @param aspect a new aspect to be added to the map.
   */
  private void discoverAspectTechnologyByModelMapper(final Map<Technology, Collection<Aspect>> map, final Aspect aspect) {
    final Consumer<IModelMapper> _function = (IModelMapper it) -> {
      Pointcut _pointcut = aspect.getPointcut();
      ApplicationModel _model = _pointcut.getModel();
      String _handler = _model.getHandler();
      String _name = it.name();
      boolean _equals = _handler.equals(_name);
      if (_equals) {
        Collection<Technology> _targetTechnologies = it.targetTechnologies();
        final Consumer<Technology> _function_1 = (Technology it_1) -> {
          this.addAndRegisterAspectTechnology(map, it_1, aspect);
        };
        _targetTechnologies.forEach(_function_1);
      }
    };
    this.mappers.forEach(_function);
  }
  
  /**
   * Map builder: add an aspect to an technology.
   */
  private void addAndRegisterAspectTechnology(final Map<Technology, Collection<Aspect>> map, final Technology technology, final Aspect aspect) {
    Collection<Aspect> list = map.get(technology);
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      ArrayList<Aspect> _arrayList = new ArrayList<Aspect>();
      list = _arrayList;
      map.put(technology, list);
    }
    list.add(aspect);
  }
  
  /**
   * create the name for an advice.
   */
  private String getPackagePathName(final Advice advice) {
    EObject _eContainer = advice.eContainer();
    String _name = ((AspectModel) _eContainer).getName();
    String _replace = _name.replace("\\.", File.separator);
    return (_replace + File.separator);
  }
  
  /**
   * Create a map for advices and their instantiation/utilization.
   * 
   * @param aspects collection of aspects containing advices.
   * 
   * @return map of advices and list of utilizations.
   */
  private HashMap<Advice, List<UtilizeAdvice>> createUtilizationMap(final Collection<Aspect> aspects) {
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = new HashMap<Advice, List<UtilizeAdvice>>();
    final Consumer<Aspect> _function = (Aspect it) -> {
      EList<UtilizeAdvice> _advices = it.getAdvices();
      final Consumer<UtilizeAdvice> _function_1 = (UtilizeAdvice advice) -> {
        Advice _advice = advice.getAdvice();
        List<UtilizeAdvice> adviceList = utilizationAdviceMap.get(_advice);
        boolean _equals = Objects.equal(adviceList, null);
        if (_equals) {
          ArrayList<UtilizeAdvice> _arrayList = new ArrayList<UtilizeAdvice>();
          adviceList = _arrayList;
          Advice _advice_1 = advice.getAdvice();
          utilizationAdviceMap.put(_advice_1, adviceList);
        }
        adviceList.add(advice);
      };
      _advices.forEach(_function_1);
    };
    aspects.forEach(_function);
    return utilizationAdviceMap;
  }
}
