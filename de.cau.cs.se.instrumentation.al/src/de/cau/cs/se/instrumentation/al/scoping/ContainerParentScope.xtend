/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.tools.al.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import kieker.tools.al.aspectLang.ContainerNode
import kieker.tools.al.aspectLang.LocationQuery
import kieker.tools.al.mapping.Container
import org.eclipse.xtext.resource.EObjectDescription
import kieker.tools.al.mapping.NamedElement

/**
 * TODO why is this named ContainerParentScope
 * 
 * @author Reiner Jung
 */
class ContainerParentScope implements IScope {
		
	Iterable<NamedElement> types
	
	ContainerNode node

	/**
	 * Constructor.
	 * 
	 * @param types list of type name
	 * @param node representing a hierarchy model node 
	 */
	new(Iterable<NamedElement> types, ContainerNode node) {
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
		var parent = (node.eContainer as LocationQuery)
		if (parent.node == node) { 
			parent = (parent.eContainer as LocationQuery)
		}
		val feature = (parent.node as ContainerNode).container
		if (feature instanceof Container) {
			val element = feature.contents.findFirst[it.name.equals(name.lastSegment)]
			if (element != null)
				return EObjectDescription.create(name, element)
			else
				return null
		} else
			return null
	}
		
	override getSingleElement(EObject object) {
		System::out.println("TODO: auto-generated method stub getSingleElement object")
		return null
	}
	
}