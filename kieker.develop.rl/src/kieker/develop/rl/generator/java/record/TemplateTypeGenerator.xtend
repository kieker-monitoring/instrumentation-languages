package kieker.develop.rl.generator.java.record

import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.Model
import java.io.File
import org.eclipse.emf.common.util.EList
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator
import java.util.Calendar

import static extension kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.validation.PropertyEvaluation.*

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
	
	override createContent(TemplateType type, String author, String version, String headerComment) {
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since
		'''
		«IF (!headerComment.equals(""))»«headerComment.replace("THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)»
		«ENDIF»package «(type.eContainer as Model).name»;
		
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