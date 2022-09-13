package kieker.architecture.visualization.utils

import kieker.model.analysismodel.assembly.AssemblyStorage
import kieker.model.analysismodel.assembly.AssemblyOperation
import kieker.model.analysismodel.deployment.DeployedOperation
import kieker.model.analysismodel.deployment.DeployedStorage
import kieker.architecture.visualization.display.model.Component
import java.util.Set
import kieker.architecture.visualization.display.model.RequiredPort
import kieker.model.analysismodel.execution.OperationDataflow
import kieker.model.analysismodel.execution.StorageDataflow
import kieker.model.analysismodel.execution.AggregatedInvocation
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface

class DebugUtils {
	
	static def void print(Set<Component> components, String label) {
		System.err.printf("-- %s ----------------\n",label)
		components.forEach[it.printComponent("")]
		System.err.printf("-- %s ----------------\n",label)
	}
		
	static def void printComponent(Component component, String prefix) {
		System.err.printf("%sComponent %s {\n", prefix, component.label)
		component.providedPorts.values.forEach[providedPort |
			System.err.printf("%s  provided %s <- %s\n", prefix, providedPort.label, 
				providedPort.requiringPorts.map["required by " + it.label + " of " + it.requiredSourceLabel].join(", ")
			)
		]
		component.requiredPorts.values.forEach[
			System.err.printf("%s  required %s -> %s\n", prefix, it.label, it.requiredSourceLabel)
		]
		component.children.forEach[it.printComponent(prefix + "    ")]
		System.err.printf("%s}\n",prefix)
	}
	
		def static String requiredSourceLabel(RequiredPort port) {
		val componentLabel = port.component.label
		val derivedFrom = port.derivedFrom
		derivedFrom.map[derived |
			val label = port.label
			componentLabel + ":" + switch(derived) {
				OperationDataflow: {
					val value = derived.source.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.target.assemblyOperation.operationType.signature
					else
						value
				}
				StorageDataflow:  {
					val value = derived.storage.assemblyStorage.storageType.name
					if (value.equals(label))
						derived.code.assemblyOperation.operationType.signature
					else
						value
				}
				AggregatedInvocation:  {
					val value = derived.source.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.target.assemblyOperation.operationType.signature
					else
						value
				}
				AssemblyRequiredInterface: "requires " + derived.requiredInterfaceType.requires.signature
				RequiredPort: "RQP " + derived.component.label + "#" + derived.requiredSourceLabel
				default: "ERROR type " + derived.class
			}
		].join(", ")
	}
		
	static def fqn(AssemblyStorage storage) {
		storage.component.signature + "::" + storage.storageType.name
	}

	static def fqn(AssemblyOperation op) {
		op.component.signature + "::" + op.operationType.signature
	}
	
	static def fqn(DeployedOperation op) {
		op.assemblyOperation.fqn
	}
	
	static def fqn(DeployedStorage storage) {
		storage.assemblyStorage.component.signature + "::" + storage.assemblyStorage.storageType.name
	}
}