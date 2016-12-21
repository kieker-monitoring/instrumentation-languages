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
package kieker.develop.rl.generator

import java.util.ArrayList
import java.util.Calendar
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.preferences.TargetsPreferences
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import org.eclipse.core.runtime.preferences.IEclipsePreferences
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.osgi.service.prefs.Preferences
import java.util.Collection
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.modeltypes.ModelSubTypeGenerator
import kieker.develop.rl.typing.TypeProvider

/**
 * Generates one single files per record for java, c, and perl. 
 */
class RecordLangGenerator implements IGenerator2 {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (resource.URI.platformResource) {
			
			val preferenceStore = TargetsPreferences.preferenceStore
			val project = resource.URI.segmentsList.get(1)
			val projectStore = preferenceStore.node(project)

			projectStore.v()
			
			val typeProvider = new TypeProvider(resource.resourceSet)
			
			resource.runGenerators(preferenceStore, typeProvider, fsa)
		}
	}

	def void v(Preferences preferences) {
		preferences.childrenNames.forEach[System.out.println(">> " + it)]
	}

	/**
	 * Execute all generators for the IRL for the given resource.
	 * 
	 * @param preferenceStore contains all preferences used for the generation.
	 * @param resource the resource containing the ComplexTypes
	 * @param fsa provides the access to the file system
	 */
	private def runGenerators(Resource resource, IEclipsePreferences preferenceStore, TypeProvider typeProvider, IFileSystemAccess2 fsa) {
		val version = TargetsPreferences.getVersionID(preferenceStore)
		val author = TargetsPreferences.getAuthorName(preferenceStore)

		val modelSubTypeGenerator = new ModelSubTypeGenerator()
		modelSubTypeGenerator.author = author
		modelSubTypeGenerator.version = version
		modelSubTypeGenerator.typeProvider = typeProvider

		for (AbstractOutletConfiguration configuration : GeneratorConfiguration.outletConfigurations) {
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
				
				val eventTypes = new ArrayList<EventType>()
				val templateTypes = new ArrayList<TemplateType>()
							
				/** generate event and template types for model sub types. */	
				val modelSubTypes = resource.allContents.filter(typeof(ModelSubType))
																
				modelSubTypes.forEach[
					modelSubTypeGenerator.generate(it).forEach[type |
						switch(type) {
							EventType: eventTypes.add(type)
							TemplateType: templateTypes.add(type)
						}
					]
				]
				
				/** Add the other template and event types to their respective lists. */
				resource.allContents.filter(typeof(EventType)).forEach[eventTypes += it]
				resource.allContents.filter(typeof(TemplateType)).forEach[templateTypes += it]
				
				configuration.eventTypeGenerators.processTypes(eventTypes, configuration, fsa, header, author, version)
				configuration.templateTypeGenerators.processTypes(templateTypes, configuration, fsa, header, author, version)
			}
		}
	}
	
	/**
	 * Iterate over all generators for all types and produce one output file.
	 * 
	 * @param generators list of generators
	 * @param types list of types
	 * @param configuration the present configuration
	 * @param fsa the file system access handler
	 * @param header comment used in the output
	 * @param author default author used in the output
	 * @param version default version used in the output
	 */
	private def <T extends Type> void processTypes(Collection<ITypeGenerator<T,? extends Object>> generators, 
		Collection<T> types,
		AbstractOutletConfiguration configuration,
		IFileSystemAccess2 fsa,
		String header, String author, String version
	) {
		generators.forEach[generator |
			types.filter[generator.accepts(it)].forEach[
				switch (generator) {
					ITypeGenerator<T,CharSequence>: {
						val result = generator.generate(new TypeInputModel<T>(header, author, version, it))
						fsa.generateFile(configuration.outputFilePath(it), configuration.name, result)
					}
					/** Note in future, we might add model to model output here. */
				}

			]
		]
	}


	/** @{inheritDoc}. Defined to honor API. */
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	/** @{inheritDoc}. Defined to honor API. */
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
}
