package kieker.develop.rl.generator.java.record

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.generator.TypeInputModel
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.TemplateType
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.Type

class TemplateTypeGenerator extends AbstractTypeGenerator<TemplateType> {
	
	override accepts(Type type) {
		type instanceof TemplateType
	}
	
	override generate(TypeInputModel<TemplateType> input) {
		val definedAuthor = if (input.type.author == null) input.author else input.type.author
		val definedVersion = if (input.type.since == null) input.version else input.type.since
		'''
		«input.header»package «(input.type.eContainer as Model).name»;
		
		«input.type.inherits.createImports(input.type)»
		
		/**
		 * @author «definedAuthor»
		 * 
		 * @since «definedVersion»
		 */
		public interface «input.type.name» extends «input.type.inherits.createExtends» {
			«input.type.properties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}
	
	private def isInSamePackage(TemplateType left, TemplateType right) {
		return (left.eContainer as Model).name != (right.eContainer as Model).name
	}
	
	private def createImports(EList<TemplateType> parents, TemplateType type) '''«if (parents!=null && parents.size>0) parents.filter[t | isInSamePackage(type, t)].map[createImport].join() else createDefaultImport»'''
	
	private def createDefaultImport() '''import kieker.common.record.IMonitoringRecord;
	'''
	
	private def createImport(TemplateType type) '''import «(type.eContainer as Model).name».«type»;
	'''
	
	private def createExtends(EList<TemplateType> parents) '''«if (parents!=null && parents.size>0) parents.map[t | t.name].join(', ') else 'IMonitoringRecord'»'''
	
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	private def createPropertyGetter(Property property) '''
		public «property.findType.type.createPrimitiveTypeName» «property.createGetterName»() ;
		
	'''
	

				
}