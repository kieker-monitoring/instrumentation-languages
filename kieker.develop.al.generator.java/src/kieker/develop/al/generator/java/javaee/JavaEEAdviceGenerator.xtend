/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.al.generator.java.javaee

import kieker.develop.geco.IGenerator

import kieker.develop.al.aspectLang.Advice

import static extension kieker.develop.al.generator.java.CommonJavaTemplates.*
import kieker.develop.al.aspectLang.InsertionPoint

/**
 * JavaEE advice generator.
 * 
 * @author Reiner Jung
 */
class JavaEEAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	override generate(Advice input) {
		val traceAPI = true // TODO must be controlled by the semantics modul
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