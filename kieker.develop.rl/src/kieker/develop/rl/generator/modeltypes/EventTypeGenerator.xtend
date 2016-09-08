package kieker.develop.rl.generator.modeltypes

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.recordLang.EventType
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.RecordLangFactory

class EventTypeGenerator implements IGenerator<EventType, EventType> {
	
	var String author
	var String version
	var ModelSubType modelSubType
	
	var TraceModelProvider<ModelSubType, TemplateType> traceModelProvider
	
	override generate(EventType input) {
		val result = RecordLangFactory.eINSTANCE.createEventType
								
		result.name = modelSubType.name + "_" + input.name
		result.author = author
		result.since = version
				
		result.parent = input
		result.inherits += traceModelProvider.lookup(modelSubType)
		
		return result
	}
	
	def setTraceModel(TraceModelProvider<ModelSubType, TemplateType> provider) {
		this.traceModelProvider = provider
	}
	
	def void setModelSubType(ModelSubType modelSubType) {
		this.modelSubType = modelSubType
	}
	
	def void setAuthor(String author) {
		this.author = author
	}
	
	def void setVersion (String version) {
		this.version = version
	}
	
}