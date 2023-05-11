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
import java.util.HashSet
import java.util.Collection
import kieker.model.analysismodel.execution.Invocation
import kieker.model.analysismodel.execution.StorageDataflow
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.model.analysismodel.assembly.AssemblyComponent
import kieker.model.analysismodel.assembly.AssemblyOperation
import kieker.architecture.visualization.display.model.ProvidedPort
import kieker.architecture.visualization.display.model.EPortType
import kieker.model.analysismodel.assembly.AssemblyStorage
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import java.util.Map
import java.util.HashMap
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.model.analysismodel.type.OperationType
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface

import static extension kieker.architecture.visualization.utils.ModelUtils.*

/**
 * Create operations, storages and components for the display model including ports.
 * 
 * @author Reiner Jung
 * @since 1.3.0
 */
class DisplayModelComponentCreator {
	
	public val Map<AssemblyOperation, ProvidedPort> operationProvidedPort = new HashMap
	public val Map<AssemblyStorage, ProvidedPort> storageProvidedPort = new HashMap
	
	public val Map<AssemblyProvidedInterface, ProvidedPort> interfaceProvidedPortMap = new HashMap
	
	val Collection<AssemblyComponent> assemblyComponents
	
	val Collection<Invocation> operationCalls
	
	val Collection<StorageDataflow> storageDataflows
	
	val Collection<OperationDataflow> operationDataflows

	
	new(Collection<AssemblyComponent> assemblyComponents,
		Collection<Invocation> operationCalls, 
		Collection<StorageDataflow> storageDataflows, Collection<OperationDataflow> operationDataflows) { 
		this.assemblyComponents = assemblyComponents;
		this.operationCalls = operationCalls;
		this.storageDataflows = storageDataflows;
		this.operationDataflows = operationDataflows;
	}
	
	def create() {
		val Set<Component> components = new HashSet()

		val containedComponents = computeContainedComponents(assemblyComponents)
		
		assemblyComponents.filter[!containedComponents.contains(it)].forEach[component |
			components += createComponent(component, null)
		]
		
		return components
	}
		
	private def computeContainedComponents(Collection<AssemblyComponent> components) {
		val containedComponents = new HashSet<AssemblyComponent>()
		components.filter[it.containedComponents.size() > 0].forEach [
			containedComponents.addAll(it.containedComponents)
		]
		return containedComponents
	}
	
