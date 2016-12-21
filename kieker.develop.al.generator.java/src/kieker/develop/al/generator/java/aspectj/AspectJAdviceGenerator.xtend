package kieker.develop.al.generator.java.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.aspectLang.Collector
import kieker.develop.al.aspectLang.InsertionPoint


import static extension kieker.develop.al.generator.java.CommonJavaTemplates.*
import static extension kieker.develop.al.generator.java.aspectj.NameResolver.*
import kieker.develop.al.aspectLang.Advice

class AspectJAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	var int index
	
	override generate(Advice input) {
		val traceAPI = true // TODO this must be triggered by advice semantics modul
		'''
			package «input.packageName»;
			
			import org.aspectj.lang.JoinPoint.EnclosingStaticPart;
			import org.aspectj.lang.ProceedingJoinPoint;
			import org.aspectj.lang.Signature;
			import org.aspectj.lang.annotation.After;
			import org.aspectj.lang.annotation.Aspect;
			import org.aspectj.lang.annotation.Before;
			import org.aspectj.lang.annotation.Pointcut;
			
			import kieker.monitoring.core.controller.IMonitoringController;
			import kieker.monitoring.core.controller.MonitoringController;
			«IF traceAPI»import kieker.monitoring.core.registry.TraceRegistry;«ENDIF»
			import kieker.monitoring.probe.aspectj.AbstractAspectJProbe;
			import kieker.monitoring.timer.ITimeSource;
			
			«input.collectors.createRecordInputs»
			«IF traceAPI»import kieker.common.record.flow.trace.TraceMetadata;«ENDIF»
			
			@Aspect
			public abstract class «input.getAdviceClassName(index)» extends AbstractAspectJProbe {
				private static final IMonitoringController CTRLINST = MonitoringController.getInstance();
				private static final ITimeSource TIMESOURCE = CTRLINST.getTimeSource();
				«IF traceAPI»private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;«ENDIF»
			
				@Pointcut
				public abstract void operation();
			
				«createAdviceMethods(input, traceAPI)»
			}
		'''
	}
	
	def setIndex(int index) {
		this.index = index
	}
	
	private def createAdviceMethods(Advice advice, boolean traceAPI) {
		InsertionPoint.values.map[insertionPoint |
			val collectors = advice.collectors.filter[it.insertionPoint == insertionPoint] 
			createAdviceMethods(advice, collectors, traceAPI, insertionPoint)
		].join
	}
		
	private def getAnnotationName(InsertionPoint insertion) {
		switch (insertion) {
			case AFTER: 'After'
			case AFTER_EXCEPTION: 'AfterThrowing' 
			case BEFORE: 'Before'
		}
	}
	
	private def getStaticMethodName(InsertionPoint insertion) {
		switch (insertion) {
			case AFTER: 'afterStaticOperation'
			case AFTER_EXCEPTION: 'afterExceptionStaticOperation' 
			case BEFORE: 'beforeStaticOperation'
		}
	}
	
	private def getDynamicMethodName(InsertionPoint insertion) {
		switch (insertion) {
			case AFTER: 'afterOperation'
			case AFTER_EXCEPTION: 'afterExceptionOperation' 
			case BEFORE: 'beforeOperation'
		}
	}
		
	private def createAdviceMethods(Advice advice, Iterable<Collector> collectors, boolean traceAPI, InsertionPoint insertion) {
		'''
			«createAdviceMethod(collectors, traceAPI, insertion.dynamicMethodName,
				"Object thisObject, ProceedingJoinPoint thisJoinPoint",
				"thisJoinPoint",
				insertion.annotationName,
				"this(thisObject)")»
			
			«createAdviceMethod(collectors, traceAPI, insertion.staticMethodName,
				"ProceedingJoinPoint thisJoinPoint",
				"thisJoinPoint",
				insertion.annotationName,
				"!this(java.lang.Object)")»
		'''
	}
	

	
	private def createAdviceMethod(Iterable<Collector> collectors, boolean traceAPI,
		String methodName, String parameters,
		String joinPointParameterName,
		String annotation, String pointcut
	) {
		if (collectors.isEmpty)
			''''''
		else
			'''
				@«annotation»("operation() && «pointcut»") 
				public void «methodName»(«parameters») {
					if (CTRLINST.isMonitoringEnabled()) {
						final Signature signature = «joinPointParameterName».getSignature();
						final String signatureString = this.signatureToLongString(signature);
						if (CTRLINST.isProbeActivated(signatureString)) {
						
							// common fields
							«if (traceAPI) createTraceId»
							
							// recording
							«collectors.map[it.events.map[it.createEvent].join('\n')].join»
						}
					}
				}
			'''
	}
			
}