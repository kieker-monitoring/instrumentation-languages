package kieker.develop.al.generator.java.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider
import java.util.Collection
import javax.xml.parsers.DocumentBuilderFactory
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.intermediate.AbstractJoinpoint
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.al.intermediate.ModelJoinpoint
import org.eclipse.emf.ecore.EObject
import org.w3c.dom.Document
import org.w3c.dom.Node
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider

// TODO process this comment			
//	/**
//	 * Create AspectJ configuration (aop.xml) for a given collection of aspects.
//	 * 
//	 * @param aspects collection of aspects for AspectJ
//	 * @param access file system access
//	 */
//	private def createAspectJConfiguration(Collection<Aspect> aspects, IFileSystemAccess2 access) {
//		val aspectGenerator = new AspectJPointcutGenerator()
//		storeXMLModel('aop.xml', access, aspectGenerator.generate(aspects))
//				
//		val adviceGenerator = new AspectJAdviceGenerator()
//		val utilizationAdviceMap = aspects.createUtilizationMap()
//		
//		utilizationAdviceMap.forEach[advice, utilizedAdvices |
//			utilizedAdvices.forEach[utilizedAdviced, i|
//				adviceGenerator.setIndex(i)
//				access.generateFile(utilizedAdviced.aspectJAbstractAdviceName(i), 
//					adviceGenerator.generate(utilizedAdviced)
//				)
//			]
//		]
//	}
		
//	private def String aspectJAbstractAdviceName(UtilizeAdvice advice, int i) '''aspectj«File.separator»«advice.advice.packagePathName»Abstract«advice.advice.name»Advice«i».java'''
	

class AspectJConfigurationGenerator implements IGenerator<IntermediateModel, Document> {
	
	val docFactory = DocumentBuilderFactory.newInstance()
	val docBuilder = docFactory.newDocumentBuilder()
	var Document doc
	
	private var ITraceModelProvider<EObject, String> traceModelProvider
	
	public def setTraceModelProvider(ITraceModelProvider<EObject, String> traceModelProvider) {
		this.traceModelProvider = traceModelProvider
	}  
	
	override generate(IntermediateModel input) {
		doc = docBuilder.newDocument()
		val aspectjElement = doc.createElement("aspectj")
		doc.appendChild(aspectjElement)
		
		val weaverElement = doc.createElement("weaver")
		weaverElement.setAttribute("options","")
		aspectjElement.appendChild(weaverElement)
				
		val aspectsElement = doc.createElement("aspects")
		aspectjElement.appendChild(aspectsElement)
		
		// TODO this could produce multiple identical aspect/advice imports.
		input.aspects.forEach[it.advices.forEach[aspectsElement.appendChild(it.createAspect)]]
		
		/** setup pointcuts/aspect */
		input.aspects.forEach[aspect | aspect.advices.forEach[aspectsElement.appendChild(it.createConcretAspect(aspect.joinpoints))]]
		

		return doc
	}
	
	private def Node createConcretAspect(Advice advice, Collection<AbstractJoinpoint> joinpoints) {
		val aspect = doc.createElement("concrete-aspect")
		
		aspect.setAttribute("name", "Concrete" + advice.name.toFirstUpper) // TODO must be a fully qualified name
		aspect.setAttribute("extends",  advice.name) // TODO this must be a fully qualified name
		
		joinpoints.forEach[joinpoint |
			aspect.appendChild(joinpoint.createPointcut())
		]
		
		return aspect
	}
	
	private def createPointcut(AbstractJoinpoint joinpoint) {
		val pNode = doc.createElement("pointcut")
		pNode.setAttribute("name", joinpoint.name)
		pNode.setAttribute("expression", joinpoint.createExpression)
		
		return pNode
	}
	
	private def String createExpression(AbstractJoinpoint joinpoint) {
		switch(joinpoint) {
			ModelJoinpoint: traceModelProvider.lookup(joinpoint.referencedInstance).get(0)  // TODO here the tracemodel should be used to map the references
			default: 'XXX'  // TODO this is not a valid response  
		}
	}
	
	/**
	 * Create an aspect for an existing probe (advice).
	 * 
	 * @param 
	 */
	private def createAspect(Advice advice) {
		val aspect = doc.createElement("aspect")
		aspect.setAttribute("name", advice.name) // TODO requires fully qualified name
		return aspect
	}
	
}