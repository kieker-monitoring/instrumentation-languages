package kieker.architecture.visualization

import java.util.Set
import kieker.architecture.visualization.display.model.Component
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import kieker.model.analysismodel.execution.AggregatedInvocation
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.model.analysismodel.execution.StorageDataflow
import kieker.architecture.visualization.display.model.RequiredPort

import static extension kieker.architecture.visualization.utils.ModelUtils.*
import static extension kieker.architecture.visualization.utils.DebugUtils.*

class DisplayModelLinker {
	
	val Set<Component> components
	
	val DisplayModelComponentCreator creator
	
	new(DisplayModelComponentCreator creator, Set<Component> components) {
		this.creator = creator
		this.components = components
	}
	
	def link() {
//		System.err.println("linking begin")
		components.forEach[it.linkPort]
//		System.err.println("linking end")
	}
	
		
	private def void linkPort(Component component) {
//		System.err.println("DisplayModelLinker.linkPort component " + component.label)
		component.requiredPorts.values().forEach[requiredPort |
//			System.err.printf("   required port %s used by %s: \n", requiredPort.label, requiredPort.requiredSourceLabel)
			val derivedFrom = requiredPort.getDerivedFrom()
			if (derivedFrom.isEmpty) {
				System.err.println("ERROR: DisplayModelLinker.linkPort, required port is not derived " + requiredPort.label)
			}
			derivedFrom.forEach[derived |
//				System.err.printf("    derived %s\n", derived.class.simpleName)
				switch(derived) {
					AssemblyRequiredInterface: requiredPort.linkAssemblyRequiredInterface(derived)
					AggregatedInvocation: requiredPort.linkAggregatedInvocation(derived)
					OperationDataflow: requiredPort.linkOperationDataflow(derived)
					StorageDataflow: requiredPort.linkStorageDataflow(derived)
				    default: System.err.println("ERROR: DisplayModelLinker.linkPort, class not supported " + derived.class)
				}
			]
		]
		component.children?.forEach[it.linkPort]
	}
		
	private def linkAssemblyRequiredInterface(RequiredPort requiredPort, AssemblyRequiredInterface assemblyRequiredInterface) {
//		System.err.printf("require %s\n", assemblyRequiredInterface.requiredInterfaceType.requires.signature)
		val providedPort = this.creator.interfaceProvidedPortMap.get(assemblyRequiredInterface.requires)
		providedPort.requiringPorts += requiredPort
		requiredPort.providedPort = providedPort
	}
	
	private def linkAggregatedInvocation(RequiredPort requiredPort,  AggregatedInvocation call) {
//		System.err.printf("call from %s -> %s\n", invocation.source.assemblyOperation.operationType.signature, invocation.target.assemblyOperation.operationType.signature)
		val providedPort = this.creator.operationProvidedPort.get(call.target.assemblyOperation)
		if (providedPort !== null) {
			providedPort.requiringPorts += requiredPort
			requiredPort.providedPort = providedPort
		} else {
			System.err.println("ERROR: DisplayModelLinker.linkAggregatedInvocation No provided port for " + call.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)
		}
	}
	
	private def linkOperationDataflow(RequiredPort requiredPort, OperationDataflow operationDataflow) {
		if (operationDataflow.direction.isRead() && // for read direction
			operationDataflow.target.assemblyOperation.component === requiredPort.component.derivedFrom.get(0) // check whether the port component matches the target component (the requirerer)
		) {
//			System.err.printf("DisplayModelLinker.linkOperationDataflow (read) from %s -> %s\n", operationDataflow.target.assemblyOperation.operationType.signature, operationDataflow.source.assemblyOperation.operationType.signature)
			val providedPort = this.creator.operationProvidedPort.get(operationDataflow.source.assemblyOperation)
			if (providedPort !== null) {
				providedPort.requiringPorts += requiredPort
				requiredPort.providedPort = providedPort
			} else {
				this.creator.operationProvidedPort.keySet.forEach[
					System.err.println(">> " + it.fqn)
				]
				System.err.println("ERROR: DisplayModelLinker.linkOperationDataflow (read) no provided port for " + operationDataflow.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)					
			}
		}
		if (operationDataflow.direction.isWrite &&
			operationDataflow.source.assemblyOperation.component === requiredPort.component.derivedFrom.get(0)
		) {
//			System.err.printf("DisplayModelLinker.linkOperationDataflow (write) from %s -> %s\n", operationDataflow.source.assemblyOperation.operationType.signature, operationDataflow.target.assemblyOperation.operationType.signature)
			val providedPort = this.creator.operationProvidedPort.get(operationDataflow.target.assemblyOperation)
			if (providedPort !== null) {
				providedPort.requiringPorts += requiredPort
				requiredPort.providedPort = providedPort
			} else {
				System.err.println("ERROR: DisplayModelLinker.linkOperationDataflow (write) no provided port for " + operationDataflow.target.assemblyOperation.fqn + "  required port: " + requiredPort.label)					
			}
		}
	}
	
	private def linkStorageDataflow(RequiredPort requiredPort, StorageDataflow storageDataflow) {
		if (storageDataflow.direction.isWrite) {
			// this means data flows from the operation to the storage and the required port belongs to the operation.
			// however, we must check whether this requirePort refers to the storage by name or it refers to the operation.
			if (requiredPort.label.equals(storageDataflow.storage.assemblyStorage.storageType.name)) {
				// refers to the storage, i.e., has the same name.
//				System.err.printf("DisplayModelLinker.linkStorageDataflow (write) form %s -> %s\n", storageDataflow.code.assemblyOperation.operationType.signature, storageDataflow.storage.assemblyStorage.storageType.name)
				// write: operation is source, storage is target
				val providedPort = this.creator.storageProvidedPort.get(storageDataflow.storage.assemblyStorage)
				if (providedPort !== null) {
					providedPort.requiringPorts += requiredPort
					requiredPort.providedPort = providedPort
				} else {
					System.err.println("ERROR: DisplayModelLinker.linkStorageDataflow (write) no provided port for " + storageDataflow.storage.assemblyStorage.fqn + "  required port: " + requiredPort.label)								
				}
			}
		}
		if (storageDataflow.direction.isRead) {
			if (requiredPort.label.equals(storageDataflow.code.assemblyOperation.operationType.signature)) {			
//				System.err.printf("DisplayModelLinker.linkStorageDataflow (read) form %s -> %s\n", storageDataflow.storage.assemblyStorage.storageType.name, storageDataflow.code.assemblyOperation.operationType.signature)
				// write: operation is source, storage is target
				val providedPort = this.creator.operationProvidedPort.get(storageDataflow.code.assemblyOperation)
				if (providedPort !== null) {
					providedPort.requiringPorts += requiredPort
					requiredPort.providedPort = providedPort
				} else {
					System.err.println("ERROR: DisplayModelLinker.linkStorageDataflow (read) no provided port for " + storageDataflow.storage.assemblyStorage.fqn + "  required port: " + requiredPort.label)								
				}
			}
		}
		if (requiredPort.providedPort === null)
			System.err.println("ERROR: DisplayModelLinker.linkStorageDataflow requiredPort " + requiredPort.label + " has no providedPort")
	}
	
}