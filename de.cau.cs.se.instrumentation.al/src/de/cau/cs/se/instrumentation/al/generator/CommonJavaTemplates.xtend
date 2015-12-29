package de.cau.cs.se.instrumentation.al.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.al.aspectLang.Collector
import java.util.ArrayList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import java.util.List
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.al.aspectLang.AspectModel
import de.cau.cs.se.instrumentation.al.aspectLang.Advice
import de.cau.cs.se.instrumentation.al.aspectLang.Value
import de.cau.cs.se.instrumentation.al.aspectLang.Literal
import de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty
import de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameter
import de.cau.cs.se.instrumentation.al.aspectLang.Event
import de.cau.cs.se.instrumentation.al.aspectLang.StringLiteral
import de.cau.cs.se.instrumentation.al.aspectLang.IntLiteral
import de.cau.cs.se.instrumentation.al.aspectLang.FloatLiteral
import de.cau.cs.se.instrumentation.rl.generator.InternalErrorException
import de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty
import de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty
import de.cau.cs.se.instrumentation.al.aspectLang.Property
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint
import de.cau.cs.se.instrumentation.al.aspectLang.TypeReference

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
		val recordList = new ArrayList<RecordType>()
		collectors.forEach[collector |
			collector.events.forEach[recordList.addUnique(it.type)]
		]
		return recordList.map['''import «(it.eContainer as Model).name».«it.name»;'''].join('\n')
	}
	
	private def static void addUnique(List<RecordType> list, RecordType type) {
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
	
	static def CharSequence createEvent(Event event) '''
		CTRLINST.newMonitoringRecord(new «event.type.name»(«event.initializations.map[it.createInitialization].join(', ')»));
	'''
	
	// TODO this prototype must be extended to support parameters and reference values
	private static def CharSequence createInitialization(Value value) {
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
			AdviceParameter: '''""'''
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