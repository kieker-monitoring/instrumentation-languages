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

import de.cau.cs.kieler.klighd.kgraph.KPort
import kieker.model.analysismodel.assembly.AssemblyProvidedInterface
import kieker.model.analysismodel.assembly.AssemblyComponent
import java.util.Map
import java.util.HashMap

/**
 * @author Reiner Jung
 * @since 1.3.0
 */
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
