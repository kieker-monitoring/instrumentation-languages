package kieker.develop.rl.generator.modeltypes

import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider
import java.util.Collection
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.EventType
import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.typing.TypeProvider

/**
 * Generate for one ModelSubType a set of EventType and TemplateType instances.
 * 
 * @author Reiner Jung
 */
class ModelSubTypeGenerator implements IGenerator<ModelSubType, Collection<? extends Type>> {
	
	var String author
	var String version
	var TypeProvider typeProvider

	val traceModelProvider = new TraceModelProvider<ModelSubType,TemplateType>
	
	val anonymousTemplateTypeGenerator = new AnonymousTemplateTypeGenerator()
	val extensionsTemplateTypeGenerator = new ExtensionsTemplateTypeGenerator()
	val eventTypeGenerator = new EventTypeGenerator()
	val templateTypeGenerator = new TemplateTypeGenerator()
	
	override generate(ModelSubType modelSubType) {
		eventTypeGenerator.setTraceModel(traceModelProvider)
		eventTypeGenerator.author = if (modelSubType.author != null) modelSubType.author else author
		eventTypeGenerator.version = if (modelSubType.since != null) modelSubType.since else version
		eventTypeGenerator.modelSubType = modelSubType
		
		templateTypeGenerator.setTraceModel(traceModelProvider)
		templateTypeGenerator.author = if (modelSubType.author != null) modelSubType.author else author
		templateTypeGenerator.version = if (modelSubType.since != null) modelSubType.since else version
		templateTypeGenerator.modelSubType = modelSubType
		
		/** Construct virtual model for model sub type. */
		val model = RecordLangFactory.eINSTANCE.createModel
		model.name = (modelSubType.eContainer as Model).name
				
		if (modelSubType.properties.size > 0) { /** Anonymous extension. */
			anonymousTemplateTypeGenerator.author = author
			anonymousTemplateTypeGenerator.version = version
			anonymousTemplateTypeGenerator.setTraceModel(traceModelProvider)
						
			model.types += anonymousTemplateTypeGenerator.generate(modelSubType)
			
			model.types.generateComplexTypes(modelSubType.modelType.types)
		} else if (modelSubType.extensions.size > 0) { /** Named templates used for extensions. */
			extensionsTemplateTypeGenerator.author = author
			extensionsTemplateTypeGenerator.version = version
			extensionsTemplateTypeGenerator.setTraceModel(traceModelProvider)
			
			model.types += extensionsTemplateTypeGenerator.generate(modelSubType)
		
			model.types.generateComplexTypes(modelSubType.modelType.types)
		}
		
		return model.types
	}
	
	/**
	 * Trigger generation of event and templates types.
	 * 
	 * @param resultTypes list with all resulting types
	 * @param types list of all types to process
	 */
	private def void generateComplexTypes(EList<ComplexType> resultTypes, EList<ComplexType> types) {
		types.filter(typeof(EventType)).forEach[
			typeProvider.findInheritingTypes(it).forEach[
				resultTypes += eventTypeGenerator.generate(it)
			]
		]
		types.filter(typeof(TemplateType)).forEach[
			typeProvider.findInheritingTypes(it).forEach[
				resultTypes += switch(it) {
					EventType: eventTypeGenerator.generate(it)
					TemplateType: templateTypeGenerator.generate(it)
				}
			]
		]		
	}
		
	def void setAuthor(String author) {
		this.author = author
	}
	
	def void setVersion (String version) {
		this.version = version
	}
	
	def void setTypeProvider(TypeProvider provider) {
		this.typeProvider = provider
	}
	
}