	private def Component createComponent(AssemblyComponent assemblyComponent, Component parent) {
		val component = new Component(assemblyComponent.componentType.signature, assemblyComponent, parent)
		
		assemblyComponent.containedComponents.forEach[
			component.children += it.createComponent(component)
		]
		val Set<AssemblyOperation> processedProvidedOperations = component.createProvidedPort4Interface(assemblyComponent)
		val Set<AssemblyOperation> processedRequiredCallers = component.createRequiredPort4Interface(assemblyComponent)
		
		component.createProvidedPorts4OperationCalls(assemblyComponent, operationCalls, processedProvidedOperations)
		component.createProvidedPorts4Operation2OperationDataflows(assemblyComponent, operationDataflows, processedProvidedOperations)
		component.createProvidedPorts4Operation2StorageDataflows(assemblyComponent, storageDataflows, processedProvidedOperations)
		component.createProvidedPorts4Storage2OperationDataflows(assemblyComponent, storageDataflows)
		
		component.createRequiredPorts4OperationCalls(assemblyComponent, operationCalls, processedRequiredCallers)
		component.createRequiredPorts4Operation2OperationDataflows(assemblyComponent, operationDataflows, processedRequiredCallers)
		component.createRequiredPorts4Operation2StorageDataflows(assemblyComponent, storageDataflows, processedRequiredCallers)
		component.createRequiredPorts4Storage2OperationDataflows(assemblyComponent, storageDataflows)
						
		return component
	}
	
			
	/**
	 * Create provided ports for calls.
	 */
	private def void createProvidedPorts4OperationCalls(Component component, AssemblyComponent assemblyComponent, 
		Collection<Invocation> operationCalls, Set<AssemblyOperation> processedProvidedOperations
	) {
		/** Operation Call. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]].
			filter[operation | operationCalls.exists[it.callee.assemblyOperation === operation && 
				it.caller.assemblyOperation.component !== assemblyComponent
			]].
			forEach[
				val port = new ProvidedPort(it.operationType.signature, it, component, EPortType.OPERATION_CALL)
				component.providedPorts.put(it.operationType.signature, port)
				processedProvidedOperations.add(it)
				operationProvidedPort.put(it, port)
		]
	}
	
	/**
	 * Create provided ports based write dataflow.
	 */
	private def void createProvidedPorts4Operation2OperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<OperationDataflow> operationDataflows, Set<AssemblyOperation> processedProvidedOperations
	) {
		/** Operation Dataflow. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]].
			filter[operation | operationDataflows.exists[
				(it.direction.isWrite &&
				it.callee.assemblyOperation === operation && 
				it.caller.assemblyOperation.component !== assemblyComponent) ||
				(it.direction.isRead &&
				it.caller.assemblyOperation === operation && 
				it.callee.assemblyOperation.component !== assemblyComponent)
			]].
			forEach[
				val signature = it.operationType.signature
				val port = component.providedPorts.get(signature)
				if (port !== null) {
					if (port.portType === EPortType.OPERATION_CALL)
						port.portType = EPortType.OPERATION_CALL_DATAFLOW
				} else {
//					System.err.printf("create provided port for %s op<-op dataflow to %s\n", component.label, signature)
					val newPort = new ProvidedPort(signature, it, component, EPortType.OPERATION_DATAFLOW)
					component.providedPorts.put(signature, newPort)
					processedProvidedOperations.add(it)
					operationProvidedPort.put(it, newPort)
				}
		]
	}
	
		/**
	 * Create provided ports based write dataflow.
	 */
	private def void createProvidedPorts4Operation2StorageDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> storageDataflows, Set<AssemblyOperation> processedProvidedOperations
	) {
		/** Storage Dataflow. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]]. // only the operation is not already present.
			filter[operation | storageDataflows.exists[
				it.code.assemblyOperation === operation && // only if there is storage dataflow related to the operation
				it.direction.isRead() && // that has read access
				it.storage.assemblyStorage.component !== assemblyComponent // and is in a different component
			]].
			forEach[
				val signature = it.operationType.signature
				val port = component.providedPorts.get(signature)
				if (port !== null) {
					if (port.portType === EPortType.OPERATION_CALL)
						port.portType = EPortType.OPERATION_CALL_DATAFLOW
				} else {
//					System.err.printf("create provided port for %s storage->op dataflow to %s\n", component.label, signature)		
					val newPort = new ProvidedPort(signature, it, component, EPortType.OPERATION_DATAFLOW)
					component.providedPorts.put(it.operationType.signature, newPort)
					processedProvidedOperations.add(it)
					operationProvidedPort.put(it, newPort)
				}
		]
	}

	/**
	 * Create provided ports based on write access to storage.
	 */
	private def void createProvidedPorts4Storage2OperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> dataflows
	) {
		assemblyComponent.storages.values.filter[
			storage | dataflows.exists[
				it.direction.isWrite() && // only add provided port for write direction
				it.storage.assemblyStorage === storage && // check if this is the right storage
				it.code.assemblyOperation.component !== assemblyComponent // check is the access is outside of the component
			]
		].
		forEach[
			val newPort = new ProvidedPort(it.storageType.name, it, component, EPortType.OPERATION_DATAFLOW)
			component.providedPorts.put(it.storageType.name, newPort)
			storageProvidedPort.put(it, newPort)
		]
	}
		
