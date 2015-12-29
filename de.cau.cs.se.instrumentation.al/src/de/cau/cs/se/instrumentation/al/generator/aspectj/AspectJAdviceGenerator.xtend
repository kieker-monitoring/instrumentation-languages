package de.cau.cs.se.instrumentation.al.generator.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.instrumentation.al.aspectLang.Advice
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.al.aspectLang.Collector
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import java.util.ArrayList
import java.util.List
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.al.aspectLang.Value
import de.cau.cs.se.instrumentation.al.aspectLang.Literal
import de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty
import de.cau.cs.se.instrumentation.al.aspectLang.AdviceParameter

class AspectJAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	override generate(Advice input) '''
		package kieker.monitoring.probe.aspectj.flow.operationCall;
		
		import org.aspectj.lang.JoinPoint.EnclosingStaticPart;
		import org.aspectj.lang.ProceedingJoinPoint;
		import org.aspectj.lang.Signature;
		import org.aspectj.lang.annotation.Around;
		import org.aspectj.lang.annotation.Aspect;
		import org.aspectj.lang.annotation.Pointcut;
		
		import kieker.monitoring.core.controller.IMonitoringController;
		import kieker.monitoring.core.controller.MonitoringController;
		import kieker.monitoring.core.registry.TraceRegistry;
		import kieker.monitoring.probe.aspectj.AbstractAspectJProbe;
		import kieker.monitoring.timer.ITimeSource;
		
		«input.collectors.createRecordInputs»

		@Aspect
		public abstract class «input.name» extends AbstractAspectJProbe {
			private static final IMonitoringController CTRLINST = MonitoringController.getInstance();
			private static final ITimeSource TIME = CTRLINST.getTimeSource();
			«IF input.isTraceAPIUsed» private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;«ENDIF»

			«createAdviceMethods(input)»
		}
	'''
	
	private def boolean isTraceAPIUsed(Advice advice) {
		advice.collectors.exists[it.events.exists[it.initializations.exists[isTraceAPIUsed]]]
	}
	
	private def boolean isTraceAPIUsed(Value initialization) {
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
	
	private def createRecordInputs(EList<Collector> collectors) {
		val recordList = new ArrayList<RecordType>()
		collectors.forEach[collector |
			collector.events.forEach[recordList.addUnique(it.type)]
		]
		return recordList.map[(it.eContainer as Model).name + '.' + it.name].join(';\n')
	}
	
	private def void addUnique(List<RecordType> list, RecordType type) {
		if (!list.contains(type))
			list.add(type)
	}
	
	private def createAdviceMethods(Advice advice) {
		createAdviceMethod("REPPLACE-ME","thisJoinPoint")
	}
	
	private def createAdviceMethod(String methodName, String joinPointParameterName) '''
		public void «methodName» 
		«this.createMonitoringActive»
		«this.createMonitoringProbeActive(joinPointParameterName)»
		// common fields
		«this.createTraceId»
	'''
	
	private def createTraceId() '''
		TraceMetadata trace = TRACEREGISTRY.getTrace();
		final boolean newTrace = trace == null;
		if (newTrace) {
			trace = TRACEREGISTRY.registerTrace();
			CTRLINST.newMonitoringRecord(trace);
		}
		final long traceId = trace.getTraceId();
	'''
	
	/**
	 * It is unclear if this is necessary in this form for advices which are not around.
	 * Central question how can we remember the information for the entry to terminate the trace.
	 */
	private def createEndAdvice() '''
		final Object retval;
		try {
			retval = thisJoinPoint.proceed();
		} finally {
			if (newTrace) { // close the trace
				TRACEREGISTRY.unregisterTrace();
			}
		}
		return retval;
	'''
	
	private def createMonitoringActive() '''
		if (!CTRLINST.isMonitoringEnabled()) {
			return thisJoinPoint.proceed();
		}
	'''
	
	/**
	 * Create a test to check if the probe is active.
	 * 
	 * @param source the source of the signature, something like thisJoinPoint
	 */
	private def createMonitoringProbeActive(String source) '''
		final String signature = this.signatureToLongString(«source».getSignature());
		if (!CTRLINST.isProbeActivated(signature)) {
			return «source».proceed();
		}
	'''
}