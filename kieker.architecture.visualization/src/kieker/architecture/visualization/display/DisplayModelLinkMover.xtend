/***************************************************************************
 * Copyright 2022 Kieker Project (http://kieker-monitoring.net)
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
package kieker.architecture.visualization.display

import java.util.Set
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.ProvidedPort
import java.util.HashSet
import kieker.architecture.visualization.display.model.RequiredPort

/**
 * While the DisplayModelLinker links ports directly, the route to the port might
 * need a redirection over the parent component. The link mover create correct
 * ports in the parent component and establishes the necessary links.
 * 
 * @author Reiner Jung
 * @since 1.3.0
 */
class DisplayModelLinkMover {
	
	val Set<Component> components
	
	new(Set<Component> components) {
		this.components = components
	}
	
	def moveUp() {
		components.forEach[it.moveLinksUp]
	}
	
	private def void moveLinksUp(Component component) {
		component.children.forEach[child |
			child.moveLinksUp
			child.moveProvidedLinksUp
			child.moveRequiredLinksUp
		]
	}
	
	private def moveProvidedLinksUp(Component component) {
		component.providedPorts.values().filter[
			it.requiringPorts.exists[it.component.parent !== component.parent]
		].forEach[providedPort |
			val parentProvidedPort = createOrGetPrarentProvidedPort(component.parent, providedPort)
			
			val movingRequiredPorts = new HashSet<RequiredPort>
			providedPort.requiringPorts.filter[
				it.component.parent !== component.parent
			].forEach[
				it.providedPort = parentProvidedPort
				movingRequiredPorts +=  it
			]
			movingRequiredPorts.forEach[
				parentProvidedPort.requiringPorts.add(it)
				providedPort.requiringPorts.remove(it)
			]
		]
	}
	
	private def createOrGetPrarentProvidedPort(Component parentComponent, ProvidedPort providedPort) {
		val parentProvidedPort = parentComponent.providedPorts.get(providedPort.label)
		if (parentProvidedPort === null) {
			// move level up
			val derivedProvidedPort = new ProvidedPort(providedPort, parentComponent, providedPort.portType)
			parentComponent.providedPorts.put(derivedProvidedPort.label, derivedProvidedPort)
			
			return derivedProvidedPort
		} else {
			throw new InternalError("There cannot be two ports with the same label")
		}
	}
	
	private def moveRequiredLinksUp(Component component) {
		component.requiredPorts.values().filter[
			it.providedPort instanceof ProvidedPort && it.providedPort.component.parent !== component.parent
		].forEach[requiredPort |
			// move level up
			val existingParentRequiredPort = component.parent.requiredPorts.get(requiredPort.label)
			val providedPort = requiredPort.providedPort
			if (existingParentRequiredPort === null) {
				val derivedRequiredPort = new RequiredPort(requiredPort, component.parent, requiredPort.portType)
				component.parent.requiredPorts.put(derivedRequiredPort.label, derivedRequiredPort)
				derivedRequiredPort.providedPort = providedPort
				if (providedPort instanceof ProvidedPort) {
					providedPort.requiringPorts.remove(requiredPort)
					providedPort.requiringPorts.add(derivedRequiredPort)
				}
				requiredPort.providedPort = derivedRequiredPort
			} else { // the parent already has such a required port
				if (providedPort instanceof ProvidedPort) {
					providedPort.requiringPorts.remove(requiredPort)
					providedPort.requiringPorts.add(existingParentRequiredPort)
					existingParentRequiredPort.derivedFromPorts.add(requiredPort)
				}
				requiredPort.providedPort = existingParentRequiredPort
			}				
		]
	}
	
}