package de.cau.cs.se.instrumentation.rl.generator.java

import de.cau.cs.se.instrumentation.rl.generator.AbstractPartialRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation

class PartialRecordTypeGenerator extends AbstractPartialRecordTypeGenerator {
	
	override createContent(PartialRecordType type, String author, String version) {
		'''
		/***************************************************************************
		 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
		
		/**
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public interface «type.name»«if (type.parents!=null && type.parents.size>0) type.parents.createExtends» {
			«type.properties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}
	
	def createExtends(EList<PartialRecordType> parents) ''' extends «parents.map[t | t.name].join(', ')»'''
	
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
	override createTypeName(Classifier classifier) {
		switch (classifier.class_.name) {
			case 'string' : 'String'
			default : classifier.class_.name
		}	
	}
		
	/**
	 * Compute the directory name for a record type.
	 */
	override directoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''

	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name».java'''

	
	override getLanguageType() '''java'''
		
}