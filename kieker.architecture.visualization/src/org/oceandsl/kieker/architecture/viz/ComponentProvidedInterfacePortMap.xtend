package org.oceandsl.kieker.architecture.viz

import de.cau.cs.kieler.klighd.kgraph.KPort
import analysismodel.assembly.AssemblyProvidedInterface
import analysismodel.assembly.AssemblyComponent
import java.util.Map
import java.util.HashMap

class ComponentProvidedInterfacePortMap {
	
	val Map<AssemblyComponent, Map<AssemblyProvidedInterface, KPort>> map
	
	new() {
		map = new HashMap
	}
	
	def void put(AssemblyComponent component, AssemblyProvidedInterface providedInterface, KPort port) {
		var componentMap = map.get(component)
		if (componentMap === null) {
			componentMap = new HashMap
			map.put(component, componentMap)
		}
		componentMap.put(providedInterface, port)
	}
	
	def KPort getPort(AssemblyComponent component, AssemblyProvidedInterface providedInterface) {
		map.get(component).get(providedInterface)
	}
	
	def Map<AssemblyProvidedInterface, KPort> getPortMap(AssemblyComponent component) {
		map.get(component)
	}
}