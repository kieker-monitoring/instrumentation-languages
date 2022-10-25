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
import kieker.model.analysismodel.execution.Invocation
import kieker.model.analysismodel.assembly.AssemblyRequiredInterface
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Paths

class DebugUtils {
	
	static PrintStream printStream
	
	static def void print(Set<Component> components, String label) {
		printStream = new PrintStream(Files.newOutputStream(Paths.get(label + ".txt")))
		printStream.printf("-- %s ----------------\n",label)
		components.forEach[it.printComponent("")]
		printStream.printf("-- %s ----------------\n",label)
		printStream.close
	}
		
	static def void printComponent(Component component, String prefix) {
		printStream.printf("%sComponent %s {\n", prefix, component.label)
		component.providedPorts.values.forEach[providedPort |
			printStream.printf("%s  provided %s <-\n", prefix, providedPort.label)
			providedPort.requiringPorts.forEach[
				printStream.printf("%s    required by %s::%s\n", prefix, it.component.fqn, it.label)
			]
		]
		component.requiredPorts.values.forEach[
			if (it.providedPort !== null)
				printStream.printf("%s  required label=%s -> %s::%s\n", prefix, it.label, it.providedPort.component.fqn, it.providedPort.label)
			else
				printStream.printf("%s  required label=%s -> not linked\n", prefix, it.label)				
		]
		component.children.forEach[it.printComponent(prefix + "    ")]
		printStream.printf("%s}\n",prefix)
	}
	
	private static def String fqn(Component component) {
		if (component.parent !== null)
			return String.format("%s.%s", component.parent.fqn, component.label)
		else
			component.label
	}
	
	def static String requiredSourceLabel(RequiredPort port) {
		val componentLabel = port.component.label
		val derivedFrom = port.derivedFrom
		if (port.derivedFromPorts.size() > 0) {
			port.derivedFromPorts.map[derivedFromPort |
				"RQP " + derivedFromPort.component.label + "#" + 
				derivedFromPort.requiredSourceLabel + " ** " +
				if (derivedFrom.size() > 0)
					derivedFrom.createLabels(componentLabel, port.label)
				else
					""
			].join(", ")
		} else
			if (derivedFrom.size() > 0)
				derivedFrom.createLabels(componentLabel, port.label)
			else
				"<nothing>"
	}
	
	def private static String createLabels(Set<Object> derivedFrom, String componentLabel, String label) {
		derivedFrom.map[derived |
			componentLabel + ":" + switch(derived) {
				OperationDataflow: {
					val value = derived.caller.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.callee.assemblyOperation.operationType.signature
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
				Invocation:  {
					val value = derived.caller.assemblyOperation.operationType.signature
					if (value.equals(label))
						derived.callee.assemblyOperation.operationType.signature
					else
						value
				}
				AssemblyRequiredInterface: "requires " + derived.requiredInterfaceType.requires.signature
				case derived === null: "ERROR null element"
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