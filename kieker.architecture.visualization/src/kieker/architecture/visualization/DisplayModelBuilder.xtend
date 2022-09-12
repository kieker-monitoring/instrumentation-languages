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
package kieker.architecture.visualization

import java.util.Collection
import kieker.model.analysismodel.assembly.AssemblyComponent
import kieker.model.analysismodel.execution.AggregatedInvocation
import java.util.HashSet
import java.util.Set
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import kieker.model.analysismodel.assembly.AssemblyOperation
import kieker.model.analysismodel.type.OperationType
import java.util.HashMap
import java.util.Map
import kieker.architecture.visualization.display.model.ProvidedPort
import kieker.architecture.visualization.display.model.Component
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.model.analysismodel.execution.StorageDataflow
import kieker.model.analysismodel.execution.ExecutionModel
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.architecture.visualization.display.model.EPortType
import kieker.model.analysismodel.execution.EDirection
import kieker.model.analysismodel.assembly.AssemblyStorage
import kieker.model.analysismodel.deployment.DeployedOperation
import kieker.model.analysismodel.deployment.DeployedStorage

/**
 * Generating a display model from the architecture model.
 * 
 * @author Reiner Jung
 * @since 1.3.0
 */
class DisplayModelBuilder {
	
	val Map<AssemblyOperation, ProvidedPort> operationProvidedPort = new HashMap
	val Map<AssemblyStorage, ProvidedPort> storageProvidedPort = new HashMap
	
	val Map<AssemblyProvidedInterface, ProvidedPort> providedPortInterfaceMap = new HashMap
	
	new() {
		
	}
		
	def create(Collection<AssemblyComponent> assemblyComponents, ExecutionModel executionModel) {
		val invocations = executionModel.aggregatedInvocations.values
		val storages = executionModel.storageDataflow.values
		val dataflows = executionModel.operationDataflow.values
		
		val Set<Component> components = new HashSet

		val containedComponents = computeContainedComponents(assemblyComponents)
		
		assemblyComponents.filter[!containedComponents.contains(it)].forEach[component |
			components += createComponent(component, invocations, storages, dataflows, null)
		]
				
		components.forEach[it.linkPort]
				
		components.forEach[it.moveLinksUp]
		
		return components
	}
	
