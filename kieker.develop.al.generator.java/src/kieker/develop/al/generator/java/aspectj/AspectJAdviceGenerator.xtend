package kieker.develop.al.generator.java.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import java.util.HashMap
import java.util.Map
import kieker.develop.al.aspectLang.AdviceParameterDeclaration
import kieker.develop.al.aspectLang.Collector
import kieker.develop.al.aspectLang.InsertionPoint
import kieker.develop.al.aspectLang.UtilizeAdvice
import kieker.develop.al.aspectLang.Value

import static extension kieker.develop.al.generator.java.CommonJavaTemplates.*
import static extension kieker.develop.al.generator.java.aspectj.NameResolver.*

class AspectJAdviceGenerator implements IGenerator<UtilizeAdvice, CharSequence> {
	
	var int index
	
	override generate(UtilizeAdvice input) {
		val traceAPI = input.advice.isTraceAPIUsed
		'''
			package «input.advice.packageName»;
			
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
			
			«input.advice.collectors.createRecordInputs»
			«IF traceAPI»import kieker.common.record.flow.trace.TraceMetadata;«ENDIF»
			
			@Aspect
			public abstract class «input.advice.getAdviceClassName(index)» extends AbstractAspectJProbe {
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
	
	private def createAdviceMethods(UtilizeAdvice advice, boolean traceAPI) {
		InsertionPoint.values.map[insertionPoint |
			val collectors = advice.advice.collectors.filter[it.insertionPoint == insertionPoint] 
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
		
	private def createAdviceMethods(UtilizeAdvice advice, Iterable<Collector> collectors, boolean traceAPI, InsertionPoint insertion) {
		val parameterAssignments = new HashMap<AdviceParameterDeclaration, Value>()
		advice.advice.parameterDeclarations.forEach[declaration, index |
			parameterAssignments.put(declaration, advice.parameterAssignments.get(index))
		]
		'''
			«createAdviceMethod(collectors, traceAPI, insertion.dynamicMethodName,
				"Object thisObject, ProceedingJoinPoint thisJoinPoint",
				parameterAssignments,
				"thisJoinPoint",
				insertion.annotationName,
				"this(thisObject)")»
			
			«createAdviceMethod(collectors, traceAPI, insertion.staticMethodName,
				"ProceedingJoinPoint thisJoinPoint",
				parameterAssignments,
				"thisJoinPoint",
				insertion.annotationName,
				"!this(java.lang.Object)")»
		'''
	}
	

	
	private def createAdviceMethod(Iterable<Collector> collectors, boolean traceAPI,
		String methodName, String parameters,
		Map<AdviceParameterDeclaration, Value> parameterAssignments,
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
							«collectors.createDataCollection(parameterAssignments)»
							
							// recording
							«collectors.map[it.events.map[it.createEvent].join('\n')].join»
						}
					}
				}
			'''
	}
			
}