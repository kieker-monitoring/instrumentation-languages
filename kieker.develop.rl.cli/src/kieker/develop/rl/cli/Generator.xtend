/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.cli

import kieker.develop.rl.typing.TypeProvider
import kieker.develop.rl.generator.modeltypes.ModelSubTypeGenerator
import java.util.ArrayList
import kieker.develop.rl.recordLang.ComplexType
import org.eclipse.emf.ecore.resource.Resource
import java.util.Calendar
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import java.util.Collection
import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.generator.IAcceptType
import kieker.develop.rl.generator.IConfigureParameters
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.apache.log4j.Level

/**
 * Run all generators for all resources.
 * 
 * @author Reiner Jung
 * 
 * @since 1.15
 */
class Generator {
	
	static final Logger LOGGER = LogManager.getLogger(Generator);
	
	/** Version of the record, becoming part of the JavaDoc comment. */
	String version
	/** Default author when no author was specified with the event type.  */
	String author
	/** API target version; referring to the Kieker API. */
	String targetVersion
	/** Header comment to be prepended to the generated files. */
	String headerComment
	
	AbstractOutletConfiguration<ComplexType, Object> configuration
	
	DirectIOFileSystemAccess fsa
	
	/**
	 * Create a new generator handler.
	 * 
	 * @param loggingLevel logging level
	 * @param headerComment header comment string
	 * @param version default version for the resource 
	 * @param author default author for all type in the resource 
	 * @param targetVerion API target version referring to the Kieker API
	 * @param configuration outlet configuration
	 */
	new (Level loggingLevel, String headerComment, String version, String author, String targetVersion, AbstractOutletConfiguration<ComplexType, Object> configuration) {
		LOGGER.setLevel(loggingLevel)
		this.headerComment = headerComment
		this.version = version
		this.author = author
		this.targetVersion = targetVersion
		this.configuration = configuration
		this.fsa = new DirectIOFileSystemAccess()
	}
	
	def generate(Resource resource, String targetDirectory, String language) {
		
		val typeProvider = new TypeProvider(resource.resourceSet)

		val modelSubTypeGenerator = new ModelSubTypeGenerator()
		modelSubTypeGenerator.author = this.author
		modelSubTypeGenerator.version = this.version
		modelSubTypeGenerator.typeProvider = typeProvider

		
		/** Parse header template. */
		var rawHeader = headerComment.replace("THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)
		
		val header = if (!rawHeader.isEmpty) {
			if (rawHeader.lastIndexOf(System.lineSeparator) + 1 < rawHeader.length)
				rawHeader + System.lineSeparator
			else
				rawHeader
		} else
			""
		
		val types = new ArrayList<ComplexType>()
					
		/** generate event and template types for model sub types. */	
		val modelSubTypes = resource.allContents.filter(typeof(ModelSubType))
														
		modelSubTypes.forEach[
			modelSubTypeGenerator.generate(it).forEach[types += it]
		]
		
		/** Add the other template and event types to their respective lists. */
		resource.allContents.filter(typeof(EventType)).forEach[types += it]
		resource.allContents.filter(typeof(TemplateType)).forEach[types += it]
		resource.allContents.filter(typeof(EnumerationType)).forEach[types += it]
		
		configuration.generators.processTypes(types, header, targetDirectory, language)
	}
	
	/**
	 * Iterate over all generators for all types and produce one output file.
	 * 
	 * @param generators list of generators
	 * @param types list of types
	 * @param modifiedHeader header string containing the header comment with all expanded comments
	 * @param tagetDirectory target directory prefix
	 * @param language target language
	 */
	private def void processTypes(Collection<IGenerator<? extends ComplexType,? extends Object>> generators, 
		Collection<? extends ComplexType> types, String modifiedHeader, String targetDirectory, String language) {
		generators.filter(IAcceptType).forEach[generator |
			types.filter[generator.accepts(it)].forEach[
				LOGGER.info("generating type " + it.name + " for " + language + " ...")
				switch (generator) {
					IGenerator<ComplexType, CharSequence>: {
						(generator as IConfigureParameters).configure(this.targetVersion, modifiedHeader, this.author, this.version)
						val result = generator.generate(it)
						fsa.generateFile(configuration.outputFilePath(it), targetDirectory, result)
					}
					/** Note in future, we might add model to model output here. */
				}

			]
		]
	}
}