package kieker.architecture.visualization

import java.util.Set
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.ProvidedPort
import java.util.HashSet
import kieker.architecture.visualization.display.model.RequiredPort

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