	/**
	 * Create provided ports based on provided interfaces present in a assembly component.
	 */
	// TODO this might be broken
	private def createProvidedPort4Interface(Component component, AssemblyComponent assemblyComponent) {
		val Set<AssemblyOperation> processedProvidedOperations = new HashSet
		assemblyComponent.providedInterfaces.values.forEach[
			val port = it.createProvidedPort4Interface(component)
			interfaceProvidedPortMap.put(it, port)
			component.providedPorts.put(port.label, port)
			it.providedInterfaceType.providedOperationTypes.values.forEach[
				val operation = assemblyComponent.findAssemblyOperation(it)
				processedProvidedOperations.add(operation)
				if (operation !== null) {
					operationProvidedPort.put(operation, port)
				} else {
					System.err.println("ERROR: create provided port 4 interface: " + it.signature + " not found")
				}
			]
		]
		return processedProvidedOperations
	}
	
	/** ------------------------------------- 
	 * Required ports
	 * -------------------------------------- */
	
	/**
	 * Create required operation interfaces based on remaining external calls.
	 */	
	private def createRequiredPorts4OperationCalls(Component component, AssemblyComponent assemblyComponent, 
		Collection<Invocation> operationCalls, Set<AssemblyOperation> processedRequiredCallers
	) {
		operationCalls.filter[
			it.caller.assemblyOperation.component === assemblyComponent && // only check calls originating from this component
			it.callee.assemblyOperation.component !== assemblyComponent && // only check calls that end in another component
			!processedRequiredCallers.contains(it.caller.assemblyOperation)
		].forEach[call |
			component.createOrModifyRequiredPort4Operations(call, call.caller.assemblyOperation.operationType.signature, EPortType.OPERATION_CALL)
		]
	}

	
	/**
	 * Create required ports for operation to operation dataflow.
	 * 
	 * @param component the visualization component that will have the new required ports
	 * @param assemblyComponent the assembly component
	 * @param operationDataflows all dataflows between operations from the execution model
	 */
	private def createRequiredPorts4Operation2OperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<OperationDataflow> operationDataflows, Set<AssemblyOperation> processedRequiredCallers
	) {	
		/** normalize dataflow write: caller -> callee, read: callee -> caller */
		
		/** Operation to operation dataflow (write). */
		operationDataflows.filter[
			it.direction.isWrite &&
			it.caller.assemblyOperation.component === assemblyComponent && // check only dataflows originating in this component
			it.callee.assemblyOperation.component !== assemblyComponent // check only dataflows that end in another component
		].forEach[dataflow |
//			System.err.printf("create required port for %s op->op dataflow from %s to %s\n", component.label, 
//				dataflow.caller.assemblyOperation.operationType.signature, dataflow.callee.assemblyOperation.operationType.signature
//			)
			component.createOrModifyRequiredPort4Operations(dataflow, dataflow.callee.assemblyOperation.operationType.signature, EPortType.OPERATION_DATAFLOW)
		]
		
		/** Operation to operation dataflow (read). */
		operationDataflows.filter[
			it.direction.isRead &&
			it.callee.assemblyOperation.component === assemblyComponent && // check only dataflows originating in this component
			it.caller.assemblyOperation.component !== assemblyComponent // check only dataflows originating in this component
		].forEach[dataflow |
//			System.err.printf("create required port for %s op->op dataflow from %s to %s\n", component.label, 
//				dataflow.callee.assemblyOperation.operationType.signature, dataflow.caller.assemblyOperation.operationType.signature
//			)
			component.createOrModifyRequiredPort4Operations(dataflow, dataflow.caller.assemblyOperation.operationType.signature, EPortType.OPERATION_DATAFLOW)
		]
	}
		
	/**
	 * Create required ports for dataflow from operation to storage (write direction).
	 * 
	 * @param component the visualization component of the required port
	 * @param assemblyComponent the assembly component of operation writing to the storage
	 * @param storageDataflows a collection of all storage dataflows
	 */
	private def createRequiredPorts4Operation2StorageDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> storageDataflows, Set<AssemblyOperation> processedRequiredCallers
	) {	
		/** Operation to Storage dataflow. */
		storageDataflows.filter[
			it.direction.isWrite && // storage write direction
			it.code.assemblyOperation.component === assemblyComponent &&
			it.storage.assemblyStorage.component !== assemblyComponent
		].
		forEach[
//			System.err.printf("create required port for %s op->storage dataflow from %s to %s\n", component.label, it.code.assemblyOperation.operationType.signature, label)
			createOrModifyRequiredPort4Operations(component, it, it.storage.assemblyStorage.storageType.name, EPortType.OPERATION_DATAFLOW)
		]
	}
		
	/**
	 * Create required port for a component that contains a storage from which data is being read.
	 * 
	 * @param component the visualization component owning the storage
	 * @param assemblyComponent the assembly component owning the storage
	 * @param dataflows collection of all dataflows in the execution model
	 */
	private def createRequiredPorts4Storage2OperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> dataflows
	) {
		dataflows.filter[
			it.direction.isRead() && // storage read direction
			it.storage.assemblyStorage.component === assemblyComponent && // check if this storage read originates from this component
			it.code.assemblyOperation.component !== assemblyComponent // check if the operation is in another component
			]. // storage read direction (from storage to operation)
		forEach[
//			System.err.printf("create required port for %s storage->op dataflow from %s to %s\n", component.label, it.storage.assemblyStorage.storageType.name, label)
			createOrModifyRequiredPort4Operations(component, it, it.code.assemblyOperation.operationType.signature, EPortType.OPERATION_DATAFLOW)
		]
	}
	
	/**
	 * Create required interface based on existing required interfaces in the model.
	 * Collect all operations already covered by the required interface
	 */
	private def createRequiredPort4Interface(Component component, AssemblyComponent assemblyComponent) {
		val relevantCalls = operationCalls.filter[
			it.caller.component.assemblyComponent === assemblyComponent &&
			it.callee.component.assemblyComponent !== assemblyComponent
		]
		val Set<AssemblyOperation> processedRequiredCallers = new HashSet
		assemblyComponent.requiredInterfaces.forEach[
			val port = it.createRequiredPort4Interface(component)
			component.requiredPorts.put(port.label, port)
			val providedAssemblyComponent = it.requires.eContainer.eContainer as AssemblyComponent
			it.requires.providedInterfaceType.providedOperationTypes.values.forEach[operationType |
				val providedOperation = providedAssemblyComponent.findAssemblyOperation(operationType)
				val matchingCalls = relevantCalls.filter[call | call.callee.assemblyOperation === providedOperation]
				matchingCalls.forEach[
					processedRequiredCallers.add(it.caller.assemblyOperation)
				]	
			]
		]
		return processedRequiredCallers
	}
	
	/**
	 * Create or modify a required port for dataflow between operations or calls. It modifies the connection in case a call trace also exists.
	 * 
	 * @param component the component the required port belongs to
	 * @param derivedFrom the dataflow or call associated with this required port
	 * @param label the providing operation
	 * @param portType set port type
	 */
	private def createOrModifyRequiredPort4Operations(Component component, Object derivedFrom, String label, EPortType portType) {
		val port = component.requiredPorts.get(label)
		if (port !== null) {
			port.addPortType(portType)
			port.derivedFrom.add(derivedFrom)
		} else {		
			component.requiredPorts.put(label, new RequiredPort(label, derivedFrom, component, portType))
		}
	}
	
	private def AssemblyOperation findAssemblyOperation(AssemblyComponent component, OperationType type) {
		component.operations.get(type.signature)
	}

	
	private def ProvidedPort createProvidedPort4Interface(AssemblyProvidedInterface providedInterface, Component component) {
		val providedPort = new ProvidedPort(providedInterface.providedInterfaceType.signature, providedInterface, component, EPortType.INTERFACE_CALL)
		
		return providedPort
	}
	
	private def RequiredPort createRequiredPort4Interface(AssemblyRequiredInterface requiredInterface, Component component) {
		val requiredPort = new RequiredPort(requiredInterface.requiredInterfaceType.requires.signature, requiredInterface, component, EPortType.INTERFACE_CALL)
		return requiredPort
	}
	
}