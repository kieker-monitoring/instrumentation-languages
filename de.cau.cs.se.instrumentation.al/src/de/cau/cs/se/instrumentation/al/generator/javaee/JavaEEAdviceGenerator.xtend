package de.cau.cs.se.instrumentation.al.generator.javaee

import de.cau.cs.se.geco.architecture.framework.IGenerator

import de.cau.cs.se.instrumentation.al.aspectLang.Advice

import static extension de.cau.cs.se.instrumentation.al.generator.CommonJavaTemplates.*
import de.cau.cs.se.instrumentation.al.aspectLang.InsertionPoint

class JavaEEAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	override generate(Advice input) {
		val traceAPI = input.isTraceAPIUsed
		'''
			package «input.packageName»;

			import javax.interceptor.AroundInvoke;
			import javax.interceptor.Interceptor;
			import javax.interceptor.InvocationContext;
			
			import kieker.monitoring.core.controller.IMonitoringController;
			import kieker.monitoring.core.controller.MonitoringController;
			import kieker.monitoring.core.registry.TraceRegistry;
			import kieker.monitoring.timer.ITimeSource;
			
			«input.collectors.createRecordInputs»
			«IF traceAPI»import kieker.common.record.flow.trace.TraceMetadata;«ENDIF»
			
			/**
			 *
			 */
			@Interceptor
			public class «input.name»Interceptor {				
				/** Kieker monitoring controller. */
				private static final IMonitoringController CTRLINST = MonitoringController.getInstance();
				/** Kieker time source. */
				private static final ITimeSource TIMESOURCE =  CTRLINST.getTimeSource();
				«IF traceAPI»/** Kieker trace registry. */
				private static final TraceRegistry TRACEREGISTRY = TraceRegistry.INSTANCE;«ENDIF»
				
				/**
				 * Initialize trace interceptor.
				 */
				public «input.name»Interceptor() {
					// nothing to be done here
				}
				
				/**
				 * Around advice configuration.
				 *
				 * @param context
				 *            the invocation context of a bean call.
				 * @return the return value of the next method in the chain
				 * @throws Throwable
				 */
				@AroundInvoke
				public Object interceptMethodCall(final InvocationContext context) {
					if (CTRLINST.isMonitoringEnabled()) {
						final String signature = context.getMethod().toString();
						
						if (CTRLINST.isProbeActivated(signature)) {
							// common fields
							«if (traceAPI) createTraceId»
														
							// before 
							«input.createEventRecording(InsertionPoint.BEFORE)»
							
							try {
								final Object retval = context.proceed();
								
								«input.createEventRecording(InsertionPoint.AFTER)»
								
							} catch (final Throwable th) { // NOPMD NOCS (catch throw might ok here)
							
								«input.createEventRecording(InsertionPoint.AFTER_EXCEPTION)»
							
								throw th;
							} finally {
								«IF traceAPI»if (newTrace) { // close the trace
									TRACEREGISTRY.unregisterTrace();
								}«ENDIF»
							}
						}
					}
				}
			}
		'''
	}
		
}