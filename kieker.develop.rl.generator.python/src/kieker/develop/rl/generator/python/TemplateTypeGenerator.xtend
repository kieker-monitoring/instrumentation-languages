package kieker.develop.rl.generator.python

import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.generator.Version
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.AbstractTypeGenerator
import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.generator.InternalErrorException

class TemplateTypeGenerator extends AbstractTypeGenerator<TemplateType, CharSequence>{
		override accepts(ComplexType type) {
		type instanceof TemplateType
	}
	
	protected override createOutputModel(TemplateType type, Version targetVersion, String header, String author, String version) {
		'''
		class «type.name»«IF type.inherits.getParents.length!=0» («type.inherits.getParents»):«ELSE»:«ENDIF»
			def init (self):
				self.«type.properties.map[p|p.name].join("\n")»
			
			«type.properties.map[p|p.createSetter()].join("\n")»
		'''
	}
	
	def Object createSetter(Property property){
		'''
		@«property.name».setter
		def «property.name»(self, value):
			if value.isinstance(«property.type.type.getPythonTypeName»):
				self.«property.name» = value 
			else:
				raise Exception(f"Property «property.name» has type «property.type.type.getPythonTypeName» but
						        a parameter with  type {value.type} was specified")
		'''
	}
	

	
 def getPythonTypeName(Type type) throws InternalErrorException {
		switch (type) {
			BaseType: switch (BaseTypes.getTypeEnum(type)) {
				case INT: 'int'
				case LONG: 'long'
				case SHORT: 'int'
				case DOUBLE: 'double'
				case FLOAT: 'float'
				case CHAR: 'string'
				case BYTE: 'string'
				case STRING: 'string'
				case BOOLEAN: 'bool'
			}
			EnumerationType: type.name
			ComplexType: type.name
		}
	}
	
	
	
	
	
	def getGetParents(EList<TemplateType> parents){
		'''
		« if (parents !== null && parents.size > 0) parents.map[p|p.name].join(",")»
		'''
	}
	
}