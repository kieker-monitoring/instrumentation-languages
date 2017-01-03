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
import kieker.develop.al.intermediate.AbstractJoinpoint
import kieker.develop.al.intermediate.IntermediateAspect
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.rl.generator.IConfigureParameters
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.preferences.TargetsPreferences
import org.eclipse.core.runtime.preferences.IEclipsePreferences
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.w3c.dom.Document

/**
 * Aspect generator main hook.
 * 
 * @author Reiner Jung
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
		val intermediateModel = resource.allContents.filter(AspectModel).first?.createIntermediateModel
							
		/** Process aspects. */
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
		
		/** Process pointcuts. */
		for (AbstractOutletConfiguration<AbstractJoinpoint, Object> configuration : GeneratorRegistration.configurationOutletConfigurations) {
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
										
				configuration.generators.processPointcuts(intermediateModel.aspects, configuration, fsa, header, author, version)
			}
		}
	}
	
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
			(generator as IConfigureParameters).configure(header, author, version)
			aspects.forEach[aspect |
				// TODO aspect based configuration e.g., technology selection 
				/** Generate advice for a specific technology only if it is used. */
				if (aspect.joinpoints.exists[configuration.technology.equals(it.technology)]) {
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
	private def void processPointcuts(Collection<IGenerator<? extends AbstractJoinpoint, ?>> generators,
		EList<IntermediateAspect> aspects, AbstractOutletConfiguration<AbstractJoinpoint, Object> configuration,
		IFileSystemAccess2 fsa, String header, String author, String version) {
		
		generators.forEach[generator |
			aspects.forEach[aspect |
				// TODO aspect based configuration e.g., technology selection 
				/** Generate advice for a specific technology only if it is used. */
				if (aspect.joinpoints.exists[configuration.technology.equals(it.technology)]) {
					aspect.joinpoints.forEach[joinpoint | 
						(generator as IConfigureParameters).configure(header, author, version)
						switch (generator) {
							IGenerator<AbstractJoinpoint, CharSequence>: {
								val result = (generator as IGenerator<AbstractJoinpoint, CharSequence>).generate(joinpoint)
								fsa.generateFile(configuration.outputFilePath(joinpoint), configuration.name, result)
							}
							IGenerator<AbstractJoinpoint, Document>: {
								val document = (generator as IGenerator<AbstractJoinpoint, Document>).generate(joinpoint)
								val transformerFactory = TransformerFactory.newInstance()
								val transformer = transformerFactory.newTransformer()
								transformer.setOutputProperty(OutputKeys.INDENT, "yes")
								transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3")
								
								val writer = new StringWriter()
								
								transformer.transform(new DOMSource(document), new StreamResult(writer))
								fsa.generateFile(configuration.outputFilePath(joinpoint), configuration.name, writer.toString)
							}
						}
					]
				}
			]
		]
	}
	
	
			
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
}
