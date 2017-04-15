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
package kieker.develop.al.generator.java

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.aspectLang.Collector
import kieker.develop.al.aspectLang.Event
import kieker.develop.al.aspectLang.InsertionPoint
import kieker.develop.al.aspectLang.TypeReference
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.typing.PropertyResolution.*

/**
 * Contains common Java templates.
 * 
 * TODO Class name should be improved.
 * 
 * @author Reiner Jung
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
	 * create code for trace information.
	 */
	static def createTraceId() '''
		TraceMetadata trace = TRACEREGISTRY.getTrace();
		final boolean newTrace = trace === null;
		if (newTrace) {
			trace = TRACEREGISTRY.registerTrace();
			CTRLINST.newMonitoringRecord(trace);
		}
		final long traceId = trace.getTraceId();
	'''
	
	/**
	 * Create data collection code based on event parameter assignments.
	 */
	static def CharSequence createDataCollection(Iterable<Collector> collectors) {
		val Map<CharSequence,CharSequence> data = new HashMap<CharSequence,CharSequence>()
		
		return data.values.join('\n')
	}
	
	static def CharSequence createEvent(Event event) '''
		CTRLINST.newMonitoringRecord(new «event.type.name»(«event.type.collectAllDataProperties.map[it.createValueName].join(', ')»));
	'''
	
	private static def CharSequence createValueName(Property property) {
		"collect" + property.name.toFirstUpper
	}
	


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
