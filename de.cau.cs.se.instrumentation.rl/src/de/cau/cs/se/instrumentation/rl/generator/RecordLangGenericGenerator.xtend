package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property


class RecordLangGenericGenerator {
		/**
	 * Compile recursively a list of all properties.
	 * 
	 * @param
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties in a record
	 */
	def EList<Property> compileProperties(RecordType type) {
		val result = new org.eclipse.emf.common.util.BasicEList<Property>();
		if (type.parent!=null)
			result.addAll(type.parent.compileProperties)
		result.addAll(type.properties)
		return result
	}
}