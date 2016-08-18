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
package kieker.develop.al.generator;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kieker.develop.al.modelhandling.IModelMapper;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.w3c.dom.Document;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class AspectLangGenerator implements IGenerator2 {
  private final static String MODEL_MAPPER = "kieker.develop.al.modelMapping";
  
  private final /* Map<Technology, Collection<Aspect>> */Object aspectTechnologyMap /* Skipped initializer because of errors */;
  
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
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nAspect cannot be resolved to a type."
      + "\nThe method or field ASPECT_J is undefined"
      + "\nThe method or field JAVA_EE is undefined"
      + "\nThe method or field SPRING is undefined"
      + "\nThe method or field SERVLET is undefined"
      + "\nThe method discoverAspectTechnology(Map<Technology, Collection<Aspect>>, Aspect) from the type AspectLangGenerator refers to the missing type Technology"
      + "\nThe field AspectLangGenerator.aspectTechnologyMap refers to the missing type Technology"
      + "\nThe field AspectLangGenerator.aspectTechnologyMap refers to the missing type Technology"
      + "\nThe method createAspectJConfiguration(Collection<Aspect>, IFileSystemAccess2) from the type AspectLangGenerator refers to the missing type Aspect"
      + "\nThe method createJ2EEConfiguration(Collection<Aspect>, IFileSystemAccess2) from the type AspectLangGenerator refers to the missing type Aspect"
      + "\nThe method createSpringConfiguration(Collection<Aspect>, IFileSystemAccess2) from the type AspectLangGenerator refers to the missing type Aspect"
      + "\nThe method createServletConfiguration(Collection<Aspect>, IFileSystemAccess2) from the type AspectLangGenerator refers to the missing type Aspect");
  }
  
  /**
   * Create AspectJ configuration (aop.xml) for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createAspectJConfiguration(final /* Collection<Aspect> */Object aspects, final IFileSystemAccess2 access) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generate(Collection<Aspect>) from the type AspectJPointcutGenerator refers to the missing type Aspect"
      + "\nThe method createUtilizationMap(Collection<Aspect>) from the type CommonCollectionModule refers to the missing type Advice"
      + "\nThe method generate(UtilizeAdvice) from the type AspectJAdviceGenerator refers to the missing type UtilizeAdvice"
      + "\naspectJAbstractAdviceName cannot be resolved");
  }
  
  private String aspectJAbstractAdviceName(final /* UtilizeAdvice */Object advice, final int i) {
    throw new Error("Unresolved compilation problems:"
      + "\nadvice cannot be resolved"
      + "\npackagePathName cannot be resolved"
      + "\nadvice cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create Spring configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createSpringConfiguration(final /* Collection<Aspect> */Object aspects, final IFileSystemAccess2 access) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createUtilizationMap(Collection<Aspect>) from the type CommonCollectionModule refers to the missing type Advice"
      + "\nThe method aspectSpringAdviceName(Advice) from the type AspectLangGenerator refers to the missing type Advice"
      + "\nThe method generate(Advice) from the type SpringAdviceGenerator refers to the missing type Advice");
  }
  
  private String aspectSpringAdviceName(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\npackagePathName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create J2EE configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createJ2EEConfiguration(final /* Collection<Aspect> */Object aspects, final IFileSystemAccess2 access) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createUtilizationMap(Collection<Aspect>) from the type CommonCollectionModule refers to the missing type Advice"
      + "\nThe method aspectJ2EEAdviceName(Advice) from the type AspectLangGenerator refers to the missing type Advice"
      + "\nThe method generate(Advice) from the type JavaEEAdviceGenerator refers to the missing type Advice");
  }
  
  private String aspectJ2EEAdviceName(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\npackagePathName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create Servlet configuration for a given collection of aspects.
   * 
   * @param aspects collection of aspects for AspectJ
   * @param access file system access
   */
  private void createServletConfiguration(final /* Collection<Aspect> */Object aspects, final IFileSystemAccess2 access) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createUtilizationMap(Collection<Aspect>) from the type CommonCollectionModule refers to the missing type Advice"
      + "\nThe method aspectServletAdviceName(Advice) from the type AspectLangGenerator refers to the missing type Advice"
      + "\nThe method generate(Advice) from the type ServletAdviceGenerator refers to the missing type Advice");
  }
  
  private String aspectServletAdviceName(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\npackagePathName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Serialize a given XML document model into a file vial the
   * Xtext file system access handler.
   * 
   * @param filename name of the XML file including extension and relative path
   * @param access the file system access handler of the Xtext framework
   * @param document the document model to be serialized.
   */
  private void storeXMLModel(final String filename, final IFileSystemAccess2 access, final Document document) {
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
  private void discoverAspectTechnology(final /* Map<Technology, Collection<Aspect>> */Object map, final /* Aspect */Object aspect) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method addAndRegisterAspectTechnology(Map<Technology, Collection<Aspect>>, Technology, Aspect) from the type AspectLangGenerator refers to the missing type Technology"
      + "\nThe method discoverAspectTechnologyByModelMapper(Map<Technology, Collection<Aspect>>, Aspect) from the type AspectLangGenerator refers to the missing type Technology"
      + "\npointcut cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npointcut cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\npointcut cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\ntechnologies cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Helper function to create a map of aspects and the aspect technology annotation.
   * This method defines the mapping based on a rudimentary information from the model handler.
   * 
   * @param map the map of all aspect technologies and its corresponding aspects.
   * @param aspect a new aspect to be added to the map.
   */
  private void discoverAspectTechnologyByModelMapper(final /* Map<Technology, Collection<Aspect>> */Object map, final /* Aspect */Object aspect) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method targetTechnologies() from the type IModelMapper refers to the missing type Technology"
      + "\nThe method addAndRegisterAspectTechnology(Map<Technology, Collection<Aspect>>, Technology, Aspect) from the type AspectLangGenerator refers to the missing type Technology"
      + "\npointcut cannot be resolved"
      + "\nmodel cannot be resolved"
      + "\nhandler cannot be resolved"
      + "\nequals cannot be resolved");
  }
  
  /**
   * Map builder: add an aspect to an technology.
   */
  private void addAndRegisterAspectTechnology(final /* Map<Technology, Collection<Aspect>> */Object map, final /* Technology */Object technology, final /* Aspect */Object aspect) {
    throw new Error("Unresolved compilation problems:"
      + "\nAspect cannot be resolved to a type.");
  }
  
  /**
   * create the name for an advice.
   */
  private String getPackagePathName(final /* Advice */Object advice) {
    throw new Error("Unresolved compilation problems:"
      + "\nAspectModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}
