package kieker.develop.al.generator.aspectj

import de.cau.cs.se.geco.architecture.framework.IGenerator
import java.util.Collection
import javax.xml.parsers.DocumentBuilderFactory
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.Aspect
import kieker.develop.al.aspectLang.Pointcut
import org.w3c.dom.Document
import org.w3c.dom.Element

import static extension kieker.develop.al.generator.CommonCollectionModule.*
import static extension kieker.develop.al.generator.aspectj.NameResolver.*
import static extension kieker.develop.al.generator.aspectj.PointcutQueryModule.*

class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>,Document> {
	
	val docFactory = DocumentBuilderFactory.newInstance()
	val docBuilder = docFactory.newDocumentBuilder()
	var Document doc
	
	override generate(Collection<Aspect> input) {
		doc = docBuilder.newDocument()
		val aspectjElement = doc.createElement("aspectj")
		doc.appendChild(aspectjElement)
		
		val weaverElement = doc.createElement("weaver")
		weaverElement.setAttribute("options","")
		aspectjElement.appendChild(weaverElement)
				
		val aspectsElement = doc.createElement("aspects")
		aspectjElement.appendChild(aspectsElement)
		
		val utilizationMap = input.createUtilizationMap
		
		utilizationMap.forEach[advice, utilizedAdvices |
			utilizedAdvices.forEach[utilizedAdviced, i |
				aspectsElement.appendChild(aspectsElement.createAspect(utilizedAdviced.advice, i))
			]	
		]
			
		utilizationMap.forEach[advice, utilizedAdvices |
			utilizedAdvices.forEach[utilizedAdviced, i |
				val concreteAspect = aspectsElement.createConcreteAspect(utilizedAdviced.advice, i)
				val aspect = utilizedAdviced.eContainer as  Aspect
				concreteAspect.appendChild(aspect.pointcut.createPointcut)
				aspectsElement.appendChild(concreteAspect)
			]
		]
				
		return doc
	}
	
	private def createPointcut(Pointcut pointcut) {
		val pNode = doc.createElement("pointcut")
		pNode.setAttribute("name", pointcut.name)
		pNode.setAttribute("expression", pointcut.createExpression)
		
		return pNode
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
	
}