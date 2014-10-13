package de.cau.cs.se.instrumentation.rl.generator.java.record

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation
import de.cau.cs.se.instrumentation.rl.generator.AbstractTemplateTypeGenerator
import java.util.Calendar

class TemplateTypeGenerator extends AbstractTemplateTypeGenerator {

	/**
	 * Return the unique id.
	 */
	override getId() '''java'''
	
	/**
	 * Define language/generation type, which is also used to define the outlet.
	 */
	override getOutletType() '''java'''
	
	/**
	 * Compute the directory name for a record type.
	 */
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
		
	/**
	 * Compute file name.
	 */
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».java'''
	
	override createContent(TemplateType type, String author, String version) {
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since
		'''
		/***************************************************************************
		 * Copyright «Calendar.getInstance().get(Calendar.YEAR)» Kieker Project (http://kieker-monitoring.net)
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
		
		package «(type.eContainer as Model).name»;
		
		«type.parents.createImports(type)»
		
		/**
		 * @author «definedAuthor»
		 * 
		 * @since «definedVersion»
		 */
		public interface «type.name» extends «type.parents.createExtends» {
			«type.properties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}
	
	def isInSamePackage(TemplateType left, TemplateType right) {
		return (left.eContainer as Model).name != (right.eContainer as Model).name
	}
	
	def createImports(EList<TemplateType> parents, TemplateType type) '''«if (parents!=null && parents.size>0) parents.filter[t | isInSamePackage(type, t)].map[createImport].join() else createDefaultImport»'''
	
	def createDefaultImport() '''import kieker.common.record.IMonitoringRecord;
	'''
	
	def createImport(TemplateType type) '''import «(type.eContainer as Model).name».«type»;
	'''
	
	def createExtends(EList<TemplateType> parents) '''«if (parents!=null && parents.size>0) parents.map[t | t.name].join(', ') else 'IMonitoringRecord'»'''
	
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	def createPropertyGetter(Property property) '''
	public «PropertyEvaluation::findType(property).createTypeName» «property.createGetterName»() ;
		
	'''
	
	/**
	 * Returns the correct name for a getter following Java conventions.
	 * 
	 * @param property
	 * 		a property of a record type
	 * 
	 * @returns the name of the getter of the property
	 */
	def CharSequence createGetterName(Property property) {
		if (PropertyEvaluation::findType(property).class.name.equals('boolean')) 
			'''is«property.name.toFirstUpper»'''
		else
			'''get«property.name.toFirstUpper»'''
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	def createTypeName(Classifier classifier) {
		switch (classifier.class_.name) {
			case 'string' : 'String'
			default : classifier.class_.name
		}	
	}
			
}