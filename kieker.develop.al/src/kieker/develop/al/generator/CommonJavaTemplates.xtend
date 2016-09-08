package kieker.develop.al.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AdviceParameter
import kieker.develop.al.aspectLang.AdviceParameterDeclaration
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.aspectLang.Collector
import kieker.develop.al.aspectLang.Event
import kieker.develop.al.aspectLang.FloatLiteral
import kieker.develop.al.aspectLang.InsertionPoint
import kieker.develop.al.aspectLang.IntLiteral
import kieker.develop.al.aspectLang.InternalFunctionProperty
import kieker.develop.al.aspectLang.Literal
import kieker.develop.al.aspectLang.Property
import kieker.develop.al.aspectLang.ReferenceValue
import kieker.develop.al.aspectLang.ReflectionProperty
import kieker.develop.al.aspectLang.RuntimeProperty
import kieker.develop.al.aspectLang.StringLiteral
import kieker.develop.al.aspectLang.TypeReference
import kieker.develop.al.aspectLang.Value
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.EventType
import org.eclipse.emf.common.util.EList

// TODO this should be somewhat moved to a common module with RL/AL???
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*

/**
 * TODO Class name should be improved.
 */
class CommonJavaTemplates {
	
	/**
	 * Return the package name for a given advice.
	 */
	def static getPackageName(Advice advice) {
		(advice.eContainer as AspectModel).name
	}
	
	/**
	 * Create a code fragment containing all necessary record inputs.
	 */
	def static createRecordInputs(EList<Collector> collectors) {
		val recordList = new ArrayList<EventType>()
		collectors.forEach[collector |
			collector.events.forEach[recordList.addUnique(it.type)]
		]
		return recordList.map['''import «(it.eContainer as Model).name».«it.name»;'''].join('\n')
	}
	
	private def static void addUnique(List<EventType> list, EventType type) {
		if (!list.contains(type))
			list.add(type)
	}
	
	/**
	 * Check if trace API is used.
	 */
	def static boolean isTraceAPIUsed(Advice advice) {
		advice.collectors.exists[it.events.exists[it.initializations.exists[isTraceAPIUsed]]]
	}
	
	private static def boolean isTraceAPIUsed(Value initialization) {
		switch(initialization) {
			Literal: false
			ReferenceValue: false
			InternalFunctionProperty: switch(initialization.function) {
				case TRACE_ID: true
				case ORDER_INDEX: true
				default: false
			}
			AdviceParameter: false // TODO this is not sufficient in the case that a parameter is set accordingly. But this must be set in the aop.xml
			default: false
		}
	}
	
	/**
	 * create code for trace information.
	 */
	static def createTraceId() '''
		TraceMetadata trace = TRACEREGISTRY.getTrace();
		final boolean newTrace = trace == null;
		if (newTrace) {
			trace = TRACEREGISTRY.registerTrace();
			CTRLINST.newMonitoringRecord(trace);
		}
		final long traceId = trace.getTraceId();
	'''
	
	/**
	 * Create data collection code based on event parameter assignments.
	 */
	static def CharSequence createDataCollection(Iterable<Collector> collectors, Map<AdviceParameterDeclaration, Value> parameterAssignments) {
		val Map<CharSequence,CharSequence> data = new HashMap<CharSequence,CharSequence>()
		collectors.forEach[it.events.forEach[it.createData(data, parameterAssignments)]]
		
		return data.values.join('\n')
	}
	
	/**
	 * Create data initialization for data collection.
	 */
	static def Map<CharSequence,CharSequence> createData(Event event, Map<CharSequence,CharSequence> data,  Map<AdviceParameterDeclaration, Value> parameterAssignments) {
		event.type.collectAllDataProperties.forEach[property, i |
			val value = event.initializations.get(i)
			val valueText = value.createValue(parameterAssignments)
			if (!data.keySet.exists[it.toString.equals(valueText.toString)])
				data.put(valueText, '''final «property.type.type.createPrimitiveTypeName» «property.createValueName» = «valueText»;''')
		]
		return data
	}
		
	static def CharSequence createEvent(Event event) '''
		CTRLINST.newMonitoringRecord(new «event.type.name»(«event.type.collectAllDataProperties.map[it.createValueName].join(', ')»));
	'''
	
	private static def CharSequence createValueName(kieker.develop.rl.recordLang.Property property) {
		"collect" + property.name.toFirstUpper
	}
	
	// TODO this prototype must be extended to support parameters and reference values
	private static def CharSequence createValue(Value value, Map<AdviceParameterDeclaration, Value> parameterAssignments) {
		switch(value) {
			StringLiteral: '''"«value.value»"'''
			IntLiteral: value.value.toString
			FloatLiteral: value.value.toString
			ReferenceValue: '''«if (value.query == null) value.property.createLocalProperty else "MISSING"»'''
			InternalFunctionProperty: switch (value.function) {
				case TIME: '''TIMESOURCE.getTime()'''
				case TRACE_ID: '''trace.getTraceId()'''
				case ORDER_INDEX: '''trace.getNextOrderId()'''
			}
			AdviceParameter: {
				parameterAssignments.get(value.declaration).createValue(parameterAssignments)
			}
			default:
				throw new InternalErrorException("Illegal value type " + value.class.name)
		}
	}
	
	private static def CharSequence createLocalProperty(Property property) {
		switch(property) {
			ReflectionProperty: property.createLocalReflectionProperty
			RuntimeProperty: property.createLocalRuntimeProperty
		}
	}
	
	private static def CharSequence createLocalReflectionProperty(ReflectionProperty property) {
		switch (property.function) {
			case CLASS: '''signature.getDeclaringTypeName()'''
			case NAME: '''signature.getName()'''
			case RETURN_TYPE: '''signature.getReturnType().'''
			case SIGNATURE: '''signatureString'''
		}
	}
	
	// TODO fix runtime property access
	private static def CharSequence createLocalRuntimeProperty(RuntimeProperty property) '''
	'''
	
	static def CharSequence createEventRecording(Advice advice, InsertionPoint point) {
		advice.collectors.filter[it.insertionPoint == InsertionPoint.BEFORE].map[it.events.map[it.createEvent].join('\n')].join
	}	
	
	/**
	 * Generate the correct type name. TODO is this sufficient?
	 */
	static def createTypeReference(TypeReference reference) {
		if (reference.collection)
			return '''Collection<«reference.reference.name»>'''
		else
			return reference.reference.name
	}
	
}