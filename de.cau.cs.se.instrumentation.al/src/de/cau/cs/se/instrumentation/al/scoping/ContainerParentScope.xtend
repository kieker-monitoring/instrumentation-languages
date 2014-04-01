package de.cau.cs.se.instrumentation.al.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.instrumantation.model.structure.Container
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.EObjectDescription
import de.cau.cs.se.instrumantation.model.structure.NamedElement
import de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery

class ContainerParentScope implements IScope {
		
	Iterable<NamedElement> types
	
	ContainerNode node

	
	new(Iterable<NamedElement> elements, ContainerNode node) {
		this.types = types
		this.node = node
	}
	
	override getAllElements() {
		System::out.println("TODO: auto-generated method stub getAllElements")
		return null
	}
	
	override getElements(QualifiedName name) {
		System::out.println("TODO: auto-generated method stub getElements name")
		return null
	}
	
	override getElements(EObject object) {
		System::out.println("TODO: auto-generated method stub getElements object")
		return null
	}
	
	override getSingleElement(QualifiedName name) {
		System::out.println("TODO: auto-generated method stub getSingleElement name " + name)
		var parent = (node.eContainer as LocationQuery)
		var Container container = null
		if (parent.node == node) { 
			parent = (parent.eContainer as LocationQuery)
			container = (parent.node as ContainerNode).container
		} else {
			container = (parent.node as ContainerNode).container
		}
		val element = container.contents.findFirst[it.name.equals(name.lastSegment)]
		if (element != null)
			return EObjectDescription.create(name, element)
		else
			return null
	}
		
	override getSingleElement(EObject object) {
		System::out.println("TODO: auto-generated method stub getSingleElement object")
		return null
	}
	
}