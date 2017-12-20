/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.java.record

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.TemplateType
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.generator.Version
import kieker.develop.rl.recordLang.PropertyModifier

/**
 * Main generator class for template types.
 * 
 * @since 1.0
 * 
 * @author Reiner Jung
 */
class TemplateTypeGenerator extends AbstractTypeGenerator<TemplateType, CharSequence> {
	
	override accepts(ComplexType type) {
		type instanceof TemplateType
	}
	
	protected override createOutputModel(TemplateType type, Version targetVersion, String header, String author, String version) {
		'''
		«this.header»package «(type.eContainer as Model).name»;
		
		«type.inherits.createImports(type)»
		
		/**
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public interface «type.name» extends «type.inherits.createExtends» {
			«type.properties.map[property | createPropertyGetterSetter(property)].join»
		}
		'''
	}
			
	private def isInSamePackage(TemplateType left, TemplateType right) {
		return (left.eContainer as Model).name != (right.eContainer as Model).name
	}
	
	private def createImports(EList<TemplateType> parents, TemplateType type) '''«if (parents !== null && parents.size > 0) parents.filter[t | isInSamePackage(type, t)].map[createImport].join() else createDefaultImport»'''
	
	private def createDefaultImport() '''import kieker.common.record.IMonitoringRecord;
	'''
	
	private def createImport(TemplateType type) '''import «(type.eContainer as Model).name».«type»;
	'''
	
	private def createExtends(EList<TemplateType> parents) '''«if (parents !== null && parents.size > 0) parents.map[t | t.name].join(', ') else 'IMonitoringRecord'»'''
	
	
	private def createPropertyGetterSetter(Property property) '''
		«createPropertyGetter(property)»
		«if (property.modifiers.contains(PropertyModifier.CHANGEABLE)) createPropertySetter(property)»
		
	'''
	
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	private def createPropertyGetter(Property property) '''
		public «property.findType.createTypeName» «property.createGetterName»();
	'''
	
	private def createPropertySetter(Property property) '''
		public void «property.createSetterName»(«property.findType.createTypeName» «property.name»);
	'''
	

				
}
