/***************************************************************************
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
 ***************************************************************************/
package kieker.develop.al.generator

import kieker.develop.al.aspectLang.Aspect
import kieker.develop.al.aspectLang.Technology
import kieker.develop.al.generator.aspectj.AspectJPointcutGenerator
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import kieker.develop.al.generator.aspectj.AspectJAdviceGenerator
import kieker.develop.al.generator.servlet.ServletAdviceGenerator
import kieker.develop.al.generator.javaee.JavaEEAdviceGenerator
import kieker.develop.al.generator.spring.SpringAdviceGenerator
import org.eclipse.core.runtime.Platform
import kieker.develop.al.modelhandling.IModelMapper
import org.eclipse.core.runtime.CoreException
import java.io.StringWriter
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.TransformerFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.stream.StreamResult
import org.w3c.dom.Document
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.aspectLang.UtilizeAdvice
import java.io.File
import kieker.develop.al.aspectLang.Advice
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AspectLangGenerator implements IGenerator {
	
	private static final String MODEL_MAPPER = "kieker.develop.al.modelMapping"
	
	val Map<Technology,Collection<Aspect>> aspectTechnologyMap = new HashMap<Technology,Collection<Aspect>>()
	
	val Collection<IModelMapper> mappers = new ArrayList<IModelMapper>()
	
	new () {
		val registry = Platform.getExtensionRegistry()
  		val config = registry.getConfigurationElementsFor(MODEL_MAPPER)
	  	try {
			config.forEach[element |
	  			val ext = element.createExecutableExtension("class")
	  			if (ext instanceof IModelMapper) {
	  				this.mappers.add((ext as IModelMapper))
	  			}
	  		]
	  	} catch (CoreException ex) {
		   	System.out.println(ex.getMessage())
		}	
	}
	
	/**
	 * Central generation function.
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.filter(typeof(Aspect)).forEach[aspectTechnologyMap.discoverAspectTechnology(it)]
		aspectTechnologyMap.forEach[key, value | switch(key) {
			case ASPECT_J: createAspectJConfiguration(value,fsa)
			case JAVA_EE : createJ2EEConfiguration(value,fsa)
			case SPRING : createSpringConfiguration(value,fsa)
			case SERVLET: createServletConfiguration(value,fsa)
		}]
	}
			
	/**
	 * Create AspectJ configuration (aop.xml) for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createAspectJConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val aspectGenerator = new AspectJPointcutGenerator()
		storeXMLModel('aop.xml', access, aspectGenerator.generate(aspects))
				
		val adviceGenerator = new AspectJAdviceGenerator()
		val utilizationAdviceMap = aspects.createUtilizationMap()
		
		utilizationAdviceMap.forEach[advice, utilizedAdvices |
			utilizedAdvices.forEach[utilizedAdviced, i|
				adviceGenerator.setIndex(i)
				access.generateFile(utilizedAdviced.aspectJAbstractAdviceName(i), 
					adviceGenerator.generate(utilizedAdviced)
				)
			]
		]
	}
		
	private def String aspectJAbstractAdviceName(UtilizeAdvice advice, int i) '''aspectj«File.separator»«advice.advice.packagePathName»Abstract«advice.advice.name»Advice«i».java'''
			
	/**
	 * Create Spring configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createSpringConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new SpringAdviceGenerator()
		
		val utilizationAdviceMap = aspects.createUtilizationMap()
		
		utilizationAdviceMap.forEach[advice, utilizedAdvices |
			access.generateFile(advice.aspectSpringAdviceName, adviceGenerator.generate(advice))
		]
	}
	
	private def String aspectSpringAdviceName(Advice advice) '''spring«File.separator»«advice.packagePathName»«advice.name»Interceptor.java'''
	
	/**
	 * Create J2EE configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createJ2EEConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new JavaEEAdviceGenerator()
		
		val utilizationAdviceMap = aspects.createUtilizationMap()
		
		utilizationAdviceMap.forEach[advice, utilizedAdvices |
			access.generateFile(advice.aspectJ2EEAdviceName, adviceGenerator.generate(advice))
		]
	}
	
	private def String aspectJ2EEAdviceName(Advice advice) '''j2ee«File.separator»«advice.packagePathName»«advice.name»Interceptor.java'''
	
	/**
	 * Create Servlet configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createServletConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new ServletAdviceGenerator()
		
		val utilizationAdviceMap = aspects.createUtilizationMap()
		
		utilizationAdviceMap.forEach[advice, utilizedAdvices |
			access.generateFile(advice.aspectServletAdviceName, adviceGenerator.generate(advice))
		]
	}
	
	private def String aspectServletAdviceName(Advice advice) '''servlet«File.separator»«advice.packagePathName»«advice.name»Filter.java'''
	
	
	/**
	 * Serialize a given XML document model into a file vial the 
	 * Xtext file system access handler.
	 * 
	 * @param filename name of the XML file including extension and relative path
	 * @param access the file system access handler of the Xtext framework
	 * @param document the document model to be serialized. 
	 */
	private def storeXMLModel(String filename, IFileSystemAccess access, Document document) {
		val transformerFactory = TransformerFactory.newInstance()
		val transformer = transformerFactory.newTransformer()
		transformer.setOutputProperty(OutputKeys.INDENT, "yes")
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3")
		
		val writer = new StringWriter()
		
		transformer.transform(new DOMSource(document), new StreamResult(writer))
		access.generateFile(filename,writer.toString)
	}
	
	/**
	 * Helper function to create a map of aspects and the aspect technology annotation.
	 * This method first tries to find the technology information in the aspect model by
	 * testing for annotations and then calls the mapper for help if this does not succeed.
	 * 
	 * @param map the map of all aspect technologies and its corresponding aspects.
	 * @param aspect a new aspect to be added to the map.
	 */
	private def void discoverAspectTechnology(Map<Technology, Collection<Aspect>> map, Aspect aspect) {
		if (aspect.pointcut.annotation != null) {
			if (aspect.pointcut.annotation.name.equals("technology"))
				aspect.pointcut.annotation.technologies.forEach[map.addAndRegisterAspectTechnology(it,aspect)]
		} else
			discoverAspectTechnologyByModelMapper(map, aspect)
	}
	
	/**
	 * Helper function to create a map of aspects and the aspect technology annotation.
	 * This method defines the mapping based on a rudimentary information from the model handler.
	 * 
	 * @param map the map of all aspect technologies and its corresponding aspects.
	 * @param aspect a new aspect to be added to the map.
	 */
	private def void discoverAspectTechnologyByModelMapper(Map<Technology, Collection<Aspect>> map, Aspect aspect) {
		this.mappers.forEach[
			if (aspect.pointcut.model.handler.equals(it.name))
				it.targetTechnologies.forEach[map.addAndRegisterAspectTechnology(it,aspect)]
		]
	}
	
	/**
	 * Map builder: add an aspect to an technology.
	 */
	private def void addAndRegisterAspectTechnology(Map<Technology, Collection<Aspect>> map, Technology technology, Aspect aspect) {
		var list = map.get(technology)
		if (list == null) {
			list = new ArrayList<Aspect>()
			map.put(technology,list)
		}
		list.add(aspect)
	}
	
	/**
	 * create the name for an advice.
	 */
	private def String getPackagePathName(Advice advice) {
		(advice.eContainer as AspectModel).name.replace('\\.',File.separator) + File.separator
	}
	
	/**
	 * Create a map for advices and their instantiation/utilization.
	 * 
	 * @param aspects collection of aspects containing advices.
	 * 
	 * @return map of advices and list of utilizations.
	 */
	private def createUtilizationMap(Collection<Aspect> aspects) {
		val utilizationAdviceMap = new HashMap<Advice,List<UtilizeAdvice>>()
		aspects.forEach[
			it.advices.forEach[advice |
				var adviceList = utilizationAdviceMap.get(advice.advice)
				if (adviceList == null) {
					adviceList = new ArrayList<UtilizeAdvice>()
					utilizationAdviceMap.put(advice.advice, adviceList)
				}
				adviceList.add(advice)
			]
		]
		
		return utilizationAdviceMap
	}
}
