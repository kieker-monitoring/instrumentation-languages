/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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

import de.cau.cs.se.geco.architecture.framework.IGenerator
import java.io.StringWriter
import java.util.Calendar
import java.util.Collection
import java.util.Iterator
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.intermediate.IntermediateAspect
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.preferences.TargetsPreferences
import org.eclipse.core.runtime.preferences.IEclipsePreferences
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.w3c.dom.Document
import de.cau.cs.se.geco.architecture.framework.ITraceModelInput
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider
import kieker.develop.al.aspectLang.ApplicationModel
import java.util.ArrayList
import kieker.develop.al.modelhandling.ModelMapperProviderFactory
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI


/**
 * Aspect generator main hook.
 * 
 * @author Reiner Jung
 * 
 * @since 1.3
 */
class AspectLangGenerator implements IGenerator2 {
							
	new () {}
	
	/**
	 * Central generation function.
	 */
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (resource.URI.platformResource) {
			
			/** TODO this is a temporary measure and unfinished. */
			val preferenceStore = TargetsPreferences.preferenceStore
			val project = resource.URI.segmentsList.get(1)
			val projectStore = preferenceStore.node(project)
						
			resource.runGenerators(preferenceStore, fsa)
		}
	}
	
	private def void runGenerators(Resource resource, IEclipsePreferences preferenceStore, IFileSystemAccess2 fsa) {
		val version = TargetsPreferences.getVersionID(preferenceStore)
		val author = TargetsPreferences.getAuthorName(preferenceStore)

		/** Build intermediate model. */
		val aspectModel = resource.allContents.filter(AspectModel).first
		
		if (aspectModel != null) {
			val intermediateModel = aspectModel.createIntermediateModel
			val traceModelProviders = aspectModel.sources.collectTraceModels(resource.resourceSet)
								
			/** Process advice. */
			for (AbstractOutletConfiguration<Advice, Object> configuration : GeneratorRegistration.adviceOutletConfigurations) {
				if (TargetsPreferences.isGeneratorActive(preferenceStore, configuration.name)) {
					/** Parse header template. */
					var rawHeader = TargetsPreferences.getHeaderComment(preferenceStore, configuration.name).replace(
						"THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)
					
					val header = if (!rawHeader.isEmpty) {
						if (rawHeader.lastIndexOf(System.lineSeparator) + 1 < rawHeader.length)
							rawHeader + System.lineSeparator
						else
							rawHeader
					} else
						""
					
					configuration.generators.processAdvices(intermediateModel.aspects, configuration, fsa, header, author, version)
				}
			}
			
			/** Process configuration (including pointcuts). */
			for (AbstractOutletConfiguration<IntermediateModel, Object> configuration : GeneratorRegistration.configurationOutletConfigurations) {
				if (TargetsPreferences.isGeneratorActive(preferenceStore, configuration.name)) {
					/** Parse header template. */
					var rawHeader = TargetsPreferences.getHeaderComment(preferenceStore, configuration.name).replace(
						"THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)
					
					val header = if (!rawHeader.isEmpty) {
						if (rawHeader.lastIndexOf(System.lineSeparator) + 1 < rawHeader.length)
							rawHeader + System.lineSeparator
						else
							rawHeader
					} else
						""
											
					configuration.generators.processPointcuts(intermediateModel, configuration, traceModelProviders, fsa, header, author, version)
				}
			}
		} else {
			println("Error no model found. An aspect model must appear in this resource.")
		}
	}
	
	/**
	 * Collect all trace models from all model mappings.
	 * 
	 * @param applicationModels collection of application model declarations
	 * @param resourceSet resource set for all files
	 * 
	 * @returns a collection of trace models
	 */
	private def Collection<ITraceModelProvider<EObject, String>> collectTraceModels(EList<ApplicationModel> applicationModels, ResourceSet resourceSet) {
		val collectedProviders = new ArrayList<ITraceModelProvider<EObject, String>>
		applicationModels.forEach[if (it.traceModel != null) collectedProviders.add(it.traceModel.loadTraceModel(it.handler, resourceSet))]
		
		return collectedProviders
	}
	
	/**
	 * Load trace model.
	 * 
	 * @param traceModel the string referencing the trace model
	 * @param handlerId the ih of the model handler to be used in this context
	 * @param resourceSet the resource set where this resource is placed in 
	 */
	private def ITraceModelProvider<EObject, String> loadTraceModel(String traceModel, String handlerId, ResourceSet resourceSet) {
		val mapper = ModelMapperProviderFactory.createInstance.provider.modelMappers.get(handlerId)
		return mapper.traceModelProvider(URI::createPlatformResourceURI(traceModel, true), resourceSet)
	}
		
	/**
	 * Return the first element of a list or null if list is empty.
	 */
	private def AspectModel first(Iterator<AspectModel> models) {
		if (models.hasNext)
			models.next
		else
			null
	}
	
	
	private def IntermediateModel createIntermediateModel(AspectModel aspectModel) {
		val generator = new IntermediateModelGenerator()
		
		// TODO perform configuration, assign semantic annotations and trace model
			
		return generator.generate(aspectModel)
	}
		
	/**
	 * Compile advice collection with given generator collection.
	 * 
	 * @param generators generators to be used to produce output
	 * @param aspect collection including advice declarations
	 * @param configuration outlet configuration to be used
	 * @param fsa file system access
	 * @param header header to be added to the source code
	 * @param author author name to be used for the generated code
	 * @param version version number to be used in the generated code
	 */
	private def void processAdvices(Collection<IGenerator<? extends Advice, ?>> generators,
		EList<IntermediateAspect> aspects, AbstractOutletConfiguration<Advice, Object> configuration, 
		IFileSystemAccess2 fsa, String header, String author, String version) {
				
		generators.forEach[generator |
			println("generator advice " + generator.class)
			//(generator as IConfigureParameters).configure(header, author, version)
			aspects.forEach[aspect |
				println("aspect/advice " + aspect.class + " " + aspect.advices)
				// TODO aspect based configuration e.g., technology selection 
				/** Generate advice for a specific technology only if it is used. */
				if (aspect.joinpoints.exists[it.technologies.exists[it.name.equals(configuration.technology)]]) {
					aspect.advices.forEach[advice |
						switch (generator) {
							IGenerator<Advice, CharSequence>: {
								val result = (generator as IGenerator<Advice,CharSequence>).generate(advice)
								fsa.generateFile(configuration.outputFilePath(advice), configuration.name, result)
							}
							IGenerator<Advice, Document>: {
								val document = (generator as IGenerator<Advice,Document>).generate(advice)
								val transformerFactory = TransformerFactory.newInstance()
								val transformer = transformerFactory.newTransformer()
								transformer.setOutputProperty(OutputKeys.INDENT, "yes")
								transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3")
								
								val writer = new StringWriter()
								
								transformer.transform(new DOMSource(document), new StreamResult(writer))
								fsa.generateFile(configuration.outputFilePath(advice), configuration.name, writer.toString)
							}
						}
					]
				}
			]
		]
	}
	
	/**
	 * Compile joinpoint collections with given generator collection.
	 * 
	 * @param generators generators to be used to produce output
	 * @param aspects collection of aspects containing joinpoints declarations
	 * @param configuration outlet configuration to be used
	 * @param fsa file system access
	 * @param header header to be added to the source code
	 * @param author author name to be used for the generated code
	 * @param version version number to be used in the generated code
	 */
	private def void processPointcuts(Collection<IGenerator<? extends IntermediateModel, ?>> generators,
		IntermediateModel intermediateModel, AbstractOutletConfiguration<IntermediateModel, ? extends Object> configuration,
		Collection<ITraceModelProvider<EObject, String>> traceModelProviders,
		IFileSystemAccess2 fsa, String header, String author, String version) {
		
		generators.forEach[generator |
			println("generator pointcut " + generator.class)
			(generator as ITraceModelInput<EObject, String>).setTraceModelProviders(traceModelProviders)
			//(generator as IConfigureParameters).configure(header, author, version)
			val technologyUsed = intermediateModel.aspects.exists[aspect |
				println("aspect/pointcut " + aspect.class + " " + aspect.joinpoints)
				// TODO aspect based configuration e.g., technology selection 
				aspect.joinpoints.exists[it.technologies.exists[it.name.equals(configuration.technology)]]
			]
			
			if (technologyUsed) {
				switch (generator) {
					IGenerator<IntermediateModel, CharSequence>: {
						val result = (generator as IGenerator<IntermediateModel, CharSequence>).generate(intermediateModel)
						fsa.generateFile(configuration.outputFilePath(intermediateModel), configuration.name, result)
					}
					IGenerator<IntermediateModel, Document>: {
						val document = (generator as IGenerator<IntermediateModel, Document>).generate(intermediateModel)
						val transformerFactory = TransformerFactory.newInstance()
						val transformer = transformerFactory.newTransformer()
						transformer.setOutputProperty(OutputKeys.INDENT, "yes")
						transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3")
						
						val writer = new StringWriter()
						
						transformer.transform(new DOMSource(document), new StreamResult(writer))
						fsa.generateFile(configuration.outputFilePath(intermediateModel), configuration.name, writer.toString)
					}
				}
			}
		]
	}
	
	
			
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
}
