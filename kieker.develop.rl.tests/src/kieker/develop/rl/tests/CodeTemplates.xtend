package kieker.develop.rl.tests

import kieker.develop.rl.typing.base.BaseTypes

class CodeTemplates {
	static def String model (String name, CharSequence types) '''
		package «name»
		
		«types»	
	'''
	
	static def String eventType(String name, boolean abstractType, String parent, String templates, CharSequence body) '''
		«if (abstractType) 'abstract '»entity «name»«if (parent !== null) ' extends ' + parent»«if (templates !== null) ' : ' + templates»«IF body !== null» {
			«body»
		}«ENDIF»
		
	'''
	
	static def String property(BaseTypes type, String name, boolean transientType, boolean increment, String value) '''
		«if (transientType) 'transient '»«if (increment) 'auto-increment'»«type.name.toLowerCase» «name»«if (value !== null) ' = '»«value»
	'''

	static def String simpleProperty(BaseTypes type, String name) {
		property(type, name, false, false, null)
	}
}
