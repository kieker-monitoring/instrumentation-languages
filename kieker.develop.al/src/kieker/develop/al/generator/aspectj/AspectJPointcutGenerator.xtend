package kieker.develop.al.generator.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import java.util.Collection
import javax.xml.parsers.DocumentBuilderFactory
import kieker.develop.al.aspectLang.Aspect
import kieker.develop.al.aspectLang.ContainerNode
import kieker.develop.al.aspectLang.LocationQuery
import kieker.develop.al.aspectLang.Node
import kieker.develop.al.aspectLang.Pointcut
import kieker.develop.al.mapping.CollectionType
import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.NamedType
import kieker.develop.al.mapping.Operation
import kieker.develop.al.mapping.OperationModifier
import kieker.develop.al.mapping.Parameter
import kieker.develop.al.mapping.Type
import kieker.develop.al.mapping.TypeReference
import org.w3c.dom.Document
import org.w3c.dom.Element

import static extension kieker.develop.al.generator.aspectj.NameResolver.*
import kieker.develop.al.aspectLang.Advice

class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>,Document> {
	
	val docFactory = DocumentBuilderFactory.newInstance()
	val docBuilder = docFactory.newDocumentBuilder()
	val doc = docBuilder.newDocument()
	
	override generate(Collection<Aspect> input) {
		val aspectjElement = doc.createElement("aspectj")
		doc.appendChild(aspectjElement)
		
		val weaverElement = doc.createElement("weaver")
		weaverElement.setAttribute("options","")
		aspectjElement.appendChild(weaverElement)
		
		for (Aspect aspect : input) {
			val includeElement = doc.createElement("include")
			// includeElement.setAttribute("within", aspect.query.computeAspectJQuery)
			weaverElement.appendChild(includeElement)
		} 
		
		val aspectsElement = doc.createElement("aspects")
		aspectjElement.appendChild(aspectsElement)
		for (Aspect aspect : input) {
			aspect.advices.forEach[advice,i | aspectsElement.appendChild(aspectsElement.createAspect(advice.advice, i))]
		}
		for (Aspect aspect : input) {
			aspect.advices.forEach[advice,i | 
				val concreteAspect = aspectsElement.createConcreteAspect(advice.advice, i)
				concreteAspect.appendChild(aspect.pointcut.createPointcut)
				aspectsElement.appendChild(concreteAspect)
			]
		}
				
		return doc
	}
	
	private def createPointcut(Pointcut pointcut) {
		val pNode = doc.createElement("pointcut")
		pNode.setAttribute("name", pointcut.name)
		pNode.setAttribute("expression", pointcut.createExpression)
		
		return pNode
	}
	
	private def createExpression(Pointcut pointcut) {
		// flatten pointcut id patterns
		
		
		val result = '''«pointcut.model»'''
		
		return result
	}
	
	private def createAspect(Element parent, Advice advice, int i) {
		val aspect = doc.createElement("aspect")
		aspect.setAttribute("name", advice.getAdviceClassName(i).toString)
		return aspect
	}
	
	private def createConcreteAspect(Element parent, Advice advice, int i) {
		val aspect = doc.createElement("concrete-aspect")
		aspect.setAttribute("name", advice.getConcreteAdviceClassName(i).toString)
		aspect.setAttribute("extends",  advice.getAdviceClassName(i).toString)
										
		return aspect
	}
	

	
	/**
	 * Compute the query for model nodes.
	 */
	private def String computeAspectJQuery(Pointcut pointcut) '''«pointcut.location.computeLocation» «pointcut.operation.modifier.computeModifier» «if (pointcut.operation != null) pointcut.operation.operationReference.computeMethod else '*'»'''
	
	private def CharSequence computeLocation(LocationQuery query) '''«query.node.computeNode»«if (query.specialization != null) '.' + query.specialization.computeLocation»'''
	
	private def dispatch computeNode(ContainerNode node) '''«node.container.name»'''
	private def dispatch computeNode(Node node) '''#''' // illegal call
	
	// TODO this should produce the correct mapping of modifiers
	private def CharSequence computeModifier(OperationModifier modifier) '''«if (modifier != null) modifier.name else '*'»'''
	
	private def CharSequence computeMethod(Operation operation) '''«operation.name» («operation.parameters.map[it.computeParameter].join(', ')»)'''
	
	// TODO this should produce the correct mapping of types and modifiers
	private def CharSequence computeParameter(Parameter parameter) '''«parameter.type.computeType» «parameter.name»'''
	
	private def CharSequence computeType(TypeReference reference) '''«reference.type.computeTypeName»'''
	
	private def CharSequence computeTypeName(Type type) {
		switch(type) {
			NamedType: type.name
			Container: type.name
			CollectionType: type.elementType.computeTypeName + "[]" 	
		}
	}
}