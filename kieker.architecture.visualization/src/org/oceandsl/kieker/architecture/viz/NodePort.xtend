
package org.oceandsl.kieker.architecture.viz

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort

class NodePort {

	val KNode node
	
	val KPort port
	
	new(KNode node, KPort port) {
		this.node = node
		this.port = port
	}
	
	def getNode() {
		return node
	}
	
	def getPort() {
		return port
	}
}