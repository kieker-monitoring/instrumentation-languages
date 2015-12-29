package de.cau.cs.se.instrumentation.al.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.al.aspectLang.Collector
import java.util.ArrayList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import java.util.List
import de.cau.cs.se.instrumentation.rl.recordLang.Model

class CommonJavaTemplates {
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
}