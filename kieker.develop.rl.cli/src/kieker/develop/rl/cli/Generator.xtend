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

class Generator {
		
	private String headerComment
	
	AbstractOutletConfiguration<ComplexType, Object> configuration
	
	DirectIOFileSystemAccess fsa
	
	new (String headerComment, String projectRoot, AbstractOutletConfiguration<ComplexType, Object> configuration) {
		this.headerComment = headerComment
		this.configuration = configuration
		this.fsa = new DirectIOFileSystemAccess(projectRoot)
	}
	
	def generate(Resource resource, String targetDirectory) {
		
		val typeProvider = new TypeProvider(resource.resourceSet)
				
		val version = "1.14"
		val author = "author"
		val targetVersion = "1.14"

		val modelSubTypeGenerator = new ModelSubTypeGenerator()
		modelSubTypeGenerator.author = author
		modelSubTypeGenerator.version = version
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
		
		configuration.generators.processTypes(types, targetVersion, header, author, version, targetDirectory)
	}
	
	/**
	 * Iterate over all generators for all types and produce one output file.
	 * 
	 * @param generators list of generators
	 * @param types list of types
	 * @param fsa the file system access handler
	 * @param header comment used in the output
	 * @param author default author used in the output
	 * @param version default version used in the output
	 */
	private def void processTypes(Collection<IGenerator<? extends ComplexType,? extends Object>> generators, 
		Collection<? extends ComplexType> types,
		String targetVersion, String header, String author, String version, String targetDirectory
	) {
		generators.filter(IAcceptType).forEach[generator |
			types.filter[generator.accepts(it)].forEach[
				switch (generator) {
					IGenerator<ComplexType, CharSequence>: {
						(generator as IConfigureParameters).configure(targetVersion, header, author, version)
						val result = generator.generate(it) as CharSequence
						fsa.generateFile(configuration.outputFilePath(it), targetDirectory, result)
					}
					/** Note in future, we might add model to model output here. */
				}

			]
		]
	}
}