package org.oceandsl.kieker.architecture.viz

import java.util.Collection
import analysismodel.assembly.AssemblyComponent
import analysismodel.execution.AggregatedInvocation
import java.util.HashSet
import org.oceandsl.kieker.architecture.viz.display.model.Component
import java.util.Set
import org.oceandsl.kieker.architecture.viz.display.model.ProvidedPort
import analysismodel.assembly.AssemblyProvidedInterface
import org.oceandsl.kieker.architecture.viz.display.model.RequiredPort
import analysismodel.assembly.AssemblyRequiredInterface
import analysismodel.assembly.AssemblyOperation
import analysismodel.type.OperationType
import java.util.HashMap
import java.util.Map

class DisplayModelBuilder {
	
	val Map<AssemblyOperation, ProvidedPort> operationProvidedPort = new HashMap
	
	val Map<AssemblyProvidedInterface, ProvidedPort> providedPortInterfaceMap = new HashMap
	
	new() {
		
	}
		
	def create(Collection<AssemblyComponent> assemblyComponents, Collection<AggregatedInvocation> invocations) {
		val Set<Component> components = new HashSet

		val containedComponents = computeContainedComponents(assemblyComponents)
		
		assemblyComponents.filter[!containedComponents.contains(it)].forEach[component |
			components += createComponent(component, invocations, null)
		]
				
		components.forEach[it.linkPort]
		
		// components.forEach[System.err.println(it.print(""))]
		
		components.forEach[it.moveLinksUp]
		
		return components
	}
	
	private def void moveLinksUp(Component parent) {
		parent.children.forEach[child |
			child.children?.forEach[it.moveLinksUp]			
			child.providedPorts.filter[it.requiringPorts.exists[it.component.parent !== parent]].
				forEach[providedPort |
					// move level up
					val derivedProvidedPort = new ProvidedPort(providedPort.label, providedPort, parent)
					parent.providedPorts += derivedProvidedPort
										
					val removingRequiredPorts = new HashSet<RequiredPort>
					providedPort.requiringPorts.filter[it.component.parent !== parent].forEach[
						it.providedPort = derivedProvidedPort
						removingRequiredPorts +=  it
					]
					removingRequiredPorts.forEach[providedPort.requiringPorts.remove(it)]
			]
			
			child.requiredPorts.filter[it.providedPort instanceof ProvidedPort && it.providedPort.component.parent !== parent].
			forEach[requiredPort |
				// move level up
				val existingParentRequiredPort = parent.requiredPorts.findFirst[it.label.equals(requiredPort.label)]
				val providedPort = requiredPort.providedPort
				if (existingParentRequiredPort === null) {
					val derivedRequiredPort = new RequiredPort(requiredPort.label, requiredPort, parent)
					parent.requiredPorts += derivedRequiredPort
					derivedRequiredPort.providedPort = providedPort
					if (providedPort instanceof ProvidedPort) {
						providedPort.requiringPorts.remove(requiredPort)
						providedPort.requiringPorts.add(derivedRequiredPort)
					}
					requiredPort.providedPort = derivedRequiredPort
				} else {
					if (providedPort instanceof ProvidedPort) {
						providedPort.requiringPorts.remove(requiredPort)
						providedPort.requiringPorts.add(existingParentRequiredPort)
					}
					requiredPort.providedPort = existingParentRequiredPort
					
				}				
			]
		]
	}
		
	private def computeContainedComponents(Collection<AssemblyComponent> components) {
		val containedComponents = new HashSet<AssemblyComponent>()
		components.filter[it.containedComponents.size() > 0].forEach [
			containedComponents.addAll(it.containedComponents)
		]
		return containedComponents
	}
	
	private def Component createComponent(AssemblyComponent assemblyComponent, Collection<AggregatedInvocation> invocations, Component parent) {
		val component = new Component(assemblyComponent.componentType.signature, assemblyComponent, parent)
		
		assemblyComponent.containedComponents.forEach[component.children += it.createComponent(invocations, component)]
		val Set<AssemblyOperation> processedProvidedOperations = component.createProvidedInterface(assemblyComponent)
		val Set<AssemblyOperation> processedRequiredCallees = component.createRequiredInterface(assemblyComponent)
		
		component.createProvidedOperations(assemblyComponent, invocations, processedProvidedOperations)
		component.createRequiredOperations(assemblyComponent, invocations, processedRequiredCallees)
						
		return component
	}
	