	private def void moveLinksUp(Component parent) {
		parent.children.forEach[child |
			child.children?.forEach[it.moveLinksUp]			
			child.providedPorts.values().filter[it.requiringPorts.exists[it.component.parent !== parent]].
				forEach[providedPort |
					// move level up
					val derivedProvidedPort = new ProvidedPort(providedPort.label, providedPort, parent, providedPort.portType)
					parent.providedPorts.put(derivedProvidedPort.label, derivedProvidedPort)
										
					val removingRequiredPorts = new HashSet<RequiredPort>
					providedPort.requiringPorts.filter[it.component.parent !== parent].forEach[
						it.providedPort = derivedProvidedPort
						removingRequiredPorts +=  it
					]
					removingRequiredPorts.forEach[providedPort.requiringPorts.remove(it)]
			]
			
			child.requiredPorts.values().filter[it.providedPort instanceof ProvidedPort && it.providedPort.component.parent !== parent].
			forEach[requiredPort |
				// move level up
				val existingParentRequiredPort = parent.requiredPorts.get(requiredPort.label)
				val providedPort = requiredPort.providedPort
				if (existingParentRequiredPort === null) {
					val derivedRequiredPort = new RequiredPort(requiredPort.label, requiredPort, parent, requiredPort.portType)
					parent.requiredPorts.put(derivedRequiredPort.label, derivedRequiredPort)
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
	
	private def Component createComponent(AssemblyComponent assemblyComponent, Collection<AggregatedInvocation> invocations, Collection<StorageDataflow> storageDataflows, Collection<OperationDataflow> operationDataflows, Component parent) {
		val component = new Component(assemblyComponent.componentType.signature, assemblyComponent, parent)
		
		assemblyComponent.containedComponents.forEach[component.children += it.createComponent(invocations, storageDataflows, operationDataflows, component)]
		val Set<AssemblyOperation> processedProvidedOperations = component.createProvidedPort4Interface(assemblyComponent)
		val Set<AssemblyOperation> processedRequiredCallees = component.createRequiredPort4Interface(assemblyComponent)
		val Set<AssemblyStorage> processedProvidedStorages = new HashSet()
		
		component.createProvidedPorts4OperationCalls(assemblyComponent, invocations, processedProvidedOperations)
		component.createProvidedPorts4OperationDataflows(assemblyComponent, operationDataflows, storageDataflows, processedProvidedOperations)
		component.createProvidedPorts4StorageDataflows(assemblyComponent, storageDataflows, processedProvidedStorages)
		
		component.createRequiredPorts4OperationCalls(assemblyComponent, invocations, processedRequiredCallees)
		
		component.createRequiredPorts4OperationOperationDataflows(assemblyComponent, operationDataflows)
		component.createRequiredPorts4OperationStorageDataflows(assemblyComponent, storageDataflows)
		component.createRequiredPorts4StorageOperationDataflows(assemblyComponent, storageDataflows)
						
		return component
	}
	
	/**
	 * Create provided ports for calls.
	 */
	private def void createProvidedPorts4OperationCalls(Component component, AssemblyComponent assemblyComponent, 
		Collection<AggregatedInvocation> invocations, Set<AssemblyOperation> processedProvidedOperations
	) {
		/** Operation Call. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]].
			filter[operation | invocations.exists[it.target.assemblyOperation === operation && 
				it.source.assemblyOperation.component !== assemblyComponent
			]].
			forEach[
				val port = new ProvidedPort(it.operationType.signature, it, component, EPortType.OPERATION_CALL)
				component.providedPorts.put(it.operationType.signature, port)
				operationProvidedPort.put(it, port)
		]
	}
	
	/**
	 * Create provided ports based write dataflow.
	 */
	private def void createProvidedPorts4OperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<OperationDataflow> dataflows, Collection<StorageDataflow> storageAccesses, Set<AssemblyOperation> processedProvidedOperations
	) {
		/** Operation Dataflow. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]].
			filter[operation | dataflows.exists[it.target.assemblyOperation === operation && 
				it.source.assemblyOperation.component !== assemblyComponent
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
					component.providedPorts.put(it.operationType.signature, newPort)
					operationProvidedPort.put(it, newPort)
				}
		]

		/** Storage Dataflow. */
		assemblyComponent.operations.values.
			filter[operation | !processedProvidedOperations.exists[it === operation]]. // only the operation is not already present.
			filter[operation | storageAccesses.exists[
				it.code.assemblyOperation === operation && // only if there is storage dataflow related to the operation
				it.direction.isRead() && // that has read access
				it.code.assemblyOperation.component !== it.storage.assemblyStorage.component // and is in a different component
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
					operationProvidedPort.put(it, newPort)
				}
		]
	}

	/**
	 * Create provided ports based on write access to storage.
	 */
	private def void createProvidedPorts4StorageDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> dataflows, Set<AssemblyStorage> processedProvidedStorages
	) {
		assemblyComponent.storages.values.filter[ storage | !processedProvidedStorages.exists[it === storage]]. // ensure is has not already been added
		filter[storage | dataflows.exists[
			it.direction.isWrite() && // only add provided port for write direction
			it.storage.assemblyStorage === storage && it.code.assemblyOperation.component !== assemblyComponent // check if this is the right storage
		]].
		forEach[
//			System.err.printf("create provided port for %s op->storage dataflow to %s\n", component.label, it.storageType.name)
			val newPort = new ProvidedPort(it.storageType.name, it, component, EPortType.STORAGE_DATAFLOW)
			component.providedPorts.put(it.storageType.name, newPort)
			storageProvidedPort.put(it, newPort)
			processedProvidedStorages.add(it)
		]
	}
		
	/**
	 * Create provided ports based on provided interfaces present in a assembly component.
	 */
	private def createProvidedPort4Interface(Component component, AssemblyComponent assemblyComponent) {
		val Set<AssemblyOperation> processedProvidedOperations = new HashSet
		assemblyComponent.providedInterfaces.values.forEach[
			val port = it.createProvidedPort4Interface(component)
			providedPortInterfaceMap.put(it, port)
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
		Collection<AggregatedInvocation> invocations, Set<AssemblyOperation> processedRequiredCallees
	) {
		/** Operation Call. */
		invocations.filter[it.source.assemblyOperation.component === assemblyComponent &&
			assemblyComponent !== it.target.assemblyOperation.component &&
			!processedRequiredCallees.exists[callee | callee === it.target.assemblyOperation]
		].forEach[invocation |
			val signature = invocation.target.assemblyOperation.operationType.signature
			component.requiredPorts.put(signature, new RequiredPort(signature, invocation, component, EPortType.OPERATION_CALL))
		]
	}
	
	private def isWrite(EDirection direction) {
		#[EDirection.WRITE, EDirection.BOTH].contains(direction)
	}

	private def isRead(EDirection direction) {
		#[EDirection.READ, EDirection.BOTH].contains(direction)
	}
	
	/**
	 * Create required ports for operation to operation dataflow.
	 * 
	 * @param component the visualization component that will have the new required ports
	 * @param assemblyComponent the assembly component
	 * @param operationDataflows all dataflows between operations from the execution model
	 */
	private def createRequiredPorts4OperationOperationDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<OperationDataflow> operationDataflows
	) {	
		/** normalize dataflow write: source -> target, read: target -> source */
		
		/** Operation to operation dataflow (write). */
		operationDataflows.filter[
			it.direction.isWrite &&
			it.source.assemblyOperation.component === assemblyComponent &&
			assemblyComponent !== it.target.assemblyOperation.component
		].forEach[dataflow |
//			System.err.printf("create required port for %s op->op dataflow from %s to %s\n", component.label, 
//				dataflow.source.assemblyOperation.operationType.signature, dataflow.target.assemblyOperation.operationType.signature
//			)
			component.createOrModifyRequiredPort4OperationToOperationDataflow(dataflow, dataflow.target.assemblyOperation.operationType.signature)
		]
		
		/** Operation to operation dataflow (read). */
		operationDataflows.filter[
			it.direction.isRead &&
			it.target.assemblyOperation.component === assemblyComponent &&
			assemblyComponent !== it.source.assemblyOperation.component
		].forEach[dataflow |
//			System.err.printf("create required port for %s op->op dataflow from %s to %s\n", component.label, 
//				dataflow.target.assemblyOperation.operationType.signature, dataflow.source.assemblyOperation.operationType.signature
//			)
			component.createOrModifyRequiredPort4OperationToOperationDataflow(dataflow, dataflow.source.assemblyOperation.operationType.signature)
		]
	}
	
		/**
	 * Create or modify a required port for dataflow between operations. It modifies the connection in case a call trace also exists.
	 * 
	 * @param component the component the required port belongs to
	 * @param dataflow the dataflow associated with this required port
	 * @param label the providing operation
	 */
	private def createOrModifyRequiredPort4OperationToOperationDataflow(Component component, OperationDataflow dataflow, String label) {
		val port = component.requiredPorts.get(label)
		if (port !== null) {
			if (port.portType === EPortType.OPERATION_CALL)
				port.portType = EPortType.OPERATION_CALL_DATAFLOW
		} else {		
			component.requiredPorts.put(label, new RequiredPort(label, dataflow, component, EPortType.OPERATION_DATAFLOW))
		}
	}
	
	/**
	 * Create required ports for dataflow from operation to storage (write direction).
	 * 
	 * @param component the visualization component of the required port
	 * @param assemblyComponent the assembly component of operation writing to the storage
	 * @param storageDataflows a collection of all storage dataflows
	 */
	private def createRequiredPorts4OperationStorageDataflows(Component component, AssemblyComponent assemblyComponent, 
		Collection<StorageDataflow> storageDataflows
	) {	
		/** Operation to Storage dataflow. */
		storageDataflows.filter[it.direction.isWrite && // storage write direction
			it.code.assemblyOperation.component === assemblyComponent &&
			it.storage.assemblyStorage.component !== assemblyComponent
		].
		forEach[
			val label = it.storage.assemblyStorage.storageType.name
//			System.err.printf("create required port for %s op->storage dataflow from %s to %s\n", component.label, it.code.assemblyOperation.operationType.signature, label)
			val newPort = new RequiredPort(label, it, component, EPortType.STORAGE_DATAFLOW)
			component.requiredPorts.put(label, newPort)
		]
	}
		
	/**
	 * Create required port for a component that contains a storage from which data is being read.
	 * 
	 * @param component the visualization component owning the storage
	 * @param assemblyComponent the assembly component owning the storage
	 * @param dataflows collection of all dataflows in the execution model
	 */
	private def createRequiredPorts4StorageOperationDataflows(Component component, AssemblyComponent assemblyComponent, Collection<StorageDataflow> dataflows) {
		dataflows.filter[
			assemblyComponent.storages.values.exists[storage | storage === it.storage.assemblyStorage] && // check if this is storage is in the given component
			it.code.assemblyOperation.component !== assemblyComponent && 		// check if the operation is in another component
			it.direction.isRead()]. // storage read direction (from storage to operation)
		forEach[
			val label = it.code.assemblyOperation.operationType.signature
//			System.err.printf("create required port for %s storage->op dataflow from %s to %s\n", component.label, it.storage.assemblyStorage.storageType.name, label)
			val existingPort = component.requiredPorts.get(label)
			if (existingPort !== null)
				existingPort.derivedFrom.add(it)
			else {
				val newPort = new RequiredPort(label, it, component, EPortType.STORAGE_DATAFLOW)
				component.requiredPorts.put(label, newPort)
			}
		]
	}
	
	/**
	 * Create required interface based on existing required interfaces in the model.
	 * Collect all operations already covered by the required interface
	 */
	private def createRequiredPort4Interface(Component component, AssemblyComponent assemblyComponent) {
		val Set<AssemblyOperation> processedRequiredCallees = new HashSet
		assemblyComponent.requiredInterfaces.forEach[
			val port = it.createRequiredPort4Interface(component)
			val calleeComponent = it.requires.eContainer.eContainer as AssemblyComponent
			component.requiredPorts.put(port.label, port)
			it.requiredInterfaceType.requires.providedOperationTypes.values.forEach[
				processedRequiredCallees.add(calleeComponent.findAssemblyOperation(it))
			]
		]
		return processedRequiredCallees
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
	
	private def void linkPort(Component component) {
//		System.err.println("linkPort component " + component.label)
		component.requiredPorts.values().forEach[requiredPort |
//			System.err.printf("   required port %s used by %s: ", requiredPort.label, requiredPort.requiredSourceLabel)
			val derivedFrom = requiredPort.derivedFrom
			if (derivedFrom.isEmpty) {
				System.err.println("ERROR: DisplayModelBuilder link port, required port is not derived " + requiredPort.label)
			}
			derivedFrom.forEach[derived |
				switch(derived) {
					AssemblyRequiredInterface: requiredPort.linkAssemblyRequiredInterface(derived)
					AggregatedInvocation: requiredPort.linkAggregatedInvocation(derived)
					OperationDataflow: requiredPort.linkOperationDataflow(derived)
					StorageDataflow: requiredPort.linkStorageDataflow(derived)
				    default: System.err.println("ERROR: DisplayModelBuilder link port, class not supported " + derived.class)
				}
			]
		]
		component.children?.forEach[it.linkPort]
	}
	
	private def String requiredSourceLabel(RequiredPort port) {
		val derivedFrom = port.derivedFrom
		derivedFrom.map[derived |
		val label = port.label
		switch(derived) {
			OperationDataflow: {
				val value = derived.source.assemblyOperation.operationType.signature
				if (value.equals(label))
					return derived.target.assemblyOperation.operationType.signature
				else
					return value
			}
			StorageDataflow:  {
				val value = derived.storage.assemblyStorage.storageType.name
				if (value.equals(label))
					return derived.code.assemblyOperation.operationType.signature
				else
					return value
			}
			AggregatedInvocation:  {
				val value = derived.source.assemblyOperation.operationType.signature
				if (value.equals(label))
					return derived.target.assemblyOperation.operationType.signature
				else
					return value
			}
			AssemblyRequiredInterface: "requires " + derived.requiredInterfaceType.requires.signature
		}
		].join(", ")
	}
	
	private def linkAssemblyRequiredInterface(RequiredPort requiredPort, AssemblyRequiredInterface assemblyRequiredInterface) {
//		System.err.printf("require %s\n", assemblyRequiredInterface.requiredInterfaceType.requires.signature)
		val providedPort = providedPortInterfaceMap.get(assemblyRequiredInterface.requires)
		providedPort.requiringPorts += requiredPort
		requiredPort.providedPort = providedPort
	}
	
	private def linkAggregatedInvocation(RequiredPort requiredPort,  AggregatedInvocation invocation) {
//		System.err.printf("call from %s -> %s\n", invocation.source.assemblyOperation.operationType.signature, invocation.target.assemblyOperation.operationType.signature)
		val providedPort = operationProvidedPort.get(invocation.target.assemblyOperation)
		if (providedPort !== null) {
			providedPort.requiringPorts += requiredPort
			requiredPort.providedPort = providedPort
		} else {
			System.err.println("ERROR: DisplayModelBuilder link port (AggregatedInvocation) no provided port for " + invocation.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)
		}
	}
	
	private def linkOperationDataflow(RequiredPort requiredPort, OperationDataflow operationDataflow) {
		if (operationDataflow.direction.isRead()) {
//			System.err.printf("dataflow (read) from %s -> %s\n", operationDataflow.target.assemblyOperation.operationType.signature, operationDataflow.source.assemblyOperation.operationType.signature)
			val providedPort = operationProvidedPort.get(operationDataflow.source.assemblyOperation)
			if (providedPort !== null) {
				providedPort.requiringPorts += requiredPort
				requiredPort.providedPort = providedPort
			} else {
				System.err.println("ERROR: DisplayModelBuilder link port (OperationDataflow) no provided port for " + operationDataflow.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)					
			}
		}
		if (operationDataflow.direction.isWrite) {
//			System.err.printf("dataflow (write) from %s -> %s\n", operationDataflow.source.assemblyOperation.operationType.signature, operationDataflow.target.assemblyOperation.operationType.signature)
			val providedPort = operationProvidedPort.get(operationDataflow.target.assemblyOperation)
			if (providedPort !== null) {
				providedPort.requiringPorts += requiredPort
				requiredPort.providedPort = providedPort
			} else {
				System.err.println("ERROR: DisplayModelBuilder link port (OperationDataflow) no provided port for " + operationDataflow.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)					
			}
		}
	}
	
	private def linkStorageDataflow(RequiredPort requiredPort, StorageDataflow storageDataflow) {
		if (storageDataflow.direction.isWrite) {
			// this means data flows from the operation to the storage and the required port belongs to the operation.
			// however, we must check whether this requirePort refers to the storage by name or it refers to the operation.
			if (requiredPort.label.equals(storageDataflow.storage.assemblyStorage.storageType.name)) {
				// refers to the storage, i.e., has the same name.
//				System.err.printf("dataflow (write) form %s -> %s\n", storageDataflow.code.assemblyOperation.operationType.signature, storageDataflow.storage.assemblyStorage.storageType.name)
				// write: operation is source, storage is target
				val providedPort = storageProvidedPort.get(storageDataflow.storage.assemblyStorage)
				if (providedPort !== null) {
					providedPort.requiringPorts += requiredPort
					requiredPort.providedPort = providedPort
				} else {
					System.err.println("ERROR: DisplayModelBuilder link port (StorageDataflow, write) no provided port for " + storageDataflow.storage.assemblyStorage.fqn + "  required port: " + requiredPort.label)								
				}
			}
		}
		if (storageDataflow.direction.isRead) {
			if (requiredPort.label.equals(storageDataflow.code.assemblyOperation.operationType.signature)) {			
//				System.err.printf("dataflow (read) form %s -> %s\n", storageDataflow.storage.assemblyStorage.storageType.name, storageDataflow.code.assemblyOperation.operationType.signature)
				// write: operation is source, storage is target
				val providedPort = operationProvidedPort.get(storageDataflow.code.assemblyOperation)
				if (providedPort !== null) {
					providedPort.requiringPorts += requiredPort
					requiredPort.providedPort = providedPort
				} else {
					System.err.println("ERROR: DisplayModelBuilder link port (StorageDataflow, write) no provided port for " + storageDataflow.storage.assemblyStorage.fqn + "  required port: " + requiredPort.label)								
				}
			}
		}
		if (requiredPort.providedPort === null)
			System.err.println("ERROR: DisplayModelBuilder requiredPort " + requiredPort.label + " has no providedPort")
	}

	private def fqn(AssemblyStorage storage) {
		storage.component.signature + "::" + storage.storageType.name
	}

	private def fqn(AssemblyOperation op) {
		op.component.signature + "::" + op.operationType.signature
	}
	
	private def fqn(DeployedOperation op) {
		op.assemblyOperation.fqn
	}
	
	private def fqn(DeployedStorage storage) {
		storage.assemblyStorage.component.signature + "::" + storage.assemblyStorage.storageType.name
	}
}
