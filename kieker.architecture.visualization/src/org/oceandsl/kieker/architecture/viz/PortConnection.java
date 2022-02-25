/**
 * 
 */
package org.oceandsl.kieker.architecture.viz;

import org.eclipse.emf.ecore.EObject;

import analysismodel.assembly.AssemblyComponent;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.kgraph.KPort;

/**
 * @author Reiner Jung
 *
 */
public class PortConnection<T extends EObject> {

	private AssemblyComponent originComponent;
	private T originInterface;
	private KNode transitNode;
	private KPort transitPort;

	PortConnection(AssemblyComponent originComponent, T originInterface, KNode transitNode, KPort transitPort) {
		this.originComponent = originComponent;
		this.originInterface = originInterface;
		this.transitNode = transitNode;
		this.transitPort = transitPort;
	}

	public AssemblyComponent getOriginComponent() {
		return originComponent;
	}
	
	public T getOriginInterface() {
		return originInterface;
	}
	
	public KNode getTransitNode() {
		return transitNode;
	}
	
	public KPort getTransitPort() {
		return transitPort;
	}
	
}