	/**
	 * Create provided ports based on externally access operations.
	 */
	private def void createProvidedOperations(Component component, AssemblyComponent assemblyComponent, 
		Collection<AggregatedInvocation> invocations, Set<AssemblyOperation> processedProvidedOperations
	) {
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]].
			filter[operation | invocations.exists[it.target.assemblyOperation === operation && 
				it.source.assemblyOperation.assemblyComponent !== assemblyComponent
			]].
			forEach[
				component.providedPorts += new ProvidedPort(it.operationType.signature, it, component)
		]
	}
	
	/**
	 * Create provided ports based on provided interfaces present in a assembly component.
	 */
	private def createProvidedInterface(Component component, AssemblyComponent assemblyComponent) {
		val Set<AssemblyOperation> processedProvidedOperations = new HashSet
		assemblyComponent.providedInterfaces.values.forEach[
			val port = it.createProvidedPort(component)
			providedPortInterfaceMap.put(it, port)
			component.providedPorts += port
			it.providedInterfaceType.providedOperationTypes.values.forEach[
				val operation = assemblyComponent.findAssemblyOperation(it)
				processedProvidedOperations.add(operation)
				if (operation !== null) {
					operationProvidedPort.put(operation, port)
				} else {
					System.err.println("ERROR " + it.signature + " not found")
				}
			]
		]
		return processedProvidedOperations
	}
	
	
	/**
	 * Create required operation interfaces based on remaining external calls.
	 */	
	private def createRequiredOperations(Component component, AssemblyComponent assemblyComponent, 
		Collection<AggregatedInvocation> invocations, Set<AssemblyOperation> processedRequiredCallees
	) {
		invocations.filter[it.source.assemblyOperation.assemblyComponent === assemblyComponent &&
			assemblyComponent !== it.target.assemblyOperation.assemblyComponent &&
			!processedRequiredCallees.exists[callee | callee === it.target.assemblyOperation]
		].forEach[invocation |
			component.requiredPorts += new RequiredPort(invocation.target.assemblyOperation.operationType.signature, invocation, component)			
		]
	}
	
	/**
	 * Create required interface based on existing required interfaces in the model.
	 * Collect all operations already covered by the required interface
	 */
	private def createRequiredInterface(Component component, AssemblyComponent assemblyComponent) {
		val Set<AssemblyOperation> processedRequiredCallees = new HashSet
		assemblyComponent.requiredInterfaces.forEach[
			val port = it.createRequiredPort(component)
			val calleeComponent = it.requires.eContainer.eContainer as AssemblyComponent
			component.requiredPorts += port
			it.requiredInterfaceType.requires.providedOperationTypes.values.forEach[
				
				processedRequiredCallees.add(calleeComponent.findAssemblyOperation(it))
			]
		]
		return processedRequiredCallees
	}
	
	private def AssemblyOperation findAssemblyOperation(AssemblyComponent component, OperationType type) {
		component.operations.get(type.signature)
	}

	
	private def ProvidedPort createProvidedPort(AssemblyProvidedInterface providedInterface, Component component) {
		val providedPort = new ProvidedPort(providedInterface.providedInterfaceType.signature, providedInterface, component)
		
		return providedPort
	}
	
	private def RequiredPort createRequiredPort(AssemblyRequiredInterface requiredInterface, Component component) {
		val requiredPort = new RequiredPort(requiredInterface.requiredInterfaceType.requires.signature, requiredInterface, component)
		return requiredPort
	}
	
	private def void linkPort(Component component) {
		component.requiredPorts.forEach[requiredPort |
			if (requiredPort.derivedFrom instanceof AssemblyRequiredInterface) {
				val requiredInterface = requiredPort.derivedFrom as AssemblyRequiredInterface
				val providedPort = providedPortInterfaceMap.get(requiredInterface.requires)
				providedPort.requiringPorts += requiredPort
				requiredPort.providedPort = providedPort
			} else if (requiredPort.derivedFrom instanceof AggregatedInvocation) {
				val invocation = requiredPort.derivedFrom as AggregatedInvocation
				val providedPort = operationProvidedPort.get(invocation.target)
				if (providedPort !== null) {
					providedPort.requiringPorts += requiredPort
					requiredPort.providedPort = providedPort
				} else {
					System.err.println("ERROR at " + requiredPort.label)
				}
			}
		]
		component.children?.forEach[it.linkPort]
	}
}