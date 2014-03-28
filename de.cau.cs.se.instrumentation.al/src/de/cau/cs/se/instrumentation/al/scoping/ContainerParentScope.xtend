package de.cau.cs.se.instrumentation.al.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import de.cau.cs.se.instrumentation.al.modelhandling.ForeignModelTypeProviderFactory
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode

class ContainerParentScope implements IScope {
	
	new(ForeignModelTypeProviderFactory factory, ContainerNode node) {
					
	}
	
	override getAllElements() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getElements(QualifiedName name) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getElements(EObject object) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getSingleElement(QualifiedName name) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getSingleElement(EObject object) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}