package kieker.develop.al.generator.aspectj

import kieker.develop.al.aspectLang.Advice

class NameResolver {
	static def getAdviceClassName(Advice advice, int index) '''Abstract«advice.name»Advice«index»'''
	
	static def getConcreteAdviceClassName(Advice advice, int index) '''«advice.name»Advice«index»'''
}