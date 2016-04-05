package kieker.tools.al.generator.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.tools.al.aspectLang.Aspect
import kieker.tools.al.aspectLang.Collector
import kieker.tools.al.aspectLang.ContainerNode
import kieker.tools.al.aspectLang.InsertionPoint
import kieker.tools.al.aspectLang.LocationQuery
import kieker.tools.al.aspectLang.Node
import kieker.tools.al.aspectLang.Pointcut
import kieker.tools.al.mapping.CollectionType
import kieker.tools.al.mapping.Container
import kieker.tools.al.mapping.NamedType
import kieker.tools.al.mapping.Operation
import kieker.tools.al.mapping.OperationModifier
import kieker.tools.al.mapping.Parameter
import kieker.tools.al.mapping.Type
import kieker.tools.al.mapping.TypeReference
import java.util.Collection
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Document
import org.w3c.dom.Element

class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>,Document> {
	
	override generate(Collection<Aspect> input) {
		val docFactory = DocumentBuilderFactory.newInstance()
		val docBuilder = docFactory.newDocumentBuilder()
		val doc = docBuilder.newDocument()
		
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
			aspect.advices.forEach[it.advice.collectors.filter[it.insertionPoint == InsertionPoint.^BEFORE].createDataCollectorAspect(doc, aspectsElement)]
			aspect.advices.forEach[it.advice.collectors.filter[it.insertionPoint == InsertionPoint.^AFTER].createDataCollectorAspect(doc, aspectsElement)]
		}
				
		return doc
	}
	
	/**
	 * Create an aop.xml aspect for a data collector probe.
	 * 
	 * @param list list of collectors
	 * @param doc the document
	 * @param parent the parent node of the aspect
	 */
	private def void createDataCollectorAspect(Iterable<Collector> list, Document doc, Element parent) {
		val aspect = doc.createElement("aspect")
		//aspect.setAttribute("name","record types are " + list.map[it.type.name].join(', '))
		parent.appendChild(aspect)
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