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
package de.cau.cs.se.instrumentation.al.generator

import de.cau.cs.se.instrumentation.al.aspectLang.Aspect
import de.cau.cs.se.instrumentation.al.aspectLang.Technology
import de.cau.cs.se.instrumentation.al.generator.aspectj.AspectJPointcutGenerator
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import de.cau.cs.se.instrumentation.al.generator.aspectj.AspectJAdviceGenerator
import de.cau.cs.se.instrumentation.al.generator.servlet.ServletAdviceGenerator
import de.cau.cs.se.instrumentation.al.generator.javaee.JavaEEAdviceGenerator
import de.cau.cs.se.instrumentation.al.generator.spring.SpringAdviceGenerator
import org.eclipse.core.runtime.Platform
import de.cau.cs.se.instrumentation.al.modelhandling.IModelMapper
import org.eclipse.core.runtime.CoreException
import java.io.StringWriter
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.TransformerFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.stream.StreamResult
import org.w3c.dom.Document
import de.cau.cs.se.instrumentation.al.aspectLang.AspectModel
import de.cau.cs.se.instrumentation.al.aspectLang.UtilizeAdvice
import java.io.File

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AspectLangGenerator implements IGenerator {
	
	private static final String MODEL_MAPPER = "de.cau.cs.se.instrumentation.al.modelMapping"
	
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
	def createAspectJConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val aspectGenerator = new AspectJPointcutGenerator()
		storeXMLModel('aop.xml', access, aspectGenerator.generate(aspects))
				
		val adviceGenerator = new AspectJAdviceGenerator()
		aspects.forEach[
			it.advices.forEach[advice |
				access.generateFile("aspectj" + File.separator + advice.packagePathName + advice.advice.name + "Advice.java", adviceGenerator.generate(advice.advice))
			]
		]
	}
		
	/**
	 * Create Spring configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createSpringConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new SpringAdviceGenerator()
		aspects.forEach[
			it.advices.forEach[advice |
				access.generateFile("spring" + File.separator + advice.packagePathName + advice.advice.name + "Interceptor.java", adviceGenerator.generate(advice.advice))
			]
		]
	}
	
	/**
	 * Create J2EE configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createJ2EEConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new JavaEEAdviceGenerator()
		aspects.forEach[
			it.advices.forEach[advice |
				access.generateFile("j2ee" + File.separator + advice.packagePathName + advice.advice.name + "Interceptor.java", adviceGenerator.generate(advice.advice))
			]
		]
	}

	/**
	 * Create Servlet configuration for a given collection of aspects.
	 * 
	 * @param aspects collection of aspects for AspectJ
	 * @param access file system access
	 */
	private def createServletConfiguration(Collection<Aspect> aspects, IFileSystemAccess access) {
		val adviceGenerator = new ServletAdviceGenerator()
		aspects.forEach[
			it.advices.forEach[advice |
				access.generateFile("servlet" + File.separator +advice.packagePathName + advice.advice.name + "Filter.java", adviceGenerator.generate(advice.advice))
			]
		]
	}
	
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
	private def String getPackagePathName(UtilizeAdvice advice) {
		(advice.eContainer.eContainer as AspectModel).name.replace('\\.',File.separator) + File.separator
	}
}
